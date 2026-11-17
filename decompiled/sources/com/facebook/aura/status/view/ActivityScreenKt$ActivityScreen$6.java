package com.facebook.aura.status.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.status.viewmodel.ActivityViewModel;
import com.facebook.aura.status.viewmodel.HatchSubAgentUiModel;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ActivityScreenKt$ActivityScreen$6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ boolean $collapsibleDays;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $header;
    public final /* synthetic */ boolean $isConnected;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ AHD<HatchSubAgentUiModel> $subAgents;
    public final /* synthetic */ float $topPadding;
    public final /* synthetic */ ActivityViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActivityScreenKt$ActivityScreen$6(AHD<HatchSubAgentUiModel> ahd, boolean z, float f, float f2, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, boolean z2, ActivityViewModel activityViewModel, int i, int i2) {
        super(2);
        this.$subAgents = ahd;
        this.$isConnected = z;
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$modifier = bRg;
        this.$header = g0v;
        this.$collapsibleDays = z2;
        this.$viewModel = activityViewModel;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        ActivityScreenKt.m2210ActivityScreentw_glAc(this.$subAgents, this.$isConnected, this.$topPadding, this.$bottomPadding, this.$modifier, this.$header, this.$collapsibleDays, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
