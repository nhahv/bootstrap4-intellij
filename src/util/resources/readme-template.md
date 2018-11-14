Bootstrap 4 & Font Awesome 5 snippets for IntelliJ
===========================

A set of Bootstrap 4 & Font Awesome 5 snippets for the following JetBrains products:

- IntelliJ IDEA
- WebStorm and PhpStorm
- PyCharm
- RubyMine

## Usage

Create a new HTML document and

1. Type `b4-` followed by pressing `Ctrl+Space` to see all available bootstrap 4 snippets.
2. Type `fas-` or `far-` or `fab-` followed by pressing `Ctrl+Space` to see all available font awesome snippets.

Alternatively you can type `jumbotron` followed by `Ctrl+J` to see the snippet matches

The detailed list of supported actions are listed [below](#documentation)

![Plugin in action](help.gif)

Feel free to let me know what else you want added via the [issues](https://github.com/nhahv/bootstrap4-intellij/issues)

Suggestions, feedback and other comments welcome via [@nhahv](https://twitter.com/nhahv) on Twitter.

## Installation (in 3 easy steps)

To install the plugin open your editor (IntelliJ) and hit:

1. `File > Settings > Plugins` and click on the `Browse repositories` button.
2. Look for `Bootstrap 4` the right click and select `Download plugin`.
3. Finally hit the `Apply` button, agree to restart your IDE and you're all done!

## Contribution guidelines

1. Clone this repo
2. Modify the html snippet resources under `src/util/resources/bootstrap`. These Html snippets must follow Sublime text snippet format
3. Send me a pull request

> You just need to create the template htmls in sublime snippet format. There is no need to update `README.md`/`snippets.json` manually. The build will take care of regenerating these files from the templates automatically

## Changelog

See [here](CHANGELOG.md)

## Documentation
@@@GENERATED_DOCUMENTATION_PLACEHOLDER@@@

## License

Bootstrap 4 & Font Awesome 5 - IntelliJ Plugin is open-sourced software licensed under the [MIT license](http://opensource.org/licenses/MIT).

## Disclaimer:

Readme template for this plugin was initially borrowed from [here](https://github.com/bodiam/intellij-bootstrap3) & [here](https://github.com/JasonMortonNZ/bs3-sublime-plugin)
