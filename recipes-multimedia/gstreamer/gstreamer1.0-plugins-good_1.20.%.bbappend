FILESEXTRAPATHS:prepend := "${THISDIR}/gstreamer1.0-plugins-good-1.20:"

# NOTE: '+=' does not work here; a bbappend in meta-imx overrides SRC_URI
SRC_URI:append = "\
    file://gstreamer1.0-plugins-good_bayer.patch \
"
