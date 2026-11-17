package X;

/* renamed from: X.EHo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6572EHo {
    public static final C6572EHo A03 = new C6572EHo("", -2, null);
    public final long A00;
    public final String A01;
    public final String A02;

    public final String toString() {
        String str = this.A02;
        StringBuilder sbA0g = C3cG.A0g(this.A01);
        sbA0g.append(" : ");
        long j = this.A00;
        if (str == null) {
            sbA0g.append(j);
        } else {
            sbA0g.append(j);
            sbA0g.append(" : ");
            sbA0g.append(str);
        }
        return sbA0g.toString();
    }

    public C6572EHo(String str, long j, String str2) {
        this.A01 = str;
        this.A00 = j;
        this.A02 = str2;
    }
}
