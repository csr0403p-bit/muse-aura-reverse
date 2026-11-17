package com.facebook.aura.partners.voice.screen;

import X.AKQ;
import X.AWA;
import X.AaC;
import X.Ab3;
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
import X.BLU;
import X.BRg;
import X.C00x;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C2CK;
import X.C3UC;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import com.facebook.aura.model.AgentActivityStatus;
import com.facebook.aura.partners.voice.intf.VoiceBotOutputActivityState;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentCallState;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentStillHandoff;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentVideoSuppression;
import com.facebook.aura.partners.voice.ui.ReconnectingCoverKt;
import com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class VoiceEmbodimentAvatarOverlayKt {

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceEmbodimentAvatarOverlayKt$CallAvatarReconnectingCover$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $inSystemPip;
        public final /* synthetic */ G0W<BRg, BFM, Integer, Unit> $media;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ VoiceCallStateHolder $stateHolder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(VoiceCallStateHolder voiceCallStateHolder, boolean z, BRg bRg, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
            super(2);
            this.$stateHolder = voiceCallStateHolder;
            this.$inSystemPip = z;
            this.$modifier = bRg;
            this.$media = g0w;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceEmbodimentAvatarOverlayKt.CallAvatarReconnectingCover(this.$stateHolder, this.$inSystemPip, this.$modifier, this.$media, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceEmbodimentAvatarOverlayKt$VoiceCallAvatarMedia$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isCompactHost;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$isCompactHost = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceEmbodimentAvatarOverlayKt.VoiceCallAvatarMedia(this.$modifier, this.$isCompactHost, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceEmbodimentAvatarOverlayKt$VoiceCallAvatarMedia$9, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass9 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isCompactHost;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$isCompactHost = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceEmbodimentAvatarOverlayKt.VoiceCallAvatarMedia(this.$modifier, this.$isCompactHost, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceEmbodimentAvatarOverlayKt$VoiceEmbodimentAvatarOverlay$1, reason: invalid class name and case insensitive filesystem */
    public final class C131891 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131891(BRg bRg, int i, int i2) {
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
            VoiceEmbodimentAvatarOverlayKt.VoiceEmbodimentAvatarOverlay(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final BLU callAvatarPipRegion(BLU blu, VoiceEmbodimentMedia voiceEmbodimentMedia) {
        VoiceEmbodimentMedia.LiveRtc liveRtc;
        VoiceEmbodimentMedia.ReferenceFraming referenceFraming;
        C7384Etj.A0Y(blu, 0);
        float f = (!(voiceEmbodimentMedia instanceof VoiceEmbodimentMedia.LiveRtc) || (liveRtc = (VoiceEmbodimentMedia.LiveRtc) voiceEmbodimentMedia) == null || ((referenceFraming = liveRtc.liveFraming) == null && (referenceFraming = liveRtc.previewFraming) == null)) ? 0.0f : referenceFraming.cropTopFraction;
        int i = blu.A02;
        int i2 = blu.A01;
        int i3 = blu.A00;
        int i4 = blu.A03;
        int i5 = i3 - i4;
        BLU bluCallAvatarFullScreenFrameBounds = VoiceEmbodimentBackdropKt.callAvatarFullScreenFrameBounds(i - i2, i5);
        BLU blu2 = new BLU(bluCallAvatarFullScreenFrameBounds.A01 + i2, bluCallAvatarFullScreenFrameBounds.A03 + i4, bluCallAvatarFullScreenFrameBounds.A02 + i2, bluCallAvatarFullScreenFrameBounds.A00 + i4);
        int i6 = blu2.A02;
        int i7 = blu2.A01;
        int iMin = Math.min(i6 - i7, i5);
        int iA01 = blu2.A03 + Ab3.A01((blu2.A00 - r1) * f);
        int i8 = i3 - iMin;
        if (iA01 <= i8) {
            i8 = iA01;
        }
        if (i8 < i4) {
            i8 = i4;
        }
        return new BLU(i7, i8, i7 + iMin, iMin + i8);
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceEmbodimentAvatarOverlayKt$VoiceCallAvatarMedia$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC7559F3s implements G0W<BRg, BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<AgentActivityStatus> $activity$delegate;
        public final /* synthetic */ C1BO<VoiceBotOutputActivityState> $botOutput$delegate;
        public final /* synthetic */ BRg $callAvatarFraming;
        public final /* synthetic */ C1BO<VoiceEmbodimentCallState> $callState$delegate;
        public final /* synthetic */ VoiceEmbodimentMedia.LiveRtc $currentMedia;
        public final /* synthetic */ float $idleCropTop;
        public final /* synthetic */ boolean $inFullScreen;
        public final /* synthetic */ boolean $inSystemPip;
        public final /* synthetic */ boolean $isCompactHost;
        public final /* synthetic */ C1BO<Boolean> $liveAvatarEnabled$delegate;
        public final /* synthetic */ boolean $liveVideoEnabled;
        public final /* synthetic */ C1BO<VoiceEmbodimentMedia> $media$delegate;
        public final /* synthetic */ HatchStatusPillMetrics $metrics;
        public final /* synthetic */ boolean $ownsDragHandleTone;
        public final /* synthetic */ AtomicReference<AaC> $placedHalfScreenMedia;
        public final /* synthetic */ C1BO<Boolean> $previewActive$delegate;
        public final /* synthetic */ MutableState<Boolean> $rtcPaintedInPresentation$delegate;
        public final /* synthetic */ C1BO<Boolean> $speaking$delegate;
        public final /* synthetic */ VoiceCallStateHolder $stateHolder;
        public final /* synthetic */ C1BO<VoiceEmbodimentStillHandoff> $stillHandoff$delegate;
        public final /* synthetic */ MutableState<Boolean> $stillReady$delegate;
        public final /* synthetic */ C1BO<VoiceEmbodimentVideoSuppression> $suppression$delegate;
        public final /* synthetic */ EmbodimentSurfaceBinding $surface;
        public final /* synthetic */ VoiceAvatarTakeoverState $takeoverState;
        public final /* synthetic */ MutableState<VoiceDragHandleStill> $toneStill$delegate;
        public final /* synthetic */ MutableState<Boolean> $videoCovering$delegate;
        public final /* synthetic */ VoiceCallViewModel $viewModel;

        /* renamed from: com.facebook.aura.partners.voice.screen.VoiceEmbodimentAvatarOverlayKt$VoiceCallAvatarMedia$8$11, reason: invalid class name */
        public final class AnonymousClass11 extends AbstractC7559F3s implements G0W<AWA, BFM, Integer, BRg> {
            public final /* synthetic */ float $idleCropTop;
            public final /* synthetic */ boolean $inSystemPip;

            /* renamed from: invoke-n_ex7bg, reason: not valid java name */
            public final BRg m1770invoken_ex7bg(AWA awa, BFM bfm, int i) {
                BRg bRgM1769callAvatarFramingrloP8gw;
                BBI bbi;
                boolean z;
                bfm.AgE(1360554341);
                if (VoiceAvatarTakeoverKt.m1749isSquareCallAvatarMediaiaC8Vc4(awa)) {
                    bfm.AgE(1822665677);
                    bbi = (BBI) bfm;
                    z = false;
                    BBI.A0R(bbi, false);
                    bRgM1769callAvatarFramingrloP8gw = BRg.A00;
                } else {
                    bRgM1769callAvatarFramingrloP8gw = VoiceEmbodimentAvatarOverlayKt.m1769callAvatarFramingrloP8gw(C3cG.A09(bfm, 1822666777), this.$idleCropTop, this.$inSystemPip, awa, bfm, ((i << 9) & 7168) | 6, 0);
                    bbi = (BBI) bfm;
                    z = false;
                    BBI.A0R(bbi, false);
                }
                BBI.A0R(bbi, z);
                return bRgM1769callAvatarFramingrloP8gw;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass11(float f, boolean z) {
                super(3);
                this.$idleCropTop = f;
                this.$inSystemPip = z;
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ BRg invoke(AWA awa, BFM bfm, Integer num) {
                return m1770invoken_ex7bg(awa, bfm, AnonymousClass001.A0F(num));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(VoiceCallViewModel voiceCallViewModel, EmbodimentSurfaceBinding embodimentSurfaceBinding, boolean z, HatchStatusPillMetrics hatchStatusPillMetrics, VoiceAvatarTakeoverState voiceAvatarTakeoverState, AtomicReference<AaC> atomicReference, float f, boolean z2, VoiceCallStateHolder voiceCallStateHolder, VoiceEmbodimentMedia.LiveRtc liveRtc, MutableState<Boolean> mutableState, C1BO<VoiceEmbodimentCallState> c1bo, MutableState<VoiceDragHandleStill> mutableState2, boolean z3, MutableState<Boolean> mutableState3, MutableState<Boolean> mutableState4, boolean z4, BRg bRg, C1BO<VoiceEmbodimentStillHandoff> c1bo2, C1BO<? extends AgentActivityStatus> c1bo3, C1BO<? extends VoiceEmbodimentMedia> c1bo4, boolean z5, C1BO<Boolean> c1bo5, C1BO<Boolean> c1bo6, C1BO<VoiceEmbodimentVideoSuppression> c1bo7, C1BO<Boolean> c1bo8, C1BO<VoiceBotOutputActivityState> c1bo9) {
            super(3);
            this.$viewModel = voiceCallViewModel;
            this.$surface = embodimentSurfaceBinding;
            this.$ownsDragHandleTone = z;
            this.$metrics = hatchStatusPillMetrics;
            this.$takeoverState = voiceAvatarTakeoverState;
            this.$placedHalfScreenMedia = atomicReference;
            this.$idleCropTop = f;
            this.$inSystemPip = z2;
            this.$stateHolder = voiceCallStateHolder;
            this.$currentMedia = liveRtc;
            this.$rtcPaintedInPresentation$delegate = mutableState;
            this.$callState$delegate = c1bo;
            this.$toneStill$delegate = mutableState2;
            this.$liveVideoEnabled = z3;
            this.$videoCovering$delegate = mutableState3;
            this.$stillReady$delegate = mutableState4;
            this.$isCompactHost = z4;
            this.$callAvatarFraming = bRg;
            this.$stillHandoff$delegate = c1bo2;
            this.$activity$delegate = c1bo3;
            this.$media$delegate = c1bo4;
            this.$inFullScreen = z5;
            this.$previewActive$delegate = c1bo5;
            this.$liveAvatarEnabled$delegate = c1bo6;
            this.$suppression$delegate = c1bo7;
            this.$speaking$delegate = c1bo8;
            this.$botOutput$delegate = c1bo9;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0164  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0172  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0178  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0180  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01ac  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x01b0  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x01c8  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x01cc  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x01ea  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x01ee  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0206  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x020a  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0222  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0226  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0246  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x024a  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0272  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0276  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x02a1  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x02a5  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.BRg r84, X.BFM r85, int r86) {
            /*
                Method dump skipped, instructions count: 817
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceEmbodimentAvatarOverlayKt.AnonymousClass8.invoke(X.BRg, X.BFM, int):void");
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(BRg bRg, BFM bfm, Integer num) {
            invoke(bRg, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void CallAvatarReconnectingCover(VoiceCallStateHolder voiceCallStateHolder, boolean z, BRg bRg, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-108092375);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(voiceCallStateHolder, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1BO<Float> c1boAnimateReconnectingCover = ReconnectingCoverKt.animateReconnectingCover(C1BO.A0F(C2CK.A02(bfm, voiceCallStateHolder.isReconnecting)), bfm, 0);
            boolean zA65 = bfm.A65(c1boAnimateReconnectingCover);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = AnonymousClass002.A0K(bfm, null, new VoiceEmbodimentAvatarOverlayKt$CallAvatarReconnectingCover$coverShown$2$1(c1boAnimateReconnectingCover));
            }
            C1BO c1bo = (C1BO) objAaT;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            long j = auraTheme.getColors(bfm, 6).onMedia;
            int i4 = iA05 >> 6;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            boolean zA652 = bfm.A65(c1boAnimateReconnectingCover) | bfm.A64(j);
            Object objAaT2 = bfm.AaT();
            if (zA652 || objAaT2 == C78N.A00) {
                objAaT2 = ReconnectingCoverKt.m1817reconnectingCovermxwnekA(C10G.A01, new VoiceEmbodimentAvatarOverlayKt$CallAvatarReconnectingCover$1$1$1(c1boAnimateReconnectingCover), j);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A1G(objAaT2, bfm, g0w, i4 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
            if (C1BO.A0F(c1bo)) {
                BRg bRgCallAvatarVisibleCenter = callAvatarVisibleCenter(C3cG.A09(bfm, 207158094), z, bfm, (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6);
                boolean zA653 = bfm.A65(c1boAnimateReconnectingCover);
                Object objAaT3 = bfm.AaT();
                if (zA653 || objAaT3 == C78N.A00) {
                    objAaT3 = new VoiceEmbodimentAvatarOverlayKt$CallAvatarReconnectingCover$1$2$1(c1boAnimateReconnectingCover);
                    bfm.Ai0(objAaT3);
                }
                AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(AnonymousClass001.A0W(bRgCallAvatarVisibleCenter, objAaT3), null, auraTheme.getColors(bfm, 6).onLight, bfm, 0, 2);
            } else {
                bfm.AgE(207347411);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(voiceCallStateHolder, z, bRg2, g0w, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0397 A[PHI: r2
  0x0397: PHI (r2v39 com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia$ReferenceFraming) = 
  (r2v38 com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia$ReferenceFraming)
  (r2v69 com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia$ReferenceFraming)
 binds: [B:82:0x0258, B:84:0x025c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x027c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void VoiceCallAvatarMedia(X.BRg r51, boolean r52, X.BFM r53, int r54, int r55) {
        /*
            Method dump skipped, instructions count: 1012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceEmbodimentAvatarOverlayKt.VoiceCallAvatarMedia(X.BRg, boolean, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* renamed from: callAvatarFraming-rloP8gw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg m1769callAvatarFramingrloP8gw(X.BRg r6, float r7, boolean r8, X.AWA r9, X.BFM r10, int r11, int r12) {
        /*
            r0 = r12 & 4
            if (r0 == 0) goto L5
            r9 = 0
        L5:
            com.facebook.aura.partners.voice.screen.VoiceAvatarFullScreenState r2 = X.C3cH.A0V(r10)
            r0 = r11 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r3 = 256(0x100, float:3.59E-43)
            r5 = 0
            if (r0 <= r3) goto L18
            boolean r0 = r10.A66(r8)
            if (r0 != 0) goto L1d
        L18:
            r1 = r11 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r1 != r3) goto L1e
        L1d:
            r0 = 1
        L1e:
            boolean r4 = X.AnonymousClass001.A1R(r10, r2, r0)
            r0 = r11 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r3 = 32
            if (r0 <= r3) goto L30
            boolean r0 = r10.A62(r7)
            if (r0 != 0) goto L35
        L30:
            r1 = r11 & 48
            r0 = 0
            if (r1 != r3) goto L36
        L35:
            r0 = 1
        L36:
            r4 = r4 | r0
            r0 = r11 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 ^ 3072(0xc00, float:4.305E-42)
            r1 = 2048(0x800, float:2.87E-42)
            if (r0 <= r1) goto L45
            boolean r0 = r10.A65(r9)
            if (r0 != 0) goto L49
        L45:
            r0 = r11 & 3072(0xc00, float:4.305E-42)
            if (r0 != r1) goto L4a
        L49:
            r5 = 1
        L4a:
            r4 = r4 | r5
            java.lang.Object r0 = r10.AaT()
            if (r4 != 0) goto L55
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L5d
        L55:
            com.facebook.aura.partners.voice.screen.VoiceEmbodimentAvatarOverlayKt$callAvatarFraming$1$1 r0 = new com.facebook.aura.partners.voice.screen.VoiceEmbodimentAvatarOverlayKt$callAvatarFraming$1$1
            r0.<init>(r8, r2, r7, r9)
            r10.Ai0(r0)
        L5d:
            X.G0W r0 = (X.G0W) r0
            X.BRg r0 = X.C3UC.A00(r6, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceEmbodimentAvatarOverlayKt.m1769callAvatarFramingrloP8gw(X.BRg, float, boolean, X.AWA, X.BFM, int, int):X.BRg");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg callAvatarMediaHandoff(X.BRg r19, com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r20, boolean r21, long r22, boolean r24, X.BFM r25, int r26) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceEmbodimentAvatarOverlayKt.callAvatarMediaHandoff(X.BRg, com.facebook.aura.partners.voice.intf.VoiceCallStateHolder, boolean, long, boolean, X.BFM, int):X.BRg");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean rememberCallAvatarPresentationStarted(long r6, X.BFM r8, int r9) {
        /*
            X.AKH<java.lang.Boolean> r0 = com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt.LocalVoiceCallTransitionComplete
            java.lang.Object r5 = r8.A6v(r0)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r4 = r5.booleanValue()
            r0 = r9 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto L19
            boolean r0 = r8.A64(r6)
            if (r0 != 0) goto L1e
        L19:
            r1 = r9 & 6
            r0 = 0
            if (r1 != r2) goto L1f
        L1e:
            r0 = 1
        L1f:
            java.lang.Object r3 = r8.AaT()
            if (r0 != 0) goto L29
            java.lang.Object r0 = X.C78N.A00
            if (r3 != r0) goto L2d
        L29:
            androidx.compose.runtime.ParcelableSnapshotMutableState r3 = X.AnonymousClass004.A11(r8, r5)
        L2d:
            androidx.compose.runtime.MutableState r3 = (androidx.compose.runtime.MutableState) r3
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            boolean r1 = X.AnonymousClass003.A1S(r8, r3, r4)
            java.lang.Object r0 = r8.AaT()
            if (r1 != 0) goto L41
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L49
        L41:
            com.facebook.aura.partners.voice.screen.VoiceEmbodimentAvatarOverlayKt$rememberCallAvatarPresentationStarted$1$1 r0 = new com.facebook.aura.partners.voice.screen.VoiceEmbodimentAvatarOverlayKt$rememberCallAvatarPresentationStarted$1$1
            r0.<init>(r4, r3)
            r8.Ai0(r0)
        L49:
            X.AnonymousClass001.A19(r8, r0, r2, r5)
            boolean r0 = androidx.compose.runtime.MutableState.A0A(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceEmbodimentAvatarOverlayKt.rememberCallAvatarPresentationStarted(long, X.BFM, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.G0U<java.lang.Boolean, kotlin.Unit> rememberIdlePlayerResourceCallback(com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r3, X.BFM r4, int r5) {
        /*
            r0 = r5 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto Ld
            boolean r0 = r4.A65(r3)
            if (r0 != 0) goto L12
        Ld:
            r1 = r5 & 6
            r0 = 0
            if (r1 != r2) goto L13
        L12:
            r0 = 1
        L13:
            java.lang.Object r1 = r4.AaT()
            if (r0 != 0) goto L1d
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L29
        L1d:
            java.lang.Object r0 = X.C3cG.A0T()
            com.facebook.aura.partners.voice.screen.VoiceEmbodimentAvatarOverlayKt$rememberIdlePlayerResourceCallback$1$1 r1 = new com.facebook.aura.partners.voice.screen.VoiceEmbodimentAvatarOverlayKt$rememberIdlePlayerResourceCallback$1$1
            r1.<init>(r3, r0)
            r4.Ai0(r1)
        L29:
            X.G0U r1 = (X.G0U) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceEmbodimentAvatarOverlayKt.rememberIdlePlayerResourceCallback(com.facebook.aura.partners.voice.intf.VoiceCallStateHolder, X.BFM, int):X.G0U");
    }

    public static final void VoiceEmbodimentAvatarOverlay(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-1268870156);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            G0W g0w = (G0W) bfm.A6v(HatchVoiceEmbodimentHostKt.LocalVoiceAvatarContent);
            if (g0w == null) {
                bfm.AgE(-903544611);
            } else {
                bfm.AgE(386495396);
                AnonymousClass001.A1G(bRg, bfm, g0w, iA0d & 14);
            }
            AnonymousClass002.A19(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C131891(bRg, i, i2);
        }
    }

    public static final /* synthetic */ VoiceBotOutputActivityState access$VoiceCallAvatarMedia$lambda$12(C1BO c1bo) {
        return (VoiceBotOutputActivityState) c1bo.getValue();
    }

    public static final /* synthetic */ VoiceEmbodimentStillHandoff access$VoiceCallAvatarMedia$lambda$17(C1BO c1bo) {
        return (VoiceEmbodimentStillHandoff) c1bo.getValue();
    }

    public static final /* synthetic */ VoiceDragHandleStill access$VoiceCallAvatarMedia$lambda$26(MutableState mutableState) {
        return (VoiceDragHandleStill) mutableState.getValue();
    }

    public static final /* synthetic */ VoiceEmbodimentVideoSuppression access$VoiceCallAvatarMedia$lambda$3(C1BO c1bo) {
        return (VoiceEmbodimentVideoSuppression) c1bo.getValue();
    }

    public static final /* synthetic */ VoiceEmbodimentCallState access$VoiceCallAvatarMedia$lambda$4(C1BO c1bo) {
        return (VoiceEmbodimentCallState) c1bo.getValue();
    }

    public static final /* synthetic */ VoiceEmbodimentMedia access$VoiceCallAvatarMedia$lambda$5(C1BO c1bo) {
        return (VoiceEmbodimentMedia) c1bo.getValue();
    }

    public static final /* synthetic */ AgentActivityStatus access$VoiceCallAvatarMedia$lambda$9(C1BO c1bo) {
        return (AgentActivityStatus) c1bo.getValue();
    }

    public static final BRg callAvatarVisibleCenter(BRg bRg, boolean z, BFM bfm, int i) {
        VoiceAvatarFullScreenState voiceAvatarFullScreenStateA0V = C3cH.A0V(bfm);
        boolean z2 = true;
        BRg bRgA0T = AnonymousClass001.A0T(bRg);
        if ((((i & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) ^ 48) <= 32 || !bfm.A66(z)) && (i & 48) != 32) {
            z2 = false;
        }
        boolean zA65 = bfm.A65(voiceAvatarFullScreenStateA0V) | z2;
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = new VoiceEmbodimentAvatarOverlayKt$callAvatarVisibleCenter$1$1(z, voiceAvatarFullScreenStateA0V);
            bfm.Ai0(objAaT);
        }
        return C3UC.A00(bRgA0T, (G0W) objAaT);
    }
}
