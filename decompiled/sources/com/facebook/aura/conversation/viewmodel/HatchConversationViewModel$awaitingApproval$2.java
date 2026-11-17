package com.facebook.aura.conversation.viewmodel;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;

/* loaded from: classes.dex */
public final class HatchConversationViewModel$awaitingApproval$2 extends AbstractC7559F3s implements G0U<Boolean, Long> {
    public static final HatchConversationViewModel$awaitingApproval$2 INSTANCE = new HatchConversationViewModel$awaitingApproval$2();

    public HatchConversationViewModel$awaitingApproval$2() {
        super(1);
    }

    public final Long invoke(boolean z) {
        return Long.valueOf(z ? 0L : 400L);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Long invoke(Boolean bool) {
        return invoke(AnonymousClass001.A1X(bool));
    }
}
