package X;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class DQB implements DQC {
    public final DQA A00;

    public DQB(int[] iArr) {
        int length;
        this.A00 = (iArr == null || (length = iArr.length) == 0) ? DQA.A00 : new DQA(Arrays.copyOf(iArr, length));
    }
}
