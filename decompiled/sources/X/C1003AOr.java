package X;

/* renamed from: X.AOr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1003AOr<T> implements AOe<T> {
    public final float A00;
    public final float A01;
    public final T A02;

    public static C1003AOr A00(Object obj) {
        return new C1003AOr(obj, 1.0f, 400.0f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1003AOr)) {
            return false;
        }
        C1003AOr c1003AOr = (C1003AOr) obj;
        if (c1003AOr.A00 == this.A00 && c1003AOr.A01 == this.A01) {
            return C8j3.A1W(c1003AOr.A02, this.A02, false);
        }
        return false;
    }

    public final int hashCode() {
        return C8j4.A06(AnonymousClass005.A02(C60R.A01(this.A02) * 31, this.A00), this.A01);
    }

    @Override // X.AOe, X.AOc
    public final /* bridge */ /* synthetic */ AOX vectorize(C31w c31w) {
        float f = this.A00;
        float f2 = this.A01;
        T t = this.A02;
        return new Aao(t == null ? null : AOl.A00(c31w, t), f, f2);
    }

    /* JADX WARN: Incorrect types in method signature: (FFTT;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public C1003AOr(Object obj, float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = obj;
    }

    public C1003AOr() {
        this(null, 1.0f, 1500.0f);
    }

    @Override // X.AOc
    public final /* bridge */ /* synthetic */ InterfaceC0999AOh vectorize(C31w c31w) {
        AOd aOdA00;
        float f = this.A00;
        float f2 = this.A01;
        T t = this.A02;
        if (t == null) {
            aOdA00 = null;
        } else {
            aOdA00 = AOl.A00(c31w, t);
        }
        return new Aao(aOdA00, f, f2);
    }
}
