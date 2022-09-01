FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://wayland_display.sh"

do_install_append() {
    install -Dm0755 ${WORKDIR}/wayland_display.sh ${D}${sysconfdir}/profile.d/wayland_display.sh
}

FILES_${PN} += "\
    ${sysconfdir}/profile.d/wayland_display.sh \
"
