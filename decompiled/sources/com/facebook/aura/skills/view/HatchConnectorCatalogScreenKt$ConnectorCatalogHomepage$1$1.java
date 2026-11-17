package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.skills.viewmodel.HatchConnectorCatalogViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConnectorCatalogScreenKt$ConnectorCatalogHomepage$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ConnectorCatalogActions $actions;
    public final /* synthetic */ HatchConnectorCatalogViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorCatalogScreenKt$ConnectorCatalogHomepage$1$1(ConnectorCatalogActions connectorCatalogActions, HatchConnectorCatalogViewModel hatchConnectorCatalogViewModel) {
        super(0);
        this.$actions = connectorCatalogActions;
        this.$viewModel = hatchConnectorCatalogViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logPullToRefresh(HatchSurface.SETTINGS, HatchSubsurface.CONNECTORS, HatchScreen.CONNECTORS, null);
        this.$actions.refreshLocal.invoke();
        this.$viewModel.refreshFromPull();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
