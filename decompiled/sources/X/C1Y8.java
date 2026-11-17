package X;

/* renamed from: X.1Y8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Y8 implements InterfaceC1055ATc {
    public final float A00;
    public final float A01;

    public C1Y8(float f, float f2) {
        this.A00 = Math.max(1.0E-7f, Math.abs(0.1f));
        this.A01 = Math.max(1.0E-4f, 1.0f) * (-4.2f);
    }

    @Override // X.InterfaceC1055ATc
    public final float AC9() {
        return this.A00;
    }

    @Override // X.InterfaceC1055ATc
    public final long AEw(float f) {
        return ((long) ((((float) Math.log(this.A00 / Math.abs(f))) * 1000.0f) / this.A01)) * 1000000;
    }

    @Override // X.InterfaceC1055ATc
    public final float ALX(float f, float f2) {
        if (Math.abs(f2) <= this.A00) {
            return f;
        }
        double dLog = Math.log(Math.abs(r1 / f2));
        float f3 = this.A01;
        double d = f3;
        float f4 = f2 / f3;
        return (f - f4) + (f4 * ((float) Math.exp((d * ((dLog / d) * 1000.0d)) / 1000.0d)));
    }

    @Override // X.InterfaceC1055ATc
    public final float AMS(float f, float f2, long j) {
        float f3 = f2 / this.A01;
        return (f - f3) + (f3 * ((float) Math.exp((r1 * (j / 1000000)) / 1000.0f)));
    }

    @Override // X.InterfaceC1055ATc
    public final float AMY(long j, float f) {
        return f * ((float) Math.exp(((j / 1000000) / 1000.0f) * this.A01));
    }

    public C1Y8() {
        this(1.0f, 0.1f);
    }
}
