<%@ taglib prefix="dsp"
	uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<dsp:page>
	<dsp:importbean bean="/com/sample/droplet/MyAccountDroplet" />
	<dsp:droplet name="MyAccountDroplet">
		<dsp:param name="name" value="Pallavi" />
		<dsp:param name="age" value="27" />
		<dsp:param name="role" value="NEWUSER" />
	</dsp:droplet>
</dsp:page>