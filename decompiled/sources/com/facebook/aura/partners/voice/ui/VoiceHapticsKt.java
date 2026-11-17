package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C0dx;
import X.C1HY;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.F2N;
import X.G0V;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class VoiceHapticsKt {

    /* renamed from: com.facebook.aura.partners.voice.ui.VoiceHapticsKt$VoiceCallStartHapticEffect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ VoiceCallStateHolder $stateHolder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(VoiceCallStateHolder voiceCallStateHolder, int i) {
            super(2);
            this.$stateHolder = voiceCallStateHolder;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceHapticsKt.VoiceCallStartHapticEffect(this.$stateHolder, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void VoiceCallStartHapticEffect(VoiceCallStateHolder voiceCallStateHolder, BFM bfm, int i) {
        C7384Etj.A0Y(voiceCallStateHolder, 0);
        bfm.AgG(-769382280);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(voiceCallStateHolder, bfm, i) ? 1 : 0) | i : i;
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 3, 2), bfm, iA05)) {
            C0dx c0dxA0T = AnonymousClass002.A0T(bfm);
            F2N f2nA00 = C1HY.A00(bfm);
            if ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(voiceCallStateHolder))) {
                z = true;
            }
            boolean zA1V = AnonymousClass002.A1V(bfm, c0dxA0T, bfm.A67(f2nA00), z);
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new VoiceHapticsKt$VoiceCallStartHapticEffect$1$1(voiceCallStateHolder, f2nA00, c0dxA0T, null);
                bfm.Ai0(objAaT);
            }
            C78e.A02(bfm, voiceCallStateHolder, c0dxA0T, f2nA00, (G0V) objAaT);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(voiceCallStateHolder, i);
        }
    }

    public static final void performClickHaptic(C0dx c0dx) {
        C7384Etj.A0Y(c0dx, 0);
        c0dx.AXr(AuraHaptics.BUTTON_TAP);
    }
}
