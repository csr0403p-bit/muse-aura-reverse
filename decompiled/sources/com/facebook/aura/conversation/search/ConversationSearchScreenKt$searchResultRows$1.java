package com.facebook.aura.conversation.search;

import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.C7384Etj;
import X.G0V;

/* loaded from: classes.dex */
public final class ConversationSearchScreenKt$searchResultRows$1 extends AbstractC7559F3s implements G0V<Integer, com.facebook.aura.conversation.data.HatchSearchHit, Object> {
    public static final ConversationSearchScreenKt$searchResultRows$1 INSTANCE = new ConversationSearchScreenKt$searchResultRows$1();

    public ConversationSearchScreenKt$searchResultRows$1() {
        super(2);
    }

    public final Object invoke(int i, com.facebook.aura.conversation.data.HatchSearchHit hatchSearchHit) {
        C7384Etj.A0Y(hatchSearchHit, 1);
        return hatchSearchHit.messageId;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(Integer num, com.facebook.aura.conversation.data.HatchSearchHit hatchSearchHit) {
        AnonymousClass005.A0w(num);
        com.facebook.aura.conversation.data.HatchSearchHit hatchSearchHit2 = hatchSearchHit;
        C7384Etj.A0Y(hatchSearchHit2, 1);
        return hatchSearchHit2.messageId;
    }
}
