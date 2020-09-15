# for now: use poky weston image as a base
require recipes-graphics/images/core-image-weston.bb

SUMMARY =  "This is a weston image for TQ SOM with some test / debug features."

DESCRIPTION = "Demo image based on core-image-weston and essential packages \
for the machine. This creates a large image and includes also debug tools, not \
directly suitable for production - also from the aspect of security."

# add our default stuff
require tq-image.inc


# Defined by imx-base for i.MX MACHINEs
MACHINE_GSTREAMER_1_0_PLUGIN ??= ""


IMAGE_FEATURES_remove = " package-management"

IMAGE_INSTALL_append               = " gstreamer1.0-plugins-base-meta"
IMAGE_INSTALL_append               = " gstreamer1.0-plugins-good-meta"
IMAGE_INSTALL_append               = " gstreamer1.0-plugins-bad-meta"
IMAGE_INSTALL_append               = " ${MACHINE_GSTREAMER_1_0_PLUGIN}"

IMAGE_INSTALL_append               = " weston-examples"
IMAGE_INSTALL_append_imxgpu3d      = " glmark2"
IMAGE_INSTALL_append_imxdrm        = " kmscube"
