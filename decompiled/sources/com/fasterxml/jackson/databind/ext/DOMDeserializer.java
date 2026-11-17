package com.fasterxml.jackson.databind.ext;

import X.BV4;
import X.BV5;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

/* loaded from: classes6.dex */
public abstract class DOMDeserializer<T> extends FromStringDeserializer<T> {
    public static final DocumentBuilderFactory A00;
    public static final long serialVersionUID = 1;

    public class DocumentDeserializer extends DOMDeserializer<Document> {
        public static final long serialVersionUID = 1;

        public DocumentDeserializer() {
            super(Document.class);
        }
    }

    public class NodeDeserializer extends DOMDeserializer<Node> {
        public static final long serialVersionUID = 1;

        public NodeDeserializer() {
            super(Node.class);
        }
    }

    public final Document A1N(String str) {
        try {
            return A00.newDocumentBuilder().parse(new InputSource(new StringReader(str)));
        } catch (Exception e) {
            throw BV4.A0Q(BV5.A0n("Failed to parse JSON String as XML: ", e), e);
        }
    }

    static {
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        documentBuilderFactoryNewInstance.setNamespaceAware(true);
        documentBuilderFactoryNewInstance.setExpandEntityReferences(false);
        try {
            documentBuilderFactoryNewInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
        } catch (ParserConfigurationException unused) {
        }
        try {
            documentBuilderFactoryNewInstance.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        } catch (Exception unused2) {
        }
        try {
            documentBuilderFactoryNewInstance.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
        } catch (Exception unused3) {
        }
        A00 = documentBuilderFactoryNewInstance;
    }
}
