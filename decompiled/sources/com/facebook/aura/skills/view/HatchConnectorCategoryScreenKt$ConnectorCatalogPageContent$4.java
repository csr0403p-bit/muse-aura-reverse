package com.facebook.aura.skills.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import androidx.compose.foundation.lazy.LazyListState;
import com.facebook.aura.skills.api.ClientConnector;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConnectorCategoryScreenKt$ConnectorCatalogPageContent$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ ConnectorCatalogActions $actions;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ AHD<ClientConnector> $clientConnectors;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $header;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onRefresh;
    public final /* synthetic */ ConnectorCatalogPageViewModel $page;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConnectorCategoryScreenKt$ConnectorCatalogPageContent$4(ConnectorCatalogPageViewModel connectorCatalogPageViewModel, ConnectorCatalogActions connectorCatalogActions, LazyListState lazyListState, float f, float f2, Function0<Unit> function0, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, AHD<ClientConnector> ahd, int i, int i2) {
        super(2);
        this.$page = connectorCatalogPageViewModel;
        this.$actions = connectorCatalogActions;
        this.$listState = lazyListState;
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$onRefresh = function0;
        this.$modifier = bRg;
        this.$header = g0v;
        this.$clientConnectors = ahd;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchConnectorCategoryScreenKt.m2150ConnectorCatalogPageContentikN4xI4(this.$page, this.$actions, this.$listState, this.$topPadding, this.$bottomPadding, this.$onRefresh, this.$modifier, this.$header, this.$clientConnectors, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
