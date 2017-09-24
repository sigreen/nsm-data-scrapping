<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output omit-xml-declaration="yes" indent="yes" method="xml" />
	<xsl:param name="breadcrumbId" />
	<xsl:param name="CamelFileRelativePath" />
	<xsl:template match="@*|node()">
		<xsl:copy>
			<xsl:apply-templates select="@*|node()" />
		</xsl:copy>
	</xsl:template>
	<xsl:template match="Policy">
		<Policy>
			<Batch_ID>
				<xsl:value-of select="$breadcrumbId" />
			</Batch_ID>
			<File_ID>
				<xsl:value-of select="$CamelFileRelativePath" />
			</File_ID>
			<Valid>true</Valid>
			<xsl:apply-templates select="@* | *" />
		</Policy>
	</xsl:template>
</xsl:stylesheet>
