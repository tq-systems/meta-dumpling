#
# From core-image-weston.bb (poky)
#

SUMMARY = "A very basic Wayland image with a terminal"

# not like poky: don't enable package management and use openssh ssh-server 
IMAGE_FEATURES += "splash ssh-server-openssh hwcodecs"

LICENSE = "MIT"

inherit core-image features_check

REQUIRED_DISTRO_FEATURES = "wayland"

CORE_IMAGE_BASE_INSTALL += "weston weston-init weston-examples gtk+3-demo clutter-1.0-examples"

#
# From core-image-weston.bbappend (meta-renesas)
#

require include/core-image-renesas-base.inc
require include/core-image-renesas-mmp.inc
require include/core-image-bsp.inc

#
# Custom description
#

DESCRIPTION = "Demo image based on core-image-weston and RZG2 specific \
packages. This creates a large image and includes also test tools, not \
directly suitable for production - also from the aspect of security."
