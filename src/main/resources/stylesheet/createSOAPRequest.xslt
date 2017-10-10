<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output omit-xml-declaration="yes" indent="yes" />
	<xsl:strip-space elements="*" />

	<xsl:template match="*">
		<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
			<soap:Body>
				<ns2:putXml xmlns:ns2="http://www.example.org/Test/">
					<payload>
						<xsl:copy-of select="/*" />
					</payload>
				</ns2:putXml>
			</soap:Body>
		</soap:Envelope>

	</xsl:template>
</xsl:stylesheet>