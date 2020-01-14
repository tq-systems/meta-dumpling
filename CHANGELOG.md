# Changelog

All notable changes to this project will be documented in this file.
Releases are named with thefollowing scheme:

`<Yocto Project version name>.<TQ module family>.BSP.SW.<version number>`

## sumo.TQMa8.BSP.SW.0016

* no changes

## sumo.TQMa8.BSP.SW.0015

* no changes

## sumo.TQMa8.BSP.SW.0014

* no changes

## sumo.TQMa8.BSP.SW.0013

### Added

* add Changelog file

### Changed

* README: update and reformat


## sumo.TQMa8.BSP.SW.0012

### Removed

* vulkan: bbappend not longer needed

## sumo.TQMa8.BSP.SW.0010

### Added

* packagegroup-testutils: add performance analyzing tools
* libx11-compose-data: add recipe

### Changed

* README: updates
* busybox: improve config

### Fixes

* clean usage of image features and comments for security
* libxkbcommon: RDEPENDS on libx11-locale

## sumo.TQMa8.BSP.SW.0009

## sumo.TQMa8.BSP.SW.0008

### Fixed

* tq-image-generic: add missing packagegroup-base
* tq-image-generic: append IMAGE_LINGUAS instead of hard setting

## sumo.TQMa8.BSP.SW.0007

### Changed

* packagegroup-hwutil: let pciutils depend on MACHINE_FEATURE pci
* tq-image-generic: use new packagegroup-systemd
* images: use new packagegroup-audio
* dynamic-layers: tq-image-qt5: use new systemd package group

### Added

* images: add new can packagegroup if can is in machine features
* packagegroup: define new can packagegroup using some tools useful for can
* add new packagegroup for basic audio support

### Fixed

* busybox: add missing dd 3rd status line config

## Older releases
