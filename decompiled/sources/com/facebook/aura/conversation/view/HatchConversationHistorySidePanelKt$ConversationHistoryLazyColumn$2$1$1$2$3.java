package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.gateway.HatchSessionItem;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$1$1$2$3 extends AbstractC7559F3s implements G0V<Integer, HatchSessionItem, Object> {
    public static final HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$1$1$2$3 INSTANCE = new HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$1$1$2$3();

    public HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$1$1$2$3() {
        super(2);
    }

    public final Object invoke(int i, HatchSessionItem hatchSessionItem) {
        C7384Etj.A0Y(hatchSessionItem, 1);
        return hatchSessionItem.sessionId;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(Integer num, HatchSessionItem hatchSessionItem) {
        AnonymousClass005.A0w(num);
        HatchSessionItem hatchSessionItem2 = hatchSessionItem;
        C7384Etj.A0Y(hatchSessionItem2, 1);
        return hatchSessionItem2.sessionId;
    }
}
