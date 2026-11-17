package X;

/* renamed from: X.Guf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C10325Guf extends AbstractC10326Gug {
    public static final String A01 = String.valueOf((char) 0);
    public final C10312GuO A00;

    public C10325Guf() {
        super(C79.A0P);
        this.A00 = new C10312GuO();
    }

    public String toString() {
        return this.A00.A00();
    }

    @Override // X.AbstractC10326Gug
    public final void A03() {
        super.A03();
        this.A00.A01();
    }

    public C10325Guf(C10325Guf c10325Guf) {
        super(C79.A0P);
        C10312GuO c10312GuO = new C10312GuO();
        this.A00 = c10312GuO;
        this.A01 = c10325Guf.A01;
        super.A00 = ((AbstractC10326Gug) c10325Guf).A00;
        String strA00 = c10325Guf.A00.A00();
        c10312GuO.A01();
        c10312GuO.A00 = strA00;
    }
}
