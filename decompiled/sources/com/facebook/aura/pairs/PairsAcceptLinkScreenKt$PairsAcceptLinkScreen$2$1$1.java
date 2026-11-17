package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.PairsAcceptLinkSheetKey;
import com.facebook.aura.navigation.key.PairsAcceptPreferencesSheetKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class PairsAcceptLinkScreenKt$PairsAcceptLinkScreen$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ PairsAcceptLinkSheetKey $key;
    public final /* synthetic */ ConnectionsLogContext $log;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairsAcceptLinkScreenKt$PairsAcceptLinkScreen$2$1$1(ConnectionsLogContext connectionsLogContext, AuraNavigator auraNavigator, PairsAcceptLinkSheetKey pairsAcceptLinkSheetKey) {
        super(0);
        this.$log = connectionsLogContext;
        this.$navigator = auraNavigator;
        this.$key = pairsAcceptLinkSheetKey;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PairsAnalytics.INSTANCE.click$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(this.$log.screen, HatchComponent.CONTINUE_BUTTON, null, null);
        this.$navigator.navigate((AuraNavKey) new PairsAcceptPreferencesSheetKey(this.$key.token, false), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
