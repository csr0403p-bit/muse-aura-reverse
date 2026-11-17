package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.navigation.AuraNavigator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectionsShareStatusScreenKt$ConnectionsOpenChatButton$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchScreen $logScreen;
    public final /* synthetic */ Map<String, String> $metadata;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsShareStatusScreenKt$ConnectionsOpenChatButton$1$1(HatchScreen hatchScreen, Map<String, String> map, AuraNavigator auraNavigator) {
        super(0);
        this.$logScreen = hatchScreen;
        this.$metadata = map;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PairsAnalytics.INSTANCE.click$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(this.$logScreen, HatchComponent.OPEN_CHAT_BUTTON, null, this.$metadata);
        ConnectionsShareStatusScreenKt.openMainChat(this.$navigator);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
