package X;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.Euh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7403Euh {
    public static final char[] A02 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public final String A00;
    public final Map<String, Object> A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7403Euh) {
                C7403Euh c7403Euh = (C7403Euh) obj;
                if (!this.A00.equals(c7403Euh.A00) || !this.A01.equals(c7403Euh.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    private final void A00(StringBuilder sb, Object obj) {
        if (obj != null) {
            if ((obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof String) || (obj instanceof Enum)) {
                sb.append(obj);
                return;
            }
            if (obj instanceof List) {
                Iterator it = AbstractC0878AGe.A0X((Iterable) obj).iterator();
                while (it.hasNext()) {
                    A00(sb, it.next());
                }
            } else {
                if (!(obj instanceof Map)) {
                    throw BV5.A0O(obj.getClass(), "Unexpected object value type ");
                }
                Map map = (Map) obj;
                C7384Etj.A0Y(map, 0);
                Iterator itA0i = C3cG.A0i(new TreeMap(map));
                while (itA0i.hasNext()) {
                    Map.Entry entryA0l = C3cH.A0l(itA0i);
                    A00(sb, entryA0l.getKey());
                    A00(sb, entryA0l.getValue());
                }
            }
        }
    }

    public final String A01() throws NoSuchAlgorithmException {
        C7lJ c7lJ = (C7lJ) C7lY.A00.getValue();
        String strA00 = c7lJ != null ? c7lJ.A00() : "";
        StringBuilder sbA0w = C60O.A0w();
        if (sbA0w.length() > 0) {
            sbA0w.deleteCharAt(sbA0w.length() - 1);
        }
        String string = sbA0w.toString();
        StringBuilder sbA0w2 = C60O.A0w();
        sbA0w2.append(this.A00);
        sbA0w2.append(":");
        Map<String, Object> map = this.A01;
        StringBuilder sbA0w3 = C60O.A0w();
        A00(sbA0w3, map);
        BV4.A1O(sbA0w2, sbA0w3);
        C60O.A1R(":", "8b70b804c58d946dc7b47cb242c3c2882614ead1855b79522049fb8c550a8994", sbA0w2);
        sbA0w2.append(strA00);
        if (string.length() > 0) {
            sbA0w2.append(":");
            sbA0w2.append(string);
        }
        String string2 = sbA0w2.toString();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        C7384Etj.A0U(messageDigest);
        messageDigest.update(C3cG.A1S(string2));
        byte[] bArrDigest = messageDigest.digest();
        C7384Etj.A0U(bArrDigest);
        char[] cArr = new char[40];
        int length = bArrDigest.length;
        for (int i = 0; i < length; i++) {
            byte b = bArrDigest[i];
            int i2 = i * 2;
            char[] cArr2 = A02;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public final int hashCode() {
        return AnonymousClass005.A0F(this.A01, AnonymousClass001.A0G(this.A00));
    }

    public final String toString() {
        String str = this.A00;
        Map<String, Object> map = this.A01;
        StringBuilder sbA0x = C3cI.A0x("BloksCacheKeyInputs(appID=", str);
        sbA0x.append(", params=");
        sbA0x.append(map);
        return C3cJ.A0L(null, ", bloksBundleQueryStore=", sbA0x);
    }

    public C7403Euh(String str, Map map) {
        this.A00 = str;
        this.A01 = map;
    }
}
