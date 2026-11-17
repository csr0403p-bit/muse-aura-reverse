package X;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class DQ3<K> extends C5034DPt<K> {
    public transient int A00;
    public transient long[] A01;
    public transient int A02;

    public DQ3() {
        A09(3, 1.0f);
    }

    private void A01(int pred, int succ) {
        if (pred == -2) {
            this.A00 = succ;
        } else {
            long[] jArr = this.A01;
            jArr[pred] = C8j3.A0V(succ, jArr[pred] & (-4294967296L));
        }
        if (succ == -2) {
            this.A02 = pred;
        } else {
            long[] jArr2 = this.A01;
            jArr2[succ] = (jArr2[succ] & 4294967295L) | (pred << 32);
        }
    }

    @Override // X.C5034DPt
    public final void A07(int dstIndex) {
        int i = super.A02 - 1;
        long[] jArr = this.A01;
        long j = jArr[dstIndex];
        A01((int) (j >>> 32), (int) j);
        if (dstIndex < i) {
            A01((int) (jArr[i] >>> 32), dstIndex);
            A01(dstIndex, (int) jArr[i]);
        }
        super.A07(dstIndex);
    }

    @Override // X.C5034DPt
    public final void A06() {
        super.A06();
        this.A00 = -2;
        this.A02 = -2;
    }

    @Override // X.C5034DPt
    public final void A08(int newCapacity) {
        super.A08(newCapacity);
        long[] jArr = this.A01;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, newCapacity);
        this.A01 = jArrCopyOf;
        Arrays.fill(jArrCopyOf, length, newCapacity, -1L);
    }

    @Override // X.C5034DPt
    public final void A09(int expectedSize, float loadFactor) {
        super.A09(expectedSize, loadFactor);
        this.A00 = -2;
        this.A02 = -2;
        long[] jArr = new long[expectedSize];
        this.A01 = jArr;
        Arrays.fill(jArr, -1L);
    }

    /* JADX WARN: Incorrect types in method signature: (ITK;II)V */
    @Override // X.C5034DPt
    public final void A0A(Object entryIndex, int key, int value, int hash) {
        super.A0A(entryIndex, key, value, hash);
        A01(this.A02, key);
        A01(key, -2);
    }
}
