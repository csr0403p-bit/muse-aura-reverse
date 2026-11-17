package X;

import com.facebook.aura.commands.photos.DeviceMediaStoreReaderKt;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes6.dex */
public abstract class GEm {
    public static final char[] A00;

    static {
        char[] cArr = new char[80];
        A00 = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void A01(Object obj, String str, StringBuilder sb, int i) {
        boolean z;
        byte[] bytes;
        String strA00;
        if (obj instanceof List) {
            Iterator itA13 = AbstractC7607F5u.A13(obj);
            while (itA13.hasNext()) {
                A01(itA13.next(), str, sb, i);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator itA0n = AnonymousClass002.A0n((Map) obj);
            while (itA0n.hasNext()) {
                A01(itA0n.next(), str, sb, i);
            }
            return;
        }
        sb.append('\n');
        int i2 = i;
        while (true) {
            z = false;
            int i3 = 80;
            if (i2 <= 0) {
                break;
            }
            char[] cArr = A00;
            if (i2 <= 80) {
                i3 = i2;
            }
            sb.append(cArr, 0, i3);
            i2 -= i3;
        }
        if (!str.isEmpty()) {
            StringBuilder sbA0w = C60O.A0w();
            AbstractC7608F5v.A1M(sbA0w, str.charAt(0));
            for (int i4 = 1; i4 < str.length(); i4++) {
                AbstractC7608F5v.A1M(sbA0w, AbstractC7610F5x.A00(str, sbA0w, i4));
            }
            str = sbA0w.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            strA00 = (String) obj;
            boolean z2 = false;
            boolean z3 = false;
            for (int i5 = 0; i5 < strA00.length(); i5++) {
                char cCharAt = strA00.charAt(i5);
                if (cCharAt < ' ' || cCharAt > '~') {
                    bytes = strA00.getBytes(StandardCharsets.UTF_8);
                } else {
                    if (cCharAt == '\"') {
                        z3 = true;
                    } else if (cCharAt == '\'') {
                        z = true;
                    } else if (cCharAt == '\\') {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                strA00 = strA00.replace(DeviceMediaStoreReaderKt.LIKE_ESCAPE_CHAR, "\\\\");
            }
            if (z) {
                strA00 = strA00.replace("'", "\\'");
            }
            if (z3) {
                strA00 = strA00.replace("\"", "\\\"");
            }
            sb.append(strA00);
            sb.append('\"');
        }
        if (!(obj instanceof AbstractC9330GEn)) {
            if (obj instanceof GI0) {
                sb.append(" {");
                A00((GI0) obj, sb, i + 2);
                sb.append(PairsDiscretionDocument.TERMINATOR);
                while (i > 0) {
                    char[] cArr2 = A00;
                    int i6 = i;
                    if (i > 80) {
                        i6 = 80;
                    }
                    sb.append(cArr2, 0, i6);
                    i -= i6;
                }
            } else {
                if (!(obj instanceof Map.Entry)) {
                    sb.append(": ");
                    sb.append(obj);
                    return;
                }
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i7 = i + 2;
                A01(entry.getKey(), "key", sb, i7);
                A01(entry.getValue(), BrowserOperationCatalogKt.VALUE, sb, i7);
                sb.append(PairsDiscretionDocument.TERMINATOR);
                while (i > 0) {
                    char[] cArr3 = A00;
                    int i8 = i;
                    if (i > 80) {
                        i8 = 80;
                    }
                    sb.append(cArr3, 0, i8);
                    i -= i8;
                }
            }
            sb.append("}");
            return;
        }
        sb.append(": \"");
        AbstractC9330GEn abstractC9330GEn = (AbstractC9330GEn) obj;
        int iA01 = abstractC9330GEn.A01();
        if (iA01 == 0) {
            bytes = AbstractC9307GDj.A00;
        } else {
            bytes = new byte[iA01];
            abstractC9330GEn.A03(bytes, iA01);
        }
        strA00 = HnT.A00(bytes);
        sb.append(strA00);
        sb.append('\"');
    }

    public static void A00(GI0 gi0, StringBuilder sb, int i) {
        boolean zEquals;
        int iA0F;
        Object obj;
        Method method;
        int length;
        HashSet hashSetA13 = C60O.A13();
        HashMap mapA0u = BV4.A0u();
        TreeMap treeMap = new TreeMap();
        for (Method method2 : gi0.getClass().getDeclaredMethods()) {
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
                    Object objA01 = GI0.A01(gi0, method3, new Object[0]);
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
                                } else if (objA01 instanceof AbstractC9330GEn) {
                                    obj = AbstractC9330GEn.A01;
                                } else {
                                    if (objA01 instanceof GIF) {
                                        if (objA01 == ((GI0) ((GIF) objA01)).A0E(6)) {
                                        }
                                    } else if (objA01 instanceof Enum) {
                                        iA0F = ((Enum) objA01).ordinal();
                                    }
                                    A01(objA01, strSubstring, sb, i);
                                }
                                zEquals = objA01.equals(obj);
                            }
                            if (iA0F != 0) {
                                A01(objA01, strSubstring, sb, i);
                            }
                        }
                        if (!zEquals) {
                            A01(objA01, strSubstring, sb, i);
                        }
                    } else if (AnonymousClass001.A1X(GI0.A01(gi0, method4, new Object[0]))) {
                        A01(objA01, strSubstring, sb, i);
                    }
                }
            }
            A01(GI0.A01(gi0, method, new Object[0]), strSubstring.substring(0, length), sb, i);
        }
        GI4 gi4 = gi0.b;
        if (gi4 != null) {
            for (int i2 = 0; i2 < gi4.A00; i2++) {
                A01(gi4.A04[i2], String.valueOf(gi4.A03[i2] >>> 3), sb, i);
            }
        }
    }
}
