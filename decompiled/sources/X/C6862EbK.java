package X;

import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.maps.model.HatchMapSceneKt;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.util.List;

/* renamed from: X.EbK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6862EbK extends AbstractC6930Ecd {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public Socket A05;
    public Socket A06;
    public C6797Ea8 A07;
    public EnumC6905Ec1 A08;
    public C6879Ebb A09;
    public EcA A0A;
    public InterfaceC6831Eaj A0B;
    public boolean A0C;
    public boolean A0D;
    public final List<Reference<C6864EbM>> A0E;
    public final C6910Ec7 A0F;
    public final C6865EbN A0G;

    public C6862EbK(C6910Ec7 c6910Ec7, C6865EbN c6865EbN) {
        C7384Etj.A0Y(c6910Ec7, 1);
        this.A0G = c6865EbN;
        this.A0F = c6910Ec7;
        this.A00 = 1;
        this.A0E = C3cG.A0h();
        this.A04 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
    }

    public final synchronized void A01() {
        this.A0D = true;
    }

    public static final void A00(C6862EbK c6862EbK, int i, int i2) throws IOException {
        Socket socket;
        int i3;
        C6910Ec7 c6910Ec7 = c6862EbK.A0F;
        Proxy proxy = c6910Ec7.A01;
        C6856EbE c6856EbE = c6910Ec7.A02;
        Proxy.Type type = proxy.type();
        if (type == null || !((i3 = AbstractC6850Eb6.A00[type.ordinal()]) == 1 || i3 == 2)) {
            socket = new Socket(proxy);
        } else {
            socket = c6856EbE.A03.createSocket();
            C7384Etj.A0X(socket);
        }
        c6862EbK.A05 = socket;
        socket.setSoTimeout(i2);
        try {
            EZT ezt = EZT.A01;
            InetSocketAddress inetSocketAddress = c6910Ec7.A00;
            if (ezt instanceof C6770EZe) {
                AnonymousClass003.A0u(socket, inetSocketAddress);
                try {
                    socket.connect(inetSocketAddress, i);
                } catch (ClassCastException e) {
                    throw e;
                }
            } else {
                AnonymousClass003.A0u(socket, inetSocketAddress);
                socket.connect(inetSocketAddress, i);
            }
            try {
                C6819EaX.A02(socket, c6862EbK);
            } catch (NullPointerException e2) {
                if ("throw with null exception".equals(e2.getMessage())) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException(AnonymousClass006.A0y(c6910Ec7.A00, "Failed to connect to ", C60O.A0w()));
            connectException.initCause(e3);
            throw connectException;
        }
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Connection{");
        C6910Ec7 c6910Ec7 = this.A0F;
        C6854EbC c6854EbC = c6910Ec7.A02.A09;
        sbA0x.append(c6854EbC.A02);
        sbA0x.append(HatchMapSceneKt.ARTIFACT_ID_SEPARATOR);
        sbA0x.append(c6854EbC.A00);
        sbA0x.append(", proxy=");
        sbA0x.append(c6910Ec7.A01);
        sbA0x.append(" hostAddress=");
        sbA0x.append(c6910Ec7.A00);
        sbA0x.append(" cipherSuite=");
        C6797Ea8 c6797Ea8 = this.A07;
        sbA0x.append(c6797Ea8 != null ? c6797Ea8.A02 : "none");
        sbA0x.append(" protocol=");
        sbA0x.append(this.A08);
        return C8j3.A15(sbA0x);
    }
}
