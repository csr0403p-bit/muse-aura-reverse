package com.facebook.aura.library.view;

import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.C2nw;
import X.C7384Etj;
import X.C7qW;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchComposerEntryPoint;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.appreview.HatchInAppReviewTrigger;
import com.facebook.aura.conversation.common.HatchPendingMessage;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.GoalCreationBottomSheetKey;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes.dex */
public abstract class GoalCreationKt {
    public static final String NEW_GOAL_CATEGORY = "NEW_GOAL";
    public static final String NEW_TRACKING_CATEGORY = "NEW_TRACKING";

    public static final void openNewGoalSheet(AuraNavigator auraNavigator, boolean z) {
        C7384Etj.A0Y(auraNavigator, 0);
        String str = z ? NEW_TRACKING_CATEGORY : NEW_GOAL_CATEGORY;
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.GOALS, HatchSubsurface.GOALS, HatchScreen.GOALS_HOME, HatchComponent.SET_NEW_GOAL_BUTTON, null, AnonymousClass007.A0c(HatchMetadataKey.GOAL_CATEGORY, str), null);
        auraNavigator.navigate((AuraNavKey) new GoalCreationBottomSheetKey(str), false);
    }

    public static final void openGoalCreationBottomSheet(AuraNavigator auraNavigator, String str) {
        boolean zA1b = AnonymousClass004.A1b(auraNavigator, str);
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.GOALS, HatchSubsurface.GOALS, HatchScreen.GOALS_HOME, HatchComponent.GOAL_CATEGORY_ROW, null, AnonymousClass007.A0c(HatchMetadataKey.GOAL_CATEGORY, str), null);
        auraNavigator.navigate(new GoalCreationBottomSheetKey(str), zA1b);
    }

    public static final void sendCategoryPromptToChat(Context context, AuraNavigator auraNavigator, GoalCreationCategory goalCreationCategory) {
        AnonymousClass005.A0x(context, auraNavigator, goalCreationCategory);
        C2nw c2nw = new C2nw();
        C2nw c2nw2 = new C2nw();
        C7qW.A06("kind", goalCreationCategory.getName(), c2nw2);
        c2nw.A01("goal_creation_target", new JsonObject(c2nw2.A00));
        HatchPendingMessage.INSTANCE.setPendingMessage(new HatchPendingMessage.PendingPayload(context.getString(goalCreationCategory.getPromptRes()), HatchComposerEntryPoint.NEW_GOAL, null, AnonymousClass006.A10("metadata", new JsonObject(c2nw.A00))));
        HatchInAppReviewTrigger.INSTANCE.onGoalCreationRequested();
        AnonymousClass006.A1D(auraNavigator);
    }

    public static final void sendGenericGoalPromptToChat(Context context, AuraNavigator auraNavigator) {
        AnonymousClass003.A0u(context, auraNavigator);
        HatchPendingMessage.INSTANCE.setPendingCreateGoalMessage(context);
        HatchInAppReviewTrigger.INSTANCE.onGoalCreationRequested();
        AnonymousClass006.A1D(auraNavigator);
    }

    public static final void sendNewGoalPromptToChat(AuraNavigator auraNavigator, String str) {
        AnonymousClass003.A0u(auraNavigator, str);
        HatchPendingMessage.INSTANCE.setPendingComposerText(str, HatchComposerEntryPoint.NEW_GOAL);
        HatchInAppReviewTrigger.INSTANCE.onGoalCreationRequested();
        AnonymousClass006.A1D(auraNavigator);
    }
}
