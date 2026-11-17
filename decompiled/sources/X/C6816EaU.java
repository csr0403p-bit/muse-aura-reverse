package X;

import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: X.EaU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6816EaU implements InterfaceC6834Eam {
    public byte A00;
    public final CRC32 A01;
    public final Inflater A02;
    public final C6819EaX A03;
    public final C6817EaV A04;

    public C6816EaU(InterfaceC6834Eam interfaceC6834Eam) {
        C7384Etj.A0Y(interfaceC6834Eam, 0);
        C6819EaX c6819EaX = new C6819EaX(interfaceC6834Eam);
        this.A03 = c6819EaX;
        Inflater inflater = new Inflater(true);
        this.A02 = inflater;
        this.A04 = new C6817EaV(inflater, c6819EaX);
        this.A01 = new CRC32();
    }

    @Override // X.InterfaceC6834Eam
    public final long AZ7(C6818EaW c6818EaW, long j) throws DataFormatException, IOException {
        C7384Etj.A0Y(c6818EaW, 0);
        if (j < 0) {
            throw BV5.A0R("byteCount < 0: ", j);
        }
        if (j == 0) {
            return 0L;
        }
        byte b = this.A00;
        if (b == 0) {
            C6819EaX c6819EaX = this.A03;
            c6819EaX.AbC(10L);
            C6818EaW c6818EaW2 = c6819EaX.A01;
            byte bA02 = c6818EaW2.A02(3L);
            boolean z = false;
            if (((bA02 >> 1) & 1) == 1) {
                z = true;
                A02(c6818EaW2, 0L, 10L);
            }
            A01("ID1ID2", 8075, c6819EaX.readShort());
            c6819EaX.Afk(8L);
            if (((bA02 >> 2) & 1) == 1) {
                c6819EaX.AbC(2L);
                if (z) {
                    A02(c6818EaW2, 0L, 2L);
                }
                short s = c6818EaW2.readShort();
                long j2 = ((short) (((s & 255) << 8) | ((65280 & s) >>> 8))) & 65535;
                c6819EaX.AbC(j2);
                if (z) {
                    A02(c6818EaW2, 0L, j2);
                }
                c6819EaX.Afk(j2);
            }
            if (((bA02 >> 3) & 1) == 1) {
                long jA01 = C6819EaX.A01(c6819EaX, (byte) 0, LinkEncryptedPairingKt.LINK_COUNTER_MAX);
                if (jA01 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    A02(c6818EaW2, 0L, jA01 + 1);
                }
                c6819EaX.Afk(jA01 + 1);
            }
            if (((bA02 >> 4) & 1) == 1) {
                long jA012 = C6819EaX.A01(c6819EaX, (byte) 0, LinkEncryptedPairingKt.LINK_COUNTER_MAX);
                if (jA012 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    A02(c6818EaW2, 0L, jA012 + 1);
                }
                c6819EaX.Afk(jA012 + 1);
            }
            if (z) {
                c6819EaX.AbC(2L);
                short s2 = c6818EaW2.readShort();
                CRC32 crc32 = this.A01;
                A01("FHCRC", (short) (((s2 & 255) << 8) | ((65280 & s2) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            this.A00 = (byte) 1;
            b = 1;
        }
        if (b != 1) {
            if (b == 2) {
            }
            return -1L;
        }
        long j3 = c6818EaW.A00;
        long jAZ7 = this.A04.AZ7(c6818EaW, j);
        if (jAZ7 != -1) {
            A02(c6818EaW, j3, jAZ7);
            return jAZ7;
        }
        this.A00 = (byte) 2;
        C6819EaX c6819EaX2 = this.A03;
        c6819EaX2.AbC(4L);
        C6818EaW c6818EaW3 = c6819EaX2.A01;
        A01("CRC", A00(c6818EaW3), (int) this.A01.getValue());
        c6819EaX2.AbC(4L);
        A01("ISIZE", A00(c6818EaW3), (int) this.A02.getBytesWritten());
        this.A00 = (byte) 3;
        if (!c6819EaX2.AB9()) {
            throw BV4.A0K("gzip finished without exhausting source");
        }
        return -1L;
    }

    public static final void A01(String str, int i, int i2) throws IOException {
        if (i2 != i) {
            throw BV4.A0K(FGI.A0h(str, ": actual 0x", C7BY.A0P(AbstractC6789EZy.A00(i2), 8), " != expected 0x", C7BY.A0P(AbstractC6789EZy.A00(i), 8)));
        }
    }

    private final void A02(C6818EaW c6818EaW, long j, long j2) {
        C6830Eai c6830Eai = c6818EaW.A01;
        while (true) {
            C7384Etj.A0X(c6830Eai);
            long j3 = c6830Eai.A00 - c6830Eai.A01;
            if (j < j3) {
                break;
            }
            j -= j3;
            c6830Eai = c6830Eai.A02;
        }
        while (j2 > 0) {
            int iA01 = BV4.A01(c6830Eai.A00 - r3, j2);
            this.A01.update(c6830Eai.A06, (int) (c6830Eai.A01 + j), iA01);
            j2 -= iA01;
            c6830Eai = c6830Eai.A02;
            C7384Etj.A0X(c6830Eai);
            j = 0;
        }
    }

    @Override // X.InterfaceC6834Eam
    public final C6848Eb1 Ags() {
        return this.A03.A02.Ags();
    }

    @Override // X.InterfaceC6834Eam, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A04.close();
    }

    public static int A00(C6818EaW c6818EaW) throws EOFException {
        int i = c6818EaW.readInt();
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }
}
