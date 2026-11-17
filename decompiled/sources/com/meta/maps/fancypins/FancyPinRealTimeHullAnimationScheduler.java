package com.meta.maps.fancypins;

import X.C7384Etj;
import android.animation.ValueAnimator;

/* loaded from: classes6.dex */
public final class FancyPinRealTimeHullAnimationScheduler implements FancyPinHullAnimationScheduler {
    public static final FancyPinRealTimeHullAnimationScheduler INSTANCE = new FancyPinRealTimeHullAnimationScheduler();

    @Override // com.meta.maps.fancypins.FancyPinHullAnimationScheduler
    public void start(ValueAnimator valueAnimator) {
        C7384Etj.A0Y(valueAnimator, 0);
        valueAnimator.start();
    }
}
