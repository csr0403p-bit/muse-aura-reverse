package X;

/* renamed from: X.Ec1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC6905Ec1 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    public final String protocol;

    @Override // java.lang.Enum
    public final String toString() {
        return this.protocol;
    }

    EnumC6905Ec1(String str) {
        this.protocol = str;
    }
}
