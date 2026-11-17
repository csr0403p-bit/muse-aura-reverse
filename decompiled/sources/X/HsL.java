package X;

/* loaded from: classes6.dex */
public abstract class HsL {
    public static F64 A01(F6D f6d, Object obj) {
        C7384Etj.A0Y(obj, 1);
        return A00(f6d);
    }

    public static final F64 A00(F6D f6d) {
        FBB fbb;
        F64 f64 = f6d.A03;
        if (f64 == null && ((fbb = f6d.A02) == null || (f64 = FBA.A03(fbb).A0E) == null)) {
            throw BV4.A0a("No tree resources delegate available in the Scripting Environment. This is an infra error that you should post in the Bloks Q&A group about.");
        }
        return f64;
    }
}
