package X;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;

/* renamed from: X.Eay, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6846Eay implements Eb3 {
    public final DWp A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [X.AGi] */
    @Override // X.Eb3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.Eb0 A4v(X.C6886Ebi r26, X.C6910Ec7 r27) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6846Eay.A4v(X.Ebi, X.Ec7):X.Eb0");
    }

    public C6846Eay(DWp dWp) {
        this.A00 = dWp;
    }

    public static final InetAddress A00(Proxy proxy, DWp dWp, C6854EbC c6854EbC) {
        Proxy.Type type = proxy.type();
        if (type != null && AbstractC6849Eb5.A00[type.ordinal()] == 1) {
            return (InetAddress) AbstractC0878AGe.A0F(dWp.AQ0(c6854EbC.A02));
        }
        SocketAddress socketAddressAddress = proxy.address();
        if (socketAddressAddress == null) {
            throw BV4.A0a("null cannot be cast to non-null type java.net.InetSocketAddress");
        }
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        C7384Etj.A0U(address);
        return address;
    }

    public C6846Eay() {
        this(DWp.A00);
    }
}
