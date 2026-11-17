package X;

import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.io.OutputStream;

/* renamed from: X.CFq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3345CFq implements CG5, CG6 {
    public final AbstractC3342CFm A00;

    @Override // X.CG5
    public final String A79() {
        return "application/x-www-form-urlencoded";
    }

    @Override // X.CG6
    public final void release() {
        this.A00.A03();
    }

    @Override // X.CG5
    public final void writeTo(OutputStream outputStream) {
        CFn cFn;
        CFW cfw = new CFW(outputStream, HatchWebPageParserKt.UTF_8);
        AbstractC3342CFm abstractC3342CFm = this.A00;
        synchronized (CFn.class) {
            cFn = CFn.A00;
            if (cFn == null) {
                cFn = new CFn();
                CFn.A00 = cFn;
            }
        }
        abstractC3342CFm.A02 = cFn;
        abstractC3342CFm.A0B(cfw);
    }

    public C3345CFq(AbstractC3342CFm abstractC3342CFm) {
        this.A00 = abstractC3342CFm;
    }
}
