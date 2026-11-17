package com.facebook.aura.globaleffects;

import X.AbstractC7559F3s;
import android.app.Activity;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchUiControlEffectsKt$UiControlNavigationEffect$1$1$isVisible$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ Activity $activity;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchUiControlEffectsKt$UiControlNavigationEffect$1$1$isVisible$1(Activity activity) {
        super(0);
        this.$activity = activity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Activity activity = this.$activity;
        boolean z = false;
        if (activity != null && !activity.isInPictureInPictureMode()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
