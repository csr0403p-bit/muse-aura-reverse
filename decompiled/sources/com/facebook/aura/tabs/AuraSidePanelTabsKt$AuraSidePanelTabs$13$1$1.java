package com.facebook.aura.tabs;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.conversation.common.HatchPendingMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSidePanelTabsKt$AuraSidePanelTabs$13$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ Function0<Unit> $onMainChatSelected;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        HatchPendingMessage hatchPendingMessage = HatchPendingMessage.INSTANCE;
        hatchPendingMessage.setPendingComposerText(str, null);
        hatchPendingMessage.notifyMainChatAssistLaunch();
        this.$onMainChatSelected.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSidePanelTabsKt$AuraSidePanelTabs$13$1$1(Function0<Unit> function0) {
        super(1);
        this.$onMainChatSelected = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
