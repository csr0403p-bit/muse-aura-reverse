package X;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* renamed from: X.Ean, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6835Ean implements InterfaceC6834Eam {
    public final /* synthetic */ C6903Ebz A00;
    public final /* synthetic */ InterfaceC6834Eam A01;

    @Override // X.InterfaceC6834Eam
    public final long AZ7(C6818EaW c6818EaW, long j) throws IOException {
        C7384Etj.A0Y(c6818EaW, 0);
        C6903Ebz c6903Ebz = this.A00;
        InterfaceC6834Eam interfaceC6834Eam = this.A01;
        c6903Ebz.A07();
        try {
            long jAZ7 = interfaceC6834Eam.AZ7(c6818EaW, j);
            if (c6903Ebz.A08()) {
                throw new SocketTimeoutException("timeout");
            }
            return jAZ7;
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

    public C6835Ean(C6903Ebz c6903Ebz, InterfaceC6834Eam interfaceC6834Eam) {
        this.A00 = c6903Ebz;
        this.A01 = interfaceC6834Eam;
    }

    @Override // X.InterfaceC6834Eam
    public final /* bridge */ /* synthetic */ C6848Eb1 Ags() {
        return this.A00;
    }

    @Override // X.InterfaceC6834Eam, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C6903Ebz c6903Ebz = this.A00;
        InterfaceC6834Eam interfaceC6834Eam = this.A01;
        c6903Ebz.A07();
        try {
            interfaceC6834Eam.close();
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
        return AnonymousClass007.A0Z(this.A01, C60O.A0x("AsyncTimeout.source("));
    }
}
