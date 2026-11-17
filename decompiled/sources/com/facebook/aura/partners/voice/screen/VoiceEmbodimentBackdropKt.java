package com.facebook.aura.partners.voice.screen;

import X.ATD;
import X.Ab3;
import X.BLU;
import X.C3WD;

/* loaded from: classes4.dex */
public abstract class VoiceEmbodimentBackdropKt {
    public static final BLU callAvatarFullScreenFrameBounds(int i, int i2) {
        float f = i;
        float f2 = i2;
        float fMin = Math.min(f, f2 * 0.5833333f);
        float f3 = fMin / 0.5833333f;
        float f4 = (f - fMin) / 2.0f;
        float f5 = (f2 - f3) / 2.0f;
        return new BLU(Ab3.A01(f4), Ab3.A01(f5), Ab3.A01(f4 + fMin), Ab3.A01(f5 + f3));
    }

    public static final BLU callAvatarExpandingFrameBounds(int i, int i2, float f, int i3, float f2) {
        BLU bluCallAvatarFrameBounds = callAvatarFrameBounds(i, i2, f);
        if (f2 <= 0.0f || i3 * 0.5833333f >= i) {
            return bluCallAvatarFrameBounds;
        }
        BLU bluCallAvatarFullScreenFrameBounds = callAvatarFullScreenFrameBounds(i, i3);
        return new BLU(C3WD.A01(f2, bluCallAvatarFrameBounds.A01, bluCallAvatarFullScreenFrameBounds.A01), C3WD.A01(f2, bluCallAvatarFrameBounds.A03, bluCallAvatarFullScreenFrameBounds.A03), C3WD.A01(f2, bluCallAvatarFrameBounds.A02, bluCallAvatarFullScreenFrameBounds.A02), C3WD.A01(f2, bluCallAvatarFrameBounds.A00, bluCallAvatarFullScreenFrameBounds.A00));
    }

    public static final BLU callAvatarFrameBounds(int i, int i2, float f) {
        if (i2 < i) {
            float f2 = i2 / 0.5833333f;
            int i3 = (i - i2) / 2;
            int iA02 = Ab3.A02(-f2, f);
            return new BLU(i3, iA02, i2 + i3, Ab3.A01(f2) + iA02);
        }
        float f3 = i / 0.5833333f;
        float f4 = i2;
        float fA03 = f4 >= f3 ? (f4 - f3) / 2.0f : ATD.A03((f4 / 2.0f) - ((f + 0.29166666f) * f3), f4 - f3, 0.0f);
        return new BLU(0, Ab3.A01(fA03), i, Ab3.A01(fA03 + f3));
    }
}
