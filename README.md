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

### Bootstrap master template

Trigger | Description
--- | ---
$ | Bootstrap master template

### Alert

Trigger | Description
--- | ---
alert-additional-content | Alert additional content
alert-closable | Alert closable
alert-danger-a | Alert danger with link
alert-danger | Alert danger
alert-dismissible | Alert dismissible
alert-info-a | Alert info with link
alert-info | Alert info
alert-success-a | Alert success with link
alert-success | Alert success
alert-warning-a | Alert warning with link
alert-warning | Alert warning

### Badge

Trigger | Description
--- | ---
badge-danger-pill | Badge danger pill
badge-danger | Badge danger
badge-default-pill | Badge default pill
badge-default | Badge default
badge-info-pill | Badge info pill
badge-info | Badge info
badge-primary-pill | Badge primary pill
badge-primary | Badge primary
badge-success-pill | Badge success pill
badge-success | Badge success
badge-warning-pill | Badge warning pill
badge-warning | Badge warning

### Button group

Trigger | Description
--- | ---
bgroup-default | Button group default
bgroup-dropdown-vertical | Button group dropdown vertical
bgroup-dropdown | Button group dropdown
bgroup-size | Button group size
bgroup-toolbar | Button group toolbar

### Breadcrumb

Trigger | Description
--- | ---
breadcrumb-default | Breadcrumb default
breadcrumb-list | Breadcrumb list

### Button

Trigger | Description
--- | ---
button-a | Button with link
button-block | Button block
button-checkbox | Button checkbox
button-default | Button default
button-disabled-a | Button disabled with link
button-input | Button input
button-outline | Button outline
button-radio | Button radio
button-sizes | Button sizes
button-toggle | Button toggle

### Card

Trigger | Description
--- | ---
card-align | Card align
card-background-custom | Card background custom
card-background | Card background
card-blockquote | Card blockquote
card-columns | Card columns
card-decks | Card decks
card-default | Card default
card-grid | Card grid
card-groups | Card groups
card-head-foot | Card head foot
card-links | Card links
card-list | Card list
card-outline | Card outline
card-overlay | Card overlay
card-pill-head | Card pill head
card-subtitle | Card subtitle
card-tab-head | Card tab head

### Carousel

Trigger | Description
--- | ---
carousel-caption | Carousel caption
carousel-default | Carousel default

### Collapse

Trigger | Description
--- | ---
collapse-accordion | Collapse accordion
collapse-button | Collapse button
collapse-default | Collapse default

### Dropdown

Trigger | Description
--- | ---
dropdown-alignment | Dropdown alignment
dropdown-anchor | Dropdown anchor
dropdown-button | Dropdown button
dropdown-colored | Dropdown colored
dropdown-default | Dropdown default
dropdown-sized | Dropdown sized
dropdown-split | Dropdown split
dropdown-up-split | Dropdown up split
dropdown-up | Dropdown up

### Form

Trigger | Description
--- | ---
form-checkbox-custom | Form checkbox custom
form-checkbox-inline | Form checkbox inline
form-checkbox-nolabel | Form checkbox nolabel
form-checkbox | Form checkbox
form-email | Form email
form-file-custom | Form file custom
form-file | Form file
form-grid | Form grid
form-group-text | Form group text
form-group | Form group
form-help-text-inline | Form help text inline
form-help-text | Form help text
form-hidden | Form hidden
form-inline | Form inline
form-input-sizing | Form input sizing
form-input-text | Form input text
form-input | Form input
form-multi-select-custom | Form multi select custom
form-multi-select | Form multi select
form-multil-select-sizing | Form multil select sizing
form-password | Form password
form-radio-custom | Form radio custom
form-radio-inline | Form radio inline
form-radio-nolabel | Form radio nolabel
form-radio | Form radio
form-reset | Form reset
form-select-custom | Form select custom
form-select-sizing | Form select sizing
form-select | Form select
form-submit | Form submit
form-textarea | Form textarea
form-validation | Form validation

### Input group

Trigger | Description
--- | ---
igroup-button | Input group button
igroup-checkbox-radio | Input group checkbox radio
igroup-dropdown-segmented | Input group dropdown segmented
igroup-dropdown | Input group dropdown
igroup-size | Input group size
igroup-text-append | Input group text append
igroup-text-both | Input group text both
igroup-text-prepend | Input group text prepend

### Jumbotron

Trigger | Description
--- | ---
jumbotron-default | Jumbotron default
jumbotron-fluid | Jumbotron fluid

### Label

Trigger | Description
--- | ---
label-default | Label default
label-heading | Label heading
label-pill | Label pill

### List

Trigger | Description
--- | ---
list-a | List with link
list-button | List button
list-colors | List colors
list-custom-ul | List custom with unordered list
list-custom | List custom
list-minimal-ul | List minimal with unordered list

### Modal

Trigger | Description
--- | ---
modal-centered | Modal centered
modal-customize | Modal customize
modal-default | Modal default
modal-grid | Modal grid
modal-sizes | Modal sizes

### Nav

Trigger | Description
--- | ---
nav-a | Nav with link
nav-complete | Nav complete
nav-tabs-pills-a-variation | Nav tabs pills with link variation
nav-tabs-pills-dropdown | Nav tabs pills dropdown
nav-tabs-pills-ul-variation | Nav tabs pills with unordered list variation
nav-ul | Nav with unordered list

### Navbar

Trigger | Description
--- | ---
navbar-background-color | Navbar background color
navbar-background | Navbar background
navbar-default | Navbar default
navbar-minimal-a | Navbar minimal with link
navbar-minimal-ul | Navbar minimal with unordered list
navbar-non-responsive | Navbar non responsive
navbar-placement | Navbar placement

### Pagination

Trigger | Description
--- | ---
pagination-default | Pagination default
pagination-sized | Pagination sized

### Popover

Trigger | Description
--- | ---
popover-default | Popover default
popover-direction | Popover direction
popover-dismissable | Popover dismissable

### Progress

Trigger | Description
--- | ---
progress-colored | Progress colored
progress-default | Progress default
progress-ie9 | Progress ie9
progress-striped | Progress striped

### Scrollspy

Trigger | Description
--- | ---
scrollspy-default | Scrollspy default

### Tooltip

Trigger | Description
--- | ---
tooltip-default | Tooltip default

### Figure

Trigger | Description
--- | ---
figure-default | Figure default

### Image

Trigger | Description
--- | ---
image-default | Image default

### Table

Trigger | Description
--- | ---
table-default | Table default
table-responsive | Table responsive
table-special | Table special

### Typography

Trigger | Description
--- | ---
typography-blockquote-reverse | Typography blockquote reverse
typography-blockquote | Typography blockquote
typography-description-list | Typography description list
typography-display-heading | Typography display heading
typography-lead | Typography lead
typography-list-inline | Typography list inline
typography-list-unstyled | Typography list unstyled
typography-muted-text | Typography muted text

### Grid

Trigger | Description
--- | ---
grid-col | Grid column
grid-container-fluid | Grid container fluid
grid-container | Grid container
grid-default | Grid default
grid-row | Grid row

### Media

Trigger | Description
--- | ---
media-bottom | Media bottom
media-default | Media default
media-list | Media list
media-middle | Media middle
media-nesting | Media nesting
media-right | Media right
media-top | Media top

### Responsive

Trigger | Description
--- | ---
responsive-print-hide-custom | Responsive print hide custom
responsive-print-hide | Responsive print hide
responsive-print-show | Responsive print show

### Font awesome

