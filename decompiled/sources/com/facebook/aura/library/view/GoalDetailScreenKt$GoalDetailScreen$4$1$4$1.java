package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C1BO;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComposerEntryPoint;
import com.facebook.aura.conversation.common.HatchPendingMessage;
import com.facebook.aura.library.repo.Goal;
import com.facebook.aura.library.repo.GoalDetail;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class GoalDetailScreenKt$GoalDetailScreen$4$1$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C1BO<GoalDetail> $goalDetail$delegate;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ MutableState<Boolean> $showMenu$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalDetailScreenKt$GoalDetailScreen$4$1$4$1(MutableState<Boolean> mutableState, C1BO<GoalDetail> c1bo, Context context, AuraNavigator auraNavigator) {
        super(0);
        this.$showMenu$delegate = mutableState;
        this.$goalDetail$delegate = c1bo;
        this.$context = context;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Goal goal;
        MutableState.A09(false, this.$showMenu$delegate);
        GoalDetail value = this.$goalDetail$delegate.getValue();
        if (value == null || (goal = value.goal) == null) {
            return;
        }
        Context context = this.$context;
        AuraNavigator auraNavigator = this.$navigator;
        HatchPendingMessage hatchPendingMessage = HatchPendingMessage.INSTANCE;
        String str = goal.title;
        if (str == null) {
            str = "";
        }
        hatchPendingMessage.setPendingComposerText(context.getString(R.string._name_removed__res_0x7f12023d, str), AnonymousClass006.A10("parent_goal_id", goal.id), HatchComposerEntryPoint.GOAL_SUBGOAL);
        ConversationTabScreenKey conversationTabScreenKey = ConversationTabScreenKey.INSTANCE;
        auraNavigator.popToTabRoot(conversationTabScreenKey);
        auraNavigator.navigate(conversationTabScreenKey, LaunchFlag.BRING_TO_FRONT);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
