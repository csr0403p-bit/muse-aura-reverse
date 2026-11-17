package X;

/* loaded from: classes6.dex */
public final class GMM {
    public final String A00;
    public static final GMM A03 = new GMM("TINK");
    public static final GMM A01 = new GMM("CRUNCHY");
    public static final GMM A02 = new GMM("NO_PREFIX");

    public final String toString() {
        return this.A00;
    }

    public GMM(String name) {
        this.A00 = name;
    }
}
