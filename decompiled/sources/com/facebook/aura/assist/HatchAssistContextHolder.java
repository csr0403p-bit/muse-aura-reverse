package com.facebook.aura.assist;

import X.BLG;
import X.C1BN;
import X.C3cG;
import X.C9286GCn;
import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class HatchAssistContextHolder {
    public static final int $stable = 0;
    public static final HatchAssistContextHolder INSTANCE = new HatchAssistContextHolder();
    public static final BLG<Bitmap> _screenshot;
    public static long generation;
    public static final C1BN<Bitmap> screenshot;

    public final synchronized long beginInvocation() {
        long j;
        _screenshot.Af8(null);
        j = generation + 1;
        generation = j;
        return j;
    }

    public final synchronized void clearIfCurrent(long j) {
        if (j == generation) {
            _screenshot.Af8(null);
        }
    }

    public final synchronized void setScreenshot(Bitmap bitmap) {
        _screenshot.Af8(bitmap);
    }

    static {
        C9286GCn c9286GCnA13 = C3cG.A13();
        _screenshot = c9286GCnA13;
        screenshot = C3cG.A11(c9286GCnA13);
    }

    public final C1BN<Bitmap> getScreenshot() {
        return screenshot;
    }
}
