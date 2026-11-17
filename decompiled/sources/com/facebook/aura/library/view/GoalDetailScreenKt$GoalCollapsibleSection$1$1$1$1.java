package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass007;
import X.C3cG;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class GoalDetailScreenKt$GoalCollapsibleSection$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $expanded$delegate;
    public final /* synthetic */ String $goalId;
    public final /* synthetic */ String $goalsSection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalDetailScreenKt$GoalCollapsibleSection$1$1$1$1(String str, String str2, MutableState<Boolean> mutableState) {
        super(0);
        this.$goalId = str;
        this.$goalsSection = str2;
        this.$expanded$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logToggle(!MutableState.A0A((MutableState) this.$expanded$delegate), HatchSurface.GOALS, HatchSubsurface.GOALS, HatchScreen.GOAL_DETAIL, HatchComponent.GOAL_ACTIVE_SECTION_TOGGLE, null, AnonymousClass007.A0d(HatchMetadataKey.GOALS_SECTION.getValue(), this.$goalsSection, C3cG.A0r(HatchMetadataKey.GOAL_ID.getValue(), this.$goalId)));
        MutableState.A09(!MutableState.A0A((MutableState) r1), this.$expanded$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
