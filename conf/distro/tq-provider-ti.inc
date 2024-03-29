PREFERRED_PROVIDER_virtual/kernel_tqma335x = "linux-ti-tq"
PREFERRED_PROVIDER_virtual/kernel_tqma57xx = "linux-ti-tq"

# Add MLO SD/e-MMC image generation for SOM based on TI SOC
# This image is a stripped down version of the normal .wic, consisting only of
# partition table, boot VFAT and environment for bootloader.

IMAGE_CLASSES += "image_type_bootonly"
IMAGE_FSTYPES += "wic.bootonly"
