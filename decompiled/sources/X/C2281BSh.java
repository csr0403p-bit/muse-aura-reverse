package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.BSh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2281BSh implements Ht9, G2k {
    public final int $t;

    public C2281BSh(int i) {
        this.$t = i;
    }

    @Override // X.G2k
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        InterfaceC2266BNk interfaceC2266BNk = (InterfaceC2266BNk) obj;
        InterfaceC1740Apd interfaceC1740Apd = (InterfaceC1740Apd) obj2;
        Function0 function0 = (Function0) obj3;
        BFM bfm = (BFM) obj4;
        int iA0F = AnonymousClass001.A0F(obj5);
        int iA05 = (iA0F & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(interfaceC2266BNk, bfm, iA0F) ? 1 : 0) | iA0F : iA0F;
        if ((iA0F & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(interfaceC1740Apd, bfm, iA0F) ? 1 : 0);
        }
        if ((iA0F & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            AbstractC1789Aqz.A01(interfaceC2266BNk, interfaceC1740Apd, bfm, function0, iA05 & 1022);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }
}
