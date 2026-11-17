package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchVoiceOptionsWidgetKt$VoiceOptionGlyphContent$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ VoiceOptionGlyph $glyph;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ int $playGlyph;
    public final /* synthetic */ float $size;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVoiceOptionsWidgetKt$VoiceOptionGlyphContent$1(VoiceOptionGlyph voiceOptionGlyph, float f, int i, BRg bRg, int i2, int i3) {
        super(2);
        this.$glyph = voiceOptionGlyph;
        this.$size = f;
        this.$playGlyph = i;
        this.$modifier = bRg;
        this.$$changed = i2;
        this.$$default = i3;
    }

    public final void invoke(BFM bfm, int i) {
        HatchVoiceOptionsWidgetKt.m1741VoiceOptionGlyphContentDzVHIIc(this.$glyph, this.$size, this.$playGlyph, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
