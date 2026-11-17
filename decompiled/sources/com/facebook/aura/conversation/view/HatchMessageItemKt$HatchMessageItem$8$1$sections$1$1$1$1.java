package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import com.facebook.aura.conversation.viewmodel.ReplyAttributionUiModel;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.IdeaWidgetDetailSheetKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageItemKt$HatchMessageItem$8$1$sections$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ ReplyAttributionUiModel $resolvedAttribution;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageItemKt$HatchMessageItem$8$1$sections$1$1$1$1(ReplyAttributionUiModel replyAttributionUiModel, AuraNavigator auraNavigator) {
        super(0);
        this.$resolvedAttribution = replyAttributionUiModel;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IdeaWidgetDetailDataHolder.INSTANCE.put(((ReplyAttributionUiModel.Idea) this.$resolvedAttribution).idea);
        this.$navigator.navigate((AuraNavKey) new IdeaWidgetDetailSheetKey(((ReplyAttributionUiModel.Idea) this.$resolvedAttribution).idea.ideaId), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
