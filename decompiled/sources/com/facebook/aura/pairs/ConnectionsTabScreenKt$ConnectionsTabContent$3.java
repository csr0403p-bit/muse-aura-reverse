package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.pairs.ConnectionsUiState;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ConnectionsTabScreenKt$ConnectionsTabContent$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ ConnectionsLogContext $log;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ ConnectionsUiState.Loaded $state;
    public final /* synthetic */ float $topPadding;
    public final /* synthetic */ ConnectionsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsTabScreenKt$ConnectionsTabContent$3(ConnectionsUiState.Loaded loaded, ConnectionsViewModel connectionsViewModel, float f, ConnectionsLogContext connectionsLogContext, BRg bRg, int i, int i2) {
        super(2);
        this.$state = loaded;
        this.$viewModel = connectionsViewModel;
        this.$topPadding = f;
        this.$log = connectionsLogContext;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        ConnectionsTabScreenKt.m1656ConnectionsTabContentTN_CM5M(this.$state, this.$viewModel, this.$topPadding, this.$log, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
