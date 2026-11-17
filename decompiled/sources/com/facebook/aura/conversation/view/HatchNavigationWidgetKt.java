package com.facebook.aura.conversation.view;

import X.AEk;
import X.AKO;
import X.AKQ;
import X.ARD;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B18;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO4;
import X.BOI;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C01N;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C16Z;
import X.C1D3;
import X.C1D8;
import X.C1b8;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionEnumsKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.conversation.view.richcontent.CurrentChatThreadLogMetadataKt;
import com.facebook.aura.conversation.view.richcontent.LocalIsPrimaryThreadKt;
import com.facebook.aura.explore.view.cards.IdeaCardPreviewImageKt;
import com.facebook.aura.model.NavigationUiControl;
import com.facebook.aura.model.NavigationWidgetData;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.uicontrol.UiAction;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HatchNavigationWidgetKt {
    public static final C1D3 NavigationThumbnailShape = C1D8.A00(14.0f);
    public static final float NavigationThumbnailSize = 44.0f;

    /* renamed from: com.facebook.aura.conversation.view.HatchNavigationWidgetKt$HatchNavigationRow$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ NavigationWidgetData $data;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<NavigationUiControl, Unit> $onPerformUiControl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(NavigationWidgetData navigationWidgetData, G0U<? super NavigationUiControl, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$data = navigationWidgetData;
            this.$onPerformUiControl = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchNavigationWidgetKt.HatchNavigationRow(this.$data, this.$onPerformUiControl, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchNavigationWidgetKt$NavigationLeadingIcon$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $iconRes;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, BRg bRg, int i2, int i3) {
            super(2);
            this.$iconRes = i;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            HatchNavigationWidgetKt.NavigationLeadingIcon(this.$iconRes, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchNavigationWidgetKt$NavigationLeadingIcon$3, reason: invalid class name and case insensitive filesystem */
    public final class C115013 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $iconRes;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115013(int i, BRg bRg, int i2, int i3) {
            super(2);
            this.$iconRes = i;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            HatchNavigationWidgetKt.NavigationLeadingIcon(this.$iconRes, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchNavigationWidgetKt$NavigationRowText$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $summary;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$summary = str2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchNavigationWidgetKt.NavigationRowText(this.$title, this.$summary, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchNavigationWidgetKt$NavigationThumbnail$1, reason: invalid class name and case insensitive filesystem */
    public final class C115021 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $contentDescription;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $previewImageUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115021(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$previewImageUrl = str;
            this.$contentDescription = str2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchNavigationWidgetKt.NavigationThumbnail(this.$previewImageUrl, this.$contentDescription, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchNavigationWidgetKt$NavigationWidgetButton$2, reason: invalid class name and case insensitive filesystem */
    public final class C115032 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $cta;
        public final /* synthetic */ NavigationWidgetData $data;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<NavigationUiControl, Unit> $onPerformUiControl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C115032(NavigationWidgetData navigationWidgetData, String str, G0U<? super NavigationUiControl, Unit> g0u, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$data = navigationWidgetData;
            this.$cta = str;
            this.$onPerformUiControl = g0u;
            this.$modifier = bRg;
            this.$enabled = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchNavigationWidgetKt.NavigationWidgetButton(this.$data, this.$cta, this.$onPerformUiControl, this.$modifier, this.$enabled, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchNavigationWidgetKt$NavigationWidgetCardContent$3, reason: invalid class name and case insensitive filesystem */
    public final class C115043 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $cta;
        public final /* synthetic */ NavigationWidgetData $data;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<NavigationUiControl, Unit> $onPerformUiControl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C115043(NavigationWidgetData navigationWidgetData, String str, G0U<? super NavigationUiControl, Unit> g0u, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$data = navigationWidgetData;
            this.$cta = str;
            this.$onPerformUiControl = g0u;
            this.$modifier = bRg;
            this.$isLoading = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchNavigationWidgetKt.NavigationWidgetCardContent(this.$data, this.$cta, this.$onPerformUiControl, this.$modifier, this.$isLoading, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchNavigationWidgetKt$NavigationWidgetLeading$2, reason: invalid class name and case insensitive filesystem */
    public final class C115052 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ NavigationWidgetData $data;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115052(NavigationWidgetData navigationWidgetData, BRg bRg, int i, int i2) {
            super(2);
            this.$data = navigationWidgetData;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchNavigationWidgetKt.NavigationWidgetLeading(this.$data, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void NavigationWidgetLeading(NavigationWidgetData navigationWidgetData, BRg bRg, BFM bfm, int i, int i2) {
        UiAction uiAction;
        BRg bRg2 = bRg;
        bfm.AgG(1172114021);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(navigationWidgetData, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String str = navigationWidgetData.imagePath;
            if (str == null || str.length() == 0) {
                bfm.AgE(365024939);
                NavigationUiControl navigationUiControl = navigationWidgetData.uiControl;
                if (navigationUiControl == null || (uiAction = HatchNavigationUiControlKt.toUiAction(navigationUiControl)) == null) {
                    bfm.AgE(365024938);
                } else {
                    bfm.AgE(365024939);
                    NavigationLeadingIcon(HatchNavigationUiControlKt.navigationLeadingIconRes(uiAction), bRg2, bfm, iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0);
                }
                AnonymousClass001.A1D(bfm);
            } else {
                bfm.AgE(364842318);
                NavigationThumbnail(str, navigationWidgetData.title, bRg2, bfm, (iA05 << 3) & 896, 0);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C115052(navigationWidgetData, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchNavigationRow(com.facebook.aura.model.NavigationWidgetData r28, X.G0U<? super com.facebook.aura.model.NavigationUiControl, kotlin.Unit> r29, X.BRg r30, X.BFM r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchNavigationWidgetKt.HatchNavigationRow(com.facebook.aura.model.NavigationWidgetData, X.G0U, X.BRg, X.BFM, int, int):void");
    }

    /* renamed from: HatchNavigationWidget-TgFrcIs, reason: not valid java name */
    public static final void m658HatchNavigationWidgetTgFrcIs(NavigationWidgetData navigationWidgetData, G0U<? super NavigationUiControl, Unit> g0u, long j, C1D3 c1d3, BRg bRg, boolean z, boolean z2, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object hatchNavigationWidgetKt$HatchNavigationWidget$3;
        boolean z3 = z;
        boolean zA1K = z2;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(navigationWidgetData, 0);
        AnonymousClass002.A1B(g0u, 1, c1d3);
        bfm.AgG(871651210);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(navigationWidgetData, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0O(bfm, j);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, c1d3);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
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
            iA0t = AnonymousClass004.A0t(bfm, zA1K);
            iA05 |= iA0t;
        }
        if (AnonymousClass001.A1b(AnonymousClass007.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z3 = false;
            }
            zA1K = C3cG.A1K(i5, zA1K);
            if (HatchNavigationUiControlKt.isHiddenOnThisClient(navigationWidgetData)) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    hatchNavigationWidgetKt$HatchNavigationWidget$3 = new HatchNavigationWidgetKt$HatchNavigationWidget$1(navigationWidgetData, g0u, j, c1d3, bRg2, z3, zA1K, i, i2);
                    C3cG.A1D(bBbAAc, hatchNavigationWidgetKt$HatchNavigationWidget$3);
                }
                return;
            }
            String str = navigationWidgetData.cta;
            if (str == null || C7BY.A0j(str)) {
                bfm.AgE(-10190756);
                HatchNavigationRow(navigationWidgetData, g0u, C1b8.A01(C11U.A03(HatchMessageBubbleKt.m636bubbleMaxWidthrAjV9yQ(bRg2, 0.0f, bfm, (iA05 >> 12) & 14, 1), !z3 ? c1d3 : C1D8.A00(20.0f)), j), bfm, NavigationWidgetData.$stable | (iA05 & 14) | (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 0);
            } else {
                BRg bRgA09 = C3cG.A09(bfm, -10663103);
                if (!z3) {
                    bRgA09 = C3U4.A0D(C1b8.A03(bRgA09, c1d3, j), HatchMessageBubbleKt.BubbleInnerPadding);
                }
                NavigationWidgetCardContent(navigationWidgetData, str, g0u, AnonymousClass001.A0R(bRg2.then(bRgA09)), zA1K, bfm, NavigationWidgetData.$stable | (iA05 & 14) | ((iA05 << 3) & 896) | (57344 & (iA05 >> 6)), 0);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            hatchNavigationWidgetKt$HatchNavigationWidget$3 = new HatchNavigationWidgetKt$HatchNavigationWidget$3(navigationWidgetData, g0u, j, c1d3, bRg2, z3, zA1K, i, i2);
            C3cG.A1D(bBbAAc, hatchNavigationWidgetKt$HatchNavigationWidget$3);
        }
    }

    public static final void NavigationLeadingIcon(int i, BRg bRg, BFM bfm, int i2, int i3) {
        BBb bBbAAc;
        Object c115013;
        BRg bRg2 = bRg;
        bfm.AgG(-1409115137);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        int i4 = i3 & 2;
        if (i4 != 0) {
            iA0D |= 48;
        } else if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 19, 18), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            if (i == R.drawable.hatch_file_types_calendar_40) {
                bfm.AgE(61442348);
                AuraIconKt.m2567AuraIconFHprtrg(C10G.A07(bRg2, NavigationThumbnailSize), BOf.A00(bfm, i, iA0D & 14), AuraIconSize.LARGE, null, B6A.A07, null, bfm, (AVy.$stable << 3) | 28032, 32);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    c115013 = new AnonymousClass1(i, bRg2, i2, i3);
                    C3cG.A1D(bBbAAc, c115013);
                }
                return;
            }
            BBI bbiA0M = AnonymousClass002.A0M(bfm, 61679715);
            BRg bRgA03 = C11U.A03(C10G.A07(bRg2, NavigationThumbnailSize), NavigationThumbnailShape);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA01 = C1b8.A01(bRgA03, auraTheme.getColors(bfm, 6).elevated);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA02 = C3cG.A02(bbiA0M.A06);
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA012, iA02);
            AuraIconKt.m2567AuraIconFHprtrg(C10G.A07(BRg.A00, 20.0f), BOf.A00(bfm, i, iA0D & 14), AuraIconSize.X_SMALL, null, C3cH.A06(bfm, auraTheme), null, bfm, (AVy.$stable << 3) | 3462, 32);
            BBI.A0R(bbiA0M, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c115013 = new C115013(i, bRg2, i2, i3);
            C3cG.A1D(bBbAAc, c115013);
        }
    }

    public static final void NavigationRowText(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(696819204);
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
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).subheadlineEmphasized, null, null, null, false, 0, 3, 2, null, null, null, bfm, (iA0d & 14) | 805306368, 6, 14834);
            if (C7BY.A0j(str2)) {
                bfm.AgE(-2002754776);
            } else {
                C01N.A08(bfm, C3cG.A09(bfm, -2003024817), 2.0f);
                AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C3cH.A07(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 2, 2, null, null, null, bfm, ((iA0d >> 3) & 14) | 805306368, 6, 14834);
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

    public static final void NavigationWidgetButton(NavigationWidgetData navigationWidgetData, String str, G0U<? super NavigationUiControl, Unit> g0u, BRg bRg, boolean z, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1Q = z;
        bfm.AgG(-302981801);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(navigationWidgetData, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, g0u);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0r(bfm, zA1Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            zA1Q = C60Q.A1Q(i4, zA1Q);
            Map<String, String> mapCurrentChatThreadLogMetadata = CurrentChatThreadLogMetadataKt.currentChatThreadLogMetadata(bfm, 0);
            NavigationUiControl navigationUiControl = navigationWidgetData.uiControl;
            UiAction uiAction = navigationUiControl != null ? HatchNavigationUiControlKt.toUiAction(navigationUiControl) : null;
            BBI bbi = (BBI) bfm;
            HatchScreen hatchScreenChatScreen = HatchInteractionEnumsKt.chatScreen(AKO.A09(LocalIsPrimaryThreadKt.LocalIsPrimaryThread, bbi));
            AuraLabelButtonStyle auraLabelButtonStyleSecondary = AuraButtonStyles.INSTANCE.secondary(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            boolean zA1T = ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(navigationWidgetData))) | AnonymousClass001.A1T(bfm, mapCurrentChatThreadLogMetadata, AnonymousClass003.A1H(bfm, hatchScreenChatScreen, bfm.A67(uiAction))) | AnonymousClass004.A1K(iA05);
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new HatchNavigationWidgetKt$NavigationWidgetButton$1$1(uiAction, hatchScreenChatScreen, mapCurrentChatThreadLogMetadata, navigationWidgetData, g0u);
                BBI.A0O(bbi, objAaT);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, str, null, bRgA0R, auraLabelButtonStyleSecondary, auraButtonSize, null, false, false, zA1Q, false, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, AnonymousClass001.A06(iA05 << 15, (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 196608), 0, 0, 134200773);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C115032(navigationWidgetData, str, g0u, bRg2, zA1Q, i, i2);
        }
    }

    public static final void NavigationWidgetCardContent(NavigationWidgetData navigationWidgetData, String str, G0U<? super NavigationUiControl, Unit> g0u, BRg bRg, boolean z, BFM bfm, int i, int i2) {
        BBI bbiA07;
        BO4 bo4A01;
        BRg bRgA0X;
        BRg bRgA09;
        BRg bRg2 = bRg;
        boolean zA1K = z;
        bfm.AgG(1576329954);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(navigationWidgetData, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, g0u);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0r(bfm, zA1K);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            zA1K = C3cG.A1K(i4, zA1K);
            NavigationUiControl navigationUiControl = navigationWidgetData.uiControl;
            UiAction uiAction = navigationUiControl != null ? HatchNavigationUiControlKt.toUiAction(navigationUiControl) : null;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12086d);
            if (zA1K) {
                bfm.AgE(-726367968);
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                bo4A01 = BOI.A01(bfm, null, 0.0f, 252, auraTheme.getColors(bfm, 6).shimmeringBase, auraTheme.getColors(bfm, 6).shimmeringHighlight);
                bbiA07 = C3cG.A07(bfm);
                bRgA09 = C3cG.A09(bfm, -726086178);
                boolean zA65 = bfm.A65(strA01);
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new HatchNavigationWidgetKt$NavigationWidgetCardContent$1$1(strA01);
                    BBI.A0O(bbiA07, objAaT);
                }
                bRgA0X = AnonymousClass001.A0X(bRgA09, objAaT);
                BBI.A0R(bbiA07, false);
            } else {
                bfm.AgE(-726177381);
                bbiA07 = (BBI) bfm;
                BBI.A0R(bbiA07, false);
                bo4A01 = null;
                bfm.AgE(-1270341910);
                BBI.A0R(bbiA07, false);
                bRgA0X = BRg.A00;
                bRgA09 = bRgA0X;
            }
            BRg bRgThen = bRg2.then(bRgA0X);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, HatchInternalLinkActionCardKt.CardSpacing, 0);
            int iA0J = AnonymousClass003.A0J(bbiA07);
            AKQ akqA04 = BBI.A04(bbiA07);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbiA07.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA07, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            String str2 = navigationWidgetData.title;
            BRg bRgNavigationWidgetPlaceholder = navigationWidgetPlaceholder(bRgA09, bo4A01);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == C78N.A00) {
                objAaT2 = HatchNavigationWidgetKt$NavigationWidgetCardContent$2$1$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            HatchInternalLinkActionCardKt.InternalLinkCardHeader(str2, B1V.A00(bfm, new HatchNavigationWidgetKt$NavigationWidgetCardContent$2$2(navigationWidgetData), 657917274), B1V.A00(bfm, new HatchNavigationWidgetKt$NavigationWidgetCardContent$2$3(uiAction), -178877669), ARD.A01(bRgNavigationWidgetPlaceholder, (G0U) objAaT2, true), bfm, 432, 0);
            String str3 = navigationWidgetData.summary;
            if (C7BY.A0j(str3) || str3 == null) {
                bfm.AgE(-1381891351);
            } else {
                bfm.AgE(-1381891350);
                BRg bRgNavigationWidgetPlaceholder2 = navigationWidgetPlaceholder(bRgA09, bo4A01);
                AuraTheme auraTheme2 = AuraTheme.INSTANCE;
                AuraTextKt.m2639AuraTextUY9GdpU(str3, bRgNavigationWidgetPlaceholder2, C3cH.A06(bfm, auraTheme2), C3cH.A0C(bfm, auraTheme2), null, null, null, false, 0, 3, 2, null, null, null, bfm, 805306368, 6, 14832);
            }
            BBI.A0R(bbiA07, false);
            NavigationWidgetButton(navigationWidgetData, str, g0u, navigationWidgetPlaceholder(bRgA09, bo4A01), !zA1K, bfm, AnonymousClass002.A07(iA05, NavigationWidgetData.$stable | (iA05 & 14)), 0);
            BBI.A0R(bbiA07, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C115043(navigationWidgetData, str, g0u, bRg2, zA1K, i, i2);
        }
    }

    public static final void logNavigationWidgetClick(UiAction uiAction, HatchScreen hatchScreen, Map<String, String> map) {
        UiAction.NavigateScheduledTask navigateScheduledTask;
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.CHAT;
        HatchSubsurface hatchSubsurface = HatchSubsurface.MESSAGE_LIST;
        boolean z = uiAction instanceof UiAction.NavigateScheduledTask;
        HatchComponent hatchComponent = (z || C7384Etj.areEqual(uiAction, UiAction.NavigateScheduledTasks.INSTANCE)) ? HatchComponent.TASK_ACTION_BUTTON : HatchComponent.BROWSE_IDEAS;
        String str = null;
        if (z && (navigateScheduledTask = (UiAction.NavigateScheduledTask) uiAction) != null) {
            str = navigateScheduledTask.taskId;
        }
        hatchInteractionLogger.logClick(hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, str, map, null);
    }

    public static final BRg navigationWidgetPlaceholder(BRg bRg, BO4 bo4) {
        return bo4 != null ? AEk.A03(BOI.A00(bRg, C1D8.A00(8.0f), bo4), C115061.INSTANCE) : bRg;
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchNavigationWidgetKt$navigationWidgetPlaceholder$1, reason: invalid class name and case insensitive filesystem */
    public final class C115061 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
        public static final C115061 INSTANCE = new C115061();

        public C115061() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C16Z c16z) {
        }
    }

    public static final void NavigationThumbnail(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-1811996663);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            if (str != null) {
                bfm.AgE(-2043441826);
                IdeaCardPreviewImageKt.m795IdeaCardPreviewImageFV1VA1c(str, C11U.A03(C10G.A07(bRg, NavigationThumbnailSize), NavigationThumbnailShape), 0, B18.A00, str2, null, bfm, AnonymousClass001.A0B(iA0d << 9, (iA0d & 14) | 3072), 36);
            } else {
                bfm.AgE(-2043184092);
                C1b8.A04(bfm, C11U.A03(C10G.A07(bRg, NavigationThumbnailSize), NavigationThumbnailShape), C3cH.A0W(bfm).background);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C115021(str, str2, bRg, i, i2);
        }
    }
}
