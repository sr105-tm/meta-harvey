DESCRIPTION = "Simple helloworld application"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/yoctocookbook2ndedition/helloworld.git;protocol=https"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "34d80d900550333d23c1b9193d6569298fb0e968"

S = "${WORKDIR}/git"

# do_configure () {
# 	# Specify any needed configure commands here
# 	:
# }

do_compile () {
	# You will almost certainly need to add additional arguments here
	oe_runmake
}

do_install () {
	# NOTE: unable to determine what to put here - there is a Makefile but no
  # target named "install", so you will need to define this yourself
  install -d ${D}${bindir}
  install -m 0755 helloworld ${D}${bindir}
}
