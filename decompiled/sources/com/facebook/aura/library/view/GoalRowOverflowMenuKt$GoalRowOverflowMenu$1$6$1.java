package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchComposerEntryPoint;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.conversation.common.HatchPendingMessage;
import com.facebook.aura.library.repo.Goal;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class GoalRowOverflowMenuKt$GoalRowOverflowMenu$1$6$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Integer $absolutePosition;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Goal $goal;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ HatchScreen $screen;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalRowOverflowMenuKt$GoalRowOverflowMenu$1$6$1(Function0<Unit> function0, HatchScreen hatchScreen, Goal goal, Integer num, Context context, AuraNavigator auraNavigator) {
        super(0);
        this.$onDismiss = function0;
        this.$screen = hatchScreen;
        this.$goal = goal;
        this.$absolutePosition = num;
        this.$context = context;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onDismiss.invoke();
        GoalRowOverflowMenuKt.logGoalRowClick(HatchComponent.GOAL_SUB_GOAL_BUTTON, this.$screen, this.$goal.id, HatchSubsurface.DOT_MENU, this.$absolutePosition);
        HatchPendingMessage hatchPendingMessage = HatchPendingMessage.INSTANCE;
        Context context = this.$context;
        String str = this.$goal.title;
        if (str == null) {
            str = "";
        }
        hatchPendingMessage.setPendingComposerText(context.getString(R.string._name_removed__res_0x7f12023d, str), AnonymousClass006.A10("parent_goal_id", this.$goal.id), HatchComposerEntryPoint.GOAL_SUBGOAL);
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
