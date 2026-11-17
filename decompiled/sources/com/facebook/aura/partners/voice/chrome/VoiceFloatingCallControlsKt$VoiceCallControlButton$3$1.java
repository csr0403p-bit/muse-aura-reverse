package com.facebook.aura.partners.voice.chrome;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.B6A;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.G2j;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VoiceFloatingCallControlsKt$VoiceCallControlButton$3$1 extends AbstractC7559F3s implements G2j<B6A, BRg, BFM, Integer, Unit> {
    public final /* synthetic */ VoiceCallSlotAnimation $morph;

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(B6A b6a, BRg bRg, BFM bfm, Integer num) {
        m1710invokeIv8Zu3U(b6a.A00, bRg, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-Iv8Zu3U, reason: not valid java name */
    public final void m1710invokeIv8Zu3U(long j, BRg bRg, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 1);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(bfm.A64(j) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            VoiceCallChromeKt.m1704VoiceCallSlotIcon3IgeMak(this.$morph, j, bRg, bfm, AnonymousClass002.A07(iA05 << 3, VoiceCallSlotAnimation.$stable), 0);
        } else {
            bfm.Afo();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceFloatingCallControlsKt$VoiceCallControlButton$3$1(VoiceCallSlotAnimation voiceCallSlotAnimation) {
        super(4);
        this.$morph = voiceCallSlotAnimation;
    }
}
