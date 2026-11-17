package com.facebook.aura.partners.voice.screen;

import X.AVy;
import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.B6A;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C1BO;
import X.C3cG;
import X.C3cH;
import X.C78N;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.intf.VoiceCallUiState;
import com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel;
import com.facebook.aura.vds.compose.icons.AuraIconButtonBackground;
import com.facebook.aura.vds.compose.icons.AuraIconButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonSizeV2;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class VoiceCallCompactControlsKt {

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceCallCompactControlsKt$VoiceCallCompactCaptionToggle$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceCallCompactControlsKt.VoiceCallCompactCaptionToggle(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceCallCompactControlsKt$VoiceCallCompactEndButton$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceCallCompactControlsKt.VoiceCallCompactEndButton(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceCallCompactControlsKt$VoiceCallCompactMuteButton$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceCallCompactControlsKt.VoiceCallCompactMuteButton(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg muteSwitchSemantics(X.BRg r5, boolean r6, X.BFM r7, int r8) {
        /*
            r4 = 0
            X.C7384Etj.A0Y(r5, r4)
            r0 = 2131887729(0x7f120671, float:1.9410073E38)
            if (r6 == 0) goto Lc
            r0 = 2131887730(0x7f120672, float:1.9410075E38)
        Lc:
            java.lang.String r3 = X.AbstractC2271BQs.A01(r7, r0)
            r0 = r8 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r2 = 32
            if (r0 <= r2) goto L1e
            boolean r0 = r7.A66(r6)
            if (r0 != 0) goto L23
        L1e:
            r1 = r8 & 48
            r0 = 0
            if (r1 != r2) goto L24
        L23:
            r0 = 1
        L24:
            boolean r1 = X.AnonymousClass001.A1R(r7, r3, r0)
            java.lang.Object r0 = r7.AaT()
            if (r1 != 0) goto L32
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L3a
        L32:
            com.facebook.aura.partners.voice.screen.VoiceCallCompactControlsKt$muteSwitchSemantics$1$1 r0 = new com.facebook.aura.partners.voice.screen.VoiceCallCompactControlsKt$muteSwitchSemantics$1$1
            r0.<init>(r6, r3)
            r7.Ai0(r0)
        L3a:
            X.BRg r0 = X.AnonymousClass001.A0Y(r5, r0, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceCallCompactControlsKt.muteSwitchSemantics(X.BRg, boolean, X.BFM, int):X.BRg");
    }

    public static final void VoiceCallCompactEndButton(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-672860345);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            VoiceCallViewModel voiceCallViewModelRememberVoiceCallViewModel = VoiceCallSurfacesKt.rememberVoiceCallViewModel(bfm, 0);
            VoiceCallStateHolder voiceCallStateHolderRememberVoiceCallStateHolder = rememberVoiceCallStateHolder(bfm, 0);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.voice_phone_handset_down_24, 0);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120662);
            AuraIconButtonSizeV2 auraIconButtonSizeV2 = AuraIconButtonSizeV2.XM_LARGE;
            AuraIconButtonStyle auraIconButtonStyle = AuraIconButtonStyle.PRIMARY;
            AuraIconButtonBackground auraIconButtonBackground = AuraIconButtonBackground.NO_BACKGROUND;
            long j = C3cH.A0W(bfm).errorText;
            BRg bRgA00 = AbstractC07539Wl.A00(bRg2, "assist-voice-end-call");
            boolean zA1M = AnonymousClass003.A1M(bfm, voiceCallStateHolderRememberVoiceCallStateHolder, voiceCallViewModelRememberVoiceCallViewModel);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new VoiceCallCompactControlsKt$VoiceCallCompactEndButton$1$1(voiceCallStateHolderRememberVoiceCallStateHolder, voiceCallViewModelRememberVoiceCallViewModel);
                bfm.Ai0(objAaT);
            }
            AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(bRgA00, aVyA00, auraIconButtonSizeV2, auraIconButtonStyle, auraIconButtonBackground, null, strA01, (Function0) objAaT, null, false, new B6A(j), null, null, null, bfm, (AVy.$stable << 3) | 28032, 0, 15136);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void VoiceCallCompactMuteButton(X.BRg r25, X.BFM r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceCallCompactControlsKt.VoiceCallCompactMuteButton(X.BRg, X.BFM, int, int):void");
    }

    public static final void VoiceCallCompactCaptionToggle(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-1146615366);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            VoiceEmbodimentFullScreenKt.VoiceCallCaptionsToggle(bRg, "assist-voice-captions", bfm, (iA0d & 14) | 48, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(bRg, i, i2);
        }
    }

    public static final /* synthetic */ VoiceCallUiState access$VoiceCallCompactMuteButton$lambda$0(C1BO c1bo) {
        return (VoiceCallUiState) c1bo.getValue();
    }

    public static final VoiceCallStateHolder rememberVoiceCallStateHolder(BFM bfm, int i) {
        AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
        boolean zA65 = bfm.A65(abstractC3358CGzA0h);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = C3cG.A0K(abstractC3358CGzA0h);
            bfm.Ai0(objAaT);
        }
        return (VoiceCallStateHolder) objAaT;
    }
}
