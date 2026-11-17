package X;

/* renamed from: X.Ebv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC6899Ebv {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");

    public final String javaName;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final EnumC6899Ebv A00(String str) {
        C7384Etj.A0Y(str, 0);
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return SSL_3_0;
        }
        throw C7384Etj.A0D(str, "Unexpected TLS version: ");
    }

    EnumC6899Ebv(String str) {
        this.javaName = str;
    }
}
