package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.F2f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7548F2f {
    public static final AtomicReference<C7548F2f> A01 = BV4.A16(new C7548F2f(null));
    public final C7467Ex0 A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C7548F2f) && C7384Etj.areEqual(this.A00, ((C7548F2f) obj).A00));
    }

    public final int hashCode() {
        return AnonymousClass006.A0D(this.A00);
    }

    public final String toString() {
        return C3cJ.A0M("AppState(firstRunInfo=", this.A00);
    }

    public C7548F2f(C7467Ex0 c7467Ex0) {
        this.A00 = c7467Ex0;
    }

    public C7548F2f() {
        this(null);
    }
}
