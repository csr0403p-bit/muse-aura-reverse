package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import com.facebook.aura.conversation.viewmodel.ReplyAttributionUiModel;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.GoalDetailScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageItemKt$HatchMessageItem$8$1$sections$1$1$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ ReplyAttributionUiModel $resolvedAttribution;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageItemKt$HatchMessageItem$8$1$sections$1$1$4$1(AuraNavigator auraNavigator, ReplyAttributionUiModel replyAttributionUiModel) {
        super(0);
        this.$navigator = auraNavigator;
        this.$resolvedAttribution = replyAttributionUiModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AuraNavigator auraNavigator = this.$navigator;
        ReplyAttributionUiModel.Goal goal = (ReplyAttributionUiModel.Goal) this.$resolvedAttribution;
        auraNavigator.navigate((AuraNavKey) new GoalDetailScreenKey(goal.goalId, goal.getPreviewText(), null), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
