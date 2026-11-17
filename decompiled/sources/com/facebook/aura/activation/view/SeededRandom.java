package com.facebook.aura.activation.view;

import X.C8j4;

/* loaded from: classes4.dex */
public final class SeededRandom {
    public long state;

    public final float unit() {
        this.state = (this.state * 6364136223846793005L) + 1442695040888963407L;
        return (float) ((r4 >>> 11) / 9.007199254740992E15d);
    }

    public SeededRandom(long j) {
        this.state = j;
    }

    public final float value(float f, float f2) {
        return C8j4.A02(this, f2, f);
    }
}
