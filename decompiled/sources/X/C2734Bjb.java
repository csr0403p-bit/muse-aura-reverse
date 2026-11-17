package X;

/* renamed from: X.Bjb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2734Bjb {
    public BjV A00 = null;
    public final /* synthetic */ Bj4 A01;

    public C2734Bjb(Bj4 bj4) {
        this.A01 = bj4;
    }

    public final void A00() {
        BjV bjV = this.A00;
        if (bjV != null) {
            bjV.A01.set(true);
            bjV.A00.cancel(true);
        }
        this.A00 = null;
    }
}
