package com.facebook.aura.conversation.api;

import X.AbstractC7559F3s;
import X.C3cG;
import X.G0U;

/* loaded from: classes2.dex */
public final class ConversationCardRequests$isRecentlyDeclined$1$1 extends AbstractC7559F3s implements G0U<Long, Boolean> {
    public final /* synthetic */ long $now;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationCardRequests$isRecentlyDeclined$1$1(long j) {
        super(1);
        this.$now = j;
    }

    public final Boolean invoke(long j) {
        return Boolean.valueOf(this.$now - j >= 60000);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Boolean invoke(Long l) {
        return invoke(C3cG.A05(l));
    }
}
