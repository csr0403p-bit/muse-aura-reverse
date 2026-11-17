package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceCallCurrentCaptionKt$VoiceCallCurrentCaption$caption$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onCaptionHidden;
    public final /* synthetic */ boolean $passive;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallCurrentCaptionKt$VoiceCallCurrentCaption$caption$1(BRg bRg, boolean z, Function0<Unit> function0, int i, int i2) {
        super(2);
        this.$modifier = bRg;
        this.$passive = z;
        this.$onCaptionHidden = function0;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        VoiceCallCurrentCaptionKt.VoiceCallCurrentCaption(this.$modifier, this.$passive, this.$onCaptionHidden, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
