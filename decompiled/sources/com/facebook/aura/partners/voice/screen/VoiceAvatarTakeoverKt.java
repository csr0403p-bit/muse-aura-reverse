package com.facebook.aura.partners.voice.screen;

import X.ADq;
import X.AGE;
import X.AGF;
import X.AGN;
import X.AGO;
import X.AKH;
import X.ATD;
import X.AWA;
import X.AXN;
import X.AaC;
import X.Ab3;
import X.AbstractC3358CGz;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BFM;
import X.BRg;
import X.C0dx;
import X.C1BO;
import X.C1DG;
import X.C1OP;
import X.C2CK;
import X.C3UC;
import X.C3cG;
import X.C3cH;
import X.C60K;
import X.C7384Etj;
import X.C78N;
import X.EnumC1820Arj;
import X.G0W;
import X.HxS;
import android.view.View;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.header.api.AvatarTakeoverIdleMedia;
import com.facebook.aura.header.api.AvatarTakeoverLayout;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import com.facebook.aura.header.view.HatchStatusPillMetricsKt;
import com.facebook.aura.header.view.HeaderButtonKt;
import com.facebook.aura.partners.voice.api.HatchSystemPipPresentationState;
import com.facebook.aura.partners.voice.gating.VoiceGating;
import com.facebook.aura.partners.voice.intf.VoiceCallControlLoggingKt;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.prefs.VoiceAvatarExpandedView;
import com.facebook.aura.status.view.HatchStatusPillAvatarPanelKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.aura.vds.compose.theme.BaseColors;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class VoiceAvatarTakeoverKt {
    public static final long CALL_IDLE_PREPARE_TIMEOUT_MS = 1500;
    public static final float CallAvatarFullFrameAspectRatio = 0.5833333f;
    public static final float CallAvatarOverlap;
    public static final int DARK_CALL_BACKDROP;
    public static final AKH<VoiceAvatarTakeoverState> LocalVoiceAvatarTakeoverState = new AGO(VoiceAvatarTakeoverKt$LocalVoiceAvatarTakeoverState$1.INSTANCE);
    public static final AKH<AvatarTakeoverIdleMedia> LocalVoiceCallIdleMedia;
    public static final AKH<Boolean> LocalVoiceCallTransitionComplete;
    public static final int StatusFadeInMillis = 150;
    public static final int StatusFadeOutMillis = 50;

    /* JADX WARN: Removed duplicated region for block: B:6:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg callAvatarFullScreenStatus(X.BRg r14, kotlin.jvm.functions.Function0<X.C1DG> r15, X.BFM r16, int r17) {
        /*
            r7 = r14
            r6 = r15
            boolean r4 = X.AnonymousClass004.A1b(r14, r15)
            X.AKH<com.facebook.aura.header.view.HatchStatusPillMetrics> r0 = com.facebook.aura.header.view.HatchStatusPillMetricsKt.LocalHatchStatusPillMetrics
            r5 = r16
            java.lang.Object r14 = r5.A6v(r0)
            com.facebook.aura.header.view.HatchStatusPillMetrics r14 = (com.facebook.aura.header.view.HatchStatusPillMetrics) r14
            com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverState r3 = X.C3cG.A0M(r5)
            com.facebook.aura.partners.voice.screen.VoiceAvatarFullScreenState r15 = r3.fullScreen
            X.AKH<java.lang.Boolean> r0 = com.facebook.aura.partners.voice.screen.HatchVoiceEmbodimentHostKt.LocalCallControlsHidden
            boolean r2 = X.AnonymousClass003.A1G(r5, r0)
            boolean r0 = r15.getExpanded()
            r10 = 1
            if (r0 != 0) goto L2a
            boolean r0 = r14.getAvatarExpanded()
            r13 = 0
            if (r0 == 0) goto L2b
        L2a:
            r13 = 1
        L2b:
            java.lang.Object r12 = r5.AaT()
            java.lang.Object r1 = X.C78N.A00
            if (r12 != r1) goto L3b
            com.facebook.aura.partners.voice.screen.StatusRowSwap r12 = new com.facebook.aura.partners.voice.screen.StatusRowSwap
            r12.<init>(r13)
            r5.Ai0(r12)
        L3b:
            com.facebook.aura.partners.voice.screen.StatusRowSwap r12 = (com.facebook.aura.partners.voice.screen.StatusRowSwap) r12
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r13)
            boolean r0 = r5.A66(r13)
            boolean r0 = X.AnonymousClass003.A1P(r5, r14, r15, r0)
            java.lang.Object r11 = r5.AaT()
            if (r0 != 0) goto L51
            if (r11 != r1) goto L5b
        L51:
            r16 = 0
            com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$callAvatarFullScreenStatus$1$1 r11 = new com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$callAvatarFullScreenStatus$1$1
            r11.<init>(r12, r13, r14, r15, r16)
            r5.Ai0(r11)
        L5b:
            X.AnonymousClass001.A1A(r5, r11, r12, r8)
            r0 = -1187746604(0xffffffffb9346cd4, float:-1.720668E-4)
            r5.AgE(r0)
            if (r2 == 0) goto L7b
            X.BS0 r8 = X.BRg.A00
            java.lang.Object r0 = r5.AaT()
            if (r0 != r1) goto L73
            com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$callAvatarFullScreenStatus$2$1$1 r0 = com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$callAvatarFullScreenStatus$2$1$1.INSTANCE
            r5.Ai0(r0)
        L73:
            X.BRg r0 = X.AnonymousClass001.A0X(r8, r0)
            X.BRg r7 = r7.then(r0)
        L7b:
            X.AnonymousClass001.A1D(r5)
            boolean r9 = X.AnonymousClass003.A1S(r5, r15, r2)
            r0 = r17 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r8 = 32
            if (r0 <= r8) goto L90
            boolean r0 = r5.A65(r6)
            if (r0 != 0) goto L95
        L90:
            r0 = r17 & 48
            if (r0 == r8) goto L95
            r10 = 0
        L95:
            r9 = r9 | r10
            java.lang.Object r0 = r5.AaT()
            if (r9 != 0) goto L9e
            if (r0 != r1) goto La6
        L9e:
            com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$callAvatarFullScreenStatus$3$1 r0 = new com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$callAvatarFullScreenStatus$3$1
            r0.<init>(r2, r12, r15, r6)
            r5.Ai0(r0)
        La6:
            X.G0W r0 = (X.G0W) r0
            X.BRg r0 = X.C3UC.A00(r7, r0)
            X.BRg r0 = statusFocusTarget(r0, r3, r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt.callAvatarFullScreenStatus(X.BRg, kotlin.jvm.functions.Function0, X.BFM, int):X.BRg");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* renamed from: callAvatarIdleFraming-RDsbke8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg m1748callAvatarIdleFramingRDsbke8(X.BRg r6, X.AWA r7, float r8, boolean r9, X.BFM r10, int r11) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r6, r0)
            r0 = -2010903969(0xffffffff88240a5f, float:-4.9364146E-34)
            r10.AgE(r0)
            boolean r0 = m1749isSquareCallAvatarMediaiaC8Vc4(r7)
            if (r0 != 0) goto L65
            com.facebook.aura.partners.voice.screen.VoiceAvatarFullScreenState r3 = X.C3cH.A0V(r10)
            X.1BN<com.facebook.aura.partners.voice.api.HatchSystemPipPresentationState> r0 = com.facebook.aura.partners.voice.api.HatchSystemPipRuntime.presentationState
            java.lang.Object r0 = X.C1BO.A07(r10, r0)
            com.facebook.aura.partners.voice.api.HatchSystemPipPresentationState r0 = (com.facebook.aura.partners.voice.api.HatchSystemPipPresentationState) r0
            boolean r4 = isInSystemPip(r0, r9)
            r0 = r11 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r5 = 0
            r2 = 256(0x100, float:3.59E-43)
            if (r0 <= r2) goto L2f
            boolean r0 = r10.A62(r8)
            if (r0 != 0) goto L34
        L2f:
            r1 = r11 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r1 != r2) goto L35
        L34:
            r0 = 1
        L35:
            boolean r2 = X.AnonymousClass004.A1U(r10, r3, r0, r4)
            r0 = r11 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r1 = 32
            if (r0 <= r1) goto L47
            boolean r0 = r10.A65(r7)
            if (r0 != 0) goto L4b
        L47:
            r0 = r11 & 48
            if (r0 != r1) goto L4c
        L4b:
            r5 = 1
        L4c:
            r2 = r2 | r5
            java.lang.Object r0 = r10.AaT()
            if (r2 != 0) goto L57
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L5f
        L57:
            com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$callAvatarIdleFraming$1$1 r0 = new com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$callAvatarIdleFraming$1$1
            r0.<init>(r8, r3, r4, r7)
            r10.Ai0(r0)
        L5f:
            X.G0W r0 = (X.G0W) r0
            X.BRg r6 = X.C3UC.A00(r6, r0)
        L65:
            X.AnonymousClass001.A1D(r10)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt.m1748callAvatarIdleFramingRDsbke8(X.BRg, X.AWA, float, boolean, X.BFM, int):X.BRg");
    }

    public static final BRg callAvatarIdleViewport(BRg bRg, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        VoiceAvatarFullScreenState voiceAvatarFullScreenStateA0V = C3cH.A0V(bfm);
        boolean zA65 = bfm.A65(voiceAvatarFullScreenStateA0V);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = new VoiceAvatarTakeoverKt$callAvatarIdleViewport$1$1(voiceAvatarFullScreenStateA0V);
            bfm.Ai0(objAaT);
        }
        return C3UC.A00(bRg, (G0W) objAaT);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg callAvatarPortraitViewport(X.BRg r5, float r6, X.BFM r7, int r8) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r5, r0)
            com.facebook.aura.partners.voice.screen.VoiceAvatarFullScreenState r3 = X.C3cH.A0V(r7)
            boolean r4 = r7.A65(r3)
            r0 = r8 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r2 = 32
            if (r0 <= r2) goto L1a
            boolean r0 = r7.A62(r6)
            if (r0 != 0) goto L1f
        L1a:
            r0 = r8 & 48
            r1 = 0
            if (r0 != r2) goto L20
        L1f:
            r1 = 1
        L20:
            r1 = r1 | r4
            java.lang.Object r0 = r7.AaT()
            if (r1 != 0) goto L2b
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L33
        L2b:
            com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$callAvatarPortraitViewport$1$1 r0 = new com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$callAvatarPortraitViewport$1$1
            r0.<init>(r3, r6)
            r7.Ai0(r0)
        L33:
            X.BRg r2 = X.AnonymousClass001.A0W(r5, r0)
            boolean r1 = r7.A65(r3)
            java.lang.Object r0 = r7.AaT()
            if (r1 != 0) goto L45
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L4d
        L45:
            com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$callAvatarPortraitViewport$2$1 r0 = new com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$callAvatarPortraitViewport$2$1
            r0.<init>(r3)
            r7.Ai0(r0)
        L4d:
            X.G0W r0 = (X.G0W) r0
            X.BRg r0 = X.C3UC.A00(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt.callAvatarPortraitViewport(X.BRg, float, X.BFM, int):X.BRg");
    }

    public static final boolean isInSystemPip(HatchSystemPipPresentationState hatchSystemPipPresentationState, boolean z) {
        C7384Etj.A0Y(hatchSystemPipPresentationState, 0);
        return !z && hatchSystemPipPresentationState == HatchSystemPipPresentationState.ACTIVE;
    }

    public static final void logEmbodimentExpandToggle(VoiceCallStateHolder voiceCallStateHolder, boolean z) {
        C7384Etj.A0Y(voiceCallStateHolder, 0);
        VoiceCallControlLoggingKt.logCallControlToggle(voiceCallStateHolder, z, HatchComponent.EMBODIMENT_EXPAND_BUTTON);
    }

    public static final C1BO<VoiceAvatarExpandedView> rememberCallAvatarSize(BFM bfm, int i) {
        return C2CK.A02(bfm, VoiceCallSurfacesKt.rememberVoiceCallViewModel(bfm, 0).rememberedAvatarSize);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1BO<java.lang.Boolean> rememberCallIdlePreparation(boolean r15, boolean r16, boolean r17, androidx.compose.runtime.MutableState<java.lang.Boolean> r18, X.BFM r19, int r20) {
        /*
            r0 = 3
            r8 = r18
            X.C7384Etj.A0Y(r8, r0)
            r11 = r20
            r0 = r20 & 14
            r0 = r0 ^ 6
            r1 = 4
            r14 = 0
            r7 = r19
            if (r0 <= r1) goto L18
            boolean r0 = r7.A66(r15)
            if (r0 != 0) goto L1d
        L18:
            r0 = r20 & 6
            r4 = 0
            if (r0 != r1) goto L1e
        L1d:
            r4 = 1
        L1e:
            r0 = r20 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r3 = 32
            r2 = r16
            if (r0 <= r3) goto L2e
            boolean r0 = r7.A66(r2)
            if (r0 != 0) goto L33
        L2e:
            r1 = r20 & 48
            r0 = 0
            if (r1 != r3) goto L34
        L33:
            r0 = 1
        L34:
            r4 = r4 | r0
            r0 = r11 & 7168(0x1c00, float:1.0045E-41)
            r12 = r0 ^ 3072(0xc00, float:4.305E-42)
            r10 = 2048(0x800, float:2.87E-42)
            if (r12 <= r10) goto L43
            boolean r0 = r7.A65(r8)
            if (r0 != 0) goto L48
        L43:
            r1 = r11 & 3072(0xc00, float:4.305E-42)
            r0 = 0
            if (r1 != r10) goto L49
        L48:
            r0 = 1
        L49:
            r4 = r4 | r0
            java.lang.Object r6 = r7.AaT()
            if (r4 != 0) goto L54
            java.lang.Object r0 = X.C78N.A00
            if (r6 != r0) goto L5d
        L54:
            com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$rememberCallIdlePreparation$waiting$1$1 r0 = new com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$rememberCallIdlePreparation$waiting$1$1
            r0.<init>(r15, r2, r8)
            X.BBP r6 = X.AnonymousClass003.A0R(r7, r0)
        L5d:
            X.1BO r6 = (X.C1BO) r6
            java.lang.Object r5 = r6.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r4 = r5.booleanValue()
            r9 = r17
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r9)
            boolean r13 = r7.A66(r4)
            r0 = r11 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r2 = 256(0x100, float:3.59E-43)
            if (r0 <= r2) goto L81
            boolean r0 = r7.A66(r9)
            if (r0 != 0) goto L86
        L81:
            r1 = r11 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r1 != r2) goto L87
        L86:
            r0 = 1
        L87:
            r13 = r13 | r0
            if (r12 <= r10) goto L90
            boolean r0 = r7.A65(r8)
            if (r0 != 0) goto L94
        L90:
            r0 = r11 & 3072(0xc00, float:4.305E-42)
            if (r0 != r10) goto L95
        L94:
            r14 = 1
        L95:
            r13 = r13 | r14
            java.lang.Object r0 = r7.AaT()
            if (r13 != 0) goto La0
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto La9
        La0:
            r1 = 0
            com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$rememberCallIdlePreparation$1$1 r0 = new com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$rememberCallIdlePreparation$1$1
            r0.<init>(r4, r9, r8, r1)
            r7.Ai0(r0)
        La9:
            X.G0V r0 = (X.G0V) r0
            X.C78e.A02(r7, r6, r5, r3, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt.rememberCallIdlePreparation(boolean, boolean, boolean, androidx.compose.runtime.MutableState, X.BFM, int):X.1BO");
    }

    static {
        VoiceAvatarTakeoverKt$LocalVoiceCallIdleMedia$1 voiceAvatarTakeoverKt$LocalVoiceCallIdleMedia$1 = VoiceAvatarTakeoverKt$LocalVoiceCallIdleMedia$1.INSTANCE;
        AGE ageA01 = AGF.A01();
        LocalVoiceCallIdleMedia = new AGN(ageA01, voiceAvatarTakeoverKt$LocalVoiceCallIdleMedia$1);
        LocalVoiceCallTransitionComplete = new AGN(ageA01, VoiceAvatarTakeoverKt$LocalVoiceCallTransitionComplete$1.INSTANCE);
        CallAvatarOverlap = 2.0f;
        DARK_CALL_BACKDROP = HxS.A01(BaseColors.BLACK);
    }

    public static final float getCallAvatarOverlap() {
        return CallAvatarOverlap;
    }

    public static final int getDARK_CALL_BACKDROP() {
        return DARK_CALL_BACKDROP;
    }

    public static final AKH<VoiceAvatarTakeoverState> getLocalVoiceAvatarTakeoverState() {
        return LocalVoiceAvatarTakeoverState;
    }

    public static final AKH<AvatarTakeoverIdleMedia> getLocalVoiceCallIdleMedia() {
        return LocalVoiceCallIdleMedia;
    }

    public static final AKH<Boolean> getLocalVoiceCallTransitionComplete() {
        return LocalVoiceCallTransitionComplete;
    }

    /* renamed from: isSquareCallAvatarMedia-iaC8Vc4, reason: not valid java name */
    public static final boolean m1749isSquareCallAvatarMediaiaC8Vc4(AWA awa) {
        if (awa != null) {
            long j = awa.A00;
            if (!AWA.A06(j) && AnonymousClass003.A03(j) == AnonymousClass004.A00(j)) {
                return true;
            }
        }
        return false;
    }

    public static final int largestCallAvatarSize(ADq aDq, int i, int i2, int i3, int i4, AaC aaC, float f, int i5) {
        float f2 = aaC.A03 + f;
        float f3 = aaC.A00 - f;
        if (f3 < f2) {
            f3 = f2;
        }
        int i6 = aDq.A00;
        int i7 = aDq.A01;
        int i8 = 0;
        while (i6 <= i7) {
            int i9 = ((i7 - i6) / 2) + i6;
            float f4 = i9 / 2.0f;
            float fA01 = Ab3.A01((i - i9) / 2.0f) + f4;
            int i10 = i9 - i4;
            if (i10 < 0) {
                i10 = 0;
            }
            float fMax = Math.max(i2, i3 - i10) + f4;
            float fA03 = fA01 - ATD.A03(fA01, aaC.A01 + f, aaC.A02 - f);
            float fA032 = fMax - ATD.A03(fMax, f2, f3);
            float f5 = f4 + f + i5;
            if ((fA03 * fA03) + (fA032 * fA032) >= f5 * f5) {
                i6 = i9 + 1;
                i8 = i9;
            } else {
                i7 = i9 - 1;
            }
        }
        return i8;
    }

    public static final AvatarTakeoverLayout rememberAvatarTakeoverLayout(boolean z, BFM bfm, int i) {
        int iAH1;
        int iALn;
        int iLargestCallAvatarSize;
        long jAE1 = ((C60K) bfm.A6v(Am0.A0I)).AE1();
        AXN axnA0Y = AnonymousClass002.A0Y(bfm);
        EnumC1820Arj enumC1820Arj = (EnumC1820Arj) bfm.A6v(Am0.A0A);
        C1OP c1opA00 = C1OP.A00(bfm);
        if (z) {
            iAH1 = c1opA00.AH1(axnA0Y, enumC1820Arj) + c1opA00.AJo(axnA0Y, enumC1820Arj);
            iALn = c1opA00.ALn(axnA0Y) + c1opA00.ACy(axnA0Y);
        } else {
            iAH1 = 0;
            iALn = 0;
        }
        float fA00 = C3cG.A00(bfm, AuraTheme.INSTANCE);
        HatchStatusPillMetrics hatchStatusPillMetricsA0a = AnonymousClass002.A0a(bfm);
        int iALn2 = z ? c1opA00.ALn(axnA0Y) + axnA0Y.Abr(14.0f) : 0;
        C1DG c1dgM1001getHeaderRowBottomlTKBWiU = hatchStatusPillMetricsA0a.m1001getHeaderRowBottomlTKBWiU();
        int iAbr = c1dgM1001getHeaderRowBottomlTKBWiU != null ? axnA0Y.Abr(c1dgM1001getHeaderRowBottomlTKBWiU.A00) : axnA0Y.Abr(60.0f) + iALn2;
        C1DG c1dgM1004getTrailingChromeCenterYlTKBWiU = hatchStatusPillMetricsA0a.m1004getTrailingChromeCenterYlTKBWiU();
        float fAh4 = c1dgM1004getTrailingChromeCenterYlTKBWiU != null ? axnA0Y.Ah4(c1dgM1004getTrailingChromeCenterYlTKBWiU.A00) : iAbr - (axnA0Y.Abr(48.0f) / 2.0f);
        boolean zA1a = AnonymousClass001.A1a(AnonymousClass002.A1S(bfm, iALn2, AnonymousClass001.A1a(AnonymousClass002.A1S(bfm, iAH1, bfm.A64(jAE1), bfm.A65(axnA0Y)), bfm, iALn), bfm.A62(fA00)), bfm, iAbr) | bfm.A62(fAh4);
        Object objAaT = bfm.AaT();
        if (zA1a || objAaT == C78N.A00) {
            int i2 = ((int) (jAE1 >> 32)) - iAH1;
            if (i2 < 0) {
                i2 = 0;
            }
            int iA09 = AnonymousClass002.A09(jAE1) - iALn;
            if (iA09 < 0) {
                iA09 = 0;
            }
            int iAbr2 = axnA0Y.Abr(AuraDimensKt.SpacingSmall);
            int iAbr3 = axnA0Y.Abr(HeaderButtonKt.PillIconTouchTarget);
            int iAbr4 = i2 - axnA0Y.Abr(fA00);
            int i3 = iAbr4 - iAbr3;
            float f = iAbr3;
            float f2 = f / 2.0f;
            float f3 = fAh4 - f2;
            AaC aaC = new AaC(i3, f3, iAbr4, (iAbr3 * 2) + f3);
            int i4 = (i3 * 2) - i2;
            if (i4 < 0) {
                i4 = 0;
            }
            int iA01 = Ab3.A01(Math.min(i2, iA09) * 0.3816794f);
            int iAbr5 = axnA0Y.Abr(CallAvatarOverlap);
            int iMax = Math.max(iAbr, Ab3.A01(f3 + f)) + iAbr2;
            if (i4 >= iAbr3) {
                ADq aDq = new ADq(axnA0Y.Abr(HatchStatusPillAvatarPanelKt.MinVisibleAvatarSize), Math.min(iA01, Math.min(axnA0Y.Abr(170.0f), i4)));
                float fAh42 = axnA0Y.Ah4(24.0f);
                if (fAh42 > f2) {
                    fAh42 = f2;
                }
                iLargestCallAvatarSize = largestCallAvatarSize(aDq, i2, iALn2, iMax, iAbr5, aaC, fAh42, iAbr2);
            } else {
                iLargestCallAvatarSize = 0;
            }
            int i5 = iMax - iALn2;
            int i6 = iLargestCallAvatarSize - iAbr5;
            if (i6 < 0) {
                i6 = 0;
            }
            int i7 = i5 - i6;
            if (i7 < 0) {
                i7 = 0;
            }
            objAaT = new AvatarTakeoverLayout(axnA0Y.Agy(iLargestCallAvatarSize), axnA0Y.Agy(i7));
            bfm.Ai0(objAaT);
        }
        return (AvatarTakeoverLayout) objAaT;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075 A[PHI: r7
  0x0075: PHI (r7v4 com.facebook.aura.header.api.AvatarTakeoverIdleMedia) = 
  (r7v3 com.facebook.aura.header.api.AvatarTakeoverIdleMedia)
  (r7v6 com.facebook.aura.header.api.AvatarTakeoverIdleMedia)
 binds: [B:25:0x0067, B:27:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.header.api.AvatarTakeoverIdleMedia rememberCallAvatarIdleMedia(boolean r9, X.BFM r10, int r11) {
        /*
            X.AKH<com.facebook.aura.header.api.AvatarTakeoverIdleMedia> r0 = com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt.LocalVoiceCallIdleMedia
            java.lang.Object r7 = r10.A6v(r0)
            com.facebook.aura.header.api.AvatarTakeoverIdleMedia r7 = (com.facebook.aura.header.api.AvatarTakeoverIdleMedia) r7
            r6 = 0
            if (r7 == 0) goto L7b
            if (r9 == 0) goto L7b
        Ld:
            com.facebook.aura.header.view.HatchStatusPillMetrics r2 = X.AnonymousClass002.A0a(r10)
            com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverState r1 = X.C3cG.A0M(r10)
            boolean r0 = r10.A65(r2)
            java.lang.Object r8 = r10.AaT()
            if (r0 != 0) goto L23
            java.lang.Object r0 = X.C78N.A00
            if (r8 != r0) goto L2c
        L23:
            com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$rememberCallAvatarIdleMedia$collapsing$2$1 r0 = new com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$rememberCallAvatarIdleMedia$collapsing$2$1
            r0.<init>(r2, r1)
            X.BBP r8 = X.AnonymousClass002.A0K(r10, r6, r0)
        L2c:
            X.1BO r8 = (X.C1BO) r8
            java.lang.Object r5 = r10.AaT()
            java.lang.Object r4 = X.C78N.A00
            if (r5 != r4) goto L3a
            androidx.compose.runtime.ParcelableSnapshotMutableState r5 = X.AnonymousClass004.A11(r10, r6)
        L3a:
            androidx.compose.runtime.MutableState r5 = (androidx.compose.runtime.MutableState) r5
            r0 = r11 & 14
            r0 = r0 ^ 6
            r3 = 4
            r2 = 0
            if (r0 <= r3) goto L4a
            boolean r0 = r10.A66(r9)
            if (r0 != 0) goto L4f
        L4a:
            r1 = r11 & 6
            r0 = 0
            if (r1 != r3) goto L50
        L4f:
            r0 = 1
        L50:
            boolean r1 = X.AnonymousClass003.A1P(r10, r8, r7, r0)
            java.lang.Object r0 = r10.AaT()
            if (r1 != 0) goto L5c
            if (r0 != r4) goto L64
        L5c:
            com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$rememberCallAvatarIdleMedia$1$1 r0 = new com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$rememberCallAvatarIdleMedia$1$1
            r0.<init>(r9, r7, r8, r5)
            r10.Ai0(r0)
        L64:
            X.AnonymousClass001.A15(r10, r0)
            if (r9 != 0) goto L75
            java.lang.Object r7 = r5.getValue()
            com.facebook.aura.header.api.AvatarTakeoverIdleMedia r7 = (com.facebook.aura.header.api.AvatarTakeoverIdleMedia) r7
            boolean r0 = X.C1BO.A0F(r8)
            if (r0 == 0) goto L76
        L75:
            r6 = r7
        L76:
            com.facebook.aura.header.api.AvatarTakeoverIdleMedia r0 = com.facebook.aura.partners.voice.screen.VoiceEmbodimentIdlePlaybackKt.rememberMemoryAwareIdleMedia(r6, r10, r2)
            return r0
        L7b:
            r7 = r6
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt.rememberCallAvatarIdleMedia(boolean, X.BFM, int):com.facebook.aura.header.api.AvatarTakeoverIdleMedia");
    }

    public static final Function0<Unit> rememberCallAvatarPanelToggle(BFM bfm, int i) {
        HatchStatusPillMetrics hatchStatusPillMetrics = (HatchStatusPillMetrics) bfm.A6v(HatchStatusPillMetricsKt.LocalHatchStatusPillMetrics);
        VoiceAvatarFullScreenState voiceAvatarFullScreenStateA0V = C3cH.A0V(bfm);
        AbstractC3358CGz abstractC3358CGzA0g = AnonymousClass002.A0g(bfm);
        C0dx c0dx = (C0dx) bfm.A6v(Am0.A08);
        C1BO<VoiceAvatarExpandedView> c1boRememberCallAvatarSize = rememberCallAvatarSize(bfm, 0);
        boolean zA1R = AnonymousClass001.A1R(bfm, c1boRememberCallAvatarSize, AnonymousClass005.A1T(bfm, voiceAvatarFullScreenStateA0V, abstractC3358CGzA0g, c0dx, bfm.A65(hatchStatusPillMetrics)));
        Object objAaT = bfm.AaT();
        if (zA1R || objAaT == C78N.A00) {
            objAaT = new VoiceAvatarTakeoverKt$rememberCallAvatarPanelToggle$1$1(c0dx, abstractC3358CGzA0g, voiceAvatarFullScreenStateA0V, hatchStatusPillMetrics, c1boRememberCallAvatarSize);
            bfm.Ai0(objAaT);
        }
        return (Function0) objAaT;
    }

    public static final void openFromAvatar(VoiceAvatarFullScreenState voiceAvatarFullScreenState, HatchStatusPillMetrics hatchStatusPillMetrics, VoiceAvatarExpandedView voiceAvatarExpandedView) {
        hatchStatusPillMetrics.setAvatarExpanded(AnonymousClass005.A1Z(voiceAvatarFullScreenState, hatchStatusPillMetrics, voiceAvatarExpandedView));
        if (voiceAvatarExpandedView == VoiceAvatarExpandedView.FULL_SCREEN && (!VoiceGating.INSTANCE.isFullScreenExpandedViewDisabled())) {
            voiceAvatarFullScreenState.expand(hatchStatusPillMetrics);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Type inference failed for: r16v0, types: [X.BFM, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [androidx.compose.runtime.snapshots.Snapshot] */
    /* JADX WARN: Type inference failed for: r1v21, types: [androidx.compose.runtime.snapshots.Snapshot] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22, types: [androidx.compose.runtime.snapshots.Snapshot] */
    /* JADX WARN: Type inference failed for: r2v23, types: [androidx.compose.runtime.snapshots.Snapshot] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$rememberAvatarTakeoverTransition$framing$1] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$rememberAvatarTakeoverTransition$topPadding$1] */
    /* renamed from: rememberAvatarTakeoverTransition-TDGSqEk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.header.api.AvatarTakeoverTransition m1750rememberAvatarTakeoverTransitionTDGSqEk(boolean r13, com.facebook.aura.header.api.AvatarTakeoverLayout r14, float r15, X.BFM r16, int r17) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt.m1750rememberAvatarTakeoverTransitionTDGSqEk(boolean, com.facebook.aura.header.api.AvatarTakeoverLayout, float, X.BFM, int):com.facebook.aura.header.api.AvatarTakeoverTransition");
    }

    public static final Integer rememberCallAvatarBackdropColor(BFM bfm, int i) {
        HatchStatusPillMetrics hatchStatusPillMetricsA0a = AnonymousClass002.A0a(bfm);
        VoiceAvatarTakeoverState voiceAvatarTakeoverStateA0M = C3cG.A0M(bfm);
        Integer numValueOf = C1BO.A0F(C2CK.A02(bfm, VoiceCallSurfacesKt.rememberVoiceCallViewModel(bfm, 0).isCallBackdropDark)) ? Integer.valueOf(DARK_CALL_BACKDROP) : voiceAvatarTakeoverStateA0M.getBackdropColor();
        boolean zA65 = bfm.A65(hatchStatusPillMetricsA0a);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = AnonymousClass002.A0K(bfm, null, new VoiceAvatarTakeoverKt$rememberCallAvatarBackdropColor$collapsing$2$1(hatchStatusPillMetricsA0a, voiceAvatarTakeoverStateA0M));
        }
        C1BO c1bo = (C1BO) objAaT;
        boolean zA652 = bfm.A65(hatchStatusPillMetricsA0a);
        Object objAaT2 = bfm.AaT();
        if (zA652 || objAaT2 == C78N.A00) {
            objAaT2 = AnonymousClass004.A11(bfm, numValueOf);
        }
        MutableState mutableState = (MutableState) objAaT2;
        boolean zA1R = AnonymousClass005.A1R(bfm, numValueOf, c1bo, mutableState);
        Object objAaT3 = bfm.AaT();
        if (zA1R || objAaT3 == C78N.A00) {
            objAaT3 = new VoiceAvatarTakeoverKt$rememberCallAvatarBackdropColor$1$1(numValueOf, c1bo, mutableState);
            bfm.Ai0(objAaT3);
        }
        AnonymousClass001.A15(bfm, objAaT3);
        if (numValueOf == null) {
            numValueOf = (Integer) mutableState.getValue();
            if (!C1BO.A0F(c1bo)) {
                return null;
            }
        }
        return numValueOf;
    }

    public static final boolean rememberHasWindowFocus(BFM bfm, int i) {
        View viewA0J = AnonymousClass001.A0J(bfm);
        boolean zA65 = bfm.A65(viewA0J);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = AnonymousClass005.A0S(bfm, viewA0J.hasWindowFocus());
        }
        MutableState mutableState = (MutableState) objAaT;
        boolean zA1J = AnonymousClass003.A1J(bfm, mutableState, viewA0J);
        Object objAaT2 = bfm.AaT();
        if (zA1J || objAaT2 == C78N.A00) {
            objAaT2 = new VoiceAvatarTakeoverKt$rememberHasWindowFocus$1$1(viewA0J, mutableState);
            bfm.Ai0(objAaT2);
        }
        AnonymousClass001.A17(bfm, objAaT2, viewA0J);
        return MutableState.A0A(mutableState);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg statusFocusTarget(X.BRg r11, com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverState r12, X.BFM r13, int r14) {
        /*
            r0 = 1319071193(0x4e9f6dd9, float:1.33738816E9)
            r13.AgE(r0)
            r5 = 0
            boolean r0 = com.facebook.aura.vds.compose.accessibility.ScreenReaderKt.rememberIsScreenReaderEnabled(r13, r5)
            if (r0 != 0) goto L11
            X.AnonymousClass001.A1D(r13)
            return r11
        L11:
            X.CGz r1 = X.AnonymousClass002.A0h(r13)
            boolean r0 = r13.A65(r1)
            java.lang.Object r6 = r13.AaT()
            if (r0 != 0) goto L23
            java.lang.Object r0 = X.C78N.A00
            if (r6 != r0) goto L2a
        L23:
            com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r6 = X.C3cG.A0K(r1)
            r13.Ai0(r6)
        L2a:
            com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r6 = (com.facebook.aura.partners.voice.intf.VoiceCallStateHolder) r6
            X.1BN<java.lang.Boolean> r0 = r6.isCallActive
            X.1BO r4 = X.C2CK.A02(r13, r0)
            r0 = r14 & 112(0x70, float:1.57E-43)
            r10 = r0 ^ 48
            r9 = 32
            if (r10 <= r9) goto L40
            boolean r0 = r13.A65(r12)
            if (r0 != 0) goto L45
        L40:
            r0 = r14 & 48
            r1 = 0
            if (r0 != r9) goto L46
        L45:
            r1 = 1
        L46:
            java.lang.Object r0 = r13.AaT()
            if (r1 != 0) goto L50
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L58
        L50:
            com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$statusFocusTarget$1$1 r0 = new com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$statusFocusTarget$1$1
            r0.<init>(r12)
            r13.Ai0(r0)
        L58:
            X.AnonymousClass001.A17(r13, r0, r12)
            androidx.compose.runtime.MutableState r0 = r12.isStatusFocusPending$delegate
            boolean r0 = androidx.compose.runtime.MutableState.A0A(r0)
            if (r0 == 0) goto Ldf
            r0 = 1794654342(0x6af84086, float:1.5005915E26)
            r13.AgE(r0)
            X.1BN<java.lang.Long> r0 = r6.pendingCallStart
            X.1BO r1 = X.C2CK.A02(r13, r0)
            boolean r0 = X.C1BO.A0F(r4)
            if (r0 != 0) goto L7c
            java.lang.Object r0 = r1.getValue()
            r8 = 0
            if (r0 == 0) goto L7d
        L7c:
            r8 = 1
        L7d:
            boolean r7 = rememberHasWindowFocus(r13, r5)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r8)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)
            if (r10 <= r9) goto L91
            boolean r0 = r13.A65(r12)
            if (r0 != 0) goto L96
        L91:
            r0 = r14 & 48
            r1 = 0
            if (r0 != r9) goto L97
        L96:
            r1 = 1
        L97:
            boolean r0 = r13.A66(r8)
            r0 = r0 | r1
            boolean r1 = X.AnonymousClass001.A1U(r13, r7, r0)
            java.lang.Object r0 = r13.AaT()
            if (r1 != 0) goto Laa
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto Lb2
        Laa:
            com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$statusFocusTarget$2$1 r0 = new com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$statusFocusTarget$2$1
            r0.<init>(r12, r8, r7)
            r13.Ai0(r0)
        Lb2:
            X.AnonymousClass001.A19(r13, r0, r3, r2)
        Lb5:
            X.BBI r3 = X.C3cG.A07(r13)
            X.AkS r0 = r12.statusFocus
            X.BRg r2 = X.BHJ.A00(r11, r0)
            boolean r1 = X.AnonymousClass003.A1J(r13, r4, r6)
            java.lang.Object r0 = r13.AaT()
            if (r1 != 0) goto Lcd
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto Ld5
        Lcd:
            com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$statusFocusTarget$3$1 r0 = new com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$statusFocusTarget$3$1
            r0.<init>(r6, r4)
            r13.Ai0(r0)
        Ld5:
            X.G0U r0 = (X.G0U) r0
            X.BRg r0 = X.AbstractC2022Awb.A00(r2, r0)
            X.BBI.A0R(r3, r5)
            return r0
        Ldf:
            r0 = 1795118505(0x6aff55a9, float:1.543403E26)
            r13.AgE(r0)
            goto Lb5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt.statusFocusTarget(X.BRg, com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverState, X.BFM, int):X.BRg");
    }
}
