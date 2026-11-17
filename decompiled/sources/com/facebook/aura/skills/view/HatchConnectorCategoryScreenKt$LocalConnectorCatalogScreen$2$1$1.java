package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.C0CD;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.skills.viewmodel.DeviceConnectorsUiState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConnectorCategoryScreenKt$LocalConnectorCatalogScreen$2$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ ConnectorCatalogActions $actions;
    public final /* synthetic */ C1BO<DeviceConnectorsUiState> $state$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        HatchConnectorCatalogComponentsKt.localConnectorCatalogRows(c0cd, this.$state$delegate.getValue().rows, this.$actions);
        if (this.$state$delegate.getValue().showEmpty) {
            c0cd.APJ("empty", AuraDeeplinkRouteMapper.STATUS_ROUTE, ComposableSingletons$HatchConnectorCategoryScreenKt.f284lambda$1119181251);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorCategoryScreenKt$LocalConnectorCatalogScreen$2$1$1(ConnectorCatalogActions connectorCatalogActions, C1BO<DeviceConnectorsUiState> c1bo) {
        super(1);
        this.$actions = connectorCatalogActions;
        this.$state$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
