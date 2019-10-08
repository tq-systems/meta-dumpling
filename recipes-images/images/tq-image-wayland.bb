require recipes-images/images/tq-image-generic.bb

SUMMARY =  "This is an demo image for TQ SOM with wayland."

DESCRIPTION = "Demo image based on core-image-minimal, tq-image-generic \
and wayland / multimedia packages for the machine. This creates a large image \
and includes also debug tools, not directly suitable for production - \
also from the aspect of security."

LICENSE = "MIT"

IMAGE_INSTALL += "\
  wayland \
  wayland-protocols \
  weston \
  weston-init \
  weston-examples \
  \
  gstreamer1.0 \
  gstreamer1.0-meta-base \
  gstreamer1.0-plugins-good \
"
