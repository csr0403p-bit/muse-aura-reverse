package com.fasterxml.jackson.databind.ext;

import X.BV5;
import X.FGI;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import org.w3c.dom.Node;

/* loaded from: classes6.dex */
public class DOMSerializer extends StdSerializer<Node> {
    public final TransformerFactory transformerFactory;

    public DOMSerializer() throws TransformerConfigurationException, TransformerFactoryConfigurationError {
        super(Node.class);
        try {
            TransformerFactory transformerFactoryNewInstance = TransformerFactory.newInstance();
            this.transformerFactory = transformerFactoryNewInstance;
            transformerFactoryNewInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
            try {
                transformerFactoryNewInstance.setAttribute("http://javax.xml.XMLConstants/property/accessExternalDTD", "");
            } catch (Exception unused) {
                System.err.println(FGI.A0M("[DOMSerializer] Failed to set TransformerFactory attribute: ", "http://javax.xml.XMLConstants/property/accessExternalDTD"));
            }
            try {
                transformerFactoryNewInstance.setAttribute("http://javax.xml.XMLConstants/property/accessExternalStylesheet", "");
            } catch (Exception unused2) {
                System.err.println(FGI.A0M("[DOMSerializer] Failed to set TransformerFactory attribute: ", "http://javax.xml.XMLConstants/property/accessExternalStylesheet"));
            }
        } catch (Exception e) {
            throw new IllegalStateException(BV5.A0n("Could not instantiate `TransformerFactory`: ", e), e);
        }
    }
}
