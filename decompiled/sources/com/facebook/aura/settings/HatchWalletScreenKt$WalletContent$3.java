package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchWalletScreenKt$WalletContent$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ float $topPadding;
    public final /* synthetic */ HatchWalletViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchWalletScreenKt$WalletContent$3(HatchWalletViewModel hatchWalletViewModel, float f, float f2, BRg bRg, int i, int i2) {
        super(2);
        this.$viewModel = hatchWalletViewModel;
        this.$topPadding = f;
        this.$bottomPadding = f2;
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
        HatchWalletScreenKt.m1969WalletContentdjqsMU(this.$viewModel, this.$topPadding, this.$bottomPadding, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
