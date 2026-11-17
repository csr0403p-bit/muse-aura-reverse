package X;

import android.os.SystemClock;
import com.facebook.aura.localbrowser.LocalBrowserCapacityKt;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class CXF implements InterfaceC5231Ddp {
    @Override // X.InterfaceC5231Ddp
    public final void A5z() {
    }

    @Override // X.InterfaceC5231Ddp
    public final void APf() throws IOException {
        synchronized (CXG.A02) {
            Object obj = CXG.A03;
            synchronized (obj) {
                try {
                    if (!CXG.A01) {
                        DatagramSocket datagramSocket = new DatagramSocket();
                        try {
                            synchronized (obj) {
                                try {
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            datagramSocket.setSoTimeout(1000);
                            synchronized (obj) {
                                try {
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            InetAddress[] allByName = InetAddress.getAllByName("time.android.com");
                            int length = allByName.length;
                            SocketTimeoutException socketTimeoutException = null;
                            int i = 0;
                            int i2 = 0;
                            while (i < length) {
                                byte[] bArr = new byte[48];
                                DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, allByName[i], 123);
                                bArr[0] = 27;
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                if (jCurrentTimeMillis == 0) {
                                    Arrays.fill(bArr, 40, 48, (byte) 0);
                                } else {
                                    long j = jCurrentTimeMillis / 1000;
                                    long j2 = jCurrentTimeMillis - (j * 1000);
                                    bArr[40] = (byte) (r4 >> 24);
                                    bArr[41] = (byte) (r4 >> 16);
                                    bArr[42] = (byte) (r4 >> 8);
                                    bArr[43] = (byte) (j + 2208988800L);
                                    long j3 = (j2 * LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES) / 1000;
                                    bArr[44] = (byte) (j3 >> 24);
                                    bArr[45] = (byte) (j3 >> 16);
                                    bArr[46] = (byte) (j3 >> 8);
                                    bArr[47] = (byte) (Math.random() * 255.0d);
                                }
                                datagramSocket.send(datagramPacket);
                                try {
                                    datagramSocket.receive(new DatagramPacket(bArr, 48));
                                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                                    long j4 = jCurrentTimeMillis + (jElapsedRealtime2 - jElapsedRealtime);
                                    byte b = bArr[0];
                                    byte b2 = (byte) ((b >> 6) & 3);
                                    byte b3 = (byte) (b & 7);
                                    int i3 = bArr[1] & 255;
                                    long jA00 = CXG.A00(bArr, 24);
                                    long jA002 = CXG.A00(bArr, 32);
                                    long jA003 = CXG.A00(bArr, 40);
                                    if (b2 == 3) {
                                        throw BV4.A0K("SNTP: Unsynchronized server");
                                    }
                                    if (b3 != 4 && b3 != 5) {
                                        throw BV4.A0K(FGI.A0H("SNTP: Untrusted mode: ", b3));
                                    }
                                    if (i3 == 0 || i3 > 15) {
                                        throw BV4.A0K(FGI.A0H("SNTP: Untrusted stratum: ", i3));
                                    }
                                    if (jA003 == 0) {
                                        throw BV4.A0K("SNTP: Zero transmitTime");
                                    }
                                    long jA0I = (j4 + BV6.A0I((jA002 - jA00) + (jA003 - j4))) - jElapsedRealtime2;
                                    datagramSocket.close();
                                    synchronized (obj) {
                                        try {
                                            SystemClock.elapsedRealtime();
                                            CXG.A00 = jA0I;
                                            CXG.A01 = true;
                                        } finally {
                                        }
                                    }
                                } catch (SocketTimeoutException e) {
                                    if (socketTimeoutException == null) {
                                        socketTimeoutException = e;
                                    } else {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(socketTimeoutException, e);
                                    }
                                    int i4 = i2 + 1;
                                    if (i2 >= 10) {
                                        break;
                                    }
                                    i++;
                                    i2 = i4;
                                }
                            }
                            socketTimeoutException.getClass();
                        } catch (Throwable th3) {
                            try {
                                datagramSocket.close();
                                throw th3;
                            } catch (Throwable th4) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                                throw th3;
                            }
                        }
                    }
                } finally {
                }
            }
        }
    }
}
