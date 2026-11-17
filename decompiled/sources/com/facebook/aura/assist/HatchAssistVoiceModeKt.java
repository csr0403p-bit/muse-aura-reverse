package com.facebook.aura.assist;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C1BO;
import X.C2CK;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.G0U;
import X.G0V;
import X.G2j;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.partners.voice.intf.Voice;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class HatchAssistVoiceModeKt {

    /* renamed from: com.facebook.aura.assist.HatchAssistVoiceModeKt$AssistVoiceCallEndedEffect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onCallEnded;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, int i) {
            super(2);
            this.$onCallEnded = function0;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchAssistVoiceModeKt.AssistVoiceCallEndedEffect(this.$onCallEnded, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.assist.HatchAssistVoiceModeKt$HatchAssistVoiceMode$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G2j<BRg, Function0<Unit>, BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $requestCall;
        public final /* synthetic */ AbstractC3358CGz $session;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G2j<? super BRg, ? super Function0<Unit>, ? super BFM, ? super Integer, Unit> g2j, BRg bRg, Function0<Unit> function0, AbstractC3358CGz abstractC3358CGz) {
            super(2);
            this.$content = g2j;
            this.$modifier = bRg;
            this.$requestCall = function0;
            this.$session = abstractC3358CGz;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                G2j<BRg, Function0<Unit>, BFM, Integer, Unit> g2j = this.$content;
                BRg bRg = this.$modifier;
                Function0<Unit> function0 = this.$requestCall;
                if (!Voice.INSTANCE.isCallSupported(this.$session)) {
                    function0 = null;
                }
                AnonymousClass001.A1F(bRg, function0, bfm, g2j, 0);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.assist.HatchAssistVoiceModeKt$HatchAssistVoiceMode$2, reason: invalid class name and case insensitive filesystem */
    public final class C109682 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G2j<BRg, Function0<Unit>, BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchAssistOverlayViewModel $overlayViewModel;
        public final /* synthetic */ String $threadId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C109682(HatchAssistOverlayViewModel hatchAssistOverlayViewModel, String str, BRg bRg, G2j<? super BRg, ? super Function0<Unit>, ? super BFM, ? super Integer, Unit> g2j, int i, int i2) {
            super(2);
            this.$overlayViewModel = hatchAssistOverlayViewModel;
            this.$threadId = str;
            this.$modifier = bRg;
            this.$content = g2j;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchAssistVoiceModeKt.HatchAssistVoiceMode(this.$overlayViewModel, this.$threadId, this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void AssistVoiceCallEndedEffect(Function0<Unit> function0, BFM bfm, int i) {
        C7384Etj.A0Y(function0, 0);
        bfm.AgG(416581419);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 3, 2), bfm, iA0T)) {
            VoiceCallStateHolder companion = VoiceCallStateHolder.Companion.getInstance(AnonymousClass002.A0h(bfm));
            C1BO c1boA02 = C2CK.A02(bfm, companion.isCallActive);
            C1BO c1boA022 = C2CK.A02(bfm, companion.pendingCallStart);
            boolean zA65 = bfm.A65(companion);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = AnonymousClass005.A0S(bfm, C1BO.A0F(c1boA02));
            }
            MutableState mutableState = (MutableState) objAaT;
            Boolean boolValueOf = Boolean.valueOf(C1BO.A0F(c1boA02));
            Object value = c1boA022.getValue();
            boolean zA1R = AnonymousClass005.A1R(bfm, c1boA02, mutableState, c1boA022) | AnonymousClass001.A1M(iA0T);
            Object objAaT2 = bfm.AaT();
            if (zA1R || objAaT2 == C78N.A00) {
                objAaT2 = new HatchAssistVoiceModeKt$AssistVoiceCallEndedEffect$1$1(function0, c1boA02, mutableState, c1boA022);
                bfm.Ai0(objAaT2);
            }
            C78e.A01(bfm, companion, boolValueOf, value, (G0U) objAaT2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchAssistVoiceMode(com.facebook.aura.assist.HatchAssistOverlayViewModel r33, java.lang.String r34, X.BRg r35, X.G2j<? super X.BRg, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r36, X.BFM r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.assist.HatchAssistVoiceModeKt.HatchAssistVoiceMode(com.facebook.aura.assist.HatchAssistOverlayViewModel, java.lang.String, X.BRg, X.G2j, X.BFM, int, int):void");
    }

    public static final /* synthetic */ Long access$AssistVoiceCallEndedEffect$lambda$1(C1BO c1bo) {
        return (Long) c1bo.getValue();
    }
}
