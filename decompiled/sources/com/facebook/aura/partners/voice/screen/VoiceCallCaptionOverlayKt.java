package com.facebook.aura.partners.voice.screen;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C1515AkP;
import X.C1BO;
import X.C1Cd;
import X.C2CK;
import X.C2VU;
import X.C3Ue;
import X.C3cG;
import X.C78N;
import X.F60;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraOverlayNavKey;
import com.facebook.aura.navigation.key.ConversationScreenKey;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import com.facebook.aura.partners.voice.ui.VoiceCallCaptionsKt;
import com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel;
import com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModelKt;
import com.facebook.aura.partners.voice.viewmodel.VoiceCaptionScreen;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class VoiceCallCaptionOverlayKt {

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceCallCaptionOverlayKt$CaptionStyleCrossfade$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function0<Float> $fullScreenFraction;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCaptionHidden;
        public final /* synthetic */ BRg $settledModifier;
        public final /* synthetic */ boolean $showFullScreen;
        public final /* synthetic */ boolean $showPassive;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, boolean z2, Function0<Float> function0, BRg bRg, Function0<Unit> function02, BRg bRg2, int i, int i2) {
            super(2);
            this.$showPassive = z;
            this.$showFullScreen = z2;
            this.$fullScreenFraction = function0;
            this.$settledModifier = bRg;
            this.$onCaptionHidden = function02;
            this.$modifier = bRg2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceCallCaptionOverlayKt.CaptionStyleCrossfade(this.$showPassive, this.$showFullScreen, this.$fullScreenFraction, this.$settledModifier, this.$onCaptionHidden, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceCallCaptionOverlayKt$VoiceCallCaptionOverlay$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function0<Boolean> $isCaptionSurface;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $visible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, Function0<Boolean> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$visible = z;
            this.$isCaptionSurface = function0;
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
            VoiceCallCaptionOverlayKt.VoiceCallCaptionOverlay(this.$visible, this.$isCaptionSurface, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceCallCaptionOverlayKt$VoiceCallCaptionOverlay$2, reason: invalid class name and case insensitive filesystem */
    public final class C131812 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function0<Boolean> $isCaptionSurface;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $visible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131812(boolean z, Function0<Boolean> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$visible = z;
            this.$isCaptionSurface = function0;
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
            VoiceCallCaptionOverlayKt.VoiceCallCaptionOverlay(this.$visible, this.$isCaptionSurface, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceCallCaptionOverlayKt$VoiceCallCaptionOverlay$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0W<C1Cd, BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<Integer> $animatedChromeInset;
        public final /* synthetic */ boolean $captionVisible;
        public final /* synthetic */ C1BO<Integer> $chromeBottomInset$delegate;
        public final /* synthetic */ VoiceAvatarFullScreenState $fullScreen;
        public final /* synthetic */ C1BO<Boolean> $fullScreenCaption$delegate;
        public final /* synthetic */ C1BO<Boolean> $styleChanging$delegate;
        public final /* synthetic */ VoiceAvatarTakeoverState $takeoverState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(VoiceAvatarTakeoverState voiceAvatarTakeoverState, C1BO<Integer> c1bo, C1BO<Integer> c1bo2, VoiceAvatarFullScreenState voiceAvatarFullScreenState, boolean z, C1BO<Boolean> c1bo3, C1BO<Boolean> c1bo4) {
            super(3);
            this.$takeoverState = voiceAvatarTakeoverState;
            this.$animatedChromeInset = c1bo;
            this.$chromeBottomInset$delegate = c1bo2;
            this.$fullScreen = voiceAvatarFullScreenState;
            this.$captionVisible = z;
            this.$styleChanging$delegate = c1bo3;
            this.$fullScreenCaption$delegate = c1bo4;
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x011f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.C1Cd r17, X.BFM r18, int r19) {
            /*
                Method dump skipped, instructions count: 339
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceCallCaptionOverlayKt.AnonymousClass6.invoke(X.1Cd, X.BFM, int):void");
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C1Cd c1Cd, BFM bfm, Integer num) {
            invoke(c1Cd, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceCallCaptionOverlayKt$VoiceCallCaptionOverlay$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function0<Boolean> $isCaptionSurface;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $visible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(boolean z, Function0<Boolean> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$visible = z;
            this.$isCaptionSurface = function0;
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
            VoiceCallCaptionOverlayKt.VoiceCallCaptionOverlay(this.$visible, this.$isCaptionSurface, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final float rememberVoiceCallCaptionReservation(BFM bfm, int i) {
        return VoiceCallCaptionsKt.rememberVoiceCallOverlayCaptionMaxHeight(bfm, 0) + AuraDimensKt.SpacingSmall;
    }

    public static final boolean rememberVoiceCallCaptionShowing(BFM bfm, int i) {
        return C1BO.A0F(C2CK.A02(bfm, VoiceCallSurfacesKt.rememberVoiceCallViewModel(bfm, 0).isTabRootCaptionVisible));
    }

    public static final void CaptionStyleCrossfade(boolean z, boolean z2, Function0<Float> function0, BRg bRg, Function0<Unit> function02, BRg bRg2, BFM bfm, int i, int i2) {
        BRg bRgA0X;
        BRg bRg3 = bRg2;
        bfm.AgG(-756606888);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0o(bfm, z2);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0g(bfm, bRg);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0n |= AnonymousClass004.A0X(bfm, function02);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0n |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg3);
            iA0n |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0n, 74898), bfm, iA0n)) {
            if (i3 != 0) {
                bRg3 = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(C2VU.A06, false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg3);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
            BRg bRgA0W = null;
            if (z) {
                bfm.AgE(1084080339);
                if (function0 == null) {
                    bfm.AgE(1084179941);
                    BBI.A0R(bbi, false);
                } else {
                    BS0 bs0A09 = C3cG.A09(bfm, 1084179942);
                    boolean zA65 = bfm.A65(function0);
                    Object objAaT = bfm.AaT();
                    if (zA65 || objAaT == C78N.A00) {
                        objAaT = new VoiceCallCaptionOverlayKt$CaptionStyleCrossfade$1$1$1$1(function0);
                        bfm.Ai0(objAaT);
                    }
                    BRg bRgA0W2 = AnonymousClass001.A0W(bs0A09, objAaT);
                    Object objAaT2 = bfm.AaT();
                    if (objAaT2 == C78N.A00) {
                        objAaT2 = VoiceCallCaptionOverlayKt$CaptionStyleCrossfade$1$1$2$1.INSTANCE;
                        bfm.Ai0(objAaT2);
                    }
                    bRgA0X = AnonymousClass001.A0X(bRgA0W2, objAaT2);
                    BBI.A0R(bbi, false);
                    if (bRgA0X == null) {
                    }
                    VoiceCallCurrentCaptionKt.VoiceCallCurrentCaption(bRgA0X, true, function02, bfm, ((iA0n >> 6) & 896) | 48, 0);
                }
                bRgA0X = bRg;
                VoiceCallCurrentCaptionKt.VoiceCallCurrentCaption(bRgA0X, true, function02, bfm, ((iA0n >> 6) & 896) | 48, 0);
            } else {
                bfm.AgE(1084360176);
            }
            BBI.A0R(bbi, false);
            if (z2) {
                bfm.AgE(1084392168);
                if (function0 == null) {
                    bfm.AgE(1084473728);
                } else {
                    BS0 bs0A092 = C3cG.A09(bfm, 1084473729);
                    boolean zA652 = bfm.A65(function0);
                    Object objAaT3 = bfm.AaT();
                    if (zA652 || objAaT3 == C78N.A00) {
                        objAaT3 = new VoiceCallCaptionOverlayKt$CaptionStyleCrossfade$1$2$1$1(function0);
                        bfm.Ai0(objAaT3);
                    }
                    bRgA0W = AnonymousClass001.A0W(bs0A092, objAaT3);
                }
                BBI.A0R(bbi, false);
                if (bRgA0W == null) {
                    bRgA0W = bRg;
                }
                VoiceCallCurrentCaptionKt.VoiceCallCurrentCaption(bRgA0W, false, function02, bfm, (iA0n >> 6) & 896, 2);
            } else {
                bfm.AgE(1084615120);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(z, z2, function0, bRg, function02, bRg3, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void VoiceCallCaptionOverlay(boolean r37, kotlin.jvm.functions.Function0<java.lang.Boolean> r38, X.BRg r39, X.BFM r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceCallCaptionOverlayKt.VoiceCallCaptionOverlay(boolean, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int):void");
    }

    public static final VoiceCaptionScreen toCaptionScreen(AuraNavKey auraNavKey) {
        VoiceCaptionScreen conversation;
        if (auraNavKey == null || (auraNavKey instanceof AuraBottomSheetNavKey) || (auraNavKey instanceof AuraOverlayNavKey)) {
            conversation = VoiceCaptionScreen.Hidden.INSTANCE;
        } else if (auraNavKey instanceof ConversationTabScreenKey) {
            conversation = new VoiceCaptionScreen.Conversation(null);
        } else {
            if (auraNavKey instanceof ConversationScreenKey) {
                return new VoiceCaptionScreen.Conversation(VoiceCallViewModelKt.conversationThread(((ConversationScreenKey) auraNavKey).sessionId));
            }
            conversation = VoiceCaptionScreen.TabRoot.INSTANCE;
        }
        return conversation;
    }

    public static final Function0<Boolean> rememberVoiceCallCaptionSurface(BFM bfm, int i) {
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        VoiceCallViewModel voiceCallViewModelRememberVoiceCallViewModel = VoiceCallSurfacesKt.rememberVoiceCallViewModel(bfm, 0);
        C1BO c1boA02 = C2CK.A02(bfm, voiceCallViewModelRememberVoiceCallViewModel.callThread);
        boolean zA1R = AnonymousClass005.A1R(bfm, auraNavigatorA0b, voiceCallViewModelRememberVoiceCallViewModel, c1boA02);
        Object objAaT = bfm.AaT();
        if (zA1R || objAaT == C78N.A00) {
            objAaT = AnonymousClass002.A0K(bfm, null, new VoiceCallCaptionOverlayKt$rememberVoiceCallCaptionSurface$surface$1$1(voiceCallViewModelRememberVoiceCallViewModel, auraNavigatorA0b, c1boA02));
        }
        C1BO c1bo = (C1BO) objAaT;
        boolean zA65 = bfm.A65(c1bo);
        Object objAaT2 = bfm.AaT();
        if (zA65 || objAaT2 == C78N.A00) {
            objAaT2 = new VoiceCallCaptionOverlayKt$rememberVoiceCallCaptionSurface$1$1(c1bo);
            bfm.Ai0(objAaT2);
        }
        return (Function0) objAaT2;
    }
}
