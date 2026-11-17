package X;

/* loaded from: classes4.dex */
public abstract class APu {
    public static final APu A00 = new AQI(new C1012APv(null, null, null, null, C9jH.A00, false));

    public final AQI A00(APu aPu) {
        C1012APv c1012APv = ((AQI) aPu).A00;
        C1013APw c1013APw = c1012APv.A01;
        if (c1013APw == null) {
            c1013APw = ((AQI) this).A00.A01;
        }
        C1014APx c1014APx = c1012APv.A03;
        if (c1014APx == null) {
            c1014APx = ((AQI) this).A00.A03;
        }
        C1015APy c1015APy = c1012APv.A00;
        if (c1015APy == null) {
            c1015APy = ((AQI) this).A00.A00;
        }
        C1016APz c1016APz = c1012APv.A02;
        if (c1016APz == null) {
            c1016APz = ((AQI) this).A00.A02;
        }
        return new AQI(new C1012APv(c1015APy, c1013APw, c1016APz, c1014APx, AGH.A02(((AQI) this).A00.A04, c1012APv.A04), false));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof APu) && C7384Etj.areEqual(((AQI) ((APu) obj)).A00, ((AQI) this).A00);
    }

    public final int hashCode() {
        return ((AQI) this).A00.hashCode();
    }

    public final String toString() {
        if (equals(A00)) {
            return "EnterTransition.None";
        }
        C1012APv c1012APv = ((AQI) this).A00;
        C1013APw c1013APw = c1012APv.A01;
        String string = c1013APw != null ? c1013APw.toString() : null;
        C1014APx c1014APx = c1012APv.A03;
        String string2 = c1014APx != null ? c1014APx.toString() : null;
        C1015APy c1015APy = c1012APv.A00;
        String string3 = c1015APy != null ? c1015APy.toString() : null;
        C1016APz c1016APz = c1012APv.A02;
        return FGI.A0l("EnterTransition: \nFade - ", string, ",\nSlide - ", string2, ",\nShrink - ", string3, ",\nScale - ", c1016APz != null ? c1016APz.toString() : null);
    }
}
