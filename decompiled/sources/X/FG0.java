package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class FG0<R> implements InterfaceC7812FFt {
    public final /* synthetic */ C7818FFz A00;
    public final /* synthetic */ FDW A01;
    public final /* synthetic */ Object A02;

    public FG0(C7818FFz c7818FFz, FDW fdw, Object obj) {
        this.A01 = fdw;
        this.A02 = obj;
        this.A00 = c7818FFz;
    }

    @Override // X.FE2
    public final /* bridge */ /* synthetic */ void ANz(InterfaceC7762FDp interfaceC7762FDp) {
        FG1 fg1 = (FG1) interfaceC7762FDp;
        C7384Etj.A0Y(fg1, 0);
        FDW fdw = this.A01;
        FG2 fg2 = fg1.A01;
        Object objAZd = fg2.AZd(fdw);
        FG4 fg4 = fg1.A00;
        if (fg4 != null) {
            long jAZe = fg2.AZe(fdw);
            C0918AHu<Object, Long> c0918AHu = fg4.A00;
            if (c0918AHu == null) {
                c0918AHu = new C0918AHu<>(2);
                fg4.A00 = c0918AHu;
            }
            c0918AHu.A0E(fdw, Long.valueOf(jAZe));
        }
        if (objAZd == null) {
            objAZd = null;
        }
        List list = (List) objAZd;
        if (list == null) {
            throw C3cG.A0Q("Expected list of list items to be set");
        }
        Object obj = this.A02;
        C7384Etj.A0Z(obj, "null cannot be cast to non-null type com.facebook.rendercore.simplelist.ListLayoutData<*>");
        FFN ffn = (FFN) obj;
        this.A00.A00.A05(new FFN(list, ffn.A01, ffn.A00));
    }
}
