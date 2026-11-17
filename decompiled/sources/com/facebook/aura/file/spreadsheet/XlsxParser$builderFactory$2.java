package com.facebook.aura.file.spreadsheet;

import X.AbstractC7559F3s;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class XlsxParser$builderFactory$2 extends AbstractC7559F3s implements Function0<DocumentBuilderFactory> {
    public static final XlsxParser$builderFactory$2 INSTANCE = new XlsxParser$builderFactory$2();

    public XlsxParser$builderFactory$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final DocumentBuilderFactory invoke() throws ParserConfigurationException {
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        documentBuilderFactoryNewInstance.setNamespaceAware(true);
        try {
            documentBuilderFactoryNewInstance.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        } catch (Exception unused) {
        }
        try {
            documentBuilderFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
        } catch (Exception unused2) {
        }
        try {
            documentBuilderFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
        } catch (Exception unused3) {
        }
        try {
            documentBuilderFactoryNewInstance.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
        } catch (Exception unused4) {
        }
        return documentBuilderFactoryNewInstance;
    }
}
