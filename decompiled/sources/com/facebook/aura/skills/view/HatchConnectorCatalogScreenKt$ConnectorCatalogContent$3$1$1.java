package com.facebook.aura.skills.view;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogTab;
import com.facebook.aura.skills.viewmodel.HatchConnectorCatalogViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class HatchConnectorCatalogScreenKt$ConnectorCatalogContent$3$1$1 extends C7438Evz implements G0U<ConnectorCatalogTab, Unit> {
    public HatchConnectorCatalogScreenKt$ConnectorCatalogContent$3$1$1(Object obj) {
        super(1, obj, HatchConnectorCatalogViewModel.class, "selectTab", "selectTab(Lcom/facebook/aura/skills/viewmodel/ConnectorCatalogTab;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConnectorCatalogTab connectorCatalogTab) {
        ((HatchConnectorCatalogViewModel) AnonymousClass006.A0o(connectorCatalogTab, this)).selectTab(connectorCatalogTab);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ConnectorCatalogTab connectorCatalogTab) {
        invoke2(connectorCatalogTab);
        return Unit.INSTANCE;
    }
}
