package X;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: X.EaV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6817EaV implements InterfaceC6834Eam {
    public int A00;
    public boolean A01;
    public final Inflater A02;
    public final InterfaceC6831Eaj A03;

    @Override // X.InterfaceC6834Eam
    public final long AZ7(C6818EaW c6818EaW, long j) throws DataFormatException, IOException {
        C7384Etj.A0Y(c6818EaW, 0);
        while (j >= 0) {
            if (this.A01) {
                throw BV4.A0R();
            }
            if (j != 0) {
                try {
                    C6830Eai c6830EaiA06 = c6818EaW.A06(1);
                    int iA01 = BV4.A01(j, 8192 - c6830EaiA06.A00);
                    Inflater inflater = this.A02;
                    if (inflater.needsInput()) {
                        InterfaceC6831Eaj interfaceC6831Eaj = this.A03;
                        if (!interfaceC6831Eaj.AB9()) {
                            C6830Eai c6830Eai = interfaceC6831Eaj.AD5().A01;
                            C7384Etj.A0X(c6830Eai);
                            int i = c6830Eai.A00;
                            int i2 = c6830Eai.A01;
                            int i3 = i - i2;
                            this.A00 = i3;
                            inflater.setInput(c6830Eai.A06, i2, i3);
                        }
                    }
                    int iInflate = inflater.inflate(c6830EaiA06.A06, c6830EaiA06.A00, iA01);
                    int i4 = this.A00;
                    if (i4 != 0) {
                        int remaining = i4 - inflater.getRemaining();
                        this.A00 -= remaining;
                        this.A03.Afk(remaining);
                    }
                    if (iInflate > 0) {
                        c6830EaiA06.A00 += iInflate;
                        long j2 = iInflate;
                        c6818EaW.A00 += j2;
                        if (j2 > 0) {
                            return j2;
                        }
                    } else {
                        C6830Eai.A00(c6818EaW, c6830EaiA06, c6830EaiA06.A01);
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            Inflater inflater2 = this.A02;
            if (inflater2.finished() || inflater2.needsDictionary()) {
                return -1L;
            }
            if (this.A03.AB9()) {
                throw new EOFException("source exhausted prematurely");
            }
        }
        throw BV5.A0R("byteCount < 0: ", j);
    }

    @Override // X.InterfaceC6834Eam
    public final C6848Eb1 Ags() {
        return this.A03.Ags();
    }

    @Override // X.InterfaceC6834Eam, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.A01) {
            return;
        }
        this.A02.end();
        this.A01 = true;
        this.A03.close();
    }

    public C6817EaV(Inflater inflater, InterfaceC6831Eaj interfaceC6831Eaj) {
        this.A03 = interfaceC6831Eaj;
        this.A02 = inflater;
    }
}
