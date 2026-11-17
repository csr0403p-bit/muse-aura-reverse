package X;

/* renamed from: X.CFj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3339CFj {
    public final C3110ByZ<C3341CFl> A01 = new C3110ByZ<>(8);
    public final C3110ByZ<C3340CFk> A00 = new C3110ByZ<>(2);

    public static C3340CFk A00(C3341CFl c3341CFl, String str) {
        C3340CFk c3340CFkA02 = ((AbstractC3342CFm) c3341CFl).A01.A02();
        c3341CFl.A0E(c3340CFkA02, str);
        return c3340CFkA02;
    }

    public static C3341CFl A01(C3341CFl c3341CFl, String str) {
        C3341CFl c3341CFlA03 = ((AbstractC3342CFm) c3341CFl).A01.A03();
        c3341CFl.A0E(c3341CFlA03, str);
        return c3341CFlA03;
    }

    public final C3340CFk A02() {
        C3340CFk c3340CFkA2t = this.A00.A2t();
        if (c3340CFkA2t == null) {
            c3340CFkA2t = new C3340CFk();
        }
        c3340CFkA2t.A0A(this);
        return c3340CFkA2t;
    }

    public final C3341CFl A03() {
        C3341CFl c3341CFlA2t = this.A01.A2t();
        if (c3341CFlA2t == null) {
            c3341CFlA2t = new C3341CFl();
        }
        c3341CFlA2t.A0A(this);
        return c3341CFlA2t;
    }
}
