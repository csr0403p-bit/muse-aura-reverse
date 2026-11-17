package X;

/* renamed from: X.9ht, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9ht {
    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/9hu<TT;>;LX/9is;TT;)LX/9hv<TT;>; */
    public static final C9hv A00(Object obj, InterfaceC07789is interfaceC07789is, C9hu c9hu) {
        C7384Etj.A0Y(c9hu, 0);
        C9hv c9hvA02 = c9hu.A02(obj, interfaceC07789is);
        if (c9hvA02 != null) {
            return c9hvA02;
        }
        C0861A6i c0861A6iA0x = C3cG.A0x(obj.getClass());
        C9uG<T> c9uGA00 = c9hu.A00();
        C7384Etj.A0Y(c9uGA00, 1);
        String strA01 = C0861A6i.A01(c0861A6iA0x.A00);
        if (strA01 == null) {
            strA01 = String.valueOf(c0861A6iA0x);
        }
        BHX.A00(strA01, c9uGA00);
        throw F60.createAndThrow();
    }
}
