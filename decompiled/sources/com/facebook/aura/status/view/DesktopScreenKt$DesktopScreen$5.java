package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.status.viewmodel.DesktopViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class DesktopScreenKt$DesktopScreen$5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ float $topPadding;
    public final /* synthetic */ DesktopViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DesktopScreenKt$DesktopScreen$5(float f, float f2, BRg bRg, DesktopViewModel desktopViewModel, int i, int i2) {
        super(2);
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$modifier = bRg;
        this.$viewModel = desktopViewModel;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        DesktopScreenKt.m2217DesktopScreenpBklqvs(this.$topPadding, this.$bottomPadding, this.$modifier, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
