package X;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Ebl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6889Ebl extends AbstractC6894Ebq {
    public long A00;
    public final /* synthetic */ C6863EbL A01;

    @Override // X.AbstractC6894Ebq, X.InterfaceC6834Eam
    public final long AZ7(C6818EaW c6818EaW, long j) throws IOException {
        C7384Etj.A0Y(c6818EaW, 0);
        if (j < 0) {
            throw C7384Etj.A0D(Long.valueOf(j), "byteCount < 0: ");
        }
        if (super.A00) {
            throw BV4.A0R();
        }
        long j2 = this.A00;
        if (j2 == 0) {
            return -1L;
        }
        long jAZ7 = super.AZ7(c6818EaW, Math.min(j2, j));
        if (jAZ7 == -1) {
            this.A01.A03.A01();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            A00();
            throw protocolException;
        }
        long j3 = this.A00 - jAZ7;
        this.A00 = j3;
        if (j3 == 0) {
            A00();
        }
        return jAZ7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6889Ebl(C6863EbL c6863EbL, long j) {
        super(c6863EbL);
        this.A01 = c6863EbL;
        this.A00 = j;
        if (j == 0) {
            A00();
        }
    }

    @Override // X.InterfaceC6834Eam, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (super.A00) {
            return;
        }
        if (this.A00 != 0) {
            if (!AbstractC6843Eav.A0F(TimeUnit.MILLISECONDS, this, 100)) {
                this.A01.A03.A01();
                A00();
            }
        }
        super.A00 = true;
    }
}
