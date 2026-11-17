package X;

import java.io.IOException;

/* renamed from: X.Ec3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6906Ec3 extends AbstractC6894Ebq {
    public boolean A00;
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
        if (!this.A00) {
            long jAZ7 = super.AZ7(c6818EaW, j);
            if (jAZ7 != -1) {
                return jAZ7;
            }
            this.A00 = true;
            A00();
        }
        return -1L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6906Ec3(C6863EbL c6863EbL) {
        super(c6863EbL);
        this.A01 = c6863EbL;
    }

    @Override // X.InterfaceC6834Eam, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (super.A00) {
            return;
        }
        if (!this.A00) {
            A00();
        }
        super.A00 = true;
    }
}