|Trigger|Group|Type|
|---|---|---|
|fas ad|Solid|Free|
|fas address-book|Solid|Free|
|fas address-card|Solid|Free|
|fas adjust|Solid|Free|
|fas air-freshener|Solid|Free|
|fas align-center|Solid|Free|
|fas align-justify|Solid|Free|
|fas align-left|Solid|Free|
|fas align-right|Solid|Free|
|fas allergies|Solid|Free|
|fas ambulance|Solid|Free|
|fas american-sign-language-interpreting|Solid|Free|
|fas anchor|Solid|Free|
|fas angle-double-down|Solid|Free|
|fas angle-double-left|Solid|Free|
|fas angle-double-right|Solid|Free|
|fas angle-double-up|Solid|Free|
|fas angle-down|Solid|Free|
|fas angle-left|Solid|Free|
|fas angle-right|Solid|Free|
|fas angle-up|Solid|Free|
|fas angry|Solid|Free|
|fas ankh|Solid|Free|
|fas apple-alt|Solid|Free|
|fas archive|Solid|Free|
|fas archway|Solid|Free|
|fas arrow-alt-circle-down|Solid|Free|
|fas arrow-alt-circle-left|Solid|Free|
|fas arrow-alt-circle-right|Solid|Free|
|fas arrow-alt-circle-up|Solid|Free|
|fas arrow-circle-down|Solid|Free|
|fas arrow-circle-left|Solid|Free|
|fas arrow-circle-right|Solid|Free|
|fas arrow-circle-up|Solid|Free|
|fas arrow-down|Solid|Free|
|fas arrow-left|Solid|Free|
|fas arrow-right|Solid|Free|
|fas arrow-up|Solid|Free|
|fas arrows-alt|Solid|Free|
|fas arrows-alt-h|Solid|Free|
|fas arrows-alt-v|Solid|Free|
|fas assistive-listening-systems|Solid|Free|
|fas asterisk|Solid|Free|
|fas at|Solid|Free|
|fas atlas|Solid|Free|
|fas atom|Solid|Free|
|fas audio-description|Solid|Free|
|fas award|Solid|Free|
|fas backspace|Solid|Free|
|fas backward|Solid|Free|
|fas balance-scale|Solid|Free|
|fas ban|Solid|Free|
|fas band-aid|Solid|Free|
|fas barcode|Solid|Free|
|fas bars|Solid|Free|
|fas baseball-ball|Solid|Free|
|fas basketball-ball|Solid|Free|
|fas bath|Solid|Free|
|fas battery-empty|Solid|Free|
|fas battery-full|Solid|Free|
|fas battery-half|Solid|Free|
|fas battery-quarter|Solid|Free|
|fas battery-three-quarters|Solid|Free|
|fas bed|Solid|Free|
|fas beer|Solid|Free|
|fas bell|Solid|Free|
|fas bell-slash|Solid|Free|
|fas bezier-curve|Solid|Free|
|fas bible|Solid|Free|
|fas bicycle|Solid|Free|
|fas binoculars|Solid|Free|
|fas birthday-cake|Solid|Free|
|fas blender|Solid|Free|
|fas blender-phone|Solid|Free|
|fas blind|Solid|Free|
|fas bold|Solid|Free|
|fas bolt|Solid|Free|
|fas bomb|Solid|Free|
|fas bone|Solid|Free|
|fas bong|Solid|Free|
|fas book|Solid|Free|
|fas book-dead|Solid|Free|
|fas book-open|Solid|Free|
|fas book-reader|Solid|Free|
|fas bookmark|Solid|Free|
|fas bowling-ball|Solid|Free|
|fas box|Solid|Free|
|fas box-open|Solid|Free|
|fas boxes|Solid|Free|
|fas braille|Solid|Free|
|fas brain|Solid|Free|
|fas briefcase|Solid|Free|
|fas briefcase-medical|Solid|Free|
|fas broadcast-tower|Solid|Free|
|fas broom|Solid|Free|
|fas brush|Solid|Free|
|fas bug|Solid|Free|
|fas building|Solid|Free|
|fas bullhorn|Solid|Free|
|fas bullseye|Solid|Free|
|fas burn|Solid|Free|
|fas bus|Solid|Free|
|fas bus-alt|Solid|Free|
|fas business-time|Solid|Free|
|fas calculator|Solid|Free|
|fas calendar|Solid|Free|
|fas calendar-alt|Solid|Free|
|fas calendar-check|Solid|Free|
|fas calendar-minus|Solid|Free|
|fas calendar-plus|Solid|Free|
|fas calendar-times|Solid|Free|
|fas camera|Solid|Free|
|fas camera-retro|Solid|Free|
|fas campground|Solid|Free|
|fas cannabis|Solid|Free|
|fas capsules|Solid|Free|
|fas car|Solid|Free|
|fas car-alt|Solid|Free|
|fas car-battery|Solid|Free|
|fas car-crash|Solid|Free|
|fas car-side|Solid|Free|
|fas caret-down|Solid|Free|
|fas caret-left|Solid|Free|
|fas caret-right|Solid|Free|
|fas caret-square-down|Solid|Free|
|fas caret-square-left|Solid|Free|
|fas caret-square-right|Solid|Free|
|fas caret-square-up|Solid|Free|
|fas caret-up|Solid|Free|
|fas cart-arrow-down|Solid|Free|
|fas cart-plus|Solid|Free|
|fas cat|Solid|Free|
|fas certificate|Solid|Free|
|fas chair|Solid|Free|
|fas chalkboard|Solid|Free|
|fas chalkboard-teacher|Solid|Free|
|fas charging-station|Solid|Free|
|fas chart-area|Solid|Free|
|fas chart-bar|Solid|Free|
|fas chart-line|Solid|Free|
|fas chart-pie|Solid|Free|
|fas check|Solid|Free|
|fas check-circle|Solid|Free|
|fas check-double|Solid|Free|
|fas check-square|Solid|Free|
|fas chess|Solid|Free|
|fas chess-bishop|Solid|Free|
|fas chess-board|Solid|Free|
|fas chess-king|Solid|Free|
|fas chess-knight|Solid|Free|
|fas chess-pawn|Solid|Free|
|fas chess-queen|Solid|Free|
|fas chess-rook|Solid|Free|
|fas chevron-circle-down|Solid|Free|
|fas chevron-circle-left|Solid|Free|
|fas chevron-circle-right|Solid|Free|
|fas chevron-circle-up|Solid|Free|
|fas chevron-down|Solid|Free|
|fas chevron-left|Solid|Free|
|fas chevron-right|Solid|Free|
|fas chevron-up|Solid|Free|
|fas child|Solid|Free|
|fas church|Solid|Free|
|fas circle|Solid|Free|
|fas circle-notch|Solid|Free|
|fas city|Solid|Free|
|fas clipboard|Solid|Free|
|fas clipboard-check|Solid|Free|
|fas clipboard-list|Solid|Free|
|fas clock|Solid|Free|
|fas clone|Solid|Free|
|fas closed-captioning|Solid|Free|
|fas cloud|Solid|Free|
|fas cloud-download-alt|Solid|Free|
|fas cloud-meatball|Solid|Free|
|fas cloud-moon|Solid|Free|
|fas cloud-moon-rain|Solid|Free|
|fas cloud-rain|Solid|Free|
|fas cloud-showers-heavy|Solid|Free|
|fas cloud-sun|Solid|Free|
|fas cloud-sun-rain|Solid|Free|
|fas cloud-upload-alt|Solid|Free|
|fas cocktail|Solid|Free|
|fas code|Solid|Free|
|fas code-branch|Solid|Free|
|fas coffee|Solid|Free|
|fas cog|Solid|Free|
|fas cogs|Solid|Free|
|fas coins|Solid|Free|
|fas columns|Solid|Free|
|fas comment|Solid|Free|
|fas comment-alt|Solid|Free|
|fas comment-dollar|Solid|Free|
|fas comment-dots|Solid|Free|
|fas comment-slash|Solid|Free|
|fas comments|Solid|Free|
|fas comments-dollar|Solid|Free|
|fas compact-disc|Solid|Free|
|fas compass|Solid|Free|
|fas compress|Solid|Free|
|fas concierge-bell|Solid|Free|
|fas cookie|Solid|Free|
|fas cookie-bite|Solid|Free|
|fas copy|Solid|Free|
|fas copyright|Solid|Free|
|fas couch|Solid|Free|
|fas credit-card|Solid|Free|
|fas crop|Solid|Free|
|fas crop-alt|Solid|Free|
|fas cross|Solid|Free|
|fas crosshairs|Solid|Free|
|fas crow|Solid|Free|
|fas crown|Solid|Free|
|fas cube|Solid|Free|
|fas cubes|Solid|Free|
|fas cut|Solid|Free|
|fas database|Solid|Free|
|fas deaf|Solid|Free|
|fas democrat|Solid|Free|
|fas desktop|Solid|Free|
|fas dharmachakra|Solid|Free|
|fas diagnoses|Solid|Free|
|fas dice|Solid|Free|
|fas dice-d20|Solid|Free|
|fas dice-d6|Solid|Free|
|fas dice-five|Solid|Free|
|fas dice-four|Solid|Free|
|fas dice-one|Solid|Free|
|fas dice-six|Solid|Free|
|fas dice-three|Solid|Free|
|fas dice-two|Solid|Free|
|fas digital-tachograph|Solid|Free|
|fas directions|Solid|Free|
|fas divide|Solid|Free|
|fas dizzy|Solid|Free|
|fas dna|Solid|Free|
|fas dog|Solid|Free|
|fas dollar-sign|Solid|Free|
|fas dolly|Solid|Free|
|fas dolly-flatbed|Solid|Free|
|fas donate|Solid|Free|
|fas door-closed|Solid|Free|
|fas door-open|Solid|Free|
|fas dot-circle|Solid|Free|
|fas dove|Solid|Free|
|fas download|Solid|Free|
|fas drafting-compass|Solid|Free|
|fas dragon|Solid|Free|
|fas draw-polygon|Solid|Free|
|fas drum|Solid|Free|
|fas drum-steelpan|Solid|Free|
|fas drumstick-bite|Solid|Free|
|fas dumbbell|Solid|Free|
|fas dungeon|Solid|Free|
|fas edit|Solid|Free|
|fas eject|Solid|Free|
|fas ellipsis-h|Solid|Free|
|fas ellipsis-v|Solid|Free|
|fas envelope|Solid|Free|
|fas envelope-open|Solid|Free|
|fas envelope-open-text|Solid|Free|
|fas envelope-square|Solid|Free|
|fas equals|Solid|Free|
|fas eraser|Solid|Free|
|fas euro-sign|Solid|Free|
|fas exchange-alt|Solid|Free|
|fas exclamation|Solid|Free|
|fas exclamation-circle|Solid|Free|
|fas exclamation-triangle|Solid|Free|
|fas expand|Solid|Free|
|fas expand-arrows-alt|Solid|Free|
|fas external-link-alt|Solid|Free|
|fas external-link-square-alt|Solid|Free|
|fas eye|Solid|Free|
|fas eye-dropper|Solid|Free|
|fas eye-slash|Solid|Free|
|fas fast-backward|Solid|Free|
|fas fast-forward|Solid|Free|
|fas fax|Solid|Free|
|fas feather|Solid|Free|
|fas feather-alt|Solid|Free|
|fas female|Solid|Free|
|fas fighter-jet|Solid|Free|
|fas file|Solid|Free|
|fas file-alt|Solid|Free|
|fas file-archive|Solid|Free|
|fas file-audio|Solid|Free|
|fas file-code|Solid|Free|
|fas file-contract|Solid|Free|
|fas file-csv|Solid|Free|
|fas file-download|Solid|Free|
|fas file-excel|Solid|Free|
|fas file-export|Solid|Free|
|fas file-image|Solid|Free|
|fas file-import|Solid|Free|
|fas file-invoice|Solid|Free|
|fas file-invoice-dollar|Solid|Free|
|fas file-medical|Solid|Free|
|fas file-medical-alt|Solid|Free|
|fas file-pdf|Solid|Free|
|fas file-powerpoint|Solid|Free|
|fas file-prescription|Solid|Free|
|fas file-signature|Solid|Free|
|fas file-upload|Solid|Free|
|fas file-video|Solid|Free|
|fas file-word|Solid|Free|
|fas fill|Solid|Free|
|fas fill-drip|Solid|Free|
|fas film|Solid|Free|
|fas filter|Solid|Free|
|fas fingerprint|Solid|Free|
|fas fire|Solid|Free|
|fas fire-extinguisher|Solid|Free|
|fas first-aid|Solid|Free|
|fas fish|Solid|Free|
|fas fist-raised|Solid|Free|
|fas flag|Solid|Free|
|fas flag-checkered|Solid|Free|
|fas flag-usa|Solid|Free|
|fas flask|Solid|Free|
|fas flushed|Solid|Free|
|fas folder|Solid|Free|
|fas folder-minus|Solid|Free|
|fas folder-open|Solid|Free|
|fas folder-plus|Solid|Free|
|fas font|Solid|Free|
|fas football-ball|Solid|Free|
|fas forward|Solid|Free|
|fas frog|Solid|Free|
|fas frown|Solid|Free|
|fas frown-open|Solid|Free|
|fas funnel-dollar|Solid|Free|
|fas futbol|Solid|Free|
|fas gamepad|Solid|Free|
|fas gas-pump|Solid|Free|
|fas gavel|Solid|Free|
|fas gem|Solid|Free|
|fas genderless|Solid|Free|
|fas ghost|Solid|Free|
|fas gift|Solid|Free|
|fas glass-martini|Solid|Free|
|fas glass-martini-alt|Solid|Free|
|fas glasses|Solid|Free|
|fas globe|Solid|Free|
|fas globe-africa|Solid|Free|
|fas globe-americas|Solid|Free|
|fas globe-asia|Solid|Free|
|fas golf-ball|Solid|Free|
|fas gopuram|Solid|Free|
|fas graduation-cap|Solid|Free|
|fas greater-than|Solid|Free|
|fas greater-than-equal|Solid|Free|
|fas grimace|Solid|Free|
|fas grin|Solid|Free|
|fas grin-alt|Solid|Free|
|fas grin-beam|Solid|Free|
|fas grin-beam-sweat|Solid|Free|
|fas grin-hearts|Solid|Free|
|fas grin-squint|Solid|Free|
|fas grin-squint-tears|Solid|Free|
|fas grin-stars|Solid|Free|
|fas grin-tears|Solid|Free|
|fas grin-tongue|Solid|Free|
|fas grin-tongue-squint|Solid|Free|
|fas grin-tongue-wink|Solid|Free|
|fas grin-wink|Solid|Free|
|fas grip-horizontal|Solid|Free|
|fas grip-vertical|Solid|Free|
|fas h-square|Solid|Free|
|fas hammer|Solid|Free|
|fas hamsa|Solid|Free|
|fas hand-holding|Solid|Free|
|fas hand-holding-heart|Solid|Free|
|fas hand-holding-usd|Solid|Free|
|fas hand-lizard|Solid|Free|
|fas hand-paper|Solid|Free|
|fas hand-peace|Solid|Free|
|fas hand-point-down|Solid|Free|
|fas hand-point-left|Solid|Free|
|fas hand-point-right|Solid|Free|
|fas hand-point-up|Solid|Free|
|fas hand-pointer|Solid|Free|
|fas hand-rock|Solid|Free|
|fas hand-scissors|Solid|Free|
|fas hand-spock|Solid|Free|
|fas hands|Solid|Free|
|fas hands-helping|Solid|Free|
|fas handshake|Solid|Free|
|fas hanukiah|Solid|Free|
|fas hashtag|Solid|Free|
|fas hat-wizard|Solid|Free|
|fas haykal|Solid|Free|
|fas hdd|Solid|Free|
|fas heading|Solid|Free|
|fas headphones|Solid|Free|
|fas headphones-alt|Solid|Free|
|fas headset|Solid|Free|
|fas heart|Solid|Free|
|fas heartbeat|Solid|Free|
|fas helicopter|Solid|Free|
|fas highlighter|Solid|Free|
|fas hiking|Solid|Free|
|fas hippo|Solid|Free|
|fas history|Solid|Free|
|fas hockey-puck|Solid|Free|
|fas home|Solid|Free|
|fas horse|Solid|Free|
|fas hospital|Solid|Free|
|fas hospital-alt|Solid|Free|
|fas hospital-symbol|Solid|Free|
|fas hot-tub|Solid|Free|
|fas hotel|Solid|Free|
|fas hourglass|Solid|Free|
|fas hourglass-end|Solid|Free|
|fas hourglass-half|Solid|Free|
|fas hourglass-start|Solid|Free|
|fas house-damage|Solid|Free|
|fas hryvnia|Solid|Free|
|fas i-cursor|Solid|Free|
|fas id-badge|Solid|Free|
|fas id-card|Solid|Free|
|fas id-card-alt|Solid|Free|
|fas image|Solid|Free|
|fas images|Solid|Free|
|fas inbox|Solid|Free|
|fas indent|Solid|Free|
|fas industry|Solid|Free|
|fas infinity|Solid|Free|
|fas info|Solid|Free|
|fas info-circle|Solid|Free|
|fas italic|Solid|Free|
|fas jedi|Solid|Free|
|fas joint|Solid|Free|
|fas journal-whills|Solid|Free|
|fas kaaba|Solid|Free|
|fas key|Solid|Free|
|fas keyboard|Solid|Free|
|fas khanda|Solid|Free|
|fas kiss|Solid|Free|
|fas kiss-beam|Solid|Free|
|fas kiss-wink-heart|Solid|Free|
|fas kiwi-bird|Solid|Free|
|fas landmark|Solid|Free|
|fas language|Solid|Free|
|fas laptop|Solid|Free|
|fas laptop-code|Solid|Free|
|fas laugh|Solid|Free|
|fas laugh-beam|Solid|Free|
|fas laugh-squint|Solid|Free|
|fas laugh-wink|Solid|Free|
|fas layer-group|Solid|Free|
|fas leaf|Solid|Free|
|fas lemon|Solid|Free|
|fas less-than|Solid|Free|
|fas less-than-equal|Solid|Free|
|fas level-down-alt|Solid|Free|
|fas level-up-alt|Solid|Free|
|fas life-ring|Solid|Free|
|fas lightbulb|Solid|Free|
|fas link|Solid|Free|
|fas lira-sign|Solid|Free|
|fas list|Solid|Free|
|fas list-alt|Solid|Free|
|fas list-ol|Solid|Free|
|fas list-ul|Solid|Free|
|fas location-arrow|Solid|Free|
|fas lock|Solid|Free|
|fas lock-open|Solid|Free|
|fas long-arrow-alt-down|Solid|Free|
|fas long-arrow-alt-left|Solid|Free|
|fas long-arrow-alt-right|Solid|Free|
|fas long-arrow-alt-up|Solid|Free|
|fas low-vision|Solid|Free|
|fas luggage-cart|Solid|Free|
|fas magic|Solid|Free|
|fas magnet|Solid|Free|
|fas mail-bulk|Solid|Free|
|fas male|Solid|Free|
|fas map|Solid|Free|
|fas map-marked|Solid|Free|
|fas map-marked-alt|Solid|Free|
|fas map-marker|Solid|Free|
|fas map-marker-alt|Solid|Free|
|fas map-pin|Solid|Free|
|fas map-signs|Solid|Free|
|fas marker|Solid|Free|
|fas mars|Solid|Free|
|fas mars-double|Solid|Free|
|fas mars-stroke|Solid|Free|
|fas mars-stroke-h|Solid|Free|
|fas mars-stroke-v|Solid|Free|
|fas mask|Solid|Free|
|fas medal|Solid|Free|
|fas medkit|Solid|Free|
|fas meh|Solid|Free|
|fas meh-blank|Solid|Free|
|fas meh-rolling-eyes|Solid|Free|
|fas memory|Solid|Free|
|fas menorah|Solid|Free|
|fas mercury|Solid|Free|
|fas meteor|Solid|Free|
|fas microchip|Solid|Free|
|fas microphone|Solid|Free|
|fas microphone-alt|Solid|Free|
|fas microphone-alt-slash|Solid|Free|
|fas microphone-slash|Solid|Free|
|fas microscope|Solid|Free|
|fas minus|Solid|Free|
|fas minus-circle|Solid|Free|
|fas minus-square|Solid|Free|
|fas mobile|Solid|Free|
|fas mobile-alt|Solid|Free|
|fas money-bill|Solid|Free|
|fas money-bill-alt|Solid|Free|
|fas money-bill-wave|Solid|Free|
|fas money-bill-wave-alt|Solid|Free|
|fas money-check|Solid|Free|
|fas money-check-alt|Solid|Free|
|fas monument|Solid|Free|
|fas moon|Solid|Free|
|fas mortar-pestle|Solid|Free|
|fas mosque|Solid|Free|
|fas motorcycle|Solid|Free|
|fas mountain|Solid|Free|
|fas mouse-pointer|Solid|Free|
|fas music|Solid|Free|
|fas network-wired|Solid|Free|
|fas neuter|Solid|Free|
|fas newspaper|Solid|Free|
|fas not-equal|Solid|Free|
|fas notes-medical|Solid|Free|
|fas object-group|Solid|Free|
|fas object-ungroup|Solid|Free|
|fas oil-can|Solid|Free|
|fas om|Solid|Free|
|fas otter|Solid|Free|
|fas outdent|Solid|Free|
|fas paint-brush|Solid|Free|
|fas paint-roller|Solid|Free|
|fas palette|Solid|Free|
|fas pallet|Solid|Free|
|fas paper-plane|Solid|Free|
|fas paperclip|Solid|Free|
|fas parachute-box|Solid|Free|
|fas paragraph|Solid|Free|
|fas parking|Solid|Free|
|fas passport|Solid|Free|
|fas pastafarianism|Solid|Free|
|fas paste|Solid|Free|
|fas pause|Solid|Free|
|fas pause-circle|Solid|Free|
|fas paw|Solid|Free|
|fas peace|Solid|Free|
|fas pen|Solid|Free|
|fas pen-alt|Solid|Free|
|fas pen-fancy|Solid|Free|
|fas pen-nib|Solid|Free|
|fas pen-square|Solid|Free|
|fas pencil-alt|Solid|Free|
|fas pencil-ruler|Solid|Free|
|fas people-carry|Solid|Free|
|fas percent|Solid|Free|
|fas percentage|Solid|Free|
|fas person-booth|Solid|Free|
|fas phone|Solid|Free|
|fas phone-slash|Solid|Free|
|fas phone-square|Solid|Free|
|fas phone-volume|Solid|Free|
|fas piggy-bank|Solid|Free|
|fas pills|Solid|Free|
|fas place-of-worship|Solid|Free|
|fas plane|Solid|Free|
|fas plane-arrival|Solid|Free|
|fas plane-departure|Solid|Free|
|fas play|Solid|Free|
|fas play-circle|Solid|Free|
|fas plug|Solid|Free|
|fas plus|Solid|Free|
|fas plus-circle|Solid|Free|
|fas plus-square|Solid|Free|
|fas podcast|Solid|Free|
|fas poll|Solid|Free|
|fas poll-h|Solid|Free|
|fas poo|Solid|Free|
|fas poo-storm|Solid|Free|
|fas poop|Solid|Free|
|fas portrait|Solid|Free|
|fas pound-sign|Solid|Free|
|fas power-off|Solid|Free|
|fas pray|Solid|Free|
|fas praying-hands|Solid|Free|
|fas prescription|Solid|Free|
|fas prescription-bottle|Solid|Free|
|fas prescription-bottle-alt|Solid|Free|
|fas print|Solid|Free|
|fas procedures|Solid|Free|
|fas project-diagram|Solid|Free|
|fas puzzle-piece|Solid|Free|
|fas qrcode|Solid|Free|
|fas question|Solid|Free|
|fas question-circle|Solid|Free|
|fas quidditch|Solid|Free|
|fas quote-left|Solid|Free|
|fas quote-right|Solid|Free|
|fas quran|Solid|Free|
|fas rainbow|Solid|Free|
|fas random|Solid|Free|
|fas receipt|Solid|Free|
|fas recycle|Solid|Free|
|fas redo|Solid|Free|
|fas redo-alt|Solid|Free|
|fas registered|Solid|Free|
|fas reply|Solid|Free|
|fas reply-all|Solid|Free|
|fas republican|Solid|Free|
|fas retweet|Solid|Free|
|fas ribbon|Solid|Free|
|fas ring|Solid|Free|
|fas road|Solid|Free|
|fas robot|Solid|Free|
|fas rocket|Solid|Free|
|fas route|Solid|Free|
|fas rss|Solid|Free|
|fas rss-square|Solid|Free|
|fas ruble-sign|Solid|Free|
|fas ruler|Solid|Free|
|fas ruler-combined|Solid|Free|
|fas ruler-horizontal|Solid|Free|
|fas ruler-vertical|Solid|Free|
|fas running|Solid|Free|
|fas rupee-sign|Solid|Free|
|fas sad-cry|Solid|Free|
|fas sad-tear|Solid|Free|
|fas save|Solid|Free|
|fas school|Solid|Free|
|fas screwdriver|Solid|Free|
|fas scroll|Solid|Free|
|fas search|Solid|Free|
|fas search-dollar|Solid|Free|
|fas search-location|Solid|Free|
|fas search-minus|Solid|Free|
|fas search-plus|Solid|Free|
|fas seedling|Solid|Free|
|fas server|Solid|Free|
|fas shapes|Solid|Free|
|fas share|Solid|Free|
|fas share-alt|Solid|Free|
|fas share-alt-square|Solid|Free|
|fas share-square|Solid|Free|
|fas shekel-sign|Solid|Free|
|fas shield-alt|Solid|Free|
|fas ship|Solid|Free|
|fas shipping-fast|Solid|Free|
|fas shoe-prints|Solid|Free|
|fas shopping-bag|Solid|Free|
|fas shopping-basket|Solid|Free|
|fas shopping-cart|Solid|Free|
|fas shower|Solid|Free|
|fas shuttle-van|Solid|Free|
|fas sign|Solid|Free|
|fas sign-in-alt|Solid|Free|
|fas sign-language|Solid|Free|
|fas sign-out-alt|Solid|Free|
|fas signal|Solid|Free|
|fas signature|Solid|Free|
|fas sitemap|Solid|Free|
|fas skull|Solid|Free|
|fas skull-crossbones|Solid|Free|
|fas slash|Solid|Free|
|fas sliders-h|Solid|Free|
|fas smile|Solid|Free|
|fas smile-beam|Solid|Free|
|fas smile-wink|Solid|Free|
|fas smog|Solid|Free|
|fas smoking|Solid|Free|
|fas smoking-ban|Solid|Free|
|fas snowflake|Solid|Free|
|fas socks|Solid|Free|
|fas solar-panel|Solid|Free|
|fas sort|Solid|Free|
|fas sort-alpha-down|Solid|Free|
|fas sort-alpha-up|Solid|Free|
|fas sort-amount-down|Solid|Free|
|fas sort-amount-up|Solid|Free|
|fas sort-down|Solid|Free|
|fas sort-numeric-down|Solid|Free|
|fas sort-numeric-up|Solid|Free|
|fas sort-up|Solid|Free|
|fas spa|Solid|Free|
|fas space-shuttle|Solid|Free|
|fas spider|Solid|Free|
|fas spinner|Solid|Free|
|fas splotch|Solid|Free|
|fas spray-can|Solid|Free|
|fas square|Solid|Free|
|fas square-full|Solid|Free|
|fas square-root-alt|Solid|Free|
|fas stamp|Solid|Free|
|fas star|Solid|Free|
|fas star-and-crescent|Solid|Free|
|fas star-half|Solid|Free|
|fas star-half-alt|Solid|Free|
|fas star-of-david|Solid|Free|
|fas star-of-life|Solid|Free|
|fas step-backward|Solid|Free|
|fas step-forward|Solid|Free|
|fas stethoscope|Solid|Free|
|fas sticky-note|Solid|Free|
|fas stop|Solid|Free|
|fas stop-circle|Solid|Free|
|fas stopwatch|Solid|Free|
|fas store|Solid|Free|
|fas store-alt|Solid|Free|
|fas stream|Solid|Free|
|fas street-view|Solid|Free|
|fas strikethrough|Solid|Free|
|fas stroopwafel|Solid|Free|
|fas subscript|Solid|Free|
|fas subway|Solid|Free|
|fas suitcase|Solid|Free|
|fas suitcase-rolling|Solid|Free|
|fas sun|Solid|Free|
|fas superscript|Solid|Free|
|fas surprise|Solid|Free|
|fas swatchbook|Solid|Free|
|fas swimmer|Solid|Free|
|fas swimming-pool|Solid|Free|
|fas synagogue|Solid|Free|
|fas sync|Solid|Free|
|fas sync-alt|Solid|Free|
|fas syringe|Solid|Free|
|fas table|Solid|Free|
|fas table-tennis|Solid|Free|
|fas tablet|Solid|Free|
|fas tablet-alt|Solid|Free|
|fas tablets|Solid|Free|
|fas tachometer-alt|Solid|Free|
|fas tag|Solid|Free|
|fas tags|Solid|Free|
|fas tape|Solid|Free|
|fas tasks|Solid|Free|
|fas taxi|Solid|Free|
|fas teeth|Solid|Free|
|fas teeth-open|Solid|Free|
|fas temperature-high|Solid|Free|
|fas temperature-low|Solid|Free|
|fas terminal|Solid|Free|
|fas text-height|Solid|Free|
|fas text-width|Solid|Free|
|fas th|Solid|Free|
|fas th-large|Solid|Free|
|fas th-list|Solid|Free|
|fas theater-masks|Solid|Free|
|fas thermometer|Solid|Free|
|fas thermometer-empty|Solid|Free|
|fas thermometer-full|Solid|Free|
|fas thermometer-half|Solid|Free|
|fas thermometer-quarter|Solid|Free|
|fas thermometer-three-quarters|Solid|Free|
|fas thumbs-down|Solid|Free|
|fas thumbs-up|Solid|Free|
|fas thumbtack|Solid|Free|
|fas ticket-alt|Solid|Free|
|fas times|Solid|Free|
|fas times-circle|Solid|Free|
|fas tint|Solid|Free|
|fas tint-slash|Solid|Free|
|fas tired|Solid|Free|
|fas toggle-off|Solid|Free|
|fas toggle-on|Solid|Free|
|fas toilet-paper|Solid|Free|
|fas toolbox|Solid|Free|
|fas tooth|Solid|Free|
|fas torah|Solid|Free|
|fas torii-gate|Solid|Free|
|fas tractor|Solid|Free|
|fas trademark|Solid|Free|
|fas traffic-light|Solid|Free|
|fas train|Solid|Free|
|fas transgender|Solid|Free|
|fas transgender-alt|Solid|Free|
|fas trash|Solid|Free|
|fas trash-alt|Solid|Free|
|fas tree|Solid|Free|
|fas trophy|Solid|Free|
|fas truck|Solid|Free|
|fas truck-loading|Solid|Free|
|fas truck-monster|Solid|Free|
|fas truck-moving|Solid|Free|
|fas truck-pickup|Solid|Free|
|fas tshirt|Solid|Free|
|fas tty|Solid|Free|
|fas tv|Solid|Free|
|fas umbrella|Solid|Free|
|fas umbrella-beach|Solid|Free|
|fas underline|Solid|Free|
|fas undo|Solid|Free|
|fas undo-alt|Solid|Free|
|fas universal-access|Solid|Free|
|fas university|Solid|Free|
|fas unlink|Solid|Free|
|fas unlock|Solid|Free|
|fas unlock-alt|Solid|Free|
|fas upload|Solid|Free|
|fas user|Solid|Free|
|fas user-alt|Solid|Free|
|fas user-alt-slash|Solid|Free|
|fas user-astronaut|Solid|Free|
|fas user-check|Solid|Free|
|fas user-circle|Solid|Free|
|fas user-clock|Solid|Free|
|fas user-cog|Solid|Free|
|fas user-edit|Solid|Free|
|fas user-friends|Solid|Free|
|fas user-graduate|Solid|Free|
|fas user-injured|Solid|Free|
|fas user-lock|Solid|Free|
|fas user-md|Solid|Free|
|fas user-minus|Solid|Free|
|fas user-ninja|Solid|Free|
|fas user-plus|Solid|Free|
|fas user-secret|Solid|Free|
|fas user-shield|Solid|Free|
|fas user-slash|Solid|Free|
|fas user-tag|Solid|Free|
|fas user-tie|Solid|Free|
|fas user-times|Solid|Free|
|fas users|Solid|Free|
|fas users-cog|Solid|Free|
|fas utensil-spoon|Solid|Free|
|fas utensils|Solid|Free|
|fas vector-square|Solid|Free|
|fas venus|Solid|Free|
|fas venus-double|Solid|Free|
|fas venus-mars|Solid|Free|
|fas vial|Solid|Free|
|fas vials|Solid|Free|
|fas video|Solid|Free|
|fas video-slash|Solid|Free|
|fas vihara|Solid|Free|
|fas volleyball-ball|Solid|Free|
|fas volume-down|Solid|Free|
|fas volume-mute|Solid|Free|
|fas volume-off|Solid|Free|
|fas volume-up|Solid|Free|
|fas vote-yea|Solid|Free|
|fas vr-cardboard|Solid|Free|
|fas walking|Solid|Free|
|fas wallet|Solid|Free|
|fas warehouse|Solid|Free|
|fas water|Solid|Free|
|fas weight|Solid|Free|
|fas weight-hanging|Solid|Free|
|fas wheelchair|Solid|Free|
|fas wifi|Solid|Free|
|fas wind|Solid|Free|
|fas window-close|Solid|Free|
|fas window-maximize|Solid|Free|
|fas window-minimize|Solid|Free|
|fas window-restore|Solid|Free|
|fas wine-bottle|Solid|Free|
|fas wine-glass|Solid|Free|
|fas wine-glass-alt|Solid|Free|
|fas won-sign|Solid|Free|
|fas wrench|Solid|Free|
|fas x-ray|Solid|Free|
|fas yen-sign|Solid|Free|
|fas yin-yang|Solid|Free|
|far address-book|Regular|Free|
|far address-card|Regular|Free|
|far angry|Regular|Free|
|far arrow-alt-circle-down|Regular|Free|
|far arrow-alt-circle-left|Regular|Free|
|far arrow-alt-circle-right|Regular|Free|
|far arrow-alt-circle-up|Regular|Free|
|far bell|Regular|Free|
|far bell-slash|Regular|Free|
|far bookmark|Regular|Free|
|far building|Regular|Free|
|far calendar|Regular|Free|
|far calendar-alt|Regular|Free|
|far calendar-check|Regular|Free|
|far calendar-minus|Regular|Free|
|far calendar-plus|Regular|Free|
|far calendar-times|Regular|Free|
|far caret-square-down|Regular|Free|
|far caret-square-left|Regular|Free|
|far caret-square-right|Regular|Free|
|far caret-square-up|Regular|Free|
|far chart-bar|Regular|Free|
|far check-circle|Regular|Free|
|far check-square|Regular|Free|
|far circle|Regular|Free|
|far clipboard|Regular|Free|
|far clock|Regular|Free|
|far clone|Regular|Free|
|far closed-captioning|Regular|Free|
|far comment|Regular|Free|
|far comment-alt|Regular|Free|
|far comment-dots|Regular|Free|
|far comments|Regular|Free|
|far compass|Regular|Free|
|far copy|Regular|Free|
|far copyright|Regular|Free|
|far credit-card|Regular|Free|
|far dizzy|Regular|Free|
|far dot-circle|Regular|Free|
|far edit|Regular|Free|
|far envelope|Regular|Free|
|far envelope-open|Regular|Free|
|far eye|Regular|Free|
|far eye-slash|Regular|Free|
|far file|Regular|Free|
|far file-alt|Regular|Free|
|far file-archive|Regular|Free|
|far file-audio|Regular|Free|
|far file-code|Regular|Free|
|far file-excel|Regular|Free|
|far file-image|Regular|Free|
|far file-pdf|Regular|Free|
|far file-powerpoint|Regular|Free|
|far file-video|Regular|Free|
|far file-word|Regular|Free|
|far flag|Regular|Free|
|far flushed|Regular|Free|
|far folder|Regular|Free|
|far folder-open|Regular|Free|
|far frown|Regular|Free|
|far frown-open|Regular|Free|
|far futbol|Regular|Free|
|far gem|Regular|Free|
|far grimace|Regular|Free|
|far grin|Regular|Free|
|far grin-alt|Regular|Free|
|far grin-beam|Regular|Free|
|far grin-beam-sweat|Regular|Free|
|far grin-hearts|Regular|Free|
|far grin-squint|Regular|Free|
|far grin-squint-tears|Regular|Free|
|far grin-stars|Regular|Free|
|far grin-tears|Regular|Free|
|far grin-tongue|Regular|Free|
|far grin-tongue-squint|Regular|Free|
|far grin-tongue-wink|Regular|Free|
|far grin-wink|Regular|Free|
|far hand-lizard|Regular|Free|
|far hand-paper|Regular|Free|
|far hand-peace|Regular|Free|
|far hand-point-down|Regular|Free|
|far hand-point-left|Regular|Free|
|far hand-point-right|Regular|Free|
|far hand-point-up|Regular|Free|
|far hand-pointer|Regular|Free|
|far hand-rock|Regular|Free|
|far hand-scissors|Regular|Free|
|far hand-spock|Regular|Free|
|far handshake|Regular|Free|
|far hdd|Regular|Free|
|far heart|Regular|Free|
|far hospital|Regular|Free|
|far hourglass|Regular|Free|
|far id-badge|Regular|Free|
|far id-card|Regular|Free|
|far image|Regular|Free|
|far images|Regular|Free|
|far keyboard|Regular|Free|
|far kiss|Regular|Free|
|far kiss-beam|Regular|Free|
|far kiss-wink-heart|Regular|Free|
|far laugh|Regular|Free|
|far laugh-beam|Regular|Free|
|far laugh-squint|Regular|Free|
|far laugh-wink|Regular|Free|
|far lemon|Regular|Free|
|far life-ring|Regular|Free|
|far lightbulb|Regular|Free|
|far list-alt|Regular|Free|
|far map|Regular|Free|
|far meh|Regular|Free|
|far meh-blank|Regular|Free|
|far meh-rolling-eyes|Regular|Free|
|far minus-square|Regular|Free|
|far money-bill-alt|Regular|Free|
|far moon|Regular|Free|
|far newspaper|Regular|Free|
|far object-group|Regular|Free|
|far object-ungroup|Regular|Free|
|far paper-plane|Regular|Free|
|far pause-circle|Regular|Free|
|far play-circle|Regular|Free|
|far plus-square|Regular|Free|
|far question-circle|Regular|Free|
|far registered|Regular|Free|
|far sad-cry|Regular|Free|
|far sad-tear|Regular|Free|
|far save|Regular|Free|
|far share-square|Regular|Free|
|far smile|Regular|Free|
|far smile-beam|Regular|Free|
|far smile-wink|Regular|Free|
|far snowflake|Regular|Free|
|far square|Regular|Free|
|far star|Regular|Free|
|far star-half|Regular|Free|
|far sticky-note|Regular|Free|
|far stop-circle|Regular|Free|
|far sun|Regular|Free|
|far surprise|Regular|Free|
|far thumbs-down|Regular|Free|
|far thumbs-up|Regular|Free|
|far times-circle|Regular|Free|
|far tired|Regular|Free|
|far trash-alt|Regular|Free|
|far user|Regular|Free|
|far user-circle|Regular|Free|
|far window-close|Regular|Free|
|far window-maximize|Regular|Free|
|far window-minimize|Regular|Free|
|far window-restore|Regular|Free|
|fab 500px|Brands|Free|
|fab accessible-icon|Brands|Free|
|fab accusoft|Brands|Free|
|fab acquisitions-incorporated|Brands|Free|
|fab adn|Brands|Free|
|fab adversal|Brands|Free|
|fab affiliatetheme|Brands|Free|
|fab algolia|Brands|Free|
|fab alipay|Brands|Free|
|fab amazon|Brands|Free|
|fab amazon-pay|Brands|Free|
|fab amilia|Brands|Free|
|fab android|Brands|Free|
|fab angellist|Brands|Free|
|fab angrycreative|Brands|Free|
|fab angular|Brands|Free|
|fab app-store|Brands|Free|
|fab app-store-ios|Brands|Free|
|fab apper|Brands|Free|
|fab apple|Brands|Free|
|fab apple-pay|Brands|Free|
|fab asymmetrik|Brands|Free|
|fab audible|Brands|Free|
|fab autoprefixer|Brands|Free|
|fab avianex|Brands|Free|
|fab aviato|Brands|Free|
|fab aws|Brands|Free|
|fab bandcamp|Brands|Free|
|fab behance|Brands|Free|
|fab behance-square|Brands|Free|
|fab bimobject|Brands|Free|
|fab bitbucket|Brands|Free|
|fab bitcoin|Brands|Free|
|fab bity|Brands|Free|
|fab black-tie|Brands|Free|
|fab blackberry|Brands|Free|
|fab blogger|Brands|Free|
|fab blogger-b|Brands|Free|
|fab bluetooth|Brands|Free|
|fab bluetooth-b|Brands|Free|
|fab btc|Brands|Free|
|fab buromobelexperte|Brands|Free|
|fab buysellads|Brands|Free|
|fab cc-amazon-pay|Brands|Free|
|fab cc-amex|Brands|Free|
|fab cc-apple-pay|Brands|Free|
|fab cc-diners-club|Brands|Free|
|fab cc-discover|Brands|Free|
|fab cc-jcb|Brands|Free|
|fab cc-mastercard|Brands|Free|
|fab cc-paypal|Brands|Free|
|fab cc-stripe|Brands|Free|
|fab cc-visa|Brands|Free|
|fab centercode|Brands|Free|
|fab chrome|Brands|Free|
|fab cloudscale|Brands|Free|
|fab cloudsmith|Brands|Free|
|fab cloudversify|Brands|Free|
|fab codepen|Brands|Free|
|fab codiepie|Brands|Free|
|fab connectdevelop|Brands|Free|
|fab contao|Brands|Free|
|fab cpanel|Brands|Free|
|fab creative-commons|Brands|Free|
|fab creative-commons-by|Brands|Free|
|fab creative-commons-nc|Brands|Free|
|fab creative-commons-nc-eu|Brands|Free|
|fab creative-commons-nc-jp|Brands|Free|
|fab creative-commons-nd|Brands|Free|
|fab creative-commons-pd|Brands|Free|
|fab creative-commons-pd-alt|Brands|Free|
|fab creative-commons-remix|Brands|Free|
|fab creative-commons-sa|Brands|Free|
|fab creative-commons-sampling|Brands|Free|
|fab creative-commons-sampling-plus|Brands|Free|
|fab creative-commons-share|Brands|Free|
|fab creative-commons-zero|Brands|Free|
|fab critical-role|Brands|Free|
|fab css3|Brands|Free|
|fab css3-alt|Brands|Free|
|fab cuttlefish|Brands|Free|
|fab d-and-d|Brands|Free|
|fab d-and-d-beyond|Brands|Free|
|fab dashcube|Brands|Free|
|fab delicious|Brands|Free|
|fab deploydog|Brands|Free|
|fab deskpro|Brands|Free|
|fab dev|Brands|Free|
|fab deviantart|Brands|Free|
|fab digg|Brands|Free|
|fab digital-ocean|Brands|Free|
|fab discord|Brands|Free|
|fab discourse|Brands|Free|
|fab dochub|Brands|Free|
|fab docker|Brands|Free|
|fab draft2digital|Brands|Free|
|fab dribbble|Brands|Free|
|fab dribbble-square|Brands|Free|
|fab dropbox|Brands|Free|
|fab drupal|Brands|Free|
|fab dyalog|Brands|Free|
|fab earlybirds|Brands|Free|
|fab ebay|Brands|Free|
|fab edge|Brands|Free|
|fab elementor|Brands|Free|
|fab ello|Brands|Free|
|fab ember|Brands|Free|
|fab empire|Brands|Free|
|fab envira|Brands|Free|
|fab erlang|Brands|Free|
|fab ethereum|Brands|Free|
|fab etsy|Brands|Free|
|fab expeditedssl|Brands|Free|
|fab facebook|Brands|Free|
|fab facebook-f|Brands|Free|
|fab facebook-messenger|Brands|Free|
|fab facebook-square|Brands|Free|
|fab fantasy-flight-games|Brands|Free|
|fab firefox|Brands|Free|
|fab first-order|Brands|Free|
|fab first-order-alt|Brands|Free|
|fab firstdraft|Brands|Free|
|fab flickr|Brands|Free|
|fab flipboard|Brands|Free|
|fab fly|Brands|Free|
|fab font-awesome|Brands|Free|
|fab font-awesome-alt|Brands|Free|
|fab font-awesome-flag|Brands|Free|
|fab fonticons|Brands|Free|
|fab fonticons-fi|Brands|Free|
|fab fort-awesome|Brands|Free|
|fab fort-awesome-alt|Brands|Free|
|fab forumbee|Brands|Free|
|fab foursquare|Brands|Free|
|fab free-code-camp|Brands|Free|
|fab freebsd|Brands|Free|
|fab fulcrum|Brands|Free|
|fab galactic-republic|Brands|Free|
|fab galactic-senate|Brands|Free|
|fab get-pocket|Brands|Free|
|fab gg|Brands|Free|
|fab gg-circle|Brands|Free|
|fab git|Brands|Free|
|fab git-square|Brands|Free|
|fab github|Brands|Free|
|fab github-alt|Brands|Free|
|fab github-square|Brands|Free|
|fab gitkraken|Brands|Free|
|fab gitlab|Brands|Free|
|fab gitter|Brands|Free|
|fab glide|Brands|Free|
|fab glide-g|Brands|Free|
|fab gofore|Brands|Free|
|fab goodreads|Brands|Free|
|fab goodreads-g|Brands|Free|
|fab google|Brands|Free|
|fab google-drive|Brands|Free|
|fab google-play|Brands|Free|
|fab google-plus|Brands|Free|
|fab google-plus-g|Brands|Free|
|fab google-plus-square|Brands|Free|
|fab google-wallet|Brands|Free|
|fab gratipay|Brands|Free|
|fab grav|Brands|Free|
|fab gripfire|Brands|Free|
|fab grunt|Brands|Free|
|fab gulp|Brands|Free|
|fab hacker-news|Brands|Free|
|fab hacker-news-square|Brands|Free|
|fab hackerrank|Brands|Free|
|fab hips|Brands|Free|
|fab hire-a-helper|Brands|Free|
|fab hooli|Brands|Free|
|fab hornbill|Brands|Free|
|fab hotjar|Brands|Free|
|fab houzz|Brands|Free|
|fab html5|Brands|Free|
|fab hubspot|Brands|Free|
|fab imdb|Brands|Free|
|fab instagram|Brands|Free|
|fab internet-explorer|Brands|Free|
|fab ioxhost|Brands|Free|
|fab itunes|Brands|Free|
|fab itunes-note|Brands|Free|
|fab java|Brands|Free|
|fab jedi-order|Brands|Free|
|fab jenkins|Brands|Free|
|fab joget|Brands|Free|
|fab joomla|Brands|Free|
|fab js|Brands|Free|
|fab js-square|Brands|Free|
|fab jsfiddle|Brands|Free|
|fab kaggle|Brands|Free|
|fab keybase|Brands|Free|
|fab keycdn|Brands|Free|
|fab kickstarter|Brands|Free|
|fab kickstarter-k|Brands|Free|
|fab korvue|Brands|Free|
|fab laravel|Brands|Free|
|fab lastfm|Brands|Free|
|fab lastfm-square|Brands|Free|
|fab leanpub|Brands|Free|
|fab less|Brands|Free|
|fab line|Brands|Free|
|fab linkedin|Brands|Free|
|fab linkedin-in|Brands|Free|
|fab linode|Brands|Free|
|fab linux|Brands|Free|
|fab lyft|Brands|Free|
|fab magento|Brands|Free|
|fab mailchimp|Brands|Free|
|fab mandalorian|Brands|Free|
|fab markdown|Brands|Free|
|fab mastodon|Brands|Free|
|fab maxcdn|Brands|Free|
|fab medapps|Brands|Free|
|fab medium|Brands|Free|
|fab medium-m|Brands|Free|
|fab medrt|Brands|Free|
|fab meetup|Brands|Free|
|fab megaport|Brands|Free|
|fab microsoft|Brands|Free|
|fab mix|Brands|Free|
|fab mixcloud|Brands|Free|
|fab mizuni|Brands|Free|
|fab modx|Brands|Free|
|fab monero|Brands|Free|
|fab napster|Brands|Free|
|fab neos|Brands|Free|
|fab nimblr|Brands|Free|
|fab nintendo-switch|Brands|Free|
|fab node|Brands|Free|
|fab node-js|Brands|Free|
|fab npm|Brands|Free|
|fab ns8|Brands|Free|
|fab nutritionix|Brands|Free|
|fab odnoklassniki|Brands|Free|
|fab odnoklassniki-square|Brands|Free|
|fab old-republic|Brands|Free|
|fab opencart|Brands|Free|
|fab openid|Brands|Free|
|fab opera|Brands|Free|
|fab optin-monster|Brands|Free|
|fab osi|Brands|Free|
|fab page4|Brands|Free|
|fab pagelines|Brands|Free|
|fab palfed|Brands|Free|
|fab patreon|Brands|Free|
|fab paypal|Brands|Free|
|fab penny-arcade|Brands|Free|
|fab periscope|Brands|Free|
|fab phabricator|Brands|Free|
|fab phoenix-framework|Brands|Free|
|fab phoenix-squadron|Brands|Free|
|fab php|Brands|Free|
|fab pied-piper|Brands|Free|
|fab pied-piper-alt|Brands|Free|
|fab pied-piper-hat|Brands|Free|
|fab pied-piper-pp|Brands|Free|
|fab pinterest|Brands|Free|
|fab pinterest-p|Brands|Free|
|fab pinterest-square|Brands|Free|
|fab playstation|Brands|Free|
|fab product-hunt|Brands|Free|
|fab pushed|Brands|Free|
|fab python|Brands|Free|
|fab qq|Brands|Free|
|fab quinscape|Brands|Free|
|fab quora|Brands|Free|
|fab r-project|Brands|Free|
|fab ravelry|Brands|Free|
|fab react|Brands|Free|
|fab reacteurope|Brands|Free|
|fab readme|Brands|Free|
|fab rebel|Brands|Free|
|fab red-river|Brands|Free|
|fab reddit|Brands|Free|
|fab reddit-alien|Brands|Free|
|fab reddit-square|Brands|Free|
|fab renren|Brands|Free|
|fab replyd|Brands|Free|
|fab researchgate|Brands|Free|
|fab resolving|Brands|Free|
|fab rev|Brands|Free|
|fab rocketchat|Brands|Free|
|fab rockrms|Brands|Free|
|fab safari|Brands|Free|
|fab sass|Brands|Free|
|fab schlix|Brands|Free|
|fab scribd|Brands|Free|
|fab searchengin|Brands|Free|
|fab sellcast|Brands|Free|
|fab sellsy|Brands|Free|
|fab servicestack|Brands|Free|
|fab shirtsinbulk|Brands|Free|
|fab shopware|Brands|Free|
|fab simplybuilt|Brands|Free|
|fab sistrix|Brands|Free|
|fab sith|Brands|Free|
|fab skyatlas|Brands|Free|
|fab skype|Brands|Free|
|fab slack|Brands|Free|
|fab slack-hash|Brands|Free|
|fab slideshare|Brands|Free|
|fab snapchat|Brands|Free|
|fab snapchat-ghost|Brands|Free|
|fab snapchat-square|Brands|Free|
|fab soundcloud|Brands|Free|
|fab speakap|Brands|Free|
|fab spotify|Brands|Free|
|fab squarespace|Brands|Free|
|fab stack-exchange|Brands|Free|
|fab stack-overflow|Brands|Free|
|fab staylinked|Brands|Free|
|fab steam|Brands|Free|
|fab steam-square|Brands|Free|
|fab steam-symbol|Brands|Free|
|fab sticker-mule|Brands|Free|
|fab strava|Brands|Free|
|fab stripe|Brands|Free|
|fab stripe-s|Brands|Free|
|fab studiovinari|Brands|Free|
|fab stumbleupon|Brands|Free|
|fab stumbleupon-circle|Brands|Free|
|fab superpowers|Brands|Free|
|fab supple|Brands|Free|
|fab teamspeak|Brands|Free|
|fab telegram|Brands|Free|
|fab telegram-plane|Brands|Free|
|fab tencent-weibo|Brands|Free|
|fab the-red-yeti|Brands|Free|
|fab themeco|Brands|Free|
|fab themeisle|Brands|Free|
|fab think-peaks|Brands|Free|
|fab trade-federation|Brands|Free|
|fab trello|Brands|Free|
|fab tripadvisor|Brands|Free|
|fab tumblr|Brands|Free|
|fab tumblr-square|Brands|Free|
|fab twitch|Brands|Free|
|fab twitter|Brands|Free|
|fab twitter-square|Brands|Free|
|fab typo3|Brands|Free|
|fab uber|Brands|Free|
|fab uikit|Brands|Free|
|fab uniregistry|Brands|Free|
|fab untappd|Brands|Free|
|fab usb|Brands|Free|
|fab ussunnah|Brands|Free|
|fab vaadin|Brands|Free|
|fab viacoin|Brands|Free|
|fab viadeo|Brands|Free|
|fab viadeo-square|Brands|Free|
|fab viber|Brands|Free|
|fab vimeo|Brands|Free|
|fab vimeo-square|Brands|Free|
|fab vimeo-v|Brands|Free|
|fab vine|Brands|Free|
|fab vk|Brands|Free|
|fab vnv|Brands|Free|
|fab vuejs|Brands|Free|
|fab weebly|Brands|Free|
|fab weibo|Brands|Free|
|fab weixin|Brands|Free|
|fab whatsapp|Brands|Free|
|fab whatsapp-square|Brands|Free|
|fab whmcs|Brands|Free|
|fab wikipedia-w|Brands|Free|
|fab windows|Brands|Free|
|fab wix|Brands|Free|
|fab wizards-of-the-coast|Brands|Free|
|fab wolf-pack-battalion|Brands|Free|
|fab wordpress|Brands|Free|
|fab wordpress-simple|Brands|Free|
|fab wpbeginner|Brands|Free|
|fab wpexplorer|Brands|Free|
|fab wpforms|Brands|Free|
|fab wpressr|Brands|Free|
|fab xbox|Brands|Free|
|fab xing|Brands|Free|
|fab xing-square|Brands|Free|
|fab y-combinator|Brands|Free|
|fab yahoo|Brands|Free|
|fab yandex|Brands|Free|
|fab yandex-international|Brands|Free|
|fab yelp|Brands|Free|
|fab yoast|Brands|Free|
|fab youtube|Brands|Free|
|fab youtube-square|Brands|Free|
|fab zhihu|Brands|Free|


## License

Bootstrap 4 & Font Awesome 5 - IntelliJ Plugin is open-sourced software licensed under the [MIT license](http://opensource.org/licenses/MIT).

## Disclaimer:

Readme template for this plugin was initially borrowed from [here](https://github.com/bodiam/intellij-bootstrap3) & [here](https://github.com/JasonMortonNZ/bs3-sublime-plugin)
