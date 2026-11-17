package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BFM;
import X.BRg;
import X.C06c;
import X.C10G;
import X.C2VU;
import X.C7384Etj;
import X.G2j;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchVoiceOptionsWidgetKt$VoiceOptionSpeakerControl$2 extends AbstractC7559F3s implements G2j<C06c, VoiceOptionGlyph, BFM, Integer, Unit> {
    public final /* synthetic */ float $glyphSize;
    public final /* synthetic */ int $playGlyph;

    public final void invoke(C06c c06c, VoiceOptionGlyph voiceOptionGlyph, BFM bfm, int i) {
        C7384Etj.A0Y(voiceOptionGlyph, 1);
        if ((i & 48) == 0) {
            i |= AnonymousClass005.A09(bfm, voiceOptionGlyph);
        }
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 145, VoiceCallForegroundService.AVATAR_TARGET_PX), bfm, i)) {
            bfm.Afo();
            return;
        }
        HatchVoiceOptionsWidgetKt.m1741VoiceOptionGlyphContentDzVHIIc(voiceOptionGlyph, this.$glyphSize, this.$playGlyph, C10G.A02(C2VU.A09, BRg.A00, false), bfm, ((i >> 3) & 14) | 3072, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVoiceOptionsWidgetKt$VoiceOptionSpeakerControl$2(float f, int i) {
        super(4);
        this.$glyphSize = f;
        this.$playGlyph = i;
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(C06c c06c, VoiceOptionGlyph voiceOptionGlyph, BFM bfm, Integer num) {
        invoke(c06c, voiceOptionGlyph, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
