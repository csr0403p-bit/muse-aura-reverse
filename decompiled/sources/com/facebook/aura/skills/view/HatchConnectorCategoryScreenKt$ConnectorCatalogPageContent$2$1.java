package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConnectorCategoryScreenKt$ConnectorCatalogPageContent$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ConnectorCatalogActions $actions;
    public final /* synthetic */ Function0<Unit> $onRefresh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorCategoryScreenKt$ConnectorCatalogPageContent$2$1(ConnectorCatalogActions connectorCatalogActions, Function0<Unit> function0) {
        super(0);
        this.$actions = connectorCatalogActions;
        this.$onRefresh = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$actions.refreshLocal.invoke();
        this.$onRefresh.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
