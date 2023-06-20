require rzg2-image-weston.bb
require tq-image-debug.inc

SUMMARY = "A very basic Wayland image with a terminal and debug features"

DESCRIPTION = "Demo image based on rzg2-image-weston and selection of packages \
and IMAGE_FEATURES usually needed for development, debugging and testing. \
This creates a large sized image, that must not be used for production - \
especially from the aspect of security."
