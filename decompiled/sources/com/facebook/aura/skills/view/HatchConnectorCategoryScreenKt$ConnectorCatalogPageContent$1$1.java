package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConnectorCategoryScreenKt$ConnectorCatalogPageContent$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ConnectorCatalogPageViewModel $page;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorCategoryScreenKt$ConnectorCatalogPageContent$1$1(ConnectorCatalogPageViewModel connectorCatalogPageViewModel) {
        super(0);
        this.$page = connectorCatalogPageViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$page.loadNextPage();
    }
}
