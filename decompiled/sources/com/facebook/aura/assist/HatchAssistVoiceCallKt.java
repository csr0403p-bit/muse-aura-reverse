package com.facebook.aura.assist;

import X.AKQ;
import X.AXN;
import X.AaC;
import X.AbstractC07539Wl;
import X.AbstractC7559F3s;
import X.AcQ;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.B81;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06I;
import X.C0A8;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C2VU;
import X.C3U4;
import X.C3UC;
import X.C78N;
import X.C7bA;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC05151eP;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.assist.AssistVoicePresentationKt;
import com.facebook.aura.partners.voice.intf.Voice;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.intf.VoiceIntegration;
import com.facebook.aura.partners.voice.intf.VoiceUi;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.surface.AuraElevatedSurfaceKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchAssistVoiceCallKt {

    /* renamed from: com.facebook.aura.assist.HatchAssistVoiceCallKt$AssistVoiceBubble$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ AXN $density;
        public final /* synthetic */ AaC $destination;
        public final /* synthetic */ AssistVoicePresentation $presentation;
        public final /* synthetic */ boolean $stacked;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(boolean z, AXN axn, AssistVoicePresentation assistVoicePresentation, G0V<? super BFM, ? super Integer, Unit> g0v, AaC aaC) {
            super(3);
            this.$stacked = z;
            this.$density = axn;
            this.$presentation = assistVoicePresentation;
            this.$content = g0v;
            this.$destination = aaC;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
            invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                boolean z = this.$stacked;
                BS0 bs0 = BRg.A00;
                AXN axn = this.$density;
                AaC aaC = this.$destination;
                float fAgx = axn.Agx(aaC.A02 - aaC.A01);
                AXN axn2 = this.$density;
                AaC aaC2 = this.$destination;
                BRg bRgA09 = C3U4.A09(C10G.A0B(bs0, fAgx, axn2.Agx(aaC2.A00 - aaC2.A03)), 4.0f);
                boolean zA65 = bfm.A65(this.$presentation);
                AssistVoicePresentation assistVoicePresentation = this.$presentation;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new HatchAssistVoiceCallKt$AssistVoiceBubble$3$3$1(assistVoicePresentation);
                    bfm.Ai0(objAaT);
                }
                HatchAssistVoiceCallKt.AssistVoiceButtonPair(z, AnonymousClass001.A0W(bRgA09, objAaT), this.$content, bfm, 0, 0);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.assist.HatchAssistVoiceCallKt$AssistVoiceBubble$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ AaC $destination;
        public final /* synthetic */ boolean $leading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AssistVoicePresentation $presentation;
        public final /* synthetic */ boolean $stacked;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(AssistVoicePresentation assistVoicePresentation, AaC aaC, boolean z, boolean z2, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$presentation = assistVoicePresentation;
            this.$destination = aaC;
            this.$stacked = z;
            this.$leading = z2;
            this.$modifier = bRg;
            this.$content = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchAssistVoiceCallKt.AssistVoiceBubble(this.$presentation, this.$destination, this.$stacked, this.$leading, this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.assist.HatchAssistVoiceCallKt$AssistVoiceButtonPair$3, reason: invalid class name and case insensitive filesystem */
    public final class C109663 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $stacked;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C109663(boolean z, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$stacked = z;
            this.$modifier = bRg;
            this.$content = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchAssistVoiceCallKt.AssistVoiceButtonPair(this.$stacked, this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.assist.HatchAssistVoiceCallKt$HatchAssistVoiceCall$3, reason: invalid class name and case insensitive filesystem */
    public final class C109673 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AssistVoiceLayout $layout;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ AssistVoicePresentation $presentation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109673(AssistVoicePresentation assistVoicePresentation, AssistVoiceLayout assistVoiceLayout, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$presentation = assistVoicePresentation;
            this.$layout = assistVoiceLayout;
            this.$onDismissRequest = function0;
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
            HatchAssistVoiceCallKt.HatchAssistVoiceCall(this.$presentation, this.$layout, this.$onDismissRequest, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void AssistVoiceBubble(AssistVoicePresentation assistVoicePresentation, AaC aaC, boolean z, boolean z2, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(2129189622);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, assistVoicePresentation) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, aaC);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z2);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0d, 74898), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AaC composerBounds = assistVoicePresentation.getComposerBounds();
            float fA00 = AnonymousClass001.A00(composerBounds.A00());
            char c = 14;
            float f = 0.0f;
            if (z2) {
                c = 11;
                f = fA00;
                fA00 = 0.0f;
            }
            if ((c & 1) != 0) {
                fA00 = composerBounds.A01;
            }
            float f2 = composerBounds.A03;
            if ((c & 4) != 0) {
                f = composerBounds.A02;
            }
            int i4 = iA0d & 14;
            C1BO<AaC> c1boAnimateBounds = AssistVoicePresentationKt.animateBounds(assistVoicePresentation, new AaC(fA00, f2, f, composerBounds.A00), aaC, FGI.A0r("assistantVoiceBubble", z2), bfm, ((iA0d << 3) & 896) | i4);
            AXN axn = (AXN) bfm.A6v(Am0.A04);
            BRg bRgAssistAnimatedBounds = AssistVoicePresentationKt.assistAnimatedBounds(bRg2, c1boAnimateBounds, true, AssistVoicePresentationKt.C109521.INSTANCE);
            boolean zA1Q = AnonymousClass002.A1Q(i4, 4);
            Object objAaT = bfm.AaT();
            if (zA1Q || objAaT == C78N.A00) {
                objAaT = new HatchAssistVoiceCallKt$AssistVoiceBubble$1$1(assistVoicePresentation);
                bfm.Ai0(objAaT);
            }
            BRg bRgAssistComposerInteraction = AssistVoicePresentationKt.assistComposerInteraction(AnonymousClass001.A0W(bRgAssistAnimatedBounds, objAaT), assistVoicePresentation.isVoice());
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == C78N.A00) {
                objAaT2 = HatchAssistVoiceCallKt$AssistVoiceBubble$2$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            AuraElevatedSurfaceKt.m2622AuraElevatedPillSurfaceDzVHIIc(bRgAssistComposerInteraction, 28.0f, (Function0) objAaT2, B1V.A00(bfm, new AnonymousClass3(z, axn, assistVoicePresentation, g0v, aaC), 103265332), bfm, 3504, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(assistVoicePresentation, aaC, z, z2, bRg2, g0v, i, i2);
        }
    }

    public static final void HatchAssistVoiceCall(AssistVoicePresentation assistVoicePresentation, AssistVoiceLayout assistVoiceLayout, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        VoiceUi ui;
        BRg bRgA0Q = bRg;
        boolean zA1Z = AnonymousClass005.A1Z(assistVoicePresentation, assistVoiceLayout, function0);
        bfm.AgG(1745311314);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, assistVoicePresentation) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(assistVoiceLayout, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            VoiceCallStateHolder companion = VoiceCallStateHolder.Companion.getInstance(AnonymousClass002.A0h(bfm));
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new Object();
                bfm.Ai0(objAaT);
            }
            boolean zA1M = AnonymousClass003.A1M(bfm, companion, objAaT);
            Object objAaT2 = bfm.AaT();
            if (zA1M || objAaT2 == obj) {
                objAaT2 = new HatchAssistVoiceCallKt$HatchAssistVoiceCall$1$1(companion, objAaT);
                bfm.Ai0(objAaT2);
            }
            C7bA.A03(bfm, null, companion, objAaT, (G0U) objAaT2, VoiceCallStateHolder.$stable, 4);
            B81.A00(false, function0, bfm, (iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, zA1Z ? 1 : 0);
            BRg bRgA00 = AbstractC07539Wl.A00(AnonymousClass001.A0T(bRgA0Q), "assist-voice-call");
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, i4);
            int i5 = iA0d & 14;
            int i6 = i5 | 199680;
            AssistVoiceBubble(assistVoicePresentation, assistVoiceLayout.leading, assistVoiceLayout.stacked, zA1Z, null, ComposableSingletons$HatchAssistVoiceCallKt.lambda$752776967, bfm, i6, 16);
            AssistVoiceBubble(assistVoicePresentation, assistVoiceLayout.trailing, assistVoiceLayout.stacked, false, null, ComposableSingletons$HatchAssistVoiceCallKt.f10lambda$98654864, bfm, i6, 16);
            VoiceIntegration integration = Voice.INSTANCE.getIntegration();
            if (integration == null || (ui = integration.getUi()) == null) {
                bfm.AgE(-1733537843);
            } else {
                bfm.AgE(-471562572);
                BRg bRgA07 = C3U4.A07(C10G.A02, 20.0f);
                boolean z = (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA0d & 64) != 0 && bfm.A67(assistVoiceLayout));
                Object objAaT3 = bfm.AaT();
                if (z || objAaT3 == obj) {
                    objAaT3 = new HatchAssistVoiceCallKt$HatchAssistVoiceCall$2$1$1(assistVoiceLayout);
                    bfm.Ai0(objAaT3);
                }
                BRg bRgA002 = C3UC.A00(bRgA07, (G0W) objAaT3);
                boolean zA1Q = AnonymousClass002.A1Q(i5, 4);
                Object objAaT4 = bfm.AaT();
                if (zA1Q || objAaT4 == obj) {
                    objAaT4 = new HatchAssistVoiceCallKt$HatchAssistVoiceCall$2$2$1(assistVoicePresentation);
                    bfm.Ai0(objAaT4);
                }
                ui.CompactCallCaption(AnonymousClass001.A0W(bRgA002, objAaT4), bfm, 0);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, zA1Z);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C109673(assistVoicePresentation, assistVoiceLayout, function0, bRgA0Q, i, i2);
        }
    }

    public static final void AssistVoiceButtonPair(boolean z, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        BBI bbi;
        BRg bRgA01;
        bfm.AgG(-800519529);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0n |= 48;
        } else if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0e(bfm, bRg);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0n), bfm, iA0n)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            if (z) {
                bfm.AgE(1676256198);
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A02, bfm, C2VU.A00, 54);
                bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                bRgA01 = AxM.A01(bfm, bRg);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V != null) {
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    AnonymousClass003.A0o(bfm, interfaceC1380AiAA00, akqA04);
                    AnonymousClass002.A0w(bfm, iA0J);
                    AnonymousClass003.A0n(bfm, bRgA01);
                    AnonymousClass005.A0q(bbi, bfm, g0v, iA0n >> 6);
                    BBI.A0R(bbi, false);
                }
                C00x.A00();
                throw F60.createAndThrow();
            }
            bfm.AgE(1676435595);
            InterfaceC1380AiA interfaceC1380AiAA002 = C0A8.A00(AcQ.A02, bfm, C2VU.A04, 54);
            bbi = (BBI) bfm;
            int iA0J2 = AnonymousClass003.A0J(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            bRgA01 = AxM.A01(bfm, bRg);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V != null) {
                AnonymousClass005.A0n(bfm, bbi, function02);
                AnonymousClass003.A0o(bfm, interfaceC1380AiAA002, akqA042);
                AnonymousClass002.A0w(bfm, iA0J2);
                AnonymousClass003.A0n(bfm, bRgA01);
                AnonymousClass005.A0q(bbi, bfm, g0v, iA0n >> 6);
                BBI.A0R(bbi, false);
            }
            C00x.A00();
            throw F60.createAndThrow();
        }
        bfm.Afo();
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C109663(z, bRg, g0v, i, i2);
        }
    }
}
