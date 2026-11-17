package com.facebook.aura.spaces.view;

import X.AbstractC7559F3s;
import com.facebook.aura.conversation.common.HatchPendingMessage;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSpacesModalScreenKt$SpaceOverflowMenu$3$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $prompt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSpacesModalScreenKt$SpaceOverflowMenu$3$1$1(String str, AuraNavigator auraNavigator) {
        super(0);
        this.$prompt = str;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchPendingMessage hatchPendingMessage = HatchPendingMessage.INSTANCE;
        hatchPendingMessage.setPendingComposerText(this.$prompt, null);
        hatchPendingMessage.notifyMainChatAssistLaunch();
        this.$navigator.navigate((AuraNavKey) ConversationTabScreenKey.INSTANCE, true);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
