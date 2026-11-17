package X;

import java.nio.ByteBuffer;

/* renamed from: X.Ead, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6825Ead implements EcA {
    public boolean A00;
    public final C6818EaW A01 = new C6818EaW();
    public final InterfaceC6833Eal A02;

    @Override // X.InterfaceC6833Eal
    public final void Aib(C6818EaW c6818EaW, long j) {
        C7384Etj.A0Y(c6818EaW, 0);
        if (this.A00) {
            throw BV4.A0R();
        }
        this.A01.Aib(c6818EaW, j);
        A00(this);
    }

    @Override // X.EcA
    public final void Aic(C6788EZx c6788EZx) {
        C7384Etj.A0Y(c6788EZx, 0);
        if (this.A00) {
            throw BV4.A0R();
        }
        c6788EZx.A09(this.A01, c6788EZx.A0C());
        A00(this);
    }

    @Override // X.EcA
    public final void Aj6(String str) {
        C7384Etj.A0Y(str, 0);
        if (this.A00) {
            throw BV4.A0R();
        }
        this.A01.A0B(str, 0, str.length());
        A00(this);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        if (this.A00) {
            throw BV4.A0R();
        }
        int iWrite = this.A01.write(byteBuffer);
        A00(this);
        return iWrite;
    }

    public static final void A00(C6825Ead c6825Ead) {
        if (c6825Ead.A00) {
            throw BV4.A0R();
        }
        C6818EaW c6818EaW = c6825Ead.A01;
        long j = c6818EaW.A00;
        if (j != 0) {
            C6830Eai c6830Eai = c6818EaW.A01;
            C7384Etj.A0X(c6830Eai);
            C6830Eai c6830Eai2 = c6830Eai.A03;
            C7384Etj.A0X(c6830Eai2);
            if (c6830Eai2.A00 < 8192 && c6830Eai2.A04) {
                j -= r1 - c6830Eai2.A01;
            }
            if (j > 0) {
                c6825Ead.A02.Aib(c6818EaW, j);
            }
        }
    }

    @Override // X.EcA
    public final C6818EaW AD5() {
        return this.A01;
    }

    @Override // X.InterfaceC6833Eal
    public final C6848Eb1 Ags() {
        return this.A02.Ags();
    }

    @Override // X.EcA
    public final void Aif(int i) {
        if (this.A00) {
            throw BV4.A0R();
        }
        this.A01.Aif(i);
        A00(this);
    }

    @Override // X.EcA
    public final void Ail(long j) {
        if (this.A00) {
            throw BV4.A0R();
        }
        this.A01.Ail(j);
        A00(this);
    }

    @Override // X.EcA
    public final void Ain(int i) {
        if (this.A00) {
            throw BV4.A0R();
        }
        this.A01.Ain(i);
        A00(this);
    }

    @Override // X.EcA
    public final void Aiw(int i) {
        if (this.A00) {
            throw BV4.A0R();
        }
        C6818EaW c6818EaW = this.A01;
        C6830Eai c6830EaiA06 = c6818EaW.A06(2);
        byte[] bArr = c6830EaiA06.A06;
        int i2 = c6830EaiA06.A00;
        BV5.A1C(i >>> 8, bArr, i2);
        BV5.A1C(i, bArr, i2 + 1);
        c6830EaiA06.A00 = i2 + 2;
        c6818EaW.A00 += 2;
        A00(this);
    }

    @Override // X.InterfaceC6833Eal, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        if (this.A00) {
            return;
        }
        try {
            C6818EaW c6818EaW = this.A01;
            long j = c6818EaW.A00;
            if (j > 0) {
                this.A02.Aib(c6818EaW, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.A02.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.A00 = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // X.EcA, X.InterfaceC6833Eal, java.io.Flushable
    public final void flush() {
        if (this.A00) {
            throw BV4.A0R();
        }
        C6818EaW c6818EaW = this.A01;
        long j = c6818EaW.A00;
        if (j > 0) {
            this.A02.Aib(c6818EaW, j);
        }
        this.A02.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.A00;
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A02, C60O.A0x("buffer("));
    }

    public C6825Ead(InterfaceC6833Eal interfaceC6833Eal) {
        this.A02 = interfaceC6833Eal;
    }
}
