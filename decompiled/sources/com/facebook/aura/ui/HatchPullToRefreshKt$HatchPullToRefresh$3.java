package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import X.G0W;
import X.InterfaceC05151eP;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchPullToRefreshKt$HatchPullToRefresh$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ G0W<InterfaceC05151eP, BFM, Integer, Unit> $content;
    public final /* synthetic */ AuraThemeMode $indicatorModeOverride;
    public final /* synthetic */ float $indicatorTopPadding;
    public final /* synthetic */ boolean $isRefreshing;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onRefresh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchPullToRefreshKt$HatchPullToRefresh$3(boolean z, Function0<Unit> function0, BRg bRg, float f, AuraThemeMode auraThemeMode, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
        super(2);
        this.$isRefreshing = z;
        this.$onRefresh = function0;
        this.$modifier = bRg;
        this.$indicatorTopPadding = f;
        this.$indicatorModeOverride = auraThemeMode;
        this.$content = g0w;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchPullToRefreshKt.m2322HatchPullToRefreshjIwJxvA(this.$isRefreshing, this.$onRefresh, this.$modifier, this.$indicatorTopPadding, this.$indicatorModeOverride, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
