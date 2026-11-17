package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.Eao, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6836Eao {
    public static final Map<String, Dd5<C6837Eap>> A00 = BV4.A0u();
    public static final Set A01 = C60O.A13();
    public static final byte[] A03 = {80, 75, 3, 4};
    public static final byte[] A02 = {31, -117, 8};

    public static Boolean A02(InterfaceC6831Eaj interfaceC6831Eaj, byte[] bArr) {
        try {
            C6819EaX c6819EaX = new C6819EaX(new C6828Eag(interfaceC6831Eaj));
            for (byte b : bArr) {
                if (c6819EaX.readByte() != b) {
                    return false;
                }
            }
            c6819EaX.close();
            return AnonymousClass001.A0i();
        } catch (Exception | NoSuchMethodError unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019 A[Catch: Exception -> 0x030c, all -> 0x0318, TryCatch #0 {Exception -> 0x030c, blocks: (B:4:0x0006, B:6:0x0012, B:7:0x0019, B:8:0x004a, B:10:0x0050, B:11:0x0057, B:12:0x005a, B:13:0x0061, B:20:0x008b, B:21:0x0091, B:22:0x0097, B:23:0x00a1, B:24:0x00a7, B:25:0x00ac, B:26:0x00b1, B:27:0x00b4, B:29:0x00ba, B:30:0x00bd, B:32:0x00c3, B:38:0x00d1, B:39:0x00d8, B:40:0x00dc, B:41:0x00e0, B:149:0x02c4, B:42:0x00ec, B:43:0x00ef, B:45:0x00f5, B:46:0x0107, B:48:0x010d, B:60:0x0124, B:61:0x012b, B:62:0x012e, B:64:0x0134, B:66:0x013c, B:67:0x0143, B:68:0x0146, B:70:0x014c, B:71:0x0154, B:72:0x0158, B:73:0x015c, B:74:0x0161, B:75:0x0166, B:76:0x016b, B:77:0x016f, B:78:0x0178, B:79:0x018d, B:80:0x0190, B:82:0x0196, B:84:0x019e, B:85:0x01a5, B:86:0x01a8, B:88:0x01ae, B:89:0x01b6, B:91:0x01bc, B:99:0x01cd, B:100:0x01d4, B:101:0x01d8, B:102:0x01dd, B:103:0x01e2, B:104:0x01e7, B:105:0x01f7, B:106:0x01fb, B:107:0x0200, B:108:0x0203, B:110:0x0209, B:111:0x021f, B:113:0x0225, B:125:0x023c, B:126:0x0243, B:127:0x0248, B:128:0x024d, B:129:0x0252, B:130:0x0257, B:131:0x025a, B:133:0x0260, B:134:0x026d, B:135:0x0271, B:136:0x0276, B:138:0x027b, B:139:0x028d, B:140:0x0294, B:141:0x0297, B:143:0x029d, B:145:0x02a7, B:146:0x02a9, B:148:0x02b8, B:150:0x02c9, B:152:0x02ff, B:153:0x0306), top: B:163:0x0006, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C5195Dd7<X.C6837Eap> A00(X.AbstractC6806EaH r27, java.lang.String r28, boolean r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6836Eao.A00(X.EaH, java.lang.String, boolean):X.Dd7");
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;ILjava/lang/String;)LX/Dd5<LX/Eap;>; */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.Dd5 A01(android.content.Context r8, java.lang.String r9, int r10) {
        /*
            java.lang.ref.WeakReference r4 = X.BV4.A0q(r8)
            android.content.Context r5 = r8.getApplicationContext()
            r8 = 2
            X.F4i r3 = new X.F4i
            r6 = r9
            r7 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            r0 = 0
            if (r9 == 0) goto L33
            X.EaT r1 = X.C6815EaT.A01
            X.EzA<java.lang.String, X.Eap> r1 = r1.A00
            java.lang.Object r1 = r1.A02(r9)
            if (r1 == 0) goto L22
            X.Dd5 r0 = new X.Dd5
            r0.<init>(r1)
        L22:
            java.util.Map<java.lang.String, X.Dd5<X.Eap>> r2 = X.AbstractC6836Eao.A00
            boolean r1 = r2.containsKey(r9)
            if (r1 == 0) goto L30
            java.lang.Object r0 = r2.get(r9)
            X.Dd5 r0 = (X.Dd5) r0
        L30:
            if (r0 == 0) goto L33
        L32:
            return r0
        L33:
            X.Dd5 r0 = new X.Dd5
            r0.<init>(r3)
            if (r9 == 0) goto L32
            r4 = 0
            java.util.concurrent.atomic.AtomicBoolean r3 = X.BV4.A12(r4)
            X.F5T r1 = new X.F5T
            r1.<init>(r9, r3, r4)
            r0.A03(r1)
            r2 = 1
            X.F5T r1 = new X.F5T
            r1.<init>(r9, r3, r2)
            r0.A02(r1)
            boolean r1 = r3.get()
            if (r1 != 0) goto L32
            java.util.Map<java.lang.String, X.Dd5<X.Eap>> r1 = X.AbstractC6836Eao.A00
            r1.put(r9, r0)
            int r1 = r1.size()
            if (r1 != r2) goto L32
            java.util.Set r1 = X.AbstractC6836Eao.A01
            java.util.ArrayList r2 = X.BV4.A0t(r1)
            int r1 = r2.size()
            if (r4 >= r1) goto L32
            r2.get(r4)
            java.lang.String r0 = "onIdleChanged"
            java.lang.NullPointerException r0 = X.BV4.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6836Eao.A01(android.content.Context, java.lang.String, int):X.Dd5");
    }
}
