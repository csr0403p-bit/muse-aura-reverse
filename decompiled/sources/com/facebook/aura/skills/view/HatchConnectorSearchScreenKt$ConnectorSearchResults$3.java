package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.skills.viewmodel.HatchConnectorSearchViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConnectorSearchScreenKt$ConnectorSearchResults$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ ConnectorCatalogActions $actions;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ HatchConnectorSearchViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorSearchScreenKt$ConnectorSearchResults$3(HatchConnectorSearchViewModel hatchConnectorSearchViewModel, ConnectorCatalogActions connectorCatalogActions, float f, BRg bRg, int i, int i2) {
        super(2);
        this.$viewModel = hatchConnectorSearchViewModel;
        this.$actions = connectorCatalogActions;
        this.$bottomPadding = f;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchConnectorSearchScreenKt.m2156ConnectorSearchResults942rkJo(this.$viewModel, this.$actions, this.$bottomPadding, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
