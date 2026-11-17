package com.facebook.aura.partners.voice.chrome;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceFloatingCallControlsKt$VoiceFloatingCallControls$presentation$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $additionalControl;
    public final /* synthetic */ Function0<Boolean> $isCaptionSurface;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ boolean $visible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceFloatingCallControlsKt$VoiceFloatingCallControls$presentation$1(Function0<Boolean> function0, BRg bRg, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
        super(2);
        this.$isCaptionSurface = function0;
        this.$modifier = bRg;
        this.$visible = z;
        this.$additionalControl = g0v;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        VoiceFloatingCallControlsKt.VoiceFloatingCallControls(this.$isCaptionSurface, this.$modifier, this.$visible, this.$additionalControl, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
