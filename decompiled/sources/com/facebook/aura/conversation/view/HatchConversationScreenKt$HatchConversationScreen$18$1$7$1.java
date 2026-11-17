package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionEnumsKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConversationSearchScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationScreenKt$HatchConversationScreen$18$1$7$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $isPrimaryThread;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $threadId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationScreenKt$HatchConversationScreen$18$1$7$1(boolean z, String str, AuraNavigator auraNavigator) {
        super(0);
        this.$isPrimaryThread = z;
        this.$threadId = str;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.CHAT;
        HatchSubsurface hatchSubsurface = HatchSubsurface.HEADER;
        boolean z = this.$isPrimaryThread;
        hatchInteractionLogger.logClick(hatchSurface, hatchSubsurface, HatchInteractionEnumsKt.chatScreen(z), HatchComponent.SEARCH_BUTTON, null, AnonymousClass002.A0o(null, this.$threadId, z), null);
        this.$navigator.navigate((AuraNavKey) new ConversationSearchScreenKey(null), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
