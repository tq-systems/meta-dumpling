require recipes-images/images/tq-image-weston.bb

SUMMARY =  "This is a weston image for TQ SOM with some test / debug features \
and basic Qt5 support"

IMAGE_INSTALL_append = " \
    packagegroup-qt5-imx \
    "
