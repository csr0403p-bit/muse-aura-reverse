package X;

import android.net.Uri;
import androidx.media3.datasource.UdpDataSource$UdpDataSourceException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes5.dex */
public final class CXA extends CX9 {
    public int A00;
    public Uri A01;
    public DatagramSocket A02;
    public InetAddress A03;
    public MulticastSocket A04;
    public boolean A05;
    public final DatagramPacket A06;
    public final byte[] A07;

    @Override // X.C1J
    public final void close() throws IOException {
        this.A01 = null;
        MulticastSocket multicastSocket = this.A04;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.A03;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.A04 = null;
        }
        DatagramSocket datagramSocket = this.A02;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.A02 = null;
        }
        this.A03 = null;
        this.A00 = 0;
        if (this.A05) {
            this.A05 = false;
            transferEnded();
        }
    }

    public CXA() {
        super(true);
        byte[] bArr = new byte[2000];
        this.A07 = bArr;
        this.A06 = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // X.C1J
    public final Uri getUri() {
        return this.A01;
    }

    @Override // X.C1J
    public final long open(C1O c1o) throws IOException {
        DatagramSocket datagramSocket;
        Uri uri = c1o.A06;
        this.A01 = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.A01.getPort();
        transferInitializing(c1o);
        try {
            InetAddress byName = InetAddress.getByName(host);
            this.A03 = byName;
            InetSocketAddress inetSocketAddress = new InetSocketAddress(byName, port);
            if (this.A03.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.A04 = multicastSocket;
                multicastSocket.joinGroup(this.A03);
                datagramSocket = this.A04;
            } else {
                datagramSocket = new DatagramSocket(inetSocketAddress);
            }
            this.A02 = datagramSocket;
            datagramSocket.setSoTimeout(8000);
            this.A05 = true;
            transferStarted(c1o);
            return -1L;
        } catch (IOException e) {
            throw new UdpDataSource$UdpDataSourceException(e, 2001);
        } catch (SecurityException e2) {
            throw new UdpDataSource$UdpDataSourceException(e2, 2006);
        }
    }

    @Override // X.C1L
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.A00 == 0) {
            try {
                DatagramSocket datagramSocket = this.A02;
                datagramSocket.getClass();
                DatagramPacket datagramPacket = this.A06;
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.A00 = length;
                bytesTransferred(length);
            } catch (SocketTimeoutException e) {
                throw new UdpDataSource$UdpDataSourceException(e, 2002);
            } catch (IOException e2) {
                throw new UdpDataSource$UdpDataSourceException(e2, 2001);
            }
        }
        int length2 = this.A06.getLength();
        int i3 = this.A00;
        int iMin = Math.min(i3, i2);
        System.arraycopy(this.A07, length2 - i3, bArr, i, iMin);
        this.A00 -= iMin;
        return iMin;
    }
}
