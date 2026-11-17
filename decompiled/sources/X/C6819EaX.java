package X;

import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.localbrowser.LocalBrowserNodeHandler;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;

/* renamed from: X.EaX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6819EaX implements InterfaceC6831Eaj {
    public boolean A00;
    public final C6818EaW A01 = new C6818EaW();
    public final InterfaceC6834Eam A02;

    @Override // X.InterfaceC6831Eaj
    public final long ANX(C6788EZx c6788EZx) {
        C7384Etj.A0Y(c6788EZx, 0);
        long jMax = 0;
        if (this.A00) {
            throw new IllegalStateException(LocalBrowserNodeHandler.CLOSED);
        }
        while (true) {
            C6818EaW c6818EaW = this.A01;
            long jA05 = c6818EaW.A05(c6788EZx, jMax);
            if (jA05 != -1) {
                return jA05;
            }
            long j = c6818EaW.A00;
            if (this.A02.AZ7(c6818EaW, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (A00(r3, r6) == (-1)) goto L12;
     */
    @Override // X.InterfaceC6834Eam
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long AZ7(X.C6818EaW r7, long r8) {
        /*
            r6 = this;
            r0 = 0
            X.C7384Etj.A0Y(r7, r0)
            r4 = 0
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 < 0) goto L35
            boolean r0 = r6.A00
            if (r0 != 0) goto L30
            X.EaW r3 = r6.A01
            long r1 = r3.A00
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L25
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 == 0) goto L24
            long r1 = A00(r3, r6)
            r4 = -1
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L25
        L24:
            return r4
        L25:
            long r0 = r3.A00
            long r0 = java.lang.Math.min(r8, r0)
            long r4 = r3.AZ7(r7, r0)
            return r4
        L30:
            java.lang.IllegalStateException r0 = X.BV4.A0R()
            throw r0
        L35:
            java.lang.String r0 = "byteCount < 0: "
            java.lang.IllegalArgumentException r0 = X.BV5.A0R(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6819EaX.AZ7(X.EaW, long):long");
    }

    @Override // X.InterfaceC6831Eaj
    public final int AcQ(C6832Eak c6832Eak) throws EOFException {
        C7384Etj.A0Y(c6832Eak, 0);
        if (this.A00) {
            throw new IllegalStateException(LocalBrowserNodeHandler.CLOSED);
        }
        while (true) {
            C6818EaW c6818EaW = this.A01;
            int iA00 = AbstractC6827Eaf.A00(c6818EaW, c6832Eak, true);
            if (iA00 != -2) {
                if (iA00 != -1) {
                    c6818EaW.Afk(c6832Eak.A01[iA00].A0C());
                    return iA00;
                }
            } else if (this.A02.AZ7(c6818EaW, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        C6818EaW c6818EaW = this.A01;
        if (c6818EaW.A00 == 0 && A00(c6818EaW, this) == -1) {
            return -1;
        }
        return c6818EaW.read(byteBuffer);
    }

    public static long A00(C6818EaW c6818EaW, C6819EaX c6819EaX) {
        return c6819EaX.A02.AZ7(c6818EaW, 8192L);
    }

    public static final long A01(C6819EaX c6819EaX, byte b, long j) {
        if (c6819EaX.A00) {
            throw BV4.A0R();
        }
        if (0 > j) {
            StringBuilder sbA0g = C3cG.A0g("fromIndex=");
            sbA0g.append(0L);
            throw C60O.A0i(BV7.A0z(" toIndex=", sbA0g, j));
        }
        long jMax = 0;
        while (jMax < j) {
            C6818EaW c6818EaW = c6819EaX.A01;
            long jA04 = c6818EaW.A04(b, jMax, j);
            if (jA04 != -1) {
                return jA04;
            }
            long j2 = c6818EaW.A00;
            if (j2 >= j || A00(c6818EaW, c6819EaX) == -1) {
                break;
            }
            jMax = Math.max(jMax, j2);
        }
        return -1L;
    }

    public static void A02(Socket socket, C6862EbK c6862EbK) {
        C6893Ebp c6893Ebp = new C6893Ebp(socket);
        InputStream inputStream = socket.getInputStream();
        C7384Etj.A0U(inputStream);
        c6862EbK.A0B = new C6819EaX(new C6835Ean(c6893Ebp, new C6821EaZ(inputStream, c6893Ebp)));
        C6893Ebp c6893Ebp2 = new C6893Ebp(socket);
        OutputStream outputStream = socket.getOutputStream();
        C7384Etj.A0U(outputStream);
        c6862EbK.A0A = new C6825Ead(new C6829Eah(c6893Ebp2, new C6824Eac(outputStream, c6893Ebp2)));
    }

    @Override // X.InterfaceC6831Eaj
    public final boolean AB9() {
        if (this.A00) {
            throw BV4.A0R();
        }
        C6818EaW c6818EaW = this.A01;
        return c6818EaW.AB9() && A00(c6818EaW, this) == -1;
    }

    @Override // X.InterfaceC6831Eaj, X.EcA
    public final C6818EaW AD5() {
        return this.A01;
    }

    @Override // X.InterfaceC6831Eaj
    public final byte[] AZA() {
        C6818EaW c6818EaW = this.A01;
        while (this.A02.AZ7(c6818EaW, 8192L) != -1) {
        }
        return c6818EaW.AZB(c6818EaW.A00);
    }

    @Override // X.InterfaceC6831Eaj
    public final long AZN() throws EOFException {
        byte bA02;
        byte b;
        AbC(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!Ab8(i2)) {
                break;
            }
            bA02 = this.A01.A02(i);
            if (bA02 < 48) {
                break;
            }
            if (bA02 > 57) {
                if (bA02 < 97) {
                    if (bA02 < 65) {
                        break;
                    }
                    b = 70;
                } else {
                    b = 102;
                }
                if (bA02 > b) {
                    break;
                }
            }
            i = i2;
        }
        if (i == 0) {
            String string = Integer.toString(bA02, 16);
            C7384Etj.A0U(string);
            throw BV6.A0k(FGI.A0M("Expected leading [0-9a-fA-F] character but was 0x", string));
        }
        return this.A01.AZN();
    }

    @Override // X.InterfaceC6831Eaj
    public final String AZb(long j) throws EOFException {
        if (j < 0) {
            throw BV5.A0R("limit < 0: ", j);
        }
        long j2 = j == LinkEncryptedPairingKt.LINK_COUNTER_MAX ? LinkEncryptedPairingKt.LINK_COUNTER_MAX : j + 1;
        long jA01 = A01(this, (byte) 10, j2);
        if (jA01 != -1) {
            return AbstractC6827Eaf.A01(this.A01, jA01);
        }
        if (j2 < LinkEncryptedPairingKt.LINK_COUNTER_MAX && Ab8(j2)) {
            C6818EaW c6818EaW = this.A01;
            if (c6818EaW.A02(j2 - 1) == 13 && Ab8(1 + j2) && c6818EaW.A02(j2) == 10) {
                return AbstractC6827Eaf.A01(c6818EaW, j2);
            }
        }
        C6818EaW c6818EaW2 = new C6818EaW();
        C6818EaW c6818EaW3 = this.A01;
        c6818EaW3.A0C(c6818EaW2, 0L, Math.min(32L, c6818EaW3.A00));
        StringBuilder sbA0x = C60O.A0x("\\n not found: limit=");
        sbA0x.append(Math.min(c6818EaW3.A00, j));
        sbA0x.append(" content=");
        sbA0x.append(c6818EaW2.AZC(c6818EaW2.A00).A06());
        throw new EOFException(C8j3.A16(sbA0x, '\u2026'));
    }

    @Override // X.InterfaceC6831Eaj
    public final boolean Ab8(long j) {
        C6818EaW c6818EaW;
        if (j < 0) {
            throw new IllegalArgumentException(FGI.A0B(j, "byteCount < 0: "));
        }
        if (this.A00) {
            throw new IllegalStateException(LocalBrowserNodeHandler.CLOSED);
        }
        do {
            c6818EaW = this.A01;
            if (c6818EaW.A00 >= j) {
                return true;
            }
        } while (this.A02.AZ7(c6818EaW, 8192L) != -1);
        return false;
    }

    @Override // X.InterfaceC6831Eaj
    public final void Afk(long j) throws EOFException {
        if (this.A00) {
            throw BV4.A0R();
        }
        while (j > 0) {
            C6818EaW c6818EaW = this.A01;
            if (c6818EaW.A00 == 0 && A00(c6818EaW, this) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, c6818EaW.A00);
            c6818EaW.Afk(jMin);
            j -= jMin;
        }
    }

    @Override // X.InterfaceC6834Eam
    public final C6848Eb1 Ags() {
        return this.A02.Ags();
    }

    @Override // X.InterfaceC6834Eam, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws EOFException {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        this.A02.close();
        C6818EaW c6818EaW = this.A01;
        c6818EaW.Afk(c6818EaW.A00);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.A00;
    }

    @Override // X.InterfaceC6831Eaj
    public final byte readByte() throws EOFException {
        AbC(1L);
        return this.A01.readByte();
    }

    @Override // X.InterfaceC6831Eaj
    public final int readInt() throws EOFException {
        AbC(4L);
        return this.A01.readInt();
    }

    @Override // X.InterfaceC6831Eaj
    public final short readShort() throws EOFException {
        AbC(2L);
        return this.A01.readShort();
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A02, C60O.A0x("buffer("));
    }

    public C6819EaX(InterfaceC6834Eam interfaceC6834Eam) {
        this.A02 = interfaceC6834Eam;
    }

    @Override // X.InterfaceC6831Eaj
    public final byte[] AZB(long j) throws EOFException {
        AbC(j);
        return this.A01.AZB(j);
    }

    @Override // X.InterfaceC6831Eaj
    public final C6788EZx AZC(long j) throws EOFException {
        AbC(j);
        return this.A01.AZC(j);
    }

    @Override // X.InterfaceC6831Eaj
    public final void AbC(long j) throws EOFException {
        if (!Ab8(j)) {
            throw new EOFException();
        }
    }

    @Override // X.InterfaceC6831Eaj
    public final String AZa() {
        return AZb(LinkEncryptedPairingKt.LINK_COUNTER_MAX);
    }
}
