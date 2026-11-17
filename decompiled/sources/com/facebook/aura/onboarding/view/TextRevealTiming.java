package com.facebook.aura.onboarding.view;

import X.AnonymousClass005;
import X.C06G;

/* loaded from: classes2.dex */
public final class TextRevealTiming extends C06G {
    public static final int $stable = 0;
    public final float lineDurationMs;
    public final float lineOffsetMs;
    public final float startMs;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TextRevealTiming) {
                TextRevealTiming textRevealTiming = (TextRevealTiming) obj;
                if (Float.compare(this.startMs, textRevealTiming.startMs) != 0 || Float.compare(this.lineDurationMs, textRevealTiming.lineDurationMs) != 0 || Float.compare(this.lineOffsetMs, textRevealTiming.lineOffsetMs) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ TextRevealTiming copy$default(TextRevealTiming textRevealTiming, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = textRevealTiming.startMs;
        }
        if ((i & 2) != 0) {
            f2 = textRevealTiming.lineDurationMs;
        }
        if ((i & 4) != 0) {
            f3 = textRevealTiming.lineOffsetMs;
        }
        return new TextRevealTiming(f, f2, f3);
    }

    public final float component1() {
        return this.startMs;
    }

    public final float component2() {
        return this.lineDurationMs;
    }

    public final float component3() {
        return this.lineOffsetMs;
    }

    public final TextRevealTiming copy(float f, float f2, float f3) {
        return new TextRevealTiming(f, f2, f3);
    }

    public final float endMs(int i) {
        float f = this.startMs;
        int i2 = i - 1;
        if (i2 < 0) {
            i2 = 0;
        }
        return f + (i2 * this.lineOffsetMs) + this.lineDurationMs;
    }

    public final float getLineDurationMs() {
        return this.lineDurationMs;
    }

    public final float getLineOffsetMs() {
        return this.lineOffsetMs;
    }

    public final float getStartMs() {
        return this.startMs;
    }

    public int hashCode() {
        return AnonymousClass005.A02(Float.floatToIntBits(this.startMs) * 31, this.lineDurationMs) + Float.floatToIntBits(this.lineOffsetMs);
    }

    public TextRevealTiming(float f, float f2, float f3) {
        this.startMs = f;
        this.lineDurationMs = f2;
        this.lineOffsetMs = f3;
    }

    public String toString() {
        return super.toString();
    }
}
