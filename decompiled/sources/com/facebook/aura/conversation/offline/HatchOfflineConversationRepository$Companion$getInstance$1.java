package com.facebook.aura.conversation.offline;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C3cG;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchOfflineConversationRepository$Companion$getInstance$1 extends AbstractC7559F3s implements Function0<HatchOfflineConversationRepository> {
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchOfflineConversationRepository$Companion$getInstance$1(AbstractC3358CGz abstractC3358CGz) {
        super(0);
        this.$userSession = abstractC3358CGz;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final HatchOfflineConversationRepository invoke() {
        return new HatchOfflineConversationRepository(C3cG.A06(), this.$userSession);
    }
}
