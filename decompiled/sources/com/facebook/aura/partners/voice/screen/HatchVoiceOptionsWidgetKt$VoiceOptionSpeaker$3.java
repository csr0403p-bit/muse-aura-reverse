package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchVoiceOptionsWidgetKt$VoiceOptionSpeaker$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $glyphSize;
    public final /* synthetic */ int $labelMaxLines;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onPreview;
    public final /* synthetic */ int $playGlyph;
    public final /* synthetic */ float $speakerSize;
    public final /* synthetic */ VoiceOptionSpeakerState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVoiceOptionsWidgetKt$VoiceOptionSpeaker$3(VoiceOptionSpeakerState voiceOptionSpeakerState, float f, float f2, int i, int i2, Function0<Unit> function0, BRg bRg, int i3, int i4) {
        super(2);
        this.$state = voiceOptionSpeakerState;
        this.$speakerSize = f;
        this.$glyphSize = f2;
        this.$playGlyph = i;
        this.$labelMaxLines = i2;
        this.$onPreview = function0;
        this.$modifier = bRg;
        this.$$changed = i3;
        this.$$default = i4;
    }

    public final void invoke(BFM bfm, int i) {
        HatchVoiceOptionsWidgetKt.m1742VoiceOptionSpeakerKhTvWYU(this.$state, this.$speakerSize, this.$glyphSize, this.$playGlyph, this.$labelMaxLines, this.$onPreview, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
