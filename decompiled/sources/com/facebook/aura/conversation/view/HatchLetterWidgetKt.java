package com.facebook.aura.conversation.view;

import X.AGE;
import X.AGN;
import X.AKH;
import X.AKO;
import X.AKQ;
import X.ASj;
import X.AYD;
import X.AaC;
import X.AbstractC1996Aw5;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B08;
import X.B18;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06I;
import X.C0z7;
import X.C10G;
import X.C11U;
import X.C1335AhM;
import X.C1515AkP;
import X.C1736ApY;
import X.C1822Arm;
import X.C19U;
import X.C1BO;
import X.C1D8;
import X.C1DG;
import X.C1DI;
import X.C1DM;
import X.C1EQ;
import X.C1OM;
import X.C1b8;
import X.C2HU;
import X.C2VU;
import X.C31t;
import X.C3U4;
import X.C3Ue;
import X.C3cG;
import X.C3cH;
import X.C60P;
import X.C7384Etj;
import X.C78N;
import X.C8j4;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.HDi;
import X.HxS;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.ui.Alignment;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.gateway.HatchFileOperations;
import com.facebook.aura.model.HatchWidget;
import com.facebook.aura.model.LetterWidgetData;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HatchLetterWidgetKt {
    public static final AbstractC1996Aw5 CaveatFamily;
    public static final String DefaultLetterEmoji = "\u1f98b";
    public static final long LetterAccent;
    public static final int LetterHoverAnimationDurationMillis = 350;
    public static final long LetterInk;
    public static final long LetterInkSoft;
    public static final float LetterOuterBottomMargin;
    public static final float LetterOuterTopMargin;
    public static final long LetterPaper;
    public static final C1EQ LetterPaperBrush;
    public static final long LetterPaperEdge;
    public static final float LetterPaperHoverShadowAlpha = 0.48f;
    public static final float LetterPaperHoverShadowElevation;
    public static final float LetterPaperShadowAlpha = 0.42f;
    public static final float LetterPaperShadowElevation;
    public static final long LetterStampBackground;
    public static final long LetterTape;
    public static final float LetterViewportLift;
    public static final AKH<AaC> LocalLetterScrollViewportBounds;
    public static final float LetterWidth = 255.0f;
    public static final float LetterPadding = 22.5f;
    public static final float LetterCornerRadius = 3.75f;
    public static final float LetterStampSize = 36.0f;
    public static final float LetterTitleRightInset = 42.0f;
    public static final float LetterBodyLineHeight = 2.25f;
    public static final float LetterBodyLineSpacing = 8.25f;
    public static final float LetterContentWidth = 210.0f;
    public static final float LetterStickerTopMargin = 16.5f;
    public static final float LetterStickerBottomMargin = 3.0f;
    public static final float LetterStickerPadding = 4.5f;
    public static final float LetterStickerCornerRadius = 10.5f;
    public static final float LetterStickerWidth = 168.0f;
    public static final float LetterImageWidth = 159.0f;
    public static final float LetterImageHeight = 90.1f;
    public static final float LetterTapeWidth = 58.5f;
    public static final float LetterTapeHeight = 15.0f;
    public static final float LetterTapeOffset = -12.0f;

    /* renamed from: com.facebook.aura.conversation.view.HatchLetterWidgetKt$HatchLetterWidget$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ LetterWidgetData $data;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Boolean> $onOpenBriefing;
        public final /* synthetic */ Function0<Unit> $onSetOpened;
        public final /* synthetic */ HatchWidget $widget;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(HatchWidget hatchWidget, LetterWidgetData letterWidgetData, BRg bRg, G0U<? super String, Boolean> g0u, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.$widget = hatchWidget;
            this.$data = letterWidgetData;
            this.$modifier = bRg;
            this.$onOpenBriefing = g0u;
            this.$onSetOpened = function0;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchLetterWidgetKt.HatchLetterWidget(this.$widget, this.$data, this.$modifier, this.$onOpenBriefing, this.$onSetOpened, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchLetterWidgetKt$LetterBodyLine$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ float $widthFraction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f, int i) {
            super(2);
            this.$widthFraction = f;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchLetterWidgetKt.LetterBodyLine(this.$widthFraction, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchLetterWidgetKt$LetterBodyLines$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i) {
            super(2);
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchLetterWidgetKt.LetterBodyLines(bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchLetterWidgetKt$LetterBodyViewImage$2, reason: invalid class name and case insensitive filesystem */
    public final class C114832 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $lifted;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $path;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114832(String str, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$path = str;
            this.$lifted = z;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchLetterWidgetKt.LetterBodyViewImage(this.$path, this.$lifted, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchLetterWidgetKt$LetterPaperCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C114842 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $byline;
        public final /* synthetic */ String $emoji;
        public final /* synthetic */ String $imagePath;
        public final /* synthetic */ boolean $paperLifted;
        public final /* synthetic */ boolean $previewLifted;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114842(boolean z, boolean z2, String str, String str2, String str3, String str4, int i) {
            super(2);
            this.$paperLifted = z;
            this.$previewLifted = z2;
            this.$emoji = str;
            this.$title = str2;
            this.$byline = str3;
            this.$imagePath = str4;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchLetterWidgetKt.LetterPaperCard(this.$paperLifted, this.$previewLifted, this.$emoji, this.$title, this.$byline, this.$imagePath, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchLetterWidgetKt$LetterStamp$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $emoji;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$emoji = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchLetterWidgetKt.LetterStamp(this.$emoji, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    static {
        long j = 4294702828L << 32;
        long j2 = B6A.A01;
        LetterPaper = j;
        long j3 = 4294043603L << 32;
        LetterPaperEdge = j3;
        LetterInk = 4282004524L << 32;
        LetterInkSoft = 4285490517L << 32;
        LetterAccent = 4288963135L << 32;
        LetterStampBackground = 4294966774L << 32;
        LetterTape = 1555074906 << 32;
        LetterPaperBrush = new C1335AhM(AnonymousClass004.A17(C60P.A04(j), j3), null, 0, 0L, 9187343241974906880L);
        LetterOuterTopMargin = 12.0f;
        LetterOuterBottomMargin = 6.0f;
        LetterViewportLift = 3.0f;
        LetterPaperShadowElevation = 15.0f;
        LetterPaperHoverShadowElevation = 21.0f;
        CaveatFamily = B08.A00(C1736ApY.A04, R.font.caveat_wght);
        LocalLetterScrollViewportBounds = new AGN(AGE.A00, HatchLetterWidgetKt$LocalLetterScrollViewportBounds$1.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchLetterWidget(com.facebook.aura.model.HatchWidget r51, com.facebook.aura.model.LetterWidgetData r52, X.BRg r53, X.G0U<? super java.lang.String, java.lang.Boolean> r54, kotlin.jvm.functions.Function0<kotlin.Unit> r55, X.BFM r56, int r57, int r58) {
        /*
            Method dump skipped, instructions count: 823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchLetterWidgetKt.HatchLetterWidget(com.facebook.aura.model.HatchWidget, com.facebook.aura.model.LetterWidgetData, X.BRg, X.G0U, kotlin.jvm.functions.Function0, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchLetterWidget$updateViewportLift(X.AaC r1, androidx.compose.runtime.MutableState<java.lang.Boolean> r2, X.AaC r3) {
        /*
            if (r3 == 0) goto Lb
            if (r1 == 0) goto Lb
            boolean r0 = isLetterInViewportMiddleThird(r3, r1)
            r1 = 1
            if (r0 != 0) goto Lc
        Lb:
            r1 = 0
        Lc:
            boolean r0 = androidx.compose.runtime.MutableState.A0A(r2)
            if (r0 == r1) goto L15
            androidx.compose.runtime.MutableState.A09(r1, r2)
        L15:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchLetterWidgetKt.HatchLetterWidget$updateViewportLift(X.AaC, androidx.compose.runtime.MutableState, X.AaC):void");
    }

    public static final void LetterBodyViewImage(String str, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object c114832;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(851641726);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BBI bbi = (BBI) bfm;
            String strBuildAuthenticatedRawImageUrl = HatchFileOperations.INSTANCE.buildAuthenticatedRawImageUrl(str, AKO.A06(LocalUserSessionKt.LocalUserSession, bbi));
            if (strBuildAuthenticatedRawImageUrl == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c114832 = new HatchLetterWidgetKt$LetterBodyViewImage$resolvedUri$1(str, z, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, c114832);
                }
                return;
            }
            C1BO c1boA01 = C31t.A01(new ASj(C2HU.A01, 350, 0), bfm, z ? 0.0f : -3.0f, 3120, 20);
            BRg bRgA0C = C3U4.A0C(C10G.A08(bRg2, LetterContentWidth), 0.0f, LetterStickerTopMargin, 0.0f, LetterStickerBottomMargin);
            Alignment alignment = C2VU.A0C;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA01);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BS0 bs0 = BRg.A00;
            BRg bRgA08 = C10G.A08(bs0, LetterStickerWidth);
            boolean zA65 = bfm.A65(c1boA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchLetterWidgetKt$LetterBodyViewImage$1$1$1(c1boA01);
                BBI.A0O(bbi, objAaT);
            }
            BRg bRgA0W = AnonymousClass001.A0W(bRgA08, objAaT);
            long j = B6A.A08;
            float f = LetterStickerCornerRadius;
            BRg bRgA03 = C1b8.A03(bRgA0W, C1D8.A00(f), j);
            long j2 = LetterInk;
            BRg bRgA09 = C3U4.A09(C1DI.A02(bRgA03, C1D8.A00(f), 1.0f, HxS.A04(HDi.A0O[(int) (j2 & 63)], B6A.A03(j2), B6A.A02(j2), B6A.A01(j2), 0.05f)), LetterStickerPadding);
            Alignment alignment2 = C2VU.A0E;
            InterfaceC1380AiA interfaceC1380AiAA012 = C3Ue.A01(alignment2, false);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA09);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA012, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            C0z7 c0z7 = C0z7.A00;
            BRg bRgA013 = C11U.A01(C10G.A04(C10G.A08(bs0, LetterImageWidth), LetterImageHeight), 6.75f);
            InterfaceC1380AiA interfaceC1380AiAA013 = C3Ue.A01(alignment2, false);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA014 = AxM.A01(bfm, bRgA013);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA013, g0vA0v);
            BPg.A02(bfm, akqA043, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA014, g0vA0u);
            AuraImageKt.m2573AuraImageXRP3Ue8(strBuildAuthenticatedRawImageUrl, C10G.A01, B18.A00, null, null, false, null, 0L, false, false, false, null, null, null, null, bfm, 3504, 0, 32752);
            BBI.A0R(bbi, true);
            BRg bRgA015 = AYD.A01(c0z7.A4C(alignment, C10G.A04(C10G.A08(bs0, LetterTapeWidth), LetterTapeHeight)), 0.0f, LetterTapeOffset);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == C78N.A00) {
                objAaT2 = HatchLetterWidgetKt$LetterBodyViewImage$1$2$2$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            C1b8.A04(bfm, AnonymousClass001.A0W(bRgA015, objAaT2), LetterTape);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c114832 = new C114832(str, z, bRg2, i, i2);
            C3cG.A1D(bBbAAc, c114832);
        }
    }

    public static final void LetterStamp(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0P = bRg;
        bfm.AgG(-1260773965);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRgA0P);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0P = BRg.A00;
            }
            BRg bRgA07 = C10G.A07(bRgA0P, LetterStampSize);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchLetterWidgetKt$LetterStamp$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0W = AnonymousClass001.A0W(bRgA07, objAaT);
            long j = LetterStampBackground;
            C1DM c1dm = C1OM.A00;
            BRg bRgA03 = C1b8.A03(bRgA0W, c1dm, j);
            long j2 = LetterInk;
            BRg bRgA02 = C1DI.A02(bRgA03, c1dm, 1.0f, HxS.A04(HDi.A0O[(int) (j2 & 63)], B6A.A03(j2), B6A.A02(j2), B6A.A01(j2), 0.16f));
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA02);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, j2, C1822Arm.A00(null, C8j4.A0l(bfm).bodyMedium, null, null, null, null, null, null, null, null, 0, 0, 0, 16646141, 0L, C19U.A03(15), 0L, C19U.A03(15)), null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0d & 14) | 384, 0, 16370);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(str, bRgA0P, i, i2);
        }
    }

    public static final AKH<AaC> getLocalLetterScrollViewportBounds() {
        return LocalLetterScrollViewportBounds;
    }

    public static final boolean isLetterInViewportMiddleThird(AaC aaC, AaC aaC2) {
        float f = aaC2.A00;
        float f2 = aaC2.A03;
        float f3 = f - f2;
        if (f3 <= 0.0f) {
            return false;
        }
        float f4 = aaC.A00;
        float f5 = aaC.A03;
        float f6 = f4 - f5;
        if (f6 > 0.0f) {
            return Math.min(f4, f2 + ((f3 * 2.0f) / 3.0f)) - Math.max(f5, f2 + (f3 / 3.0f)) >= f6 * 0.5f;
        }
        return false;
    }

    public static final void logLetterCardClick(HatchScreen hatchScreen, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, hatchScreen, HatchComponent.LETTER_CARD, null, map, null);
    }

    public static final float HatchLetterWidget$lambda$12(C1BO<C1DG> c1bo) {
        return c1bo.getValue().A00;
    }

    public static final void LetterBodyLine(float f, BFM bfm, int i) {
        bfm.AgG(1444323342);
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 3, 2), bfm, iA04)) {
            BRg bRgA03 = C10G.A03(BRg.A00, f);
            float f2 = LetterBodyLineHeight;
            BRg bRgA01 = C11U.A01(C10G.A04(bRgA03, f2), f2);
            long j = LetterInk;
            C1b8.A04(bfm, bRgA01, HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.13f));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(f, i);
        }
    }

    public static final void LetterBodyLines(BFM bfm, int i) {
        bfm.AgG(24767725);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            C9m9 c9m9A00 = AcQ.A00(LetterBodyLineSpacing);
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, C2VU.A02, 6);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bs0);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            LetterBodyLine(1.0f, bfm, 6);
            LetterBodyLine(0.9f, bfm, 6);
            LetterBodyLine(0.64f, bfm, 6);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014a  */
    /* JADX WARN: Type inference failed for: r2v16, types: [androidx.compose.runtime.snapshots.Snapshot] */
    /* JADX WARN: Type inference failed for: r2v70, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v78, types: [androidx.compose.runtime.snapshots.Snapshot] */
    /* JADX WARN: Type inference failed for: r73v0, types: [X.BFM, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.facebook.aura.conversation.view.HatchLetterWidgetKt$LetterPaperCard$shadowElevation$2] */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.facebook.aura.conversation.view.HatchLetterWidgetKt$LetterPaperCard$shadowAlpha$2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LetterPaperCard(boolean r67, boolean r68, java.lang.String r69, java.lang.String r70, java.lang.String r71, java.lang.String r72, X.BFM r73, int r74) {
        /*
            Method dump skipped, instructions count: 962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchLetterWidgetKt.LetterPaperCard(boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.BFM, int):void");
    }

    public static final float LetterPaperCard$lambda$1(C1BO<C1DG> c1bo) {
        return c1bo.getValue().A00;
    }
}
