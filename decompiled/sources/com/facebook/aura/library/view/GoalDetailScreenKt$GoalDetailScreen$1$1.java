package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;

/* loaded from: classes.dex */
public final class GoalDetailScreenKt$GoalDetailScreen$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ String $goalId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalDetailScreenKt$GoalDetailScreen$1$1(String str) {
        super(1);
        this.$goalId = str;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        HatchImpressionLogger.INSTANCE.logImpression(HatchOrigin.GOALS, HatchSurface.GOALS, HatchSubsurface.GOALS, HatchScreen.GOAL_DETAIL, HatchComponent.GOAL_CARD, null, AnonymousClass006.A10(HatchMetadataKey.GOAL_ID.getValue(), this.$goalId), null);
        return new C78g() { // from class: com.facebook.aura.library.view.GoalDetailScreenKt$GoalDetailScreen$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
