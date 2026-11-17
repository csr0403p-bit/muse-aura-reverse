package X;

/* renamed from: X.Gud, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10323Gud extends AbstractC10326Gug {
    public String A00;
    public boolean A01;
    public final C10312GuO A02;
    public final C10312GuO A03;
    public final C10312GuO A04;
    public final C10312GuO A05;

    public C10323Gud() {
        super(C79.A00);
        this.A03 = new C10312GuO();
        this.A00 = null;
        this.A04 = new C10312GuO();
        this.A05 = new C10312GuO();
        this.A02 = new C10312GuO();
        this.A01 = false;
    }

    public final String toString() {
        return FGI.A0U("<!doctype ", this.A03.A00(), ">");
    }

    @Override // X.AbstractC10326Gug
    public final void A03() {
        super.A03();
        this.A03.A01();
        this.A00 = null;
        this.A04.A01();
        this.A05.A01();
        this.A02.A01();
        this.A01 = false;
    }
}
