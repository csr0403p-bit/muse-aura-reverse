package com.facebook.aura.partners.voice.chrome;

import X.AGO;
import X.AKH;
import X.AKQ;
import X.AKT;
import X.AOe;
import X.ARD;
import X.AVy;
import X.AbstractC1396AiR;
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
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C1515AkP;
import X.C2av;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC0857A6e;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.header.api.HeaderActionIcon;
import com.facebook.aura.header.view.HeaderButtonKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class VoiceCallChromeKt {
    public static final float HandsetToHangUpOffsetY = 0.9f;
    public static final float HandsetToHangUpRotation = 120.0f;
    public static final float HandsetToHangUpScale = 0.94f;
    public static final float HangUpFillEndProgress = 0.5f;
    public static final float HangUpFillStartProgress = 0.2f;
    public static final int TurnPhaseGapMillis = 200;
    public static final int TurnRevealDurationMillis = 160;
    public static final int TurnRevealLagMillis = 60;
    public static final HeaderActionIcon VoiceCallIcon = new HeaderActionIcon(R.drawable.phone_handset_wght400_outline_24, R.string._name_removed__res_0x7f120643, false, true);
    public static final HeaderActionIcon VoiceCallDisabledIcon = new HeaderActionIcon(R.drawable.phone_handset_wght400_outline_24, R.string._name_removed__res_0x7f120643, false, false);
    public static final AKH<VoiceCallChromeState> LocalVoiceCallChrome = new AGO(VoiceCallChromeKt$LocalVoiceCallChrome$1.INSTANCE);

    /* renamed from: com.facebook.aura.partners.voice.chrome.VoiceCallChromeKt$ProvideVoiceCallChrome$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0V<? super BFM, ? super Integer, Unit> g0v, int i) {
            super(2);
            this.$content = g0v;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceCallChromeKt.ProvideVoiceCallChrome(this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.chrome.VoiceCallChromeKt$voiceCallEntrance$1, reason: invalid class name and case insensitive filesystem */
    public final class C130791 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
        public static final C130791 INSTANCE = new C130791();

        public C130791() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.chrome.VoiceCallChromeKt$voiceCallEntrance$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<C2av, Unit> {
        public final /* synthetic */ VoiceCallSlotAnimation $animation;

        /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke2(X.C2av r2) {
            /*
                r1 = this;
                r0 = 0
                X.C7384Etj.A0Y(r2, r0)
                com.facebook.aura.partners.voice.chrome.VoiceCallSlotAnimation r0 = r1.$animation
                boolean r0 = r0.getTurning()
                if (r0 != 0) goto L16
                com.facebook.aura.partners.voice.chrome.VoiceCallSlotAnimation r0 = r1.$animation
                boolean r1 = r0.getTurnShown()
                r0 = 1065353216(0x3f800000, float:1.0)
                if (r1 == 0) goto L17
            L16:
                r0 = 0
            L17:
                r2.Acj(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.chrome.VoiceCallChromeKt.AnonymousClass2.invoke2(X.2av):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(VoiceCallSlotAnimation voiceCallSlotAnimation) {
            super(1);
            this.$animation = voiceCallSlotAnimation;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
            invoke2(c2av);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void ProvideVoiceCallChrome(G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        C7384Etj.A0Y(g0v, 0);
        bfm.AgG(1157984891);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, g0v) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0T), bfm, iA0T)) {
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = new VoiceCallChromeState();
                bfm.Ai0(objAaT);
            }
            AKT.A01(bfm, LocalVoiceCallChrome.A04(objAaT), g0v, ((iA0T << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 8);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(g0v, i);
        }
    }

    public static final BRg voiceCallEntrance(BRg bRg, VoiceCallChromeState voiceCallChromeState) {
        VoiceCallSlotAnimation morphAnimation$fbandroid_express_aura_java_com_facebook_aura_partners_voice_chrome_chrome;
        C7384Etj.A0Y(bRg, 0);
        if (voiceCallChromeState == null || (morphAnimation$fbandroid_express_aura_java_com_facebook_aura_partners_voice_chrome_chrome = voiceCallChromeState.getMorphAnimation$fbandroid_express_aura_java_com_facebook_aura_partners_voice_chrome_chrome()) == null) {
            return null;
        }
        return AbstractC1396AiR.A00(ARD.A00(bRg, C130791.INSTANCE), new AnonymousClass2(morphAnimation$fbandroid_express_aura_java_com_facebook_aura_partners_voice_chrome_chrome));
    }

    /* renamed from: VoiceCallSlotIcon-3IgeMak, reason: not valid java name */
    public static final void m1704VoiceCallSlotIcon3IgeMak(VoiceCallSlotAnimation voiceCallSlotAnimation, long j, BRg bRg, BFM bfm, int i, int i2) {
        BBI bbiA0M;
        long j2;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(voiceCallSlotAnimation, 0);
        bfm.AgG(-2097307922);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, voiceCallSlotAnimation) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0N(bfm, j);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HeaderActionIcon headerActionIcon = VoiceCallIcon;
            HeaderActionIcon icon = VoiceCallControl.END.getIcon();
            if (icon.destructive) {
                bfm.AgE(-1173241931);
                j2 = C3cH.A0W(bfm).destructiveIcon.enabled;
                bbiA0M = C3cG.A07(bfm);
            } else {
                bbiA0M = AnonymousClass002.A0M(bfm, -1173241511);
                j2 = j;
            }
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            int iA02 = C3cG.A02(bbiA0M.A06);
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA02);
            AVy aVyA00 = BOf.A00(bfm, headerActionIcon.res, 0);
            AuraIconSize auraIconSize = AuraIconSize.SMALL;
            BS0 bs0 = BRg.A00;
            int i4 = iA0d & 14;
            boolean zA17 = AnonymousClass003.A17(i4);
            Object objAaT = bfm.AaT();
            if (zA17 || objAaT == C78N.A00) {
                objAaT = new VoiceCallChromeKt$VoiceCallSlotIcon$1$1$1(voiceCallSlotAnimation);
                bfm.Ai0(objAaT);
            }
            BRg bRgA0W = AnonymousClass001.A0W(bs0, objAaT);
            int i5 = AVy.$stable;
            AuraIconKt.m2567AuraIconFHprtrg(bRgA0W, aVyA00, auraIconSize, null, j, null, bfm, AnonymousClass001.A0B(iA0d << 9, (i5 << 3) | 3456), 32);
            AVy aVyA002 = BOf.A00(bfm, icon.res, 0);
            boolean z = i4 == 4;
            Object objAaT2 = bfm.AaT();
            if (z || objAaT2 == C78N.A00) {
                objAaT2 = new VoiceCallChromeKt$VoiceCallSlotIcon$1$2$1(voiceCallSlotAnimation);
                bfm.Ai0(objAaT2);
            }
            AuraIconKt.m2567AuraIconFHprtrg(AnonymousClass001.A0W(bs0, objAaT2), aVyA002, auraIconSize, null, j2, null, bfm, (i5 << 3) | 3456, 32);
            BBI.A0R(bbiA0M, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new VoiceCallChromeKt$VoiceCallSlotIcon$2(voiceCallSlotAnimation, j, bRg2, i, i2);
        }
    }

    public static final AKH<VoiceCallChromeState> getLocalVoiceCallChrome() {
        return LocalVoiceCallChrome;
    }

    public static final HeaderActionIcon getVoiceCallDisabledIcon() {
        return VoiceCallDisabledIcon;
    }

    public static final HeaderActionIcon getVoiceCallIcon() {
        return VoiceCallIcon;
    }

    public static final AOe<Float> delayedHeaderPillSpring() {
        return new StartDelaySpec(HeaderButtonKt.headerPillSpring(), 200000000L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Type inference failed for: r25v0, types: [X.BFM, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19, types: [androidx.compose.runtime.snapshots.Snapshot] */
    /* JADX WARN: Type inference failed for: r2v20, types: [androidx.compose.runtime.snapshots.Snapshot] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [X.G0U] */
    /* JADX WARN: Type inference failed for: r5v18, types: [X.G0U] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r6v26, types: [androidx.compose.runtime.snapshots.Snapshot] */
    /* JADX WARN: Type inference failed for: r6v27, types: [androidx.compose.runtime.snapshots.Snapshot] */
    /* JADX WARN: Type inference failed for: r6v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.facebook.aura.partners.voice.chrome.VoiceCallChromeKt$rememberVoiceCallSlotAnimation$width$1] */
    /* JADX WARN: Type inference failed for: r7v9, types: [com.facebook.aura.partners.voice.chrome.VoiceCallChromeKt$rememberVoiceCallSlotAnimation$reveal$1] */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.facebook.aura.partners.voice.chrome.VoiceCallChromeKt$rememberVoiceCallSlotAnimation$height$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.partners.voice.chrome.VoiceCallSlotAnimation rememberVoiceCallSlotAnimation(boolean r23, X.C1BO<java.lang.Float> r24, X.BFM r25, int r26) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.chrome.VoiceCallChromeKt.rememberVoiceCallSlotAnimation(boolean, X.1BO, X.BFM, int):com.facebook.aura.partners.voice.chrome.VoiceCallSlotAnimation");
    }
}
