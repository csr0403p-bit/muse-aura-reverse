package X;

import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.GEi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9327GEi {
    public static final char[] A00;

    static {
        char[] cArr = new char[80];
        A00 = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void A00(AnonymousClass777 messageLite, StringBuilder buffer, int indent) throws SecurityException {
        boolean zEquals;
        int iA0F;
        Object obj;
        Method method;
        int length;
        HashSet hashSetA13 = C60O.A13();
        HashMap mapA0u = BV4.A0u();
        TreeMap treeMap = new TreeMap();
        for (Method method2 : messageLite.getClass().getDeclaredMethods()) {
            if (!AbstractC7609F5w.A1Y(method2) && method2.getName().length() >= 3) {
                if (method2.getName().startsWith("set")) {
                    hashSetA13.add(method2.getName());
                } else {
                    AbstractC7611F5y.A0z(method2, mapA0u, treeMap);
                }
            }
        }
        Iterator itA0i = C3cG.A0i(treeMap);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            String strSubstring = C60O.A0t(entryA0l).substring(3);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method = (Method) entryA0l.getValue()) != null && method.getReturnType().equals(List.class)) {
                length = strSubstring.length() - 4;
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entryA0l.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                length = strSubstring.length() - 3;
            } else if (hashSetA13.contains(FGI.A0M("set", strSubstring)) && (!strSubstring.endsWith("Bytes") || !FGI.A0z(strSubstring, treeMap))) {
                Method method3 = (Method) entryA0l.getValue();
                Method method4 = (Method) mapA0u.get(FGI.A0M("has", strSubstring));
                if (method3 != null) {
                    Object objA01 = GF0.A01(messageLite, method3, new Object[0]);
                    if (method4 == null) {
                        if (objA01 instanceof Boolean) {
                            zEquals = !AnonymousClass001.A1X(objA01);
                        } else {
                            if (objA01 instanceof Integer) {
                                iA0F = AnonymousClass001.A0F(objA01);
                            } else if (objA01 instanceof Float) {
                                iA0F = Float.floatToRawIntBits(AnonymousClass001.A02(objA01));
                            } else if (objA01 instanceof Double) {
                                iA0F = (Double.doubleToRawLongBits(BV6.A00(objA01)) > 0L ? 1 : (Double.doubleToRawLongBits(BV6.A00(objA01)) == 0L ? 0 : -1));
                            } else {
                                if (objA01 instanceof String) {
                                    obj = "";
                                } else if (objA01 instanceof AbstractC9320GEb) {
                                    obj = AbstractC9320GEb.A00;
                                } else {
                                    if (objA01 instanceof AnonymousClass777) {
                                        if (objA01 == ((GF0) ((C77F) objA01)).A05(C79.A0T)) {
                                        }
                                    } else if (objA01 instanceof Enum) {
                                        iA0F = ((Enum) objA01).ordinal();
                                    }
                                    A01(objA01, strSubstring, buffer, indent);
                                }
                                zEquals = objA01.equals(obj);
                            }
                            if (iA0F != 0) {
                                A01(objA01, strSubstring, buffer, indent);
                            }
                        }
                        if (!zEquals) {
                            A01(objA01, strSubstring, buffer, indent);
                        }
                    } else if (AnonymousClass001.A1X(GF0.A01(messageLite, method4, new Object[0]))) {
                        A01(objA01, strSubstring, buffer, indent);
                    }
                }
            }
            A01(GF0.A01(messageLite, method, new Object[0]), strSubstring.substring(0, length), buffer, indent);
        }
        GG7 gg7 = ((GF0) messageLite).unknownFields;
        if (gg7 != null) {
            for (int i = 0; i < gg7.A00; i++) {
                A01(gg7.A04[i], String.valueOf(gg7.A03[i] >>> 3), buffer, indent);
            }
        }
    }

    public static void A01(Object buffer, String indent, StringBuilder name, int object) throws SecurityException {
        String strA00;
        if (buffer instanceof List) {
            Iterator itA13 = AbstractC7607F5u.A13(buffer);
            while (itA13.hasNext()) {
                A01(itA13.next(), indent, name, object);
            }
            return;
        }
        if (buffer instanceof Map) {
            Iterator itA0n = AnonymousClass002.A0n((Map) buffer);
            while (itA0n.hasNext()) {
                A01(itA0n.next(), indent, name, object);
            }
            return;
        }
        name.append('\n');
        int i = object;
        while (i > 0) {
            char[] cArr = A00;
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            name.append(cArr, 0, i2);
            i -= i2;
        }
        if (!indent.isEmpty()) {
            StringBuilder sbA0w = C60O.A0w();
            AbstractC7608F5v.A1M(sbA0w, AbstractC7607F5u.A00(indent));
            for (int i3 = 1; i3 < indent.length(); i3++) {
                AbstractC7608F5v.A1M(sbA0w, AbstractC7610F5x.A00(indent, sbA0w, i3));
            }
            indent = sbA0w.toString();
        }
        name.append(indent);
        if (buffer instanceof String) {
            name.append(": \"");
            AbstractC9320GEb abstractC9320GEb = AbstractC9320GEb.A00;
            strA00 = HkV.A00(new C9322GEd(((String) buffer).getBytes(AbstractC9351GFk.A04)));
        } else {
            if (!(buffer instanceof AbstractC9320GEb)) {
                if (buffer instanceof GF0) {
                    name.append(" {");
                    A00((GF1) buffer, name, object + 2);
                } else if (!(buffer instanceof Map.Entry)) {
                    name.append(": ");
                    name.append(buffer);
                    return;
                } else {
                    name.append(" {");
                    Map.Entry entry = (Map.Entry) buffer;
                    int i4 = object + 2;
                    A01(entry.getKey(), "key", name, i4);
                    A01(entry.getValue(), BrowserOperationCatalogKt.VALUE, name, i4);
                }
                name.append(PairsDiscretionDocument.TERMINATOR);
                while (object > 0) {
                    char[] cArr2 = A00;
                    int i5 = 80;
                    if (object <= 80) {
                        i5 = object;
                    }
                    name.append(cArr2, 0, i5);
                    object -= i5;
                }
                name.append("}");
                return;
            }
            name.append(": \"");
            strA00 = HkV.A00((AbstractC9320GEb) buffer);
        }
        name.append(strA00);
        name.append('\"');
    }
}
