package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class HzW {
    public final float[] A00;
    public final int[] A01;

    public HzW(List<Integer> list, List<Float> list2) {
        int size = list.size();
        this.A01 = new int[size];
        this.A00 = new float[size];
        for (int i = 0; i < size; i++) {
            this.A01[i] = C8j4.A0H(list, i);
            this.A00[i] = C8j4.A03(list2, i);
        }
    }

    public HzW(int i, int i2, int i3) {
        this.A01 = new int[]{i, i2, i3};
        this.A00 = new float[]{0.0f, 0.5f, 1.0f};
    }

    public HzW(int i, int i2) {
        this.A01 = new int[]{i, i2};
        this.A00 = new float[]{0.0f, 1.0f};
    }
}
