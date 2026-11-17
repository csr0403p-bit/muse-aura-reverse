package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.F9o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7670F9o implements F64 {
    public C7673F9r A00;
    public final F9b A01;

    public static F9X A00(C7670F9o c7670F9o, Object obj) {
        C7384Etj.A0Y(obj, 0);
        F9X f9x = c7670F9o.A01.A04;
        C7384Etj.A0T(f9x);
        return f9x;
    }

    @Override // X.F64
    public final boolean A76(String str) {
        return A00(this, str).A0A.containsKey(str) || A01().A0A.containsKey(str);
    }

    @Override // X.F64
    public final Object ADy(String str) {
        F9X f9xA01;
        C7384Etj.A0Y(str, 0);
        F9b f9b = this.A01;
        F9X f9x = f9b.A04;
        C7384Etj.A0T(f9x);
        if (f9x.A01.containsKey(str)) {
            f9xA01 = f9b.A04;
            C7384Etj.A0T(f9xA01);
        } else {
            f9xA01 = A01();
        }
        return f9xA01.A01.get(str);
    }

    @Override // X.F64
    public final Object AFR(String str) {
        C7384Etj.A0Y(str, 0);
        return this.A01.A04().ABz(str);
    }

    @Override // X.F64
    public final Object AMX(String str) {
        F9X f9xA01;
        C7384Etj.A0Y(str, 0);
        F9b f9b = this.A01;
        F9X f9x = f9b.A04;
        C7384Etj.A0T(f9x);
        if (f9x.A0A.containsKey(str)) {
            f9xA01 = f9b.A04;
            C7384Etj.A0T(f9xA01);
        } else {
            f9xA01 = A01();
        }
        return f9xA01.A0A.get(str);
    }

    @Override // X.F64
    public final boolean AN9(String str) {
        C7384Etj.A0Y(str, 0);
        return this.A01.A04().AN6(str);
    }

    @Override // X.F64
    public final boolean ANE(String str) {
        return A00(this, str).A06.containsKey(str) || A01().A06.containsKey(str);
    }

    @Override // X.F64
    public final boolean ANK(String str) {
        return A00(this, str).A07.containsKey(str) || A01().A07.containsKey(str);
    }

    public final F9X A01() {
        F9X f9x;
        C7673F9r c7673F9r = this.A00;
        return (c7673F9r == null || (f9x = c7673F9r.A01) == null) ? F9Z.A00 : f9x;
    }

    public C7670F9o(F9b f9b) {
        this.A01 = f9b;
    }

    @Override // X.F64
    public final Object A6l(F6D f6d, F8L f8l) {
        AnonymousClass003.A0u(f8l, f6d);
        return F8J.A00(f6d, f8l).A02(f6d, F8J.A01(f8l, ((F6L) f6d).A02));
    }

    @Override // X.F64
    public final FDG AFx(String str) {
        FDG fdg = A00(this, str).A03.get(str);
        return fdg == null ? A01().A03.get(str) : fdg;
    }

    @Override // X.F64
    public final F6K AHN(String str) {
        F6K f6k = (F6K) A00(this, str).A09.get(str);
        return f6k == null ? (F6K) A01().A09.get(str) : f6k;
    }

    @Override // X.F64
    public final C7616F6s AIe(String str) {
        C7616F6s c7616F6s = A00(this, str).A06.get(str);
        return c7616F6s == null ? A01().A06.get(str) : c7616F6s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.F64
    public final F9X AM4() {
        F9b f9b;
        Map map;
        F9X f9xA01 = A01();
        if (f9xA01 == F9Z.A00) {
            F9X f9x = this.A01.A04;
            C7384Etj.A0T(f9x);
            return f9x;
        }
        Map<String, Object> map2 = f9xA01.A0A;
        if (map2.isEmpty()) {
            f9b = this.A01;
            F9X f9x2 = f9b.A04;
            C7384Etj.A0T(f9x2);
            map = f9x2.A0A;
        } else {
            HashMap mapA0w = BV4.A0w(map2);
            f9b = this.A01;
            F9X f9x3 = f9b.A04;
            C7384Etj.A0T(f9x3);
            mapA0w.putAll(f9x3.A0A);
            map = mapA0w;
        }
        F9X f9x4 = f9b.A04;
        C7384Etj.A0T(f9x4);
        return AbstractC7672F9q.A00(f9x4, f9xA01, map);
    }

    @Override // X.F64
    public final F8L AMQ(String str) {
        F8L f8l = A00(this, str).A08.get(str);
        return f8l == null ? A01().A08.get(str) : f8l;
    }

    @Override // X.F64
    public final Object getParameter(String str) {
        return A00(this, str).A05.get(str);
    }
}
