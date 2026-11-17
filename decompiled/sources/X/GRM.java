package X;

import java.util.Map;

/* loaded from: classes6.dex */
public final /* synthetic */ class GRM extends C7438Evz implements G0V<GRH, Object, GRH> {
    public static final GRM A00 = new GRM();

    public GRM() {
        super(2, GSJ.class, "rsysAppModelReducer", "rsysAppModelReducer(Lcom/facebook/rp/platform/statemanagement/rpstate/RpState;Ljava/lang/Object;)Lcom/facebook/rp/platform/statemanagement/rpstate/RpState;", 1);
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ GRH invoke(GRH grh, Object obj) {
        GRH grh2 = grh;
        boolean zA1Y = C60P.A1Y(grh2, obj);
        if (!(obj instanceof GRD)) {
            return grh2;
        }
        Map<Class<?>, ?> map = grh2.A01;
        C7384Etj.A0Y(map, zA1Y ? 1 : 0);
        return new GRH((GRD) obj, map);
    }
}
