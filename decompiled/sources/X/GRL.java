package X;

import java.util.function.Function;

/* loaded from: classes6.dex */
public final class GRL<T, R> implements Function {
    public final /* synthetic */ String A00;

    public GRL(String str) {
        this.A00 = str;
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        String str = this.A00;
        GRZ grz = GRK.A01;
        StringBuilder sbA0g = C3cG.A0g("Creating store for ");
        sbA0g.append(str);
        String strA1P = C60P.A1P(", isActive: ", sbA0g, false);
        C7384Etj.A0Y(strA1P, 1);
        AbstractC7608F5v.A1L(strA1P);
        FZJ fzj = new FZJ(new G0V[]{GRM.A00, new FZJ(GRK.A02, 15)}, 18);
        GRH grh = new GRH(null, C9jH.A00);
        AbstractC7608F5v.A1L("No fallback user session provided. Returning null");
        GRU gruA00 = GRO.A00(grh, new GRP(str, AbstractC0878AGe.A0P(C60O.A11(0), C60O.A11(0))), fzj);
        C7384Etj.A0Z(gruA00, "null cannot be cast to non-null type com.facebook.rp.platform.statemanagement.RpStore");
        return gruA00;
    }
}
