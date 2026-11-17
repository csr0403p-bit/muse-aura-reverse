package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchConnectorCategoryScreenKey;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogSectionUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConnectorCatalogScreenKt$ConnectorCatalogHomepage$2$1$2$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ ConnectorCatalogSectionUiState $section;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorCatalogScreenKt$ConnectorCatalogHomepage$2$1$2$1$1$1(ConnectorCatalogSectionUiState connectorCatalogSectionUiState, AuraNavigator auraNavigator) {
        super(0);
        this.$section = connectorCatalogSectionUiState;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchConnectorCatalogScreenKt.logSeeAllConnectors(this.$section.category.id);
        this.$navigator.navigate((AuraNavKey) new HatchConnectorCategoryScreenKey(this.$section.category.id), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
