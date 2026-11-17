package com.facebook.aura.file.docx;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C7384Etj;
import X.C9tJ;
import X.G0U;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import kotlin.Unit;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: classes6.dex */
public final class XmlHelpers {
    public static final XmlHelpers INSTANCE = new XmlHelpers();

    public final boolean containsDescendant(Node node, String str) {
        boolean zA1a = AnonymousClass002.A1a(node, str);
        if (findDescendant(node, str) != null) {
            return zA1a;
        }
        return false;
    }

    public final boolean hasBoolChild(Node node, String str, String str2) {
        NamedNodeMap attributes;
        Node namedItemNS;
        String nodeValue;
        boolean zA1Z = AnonymousClass005.A1Z(node, str, str2);
        Node nodeFindChild = findChild(node, str2);
        if (nodeFindChild == null || !((attributes = nodeFindChild.getAttributes()) == null || (namedItemNS = attributes.getNamedItemNS(str, "val")) == null || (nodeValue = namedItemNS.getNodeValue()) == null || (!nodeValue.equals("false") && !nodeValue.equals(HatchPriceImpressionEventDataKt.NO_DISCOUNT)))) {
            return false;
        }
        return zA1Z;
    }

    public final boolean hasNonNoneChild(Node node, String str, String str2) {
        Node namedItemNS;
        AnonymousClass005.A10(node, str, str2);
        Node nodeFindChild = findChild(node, str2);
        if (nodeFindChild == null) {
            return false;
        }
        NamedNodeMap attributes = nodeFindChild.getAttributes();
        return !"none".equals((attributes == null || (namedItemNS = attributes.getNamedItemNS(str, "val")) == null) ? null : namedItemNS.getNodeValue());
    }

    public final String attr(Node node, String str) {
        Node namedItem;
        AnonymousClass003.A0u(node, str);
        NamedNodeMap attributes = node.getAttributes();
        if (attributes == null || (namedItem = attributes.getNamedItem(str)) == null) {
            return null;
        }
        return namedItem.getNodeValue();
    }

    public final String attrNS(Node node, String str, String str2) {
        Node namedItemNS;
        AnonymousClass005.A0x(node, str, str2);
        NamedNodeMap attributes = node.getAttributes();
        if (attributes == null || (namedItemNS = attributes.getNamedItemNS(str, str2)) == null) {
            return null;
        }
        return namedItemNS.getNodeValue();
    }

    public final Float childValFloat(Node node, String str, String str2) {
        NamedNodeMap attributes;
        Node namedItemNS;
        String nodeValue;
        AnonymousClass005.A0x(node, str, str2);
        Node nodeFindChild = findChild(node, str2);
        if (nodeFindChild == null || (attributes = nodeFindChild.getAttributes()) == null || (namedItemNS = attributes.getNamedItemNS(str, "val")) == null || (nodeValue = namedItemNS.getNodeValue()) == null) {
            return null;
        }
        return C9tJ.A0w(nodeValue);
    }

    public final Node findChild(Node node, String str) {
        AnonymousClass003.A0u(node, str);
        NodeList childNodes = node.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node nodeItem = childNodes.item(i);
            if (str.equals(nodeItem.getLocalName())) {
                return nodeItem;
            }
        }
        return null;
    }

    public final Node findChildNS(Node node, String str, String str2) {
        AnonymousClass005.A0x(node, str, str2);
        NodeList childNodes = node.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node nodeItem = childNodes.item(i);
            if (str2.equals(nodeItem.getLocalName()) && str.equals(nodeItem.getNamespaceURI())) {
                return nodeItem;
            }
        }
        return null;
    }

    public final Node findDescendant(Node node, String str) {
        AnonymousClass003.A0u(node, str);
        NodeList childNodes = node.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node nodeItem = childNodes.item(i);
            if (str.equals(nodeItem.getLocalName())) {
                return nodeItem;
            }
            Node nodeFindDescendant = findDescendant(nodeItem, str);
            if (nodeFindDescendant != null) {
                return nodeFindDescendant;
            }
        }
        return null;
    }

    public final void forEachChild(Node node, G0U<? super Node, Unit> g0u) {
        AnonymousClass003.A0u(node, g0u);
        NodeList childNodes = node.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node nodeItem = childNodes.item(i);
            C7384Etj.A0U(nodeItem);
            g0u.invoke(nodeItem);
        }
    }

    public final void forEachChildWhile(Node node, G0U<? super Node, Boolean> g0u) {
        AnonymousClass003.A0u(node, g0u);
        NodeList childNodes = node.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node nodeItem = childNodes.item(i);
            C7384Etj.A0U(nodeItem);
            if (!AnonymousClass003.A1X(nodeItem, g0u)) {
                return;
            }
        }
    }

    public final void forEachChild(Node node, String str, G0U<? super Node, Unit> g0u) {
        AnonymousClass005.A0x(node, str, g0u);
        NodeList childNodes = node.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node nodeItem = childNodes.item(i);
            if (str.equals(nodeItem.getLocalName())) {
                g0u.invoke(nodeItem);
            }
        }
    }

    public final void forEachChildWhile(Node node, String str, G0U<? super Node, Boolean> g0u) {
        AnonymousClass005.A0x(node, str, g0u);
        NodeList childNodes = node.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node nodeItem = childNodes.item(i);
            if (str.equals(nodeItem.getLocalName()) && !AnonymousClass003.A1X(nodeItem, g0u)) {
                return;
            }
        }
    }
}
