package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.gateway.HatchSessionItem;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchArchivedSideChatsScreenKt$HatchArchivedSideChatsScreen$2$2$1 extends AbstractC7559F3s implements G0U<HatchSessionItem, Unit> {
    public final /* synthetic */ G0U<HatchSessionItem, Unit> $onThreadClick;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSessionItem hatchSessionItem) {
        C7384Etj.A0Y(hatchSessionItem, 0);
        HatchConversationHistorySidePanelKt.logThreadClick(hatchSessionItem, true);
        this.$onThreadClick.invoke(hatchSessionItem);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchArchivedSideChatsScreenKt$HatchArchivedSideChatsScreen$2$2$1(G0U<? super HatchSessionItem, Unit> g0u) {
        super(1);
        this.$onThreadClick = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSessionItem hatchSessionItem) {
        invoke2(hatchSessionItem);
        return Unit.INSTANCE;
    }
}
