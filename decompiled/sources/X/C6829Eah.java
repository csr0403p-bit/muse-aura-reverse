package X;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* renamed from: X.Eah, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6829Eah implements InterfaceC6833Eal {
    public final /* synthetic */ C6903Ebz A00;
    public final /* synthetic */ InterfaceC6833Eal A01;

    @Override // X.InterfaceC6833Eal
    public final void Aib(C6818EaW c6818EaW, long j) throws IOException {
        long j2 = j;
        C7384Etj.A0Y(c6818EaW, 0);
        AbstractC6789EZy.A01(c6818EaW.A00, 0L, j2);
        while (true) {
            long j3 = 0;
            if (j2 <= 0) {
                return;
            }
            C6830Eai c6830Eai = c6818EaW.A01;
            C7384Etj.A0X(c6830Eai);
            while (true) {
                j3 += c6830Eai.A00 - c6830Eai.A01;
                if (j3 < j2) {
                    c6830Eai = c6830Eai.A02;
                    C7384Etj.A0X(c6830Eai);
                    if (j3 >= 65536) {
                        break;
                    }
                } else {
                    j3 = j2;
                    break;
                }
            }
            C6903Ebz c6903Ebz = this.A00;
            InterfaceC6833Eal interfaceC6833Eal = this.A01;
            c6903Ebz.A07();
            try {
                interfaceC6833Eal.Aib(c6818EaW, j3);
                if (c6903Ebz.A08()) {
                    throw new SocketTimeoutException("timeout");
                }
                j2 -= j3;
            } catch (IOException e) {
                if (!c6903Ebz.A08()) {
                    throw e;
                }
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                socketTimeoutException.initCause(e);
                throw socketTimeoutException;
            } finally {
                c6903Ebz.A08();
            }
        }
    }

    public C6829Eah(C6903Ebz c6903Ebz, InterfaceC6833Eal interfaceC6833Eal) {
        this.A00 = c6903Ebz;
        this.A01 = interfaceC6833Eal;
    }

    @Override // X.InterfaceC6833Eal
    public final /* bridge */ /* synthetic */ C6848Eb1 Ags() {
        return this.A00;
    }

    @Override // X.InterfaceC6833Eal, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C6903Ebz c6903Ebz = this.A00;
        InterfaceC6833Eal interfaceC6833Eal = this.A01;
        c6903Ebz.A07();
        try {
            interfaceC6833Eal.close();
            if (c6903Ebz.A08()) {
                throw new SocketTimeoutException("timeout");
            }
        } catch (IOException e) {
            if (!c6903Ebz.A08()) {
                throw e;
            }
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            socketTimeoutException.initCause(e);
            throw socketTimeoutException;
        } finally {
            c6903Ebz.A08();
        }
    }

    @Override // X.InterfaceC6833Eal, java.io.Flushable
    public final void flush() throws IOException {
        C6903Ebz c6903Ebz = this.A00;
        InterfaceC6833Eal interfaceC6833Eal = this.A01;
        c6903Ebz.A07();
        try {
            interfaceC6833Eal.flush();
            if (c6903Ebz.A08()) {
                throw new SocketTimeoutException("timeout");
            }
        } catch (IOException e) {
            if (!c6903Ebz.A08()) {
                throw e;
            }
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            socketTimeoutException.initCause(e);
            throw socketTimeoutException;
        } finally {
            c6903Ebz.A08();
        }
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A01, C60O.A0x("AsyncTimeout.sink("));
    }
}
