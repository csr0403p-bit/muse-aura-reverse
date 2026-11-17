package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class F67 extends Throwable implements FFJ {
    public final F9H mSourceMapNode;

    @Override // X.FFJ
    public final List<String> ACv() {
        F9H f9h = this.mSourceMapNode;
        ArrayList arrayListA0x = null;
        while (f9h != null) {
            F9G f9gACu = f9h.ACu();
            if (f9gACu == null) {
                break;
            }
            arrayListA0x = AbstractC7609F5w.A0x(arrayListA0x);
            arrayListA0x.add(f9gACu.A01);
            f9h = f9gACu.A00;
        }
        return arrayListA0x;
    }

    @Override // X.FFJ
    public final void AHF() {
        F9H f9h = this.mSourceMapNode;
        if (f9h != null) {
            f9h.getLoggingId();
        }
    }

    public F67(F9H f9h, Throwable th) {
        super(th);
        this.mSourceMapNode = f9h;
    }

    @Override // X.FFJ
    public final void AFP() {
        Throwable cause = getCause();
        if (cause != null) {
            cause.getMessage();
        }
    }

    @Override // X.FFJ
    public final void AHu() {
        getCause();
    }
}
