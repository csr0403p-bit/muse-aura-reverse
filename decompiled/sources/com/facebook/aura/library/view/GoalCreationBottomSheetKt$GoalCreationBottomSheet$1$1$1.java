package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.GoalCreationBottomSheetKey;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class GoalCreationBottomSheetKt$GoalCreationBottomSheet$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Map<String, String> $categoryMetadata;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ boolean $fromSectionHeader;
    public final /* synthetic */ GoalCategory $goalCategory;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $newGoalPrompt;

    /* renamed from: com.facebook.aura.library.view.GoalCreationBottomSheetKt$GoalCreationBottomSheet$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public final Boolean invoke(AuraNavKey auraNavKey) {
            C7384Etj.A0Y(auraNavKey, 0);
            return Boolean.valueOf(auraNavKey instanceof GoalCreationBottomSheetKey);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalCreationBottomSheetKt$GoalCreationBottomSheet$1$1$1(Map<String, String> map, AuraNavigator auraNavigator, boolean z, String str, GoalCategory goalCategory, Context context) {
        super(0);
        this.$categoryMetadata = map;
        this.$navigator = auraNavigator;
        this.$fromSectionHeader = z;
        this.$newGoalPrompt = str;
        this.$goalCategory = goalCategory;
        this.$context = context;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.GOALS, HatchSubsurface.GOALS, HatchScreen.GOAL_CREATION_BOTTOM_SHEET, HatchComponent.GOAL_CREATION_CONFIRM_BUTTON, null, this.$categoryMetadata, null);
        this.$navigator.popAll(AnonymousClass1.INSTANCE);
        if (this.$fromSectionHeader) {
            GoalCreationKt.sendNewGoalPromptToChat(this.$navigator, this.$newGoalPrompt);
            return;
        }
        GoalCategory goalCategory = this.$goalCategory;
        Context context = this.$context;
        AuraNavigator auraNavigator = this.$navigator;
        if (goalCategory == null) {
            GoalCreationKt.sendGenericGoalPromptToChat(context, auraNavigator);
        } else {
            GoalCreationKt.sendCategoryPromptToChat(context, auraNavigator, goalCategory);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
