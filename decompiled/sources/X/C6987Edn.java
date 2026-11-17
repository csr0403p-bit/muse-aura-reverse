package X;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.Edn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6987Edn {
    public final InterfaceC6522EBw A00;
    public final EGT A01;
    public final Eh2 A02;

    public C6987Edn(InterfaceC6522EBw interfaceC6522EBw, EGT egt, Eh2 eh2) {
        C7384Etj.A0Y(interfaceC6522EBw, 0);
        this.A00 = interfaceC6522EBw;
        this.A01 = egt;
        this.A02 = eh2;
    }

    public final EfF A01(Bitmap.Config config, C6988Edo c6988Edo) throws IOException {
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        boolean zA1Z = AnonymousClass006.A1Z(config, config2);
        try {
            InputStream inputStreamA07 = c6988Edo.A07();
            inputStreamA07.getClass();
            Bitmap bitmapA00 = EGT.A00(EGT.A01(config, c6988Edo.A07(), c6988Edo.A03), null, this.A01, inputStreamA07);
            if (bitmapA00 == null) {
                return null;
            }
            return new EfF(EfF.A04, this.A00, bitmapA00);
        } catch (RuntimeException e) {
            if (zA1Z) {
                return A01(config2, c6988Edo);
            }
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EfF A00(android.graphics.Bitmap.Config r9, android.graphics.ColorSpace r10, X.C6988Edo r11, int r12) throws java.io.IOException {
        /*
            r8 = this;
            X.Ee6 r1 = r11.A07
            X.Ee6 r0 = X.AbstractC6994Edv.A07
            r3 = 1
            if (r1 == r0) goto L1a
            X.Ee6 r0 = X.AbstractC6994Edv.A03
            if (r1 == r0) goto L1a
        Lb:
            r7 = 1
        Lc:
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            boolean r6 = X.AnonymousClass006.A1Z(r9, r4)
            java.io.InputStream r5 = r11.A07()
            r5.getClass()
            goto L42
        L1a:
            X.EeA<java.io.FileInputStream> r0 = r11.A0B
            if (r0 != 0) goto Lb
            X.EfF r0 = r11.A0C
            r0.getClass()
            java.lang.Object r2 = r0.A04()
            X.Edm r2 = (X.C6986Edm) r2
            r0 = 2
            if (r12 < r0) goto L40
            int r0 = r12 + (-2)
            byte r1 = r2.A02(r0)
            r0 = -1
            if (r1 != r0) goto L40
            int r0 = r12 - r3
            byte r1 = r2.A02(r0)
            r0 = -39
            if (r1 != r0) goto L40
            goto Lb
        L40:
            r7 = 0
            goto Lc
        L42:
            X.EGT r3 = r8.A01     // Catch: java.lang.RuntimeException -> L88
            java.io.InputStream r2 = r11.A07()     // Catch: java.lang.RuntimeException -> L88
            int r1 = r11.A03     // Catch: java.lang.RuntimeException -> L88
            int r0 = r11.A06()     // Catch: java.lang.RuntimeException -> L88
            android.graphics.BitmapFactory$Options r2 = X.EGT.A01(r9, r2, r1)     // Catch: java.lang.RuntimeException -> L88
            if (r0 <= r12) goto L5a
            X.ByD r0 = new X.ByD     // Catch: java.lang.RuntimeException -> L88
            r0.<init>(r5, r12)     // Catch: java.lang.RuntimeException -> L88
            r5 = r0
        L5a:
            if (r7 != 0) goto L64
            byte[] r1 = X.EGT.A05     // Catch: java.lang.RuntimeException -> L88
            X.ByE r0 = new X.ByE     // Catch: java.lang.RuntimeException -> L88
            r0.<init>(r1, r5)     // Catch: java.lang.RuntimeException -> L88
            r5 = r0
        L64:
            android.graphics.Bitmap r3 = X.EGT.A00(r2, r10, r3, r5)     // Catch: java.lang.Throwable -> L7e
            r5.close()     // Catch: java.io.IOException -> L6c java.lang.RuntimeException -> L88
            goto L70
        L6c:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.RuntimeException -> L88
        L70:
            if (r3 != 0) goto L74
            r0 = 0
            return r0
        L74:
            X.EBw r2 = r8.A00     // Catch: java.lang.RuntimeException -> L88
            X.EfN r1 = X.EfF.A04     // Catch: java.lang.RuntimeException -> L88
            X.EfF r0 = new X.EfF     // Catch: java.lang.RuntimeException -> L88
            r0.<init>(r1, r2, r3)     // Catch: java.lang.RuntimeException -> L88
            return r0
        L7e:
            r1 = move-exception
            r5.close()     // Catch: java.io.IOException -> L83 java.lang.RuntimeException -> L88
            goto L87
        L83:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.RuntimeException -> L88
        L87:
            throw r1     // Catch: java.lang.RuntimeException -> L88
        L88:
            r0 = move-exception
            if (r6 == 0) goto L90
            X.EfF r0 = r8.A00(r4, r10, r11, r12)
            return r0
        L90:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6987Edn.A00(android.graphics.Bitmap$Config, android.graphics.ColorSpace, X.Edo, int):X.EfF");
    }
}
