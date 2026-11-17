package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.G0W;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchVoiceOptionsWidgetKt$VoiceOptionCardsLayout$1$1$2 extends AbstractC7559F3s implements G0W<BRg, BFM, Integer, Unit> {
    public final /* synthetic */ VoiceOptionsWidgetState $state;

    public final void invoke(BRg bRg, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        if ((i & 6) == 0) {
            i |= AnonymousClass004.A0d(bfm, bRg);
        }
        if (!AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
            bfm.Afo();
        } else {
            VoiceOptionsWidgetState voiceOptionsWidgetState = this.$state;
            HatchVoiceOptionsWidgetKt.VoiceOptionsViewAll(voiceOptionsWidgetState.acceptsSelection, HatchVoiceOptionsWidgetKt.voiceOptionsBrowseAllAction(voiceOptionsWidgetState, bfm, 0), bRg, bfm, (i << 6) & 896, 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVoiceOptionsWidgetKt$VoiceOptionCardsLayout$1$1$2(VoiceOptionsWidgetState voiceOptionsWidgetState) {
        super(3);
        this.$state = voiceOptionsWidgetState;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(BRg bRg, BFM bfm, Integer num) {
        invoke(bRg, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
