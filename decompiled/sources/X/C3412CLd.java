package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.CLd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3412CLd implements DAV, InterfaceC4878DAv {
    public final AtomicReference<CLc> A00;
    public final AtomicBoolean A01;

    @Override // X.DAV
    public final void AQF(String str, String str2) {
        C7384Etj.A0Y(str2, 1);
        CLc cLc = this.A00.get();
        if (cLc != null) {
            cLc.A01.markerAnnotate(cLc.A00, str, str2);
        }
    }

    @Override // X.InterfaceC4878DAv
    public final DKP A8z() {
        this.A01.set(false);
        CLc andSet = this.A00.getAndSet(null);
        if (andSet != null) {
            return andSet.A01;
        }
        return null;
    }

    @Override // X.InterfaceC4878DAv
    public final void A9w(int i) {
        AtomicReference<CLc> atomicReference = this.A00;
        CLc cLc = new CLc(i);
        boolean andSet = this.A01.getAndSet(false);
        atomicReference.set(cLc);
        if (andSet) {
            cLc.A01.markerAnnotate(cLc.A00, "annotationsDroppedBeforeEnable", true);
        }
    }

    @Override // X.DAV
    public final void AQD(String str, int i) {
        CLc cLc = this.A00.get();
        if (cLc != null) {
            cLc.A01.markerAnnotate(cLc.A00, str, i);
        }
    }

    @Override // X.DAV
    public final void markerPoint(String str) {
        CLc cLc = this.A00.get();
        if (cLc != null) {
            cLc.A01.markerPoint(cLc.A00, str);
        }
    }

    public C3412CLd(int i) {
        this.A01 = C60O.A1E();
        this.A00 = BV4.A16(new CLc(i));
    }

    public C3412CLd() {
        this.A01 = C60O.A1E();
        this.A00 = BV5.A1A();
    }
}
