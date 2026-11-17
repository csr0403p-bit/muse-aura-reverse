package com.facebook.aura.partners.voice.screen;

import X.AKQ;
import X.AOW;
import X.AT5;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
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
import X.C2VU;
import X.C3Ue;
import X.C3cG;
import X.C78N;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.partners.voice.intf.CaptionEntry;
import com.facebook.aura.partners.voice.ui.VoiceCallCaptionsKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class VoiceCallCurrentCaptionKt {
    public static final int CAPTION_ENTRY_DURATION_MS = 200;
    public static final float OUTGOING_CAPTION_FADE_END = 0.6f;

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceCallCurrentCaptionKt$CaptionHandover$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AT5<Float, AOW> $entryAnimation;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $incoming;
        public final /* synthetic */ int $maxLines;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ CaptionEntry $outgoing;
        public final /* synthetic */ boolean $passive;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(CaptionEntry captionEntry, AT5<Float, AOW> at5, boolean z, int i, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, int i2, int i3) {
            super(2);
            this.$outgoing = captionEntry;
            this.$entryAnimation = at5;
            this.$passive = z;
            this.$maxLines = i;
            this.$modifier = bRg;
            this.$incoming = g0v;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceCallCurrentCaptionKt.CaptionHandover(this.$outgoing, this.$entryAnimation, this.$passive, this.$maxLines, this.$modifier, this.$incoming, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceCallCurrentCaptionKt$CaptionPill$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ CaptionEntry $caption;
        public final /* synthetic */ Function0<Float> $entryProgress;
        public final /* synthetic */ boolean $fadeInWords;
        public final /* synthetic */ boolean $isStreaming;
        public final /* synthetic */ int $maxLines;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $passive;
        public final /* synthetic */ boolean $startAligned;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CaptionEntry captionEntry, boolean z, boolean z2, boolean z3, int i, boolean z4, Function0<Float> function0, BRg bRg, int i2, int i3) {
            super(2);
            this.$caption = captionEntry;
            this.$isStreaming = z;
            this.$passive = z2;
            this.$fadeInWords = z3;
            this.$maxLines = i;
            this.$startAligned = z4;
            this.$entryProgress = function0;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceCallCurrentCaptionKt.CaptionPill(this.$caption, this.$isStreaming, this.$passive, this.$fadeInWords, this.$maxLines, this.$startAligned, this.$entryProgress, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceCallCurrentCaptionKt$VoiceCallCurrentCaption$2, reason: invalid class name and case insensitive filesystem */
    public final class C131822 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCaptionHidden;
        public final /* synthetic */ boolean $passive;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131822(BRg bRg, boolean z, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$passive = z;
            this.$onCaptionHidden = function0;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceCallCurrentCaptionKt.VoiceCallCurrentCaption(this.$modifier, this.$passive, this.$onCaptionHidden, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceCallCurrentCaptionKt$VoiceCallCurrentCaption$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCaptionHidden;
        public final /* synthetic */ boolean $passive;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BRg bRg, boolean z, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$passive = z;
            this.$onCaptionHidden = function0;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceCallCurrentCaptionKt.VoiceCallCurrentCaption(this.$modifier, this.$passive, this.$onCaptionHidden, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceCallCurrentCaptionKt$VoiceCallCurrentCaption$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ CaptionEntry $caption;
        public final /* synthetic */ Function0<Float> $entryProgress;
        public final /* synthetic */ boolean $fadeInWords;
        public final /* synthetic */ CaptionEntry $liveCaption;
        public final /* synthetic */ int $maxLines;
        public final /* synthetic */ boolean $paced;
        public final /* synthetic */ boolean $passive;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(CaptionEntry captionEntry, CaptionEntry captionEntry2, boolean z, boolean z2, int i, boolean z3, Function0<Float> function0) {
            super(2);
            this.$caption = captionEntry;
            this.$liveCaption = captionEntry2;
            this.$passive = z;
            this.$fadeInWords = z2;
            this.$maxLines = i;
            this.$paced = z3;
            this.$entryProgress = function0;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                VoiceCallCurrentCaptionKt.CaptionPill(this.$caption, AnonymousClass002.A1X(this.$liveCaption), this.$passive, this.$fadeInWords, this.$maxLines, this.$paced, this.$entryProgress, null, bfm, CaptionEntry.$stable, 128);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceCallCurrentCaptionKt$VoiceCallCurrentCaption$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCaptionHidden;
        public final /* synthetic */ boolean $passive;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(BRg bRg, boolean z, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$passive = z;
            this.$onCaptionHidden = function0;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceCallCurrentCaptionKt.VoiceCallCurrentCaption(this.$modifier, this.$passive, this.$onCaptionHidden, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void CaptionHandover(CaptionEntry captionEntry, AT5<Float, AOW> at5, boolean z, int i, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(1794079714);
        int iA05 = (i2 & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(captionEntry, bfm, i2) ? 1 : 0) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(at5, bfm, i2) ? 1 : 0);
        }
        if ((i2 & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i2 & 3072) == 0) {
            iA05 |= AnonymousClass007.A06(bfm, i);
        }
        int i4 = i3 & 16;
        if (i4 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if ((196608 & i2) == 0) {
            iA05 |= AnonymousClass004.A0Y(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA05, 74898), bfm, iA05)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass003.A0R(bfm, new VoiceCallCurrentCaptionKt$CaptionHandover$leaving$2$1(at5));
            }
            C1BO c1bo = (C1BO) objAaT;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(C2VU.A06, false);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA02);
            if (C1BO.A0F(c1bo)) {
                BS0 bs0A09 = C3cG.A09(bfm, -1789508350);
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == obj) {
                    objAaT2 = VoiceCallCurrentCaptionKt$CaptionHandover$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT2);
                }
                BRg bRgA0X = AnonymousClass001.A0X(bs0A09, objAaT2);
                boolean z2 = (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA05 & 64) != 0 && bfm.A67(at5));
                Object objAaT3 = bfm.AaT();
                if (z2 || objAaT3 == obj) {
                    objAaT3 = new VoiceCallCurrentCaptionKt$CaptionHandover$1$2$1(at5);
                    bfm.Ai0(objAaT3);
                }
                VoiceCallCaptionsKt.VoiceCallOverlayCaption(captionEntry, false, false, i, true, AnonymousClass001.A0W(bRgA0X, objAaT3), 0, z, false, null, bfm, AnonymousClass001.A0C(iA05 << 15, CaptionEntry.$stable | 25008 | (iA05 & 14) | (iA05 & 7168)), 832);
            } else {
                bfm.AgE(-1789079558);
            }
            BBI.A0R(bbi, false);
            AnonymousClass005.A0q(bbi, bfm, g0v, iA05 >> 15);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(captionEntry, at5, z, i, bRg2, g0v, i2, i3);
        }
    }

    public static final void CaptionPill(CaptionEntry captionEntry, boolean z, boolean z2, boolean z3, int i, boolean z4, Function0<Float> function0, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(1024801619);
        int iA05 = (i2 & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(captionEntry, bfm, i2) ? 1 : 0) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i2 & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z2);
        }
        if ((i2 & 3072) == 0) {
            iA05 |= AnonymousClass004.A0q(bfm, z3);
        }
        if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0G(bfm, i);
        }
        if ((196608 & i2) == 0) {
            iA05 |= AnonymousClass004.A0s(bfm, z4);
        }
        if ((1572864 & i2) == 0) {
            iA05 |= AnonymousClass004.A0Z(bfm, function0);
        }
        int i4 = i3 & 128;
        int iA0k = 12582912;
        if (i4 != 0) {
            iA05 |= iA0k;
        } else if ((12582912 & i2) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, bRg2);
            iA05 |= iA0k;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1D(iA05), bfm, iA05)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            VoiceCallCaptionsKt.VoiceCallOverlayCaption(captionEntry, z, !z3, i, z4, bRg2, captionEntry.text.length(), z2, z3, function0, bfm, AnonymousClass001.A06(iA05 << 9, AnonymousClass005.A03(iA05 << 15, AnonymousClass003.A07(iA05 >> 3, CaptionEntry.$stable | (iA05 & 14) | (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX)) | (458752 & (iA05 >> 6)))), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(captionEntry, z, z2, z3, i, z4, function0, bRg2, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0297 A[PHI: r16
  0x0297: PHI (r16v3 boolean) = (r16v0 boolean), (r16v4 boolean) binds: [B:49:0x00f4, B:51:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f6 A[PHI: r16
  0x00f6: PHI (r16v4 boolean) = (r16v0 boolean), (r16v5 boolean) binds: [B:49:0x00f4, B:47:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void VoiceCallCurrentCaption(X.BRg r26, boolean r27, kotlin.jvm.functions.Function0<kotlin.Unit> r28, X.BFM r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceCallCurrentCaptionKt.VoiceCallCurrentCaption(X.BRg, boolean, kotlin.jvm.functions.Function0, X.BFM, int, int):void");
    }
}
