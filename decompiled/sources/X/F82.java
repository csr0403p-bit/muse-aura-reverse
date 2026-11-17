package X;

/* loaded from: classes6.dex */
public final class F82 extends FT5 {
    public final double A00;
    public final double A01;
    public final double A02;
    public final float A03;
    public final float A04;
    public final double A05;

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        double dExp;
        double dExp2;
        double dExp3;
        double dExp4;
        float f;
        double currentPlayTime = getCurrentPlayTime() / 1000.0f;
        if (currentPlayTime >= this.A05) {
            f = this.A03;
        } else {
            double d = this.A04;
            double d2 = this.A00;
            double d3 = this.A02;
            if (d3 < 0.999999d) {
                double d4 = this.A01;
                double dSqrt = d4 * Math.sqrt(1.0d - (d3 * d3));
                double d5 = (((d3 * d4) * d2) + d) / dSqrt;
                dExp = this.A03;
                dExp2 = Math.exp((-d3) * d4 * currentPlayTime);
                double d6 = dSqrt * currentPlayTime;
                dExp3 = (d2 * Math.cos(d6)) + (d5 * Math.sin(d6));
            } else if (d3 > 1.000001d) {
                double dSqrt2 = Math.sqrt((d3 * d3) - 1.0d);
                double d7 = -this.A01;
                double d8 = d7 * (d3 + dSqrt2);
                double d9 = d7 * (d3 - dSqrt2);
                double d10 = (d - (d8 * d2)) / (d9 - d8);
                dExp4 = this.A03 + ((d2 - d10) * Math.exp(d8 * currentPlayTime));
                dExp = d10 * Math.exp(d9 * currentPlayTime);
                f = (float) (dExp + dExp4);
            } else {
                double d11 = this.A01;
                double d12 = d + (d11 * d2);
                dExp = this.A03;
                dExp2 = d2 + (d12 * currentPlayTime);
                dExp3 = Math.exp((-d11) * currentPlayTime);
            }
            dExp4 = dExp2 * dExp3;
            f = (float) (dExp + dExp4);
        }
        return Float.valueOf(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public F82(float r12, float r13, float r14, float r15, float r16) {
        /*
            r11 = this;
            r11.<init>()
            r11.A03 = r13
            r0 = r16
            r11.A04 = r0
            double r3 = (double) r14
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L12
            r3 = 0
        L12:
            double r3 = java.lang.Math.sqrt(r3)
            r11.A01 = r3
            double r5 = (double) r15
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L1f
            r5 = 0
        L1f:
            r11.A02 = r5
            float r12 = r12 - r13
            double r7 = (double) r12
            r11.A00 = r7
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L6a
            r7 = 4607182423303617035(0x3ff000010c6f7a0b, double:1.000001)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L3c
            double r9 = r5 * r5
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r9 = r9 - r7
            double r7 = java.lang.Math.sqrt(r9)
            double r5 = r5 - r7
        L3c:
            double r5 = r5 * r3
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L6a
            r0 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            double r3 = java.lang.Math.log(r0)
            double r1 = -r3
            double r1 = r1 / r5
            r3 = 4621819117588971520(0x4024000000000000, double:10.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L54
        L52:
            r1 = 4621819117588971520(0x4024000000000000, double:10.0)
        L54:
            r11.A05 = r1
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x0070: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            r11.setFloatValues(r0)
            r3 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r1 = r1 * r3
            long r3 = (long) r1
            r11.setDuration(r3)
            return
        L6a:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L52
            goto L54
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F82.<init>(float, float, float, float, float):void");
    }
}
