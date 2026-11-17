package X;

/* loaded from: classes6.dex */
public final class GLL {
    public static final GLL A01 = new GLL("SHA1");
    public static final GLL A02 = new GLL("SHA224");
    public static final GLL A03 = new GLL("SHA256");
    public static final GLL A04 = new GLL("SHA384");
    public static final GLL A05 = new GLL("SHA512");
    public final String A00;

    public final String toString() {
        return this.A00;
    }

    public GLL(String name) {
        this.A00 = name;
    }
}
