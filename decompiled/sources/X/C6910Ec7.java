package X;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* renamed from: X.Ec7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6910Ec7 {
    public final InetSocketAddress A00;
    public final Proxy A01;
    public final C6856EbE A02;

    public C6910Ec7(InetSocketAddress inetSocketAddress, Proxy proxy, C6856EbE c6856EbE) {
        C7384Etj.A0Y(inetSocketAddress, 2);
        this.A02 = c6856EbE;
        this.A01 = proxy;
        this.A00 = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6910Ec7) {
            C6910Ec7 c6910Ec7 = (C6910Ec7) obj;
            if (c6910Ec7.A02.equals(this.A02) && c6910Ec7.A01.equals(this.A01) && c6910Ec7.A00.equals(this.A00)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, AnonymousClass005.A0F(this.A01, BV8.A09(this.A02)));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Route{");
        sbA0x.append(this.A00);
        return C8j3.A15(sbA0x);
    }
}
