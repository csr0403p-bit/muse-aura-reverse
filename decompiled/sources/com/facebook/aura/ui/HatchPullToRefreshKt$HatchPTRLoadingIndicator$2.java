package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchPullToRefreshKt$HatchPTRLoadingIndicator$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $isRefreshing;
    public final /* synthetic */ AuraThemeMode $modeOverride;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Float> $progress;
    public final /* synthetic */ Function0<Float> $pullOffset;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPullToRefreshKt$HatchPTRLoadingIndicator$2(Function0<Float> function0, boolean z, Function0<Float> function02, float f, AuraThemeMode auraThemeMode, BRg bRg, int i, int i2) {
        super(2);
        this.$progress = function0;
        this.$isRefreshing = z;
        this.$pullOffset = function02;
        this.$topPadding = f;
        this.$modeOverride = auraThemeMode;
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
        HatchPullToRefreshKt.m2321HatchPTRLoadingIndicatorjIwJxvA(this.$progress, this.$isRefreshing, this.$pullOffset, this.$topPadding, this.$modeOverride, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
