package X;

/* loaded from: classes6.dex */
public final class Gu3 {
    public final String A00;
    public final String A01;

    public final String toString() {
        return FGI.A0d("<", this.A00, ">: ", this.A01);
    }

    public Gu3(String str, GtL gtL) {
        this.A00 = gtL.A0A();
        this.A01 = str;
    }

    public Gu3(String str, GtL gtL, Object... objArr) {
        this.A00 = gtL.A0A();
        this.A01 = String.format(str, objArr);
    }
}
