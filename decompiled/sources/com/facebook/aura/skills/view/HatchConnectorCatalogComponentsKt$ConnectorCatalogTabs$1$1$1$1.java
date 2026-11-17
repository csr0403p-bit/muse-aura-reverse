package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogTab;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConnectorCatalogComponentsKt$ConnectorCatalogTabs$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<ConnectorCatalogTab, Unit> $selectTab;
    public final /* synthetic */ ConnectorCatalogTab $selectedTab;
    public final /* synthetic */ ConnectorCatalogTab $tab;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConnectorCatalogComponentsKt$ConnectorCatalogTabs$1$1$1$1(ConnectorCatalogTab connectorCatalogTab, ConnectorCatalogTab connectorCatalogTab2, G0U<? super ConnectorCatalogTab, Unit> g0u) {
        super(0);
        this.$tab = connectorCatalogTab;
        this.$selectedTab = connectorCatalogTab2;
        this.$selectTab = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ConnectorCatalogTab connectorCatalogTab = this.$tab;
        if (connectorCatalogTab != this.$selectedTab) {
            HatchConnectorCatalogComponentsKt.logConnectorsSegmentClick(connectorCatalogTab);
        }
        this.$selectTab.invoke(this.$tab);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
