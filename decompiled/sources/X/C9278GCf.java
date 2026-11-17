package X;

/* renamed from: X.GCf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9278GCf {
    public int A00 = -1;
    public Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final G0W A05;
    public final G0W<Object, Object, Object, Object> A06;
    public final G0W A07;
    public final /* synthetic */ C9273GCa<R> A08;

    public C9278GCf(Object obj, Object obj2, Object obj3, G0W g0w, G0W g0w2, G0W g0w3, C9273GCa c9273GCa) {
        this.A08 = c9273GCa;
        this.A03 = obj;
        this.A07 = g0w;
        this.A06 = g0w2;
        this.A04 = obj2;
        this.A02 = obj3;
        this.A05 = g0w3;
    }

    public final void A00() {
        HsS hsS;
        Object obj = this.A01;
        C9273GCa<R> c9273GCa = this.A08;
        if (obj instanceof GCK) {
            ((GCK) obj).A06(c9273GCa.A04, this.A00);
        } else {
            if (!(obj instanceof HsS) || (hsS = (HsS) obj) == null) {
                return;
            }
            hsS.dispose();
        }
    }
}
