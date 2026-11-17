package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchComposerEntryPoint;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class GoalDiscussionKt$rememberGoalDiscussion$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Integer $absolutePosition;
    public final /* synthetic */ String $contextLabel;
    public final /* synthetic */ String $goalId;
    public final /* synthetic */ String $goalTitle;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HatchScreen $screen;
    public final /* synthetic */ HatchConversationViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalDiscussionKt$rememberGoalDiscussion$1$1(HatchScreen hatchScreen, String str, Integer num, HatchConversationViewModel hatchConversationViewModel, String str2, String str3, AuraNavigator auraNavigator) {
        super(0);
        this.$screen = hatchScreen;
        this.$goalId = str;
        this.$absolutePosition = num;
        this.$viewModel = hatchConversationViewModel;
        this.$goalTitle = str2;
        this.$contextLabel = str3;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        GoalRowOverflowMenuKt.logGoalRowClick(HatchComponent.GOAL_DISCUSS_BUTTON, this.$screen, this.$goalId, HatchSubsurface.DOT_MENU, this.$absolutePosition);
        this.$viewModel.stageGoalDiscussion(this.$goalId, this.$goalTitle, this.$contextLabel);
        this.$viewModel.setPendingEntryPoint(HatchComposerEntryPoint.GOAL_DISCUSS, this.$goalId);
        AuraNavigator auraNavigator = this.$navigator;
        ConversationTabScreenKey conversationTabScreenKey = ConversationTabScreenKey.INSTANCE;
        auraNavigator.popToTabRoot(conversationTabScreenKey);
        this.$navigator.navigate(conversationTabScreenKey, LaunchFlag.BRING_TO_FRONT);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
