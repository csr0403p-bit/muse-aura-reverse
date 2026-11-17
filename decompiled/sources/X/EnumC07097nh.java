package X;

/* renamed from: X.7nh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC07097nh {
    RS256("SHA256withRSA", "RSA"),
    ES256("SHA256withECDSA", "EC");

    public final String mJavaKeyFactoryKeyString;
    public final String mJavaSignatureString;

    EnumC07097nh(String str, String str2) {
        this.mJavaSignatureString = str;
        this.mJavaKeyFactoryKeyString = str2;
    }
}
