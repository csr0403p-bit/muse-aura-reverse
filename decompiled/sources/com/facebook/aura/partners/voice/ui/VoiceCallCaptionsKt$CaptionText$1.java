package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1822Arm;
import X.G0V;
import com.facebook.aura.partners.voice.intf.CaptionEntry;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class VoiceCallCaptionsKt$CaptionText$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $color;
    public final /* synthetic */ CaptionEntry $entry;
    public final /* synthetic */ boolean $fadeInWords;
    public final /* synthetic */ int $initialVisibleCharacterCount;
    public final /* synthetic */ boolean $isStreaming;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ boolean $passive;
    public final /* synthetic */ C1822Arm $style;
    public final /* synthetic */ int $textAlign;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallCaptionsKt$CaptionText$1(CaptionEntry captionEntry, boolean z, long j, C1822Arm c1822Arm, int i, boolean z2, boolean z3, int i2, BRg bRg, int i3, int i4) {
        super(2);
        this.$entry = captionEntry;
        this.$isStreaming = z;
        this.$color = j;
        this.$style = c1822Arm;
        this.$initialVisibleCharacterCount = i;
        this.$passive = z2;
        this.$fadeInWords = z3;
        this.$textAlign = i2;
        this.$modifier = bRg;
        this.$$changed = i3;
        this.$$default = i4;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        VoiceCallCaptionsKt.m1819CaptionText609ORrk(this.$entry, this.$isStreaming, this.$color, this.$style, this.$initialVisibleCharacterCount, this.$passive, this.$fadeInWords, this.$textAlign, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
