package in.thekalinga.snippet.util.intellij

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.xml.XmlMapper
import in.thekalinga.snippet.util.Icons

import static com.fasterxml.jackson.databind.SerializationFeature.INDENT_OUTPUT

class FontAwesomeGenerator {

    static void main(String[] args) {

        List<Template> templates = new ArrayList<>()

        def variables = Arrays.asList(
            TemplateVariable.builder()
                .name('1')
                .alwaysStopAt(true)
                .expression('\"https://use.fontawesome.com/releases/v5.5.0/css/all.css\"')
                .build()
        )

        def template = Template.builder()
                .name('fa-\$')
                .value('<link rel=\"stylesheet\" href=\"$1$\">\$END\$')
                .description("Font Awesome css link")
                .toReformat(true)
                .variables(variables)
                .options(ContextOption.ALL)
                .build()

        templates.add(template)

        ObjectMapper mapper = new ObjectMapper()
        def iconsContainer = mapper.readValue(getClass().getResourceAsStream('/font-awesome.json'), Icons.class)
        iconsContainer.solid.forEach({ iconStr ->

            variables = Arrays.asList(
                TemplateVariable.builder()
                    .name('1')
                    .alwaysStopAt(true)
                    .build()
            )

            template = Template.builder()
                    .name("fas-${iconStr}")
                    .value("<i class=\"fas fa-${iconStr}" + '$1$' +"\"></i>\$END\$")
                    .toReformat(false)
                    .variables(variables)
                    .options(ContextOption.ALL)
                    .build()

            templates.add(template)
        })
        iconsContainer.regular.forEach({ iconStr ->

            variables = Arrays.asList(
                    TemplateVariable.builder()
                            .name('1')
                            .alwaysStopAt(true)
                            .build()
            )

            template = Template.builder()
                    .name("far-${iconStr}")
                    .value("<i class=\"far fa-${iconStr}" + '$1$' +"\"></i>\$END\$")
                    .toReformat(false)
                    .variables(variables)
                    .options(ContextOption.ALL)
                    .build()

            templates.add(template)
        })
        iconsContainer.brands.forEach({ iconStr ->

            variables = Arrays.asList(
                    TemplateVariable.builder()
                            .name('1')
                            .alwaysStopAt(true)
                            .build()
            )

            template = Template.builder()
                    .name("fab-${iconStr}")
                    .value("<i class=\"fab fa-${iconStr}" + '$1$' +"\"></i>\$END\$")
                    .toReformat(false)
                    .variables(variables)
                    .options(ContextOption.ALL)
                    .build()

            templates.add(template)
        })
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.enable(INDENT_OUTPUT);
        File file = new File("src/main/resources/font-awesome.xml");

        TemplateSet templateSet = TemplateSet.builder().group("Font Awesome 5")
                .templates(templates).build()

        xmlMapper.writeValue(file, templateSet)
        println "Regenerated fontawesome template file. Saved to ${file.absolutePath}"
    }

}
