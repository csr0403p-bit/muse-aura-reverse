package X;

import java.util.Map;

/* renamed from: X.F9p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7671F9p implements F64 {
    public FAL A00 = new C10486Hlh();
    public final C7670F9o A01;
    public final F9b A02;

    public static C7670F9o A00(C7671F9p c7671F9p, Object obj) {
        C7384Etj.A0Y(obj, 0);
        return c7671F9p.A01;
    }

    @Override // X.F64
    public final boolean A76(String str) {
        C7384Etj.A0Y(str, 0);
        return this.A00.A76(str);
    }

    @Override // X.F64
    public final Object AMX(String str) {
        C7384Etj.A0Y(str, 0);
        return this.A00.AMX(str);
    }

    @Override // X.F64
    public final F9X AM4() {
        F9X f9xA01 = this.A01.A01();
        F9X f9x = this.A02.A04;
        if (f9xA01 != F9Z.A00) {
            C7384Etj.A0X(f9x);
            return AbstractC7672F9q.A00(f9x, f9xA01, this.A00.ACM());
        }
        Map<String, Object> mapACM = this.A00.ACM();
        if (mapACM == null) {
            return f9x;
        }
        return new F9X(f9x.A00, f9x.A09, f9x.A06, mapACM, f9x.A05, f9x.A04, f9x.A03, f9x.A07, f9x.A08, f9x.A02, f9x.A01);
    }

    public C7671F9p(F9b f9b, C7670F9o c7670F9o) {
        this.A02 = f9b;
        this.A01 = c7670F9o;
    }

    @Override // X.F64
    public final Object A6l(F6D f6d, F8L f8l) {
        AnonymousClass003.A0u(f8l, f6d);
        return this.A01.A6l(f6d, f8l);
    }

    @Override // X.F64
    public final Object ADy(String str) {
        return A00(this, str).ADy(str);
    }

    @Override // X.F64
    public final Object AFR(String str) {
        return A00(this, str).AFR(str);
    }

    @Override // X.F64
    public final FDG AFx(String str) {
        return A00(this, str).AFx(str);
    }

    @Override // X.F64
    public final F6K AHN(String str) {
        return A00(this, str).AHN(str);
    }

    @Override // X.F64
    public final C7616F6s AIe(String str) {
        return A00(this, str).AIe(str);
    }

    @Override // X.F64
    public final F8L AMQ(String str) {
        return A00(this, str).AMQ(str);
    }

    @Override // X.F64
    public final boolean AN9(String str) {
        return A00(this, str).AN9(str);
    }

    @Override // X.F64
    public final boolean ANE(String str) {
        return A00(this, str).ANE(str);
    }

    @Override // X.F64
    public final boolean ANK(String str) {
        return A00(this, str).ANK(str);
    }

    @Override // X.F64
    public final Object getParameter(String str) {
        return A00(this, str).getParameter(str);
    }
}
