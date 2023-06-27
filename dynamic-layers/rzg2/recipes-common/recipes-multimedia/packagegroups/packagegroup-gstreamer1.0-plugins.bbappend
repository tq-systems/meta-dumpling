# Remove all gstreamer plugins/extensions with commercial license

DEPENDS_remove_dumpling-wayland-rzg2 = " \
    gstreamer1.0-plugins-ugly \
"

RDEPENDS_packagegroup-gstreamer1.0-plugins-video_remove_dumpling-wayland-rzg2 = " \
    gstreamer1.0-plugins-ugly-asf \
    gstreamer1.0-libav \
"

RDEPENDS_packagegroup-gstreamer1.0-plugins-bad_remove_dumpling-wayland-rzg2 = " \
    gstreamer1.0-plugins-bad-faac \
    gstreamer1.0-plugins-bad-faad \
"
