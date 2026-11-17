package X;

import java.time.Instant;
import java.util.Map;

/* renamed from: X.Fvf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8980Fvf {
    public final Instant A00;
    public final Map<String, String> A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8980Fvf) {
                C8980Fvf c8980Fvf = (C8980Fvf) obj;
                if (!this.A00.equals(c8980Fvf.A00) || !this.A01.equals(c8980Fvf.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, AnonymousClass005.A0E(this.A00));
    }

    public final String toString() {
        return C3cJ.A0L(this.A01, ", anchors=", C3cG.A0f(this.A00, "MetaHealthObserverResumeState(startDate="));
    }

    public C8980Fvf(Instant instant, Map<String, String> map) {
        this.A00 = instant;
        this.A01 = map;
    }
}
