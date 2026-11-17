package X;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public final class CG4 implements CG5, CG6 {
    public CG5 A00;

    @Override // X.CG5
    public final String A79() {
        return this.A00.A79();
    }

    @Override // X.CG6
    public final void release() {
        CG5 cg5 = this.A00;
        if (cg5 instanceof CG6) {
            ((CG6) cg5).release();
        }
    }

    @Override // X.CG5
    public final void writeTo(OutputStream outputStream) throws IOException {
        C8B c8b = new C8B(outputStream);
        try {
            this.A00.writeTo(c8b);
        } finally {
            c8b.close();
        }
    }
}
