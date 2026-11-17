package com.facebook.aura.partners.voice.screen;

import X.AGE;
import X.AGF;
import X.AGN;
import X.AKH;
import X.AXN;
import X.AaC;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C1743Apg;
import X.C1BO;
import X.C1OM;
import X.C20Q;
import X.C2CK;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.G0V;
import X.G0W;
import X.InterfaceC05151eP;
import com.facebook.aura.header.api.AvatarTakeover;
import com.facebook.aura.header.api.AvatarTakeoverIdleMedia;
import com.facebook.aura.header.api.AvatarTakeoverKt;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia;
import com.facebook.aura.partners.voice.prefs.VoicePrefs;
import com.facebook.aura.status.view.HatchAnimatedBotAvatarKt;
import com.facebook.aura.status.viewmodel.HatchPillState;
import com.facebook.aura.ui.adaptive.AuraLayoutSizeKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public abstract class HatchVoiceEmbodimentHostKt {
    public static final AKH<G0V<BFM, Integer, Unit>> LocalCallControlsAdditionalContent;
    public static final AKH<Boolean> LocalCallControlsHidden;
    public static final AKH<G0W<BRg, BFM, Integer, Unit>> LocalVoiceAvatarContent;

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceEmbodimentHostKt$EmbodimentPlacementReporter$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $active;
        public final /* synthetic */ VoiceAvatarFullScreenState $fullScreen;
        public final /* synthetic */ boolean $isCompactHost;
        public final /* synthetic */ VoiceCallStateHolder $stateHolder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(VoiceCallStateHolder voiceCallStateHolder, VoiceAvatarFullScreenState voiceAvatarFullScreenState, boolean z, boolean z2, int i) {
            super(2);
            this.$stateHolder = voiceCallStateHolder;
            this.$fullScreen = voiceAvatarFullScreenState;
            this.$isCompactHost = z;
            this.$active = z2;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchVoiceEmbodimentHostKt.EmbodimentPlacementReporter(this.$stateHolder, this.$fullScreen, this.$isCompactHost, this.$active, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceEmbodimentHostKt$HatchVoiceEmbodimentHost$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0W<InterfaceC05151eP, BFM, Integer, Unit> $content;
        public final /* synthetic */ boolean $isCompactHost;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ VoiceAvatarTakeoverState $takeoverState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(VoiceAvatarTakeoverState voiceAvatarTakeoverState, BRg bRg, boolean z, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w) {
            super(2);
            this.$takeoverState = voiceAvatarTakeoverState;
            this.$modifier = bRg;
            this.$isCompactHost = z;
            this.$content = g0w;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                HatchVoiceEmbodimentHostKt.HatchVoiceEmbodimentHostContent(this.$takeoverState, this.$modifier, this.$isCompactHost, this.$content, bfm, 6);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceEmbodimentHostKt$HatchVoiceEmbodimentHost$2, reason: invalid class name and case insensitive filesystem */
    public final class C131562 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0W<InterfaceC05151eP, BFM, Integer, Unit> $content;
        public final /* synthetic */ boolean $isCompactHost;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C131562(BRg bRg, boolean z, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$isCompactHost = z;
            this.$content = g0w;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchVoiceEmbodimentHostKt.HatchVoiceEmbodimentHost(this.$modifier, this.$isCompactHost, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceEmbodimentHostKt$HatchVoiceEmbodimentHostContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C131572 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0W<InterfaceC05151eP, BFM, Integer, Unit> $content;
        public final /* synthetic */ boolean $isCompactHost;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ VoiceAvatarTakeoverState $takeoverState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C131572(VoiceAvatarTakeoverState voiceAvatarTakeoverState, BRg bRg, boolean z, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w, int i) {
            super(2);
            this.$takeoverState = voiceAvatarTakeoverState;
            this.$modifier = bRg;
            this.$isCompactHost = z;
            this.$content = g0w;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchVoiceEmbodimentHostKt.HatchVoiceEmbodimentHostContent(this.$takeoverState, this.$modifier, this.$isCompactHost, this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceEmbodimentHostKt$StatusAvatarPipBounds$1, reason: invalid class name and case insensitive filesystem */
    public final class C131581 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $fullScreen;
        public final /* synthetic */ HatchSystemPipState $systemPip;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131581(HatchSystemPipState hatchSystemPipState, boolean z, int i) {
            super(2);
            this.$systemPip = hatchSystemPipState;
            this.$fullScreen = z;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchVoiceEmbodimentHostKt.StatusAvatarPipBounds(this.$systemPip, this.$fullScreen, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceEmbodimentHostKt$StatusAvatarPipBounds$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $fullScreen;
        public final /* synthetic */ HatchSystemPipState $systemPip;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchSystemPipState hatchSystemPipState, boolean z, int i) {
            super(2);
            this.$systemPip = hatchSystemPipState;
            this.$fullScreen = z;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchVoiceEmbodimentHostKt.StatusAvatarPipBounds(this.$systemPip, this.$fullScreen, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceEmbodimentHostKt$StatusAvatarPipBounds$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $fullScreen;
        public final /* synthetic */ HatchSystemPipState $systemPip;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(HatchSystemPipState hatchSystemPipState, boolean z, int i) {
            super(2);
            this.$systemPip = hatchSystemPipState;
            this.$fullScreen = z;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchVoiceEmbodimentHostKt.StatusAvatarPipBounds(this.$systemPip, this.$fullScreen, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceEmbodimentHostKt$SystemPipIdleAvatar$1, reason: invalid class name and case insensitive filesystem */
    public final class C131591 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<Boolean> $darkCallMedia$delegate;
        public final /* synthetic */ AvatarTakeoverIdleMedia $idleMedia;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AvatarTakeover $takeover;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131591(AvatarTakeoverIdleMedia avatarTakeoverIdleMedia, AvatarTakeover avatarTakeover, BRg bRg, C1BO<Boolean> c1bo) {
            super(2);
            this.$idleMedia = avatarTakeoverIdleMedia;
            this.$takeover = avatarTakeover;
            this.$modifier = bRg;
            this.$darkCallMedia$delegate = c1bo;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                HatchAnimatedBotAvatarKt.HatchAnimatedBotAvatar(HatchPillState.IDLE, this.$modifier, null, VoiceEmbodimentIdlePlaybackKt.rememberMemoryAwareIdleMedia(this.$idleMedia, bfm, 0), true, null, null, false, null, !this.$takeover.isMediaVisible(), false, false, true, false, null, false, C1OM.A00, null, null, C1BO.A0F(this.$darkCallMedia$delegate), bfm, 24582, 1573248, 454116);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceEmbodimentHostKt$SystemPipIdleAvatar$2, reason: invalid class name and case insensitive filesystem */
    public final class C131602 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AvatarTakeoverIdleMedia $idleMedia;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AvatarTakeover $takeover;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131602(AvatarTakeoverIdleMedia avatarTakeoverIdleMedia, AvatarTakeover avatarTakeover, BRg bRg, int i, int i2) {
            super(2);
            this.$idleMedia = avatarTakeoverIdleMedia;
            this.$takeover = avatarTakeover;
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
            HatchVoiceEmbodimentHostKt.SystemPipIdleAvatar(this.$idleMedia, this.$takeover, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchVoiceEmbodimentHost(BRg bRg, boolean z, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean z2 = z;
        C7384Etj.A0Y(g0w, 2);
        bfm.AgG(734533062);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = false;
            }
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = new VoiceAvatarTakeoverState();
                bfm.Ai0(objAaT);
            }
            VoiceAvatarTakeoverState voiceAvatarTakeoverState = (VoiceAvatarTakeoverState) objAaT;
            AnonymousClass003.A0m(bfm, VoiceAvatarTakeoverKt.LocalVoiceAvatarTakeoverState.A04(voiceAvatarTakeoverState), new AnonymousClass1(voiceAvatarTakeoverState, bRg2, z2, g0w), 1841076870);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C131562(bRg2, z2, g0w, i, i2);
        }
    }

    public static final void SystemPipIdleAvatar(AvatarTakeoverIdleMedia avatarTakeoverIdleMedia, AvatarTakeover avatarTakeover, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-300626903);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, avatarTakeoverIdleMedia) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, avatarTakeover);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AnonymousClass003.A0m(bfm, AvatarTakeoverKt.LocalAvatarTakeover.A04(avatarTakeover), new C131591(avatarTakeoverIdleMedia, avatarTakeover, bRg2, C2CK.A02(bfm, VoiceCallSurfacesKt.rememberVoiceCallViewModel(bfm, 0).isCallEmbodimentDark)), 1279443177);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C131602(avatarTakeoverIdleMedia, avatarTakeover, bRg2, i, i2);
        }
    }

    public static final boolean rememberAvatarEmbodimentCompatible(BFM bfm, int i) {
        return C1BO.A0F(C2CK.A02(bfm, VoiceCallSurfacesKt.rememberVoiceCallViewModel(bfm, 0).avatarEmbodimentCompatible));
    }

    public static final boolean rememberLiveAvatarEnabled(BFM bfm, int i) {
        AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
        boolean zA65 = bfm.A65(abstractC3358CGzA0h);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = AnonymousClass001.A0j(bfm, VoicePrefs.INSTANCE.getLiveAvatarEnabled(abstractC3358CGzA0h, true));
        }
        boolean zA652 = bfm.A65(abstractC3358CGzA0h);
        Object objAaT2 = bfm.AaT();
        if (zA652 || objAaT2 == C78N.A00) {
            objAaT2 = VoicePrefs.INSTANCE.observeLiveAvatarEnabled(abstractC3358CGzA0h, true);
            bfm.Ai0(objAaT2);
        }
        return C1BO.A0F(C2CK.A01(bfm, null, objAaT, (C20Q) objAaT2, 0, 14));
    }

    static {
        HatchVoiceEmbodimentHostKt$LocalCallControlsAdditionalContent$1 hatchVoiceEmbodimentHostKt$LocalCallControlsAdditionalContent$1 = HatchVoiceEmbodimentHostKt$LocalCallControlsAdditionalContent$1.INSTANCE;
        AGE ageA01 = AGF.A01();
        LocalCallControlsAdditionalContent = new AGN(ageA01, hatchVoiceEmbodimentHostKt$LocalCallControlsAdditionalContent$1);
        LocalCallControlsHidden = new AGN(ageA01, HatchVoiceEmbodimentHostKt$LocalCallControlsHidden$1.INSTANCE);
        LocalVoiceAvatarContent = new AGN(ageA01, HatchVoiceEmbodimentHostKt$LocalVoiceAvatarContent$1.INSTANCE);
    }

    public static final AKH<G0V<BFM, Integer, Unit>> getLocalCallControlsAdditionalContent() {
        return LocalCallControlsAdditionalContent;
    }

    public static final AKH<Boolean> getLocalCallControlsHidden() {
        return LocalCallControlsHidden;
    }

    public static final AKH<G0W<BRg, BFM, Integer, Unit>> getLocalVoiceAvatarContent() {
        return LocalVoiceAvatarContent;
    }

    public static final void EmbodimentPlacementReporter(VoiceCallStateHolder voiceCallStateHolder, VoiceAvatarFullScreenState voiceAvatarFullScreenState, boolean z, boolean z2, BFM bfm, int i) {
        bfm.AgG(1943619301);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(voiceCallStateHolder, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, voiceAvatarFullScreenState);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0q(bfm, z2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            HatchStatusPillMetrics hatchStatusPillMetricsA0a = AnonymousClass002.A0a(bfm);
            Object[] objArr = {voiceCallStateHolder, hatchStatusPillMetricsA0a, voiceAvatarFullScreenState, Boolean.valueOf(z), Boolean.valueOf(z2)};
            boolean zA1C = AnonymousClass003.A1C(iA05) | AnonymousClass001.A1R(bfm, hatchStatusPillMetricsA0a, AnonymousClass002.A1Q(iA05 & 7168, 2048));
            boolean zA1D = AnonymousClass003.A1D(iA05) | ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(voiceCallStateHolder))) | zA1C;
            Object objAaT = bfm.AaT();
            if (zA1D || objAaT == C78N.A00) {
                objAaT = new HatchVoiceEmbodimentHostKt$EmbodimentPlacementReporter$1$1(z2, voiceCallStateHolder, hatchStatusPillMetricsA0a, voiceAvatarFullScreenState, z, null);
                bfm.Ai0(objAaT);
            }
            C78e.A08(bfm, (G0V) objAaT, objArr);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(voiceCallStateHolder, voiceAvatarFullScreenState, z, z2, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0216 A[PHI: r0 r20
  0x0216: PHI (r0v16 com.facebook.aura.partners.voice.screen.HatchSystemPipState) = 
  (r0v15 com.facebook.aura.partners.voice.screen.HatchSystemPipState)
  (r0v24 com.facebook.aura.partners.voice.screen.HatchSystemPipState)
 binds: [B:88:0x0212, B:53:0x0112] A[DONT_GENERATE, DONT_INLINE]
  0x0216: PHI (r20v1 boolean) = (r20v0 boolean), (r20v4 boolean) binds: [B:88:0x0212, B:53:0x0112] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0249  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchVoiceEmbodimentHostContent(com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverState r28, X.BRg r29, boolean r30, X.G0W<? super X.InterfaceC05151eP, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r31, X.BFM r32, int r33) {
        /*
            Method dump skipped, instructions count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.HatchVoiceEmbodimentHostKt.HatchVoiceEmbodimentHostContent(com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverState, X.BRg, boolean, X.G0W, X.BFM, int):void");
    }

    public static final void StatusAvatarPipBounds(HatchSystemPipState hatchSystemPipState, boolean z, BFM bfm, int i) {
        BBb bBbAAc;
        Object anonymousClass5;
        bfm.AgG(1491971355);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, hatchSystemPipState) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (hatchSystemPipState.showAvatarOnly) {
                bBbAAc = bfm.AAc();
                if (bBbAAc == null) {
                    return;
                } else {
                    anonymousClass5 = new C131581(hatchSystemPipState, z, i);
                }
            } else {
                VoiceEmbodimentMedia voiceEmbodimentMedia = (VoiceEmbodimentMedia) C1BO.A07(bfm, VoiceCallStateHolder.Companion.getInstance(AnonymousClass002.A0h(bfm)).embodimentMedia);
                HatchStatusPillMetrics hatchStatusPillMetricsA0a = AnonymousClass002.A0a(bfm);
                VoiceAvatarTakeoverState voiceAvatarTakeoverStateA0M = C3cG.A0M(bfm);
                long jAuraWindowContainerSize = AuraLayoutSizeKt.auraWindowContainerSize(bfm, 0);
                AaC destination = z ? voiceAvatarTakeoverStateA0M.fullScreen.getDestination() : hatchStatusPillMetricsA0a.getAvatarBoundsInWindow();
                if (destination == null) {
                    bfm.AgE(-1297345731);
                    boolean zA64 = bfm.A64(jAuraWindowContainerSize) | AnonymousClass003.A1B(iA0d);
                    Object objAaT = bfm.AaT();
                    if (zA64 || objAaT == C78N.A00) {
                        objAaT = new HatchVoiceEmbodimentHostKt$StatusAvatarPipBounds$2$1(jAuraWindowContainerSize, hatchSystemPipState);
                        bfm.Ai0(objAaT);
                    }
                    AnonymousClass001.A15(bfm, objAaT);
                    bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                    if (bBbAAc == null) {
                        return;
                    } else {
                        anonymousClass5 = new AnonymousClass3(hatchSystemPipState, z, i);
                    }
                } else {
                    AnonymousClass003.A0l(bfm, -1297213113);
                    float fAEm = AnonymousClass002.A0Y(bfm).AEm();
                    boolean zUsesGestureNavigation = usesGestureNavigation(bfm, 0);
                    boolean zA1M = AnonymousClass002.A1M((hatchStatusPillMetricsA0a.getAvatarPanelProgress() > 0.0f ? 1 : (hatchStatusPillMetricsA0a.getAvatarPanelProgress() == 0.0f ? 0 : -1)));
                    boolean zA1U = AnonymousClass001.A1U(bfm, zUsesGestureNavigation, AnonymousClass004.A1U(bfm, voiceEmbodimentMedia, AnonymousClass003.A1C(iA0d) | bfm.A65(destination) | bfm.A64(jAuraWindowContainerSize), zA1M) | bfm.A62(fAEm) | AnonymousClass003.A1B(iA0d));
                    Object objAaT2 = bfm.AaT();
                    if (zA1U || objAaT2 == C78N.A00) {
                        objAaT2 = new HatchVoiceEmbodimentHostKt$StatusAvatarPipBounds$4$1(destination, jAuraWindowContainerSize, z, voiceEmbodimentMedia, zA1M, fAEm, hatchSystemPipState, zUsesGestureNavigation);
                        bfm.Ai0(objAaT2);
                    }
                    AnonymousClass001.A15(bfm, objAaT2);
                }
            }
            C3cG.A1D(bBbAAc, anonymousClass5);
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass5 = new AnonymousClass5(hatchSystemPipState, z, i);
            C3cG.A1D(bBbAAc, anonymousClass5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.partners.voice.screen.HatchSystemPipState rememberVoiceEmbodimentSystemPip(com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r5, boolean r6, boolean r7, X.BFM r8, int r9) {
        /*
            com.facebook.aura.partners.voice.screen.VoiceAvatarFullScreenState r0 = X.C3cH.A0V(r8)
            boolean r0 = r0.getActive()
            r4 = 0
            if (r0 == 0) goto L14
            com.facebook.aura.partners.voice.gating.VoiceGating r0 = com.facebook.aura.partners.voice.gating.VoiceGating.INSTANCE
            boolean r0 = r0.isFullScreenExpandedViewDisabled()
            r3 = 1
            if (r0 == 0) goto L15
        L14:
            r3 = 0
        L15:
            int r0 = r9 >> 6
            r0 = r0 & 14
            r2 = r9 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            com.facebook.aura.partners.voice.screen.VoiceEmbodimentFullScreenKt.VoiceEmbodimentFullScreenEffect(r7, r6, r8, r0)
            int r1 = com.facebook.aura.partners.voice.intf.VoiceCallStateHolder.$stable
            r0 = r9 & 14
            r1 = r1 | r0
            r1 = r1 | r2
            r0 = r9 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            com.facebook.aura.partners.voice.screen.HatchSystemPipState r0 = com.facebook.aura.partners.voice.screen.VoiceEmbodimentSystemPipKt.rememberHatchSystemPipState(r5, r6, r7, r8, r0)
            StatusAvatarPipBounds(r0, r3, r8, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.HatchVoiceEmbodimentHostKt.rememberVoiceEmbodimentSystemPip(com.facebook.aura.partners.voice.intf.VoiceCallStateHolder, boolean, boolean, X.BFM, int):com.facebook.aura.partners.voice.screen.HatchSystemPipState");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.partners.voice.intf.VoiceEmbodimentPlacement settledEmbodimentPlacement(com.facebook.aura.header.view.HatchStatusPillMetrics r4, com.facebook.aura.partners.voice.screen.VoiceAvatarFullScreenState r5) {
        /*
            boolean r0 = r5.getActive()
            r3 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            if (r0 == 0) goto L1a
            com.facebook.aura.partners.voice.intf.VoiceEmbodimentPlacement r1 = com.facebook.aura.partners.voice.intf.VoiceEmbodimentPlacement.FULL_SCREEN
            boolean r0 = r5.getExpanded()
            if (r0 == 0) goto L33
            float r0 = r5.getProgress()
        L15:
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L33
            return r1
        L1a:
            boolean r0 = r4.getAvatarExpanded()
            if (r0 == 0) goto L27
            com.facebook.aura.partners.voice.intf.VoiceEmbodimentPlacement r1 = com.facebook.aura.partners.voice.intf.VoiceEmbodimentPlacement.HALF_SCREEN
            float r0 = r4.getAvatarPanelProgress()
            goto L15
        L27:
            float r1 = r4.getAvatarPanelProgress()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L33
            com.facebook.aura.partners.voice.intf.VoiceEmbodimentPlacement r1 = com.facebook.aura.partners.voice.intf.VoiceEmbodimentPlacement.AVATAR
            return r1
        L33:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.HatchVoiceEmbodimentHostKt.settledEmbodimentPlacement(com.facebook.aura.header.view.HatchStatusPillMetrics, com.facebook.aura.partners.voice.screen.VoiceAvatarFullScreenState):com.facebook.aura.partners.voice.intf.VoiceEmbodimentPlacement");
    }

    public static final boolean usesGestureNavigation(BFM bfm, int i) {
        AXN axnA0Y = AnonymousClass002.A0Y(bfm);
        boolean z = false;
        if (C1743Apg.A01(bfm).A04.ACy(axnA0Y) > 0) {
            bfm.AgE(1926370760);
            if (C1743Apg.A01(bfm).A07.ACy(axnA0Y) == 0) {
                z = true;
            }
        } else {
            bfm.AgE(-412047347);
        }
        AnonymousClass002.A19(bfm);
        return z;
    }
}
