# Changelog

All notable changes to this project will be documented in this file.
Releases are named with the following scheme:

`<Yocto Project version name>.<TQ module family>.BSP.SW.<version number>`

## zeus.TQMa8.BSP.SW.0032

### Changed

* doc: README.md: correct the spelling of TQ-Systems

## zeus.TQMa8.BSP.SW.0030

### Changed

* packagegroup-hwutils: add usb tools in dynamic-layers/openembedded-layer
* packagegroup-testutils: add alsa-utils-speakertest
* packagegroup-hwutils: set PACKAGE\_ARCH to MACHINE\_ARCH since we add packages
  depending on MACHINE\_FEATURES
* packagegroup-testutils: add more deps depending on openembedded-layer to have
  some more tools for testing
* images: add a qt5 enabled image
* packagegroup-sysutils: enable u-boot-fw-utils
* busybox: remove superseeded config fragment
* gstreamer1.0-plugins-bad: bbappend for meta-freesacale to disable opencv in
  PACKAGECONFIG to reduce image size and build time
* tq-image-weston: add gstreamer packages
* packagegroup-fsutils: add mtd-utils-{jffs2,ubifs,misc} for QSPI testing

## zeus.TQMa8.BSP.SW.0025

### Changed

* images: add tq-image-weston based on core-image-weston
* images: simplify recipes, use a shared include
* packagegroup-testutils: remove perf to prevenmt build break
* perf: disable scripting
* switch to zeus
* synchronize branch `warrior-tqma8` with generic branch

## warrior.MBa6ULxL.BSP.SW.0101

### Added

* add a Changelog

### Changed

* doc: README as Markdown
* doc: improve README

### Removed

* perf: remove bbappend needed for linux 4.1.x

## warrior.TQMa6ULx.BSP.SW.0107 / warrior.TQMa7x.BSP.SW.0108 /
   warrior.TQMLS102xA.BSP.SW.0111 / arrior.TQMLS102xA.BSP.SW.0112

### Fixed

* tq-image-generic: add missing packagegroup-base
* tq-image-generic: append IMAGE_LINGUAS instead of hard setting
* bbappend fsl-image-multimedia-full from meta-freesacale-distro

### Changed

*  tq-image-generic: use new packagegroup-systemd

### Added

* add packagegroup for systemd relevant packages

## warrior.TQMLS1046A.BSP.SW.0003

### Changed

* layer.conf: mark compatibility for warrior
* packagegroup-hwutils: add spitools package
* tq-image-generic: force openssh instead of dropbear
* packagegroup-hwutil: let pciutils depend on MACHINE_FEATURE pci
* packagegroup-hwutils: add can-utils if openembedded-layer is present
* images: use new packagegroup-audio
* images: add new can packagegroup if can is in machine features

### Added

* layers.conf: prepare dynamic layers
* add new packagegroup for packages needed for can support
* add new packagegroup for basic audio support

### Fixed

* busybox: add missing dd 3rd status line config
* packagegroup-fsl-gstreamer1.0: fix upstream sumo gstreamer change

## Older releases
