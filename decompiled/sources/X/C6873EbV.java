package X;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.EbV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6873EbV implements Closeable {
    public static final Logger A05 = BV5.A1B(EGW.class);
    public int A00;
    public boolean A01;
    public final C6883Ebf A02;
    public final C6818EaW A03;
    public final EcA A04;

    public final synchronized void A01() {
        if (this.A01) {
            throw BV4.A0J();
        }
        this.A04.flush();
    }

    public final synchronized void A02(int i, long j) {
        if (this.A01) {
            throw BV4.A0J();
        }
        if (j == 0 || j > 2147483647L) {
            throw C7384Etj.A0D(Long.valueOf(j), "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ");
        }
        A00(this, i, 4, 8, 0);
        EcA ecA = this.A04;
        ecA.Ain((int) j);
        ecA.flush();
    }

    public final synchronized void A03(Ec2 ec2, int i) throws IOException {
        if (this.A01) {
            throw BV4.A0J();
        }
        if (ec2.httpCode == -1) {
            throw BV4.A0O();
        }
        A00(this, i, 4, 3, 0);
        EcA ecA = this.A04;
        ecA.Ain(ec2.httpCode);
        ecA.flush();
    }

    public final synchronized void A04(C6818EaW c6818EaW, int i, int i2, boolean z) {
        if (this.A01) {
            throw BV4.A0J();
        }
        A00(this, i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            EcA ecA = this.A04;
            C7384Etj.A0X(c6818EaW);
            ecA.Aib(c6818EaW, i2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.A01 = true;
        this.A04.close();
    }

    public static final void A00(C6873EbV c6873EbV, int i, int i2, int i3, int i4) {
        Logger logger = A05;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(EGW.A00.A00(i, i2, i3, i4, false));
        }
        int i5 = c6873EbV.A00;
        if (i2 > i5) {
            throw C8j3.A0v("FRAME_SIZE_ERROR length > ", ": ", i5, i2);
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw C7384Etj.A0D(Integer.valueOf(i), "reserved bit set: ");
        }
        EcA ecA = c6873EbV.A04;
        byte[] bArr = AbstractC6843Eav.A06;
        ecA.Aif((i2 >>> 16) & 255);
        ecA.Aif((i2 >>> 8) & 255);
        ecA.Aif(i2 & 255);
        ecA.Aif(i3 & 255);
        ecA.Aif(i4 & 255);
        ecA.Ain(Integer.MAX_VALUE & i);
    }

    public C6873EbV(EcA ecA) {
        this.A04 = ecA;
        C6818EaW c6818EaW = new C6818EaW();
        this.A03 = c6818EaW;
        this.A00 = 16384;
        this.A02 = new C6883Ebf(c6818EaW);
    }
}
