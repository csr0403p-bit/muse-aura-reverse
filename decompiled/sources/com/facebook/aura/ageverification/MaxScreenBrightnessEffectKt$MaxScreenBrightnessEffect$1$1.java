package com.facebook.aura.ageverification;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;

/* loaded from: classes3.dex */
public final class MaxScreenBrightnessEffectKt$MaxScreenBrightnessEffect$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ Activity $activity;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaxScreenBrightnessEffectKt$MaxScreenBrightnessEffect$1$1(Activity activity) {
        super(1);
        this.$activity = activity;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final Window window = this.$activity.getWindow();
        final float f = window.getAttributes().screenBrightness;
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = 1.0f;
        window.setAttributes(attributes);
        return new C78g() { // from class: com.facebook.aura.ageverification.MaxScreenBrightnessEffectKt$MaxScreenBrightnessEffect$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                Window window2 = window;
                WindowManager.LayoutParams attributes2 = window2.getAttributes();
                attributes2.screenBrightness = f;
                window2.setAttributes(attributes2);
            }
        };
    }
}
