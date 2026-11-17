package X;

/* loaded from: classes4.dex */
public final class Aap implements Aar {
    public final long A00;
    public final long A01;
    public final int A02;
    public final C28s A03;

    @Override // X.Aar
    public final /* synthetic */ float AFD(float f, float f2, float f3) {
        return AMZ(f, f2, f3, this.A00 + this.A01);
    }

    @Override // X.Aar
    public final float AMZ(float f, float f2, float f3, long j) {
        long j2 = j - this.A00;
        long j3 = this.A01;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= j3) {
            j3 = j2;
        }
        if (j3 == 0) {
            return f3;
        }
        return (AMT(f, f2, f3, j3) - AMT(f, f2, f3, j3 - 1000000)) * 1000.0f;
    }

    @Override // X.Aar
    public final long AEv(float f, float f2, float f3) {
        return this.A00 + this.A01;
    }

    @Override // X.Aar
    public final float AMT(float f, float f2, float f3, long j) {
        long j2 = j - this.A00;
        long j3 = this.A01;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 > j3) {
            j2 = j3;
        }
        float fTransform = this.A03.transform(this.A02 == 0 ? 1.0f : j2 / j3);
        return (f * (1.0f - fTransform)) + (f2 * fTransform);
    }

    @Override // X.AOc
    public final /* bridge */ /* synthetic */ InterfaceC0999AOh vectorize(C31w c31w) {
        return new C1122Aan(new Aax(this));
    }

    public Aap(C28s c28s, int i, int i2) {
        this.A02 = i;
        this.A03 = c28s;
        this.A01 = i * 1000000;
        this.A00 = i2 * 1000000;
    }

    public Aap() {
        this(C2HU.A01, 300, 0);
    }
}
