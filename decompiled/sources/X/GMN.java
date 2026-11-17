package X;

/* loaded from: classes6.dex */
public final class GMN {
    public final String A00;
    public static final GMN A03 = new GMN("ASSUME_AES_GCM");
    public static final GMN A06 = new GMN("ASSUME_XCHACHA20POLY1305");
    public static final GMN A05 = new GMN("ASSUME_CHACHA20POLY1305");
    public static final GMN A01 = new GMN("ASSUME_AES_CTR_HMAC");
    public static final GMN A02 = new GMN("ASSUME_AES_EAX");
    public static final GMN A04 = new GMN("ASSUME_AES_GCM_SIV");

    public final String toString() {
        return this.A00;
    }

    public GMN(String name) {
        this.A00 = name;
    }
}
