package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConnectionsAddPermissionSheetKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectionsAddPermissionScreenKt$ConnectionsAddPermissionScreen$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $chatText;
    public final /* synthetic */ MutableState<Boolean> $isSending$delegate;
    public final /* synthetic */ ConnectionsAddPermissionSheetKey $key;
    public final /* synthetic */ ConnectionsLogContext $log;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsAddPermissionScreenKt$ConnectionsAddPermissionScreen$1$1$1(ConnectionsLogContext connectionsLogContext, AuraNavigator auraNavigator, ConnectionsAddPermissionSheetKey connectionsAddPermissionSheetKey, String str, MutableState<Boolean> mutableState) {
        super(0);
        this.$log = connectionsLogContext;
        this.$navigator = auraNavigator;
        this.$key = connectionsAddPermissionSheetKey;
        this.$chatText = str;
        this.$isSending$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PairsAnalytics.INSTANCE.click$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(this.$log.screen, HatchComponent.CONTINUE_BUTTON, null, null);
        MutableState.A09(true, this.$isSending$delegate);
        ConnectionsAddPermissionScreenKt.continueInChat(this.$navigator, this.$key.connectionId, this.$chatText);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
