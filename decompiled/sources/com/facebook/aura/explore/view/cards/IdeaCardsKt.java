package com.facebook.aura.explore.view.cards;

import X.AKH;
import X.AKQ;
import X.AQC;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.B18;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1419Aio;
import X.C1515AkP;
import X.C1822Arm;
import X.C1D3;
import X.C1D8;
import X.C1DI;
import X.C1DM;
import X.C1SA;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.explore.repo.IdeaCard;
import com.facebook.aura.explore.repo.IdeaCardExecutionState;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.button.AuraButtonCorner;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.common.AuraClickableCardKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class IdeaCardsKt {
    public static final float GlyphToContainerRatio = 0.45f;
    public static final C1D3 PillShape = C1D8.A00(16.0f);
    public static final int TitleMaxLines = 3;

    /* renamed from: com.facebook.aura.explore.view.cards.IdeaCardsKt$ActivatedCtaPill$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, int i, int i2) {
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
            IdeaCardsKt.ActivatedCtaPill(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.explore.view.cards.IdeaCardsKt$IdeaCardActions$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $actionLabel;
        public final /* synthetic */ IdeaCardExecutionState $executionState;
        public final /* synthetic */ boolean $isPreparingShare;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onExecuteClick;
        public final /* synthetic */ Function0<Unit> $onShareClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, IdeaCardExecutionState ideaCardExecutionState, Function0<Unit> function0, boolean z, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$actionLabel = str;
            this.$executionState = ideaCardExecutionState;
            this.$onShareClick = function0;
            this.$isPreparingShare = z;
            this.$onExecuteClick = function02;
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
            IdeaCardsKt.IdeaCardActions(this.$actionLabel, this.$executionState, this.$onShareClick, this.$isPreparingShare, this.$onExecuteClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.explore.view.cards.IdeaCardsKt$IdeaCardThumbnailRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C118612 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ IdeaIcon $icon;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $secondaryLabel;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118612(IdeaIcon ideaIcon, String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$icon = ideaIcon;
            this.$title = str;
            this.$secondaryLabel = str2;
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
            IdeaCardsKt.IdeaCardThumbnailRow(this.$icon, this.$title, this.$secondaryLabel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ActivatedCtaPill(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-2134016434);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AVy aVyA00 = BOf.A00(bfm, R.drawable.circle_check_wght400_outline_24, 0);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120251);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            C1419Aio c1419AioA0S = AnonymousClass002.A0S(C06G.A0H(bfm, akh));
            BRg bRgA07 = C10G.A07(bRg2, 40.0f);
            C1D3 c1d3 = PillShape;
            C1SA.A00(bfm, null, C3U4.A09(C1b8.A03(C11U.A03(bRgA07, c1d3), c1d3, AnonymousClass001.A0f(bfm, akh).highlight), 12.0f), c1419AioA0S, aVyA00, null, strA01, 0.0f, AVy.$stable, 56);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(bRg2, i, i2);
        }
    }

    public static final void IdeaCardActions(String str, IdeaCardExecutionState ideaCardExecutionState, Function0<Unit> function0, boolean z, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1310334231);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass005.A09(bfm, ideaCardExecutionState);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function02);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0d |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0d, 74898), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, ExploreSpec.buttonsRowTopPadding, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            if (str.length() > 0) {
                bfm.AgE(-611814888);
                if (ideaCardExecutionState == IdeaCardExecutionState.SUCCESS) {
                    bfm.AgE(-611768605);
                    ActivatedCtaPill(new AQC(C2VU.A01), bfm, 0, 0);
                } else {
                    bfm.AgE(-611667328);
                    AuraButtonKt.m2408AuraButtonnL3aKkM(null, str, null, c1062ATq, AuraButtonStyles.INSTANCE.secondary(AuraButtonCorner.PILL, bfm, 54, 0), AuraButtonSize.SMALL, null, false, false, false, AnonymousClass002.A1Z(ideaCardExecutionState, IdeaCardExecutionState.EXECUTING), false, null, null, function02, null, null, null, null, null, null, null, null, false, 1, true, 0, bfm, ((iA0d << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 199680, iA0d & 57344, 221184, 83868613);
                }
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-611270001);
            }
            BBI.A0R(bbi, false);
            if (function0 != null) {
                bfm.AgE(-611219409);
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12055a), null, c1062ATq, AuraButtonStyles.INSTANCE.secondary(AuraButtonCorner.PILL, bfm, 54, 0), AuraButtonSize.SMALL, null, false, false, false, z, false, null, null, function0, null, null, null, null, null, null, null, null, false, 1, true, 0, bfm, 199680, ((iA0d >> 9) & 14) | ((iA0d << 6) & 57344), 221184, 83868613);
            } else {
                bfm.AgE(-610844433);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, ideaCardExecutionState, function0, z, function02, bRg2, i, i2);
        }
    }

    /* renamed from: IdeaCardCompact-mxsUjTo, reason: not valid java name */
    public static final void m796IdeaCardCompactmxsUjTo(IdeaCard ideaCard, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, long j, C1DM c1dm, IdeaCardExecutionState ideaCardExecutionState, G0U<? super IdeaIcon, Unit> g0u, boolean z, BFM bfm, int i, int i2) {
        Function0 function03;
        BRg bRgA0Q = bRg;
        C1DM c1dm2 = c1dm;
        IdeaCardExecutionState ideaCardExecutionState2 = ideaCardExecutionState;
        G0U<? super IdeaIcon, Unit> g0u2 = g0u;
        boolean z2 = z;
        boolean zA1a = AnonymousClass002.A1a(ideaCard, function0);
        C7384Etj.A0Y(function02, 2);
        bfm.AgG(1948041492);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, ideaCard) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function02);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRgA0Q);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0Q(bfm, j);
        }
        int i4 = i2 & 32;
        int iA0i = 196608;
        if (i4 != 0) {
            iA0T |= iA0i;
        } else if ((i & 196608) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, c1dm2);
            iA0T |= iA0i;
        }
        int i5 = i2 & 64;
        int iA0I = 1572864;
        if (i5 != 0) {
            iA0T |= iA0I;
        } else if ((i & 1572864) == 0) {
            iA0I = AnonymousClass004.A0I(bfm, AnonymousClass003.A0M(ideaCardExecutionState2));
            iA0T |= iA0I;
        }
        int i6 = i2 & 128;
        int iA0a = 12582912;
        if (i6 != 0) {
            iA0T |= iA0a;
        } else if ((i & 12582912) == 0) {
            iA0a = AnonymousClass004.A0a(bfm, g0u2);
            iA0T |= iA0a;
        }
        int i7 = i2 & 256;
        int iA0v = 100663296;
        if (i7 != 0) {
            iA0T |= iA0v;
        } else if ((i & 100663296) == 0) {
            iA0v = AnonymousClass004.A0v(bfm, z2);
            iA0T |= iA0v;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1G(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            if (i4 != 0) {
                c1dm2 = null;
            }
            if (i5 != 0) {
                ideaCardExecutionState2 = IdeaCardExecutionState.IDLE;
            }
            if (i6 != 0) {
                g0u2 = null;
            }
            if (i7 != 0) {
                z2 = false;
            }
            IdeaIcon ideaIconRememberIdeaIcon = IdeaPreviewImageUrlsKt.rememberIdeaIcon(ideaCard.ideaCardId, ideaCard.iconUrl, ideaCard.iconMimeType, null, bfm, 0, 8);
            BRg bRgA09 = C3U4.A09(AuraClickableCardKt.m2509auraClickableCardYQRRFTQ(C11U.A04(AnonymousClass001.A0R(bRgA0Q), c1dm2 == null ? ExploreSpec.cardShape : c1dm2, j), function0, null, 0, null), 16.0f);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            long j2 = bbi.A06;
            int i8 = (int) (j2 ^ (j2 >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function04 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function04);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i8);
            G0U<InterfaceC1516AkQ, Unit> g0u3 = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u3);
            IdeaCardThumbnailRow(ideaIconRememberIdeaIcon, ideaCard.title, ideaCard.secondaryLabel, null, bfm, IdeaIcon.$stable, 8);
            BS0 bs0 = BRg.A00;
            float f = ExploreSpec.buttonsRowTopPadding;
            C01N.A08(bfm, bs0, f);
            String str = ideaCard.summary;
            C1822Arm c1822ArmA0T = C06G.A0T(bfm);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A0L(bfm, akh), c1822ArmA0T, null, null, null, false, 0, 4, 2, null, null, null, bfm, 805306368, 6, 14834);
            String str2 = ideaCard.displayBadgeText;
            if (str2 != null) {
                bfm.AgE(1478513835);
                C01N.A08(bfm, bs0, f);
                BRg bRgA0V = AnonymousClass001.A0V(bs0, 40.0f);
                long j3 = AnonymousClass001.A0f(bfm, akh).highlight;
                C1D3 c1d3 = PillShape;
                BRg bRgA0B = C3U4.A0B(C1DI.A02(C1b8.A03(bRgA0V, c1d3, j3), c1d3, 1.0f, C06G.A0E(bfm, akh)), 20.0f, 10.0f);
                InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, C2VU.A04, 4.0f);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA0B);
                AnonymousClass005.A0n(bfm, bbi, function04);
                BPg.A02(bfm, interfaceC1380AiAA0V, g0v);
                BPg.A02(bfm, akqA042, g0v2);
                AnonymousClass003.A15(g0u3, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.aura_clipboard_16, 0), AuraIconSize.TINY, null, C06G.A0G(bfm, akh), null, bfm, AnonymousClass001.A04(), 33);
                AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C06G.A06(bfm), AnonymousClass002.A0f(bfm).subheadlineEmphasized, null, null, null, false, 0, zA1a ? 1 : 0, 2, null, null, null, bfm, 805306368, 6, 14834);
                BBI.A0R(bbi, zA1a);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1479583428);
                BBI.A0R(bbi, false);
            }
            if (ideaCard.actionLabel.length() > 0 || g0u2 != null) {
                bfm.AgE(1479658107);
                C01N.A08(bfm, bs0, f);
                String str3 = ideaCard.actionLabel;
                if (g0u2 == null) {
                    bfm.AgE(1479870115);
                    BBI.A0R(bbi, false);
                    function03 = null;
                } else {
                    bfm.AgE(1479870116);
                    boolean zA1J = AnonymousClass003.A1J(bfm, g0u2, ideaIconRememberIdeaIcon);
                    Object objAaT = bfm.AaT();
                    if (zA1J || objAaT == C78N.A00) {
                        objAaT = new IdeaCardsKt$IdeaCardCompact$1$2$1$1(g0u2, ideaIconRememberIdeaIcon);
                        bfm.Ai0(objAaT);
                    }
                    function03 = (Function0) objAaT;
                    BBI.A0R(bbi, false);
                }
                IdeaCardActions(str3, ideaCardExecutionState2, function03, z2, function02, null, bfm, ((iA0T >> 15) & 7280) | (57344 & (iA0T << 6)), 32);
            } else {
                bfm.AgE(1480005028);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new IdeaCardsKt$IdeaCardCompact$2(ideaCard, function0, function02, bRgA0Q, j, c1dm2, ideaCardExecutionState2, g0u2, z2, i, i2);
        }
    }

    public static final void IdeaCardThumbnailRow(IdeaIcon ideaIcon, String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(824317731);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(ideaIcon, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, str2);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0W, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            m797IdeaIconThumbnail942rkJo(ideaIcon, str, 40.0f, null, bfm, IdeaIcon.$stable | 384 | (iA05 & 14) | (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 8);
            BS0 bs0 = BRg.A00;
            C01N.A09(bfm, bs0, ExploreSpec.articleRowGap);
            BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A0C(bfm), C06G.A0V(bfm), null, null, null, false, 0, 3, 2, null, null, null, bfm, AnonymousClass005.A01(iA05 >> 3), 6, 14834);
            if (str2 == null || C7BY.A0j(str2)) {
                bfm.AgE(361706361);
            } else {
                bfm.AgE(361467072);
                AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C06G.A08(bfm), C01N.A01(bfm, bs0, ExploreSpec.eyebrowTitleSpacing).footnoteRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            }
            AnonymousClass002.A10(bbi, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C118612(ideaIcon, str, str2, bRg2, i, i2);
        }
    }

    /* renamed from: IdeaIconThumbnail-942rkJo, reason: not valid java name */
    public static final void m797IdeaIconThumbnail942rkJo(IdeaIcon ideaIcon, String str, float f, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> ideaCardsKt$IdeaIconThumbnail$3;
        BRg bRg2 = bRg;
        bfm.AgG(-815399661);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(ideaIcon, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A06(bfm, f);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (ideaIcon != null && ideaIcon.isColorIcon) {
                bfm.AgE(763909808);
                IdeaCardPreviewImageKt.m795IdeaCardPreviewImageFV1VA1c(ideaIcon.url, C10G.A07(bRg2, f), 0, B18.A02, str, null, bfm, (57344 & (iA05 << 9)) | 3072, 36);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    ideaCardsKt$IdeaIconThumbnail$3 = new IdeaCardsKt$IdeaIconThumbnail$1(ideaIcon, str, f, bRg2, i, i2);
                    bBbAAc.A06 = ideaCardsKt$IdeaIconThumbnail$3;
                }
                return;
            }
            BBI bbiA0M = AnonymousClass002.A0M(bfm, 764124111);
            BRg bRgA07 = C10G.A07(BRg.A00, 0.45f * f);
            BRg bRgA01 = C11U.A01(C10G.A07(bRg2, f), ExploreSpec.thumbnailCornerRadius);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            BRg bRgA012 = C1b8.A01(bRgA01, AnonymousClass001.A0f(bfm, akh).elevated);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            long j = bbiA0M.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA013 = AxM.A01(bfm, bRgA012);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA013, i4);
            if (ideaIcon != null) {
                bfm.AgE(-2048413747);
                IdeaCardPreviewImageKt.m795IdeaCardPreviewImageFV1VA1c(ideaIcon.url, bRgA07, 0, B18.A02, str, new B6A(C06G.A0G(bfm, akh)), bfm, (57344 & (iA05 << 9)) | 3072, 4);
            } else {
                bfm.AgE(-2048143737);
                AuraIconKt.m2567AuraIconFHprtrg(bRgA07, BOf.A00(bfm, R.drawable.aura_lightbulb_outline, 0), AuraIconSize.SMALL, null, C06G.A0G(bfm, akh), null, bfm, AnonymousClass001.A04(), 32);
            }
            AnonymousClass003.A0q(bbiA0M);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            ideaCardsKt$IdeaIconThumbnail$3 = new IdeaCardsKt$IdeaIconThumbnail$3(ideaIcon, str, f, bRg2, i, i2);
            bBbAAc.A06 = ideaCardsKt$IdeaIconThumbnail$3;
        }
    }
}
