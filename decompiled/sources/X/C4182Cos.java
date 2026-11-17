package X;

/* renamed from: X.Cos, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4182Cos extends AbstractC4178Com<C4278Cs8> {
    public final CSA<InterfaceC4097CmR> A05(String str, int i) {
        if (str == null) {
            throw C60O.A0i(String.valueOf("capability must not be null"));
        }
        AbstractC4272Cry abstractC4272Cry = this.A05;
        if (i != 0) {
            i = 1;
        }
        C4183Cot c4183Cot = new C4183Cot(abstractC4272Cry, str, i);
        AbstractC4178Com.A03(((C4365CuK) abstractC4272Cry).A00, c4183Cot, 0);
        return AbstractC4189Cp0.A00(c4183Cot, C4155CoA.A00);
    }
}
