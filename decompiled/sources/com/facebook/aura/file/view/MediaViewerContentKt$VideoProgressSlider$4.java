package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$VideoProgressSlider$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $inactiveTrackColor;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<Float, Unit> $onProgressChanged;
    public final /* synthetic */ Function0<Unit> $onSeekCancelled;
    public final /* synthetic */ G0U<Float, Unit> $onSeekFinished;
    public final /* synthetic */ float $progress;
    public final /* synthetic */ float $thumbSize;
    public final /* synthetic */ float $trackHeight;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaViewerContentKt$VideoProgressSlider$4(float f, G0U<? super Float, Unit> g0u, G0U<? super Float, Unit> g0u2, Function0<Unit> function0, float f2, float f3, long j, BRg bRg, int i, int i2) {
        super(2);
        this.$progress = f;
        this.$onProgressChanged = g0u;
        this.$onSeekFinished = g0u2;
        this.$onSeekCancelled = function0;
        this.$trackHeight = f2;
        this.$thumbSize = f3;
        this.$inactiveTrackColor = j;
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
        MediaViewerContentKt.m907VideoProgressSlider8Ml9mos(this.$progress, this.$onProgressChanged, this.$onSeekFinished, this.$onSeekCancelled, this.$trackHeight, this.$thumbSize, this.$inactiveTrackColor, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
