package com.facebook.aura.conversation.view;

import X.AHD;
import X.AKH;
import X.AKJ;
import X.AKQ;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B18;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BJe;
import X.BRg;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1544Al7;
import X.C1D3;
import X.C1DM;
import X.C1b8;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G2k;
import X.HDi;
import X.HxS;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.audio.podcast.PodcastPresentationResolver;
import com.facebook.aura.conversation.view.richcontent.HatchAdaptiveMediaGridKt;
import com.facebook.aura.conversation.view.richcontent.HatchInlineImageKt;
import com.facebook.aura.conversation.view.richcontent.LocalAttachmentCardHeaderColorKt;
import com.facebook.aura.conversation.view.richcontent.LocalAttachmentCardShapeKt;
import com.facebook.aura.gateway.AuraMarkdownUrlResolversKt;
import com.facebook.aura.model.AudioPresentationData;
import com.facebook.aura.model.HatchAttachmentFile;
import com.facebook.aura.model.HatchMediaLayout;
import com.facebook.aura.ui.gestures.ChildPressTrackerKt;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchAttachmentPresentationCardKt {
    public static final int FANNED_STACK_MAX_CARDS = 4;
    public static final float FANNED_STACK_TILT_STEP_DEGREES = 3.0f;
    public static final float FannedStackCardHeight = 220.0f;
    public static final float FannedStackCardWidth = 170.0f;

    /* renamed from: com.facebook.aura.conversation.view.HatchAttachmentPresentationCardKt$FannedStackBackCard$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $depth;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchAttachmentFile $video;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchAttachmentFile hatchAttachmentFile, int i, BRg bRg, int i2, int i3) {
            super(2);
            this.$video = hatchAttachmentFile;
            this.$depth = i;
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
            HatchAttachmentPresentationCardKt.FannedStackBackCard(this.$video, this.$depth, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchAttachmentPresentationCardKt$VideoAttachmentFannedStack$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ InlineContentCallbacks $callbacks;
        public final /* synthetic */ String $messageId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AHD<HatchAttachmentFile> $videos;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AHD<HatchAttachmentFile> ahd, String str, BRg bRg, InlineContentCallbacks inlineContentCallbacks, int i, int i2) {
            super(2);
            this.$videos = ahd;
            this.$messageId = str;
            this.$modifier = bRg;
            this.$callbacks = inlineContentCallbacks;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchAttachmentPresentationCardKt.VideoAttachmentFannedStack(this.$videos, this.$messageId, this.$modifier, this.$callbacks, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchAttachmentPresentationCardKt$VideoAttachmentGrid$1, reason: invalid class name and case insensitive filesystem */
    public final class C114051 extends AbstractC7559F3s implements G2k<Integer, BRg, Boolean, BFM, Integer, Unit> {
        public final /* synthetic */ InlineContentCallbacks $callbacks;
        public final /* synthetic */ String $messageId;
        public final /* synthetic */ AHD<HatchAttachmentFile> $videos;

        public final void invoke(int i, BRg bRg, boolean z, BFM bfm, int i2) {
            C7384Etj.A0Y(bRg, 1);
            int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
            if ((i2 & 48) == 0) {
                iA0D |= AnonymousClass004.A0e(bfm, bRg);
            }
            if ((i2 & 384) == 0) {
                iA0D |= AnonymousClass004.A0p(bfm, z);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 1171, 1170), bfm, iA0D)) {
                bfm.Afo();
                return;
            }
            HatchAttachmentFile hatchAttachmentFile = (HatchAttachmentFile) this.$videos.get(i);
            BRg bRgA00 = BJe.A00(bRg, 1.0f, false);
            String str = this.$messageId;
            InlineContentCallbacks inlineContentCallbacks = this.$callbacks;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            bfm.Ag8(833298509, hatchAttachmentFile.path);
            AnonymousClass003.A0m(bfm, LocalAttachmentCardShapeKt.LocalAttachmentCardShape.A04(HatchAdaptiveMediaGridKt.HatchMediaGridCellShape), new HatchAttachmentPresentationCardKt$VideoAttachmentGrid$1$1$1(hatchAttachmentFile, str, inlineContentCallbacks, z), -998728773);
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114051(AHD<HatchAttachmentFile> ahd, String str, InlineContentCallbacks inlineContentCallbacks) {
            super(5);
            this.$videos = ahd;
            this.$messageId = str;
            this.$callbacks = inlineContentCallbacks;
        }

        @Override // X.G2k
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, BRg bRg, Boolean bool, BFM bfm, Integer num2) {
            invoke(AnonymousClass001.A0F(num), bRg, AnonymousClass001.A1X(bool), bfm, AnonymousClass001.A0F(num2));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchAttachmentPresentationCardKt$VideoAttachmentGrid$2, reason: invalid class name and case insensitive filesystem */
    public final class C114062 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ InlineContentCallbacks $callbacks;
        public final /* synthetic */ C1DM $containerShape;
        public final /* synthetic */ String $messageId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AHD<HatchAttachmentFile> $videos;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114062(AHD<HatchAttachmentFile> ahd, String str, C1DM c1dm, BRg bRg, InlineContentCallbacks inlineContentCallbacks, int i, int i2) {
            super(2);
            this.$videos = ahd;
            this.$messageId = str;
            this.$containerShape = c1dm;
            this.$modifier = bRg;
            this.$callbacks = inlineContentCallbacks;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchAttachmentPresentationCardKt.VideoAttachmentGrid(this.$videos, this.$messageId, this.$containerShape, this.$modifier, this.$callbacks, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchAttachmentPresentationCardKt$VideoAttachmentThumbnail$2, reason: invalid class name and case insensitive filesystem */
    public final class C114072 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ InlineContentCallbacks $callbacks;
        public final /* synthetic */ boolean $isLongPressShareTarget;
        public final /* synthetic */ String $messageId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ float $posterAspectRatio;
        public final /* synthetic */ boolean $showsPlayIcon;
        public final /* synthetic */ HatchAttachmentFile $video;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114072(HatchAttachmentFile hatchAttachmentFile, String str, BRg bRg, InlineContentCallbacks inlineContentCallbacks, float f, boolean z, boolean z2, int i, int i2) {
            super(2);
            this.$video = hatchAttachmentFile;
            this.$messageId = str;
            this.$modifier = bRg;
            this.$callbacks = inlineContentCallbacks;
            this.$posterAspectRatio = f;
            this.$showsPlayIcon = z;
            this.$isLongPressShareTarget = z2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchAttachmentPresentationCardKt.VideoAttachmentThumbnail(this.$video, this.$messageId, this.$modifier, this.$callbacks, this.$posterAspectRatio, this.$showsPlayIcon, this.$isLongPressShareTarget, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c1 A[LOOP:0: B:45:0x00bb->B:47:0x00c1, LOOP_END] */
    /* renamed from: HatchImageAttachmentCard-3f6hBDE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m532HatchImageAttachmentCard3f6hBDE(com.facebook.aura.model.ImageGalleryPresentationData r14, java.lang.String r15, java.lang.String r16, X.C1DM r17, long r18, X.BRg r20, com.facebook.aura.conversation.view.InlineContentCallbacks r21, X.BFM r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchAttachmentPresentationCardKt.m532HatchImageAttachmentCard3f6hBDE(com.facebook.aura.model.ImageGalleryPresentationData, java.lang.String, java.lang.String, X.1DM, long, X.BRg, com.facebook.aura.conversation.view.InlineContentCallbacks, X.BFM, int, int):void");
    }

    public static final double fannedStackTiltRadians(int i) {
        return Math.toRadians(i * 3.0d);
    }

    /* loaded from: classes3.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchMediaLayout.values().length];
            try {
                AnonymousClass002.A13(HatchMediaLayout.AdaptiveGrid, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchMediaLayout.FannedStack, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: AttachmentFileChip-FHprtrg, reason: not valid java name */
    public static final void m529AttachmentFileChipFHprtrg(HatchAttachmentFile hatchAttachmentFile, boolean z, G0V<? super String, ? super String, Unit> g0v, C1DM c1dm, long j, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(509599468);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchAttachmentFile, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, g0v);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, c1dm);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0Q(bfm, j);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA05 |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA05 |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            boolean zA1K = AnonymousClass003.A1K(bfm, hatchAttachmentFile.path, abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                objAaT = AuraMarkdownUrlResolversKt.resolveAttachmentRawUrl(hatchAttachmentFile, abstractC3358CGzA0h);
                bfm.Ai0(objAaT);
            }
            AnonymousClass003.A0p(bfm, new HatchAttachmentPresentationCardKt$AttachmentFileChip$1(hatchAttachmentFile, (String) objAaT, z, g0v, bRg2), new AKJ[]{LocalAttachmentCardShapeKt.LocalAttachmentCardShape.A04(c1dm), AnonymousClass003.A0T(LocalAttachmentCardHeaderColorKt.LocalAttachmentCardHeaderColor, j)}, -1143627220);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchAttachmentPresentationCardKt$AttachmentFileChip$2(hatchAttachmentFile, z, g0v, c1dm, j, bRg2, i, i2);
        }
    }

    public static final void FannedStackBackCard(HatchAttachmentFile hatchAttachmentFile, int i, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(-1022300617);
        int iA05 = (i2 & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchAttachmentFile, bfm, i2) ? 1 : 0) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA05 |= AnonymousClass004.A0E(bfm, i);
        }
        int i4 = i3 & 4;
        if (i4 != 0) {
            iA05 |= 384;
        } else if ((i2 & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            boolean zA1K = AnonymousClass003.A1K(bfm, hatchAttachmentFile.path, abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                objAaT = (String) AbstractC0878AGe.A0G(AuraMarkdownUrlResolversKt.resolveAuraMarkdownVideoThumbnails(hatchAttachmentFile.path, abstractC3358CGzA0h));
                bfm.Ai0(objAaT);
            }
            String str = (String) objAaT;
            C1DM c1dmA0R = C06G.A0R(bfm);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            long jA0F = C06G.A0F(bfm, akh);
            long jA04 = HxS.A04(HDi.A0O[(int) (jA0F & 63)], B6A.A03(jA0F), B6A.A02(jA0F), B6A.A01(jA0F), 0.05f);
            BRg bRgA0C = C10G.A0C(bRg2, FannedStackCardWidth, FannedStackCardHeight);
            boolean zA1C = AnonymousClass003.A1C(iA05);
            Object objAaT2 = bfm.AaT();
            if (zA1C || objAaT2 == C78N.A00) {
                objAaT2 = new HatchAttachmentPresentationCardKt$FannedStackBackCard$cardModifier$1$1(i);
                bfm.Ai0(objAaT2);
            }
            BRg bRgA0W = AnonymousClass001.A0W(bRgA0C, objAaT2);
            boolean zA64 = bfm.A64(jA04);
            Object objAaT3 = bfm.AaT();
            if (zA64 || objAaT3 == C78N.A00) {
                objAaT3 = new HatchAttachmentPresentationCardKt$FannedStackBackCard$cardModifier$2$1(jA04);
                bfm.Ai0(objAaT3);
            }
            BRg bRgA01 = C1b8.A01(C11U.A03(bRgA0W.then(new C1544Al7(c1dmA0R, (G0U) objAaT3)), c1dmA0R), C06G.A0E(bfm, akh));
            if (str == null || hatchAttachmentFile.missing) {
                bfm.AgE(256445858);
                C01N.A07(bfm, bRgA01);
            } else {
                bfm.AgE(256495923);
                AuraImageKt.m2573AuraImageXRP3Ue8(str, bRgA01, B18.A00, null, null, false, null, 0L, false, false, false, null, null, null, null, bfm, 384, 48, 30712);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(hatchAttachmentFile, i, bRg2, i2, i3);
        }
    }

    /* renamed from: HatchAudioAttachmentCard-uDo3WH8, reason: not valid java name */
    public static final void m530HatchAudioAttachmentCarduDo3WH8(AudioPresentationData audioPresentationData, String str, C1D3 c1d3, long j, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass005.A0x(audioPresentationData, str, c1d3);
        bfm.AgG(709890900);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(audioPresentationData, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, c1d3);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0P(bfm, j);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            boolean zA1K = AnonymousClass003.A1K(bfm, audioPresentationData.audio.path, abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                objAaT = AuraMarkdownUrlResolversKt.resolveAttachmentRawUrl(audioPresentationData.audio, abstractC3358CGzA0h);
                bfm.Ai0(objAaT);
            }
            String str2 = (String) objAaT;
            HatchInlineAudioPlayerKt.m624HatchInlineAudioPlayerFItCLgY(str2, audioPresentationData.audio.label, null, null, null, str, PodcastPresentationResolver.INSTANCE.isPodcastPath(str2) ? "podcast" : "audio", bRg2, j, c1d3, bfm, AnonymousClass001.A06(iA05 << 21, AnonymousClass001.A09(iA05 << 15, AnonymousClass001.A0C(iA05 << 9, (iA05 << 12) & 458752))), 28);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchAttachmentPresentationCardKt$HatchAudioAttachmentCard$1(audioPresentationData, str, c1d3, j, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* renamed from: HatchFileAttachmentCard-T042LqI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m531HatchFileAttachmentCardT042LqI(com.facebook.aura.model.FilePresentationData r23, X.C1DM r24, long r25, X.BRg r27, com.facebook.aura.conversation.view.InlineContentCallbacks r28, X.BFM r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchAttachmentPresentationCardKt.m531HatchFileAttachmentCardT042LqI(com.facebook.aura.model.FilePresentationData, X.1DM, long, X.BRg, com.facebook.aura.conversation.view.InlineContentCallbacks, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* renamed from: HatchSlidesAttachmentCard-T042LqI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m533HatchSlidesAttachmentCardT042LqI(com.facebook.aura.model.SlidesPresentationData r26, X.C1DM r27, long r28, X.BRg r30, com.facebook.aura.conversation.view.InlineContentCallbacks r31, X.BFM r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchAttachmentPresentationCardKt.m533HatchSlidesAttachmentCardT042LqI(com.facebook.aura.model.SlidesPresentationData, X.1DM, long, X.BRg, com.facebook.aura.conversation.view.InlineContentCallbacks, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0108  */
    /* renamed from: HatchVideoAttachmentCard-hYmLsZ8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m534HatchVideoAttachmentCardhYmLsZ8(com.facebook.aura.model.VideoPresentationData r19, java.lang.String r20, X.C1DM r21, long r22, X.BRg r24, com.facebook.aura.model.HatchMediaLayout r25, com.facebook.aura.conversation.view.InlineContentCallbacks r26, X.BFM r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchAttachmentPresentationCardKt.m534HatchVideoAttachmentCardhYmLsZ8(com.facebook.aura.model.VideoPresentationData, java.lang.String, X.1DM, long, X.BRg, com.facebook.aura.model.HatchMediaLayout, com.facebook.aura.conversation.view.InlineContentCallbacks, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void VideoAttachmentFannedStack(X.AHD<com.facebook.aura.model.HatchAttachmentFile> r29, java.lang.String r30, X.BRg r31, com.facebook.aura.conversation.view.InlineContentCallbacks r32, X.BFM r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchAttachmentPresentationCardKt.VideoAttachmentFannedStack(X.AHD, java.lang.String, X.BRg, com.facebook.aura.conversation.view.InlineContentCallbacks, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void VideoAttachmentGrid(X.AHD<com.facebook.aura.model.HatchAttachmentFile> r21, java.lang.String r22, X.C1DM r23, X.BRg r24, com.facebook.aura.conversation.view.InlineContentCallbacks r25, X.BFM r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchAttachmentPresentationCardKt.VideoAttachmentGrid(X.AHD, java.lang.String, X.1DM, X.BRg, com.facebook.aura.conversation.view.InlineContentCallbacks, X.BFM, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void VideoAttachmentThumbnail(HatchAttachmentFile hatchAttachmentFile, String str, BRg bRg, InlineContentCallbacks inlineContentCallbacks, float f, boolean z, boolean z2, BFM bfm, int i, int i2) {
        float f2;
        Function0 function0;
        int iA1V;
        float f3 = f;
        boolean z3 = z;
        boolean z4 = z2;
        bfm.AgG(-90275136);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchAttachmentFile, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass002.A00(AnonymousClass004.A1a(inlineContentCallbacks, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A08(bfm, f3);
        }
        int i4 = i2 & 32;
        int iA0s = 196608;
        if (i4 != 0) {
            iA05 |= iA0s;
        } else if ((196608 & i) == 0) {
            iA0s = AnonymousClass004.A0s(bfm, z3);
            iA05 |= iA0s;
        }
        int i5 = i2 & 64;
        int iA0t = 1572864;
        if (i5 != 0) {
            iA05 |= iA0t;
        } else if ((1572864 & i) == 0) {
            iA0t = AnonymousClass004.A0t(bfm, z4);
            iA05 |= iA0t;
        }
        boolean z5 = true;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(599187 & iA05, 599186), bfm, iA05)) {
            if (i3 != 0) {
                f3 = 1.0f;
            }
            if (i4 != 0) {
                z3 = true;
            }
            if (i5 != 0) {
                z4 = false;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            boolean zA1K = AnonymousClass003.A1K(bfm, hatchAttachmentFile.path, abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                objAaT = AnonymousClass001.A0z(bfm, AuraMarkdownUrlResolversKt.resolveAuraMarkdownVideoThumbnails(hatchAttachmentFile.path, abstractC3358CGzA0h));
            }
            AHD ahd = (AHD) objAaT;
            boolean zA1K2 = AnonymousClass003.A1K(bfm, hatchAttachmentFile.path, abstractC3358CGzA0h);
            Object objAaT2 = bfm.AaT();
            if (zA1K2 || objAaT2 == C78N.A00) {
                objAaT2 = AuraMarkdownUrlResolversKt.resolveAttachmentRawUrl(hatchAttachmentFile, abstractC3358CGzA0h);
                bfm.Ai0(objAaT2);
            }
            String str2 = (String) objAaT2;
            String strA0U = FGI.A0U(FGI.A0M("lobster_media_", str), "_", str2);
            String str3 = hatchAttachmentFile.label;
            BRg bRgLongPressMediaTarget = z4 ? ChildPressTrackerKt.longPressMediaTarget(bRg, strA0U) : bRg;
            boolean z6 = hatchAttachmentFile.missing;
            G0V<String, String, Unit> g0v = inlineContentCallbacks.onVideoClick;
            if (g0v == null) {
                function0 = null;
                f2 = 0.0f;
                iA1V = AnonymousClass004.A1P(bfm, -735902527);
            } else {
                f2 = 0.0f;
                bfm.AgE(-735902526);
                boolean zA1K3 = AnonymousClass003.A1K(bfm, g0v, str2);
                if ((iA05 & 14) != 4 && ((iA05 & 8) == 0 || !bfm.A67(hatchAttachmentFile))) {
                    z5 = false;
                }
                boolean z7 = zA1K3 | z5;
                Object objAaT3 = bfm.AaT();
                if (z7 || objAaT3 == C78N.A00) {
                    objAaT3 = new HatchAttachmentPresentationCardKt$VideoAttachmentThumbnail$1$1$1(g0v, str2, hatchAttachmentFile);
                    bfm.Ai0(objAaT3);
                }
                function0 = (Function0) objAaT3;
                iA1V = AnonymousClass001.A1V(bfm);
            }
            HatchInlineImageKt.m678HatchInlineVideoThumbnailWSk2ftU(str2, str3, bRgLongPressMediaTarget, f2, ahd, z6, f3, function0, inlineContentCallbacks.onImageError, strA0U, z3, bfm, (3670016 & (iA05 << 6)) | 3072, (iA05 >> 15) & 14, iA1V);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114072(hatchAttachmentFile, str, bRg, inlineContentCallbacks, f3, z3, z4, i, i2);
        }
    }

    public static final float fannedStackScale(double d) {
        float f = FannedStackCardHeight;
        return f / ((FannedStackCardWidth * ((float) Math.sin(d))) + (((float) Math.cos(d)) * f));
    }

    public static final String sharedElementKeyPrefix(String str) {
        return FGI.A0M("lobster_media_", str);
    }
}
