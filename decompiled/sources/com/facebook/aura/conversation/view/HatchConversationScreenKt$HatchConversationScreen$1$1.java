package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;

/* loaded from: classes.dex */
public final class HatchConversationScreenKt$HatchConversationScreen$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationScreenKt$HatchConversationScreen$1$1(AuraNavigator auraNavigator) {
        super(1);
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$navigator.navigate(ConversationTabScreenKey.INSTANCE, LaunchFlag.REPLACE_BACKSTACK);
        return new C78g() { // from class: com.facebook.aura.conversation.view.HatchConversationScreenKt$HatchConversationScreen$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
