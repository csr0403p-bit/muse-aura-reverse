package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.C1BO;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConnectionsAddPermissionSheetKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectionsGuidanceSectionKt$ConnectionsGuidanceSection$1$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $addPrompt;
    public final /* synthetic */ String $connectionId;
    public final /* synthetic */ ConnectionsLogContext $log;
    public final /* synthetic */ String $name;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ C1BO<ConnectionsGuidanceUiState> $uiState$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsGuidanceSectionKt$ConnectionsGuidanceSection$1$1$2$1(ConnectionsLogContext connectionsLogContext, String str, AuraNavigator auraNavigator, String str2, String str3, C1BO<ConnectionsGuidanceUiState> c1bo) {
        super(0);
        this.$log = connectionsLogContext;
        this.$connectionId = str;
        this.$navigator = auraNavigator;
        this.$name = str2;
        this.$addPrompt = str3;
        this.$uiState$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PairsAnalytics.INSTANCE.click$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(this.$log.screen, HatchComponent.ADD_PERMISSION_BUTTON, HatchSubsurface.CONNECTION_PERMISSIONS, null);
        if (this.$connectionId == null || !this.$uiState$delegate.getValue().canEdit) {
            ConnectionsGuidanceSectionKt.openChatWithPrompt(this.$navigator, this.$addPrompt);
        } else {
            this.$navigator.navigate((AuraNavKey) new ConnectionsAddPermissionSheetKey(this.$connectionId, this.$name), false);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
