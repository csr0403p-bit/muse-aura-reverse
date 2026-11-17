package com.facebook.aura.partners.voice.screen;

import X.AWA;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C1BO;
import X.C1DG;
import X.C3cG;
import X.C7384Etj;
import X.G0V;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.header.api.AvatarFullScreen;
import com.facebook.aura.header.api.AvatarTakeover;
import com.facebook.aura.header.api.AvatarTakeoverIdleFrame;
import com.facebook.aura.header.api.AvatarTakeoverIdleMedia;
import com.facebook.aura.header.api.AvatarTakeoverLayout;
import com.facebook.aura.header.api.AvatarTakeoverTransition;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceAvatarTakeover implements AvatarTakeover {
    public static final int $stable = 0;
    public final C1BO<Boolean> chromeHidden;
    public final boolean isCompactHost;
    public final boolean isEngaged;
    public final VoiceAvatarTakeoverState state;
    public final VoiceCallStateHolder stateHolder;

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceAvatarTakeover$Overlay$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $transitionComplete;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, BRg bRg, int i) {
            super(2);
            this.$transitionComplete = z;
            this.$modifier = bRg;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceAvatarTakeover.this.Overlay(this.$transitionComplete, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceAvatarTakeover$Overlay$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg) {
            super(2);
            this.$modifier = bRg;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                VoiceEmbodimentAvatarOverlayKt.VoiceEmbodimentAvatarOverlay(this.$modifier, bfm, 0, 0);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceAvatarTakeover$Overlay$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $transitionComplete;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(boolean z, BRg bRg, int i) {
            super(2);
            this.$transitionComplete = z;
            this.$modifier = bRg;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceAvatarTakeover.this.Overlay(this.$transitionComplete, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    @Override // com.facebook.aura.header.api.AvatarTakeover
    public void Overlay(boolean z, BRg bRg, BFM bfm, int i) {
        BBb bBbAAc;
        Object anonymousClass3;
        C7384Etj.A0Y(bRg, 1);
        bfm.AgG(896281420);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0e(bfm, bRg);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, this);
        }
        if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0n), bfm, iA0n)) {
            bfm.Afo();
        } else {
            if (!isEngaged()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass3 = new AnonymousClass1(z, bRg, i);
                    C3cG.A1D(bBbAAc, anonymousClass3);
                }
                return;
            }
            AnonymousClass003.A0m(bfm, VoiceAvatarTakeoverKt.LocalVoiceCallTransitionComplete.A04(Boolean.valueOf(z)), new AnonymousClass2(bRg), 1015164940);
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(z, bRg, i);
            C3cG.A1D(bBbAAc, anonymousClass3);
        }
    }

    @Override // com.facebook.aura.header.api.AvatarTakeover
    public BRg avatarGestures(BRg bRg, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        bfm.AgE(537954372);
        BRg bRgVoiceEmbodimentResizeGestures = VoiceEmbodimentDragHandleKt.voiceEmbodimentResizeGestures(bRg, bfm, i & 14);
        AnonymousClass001.A1D(bfm);
        return bRgVoiceEmbodimentResizeGestures;
    }

    @Override // com.facebook.aura.header.api.AvatarTakeover
    /* renamed from: idleFraming-5oXFXW4 */
    public BRg mo975idleFraming5oXFXW4(BRg bRg, AWA awa, float f, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        bfm.AgE(-1856231372);
        BRg bRgM1748callAvatarIdleFramingRDsbke8 = VoiceAvatarTakeoverKt.m1748callAvatarIdleFramingRDsbke8(bRg, awa, f, this.isCompactHost, bfm, i & 1022);
        AnonymousClass001.A1D(bfm);
        return bRgM1748callAvatarIdleFramingRDsbke8;
    }

    @Override // com.facebook.aura.header.api.AvatarTakeover
    public BRg idleViewport(BRg bRg, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        bfm.AgE(435820507);
        BRg bRgCallAvatarIdleViewport = VoiceAvatarTakeoverKt.callAvatarIdleViewport(bRg, bfm, i & 14);
        AnonymousClass001.A1D(bfm);
        return bRgCallAvatarIdleViewport;
    }

    @Override // com.facebook.aura.header.api.AvatarTakeover
    public void onIdleMediaShown(AvatarTakeoverIdleFrame avatarTakeoverIdleFrame) {
        int iA0E = AnonymousClass001.A0E(avatarTakeoverIdleFrame, 0);
        if (iA0E == 0) {
            this.stateHolder.notifyCallIdlePosterShown();
        } else {
            if (iA0E != 1) {
                throw C3cG.A0q();
            }
            this.stateHolder.notifyCallIdleShown();
        }
    }

    @Override // com.facebook.aura.header.api.AvatarTakeover
    public BRg portraitViewport(BRg bRg, float f, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        bfm.AgE(1674979874);
        BRg bRgCallAvatarPortraitViewport = VoiceAvatarTakeoverKt.callAvatarPortraitViewport(bRg, f, bfm, i & 126);
        AnonymousClass001.A1D(bfm);
        return bRgCallAvatarPortraitViewport;
    }

    @Override // com.facebook.aura.header.api.AvatarTakeover
    public C1BO<Boolean> rememberIdlePreparation(boolean z, boolean z2, boolean z3, MutableState<Boolean> mutableState, BFM bfm, int i) {
        C7384Etj.A0Y(mutableState, 3);
        bfm.AgE(485528095);
        C1BO<Boolean> c1boRememberCallIdlePreparation = VoiceAvatarTakeoverKt.rememberCallIdlePreparation(z, z2, z3, mutableState, bfm, i & 8190);
        AnonymousClass002.A19(bfm);
        return c1boRememberCallIdlePreparation;
    }

    @Override // com.facebook.aura.header.api.AvatarTakeover
    public void updateVisibility(Object obj, boolean z) {
        C7384Etj.A0Y(obj, 0);
        this.state.updateVisibility(obj, z);
    }

    /* loaded from: classes4.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AvatarTakeoverIdleFrame.values().length];
            try {
                AnonymousClass002.A13(AvatarTakeoverIdleFrame.POSTER, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AvatarTakeoverIdleFrame.VIDEO, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.facebook.aura.header.api.AvatarTakeover
    /* renamed from: getAvatarOverlap-D9Ej5fM */
    public float mo974getAvatarOverlapD9Ej5fM() {
        return VoiceAvatarTakeoverKt.CallAvatarOverlap;
    }

    @Override // com.facebook.aura.header.api.AvatarTakeover
    public AvatarFullScreen getFullScreen() {
        return this.state.fullScreen;
    }

    @Override // com.facebook.aura.header.api.AvatarTakeover
    public boolean isChromeHidden() {
        return C1BO.A0F(this.chromeHidden);
    }

    @Override // com.facebook.aura.header.api.AvatarTakeover
    public boolean isEngaged() {
        return this.isEngaged;
    }

    @Override // com.facebook.aura.header.api.AvatarTakeover
    public boolean isMediaVisible() {
        return MutableState.A0A(this.state.isMediaVisible$delegate);
    }

    @Override // com.facebook.aura.header.api.AvatarTakeover
    public boolean isVisible() {
        return MutableState.A0A(this.state.isVisible$delegate);
    }

    public VoiceAvatarTakeover(VoiceAvatarTakeoverState voiceAvatarTakeoverState, VoiceCallStateHolder voiceCallStateHolder, boolean z, boolean z2, C1BO<Boolean> c1bo) {
        AnonymousClass003.A0u(voiceAvatarTakeoverState, voiceCallStateHolder);
        C7384Etj.A0Y(c1bo, 4);
        this.state = voiceAvatarTakeoverState;
        this.stateHolder = voiceCallStateHolder;
        this.isEngaged = z;
        this.isCompactHost = z2;
        this.chromeHidden = c1bo;
    }

    @Override // com.facebook.aura.header.api.AvatarTakeover
    public BRg fullScreenStatus(BRg bRg, Function0<C1DG> function0, BFM bfm, int i) {
        AnonymousClass003.A0u(bRg, function0);
        bfm.AgE(-759287334);
        BRg bRgCallAvatarFullScreenStatus = VoiceAvatarTakeoverKt.callAvatarFullScreenStatus(bRg, function0, bfm, i & 126);
        AnonymousClass002.A19(bfm);
        return bRgCallAvatarFullScreenStatus;
    }

    @Override // com.facebook.aura.header.api.AvatarTakeover
    public Integer rememberBackdropColor(BFM bfm, int i) {
        bfm.AgE(-1416996580);
        Integer numRememberCallAvatarBackdropColor = VoiceAvatarTakeoverKt.rememberCallAvatarBackdropColor(bfm, 0);
        AnonymousClass001.A1D(bfm);
        return numRememberCallAvatarBackdropColor;
    }

    @Override // com.facebook.aura.header.api.AvatarTakeover
    public AvatarTakeoverLayout rememberCompactLayout(boolean z, BFM bfm, int i) {
        bfm.AgE(-1094547531);
        AvatarTakeoverLayout avatarTakeoverLayoutRememberAvatarTakeoverLayout = VoiceAvatarTakeoverKt.rememberAvatarTakeoverLayout(z, bfm, i & 14);
        AnonymousClass002.A19(bfm);
        return avatarTakeoverLayoutRememberAvatarTakeoverLayout;
    }

    @Override // com.facebook.aura.header.api.AvatarTakeover
    public AvatarTakeoverIdleMedia rememberIdleMedia(boolean z, BFM bfm, int i) {
        bfm.AgE(1843713416);
        AvatarTakeoverIdleMedia avatarTakeoverIdleMediaRememberCallAvatarIdleMedia = VoiceAvatarTakeoverKt.rememberCallAvatarIdleMedia(z, bfm, i & 14);
        AnonymousClass002.A19(bfm);
        return avatarTakeoverIdleMediaRememberCallAvatarIdleMedia;
    }

    @Override // com.facebook.aura.header.api.AvatarTakeover
    public Function0<Unit> rememberPanelToggle(BFM bfm, int i) {
        bfm.AgE(-811276454);
        Function0<Unit> function0RememberCallAvatarPanelToggle = VoiceAvatarTakeoverKt.rememberCallAvatarPanelToggle(bfm, 0);
        AnonymousClass001.A1D(bfm);
        return function0RememberCallAvatarPanelToggle;
    }

    @Override // com.facebook.aura.header.api.AvatarTakeover
    /* renamed from: rememberTransition-TDGSqEk */
    public AvatarTakeoverTransition mo976rememberTransitionTDGSqEk(boolean z, AvatarTakeoverLayout avatarTakeoverLayout, float f, BFM bfm, int i) {
        bfm.AgE(709969268);
        AvatarTakeoverTransition avatarTakeoverTransitionM1750rememberAvatarTakeoverTransitionTDGSqEk = VoiceAvatarTakeoverKt.m1750rememberAvatarTakeoverTransitionTDGSqEk(z, avatarTakeoverLayout, f, bfm, i & 1022);
        AnonymousClass002.A19(bfm);
        return avatarTakeoverTransitionM1750rememberAvatarTakeoverTransitionTDGSqEk;
    }
}
