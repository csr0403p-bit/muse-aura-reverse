package X;

import java.io.Serializable;

/* renamed from: X.Ds1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5917Ds1 implements Serializable {
    public static final long serialVersionUID = 6776230050133633619L;
    public boolean isBufferConstrainedByMem = false;
    public final int minBufferMs;
    public final int minRebufferMs;

    public final boolean equals(Object obj) {
        if (obj instanceof C5917Ds1) {
            C5917Ds1 c5917Ds1 = (C5917Ds1) obj;
            if (this.minBufferMs == c5917Ds1.minBufferMs && this.minRebufferMs == c5917Ds1.minRebufferMs) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.minBufferMs * 31) + this.minRebufferMs;
    }

    public C5917Ds1(int i, int i2) {
        this.minBufferMs = i;
        this.minRebufferMs = i2;
    }
}
