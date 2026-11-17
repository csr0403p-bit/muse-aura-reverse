package X;

/* loaded from: classes5.dex */
public final class EBv {
    public int A00;
    public int A01;

    public final void A00(int i) {
        int i2;
        int i3 = this.A01;
        if (i3 < i || (i2 = this.A00) <= 0) {
            AbstractC3422CMk.A07("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(this.A00));
        } else {
            this.A00 = i2 - 1;
            this.A01 = i3 - i;
        }
    }
}
