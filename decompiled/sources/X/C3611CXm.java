package X;

import com.facebook.tigon.iface.TigonPropertyContainer;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.CXm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3611CXm {
    public static final void A00(C3611CXm c3611CXm, C3610CXl c3610CXl, CY6 cy6) {
        int i;
        C7384Etj.A0Y(cy6, 1);
        byte b = cy6.A00;
        c3610CXl.A00(b);
        if (b == 0) {
            c3610CXl.A00(((Boolean) cy6.A01).booleanValue() ? (byte) 1 : (byte) 0);
            return;
        }
        if (b == 1) {
            A03(c3610CXl, ((Number) cy6.A01).longValue());
            return;
        }
        if (b == 2) {
            c3611CXm.A05(c3610CXl, (String) cy6.A01);
            return;
        }
        if (b == 3) {
            A01(c3611CXm, c3610CXl, (Map) cy6.A01);
            return;
        }
        if (b == 4) {
            Map map = (Map) cy6.A01;
            i = 0;
            if (map != null) {
                A02(c3610CXl, map.size());
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
                    c3611CXm.A05(c3610CXl, str);
                    c3610CXl.A00(zBooleanValue ? (byte) 1 : (byte) 0);
                }
                return;
            }
        } else {
            if (b != 5) {
                return;
            }
            Map map2 = (Map) cy6.A01;
            i = 0;
            if (map2 != null) {
                A02(c3610CXl, map2.size());
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    long jLongValue = ((Number) entry2.getValue()).longValue();
                    c3611CXm.A05(c3610CXl, str2);
                    A03(c3610CXl, jLongValue);
                }
                return;
            }
        }
        A02(c3610CXl, i);
    }

    public static final void A01(C3611CXm c3611CXm, C3610CXl c3610CXl, Map map) {
        if (map == null) {
            A02(c3610CXl, 0);
            return;
        }
        A02(c3610CXl, map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            c3611CXm.A05(c3610CXl, str);
            c3611CXm.A05(c3610CXl, str2);
        }
    }

    public final void A04(C3610CXl c3610CXl, TigonPropertyContainer tigonPropertyContainer) {
        C7384Etj.A0Y(tigonPropertyContainer, 1);
        Map mapUnmodifiableMap = Collections.unmodifiableMap(tigonPropertyContainer.properties);
        A02(c3610CXl, mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            Object value = entry.getValue();
            A02(c3610CXl, iIntValue);
            if (value instanceof TigonPropertyContainer.Group) {
                c3610CXl.A00((byte) 0);
                TigonPropertyContainer.Group group = (TigonPropertyContainer.Group) value;
                C7384Etj.A0Y(group, 1);
                Map mapUnmodifiableMap2 = Collections.unmodifiableMap(group.properties);
                A02(c3610CXl, mapUnmodifiableMap2.size());
                for (Map.Entry entry2 : mapUnmodifiableMap2.entrySet()) {
                    int iIntValue2 = ((Number) entry2.getKey()).intValue();
                    CY6 cy6 = (CY6) entry2.getValue();
                    A02(c3610CXl, iIntValue2);
                    A00(this, c3610CXl, cy6);
                }
            } else if (value instanceof CY6) {
                c3610CXl.A00((byte) 1);
                A00(this, c3610CXl, (CY6) value);
            }
        }
    }

    public final void A05(C3610CXl c3610CXl, String str) {
        C7384Etj.A0Y(str, 1);
        byte[] bytes = str.getBytes(AbstractC3609CXj.A01);
        int length = bytes.length;
        A02(c3610CXl, length);
        int i = c3610CXl.A00 + length;
        byte[] bArr = c3610CXl.A01;
        int length2 = bArr.length;
        if (i >= length2) {
            byte[] bArr2 = new byte[(length2 + length) * 2];
            c3610CXl.A01 = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        System.arraycopy(bytes, 0, c3610CXl.A01, c3610CXl.A00, length);
        c3610CXl.A00 += length;
    }

    public static final void A02(C3610CXl c3610CXl, int i) {
        c3610CXl.A00((byte) (i & 255));
        c3610CXl.A00((byte) ((65280 & i) >> 8));
        c3610CXl.A00((byte) ((16711680 & i) >> 16));
        c3610CXl.A00((byte) ((i & (-16777216)) >> 24));
    }

    public static final void A03(C3610CXl c3610CXl, long j) {
        c3610CXl.A00((byte) (255 & j));
        c3610CXl.A00((byte) ((65280 & j) >> 8));
        c3610CXl.A00((byte) ((16711680 & j) >> 16));
        c3610CXl.A00((byte) ((4278190080L & j) >> 24));
        c3610CXl.A00((byte) ((1095216660480L & j) >> 32));
        c3610CXl.A00((byte) ((280375465082880L & j) >> 40));
        c3610CXl.A00((byte) ((71776119061217280L & j) >> 48));
        c3610CXl.A00((byte) ((j & (-72057594037927936L)) >> 56));
    }
}
