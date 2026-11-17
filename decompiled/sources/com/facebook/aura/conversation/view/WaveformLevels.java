package com.facebook.aura.conversation.view;

/* loaded from: classes.dex */
public final class WaveformLevels {
    public final float[] values;

    public final float get(int i) {
        return this.values[i];
    }

    public final int getSize() {
        return this.values.length;
    }

    public WaveformLevels(int i, int i2) {
        float[] fArr = new float[i2];
        long j = i & 4294967295L;
        j = j == 0 ? 2654435769L : j;
        for (int i3 = 0; i3 < i2; i3++) {
            j = (j * 6364136223846793005L) + 1442695040888963407L;
            fArr[i3] = (((65535 & ((int) (j >>> 33))) / 65535.0f) * 0.86f) + 0.14f;
        }
        this.values = fArr;
    }
}
