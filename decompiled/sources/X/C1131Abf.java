package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Abf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1131Abf {
    public final BN2 A00;
    public final Function0<InterfaceC1129Abd> A01;
    public final C0918AHu<Object, C1132Abg> A02 = C0918AHu.A02();

    public final Object A00(Object obj) {
        if (obj == null) {
            return null;
        }
        C1132Abg c1132AbgA05 = this.A02.A05(obj);
        if (c1132AbgA05 != null) {
            return c1132AbgA05.A02;
        }
        InterfaceC1129Abd interfaceC1129AbdInvoke = this.A01.invoke();
        int iAGP = interfaceC1129AbdInvoke.AGP(obj);
        if (iAGP != -1) {
            return interfaceC1129AbdInvoke.AE6(iAGP);
        }
        return null;
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/lang/Object;Ljava/lang/Object;)LX/G0V<LX/BFM;Ljava/lang/Integer;Lkotlin/Unit;>; */
    public final G0V A01(Object obj, Object obj2, int i) {
        C0918AHu<Object, C1132Abg> c0918AHu = this.A02;
        C1132Abg c1132AbgA05 = c0918AHu.A05(obj);
        if (c1132AbgA05 == null || c1132AbgA05.A00 != i || !C7384Etj.areEqual(c1132AbgA05.A02, obj2)) {
            c1132AbgA05 = new C1132Abg(this, obj, obj2, i);
            c0918AHu.A0E(obj, c1132AbgA05);
        }
        G0V<? super BFM, ? super Integer, Unit> g0v = c1132AbgA05.A01;
        if (g0v != null) {
            return g0v;
        }
        B1U b1uA02 = B1U.A02(new BTC(4, c1132AbgA05.A04, c1132AbgA05), 818252804);
        c1132AbgA05.A01 = b1uA02;
        return b1uA02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1131Abf(BN2 bn2, Function0<? extends InterfaceC1129Abd> function0) {
        this.A00 = bn2;
        this.A01 = function0;
    }
}
