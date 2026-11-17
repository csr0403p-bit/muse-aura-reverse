package com.facebook.aura.conversation.view;

import X.AGH;
import X.AHD;
import X.AKQ;
import X.AbstractC0885AGm;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1D3;
import X.C1D8;
import X.C2VU;
import X.C3U4;
import X.C78N;
import X.C7BY;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.conversation.view.HatchIdeaCardRow;
import com.facebook.aura.conversation.view.richcontent.CurrentChatThreadLogMetadataKt;
import com.facebook.aura.explore.view.cards.IdeaCardsKt;
import com.facebook.aura.explore.view.cards.IdeaIcon;
import com.facebook.aura.explore.view.cards.IdeaPreviewImageUrlsKt;
import com.facebook.aura.model.IdeaWidgetData;
import com.facebook.aura.model.NavigationUiControl;
import com.facebook.aura.model.NavigationWidgetData;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.common.AuraClickableCardKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchIdeaRowCardKt {
    public static final C1D3 CardShape = C1D8.A00(20.0f);
    public static final float RowHorizontalPadding = 14.0f;
    public static final float RowVerticalPadding = 12.0f;
    public static final float ThumbnailSize = 44.0f;
    public static final float ThumbnailTextSpacing = 12.0f;
    public static final float TitleSummarySpacing = 2.0f;

    /* renamed from: com.facebook.aura.conversation.view.HatchIdeaRowCardKt$HatchIdeaRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $absolutePosition;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ HatchIdeaCardRow.Idea $row;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchIdeaCardRow.Idea idea, int i, Function0<Unit> function0, BRg bRg, int i2, int i3) {
            super(2);
            this.$row = idea;
            this.$absolutePosition = i;
            this.$onClick = function0;
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
            HatchIdeaRowCardKt.HatchIdeaRow(this.$row, this.$absolutePosition, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchIdeaRowCardKt$IdeaLeadingThumbnail$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ IdeaWidgetData $idea;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(IdeaWidgetData ideaWidgetData, BRg bRg, int i, int i2) {
            super(2);
            this.$idea = ideaWidgetData;
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
            HatchIdeaRowCardKt.IdeaLeadingThumbnail(this.$idea, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchIdeaRow(HatchIdeaCardRow.Idea idea, int i, Function0<Unit> function0, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(-768729301);
        int iA05 = (i2 & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(idea, bfm, i2) ? 1 : 0) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA05 |= AnonymousClass004.A0E(bfm, i);
        }
        if ((i2 & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function0);
        }
        int i4 = i3 & 8;
        if (i4 != 0) {
            iA05 |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0B = C3U4.A0B(AuraClickableCardKt.m2509auraClickableCardYQRRFTQ(AnonymousClass001.A0R(HatchImpressionModifierKt.hatchImpression(bRg2, HatchOrigin.CHAT, HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchScreen.MAIN_CHAT, HatchComponent.IDEA_CARD, null, AnonymousClass006.A10(HatchMetadataKey.IDEA_CARD_ID.getValue(), idea.data.ideaId), Integer.valueOf(i), 500L, 0.0f, null, null, null)), function0, null, 0, null), RowHorizontalPadding, RowVerticalPadding);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i5 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0W, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i5);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            IdeaWidgetData ideaWidgetData = idea.data;
            BS0 bs0 = BRg.A00;
            IdeaLeadingThumbnail(ideaWidgetData, c90m.A4D(C2VU.A05, bs0), bfm, IdeaWidgetData.$stable, 0);
            C01N.A07(bfm, C10G.A08(bs0, ThumbnailTextSpacing));
            BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(idea.getTitle(), null, C06G.A0C(bfm), AnonymousClass002.A0f(bfm).subheadlineEmphasized, null, null, null, false, 0, 3, 2, null, null, null, bfm, 805306368, 6, 14834);
            if (C7BY.A0j(idea.getSummary())) {
                bfm.AgE(1036989457);
            } else {
                bfm.AgE(1036683859);
                C01N.A08(bfm, bs0, TitleSummarySpacing);
                AuraTextKt.m2639AuraTextUY9GdpU(idea.getSummary(), null, C06G.A08(bfm), C06G.A0Z(bfm), null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14834);
            }
            AnonymousClass002.A10(bbi, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(idea, i, function0, bRg2, i2, i3);
        }
    }

    /* renamed from: HatchIdeaRowCard-FHprtrg, reason: not valid java name */
    public static final void m607HatchIdeaRowCardFHprtrg(AHD<? extends HatchIdeaCardRow> ahd, G0U<? super IdeaWidgetData, Unit> g0u, G0U<? super NavigationUiControl, Unit> g0u2, BRg bRg, long j, C1D3 c1d3, BFM bfm, int i, int i2) {
        C1D3 c1d32;
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> hatchIdeaRowCardKt$HatchIdeaRowCard$3;
        C1D3 c1d33 = c1d3;
        BRg bRg2 = bRg;
        boolean zA1Z = AnonymousClass005.A1Z(ahd, g0u, g0u2);
        bfm.AgG(266684585);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(ahd, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, g0u2);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0Q(bfm, j);
        }
        int i4 = i2 & 32;
        int iA0i = 196608;
        if (i4 != 0) {
            iA05 |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, c1d33);
            iA05 |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                c1d33 = null;
            }
            Map<String, String> mapCurrentChatThreadLogMetadata = CurrentChatThreadLogMetadataKt.currentChatThreadLogMetadata(bfm, 0);
            if (ahd.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    hatchIdeaRowCardKt$HatchIdeaRowCard$3 = new HatchIdeaRowCardKt$HatchIdeaRowCard$1(ahd, g0u, g0u2, bRg2, j, c1d33, i, i2);
                    bBbAAc.A06 = hatchIdeaRowCardKt$HatchIdeaRowCard$3;
                }
                return;
            }
            c1d32 = c1d33;
            BRg bRgM636bubbleMaxWidthrAjV9yQ = HatchMessageBubbleKt.m636bubbleMaxWidthrAjV9yQ(bRg2, 0.0f, bfm, (iA05 >> 9) & 14, zA1Z ? 1 : 0);
            if (c1d33 == null) {
                c1d33 = CardShape;
            }
            BRg bRgA04 = C11U.A04(bRgM636bubbleMaxWidthrAjV9yQ, c1d33, j);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            long j2 = bbi.A06;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA04);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
            } else {
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, i5);
                Iterator itA0w = AnonymousClass001.A0w(bfm, ahd, 560168095);
                int i6 = 0;
                while (itA0w.hasNext()) {
                    Object next = itA0w.next();
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        AbstractC0885AGm.A14();
                    } else {
                        HatchIdeaCardRow hatchIdeaCardRow = (HatchIdeaCardRow) next;
                        if (i6 > 0) {
                            bfm.AgE(1377355507);
                            BS0 bs0 = BRg.A00;
                            float f = RowHorizontalPadding;
                            AuraDividerKt.AuraRowDivider(C3U4.A0C(bs0, ThumbnailSize + f + ThumbnailTextSpacing, 0.0f, f, 0.0f), bfm, 6, 0);
                        } else {
                            bfm.AgE(1377601523);
                        }
                        BBI.A0R(bbi, false);
                        if (hatchIdeaCardRow instanceof HatchIdeaCardRow.Idea) {
                            bfm.AgE(321535858);
                            HatchIdeaCardRow.Idea idea = (HatchIdeaCardRow.Idea) hatchIdeaCardRow;
                            boolean zA1V = AnonymousClass002.A1V(bfm, mapCurrentChatThreadLogMetadata, bfm.A67(hatchIdeaCardRow), bfm.A63(i6)) | AnonymousClass003.A1C(iA05);
                            Object objAaT = bfm.AaT();
                            if (zA1V || objAaT == C78N.A00) {
                                objAaT = new HatchIdeaRowCardKt$HatchIdeaRowCard$2$1$1$1(hatchIdeaCardRow, i6, mapCurrentChatThreadLogMetadata, g0u);
                                bfm.Ai0(objAaT);
                            }
                            HatchIdeaRow(idea, i6, (Function0) objAaT, null, bfm, IdeaWidgetData.$stable, 8);
                        } else {
                            if (!(hatchIdeaCardRow instanceof HatchIdeaCardRow.Navigation)) {
                                throw AnonymousClass003.A0k(bfm, bbi, 321534106);
                            }
                            bfm.AgE(321545723);
                            HatchNavigationWidgetKt.HatchNavigationRow(((HatchIdeaCardRow.Navigation) hatchIdeaCardRow).data, g0u2, null, bfm, NavigationWidgetData.$stable | ((iA05 >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 4);
                        }
                        BBI.A0R(bbi, false);
                        i6 = i7;
                    }
                }
                BBI.A0R(bbi, false);
                BBI.A0R(bbi, zA1Z);
            }
            throw F60.createAndThrow();
        }
        bfm.Afo();
        c1d32 = c1d33;
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            hatchIdeaRowCardKt$HatchIdeaRowCard$3 = new HatchIdeaRowCardKt$HatchIdeaRowCard$3(ahd, g0u, g0u2, bRg2, j, c1d32, i, i2);
            bBbAAc.A06 = hatchIdeaRowCardKt$HatchIdeaRowCard$3;
        }
    }

    public static final void logIdeaRowClick(String str, int i, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchScreen.MAIN_CHAT, HatchComponent.IDEA_CARD, null, AGH.A02(map, AnonymousClass007.A0d(HatchMetadataKey.ABSOLUTE_POSITION.getValue(), String.valueOf(i), AnonymousClass006.A12(HatchMetadataKey.IDEA_CARD_ID, str))), null);
    }

    public static final void IdeaLeadingThumbnail(IdeaWidgetData ideaWidgetData, BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(897031718);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(ideaWidgetData, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            IdeaCardsKt.m797IdeaIconThumbnail942rkJo(IdeaPreviewImageUrlsKt.rememberIdeaIcon(ideaWidgetData.ideaId, ideaWidgetData.iconUrl, ideaWidgetData.iconMimeType, null, bfm, 0, 8), ideaWidgetData.title, ThumbnailSize, bRg, bfm, IdeaIcon.$stable | 384 | ((iA05 << 6) & 7168), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(ideaWidgetData, bRg, i, i2);
        }
    }
}
