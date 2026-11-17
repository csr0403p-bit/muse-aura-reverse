package X;

import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;
import java.util.HashMap;

/* renamed from: X.Dmj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5655Dmj {
    /* JADX WARN: Removed duplicated region for block: B:5:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(java.lang.String r6, java.lang.String r7, X.C6154Dwx[] r8, long r9, long r11, long r13, boolean r15) {
        /*
            if (r6 == 0) goto Lb
            java.lang.String r0 = "inline"
            boolean r1 = r0.equals(r6)
            r0 = 1
            if (r1 == 0) goto Lc
        Lb:
            r0 = 0
        Lc:
            boolean r7 = A03(r7, r13, r0)
            if (r7 == 0) goto L13
            r9 = r11
        L13:
            int r0 = r8.length
            int r6 = r0 + (-1)
            r0 = 0
        L17:
            if (r6 < 0) goto L5c
            r5 = r8[r6]
            if (r15 == 0) goto L59
            X.Dl5 r1 = X.Dl5.A00(r5)
            int r1 = r1.A02
            if (r1 <= 0) goto L59
            int r2 = r5.A05
            X.Dl5 r1 = X.Dl5.A00(r5)
            int r1 = r1.A02
            if (r2 <= r1) goto L59
            X.Dl5 r1 = X.Dl5.A00(r5)
            int r4 = r1.A02
        L35:
            r2 = 0
            int r1 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r1 <= 0) goto L43
            long r2 = (long) r4
            int r1 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r1 <= 0) goto L43
        L40:
            int r6 = r6 + (-1)
            goto L17
        L43:
            X.Dl5 r1 = X.Dl5.A00(r5)
            if (r7 == 0) goto L56
            boolean r1 = r1.A0I
        L4b:
            if (r1 != 0) goto L40
            r1 = r8[r6]
            int r1 = r1.A05
            int r0 = java.lang.Math.max(r0, r1)
            goto L40
        L56:
            boolean r1 = r1.A0J
            goto L4b
        L59:
            int r4 = r5.A05
            goto L35
        L5c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC5655Dmj.A00(java.lang.String, java.lang.String, X.Dwx[], long, long, long, boolean):int");
    }

    public static boolean A02(C6154Dwx c6154Dwx) {
        String str = c6154Dwx.A0X;
        return str != null && str.startsWith("audio");
    }

    public static boolean A03(String str, long j, boolean z) {
        long jA06;
        if (z || str == null) {
            return z;
        }
        if (j <= 0) {
            return z;
        }
        synchronized (C5898Drf.class) {
            HashMap<String, Long> map = C5898Drf.A01;
            jA06 = map.containsKey(str) ? BV4.A06(map.get(str)) : 0L;
        }
        if (jA06 >= j) {
            return true;
        }
        return z;
    }

    public static C5900Drh A01(InterfaceC4913DEg interfaceC4913DEg, AbrContextAwareConfiguration abrContextAwareConfiguration, String str, int i, long j) {
        InterfaceC5903Drm interfaceC5903DrmACl = interfaceC4913DEg.ACl();
        interfaceC5903DrmACl.getClass();
        if (i != -1 && (i <= 0 || i >= 100)) {
            i = 80;
        }
        C5686DnS.A00(interfaceC4913DEg, abrContextAwareConfiguration, interfaceC5903DrmACl, interfaceC5903DrmACl);
        long jAFJ = interfaceC5903DrmACl.AFJ(str, -1, j);
        long jAFJ2 = interfaceC5903DrmACl.AFJ(str, i, j);
        C5480DjH c5480DjHADi = interfaceC5903DrmACl.ADi();
        C5900Drh c5900Drh = new C5900Drh();
        c5900Drh.A02 = jAFJ;
        c5900Drh.A01 = jAFJ2;
        c5900Drh.A00 = i;
        c5900Drh.A03 = c5480DjHADi;
        return c5900Drh;
    }
}
