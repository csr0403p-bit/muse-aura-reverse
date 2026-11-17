package X;

import com.facebook.aura.activation.view.InviteCodeScratcherKt;

/* loaded from: classes6.dex */
public final class HBI {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public boolean A04 = false;
    public final /* synthetic */ HB9 A05;

    public HBI(HB9 hb9, float f, float f2, float f3, float f4) {
        this.A05 = hb9;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A02 = f;
        this.A03 = f2;
        double dSqrt = Math.sqrt((f3 * f3) + (f4 * f4));
        if (dSqrt != 0.0d) {
            this.A00 = (float) (f3 / dSqrt);
            this.A01 = (float) (f4 / dSqrt);
        }
    }

    public final void A00(float f, float f2) {
        float f3 = f - this.A02;
        float f4 = f2 - this.A03;
        double dSqrt = Math.sqrt((f3 * f3) + (f4 * f4));
        if (dSqrt != 0.0d) {
            f3 = (float) (f3 / dSqrt);
            f4 = (float) (f4 / dSqrt);
        }
        float f5 = this.A00;
        if (f3 == (-f5) && f4 == (-this.A01)) {
            this.A04 = true;
            this.A00 = -f4;
        } else {
            this.A00 = f5 + f3;
            f3 = this.A01 + f4;
        }
        this.A01 = f3;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.HBI r5) {
        /*
            r4 = this;
            float r3 = r5.A00
            float r2 = r4.A00
            float r0 = -r2
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L1d
            float r1 = r5.A01
            float r0 = r4.A01
            float r0 = -r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L1d
            r0 = 1
            r4.A04 = r0
            float r0 = -r1
            r4.A00 = r0
            float r1 = r5.A00
        L1a:
            r4.A01 = r1
            return
        L1d:
            float r2 = r2 + r3
            r4.A00 = r2
            float r1 = r4.A01
            float r0 = r5.A01
            float r1 = r1 + r0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HBI.A01(X.HBI):void");
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("(");
        sbA0x.append(this.A02);
        sbA0x.append(",");
        sbA0x.append(this.A03);
        sbA0x.append(InviteCodeScratcherKt.CODE_SEPARATOR);
        sbA0x.append(this.A00);
        sbA0x.append(",");
        sbA0x.append(this.A01);
        return BV7.A10(sbA0x);
    }
}
