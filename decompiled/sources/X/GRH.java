package X;

import java.util.Map;

/* loaded from: classes6.dex */
public final class GRH extends C06G {
    public static final GRH A02 = new GRH(null, C9jH.A00);
    public final GRD A00;
    public final Map<Class<?>, ?> A01;

    public GRH() {
        this(null, C9jH.A00);
    }

    public final <T> T A00(Class<? super T> cls) {
        GRD grd;
        C7384Etj.A0Y(cls, 0);
        T t = (T) this.A01.get(cls);
        if (t == null) {
            G50<T> g50A00 = G9e.A00(cls);
            t = null;
            if (g50A00 != null && (grd = this.A00) != null) {
                return (T) ((GR7) grd).A00.A01(g50A00);
            }
        }
        return t;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GRH) {
                GRH grh = (GRH) obj;
                if (!C7384Etj.areEqual(this.A00, grh.A00) || !C7384Etj.areEqual(this.A01, grh.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, AnonymousClass006.A0D(this.A00) * 31);
    }

    public final String toString() {
        return C3cJ.A0L(this.A01, ", nonRsysStateMap=", C3cG.A0f(this.A00, "RpState(rsysAppModel="));
    }

    public GRH(GRD grd, Map<Class<?>, ?> map) {
        this.A00 = grd;
        this.A01 = map;
    }
}
