package X;

import javax.net.ssl.SSLSocket;

/* loaded from: classes5.dex */
public final class EZY extends EZT {
    public static final boolean A00;

    static {
        String property = System.getProperty("java.specification.version");
        Integer numA0r = property == null ? null : C9tI.A0r(property);
        boolean z = true;
        if (numA0r == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
            } catch (NoSuchMethodException unused) {
            }
        } else if (numA0r.intValue() < 9) {
            z = false;
        }
        A00 = z;
    }
}
