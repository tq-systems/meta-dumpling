SRCREV = "9f63f359fab1b5d8e862508e4e51c9dfe339ccb0"
SRC_URI = "git://gitlab.freedesktop.org/mesa/kmscube;branch=master;protocol=https"

inherit meson pkgconfig features_check

REQUIRED_DISTRO_FEATURES = "opengl"

