package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import android.app.Activity;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;

/* loaded from: classes.dex */
public final class HatchFeedbackSheetKt$HatchFeedbackSheet$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<Activity> $latestHostActivity$delegate;
    public final /* synthetic */ C1BO<Boolean> $wasSubmitted$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchFeedbackSheetKt$HatchFeedbackSheet$1$1(C1BO<? extends Activity> c1bo, C1BO<Boolean> c1bo2) {
        super(1);
        this.$latestHostActivity$delegate = c1bo;
        this.$wasSubmitted$delegate = c1bo2;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final C1BO<Activity> c1bo = this.$latestHostActivity$delegate;
        final C1BO<Boolean> c1bo2 = this.$wasSubmitted$delegate;
        return new C78g() { // from class: com.facebook.aura.conversation.view.HatchFeedbackSheetKt$HatchFeedbackSheet$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                Activity activity;
                Activity activity2 = (Activity) c1bo.getValue();
                boolean z = true;
                if ((activity2 == null || !activity2.isFinishing()) && ((activity = (Activity) c1bo.getValue()) == null || !activity.isChangingConfigurations())) {
                    z = false;
                }
                if (C1BO.A0F(c1bo2) || z) {
                    return;
                }
                HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.CHAT, HatchSubsurface.RESPONSE_TOOLBAR, HatchScreen.MAIN_CHAT, HatchComponent.CLOSE_BUTTON, null, null);
            }
        };
    }
}
