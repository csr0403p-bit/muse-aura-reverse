package X;

/* loaded from: classes5.dex */
public final class EJ2 implements Comparable<EJ2> {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public EJ2(int i, int i2, String str, String str2) {
        AnonymousClass002.A1B(str, 2, str2);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
        this.A03 = str2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(EJ2 ej2) {
        EJ2 ej22 = ej2;
        C7384Etj.A0Y(ej22, 0);
        int i = this.A00 - ej22.A00;
        return i == 0 ? this.A01 - ej22.A01 : i;
    }
}
