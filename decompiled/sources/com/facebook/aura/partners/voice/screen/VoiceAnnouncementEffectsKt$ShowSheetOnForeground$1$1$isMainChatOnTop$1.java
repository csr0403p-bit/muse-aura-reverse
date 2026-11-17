package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1$isMainChatOnTop$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1$isMainChatOnTop$1(AuraNavigator auraNavigator) {
        super(0);
        this.$navigator = auraNavigator;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(C7384Etj.areEqual(C3cG.A0H(this.$navigator), ConversationTabScreenKey.INSTANCE));
    }
}
