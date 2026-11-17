package X;

/* loaded from: classes6.dex */
public final class F9Y implements F64 {
    public final F9X A00;
    public final F6v A01;

    public static F9X A00(F9Y f9y, Object obj) {
        C7384Etj.A0Y(obj, 0);
        return f9y.A00;
    }

    @Override // X.F64
    public final Object AFR(String str) {
        C7384Etj.A0Y(str, 0);
        return this.A01.ABz(str);
    }

    @Override // X.F64
    public final boolean AN9(String str) {
        C7384Etj.A0Y(str, 0);
        return this.A01.AN6(str);
    }

    @Override // X.F64
    public final F9X AM4() {
        return this.A00;
    }

    public F9Y(F9X f9x, F6v f6v) {
        this.A00 = f9x;
        this.A01 = f6v;
    }

    @Override // X.F64
    public final Object A6l(F6D f6d, F8L f8l) {
        AnonymousClass003.A0u(f8l, f6d);
        return F8J.A00(f6d, f8l).A02(f6d, F8J.A01(f8l, ((F6L) f6d).A02));
    }

    @Override // X.F64
    public final boolean A76(String str) {
        return A00(this, str).A0A.containsKey(str);
    }

    @Override // X.F64
    public final Object ADy(String str) {
        return A00(this, str).A01.get(str);
    }

    @Override // X.F64
    public final FDG AFx(String str) {
        return A00(this, str).A03.get(str);
    }

    @Override // X.F64
    public final F6K AHN(String str) {
        return (F6K) A00(this, str).A09.get(str);
    }

    @Override // X.F64
    public final C7616F6s AIe(String str) {
        return A00(this, str).A06.get(str);
    }

    @Override // X.F64
    public final F8L AMQ(String str) {
        return A00(this, str).A08.get(str);
    }

    @Override // X.F64
    public final Object AMX(String str) {
        return A00(this, str).A0A.get(str);
    }

    @Override // X.F64
    public final boolean ANE(String str) {
        return A00(this, str).A06.containsKey(str);
    }

    @Override // X.F64
    public final boolean ANK(String str) {
        return A00(this, str).A07.containsKey(str);
    }

    @Override // X.F64
    public final Object getParameter(String str) {
        return A00(this, str).A05.get(str);
    }
}
