package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.C7BY;
import X.G0U;
import X.G2k;
import com.facebook.aura.gateway.HatchSessionItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$onArchivedThreadClick$1$1 extends AbstractC7559F3s implements G0U<HatchSessionItem, Unit> {
    public final /* synthetic */ Function0<Unit> $onDismissRequest;
    public final /* synthetic */ G2k<String, String, Boolean, String, Long, Unit> $onThreadSelected;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSessionItem hatchSessionItem) {
        C7384Etj.A0Y(hatchSessionItem, 0);
        HatchConversationHistorySidePanelKt.logThreadClick(hatchSessionItem, true);
        this.$onDismissRequest.invoke();
        G2k<String, String, Boolean, String, Long, Unit> g2k = this.$onThreadSelected;
        String str = hatchSessionItem.sessionId;
        String str2 = hatchSessionItem.title;
        if (str2 == null || C7BY.A0j(str2)) {
            str2 = null;
        }
        g2k.invoke(str, str2, false, null, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$onArchivedThreadClick$1$1(Function0<Unit> function0, G2k<? super String, ? super String, ? super Boolean, ? super String, ? super Long, Unit> g2k) {
        super(1);
        this.$onDismissRequest = function0;
        this.$onThreadSelected = g2k;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSessionItem hatchSessionItem) {
        invoke2(hatchSessionItem);
        return Unit.INSTANCE;
    }
}
