package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import org.json.JSONObject;

/* renamed from: X.Bwo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3066Bwo {
    public final BlockingDeque<C3067Bwp> A00 = new LinkedBlockingDeque();

    public static C3067Bwp A00(List list, int i) {
        return (C3067Bwp) list.get(i);
    }

    public static final String A01(List<Long> list) {
        StringBuilder sbA0w = C60O.A0w();
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            long jA0Y = BV7.A0Y(it);
            long j = (jA0Y >> 63) ^ (jA0Y << 1);
            while (j >= 128) {
                char c = (char) (((short) (128 | (127 & j))) & 65535);
                j >>= 7;
                sbA0w.append(c);
            }
            sbA0w.append((char) (((short) j) & 65535));
        }
        StringBuilder sbA0x = C60O.A0x(sbA0w.toString());
        StringBuilder sbA0w2 = C60O.A0w();
        StringBuilder sbA0w3 = C60O.A0w();
        int length = sbA0x.length() % 3;
        if (length > 0) {
            while (length < 3) {
                sbA0w3.append('=');
                sbA0x.append((char) 0);
                length++;
            }
        }
        for (int i = 0; i < sbA0x.length(); i += 3) {
            int iCharAt = (sbA0x.charAt(i) << 16) + (sbA0x.charAt(i + 1) << '\b') + sbA0x.charAt(i + 2);
            BV6.A1M("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", sbA0w2, (iCharAt >> 18) & 63);
            BV6.A1M("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", sbA0w2, (iCharAt >> 12) & 63);
            BV6.A1M("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", sbA0w2, (iCharAt >> 6) & 63);
            BV6.A1M("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", sbA0w2, iCharAt & 63);
        }
        return AnonymousClass006.A0y(sbA0w3, sbA0w2.substring(0, sbA0w2.length() - sbA0w3.length()), C60O.A0w());
    }

    public static final String A02(List list, int i, int i2) {
        int i3;
        int i4;
        if (list.isEmpty() || i < 0 || i >= list.size() || i2 <= 0 || (i3 = i + i2) > list.size()) {
            return null;
        }
        HashMap mapA0u = BV4.A0u();
        C3067Bwp c3067BwpA00 = A00(list, i);
        mapA0u.put("f0", BV5.A12(String.valueOf(c3067BwpA00.A03), String.valueOf(c3067BwpA00.A01), String.valueOf(c3067BwpA00.A02)));
        C8j4.A1O("version", mapA0u, 1);
        if (i2 > 1) {
            int i5 = i3 - 1;
            int i6 = i + 1;
            if (i6 <= i5) {
                while (true) {
                    int i7 = i5 - 1;
                    A00(list, i5).A03 -= A00(list, i7).A03;
                    A00(list, i5).A01 -= A00(list, i7).A01;
                    A00(list, i5).A02 -= A00(list, i7).A02;
                    A00(list, i5).A00 = A00(list, i7).A00 == -1 ? 0L : A00(list, i5).A00 - A00(list, i7).A00;
                    A00(list, i5).A04 = (A00(list, i7).A04 != -1 ? A00(list, i5).A04 - A00(list, i7).A04 : 0L) * 100;
                    A00(list, i5).A02 -= A00(list, i5).A01;
                    if (i5 == i6) {
                        break;
                    }
                    i5--;
                }
            }
            HashMap mapA0u2 = BV4.A0u();
            int i8 = i6;
            while (true) {
                i4 = 0;
                if (i8 >= i3) {
                    break;
                }
                long j = A00(list, i8).A03;
                long j2 = A00(list, i8).A01;
                Long lValueOf = Long.valueOf(j);
                Object obj = mapA0u2.get(lValueOf);
                if (obj == null) {
                    obj = 0;
                    mapA0u2.put(lValueOf, obj);
                }
                C8j4.A1O(lValueOf, mapA0u2, AnonymousClass001.A0F(obj) + 1);
                Long lValueOf2 = Long.valueOf(j2);
                Object obj2 = mapA0u2.get(lValueOf2);
                if (obj2 == null) {
                    obj2 = 0;
                    mapA0u2.put(lValueOf2, obj2);
                }
                C8j4.A1O(lValueOf2, mapA0u2, AnonymousClass001.A0F(obj2) + 1);
                i8++;
            }
            Iterator itA0i = C3cG.A0i(mapA0u2);
            long j3 = 3333;
            while (itA0i.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0i);
                long jA05 = C3cG.A05(entryA0l.getKey());
                int iA0F = AnonymousClass001.A0F(entryA0l.getValue());
                if (i4 < iA0F) {
                    i4 = iA0F;
                    j3 = jA05;
                }
            }
            for (int i9 = i6; i9 < i3; i9++) {
                A00(list, i9).A03 -= j3;
                A00(list, i9).A01 -= j3;
            }
            mapA0u.put("baseDelta", Long.valueOf(j3));
            ArrayList arrayListA0h = C3cG.A0h();
            ArrayList arrayListA0h2 = C3cG.A0h();
            boolean z = false;
            while (i6 < i3) {
                BV6.A1R(arrayListA0h, A00(list, i6).A03);
                BV6.A1R(arrayListA0h, A00(list, i6).A01);
                BV6.A1R(arrayListA0h, A00(list, i6).A02);
                BV6.A1R(arrayListA0h2, A00(list, i6).A00);
                if (A00(list, i6).A00 != 0) {
                    z = true;
                }
                i6++;
            }
            mapA0u.put("fn", A01(arrayListA0h));
            mapA0u.put("fAudio", A01(arrayListA0h2));
            BV4.A1G("isSoundOn", mapA0u, z);
        }
        String strA0o = C60O.A0o(new JSONObject(mapA0u));
        return strA0o.length() > 900000 ? "{\"err\":\"SIZE_EXCEED_MAX_CAP\"}" : strA0o;
    }
}
