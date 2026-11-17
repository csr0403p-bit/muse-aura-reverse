package androidx.media3.common.util;

import X.FGI;

/* loaded from: classes5.dex */
public final class StuckPlayerException extends IllegalStateException {
    public final int stuckType;
    public final int timeoutMs;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                StuckPlayerException stuckPlayerException = (StuckPlayerException) obj;
                if (this.stuckType != stuckPlayerException.stuckType || this.timeoutMs != stuckPlayerException.timeoutMs) {
                }
            }
            return false;
        }
        return true;
    }

    public StuckPlayerException(int i, int i2) {
        super(FGI.A0I(i != 1 ? i != 2 ? i != 3 ? "Player stuck suppressed for " : "Player stuck playing without ending for " : "Player stuck playing with no progress for " : "Player stuck buffering with no progress for ", i2, " ms"));
        this.stuckType = i;
        this.timeoutMs = i2;
    }

    public final int hashCode() {
        return ((527 + this.stuckType) * 31) + this.timeoutMs;
    }
}
