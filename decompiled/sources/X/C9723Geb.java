package X;

/* renamed from: X.Geb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9723Geb {
    public final InterfaceC9756GfA A00;
    public final GPX A01;
    public final GPY A02;

    public final C10574Huh A00() {
        C10574Huh c10574Huh;
        GPX gpx;
        C10574Huh c10574Huh2;
        GPY gpy = this.A02;
        if ((gpy instanceof GPX) && (gpx = (GPX) gpy) != null && (c10574Huh2 = gpx.A00) != null) {
            return c10574Huh2;
        }
        GPL gplAKI = this.A00.AKI();
        if (gplAKI != null) {
            return gplAKI.A00;
        }
        GPX gpx2 = this.A01;
        return (gpx2 == null || (c10574Huh = gpx2.A00) == null) ? gpy.AJH() : c10574Huh;
    }

    public C9723Geb(InterfaceC9756GfA interfaceC9756GfA, GPX gpx, GPY gpy) {
        this.A02 = gpy;
        this.A00 = interfaceC9756GfA;
        this.A01 = gpx;
    }
}
