package com.facebook.aura.assist;

import X.AKH;
import X.AXN;
import X.AaC;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.B1V;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C0Ig;
import X.C10G;
import X.C1743Apg;
import X.C1BO;
import X.C1OP;
import X.C3IL;
import X.C78N;
import X.EnumC1820Arj;
import X.G0V;
import X.G0W;
import X.InterfaceC05151eP;
import android.view.View;
import com.facebook.aura.avatarsize.HatchAvatarSizeKt;
import com.facebook.aura.avatarsize.HatchAvatarSizeRepositoryKt;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import com.facebook.aura.header.view.HatchStatusPillMetricsKt;
import com.facebook.aura.partners.voice.intf.VoiceIntegrationKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchAssistPresentationKt {

    /* renamed from: com.facebook.aura.assist.HatchAssistPresentationKt$AssistIdentityPresentationEffect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ AssistVoiceLayout $layout;
        public final /* synthetic */ Function0<Unit> $onOpenApp;
        public final /* synthetic */ AssistVoicePresentation $presentation;
        public final /* synthetic */ String $threadId;
        public final /* synthetic */ boolean $visible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AssistVoicePresentation assistVoicePresentation, AssistVoiceLayout assistVoiceLayout, String str, Function0<Unit> function0, boolean z, int i) {
            super(2);
            this.$presentation = assistVoicePresentation;
            this.$layout = assistVoiceLayout;
            this.$threadId = str;
            this.$onOpenApp = function0;
            this.$visible = z;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchAssistPresentationKt.AssistIdentityPresentationEffect(this.$presentation, this.$layout, this.$threadId, this.$onOpenApp, this.$visible, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.assist.HatchAssistPresentationKt$HatchAssistPresentation$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C0Ig, BFM, Integer, Unit> {
        public final /* synthetic */ float $avatarSize;
        public final /* synthetic */ int $bottomInset;
        public final /* synthetic */ AXN $density;
        public final /* synthetic */ AssistIdentityState $identityState;
        public final /* synthetic */ boolean $identityVisible;
        public final /* synthetic */ int $leftInset;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ Function0<Unit> $onOpenApp;
        public final /* synthetic */ AssistVoicePresentation $presentation;
        public final /* synthetic */ int $rightInset;
        public final /* synthetic */ String $threadId;

        /* renamed from: com.facebook.aura.assist.HatchAssistPresentationKt$HatchAssistPresentation$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ AssistIdentityState $identityState;
            public final /* synthetic */ boolean $identityVisible;
            public final /* synthetic */ AssistVoiceLayout $layout;
            public final /* synthetic */ Function0<Unit> $onDismissRequest;
            public final /* synthetic */ Function0<Unit> $onOpenApp;
            public final /* synthetic */ AssistVoicePresentation $presentation;
            public final /* synthetic */ String $threadId;

            /* renamed from: com.facebook.aura.assist.HatchAssistPresentationKt$HatchAssistPresentation$1$2$1, reason: invalid class name and collision with other inner class name */
            public final class C00431 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
                public final /* synthetic */ AssistIdentityState $identityState;
                public final /* synthetic */ boolean $identityVisible;
                public final /* synthetic */ AssistVoiceLayout $layout;
                public final /* synthetic */ Function0<Unit> $onDismissRequest;
                public final /* synthetic */ Function0<Unit> $onOpenApp;
                public final /* synthetic */ AssistVoicePresentation $presentation;
                public final /* synthetic */ String $threadId;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00431(AssistVoicePresentation assistVoicePresentation, AssistVoiceLayout assistVoiceLayout, Function0<Unit> function0, AssistIdentityState assistIdentityState, String str, Function0<Unit> function02, boolean z) {
                    super(3);
                    this.$presentation = assistVoicePresentation;
                    this.$layout = assistVoiceLayout;
                    this.$onDismissRequest = function0;
                    this.$identityState = assistIdentityState;
                    this.$threadId = str;
                    this.$onOpenApp = function02;
                    this.$identityVisible = z;
                }

                @Override // X.G0W
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
                    invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
                    return Unit.INSTANCE;
                }

                public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
                    boolean z = false;
                    if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                        if (this.$presentation.getShowingVoice()) {
                            bfm.AgE(2146597311);
                            AssistVoicePresentation assistVoicePresentation = this.$presentation;
                            AssistVoiceLayout assistVoiceLayout = this.$layout;
                            Function0<Unit> function0 = this.$onDismissRequest;
                            BS0 bs0 = BRg.A00;
                            boolean zA67 = bfm.A67(this.$identityState);
                            AssistIdentityState assistIdentityState = this.$identityState;
                            Object objAaT = bfm.AaT();
                            if (zA67 || objAaT == C78N.A00) {
                                objAaT = new HatchAssistPresentationKt$HatchAssistPresentation$1$2$1$1$1(assistIdentityState);
                                bfm.Ai0(objAaT);
                            }
                            HatchAssistVoiceCallKt.HatchAssistVoiceCall(assistVoicePresentation, assistVoiceLayout, function0, AssistVoicePresentationKt.assistComposerInteraction(AnonymousClass001.A0W(bs0, objAaT), AnonymousClass002.A1Z(this.$identityState.getPhase(), AssistIdentityPhase.EXPANDED)), bfm, 0, 0);
                        } else {
                            bfm.AgE(2146984594);
                        }
                        boolean zA1W = AnonymousClass001.A1W(bfm);
                        AssistVoicePresentation assistVoicePresentation2 = this.$presentation;
                        AssistVoiceLayout assistVoiceLayout2 = this.$layout;
                        String str = this.$threadId;
                        Function0<Unit> function02 = this.$onOpenApp;
                        if (this.$identityVisible || assistVoicePresentation2.getShowingVoice()) {
                            z = true;
                        }
                        HatchAssistPresentationKt.AssistIdentityPresentationEffect(assistVoicePresentation2, assistVoiceLayout2, str, function02, z, bfm, zA1W ? 1 : 0);
                        return;
                    }
                    bfm.Afo();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(AssistVoicePresentation assistVoicePresentation, AssistVoiceLayout assistVoiceLayout, Function0<Unit> function0, AssistIdentityState assistIdentityState, String str, Function0<Unit> function02, boolean z) {
                super(2);
                this.$presentation = assistVoicePresentation;
                this.$layout = assistVoiceLayout;
                this.$onDismissRequest = function0;
                this.$identityState = assistIdentityState;
                this.$threadId = str;
                this.$onOpenApp = function02;
                this.$identityVisible = z;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                    VoiceIntegrationKt.VoiceEmbodimentHost(C10G.A01, true, B1V.A00(bfm, new C00431(this.$presentation, this.$layout, this.$onDismissRequest, this.$identityState, this.$threadId, this.$onOpenApp, this.$identityVisible), 2083327984), bfm, 438, 0);
                } else {
                    bfm.Afo();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AXN axn, int i, int i2, int i3, float f, AssistIdentityState assistIdentityState, AssistVoicePresentation assistVoicePresentation, Function0<Unit> function0, String str, Function0<Unit> function02, boolean z) {
            super(3);
            this.$density = axn;
            this.$bottomInset = i;
            this.$leftInset = i2;
            this.$rightInset = i3;
            this.$avatarSize = f;
            this.$identityState = assistIdentityState;
            this.$presentation = assistVoicePresentation;
            this.$onDismissRequest = function0;
            this.$threadId = str;
            this.$onOpenApp = function02;
            this.$identityVisible = z;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C0Ig c0Ig, BFM bfm, Integer num) {
            invoke(c0Ig, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(C0Ig c0Ig, BFM bfm, int i) {
            int iA0d = i;
            if (AnonymousClass002.A0B(c0Ig, iA0d) == 0) {
                iA0d = i | AnonymousClass004.A0d(bfm, c0Ig);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
                AXN axn = this.$density;
                int i2 = this.$bottomInset;
                int i3 = this.$leftInset;
                int i4 = this.$rightInset;
                float f = this.$avatarSize;
                AssistIdentityState assistIdentityState = this.$identityState;
                float fAh4 = axn.Ah4(c0Ig.AHT());
                float fAh42 = (axn.Ah4(c0Ig.AHP()) - i2) - axn.Ah4(12.0f);
                float f2 = i3;
                float f3 = i4;
                boolean z = false;
                float f4 = 104.0f;
                if ((fAh4 - f2) - f3 < axn.Ah4(24.0f) + axn.Ah4(224.0f) + Math.max(axn.Ah4(f), axn.Ah4(136.0f) * axn.AFo())) {
                    z = true;
                    f4 = 56.0f;
                }
                float fAh43 = axn.Ah4(f4);
                float f5 = 56.0f;
                if (z) {
                    f5 = 104.0f;
                }
                float fAh44 = axn.Ah4(f5);
                float identityHeight = assistIdentityState.getIdentityHeight();
                float fMax = Math.max(identityHeight, fAh44);
                float f6 = fAh42 - ((fMax + fAh44) / 2.0f);
                float fAh45 = f2 + axn.Ah4(12.0f);
                float fAh46 = (fAh4 - f3) - axn.Ah4(12.0f);
                float fAh47 = axn.Ah4(8.0f);
                float f7 = fAh45 + fAh43;
                float f8 = fAh42 - identityHeight;
                float f9 = fAh46 - fAh43;
                float f10 = fAh44 + f6;
                AssistVoiceLayout assistVoiceLayout = new AssistVoiceLayout(new AaC(f7 + fAh47, f8, f9 - fAh47, fAh42), new AaC(fAh45, f6, f7, f10), new AaC(f9, f6, fAh46, f10), z, fAh42 - fMax);
                AKH<HatchStatusPillMetrics> akh = HatchStatusPillMetricsKt.LocalHatchStatusPillMetrics;
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = new HatchStatusPillMetrics();
                    bfm.Ai0(objAaT);
                }
                AnonymousClass003.A0m(bfm, akh.A04(objAaT), new AnonymousClass2(this.$presentation, assistVoiceLayout, this.$onDismissRequest, this.$identityState, this.$threadId, this.$onOpenApp, this.$identityVisible), 324848674);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.assist.HatchAssistPresentationKt$HatchAssistPresentation$2, reason: invalid class name and case insensitive filesystem */
    public final class C109652 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $identityVisible;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ Function0<Unit> $onOpenApp;
        public final /* synthetic */ AssistVoicePresentation $presentation;
        public final /* synthetic */ String $threadId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109652(AssistVoicePresentation assistVoicePresentation, String str, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$presentation = assistVoicePresentation;
            this.$threadId = str;
            this.$onOpenApp = function0;
            this.$onDismissRequest = function02;
            this.$modifier = bRg;
            this.$identityVisible = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchAssistPresentationKt.HatchAssistPresentation(this.$presentation, this.$threadId, this.$onOpenApp, this.$onDismissRequest, this.$modifier, this.$identityVisible, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchAssistPresentation(AssistVoicePresentation assistVoicePresentation, String str, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, boolean z, BFM bfm, int i, int i2) {
        boolean z2 = z;
        BRg bRg2 = bRg;
        AnonymousClass005.A11(assistVoicePresentation, function0, function02, 0);
        bfm.AgG(-27537908);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, assistVoicePresentation) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function02);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        int i4 = i2 & 32;
        int iA0s = 196608;
        if (i4 != 0) {
            iA0d |= iA0s;
        } else if ((196608 & i) == 0) {
            iA0s = AnonymousClass004.A0s(bfm, z2);
            iA0d |= iA0s;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = true;
            }
            AssistIdentityState assistIdentityState = (AssistIdentityState) bfm.A6v(AssistIdentityStateKt.LocalAssistIdentityState);
            AXN axnA0Y = AnonymousClass002.A0Y(bfm);
            float fRememberAvatarSizeDp = HatchAvatarSizeKt.rememberAvatarSizeDp(HatchAvatarSizeRepositoryKt.rememberHatchAvatarSize(bfm, 0), bfm, 0);
            EnumC1820Arj enumC1820ArjA0d = AnonymousClass001.A0d(bfm);
            C1OP c1op = new C1OP(C1743Apg.A01(bfm).A04, C1743Apg.A01(bfm).A01);
            C3IL.A00(bfm, null, AnonymousClass001.A0T(bRg2), B1V.A00(bfm, new AnonymousClass1(axnA0Y, c1op.ACy(axnA0Y), c1op.AH1(axnA0Y, enumC1820ArjA0d), c1op.AJo(axnA0Y, enumC1820ArjA0d), fRememberAvatarSizeDp, assistIdentityState, assistVoicePresentation, function02, str, function0, z2), 738113378), 3072, 6, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C109652(assistVoicePresentation, str, function0, function02, bRg2, z2, i, i2);
        }
    }

    public static final void AssistIdentityPresentationEffect(AssistVoicePresentation assistVoicePresentation, AssistVoiceLayout assistVoiceLayout, String str, Function0<Unit> function0, boolean z, BFM bfm, int i) {
        bfm.AgG(-753782667);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, assistVoicePresentation) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, assistVoiceLayout);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0r(bfm, z);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            C1BO<AaC> c1boAnimateBounds = AssistVoicePresentationKt.animateBounds(assistVoicePresentation, assistVoicePresentation.getIdentityBounds(), assistVoiceLayout.identity, "assistantIdentityBounds", bfm, (iA0d & 14) | 3072);
            AssistIdentityState assistIdentityState = (AssistIdentityState) bfm.A6v(AssistIdentityStateKt.LocalAssistIdentityState);
            View viewA0J = AnonymousClass001.A0J(bfm);
            boolean zIsVoice = assistVoicePresentation.isVoice();
            boolean showingVoice = assistVoicePresentation.getShowingVoice();
            boolean zA1D = AnonymousClass003.A1D(iA0d) | AnonymousClass005.A1X(bfm, c1boAnimateBounds, viewA0J, AnonymousClass003.A1R(bfm, assistIdentityState, zIsVoice), bfm.A66(showingVoice)) | AnonymousClass003.A1E(iA0d) | ((iA0d & 57344) == 16384);
            Object objAaT = bfm.AaT();
            if (zA1D || objAaT == C78N.A00) {
                objAaT = new HatchAssistPresentationKt$AssistIdentityPresentationEffect$1$1(assistIdentityState, zIsVoice, showingVoice, c1boAnimateBounds, viewA0J, str, function0, z);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A15(bfm, objAaT);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(assistVoicePresentation, assistVoiceLayout, str, function0, z, i);
        }
    }
}
