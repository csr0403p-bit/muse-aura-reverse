package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import androidx.compose.foundation.lazy.LazyListState;
import com.facebook.aura.skills.viewmodel.HatchConnectorCatalogViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConnectorCatalogScreenKt$ConnectorCatalogHomepage$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ ConnectorCatalogActions $actions;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $header;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ float $topPadding;
    public final /* synthetic */ HatchConnectorCatalogViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConnectorCatalogScreenKt$ConnectorCatalogHomepage$3(HatchConnectorCatalogViewModel hatchConnectorCatalogViewModel, ConnectorCatalogActions connectorCatalogActions, LazyListState lazyListState, float f, float f2, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
        super(2);
        this.$viewModel = hatchConnectorCatalogViewModel;
        this.$actions = connectorCatalogActions;
        this.$listState = lazyListState;
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$modifier = bRg;
        this.$header = g0v;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchConnectorCatalogScreenKt.m2146ConnectorCatalogHomepageYlGCr2M(this.$viewModel, this.$actions, this.$listState, this.$topPadding, this.$bottomPadding, this.$modifier, this.$header, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
