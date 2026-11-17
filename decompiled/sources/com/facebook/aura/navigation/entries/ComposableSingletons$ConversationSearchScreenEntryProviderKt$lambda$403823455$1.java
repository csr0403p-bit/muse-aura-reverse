package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.conversation.search.ConversationSearchScreenKt;
import com.facebook.aura.navigation.key.ConversationSearchScreenKey;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$ConversationSearchScreenEntryProviderKt$lambda$403823455$1 extends AbstractC7559F3s implements G0W<ConversationSearchScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ConversationSearchScreenEntryProviderKt$lambda$403823455$1 INSTANCE = new ComposableSingletons$ConversationSearchScreenEntryProviderKt$lambda$403823455$1();

    public ComposableSingletons$ConversationSearchScreenEntryProviderKt$lambda$403823455$1() {
        super(3);
    }

    public final void invoke(ConversationSearchScreenKey conversationSearchScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(conversationSearchScreenKey, 0);
        ConversationSearchScreenKt.ConversationSearchScreen(conversationSearchScreenKey.initialQuery, bfm, 0, 0);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ConversationSearchScreenKey conversationSearchScreenKey, BFM bfm, Integer num) {
        invoke(conversationSearchScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
