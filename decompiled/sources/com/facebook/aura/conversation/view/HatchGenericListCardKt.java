package com.facebook.aura.conversation.view;

import X.AKH;
import X.AKQ;
import X.AbstractC05051Yk;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AcQ;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00r;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C0dm;
import X.C0dx;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1AC;
import X.C1YD;
import X.C1Yw;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C7196Ei8;
import X.C7197Ei9;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1072AWd;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC8647Fhz;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.conversation.view.RowIcon;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.library.repo.WorkspaceEntry;
import com.facebook.aura.model.ExternalLinkPresentationJsonKt;
import com.facebook.aura.model.FlightRowData;
import com.facebook.aura.model.GenericListRow;
import com.facebook.aura.model.HatchAttachmentFile;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.opengraph.HatchWebPageMetadata;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.common.AuraDrawableSourceResource;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchGenericListCardKt {
    public static final float CardPadding = 16.0f;
    public static final float CardVerticalPadding = 16.0f - 10.0f;
    public static final float HeaderBottomSpacing = 4.0f;
    public static final float HeaderSpacing = 4.0f;
    public static final int HeaderSubtitleMaxLines = 4;
    public static final C7197Ei9 ROW_ICON_FIT;
    public static final C7197Ei9 ROW_IMAGE_CENTER_CROP;
    public static final float RowFallbackGlyphSize = 24.0f;
    public static final float RowIconArtworkSize = 24.0f;
    public static final float RowIconCornerRadius = 10.0f;
    public static final float RowIconSize = 40.0f;
    public static final float RowMinHeight = 48.0f;
    public static final float RowMonogramLetterSize = 18.0f;
    public static final float RowSpacing = 12.0f;
    public static final float RowTextSpacing = 2.0f;
    public static final float RowVerticalPadding = 10.0f;
    public static final int SubtitleMaxLines = 3;
    public static final int TitleMaxLines = 3;

    /* renamed from: com.facebook.aura.conversation.view.HatchGenericListCardKt$GenericListHeader$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$subtitle = str2;
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
            HatchGenericListCardKt.GenericListHeader(this.$title, this.$subtitle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchGenericListCardKt$GenericListRowIcon$2, reason: invalid class name and case insensitive filesystem */
    public final class C114692 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ GenericListRow $row;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114692(GenericListRow genericListRow, BRg bRg, int i, int i2) {
            super(2);
            this.$row = genericListRow;
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
            HatchGenericListCardKt.GenericListRowIcon(this.$row, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchGenericListCardKt$RowMonogram$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $letter;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$letter = str;
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
            HatchGenericListCardKt.RowMonogram(this.$letter, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final String monogramLetter(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isLetterOrDigit(cCharAt)) {
                return AnonymousClass006.A0q(cCharAt);
            }
        }
        return "";
    }

    static {
        C7197Ei9 c7197Ei9 = C7197Ei9.A0P;
        ROW_IMAGE_CENTER_CROP = AnonymousClass005.A0Z(c7197Ei9);
        C7196Ei8 c7196Ei8 = new C7196Ei8(c7197Ei9);
        c7196Ei8.A00(InterfaceC8647Fhz.A05);
        ROW_ICON_FIT = new C7197Ei9(c7196Ei8);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0220  */
    /* renamed from: DefaultGenericListCard-NpZTi58, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m602DefaultGenericListCardNpZTi58(com.facebook.aura.model.GenericListPresentation r42, java.lang.String r43, java.lang.String r44, com.facebook.aura.model.JSONState r45, long r46, X.C1D3 r48, com.facebook.aura.conversation.view.InlineContentCallbacks r49, X.BRg r50, X.BFM r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 815
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchGenericListCardKt.m602DefaultGenericListCardNpZTi58(com.facebook.aura.model.GenericListPresentation, java.lang.String, java.lang.String, com.facebook.aura.model.JSONState, long, X.1D3, com.facebook.aura.conversation.view.InlineContentCallbacks, X.BRg, X.BFM, int, int):void");
    }

    public static final void GenericListHeader(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1872556930);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
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
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(HeaderSpacing), bfm, C2VU.A02, 6);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A0C(bfm), C06G.A0V(bfm), null, null, null, false, 0, 1, 2, null, null, null, bfm, (iA0d & 14) | 805306368, 6, 14834);
            if (str2 == null) {
                bfm.AgE(1047031454);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C06G.A08(bfm), AnonymousClass006.A0k(bfm, 1047031455).footnoteRegular, null, null, null, false, 0, 4, 2, null, null, null, bfm, 805306368, 6, 14834);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, str2, bRg2, i, i2);
        }
    }

    /* renamed from: GenericListItemRow-uDo3WH8, reason: not valid java name */
    public static final void m603GenericListItemRowuDo3WH8(GenericListRow genericListRow, boolean z, InlineContentCallbacks inlineContentCallbacks, long j, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> hatchGenericListCardKt$GenericListItemRow$4;
        Function0 function0;
        BRg bRg2;
        BRg bRgA01;
        BRg bRg3 = bRg;
        bfm.AgG(-1044704914);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, genericListRow) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass003.A05(AnonymousClass004.A1Z(inlineContentCallbacks, bfm, i) ? 1 : 0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0P(bfm, j);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg3);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg3 = BRg.A00;
            }
            FlightRowData flightRowData = genericListRow.flight;
            if (flightRowData != null) {
                bfm.AgE(-1470871786);
                BRg bRg4 = bRg3;
                HatchFlightListRowKt.m600HatchFlightListRowsW7UJKQ(flightRowData, j, bRg4, null, bfm, (iA0d >> 6) & 1008, 8);
                AnonymousClass002.A19(bfm);
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    hatchGenericListCardKt$GenericListItemRow$4 = new HatchGenericListCardKt$GenericListItemRow$1$1(genericListRow, z, inlineContentCallbacks, j, bRg4, i, i2);
                    bBbAAc.A06 = hatchGenericListCardKt$GenericListItemRow$4;
                }
                return;
            }
            bfm.AgE(-1470871787);
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            Context contextA0H = AnonymousClass002.A0H(bfm);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            String str = genericListRow.type;
            if ("link".equals(str)) {
                bfm.AgE(-1470503382);
                String str2 = genericListRow.url;
                if (str2 == null) {
                    bfm.AgE(-1470503383);
                    BBI.A0R(bbi, false);
                    function0 = null;
                } else {
                    boolean zA1Y = AnonymousClass005.A1Y(bfm, contextA0H, auraNavigatorA0b, AnonymousClass001.A1Z(abstractC3358CGzA0h, bfm, -1470503382), bfm.A65(str2));
                    Object objAaT = bfm.AaT();
                    if (zA1Y || objAaT == C78N.A00) {
                        objAaT = new HatchGenericListCardKt$GenericListItemRow$onClick$1$1$1(abstractC3358CGzA0h, str2, contextA0H, auraNavigatorA0b);
                        bfm.Ai0(objAaT);
                    }
                    function0 = (Function0) objAaT;
                    BBI.A0R(bbi, false);
                }
                BBI.A0R(bbi, false);
            } else if ("file".equals(str)) {
                bfm.AgE(-1470149021);
                HatchAttachmentFile hatchAttachmentFile = genericListRow.file;
                if (hatchAttachmentFile == null) {
                    bfm.AgE(-1470149022);
                    BBI.A0R(bbi, false);
                    function0 = null;
                } else {
                    bfm.AgE(-1470149021);
                    G0V<String, String, Unit> g0v = inlineContentCallbacks.onFileClick;
                    if (g0v == null) {
                        bfm.AgE(856316036);
                        BBI.A0R(bbi, false);
                        function0 = null;
                    } else {
                        boolean zA1T = AnonymousClass004.A1T(bfm, hatchAttachmentFile, abstractC3358CGzA0h, AnonymousClass001.A1Y(g0v, bfm, 856316037));
                        Object objAaT2 = bfm.AaT();
                        if (zA1T || objAaT2 == C78N.A00) {
                            objAaT2 = new HatchGenericListCardKt$GenericListItemRow$onClick$2$1$1$1(g0v, hatchAttachmentFile, abstractC3358CGzA0h);
                            bfm.Ai0(objAaT2);
                        }
                        function0 = (Function0) objAaT2;
                        BBI.A0R(bbi, false);
                    }
                    BBI.A0R(bbi, false);
                }
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-1469900433);
                BBI.A0R(bbi, false);
                function0 = null;
            }
            Object objAaT3 = bfm.AaT();
            Object obj = C78N.A00;
            InterfaceC1072AWd interfaceC1072AWd = (InterfaceC1072AWd) AnonymousClass004.A16(bfm, objAaT3, obj);
            C0dx c0dxA0T = AnonymousClass002.A0T(bfm);
            BRg bRgA09 = C10G.A09(AnonymousClass001.A0R(bRg3), Float.NaN, RowMinHeight);
            if (function0 == null) {
                bfm.AgE(1060972246);
                BBI.A0R(bbi, false);
                bRgA01 = BRg.A00;
                bRg2 = bRgA01;
            } else {
                bfm.AgE(1060974587);
                BS0 bs0 = BRg.A00;
                bRg2 = bs0;
                C1Yw c1Yw = AbstractC05051Yk.A01;
                C1Yw c1YwA01 = AbstractC05051Yk.A01(Float.NaN, B6A.A07, true);
                C1YD c1yd = new C1YD(0);
                boolean zA1N = AnonymousClass003.A1N(bfm, c0dxA0T, function0);
                Object objAaT4 = bfm.AaT();
                if (zA1N || objAaT4 == obj) {
                    objAaT4 = new HatchGenericListCardKt$GenericListItemRow$2$1(c0dxA0T, function0);
                    bfm.Ai0(objAaT4);
                }
                bRgA01 = C0v5.A01(c1YwA01, interfaceC1072AWd, bs0, c1yd, null, (Function0) objAaT4, true);
                BBI.A0R(bbi, false);
            }
            BRg bRgA0B = C3U4.A0B(bRgA09.then(bRgA01), CardPadding, RowVerticalPadding);
            C9m9 c9m9A00 = AcQ.A00(RowSpacing);
            C1AC c1ac = C2VU.A04;
            InterfaceC1380AiA interfaceC1380AiAA0b = AnonymousClass001.A0b(c9m9A00, bfm, c1ac);
            long j2 = bbi.A06;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v2 = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0b, g0v2);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v3 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v3, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA012, g0u);
            C90m c90m = C90m.A00;
            if (z) {
                bfm.AgE(445464997);
                GenericListRowIcon(genericListRow, null, bfm, iA0d & 14, 2);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(445506320);
                BBI.A0R(bbi, false);
            }
            BRg bRgAiP = c90m.AiP(bRg2, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, RowTextSpacing, 6);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0X, g0v2);
            BPg.A02(bfm, akqA042, g0v3);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA013, g0vA0u);
            String str3 = genericListRow.title;
            C1822Arm c1822ArmA0V = C06G.A0V(bfm);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            AuraTextKt.m2639AuraTextUY9GdpU(str3, null, C06G.A0L(bfm, akh), c1822ArmA0V, null, null, null, false, 0, 3, 2, null, null, null, bfm, 805306368, 6, 14834);
            String str4 = genericListRow.subtitle;
            if (str4 == null) {
                bfm.AgE(-1192484268);
                BBI.A0R(bbi, false);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(str4, null, C06G.A0I(bfm, akh), AnonymousClass006.A0k(bfm, -1192484267).footnoteRegular, null, null, null, false, 0, 3, 2, null, null, null, bfm, 805306368, 6, 14834);
                BBI.A0R(bbi, false);
            }
            String str5 = genericListRow.tertiaryTitle;
            if (str5 == null) {
                bfm.AgE(-1192197208);
                BBI.A0R(bbi, false);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(str5, null, AnonymousClass001.A0f(bfm, akh).tertiaryText, AnonymousClass006.A0k(bfm, -1192197207).caption1Regular, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            if (function0 != null) {
                bfm.AgE(446557964);
                AuraIconKt.m2567AuraIconFHprtrg(c90m.A4D(c1ac, bRg2), BOf.A00(bfm, R.drawable.chevron_right_wght400_outline_24, 0), AuraIconSize.X_SMALL, null, AnonymousClass001.A0f(bfm, akh).tertiaryText, null, bfm, AnonymousClass001.A04(), 32);
            } else {
                bfm.AgE(446844528);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            hatchGenericListCardKt$GenericListItemRow$4 = new HatchGenericListCardKt$GenericListItemRow$4(genericListRow, z, inlineContentCallbacks, j, bRg3, i, i2);
            bBbAAc.A06 = hatchGenericListCardKt$GenericListItemRow$4;
        }
    }

    public static final void GenericListRowIcon(GenericListRow genericListRow, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(630156117);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, genericListRow) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            boolean zA65 = bfm.A65(genericListRow.imageUrl);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = AnonymousClass005.A0S(bfm, false);
            }
            MutableState mutableState = (MutableState) objAaT;
            boolean zA652 = bfm.A65(genericListRow.iconUrl);
            Object objAaT2 = bfm.AaT();
            if (zA652 || objAaT2 == C78N.A00) {
                objAaT2 = AnonymousClass005.A0S(bfm, false);
            }
            MutableState mutableState2 = (MutableState) objAaT2;
            boolean zA653 = bfm.A65(genericListRow.url);
            Object objAaT3 = bfm.AaT();
            if (zA653 || objAaT3 == C78N.A00) {
                objAaT3 = AnonymousClass002.A0O(bfm, 0);
            }
            C00r c00r = (C00r) objAaT3;
            int i4 = iA0d & 14;
            RowIcon rowIconRowIconFor = rowIconFor(genericListRow, MutableState.A0A(mutableState), MutableState.A0A(mutableState2), (String) AbstractC0878AGe.A0A(c00r.AGd(), rememberLinkImages(genericListRow, bfm, i4)), bfm, i4);
            BRg bRgA01 = C11U.A01(C10G.A07(bRg2, RowIconSize), RowIconCornerRadius);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            BRg bRgA012 = C1b8.A01(bRgA01, C06G.A0K(bfm, akh));
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA012);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA013, iA0J);
            if (rowIconRowIconFor instanceof RowIcon.Image) {
                bfm.AgE(-428721149);
                String str = ((RowIcon.Image) rowIconRowIconFor).url;
                C1062ATq c1062ATq = C10G.A01;
                C7197Ei9 c7197Ei9 = ROW_IMAGE_CENTER_CROP;
                boolean zA654 = bfm.A65(mutableState);
                Object objAaT4 = bfm.AaT();
                if (zA654 || objAaT4 == C78N.A00) {
                    objAaT4 = new HatchGenericListCardKt$GenericListRowIcon$1$1$1(mutableState);
                    bfm.Ai0(objAaT4);
                }
                AuraImageKt.AuraImage(str, c1062ATq, c7197Ei9, null, null, false, null, (Function0) objAaT4, true, null, bfm, 102239280, 560);
            } else if (rowIconRowIconFor instanceof RowIcon.IconImage) {
                bfm.AgE(-428378878);
                String str2 = ((RowIcon.IconImage) rowIconRowIconFor).url;
                BRg bRgA07 = C10G.A07(BRg.A00, RowIconArtworkSize);
                C7197Ei9 c7197Ei92 = ROW_ICON_FIT;
                boolean zA655 = bfm.A65(mutableState2);
                Object objAaT5 = bfm.AaT();
                if (zA655 || objAaT5 == C78N.A00) {
                    objAaT5 = new HatchGenericListCardKt$GenericListRowIcon$1$2$1(mutableState2);
                    bfm.Ai0(objAaT5);
                }
                AuraImageKt.AuraImage(str2, bRgA07, c7197Ei92, null, null, false, null, (Function0) objAaT5, true, null, bfm, 102239280, 560);
            } else if (rowIconRowIconFor instanceof RowIcon.LinkImage) {
                bfm.AgE(-428035739);
                String str3 = ((RowIcon.LinkImage) rowIconRowIconFor).url;
                C1062ATq c1062ATq2 = C10G.A01;
                C7197Ei9 c7197Ei93 = ROW_IMAGE_CENTER_CROP;
                boolean zA656 = bfm.A65(c00r);
                Object objAaT6 = bfm.AaT();
                if (zA656 || objAaT6 == C78N.A00) {
                    objAaT6 = new HatchGenericListCardKt$GenericListRowIcon$1$3$1(c00r);
                    bfm.Ai0(objAaT6);
                }
                AuraImageKt.AuraImage(str3, c1062ATq2, c7197Ei93, null, null, false, null, (Function0) objAaT6, true, null, bfm, 102239280, 560);
            } else if (rowIconRowIconFor instanceof RowIcon.FileType) {
                bfm.AgE(1648771155);
                AuraImageKt.AuraImage(new AuraDrawableSourceResource(((RowIcon.FileType) rowIconRowIconFor).res), C10G.A01, null, null, false, false, null, false, null, bfm, 48, 508);
            } else if (rowIconRowIconFor instanceof RowIcon.Glyph) {
                bfm.AgE(1648776749);
                AuraDrawableSourceResource auraDrawableSourceResource = new AuraDrawableSourceResource(((RowIcon.Glyph) rowIconRowIconFor).res);
                BRg bRgA072 = C10G.A07(BRg.A00, RowFallbackGlyphSize);
                C7196Ei8 c7196Ei8 = new C7196Ei8(C7197Ei9.A0P);
                AuraImageKt.m2576auraTintColor4WTKRHQ(c7196Ei8, C06G.A0H(bfm, akh));
                AuraImageKt.AuraImage(auraDrawableSourceResource, bRgA072, null, new C7197Ei9(c7196Ei8), false, false, null, false, null, bfm, 48, 500);
            } else {
                if (!(rowIconRowIconFor instanceof RowIcon.Monogram)) {
                    throw AnonymousClass003.A0k(bfm, bbi, 1648733573);
                }
                bfm.AgE(1648787600);
                RowMonogram(((RowIcon.Monogram) rowIconRowIconFor).letter, null, bfm, 0, 2);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114692(genericListRow, bRg2, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0143  */
    /* JADX WARN: Type inference failed for: r23v8, types: [X.1DM] */
    /* renamed from: HatchGenericListCard-mwpFuRA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m604HatchGenericListCardmwpFuRA(com.facebook.aura.model.GenericListPresentation r27, java.lang.String r28, java.lang.String r29, com.facebook.aura.model.JSONState r30, java.lang.String r31, X.BRg r32, long r33, X.C1D3 r35, com.facebook.aura.conversation.view.InlineContentCallbacks r36, X.BFM r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchGenericListCardKt.m604HatchGenericListCardmwpFuRA(com.facebook.aura.model.GenericListPresentation, java.lang.String, java.lang.String, com.facebook.aura.model.JSONState, java.lang.String, X.BRg, long, X.1D3, com.facebook.aura.conversation.view.InlineContentCallbacks, X.BFM, int, int):void");
    }

    public static final void RowMonogram(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1503708605);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            bfm.AgE(-1954954831);
            C0dm c0dm = (C0dm) bfm.A6v(Am0.A04);
            C1822Arm c1822ArmA0U = C06G.A0U(bfm);
            float f = RowMonogramLetterSize;
            C1822Arm c1822ArmA00 = C1822Arm.A00(null, c1822ArmA0U, null, null, null, null, null, null, null, null, 0, 0, 0, 16646141, 0L, c0dm.Ah7(f), 0L, c0dm.Ah7(f));
            AnonymousClass001.A1D(bfm);
            AuraTextKt.m2639AuraTextUY9GdpU(str, bRg2, C06G.A08(bfm), c1822ArmA00, null, null, null, false, 0, 1, 0, null, null, null, bfm, AnonymousClass005.A01(iA0d) | (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 0, 15856);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(str, bRg2, i, i2);
        }
    }

    public static final boolean isWebUrl(String str) {
        C7384Etj.A0Y(str, 0);
        return AnonymousClass006.A1b(ExternalLinkPresentationJsonKt.HTTP_SCHEME_PREFIX, str) || AnonymousClass006.A1b("https://", str);
    }

    public static final void logRowClick() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchScreen.MAIN_CHAT, HatchComponent.GENERIC_LIST_ROW, null, null, null);
    }

    public static final /* synthetic */ HatchWebPageMetadata access$rememberLinkImages$lambda$3(MutableState mutableState) {
        return (HatchWebPageMetadata) mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<java.lang.String> rememberLinkImages(com.facebook.aura.model.GenericListRow r5, X.BFM r6, int r7) {
        /*
            r0 = -871177511(0xffffffffcc12e2d9, float:-3.8505316E7)
            r6.AgE(r0)
            java.lang.String r4 = r5.url
            if (r4 == 0) goto L7d
            java.lang.String r1 = r5.type
            java.lang.String r0 = "link"
            boolean r0 = r0.equals(r1)
            r5 = 0
            if (r0 == 0) goto L7d
            boolean r0 = isWebUrl(r4)
            if (r0 == 0) goto L7d
            X.CGz r1 = X.AnonymousClass002.A0h(r6)
            boolean r0 = r6.A65(r1)
            java.lang.Object r3 = r6.AaT()
            if (r0 != 0) goto L2d
            java.lang.Object r0 = X.C78N.A00
            if (r3 != r0) goto L36
        L2d:
            com.facebook.aura.opengraph.HatchOpenGraphRepository$Companion r0 = com.facebook.aura.opengraph.HatchOpenGraphRepository.Companion
            com.facebook.aura.opengraph.HatchOpenGraphRepository r3 = r0.getInstance(r1)
            r6.Ai0(r3)
        L36:
            com.facebook.aura.opengraph.HatchOpenGraphRepository r3 = (com.facebook.aura.opengraph.HatchOpenGraphRepository) r3
            boolean r0 = r6.A65(r4)
            java.lang.Object r2 = r6.AaT()
            if (r0 != 0) goto L46
            java.lang.Object r0 = X.C78N.A00
            if (r2 != r0) goto L4e
        L46:
            com.facebook.aura.opengraph.HatchWebPageMetadata r0 = r3.cachedMetadata(r4)
            androidx.compose.runtime.ParcelableSnapshotMutableState r2 = X.AnonymousClass004.A11(r6, r0)
        L4e:
            androidx.compose.runtime.MutableState r2 = (androidx.compose.runtime.MutableState) r2
            boolean r0 = r6.A65(r2)
            boolean r1 = X.AnonymousClass003.A1O(r6, r3, r4, r0)
            java.lang.Object r0 = r6.AaT()
            if (r1 != 0) goto L62
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L6a
        L62:
            com.facebook.aura.conversation.view.HatchGenericListCardKt$rememberLinkImages$1$1 r0 = new com.facebook.aura.conversation.view.HatchGenericListCardKt$rememberLinkImages$1$1
            r0.<init>(r3, r4, r2, r5)
            r6.Ai0(r0)
        L6a:
            X.AnonymousClass001.A18(r6, r0, r4)
            java.lang.Object r0 = r2.getValue()
            com.facebook.aura.opengraph.HatchWebPageMetadata r0 = (com.facebook.aura.opengraph.HatchWebPageMetadata) r0
            if (r0 == 0) goto L7d
            X.AHD<java.lang.String> r0 = r0.imageCandidates
            if (r0 == 0) goto L7d
        L79:
            X.AnonymousClass002.A19(r6)
            return r0
        L7d:
            X.AGi r0 = X.C0881AGi.A00
            goto L79
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchGenericListCardKt.rememberLinkImages(com.facebook.aura.model.GenericListRow, X.BFM, int):java.util.List");
    }

    public static final RowIcon rowIconFor(GenericListRow genericListRow, boolean z, boolean z2, String str, BFM bfm, int i) {
        BBI bbi;
        boolean z3;
        RowIcon monogram;
        String str2;
        RowIcon iconImage;
        bfm.AgE(-172720038);
        String str3 = genericListRow.imageUrl;
        if (str3 == null || z) {
            String str4 = genericListRow.iconUrl;
            if (str4 == null || z2) {
                String str5 = genericListRow.type;
                if ("file".equals(str5)) {
                    bfm.AgE(1519780495);
                    HatchFileUIUtils hatchFileUIUtils = HatchFileUIUtils.INSTANCE;
                    WorkspaceEntry.EntryType entryType = WorkspaceEntry.EntryType.FILE;
                    HatchAttachmentFile hatchAttachmentFile = genericListRow.file;
                    monogram = new RowIcon.FileType(hatchFileUIUtils.getWorkspaceEntryIconRes(entryType, (hatchAttachmentFile == null || (str2 = hatchAttachmentFile.path) == null) ? null : hatchFileUIUtils.fileExtensionForPath(str2), bfm, 390));
                    bbi = (BBI) bfm;
                    z3 = false;
                    BBI.A0R(bbi, false);
                } else if ("link".equals(str5)) {
                    bfm.AgE(1519788588);
                    bbi = (BBI) bfm;
                    z3 = false;
                    BBI.A0R(bbi, false);
                    monogram = str != null ? new RowIcon.LinkImage(str) : new RowIcon.Glyph(R.drawable.link_outline_24_wght400);
                } else {
                    bfm.AgE(1519792829);
                    bbi = (BBI) bfm;
                    z3 = false;
                    BBI.A0R(bbi, false);
                    monogram = new RowIcon.Monogram(monogramLetter(genericListRow.title));
                }
                RowIcon rowIcon = monogram;
                BBI.A0R(bbi, z3);
                return rowIcon;
            }
            iconImage = new RowIcon.IconImage(str4);
        } else {
            iconImage = new RowIcon.Image(str3);
        }
        AnonymousClass002.A19(bfm);
        return iconImage;
    }
}
