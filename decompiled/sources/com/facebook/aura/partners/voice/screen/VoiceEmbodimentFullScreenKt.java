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
import X.B81;
import X.BBb;
import X.BFM;
import X.BNH;
import X.BOf;
import X.BRg;
import X.C06H;
import X.C0v2;
import X.C10G;
import X.C1743Apg;
import X.C1BO;
import X.C1OP;
import X.C1OQ;
import X.C1YD;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C78N;
import X.G0U;
import X.G0V;
import X.InterfaceC1072AWd;
import com.facebook.aura.R;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import com.facebook.aura.header.view.HatchStatusPillMetricsKt;
import com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel;
import com.facebook.aura.vds.compose.bouncy.AuraBouncyIndication;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class VoiceEmbodimentFullScreenKt {

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceEmbodimentFullScreenKt$FullScreenCaption$1, reason: invalid class name */
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
            VoiceEmbodimentFullScreenKt.FullScreenCaption(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceEmbodimentFullScreenKt$FullScreenCaption$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(BRg bRg, int i, int i2) {
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
            VoiceEmbodimentFullScreenKt.FullScreenCaption(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceEmbodimentFullScreenKt$VoiceCallCaptionsToggle$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $testTag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BRg bRg, String str, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$testTag = str;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceEmbodimentFullScreenKt.VoiceCallCaptionsToggle(this.$modifier, this.$testTag, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceEmbodimentFullScreenKt$VoiceEmbodimentFullScreen$3, reason: invalid class name and case insensitive filesystem */
    public final class C131913 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131913(BRg bRg, int i, int i2) {
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
            VoiceEmbodimentFullScreenKt.VoiceEmbodimentFullScreen(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceEmbodimentFullScreenKt$VoiceEmbodimentFullScreenEffect$5, reason: invalid class name and case insensitive filesystem */
    public final class C131925 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $embodimentEnabled;
        public final /* synthetic */ boolean $isCallActive;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131925(boolean z, boolean z2, int i) {
            super(2);
            this.$embodimentEnabled = z;
            this.$isCallActive = z2;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceEmbodimentFullScreenKt.VoiceEmbodimentFullScreenEffect(this.$embodimentEnabled, this.$isCallActive, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void VoiceCallCaptionsToggle(BRg bRg, String str, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        String str2 = str;
        bfm.AgG(894120299);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                str2 = "hatch-voice-captions-button";
            }
            VoiceCallViewModel voiceCallViewModelRememberVoiceCallViewModel = VoiceCallSurfacesKt.rememberVoiceCallViewModel(bfm, 0);
            C06H c06h = null;
            C1BO c1boA02 = C2CK.A02(bfm, voiceCallViewModelRememberVoiceCallViewModel.isCaptionsEnabled);
            boolean zA0F = C1BO.A0F(c1boA02);
            int i5 = R.drawable.voice_cc_off_24;
            if (zA0F) {
                i5 = R.drawable.voice_cc_on_24;
            }
            AVy aVyA00 = BOf.A00(bfm, i5, 0);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120654);
            AuraIconSize auraIconSize = AuraIconSize.SMALL;
            long j = C3cH.A0W(bfm).primaryIcon.enabled;
            BRg bRgA00 = AbstractC07539Wl.A00(C10G.A07(bRg2, 48.0f), str2);
            boolean zA0F2 = C1BO.A0F(c1boA02);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            InterfaceC1072AWd interfaceC1072AWd = (InterfaceC1072AWd) AnonymousClass004.A16(bfm, objAaT, obj);
            float f = 0.0f;
            AuraBouncyIndication auraBouncyIndication = new AuraBouncyIndication(f, f, f, f, f, 31, c06h);
            C1YD c1ydA0A = C3cG.A0A(2);
            boolean zA67 = bfm.A67(voiceCallViewModelRememberVoiceCallViewModel);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == obj) {
                objAaT2 = new VoiceEmbodimentFullScreenKt$VoiceCallCaptionsToggle$2$1(voiceCallViewModelRememberVoiceCallViewModel);
                bfm.Ai0(objAaT2);
            }
            AuraIconKt.m2567AuraIconFHprtrg(C3U4.A09(C0v2.A00(auraBouncyIndication, interfaceC1072AWd, bRgA00, c1ydA0A, (G0U) objAaT2, zA0F2, true), 12.0f), aVyA00, auraIconSize, strA01, j, null, bfm, AnonymousClass001.A03(), 32);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(bRg2, str2, i, i2);
        }
    }

    public static final void FullScreenCaption(BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass5;
        bfm.AgG(-1256070294);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            VoiceAvatarTakeoverState voiceAvatarTakeoverStateA0M = C3cG.A0M(bfm);
            if (AnonymousClass003.A1Y(VoiceCallCaptionOverlayKt.rememberVoiceCallCaptionSurface(bfm, 0))) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass5 = new AnonymousClass1(bRg, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass5);
                }
                return;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new CaptionBoundsWrite();
                bfm.Ai0(objAaT);
            }
            CaptionBoundsWrite captionBoundsWrite = (CaptionBoundsWrite) objAaT;
            boolean zA1J = AnonymousClass003.A1J(bfm, voiceAvatarTakeoverStateA0M, captionBoundsWrite);
            Object objAaT2 = bfm.AaT();
            if (zA1J || objAaT2 == obj) {
                objAaT2 = new VoiceEmbodimentFullScreenKt$FullScreenCaption$2$1(voiceAvatarTakeoverStateA0M, captionBoundsWrite);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A17(bfm, objAaT2, voiceAvatarTakeoverStateA0M);
            boolean zA1N = AnonymousClass003.A1N(bfm, captionBoundsWrite, voiceAvatarTakeoverStateA0M);
            Object objAaT3 = bfm.AaT();
            if (zA1N || objAaT3 == obj) {
                objAaT3 = new VoiceEmbodimentFullScreenKt$FullScreenCaption$3$1(captionBoundsWrite, voiceAvatarTakeoverStateA0M);
                bfm.Ai0(objAaT3);
            }
            BRg bRgOnBoundsInWindowChanged = HatchStatusPillMetricsKt.onBoundsInWindowChanged(bRg, (G0U) objAaT3);
            boolean zA1J2 = AnonymousClass003.A1J(bfm, voiceAvatarTakeoverStateA0M, captionBoundsWrite);
            Object objAaT4 = bfm.AaT();
            if (zA1J2 || objAaT4 == obj) {
                objAaT4 = new VoiceEmbodimentFullScreenKt$FullScreenCaption$4$1(voiceAvatarTakeoverStateA0M, captionBoundsWrite);
                bfm.Ai0(objAaT4);
            }
            VoiceCallCurrentCaptionKt.VoiceCallCurrentCaption(bRgOnBoundsInWindowChanged, false, (Function0) objAaT4, bfm, 0, 2);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass5 = new AnonymousClass5(bRg, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass5);
        }
    }

    public static final void VoiceEmbodimentFullScreen(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-2098531900);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            HatchStatusPillMetrics hatchStatusPillMetricsA0a = AnonymousClass002.A0a(bfm);
            VoiceAvatarFullScreenState voiceAvatarFullScreenStateA0V = C3cH.A0V(bfm);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            boolean zA1P = AnonymousClass003.A1P(bfm, voiceAvatarFullScreenStateA0V, hatchStatusPillMetricsA0a, bfm.A67(abstractC3358CGzA0h));
            Object objAaT = bfm.AaT();
            if (zA1P || objAaT == C78N.A00) {
                objAaT = new VoiceEmbodimentFullScreenKt$VoiceEmbodimentFullScreen$1$1(abstractC3358CGzA0h, voiceAvatarFullScreenStateA0V, hatchStatusPillMetricsA0a);
                bfm.Ai0(objAaT);
            }
            B81.A00(false, (Function0) objAaT, bfm, 0, 1);
            BRg bRgA0C = C3U4.A0C(BNH.A00(new C1OQ(new C1OP(C1743Apg.A01(bfm).A0B, C1743Apg.A01(bfm).A01), 31), C10G.A02(C2VU.A06, AbstractC07539Wl.A00(AnonymousClass001.A0T(bRg), "hatch-voice-fullscreen"), false)), 24.0f, 24.0f, 24.0f, VoiceEmbodimentDragHandleKt.fullScreenHandleClearance(bfm, 0) + 16.0f);
            boolean zA65 = bfm.A65(voiceAvatarFullScreenStateA0V);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == C78N.A00) {
                objAaT2 = new VoiceEmbodimentFullScreenKt$VoiceEmbodimentFullScreen$2$1(voiceAvatarFullScreenStateA0V);
                bfm.Ai0(objAaT2);
            }
            FullScreenCaption(AnonymousClass001.A0W(bRgA0C, objAaT2), bfm, 0, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C131913(bRg, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void VoiceEmbodimentFullScreenEffect(boolean r24, boolean r25, X.BFM r26, int r27) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceEmbodimentFullScreenKt.VoiceEmbodimentFullScreenEffect(boolean, boolean, X.BFM, int):void");
    }
}
