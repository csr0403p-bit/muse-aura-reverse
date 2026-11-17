package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchConnectorSearchScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConnectorSearchEntryKt$ConnectorCatalogSearchEntry$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $categoryId;
    public final /* synthetic */ boolean $deviceOnly;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorSearchEntryKt$ConnectorCatalogSearchEntry$1$1(AuraNavigator auraNavigator, String str, boolean z) {
        super(0);
        this.$navigator = auraNavigator;
        this.$categoryId = str;
        this.$deviceOnly = z;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ConnectorSettingsAnalytics.INSTANCE.logSearchBarClick();
        this.$navigator.navigate((AuraNavKey) new HatchConnectorSearchScreenKey(this.$categoryId, this.$deviceOnly), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
