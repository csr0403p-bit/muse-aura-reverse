package X;

/* loaded from: classes5.dex */
public final class DMF extends AbstractC3582CVd<DMF> {
    public long realtimeMs;
    public long uptimeMs;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && BV5.A1T(this, obj)) {
                DMF dmf = (DMF) obj;
                if (this.uptimeMs != dmf.uptimeMs || this.realtimeMs != dmf.realtimeMs) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C8j4.A0B(this.realtimeMs, AnonymousClass005.A07(this.uptimeMs));
    }

    public final String toString() {
        return FGI.A0b("TimeMetrics{uptimeMs=", ", realtimeMs=", "}", this.uptimeMs, this.realtimeMs);
    }
}
