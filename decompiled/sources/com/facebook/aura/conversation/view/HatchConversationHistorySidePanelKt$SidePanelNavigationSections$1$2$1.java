package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import android.content.Context;
import com.facebook.aura.conversation.common.HatchPendingMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$SidePanelNavigationSections$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Function0<Unit> $onMainChatClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationHistorySidePanelKt$SidePanelNavigationSections$1$2$1(Context context, Function0<Unit> function0) {
        super(0);
        this.$context = context;
        this.$onMainChatClick = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchPendingMessage hatchPendingMessage = HatchPendingMessage.INSTANCE;
        hatchPendingMessage.setPendingCreateSpaceMessage(this.$context);
        hatchPendingMessage.notifyMainChatAssistLaunch();
        this.$onMainChatClick.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
