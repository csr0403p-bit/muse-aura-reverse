package X;

import java.io.Serializable;

/* renamed from: X.Dsj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5949Dsj extends C06G implements Serializable {
    public static final long serialVersionUID = 1;
    public final int bufferForPlaybackMs;
    public final int individualAllocationSize;
    public final int maxBufferMs;
    public final int minBufferMs;
    public final int rebufferMs;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5949Dsj) {
                C5949Dsj c5949Dsj = (C5949Dsj) obj;
                if (this.minBufferMs != c5949Dsj.minBufferMs || this.maxBufferMs != c5949Dsj.maxBufferMs || this.bufferForPlaybackMs != c5949Dsj.bufferForPlaybackMs || this.rebufferMs != c5949Dsj.rebufferMs || this.individualAllocationSize != c5949Dsj.individualAllocationSize) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5949Dsj() {
        int i = 0;
        this(i, i, i, i, i, 31, null);
    }

    public final int hashCode() {
        return (((((((this.minBufferMs * 31) + this.maxBufferMs) * 31) + this.bufferForPlaybackMs) * 31) + this.rebufferMs) * 31) + this.individualAllocationSize;
    }

    public /* synthetic */ C5949Dsj(int i, int i2, int i3, int i4, int i5, int i6, C06H c06h) {
        this.minBufferMs = 1000;
        this.maxBufferMs = 2000;
        this.bufferForPlaybackMs = 1000;
        this.rebufferMs = 1000;
        this.individualAllocationSize = 32768;
    }
}
