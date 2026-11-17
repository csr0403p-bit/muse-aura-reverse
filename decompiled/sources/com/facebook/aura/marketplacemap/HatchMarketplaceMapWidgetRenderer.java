package com.facebook.aura.marketplacemap;

import X.AKO;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C1D3;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.G0U;
import X.G0V;
import com.facebook.aura.conversation.widget.api.ConversationWidgetContext;
import com.facebook.aura.conversation.widget.api.ConversationWidgetRenderer;
import com.facebook.aura.maps.intf.NativeMaps;
import com.facebook.aura.model.HatchWidget;
import com.facebook.aura.model.HatchWidgetData;
import com.facebook.aura.model.MarketplaceMapListing;
import com.facebook.aura.model.MarketplaceMapWidgetData;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchMarketplaceMapWidgetRenderer implements ConversationWidgetRenderer {
    public static final HatchMarketplaceMapWidgetRenderer INSTANCE = new HatchMarketplaceMapWidgetRenderer();

    /* renamed from: com.facebook.aura.marketplacemap.HatchMarketplaceMapWidgetRenderer$Render$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ ConversationWidgetContext $context;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchWidget $widget;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(HatchWidget hatchWidget, ConversationWidgetContext conversationWidgetContext, BRg bRg, int i) {
            super(2);
            this.$widget = hatchWidget;
            this.$context = conversationWidgetContext;
            this.$modifier = bRg;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMarketplaceMapWidgetRenderer.this.Render(this.$widget, this.$context, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationWidgetRenderer
    public boolean canRender(HatchWidget hatchWidget) {
        MarketplaceMapWidgetData marketplaceMapWidgetData;
        List<MarketplaceMapListing> list;
        C7384Etj.A0Y(hatchWidget, 0);
        HatchWidgetData hatchWidgetData = hatchWidget.data;
        return (!(hatchWidgetData instanceof MarketplaceMapWidgetData) || (marketplaceMapWidgetData = (MarketplaceMapWidgetData) hatchWidgetData) == null || (list = marketplaceMapWidgetData.listings) == null || !(list.isEmpty() ^ true) || NativeMaps.INSTANCE.getRenderer() == null) ? false : true;
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationWidgetRenderer
    public void Render(HatchWidget hatchWidget, ConversationWidgetContext conversationWidgetContext, BRg bRg, BFM bfm, int i) {
        BBb bBbAAc;
        Object anonymousClass4;
        MarketplaceMapWidgetData marketplaceMapWidgetData;
        AnonymousClass005.A10(hatchWidget, conversationWidgetContext, bRg);
        bfm.AgG(1768926424);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchWidget, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(conversationWidgetContext, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            HatchWidgetData hatchWidgetData = hatchWidget.data;
            if (!(hatchWidgetData instanceof MarketplaceMapWidgetData) || (marketplaceMapWidgetData = (MarketplaceMapWidgetData) hatchWidgetData) == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass4 = new HatchMarketplaceMapWidgetRenderer$Render$data$1(this, hatchWidget, conversationWidgetContext, bRg, i);
                    C3cG.A1D(bBbAAc, anonymousClass4);
                }
                return;
            }
            BBI bbi = (BBI) bfm;
            AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
            AbstractC3358CGz abstractC3358CGzA06 = AKO.A06(LocalUserSessionKt.LocalUserSession, bbi);
            MarketplaceMapRegistry companion = MarketplaceMapRegistry.Companion.getInstance(abstractC3358CGzA06);
            Object[] objArr = {companion, conversationWidgetContext.hostMessageId, hatchWidget.widgetId, marketplaceMapWidgetData};
            boolean zA67 = bfm.A67(companion);
            int i2 = iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            int i3 = iA05 & 14;
            boolean zA1V = AnonymousClass002.A1V(bfm, marketplaceMapWidgetData, zA67 | (i2 == 32 || ((iA05 & 64) != 0 && bfm.A67(conversationWidgetContext))), i3 == 4 || ((iA05 & 8) != 0 && bfm.A67(hatchWidget)));
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new HatchMarketplaceMapWidgetRenderer$Render$1$1(companion, conversationWidgetContext, hatchWidget, marketplaceMapWidgetData);
                BBI.A0O(bbi, objAaT);
            }
            C78e.A07(bfm, (G0U) objAaT, objArr);
            boolean zA1K = AnonymousClass003.A1K(bfm, conversationWidgetContext.sessionId, conversationWidgetContext.hostMessageId);
            Object objAaT2 = bfm.AaT();
            if (zA1K || objAaT2 == C78N.A00) {
                objAaT2 = new MarketplaceMapLogContext(conversationWidgetContext.sessionId, conversationWidgetContext.hostMessageId);
                BBI.A0O(bbi, objAaT2);
            }
            MarketplaceMapLogContext marketplaceMapLogContext = (MarketplaceMapLogContext) objAaT2;
            String str = conversationWidgetContext.hostMessageId;
            String str2 = hatchWidget.widgetId;
            long j = conversationWidgetContext.containerBackgroundColor;
            C1D3 c1d3 = conversationWidgetContext.containerShape;
            boolean zA1O = (i2 == 32 || ((iA05 & 64) != 0 && bfm.A67(conversationWidgetContext))) | C3cH.A1O(bfm, marketplaceMapLogContext, auraNavigatorA05, abstractC3358CGzA06);
            Object objAaT3 = bfm.AaT();
            if (zA1O || objAaT3 == C78N.A00) {
                objAaT3 = new HatchMarketplaceMapWidgetRenderer$Render$2$1(marketplaceMapLogContext, auraNavigatorA05, abstractC3358CGzA06, conversationWidgetContext);
                BBI.A0O(bbi, objAaT3);
            }
            G0V g0v = (G0V) objAaT3;
            boolean zA672 = bfm.A67(auraNavigatorA05) | (i2 == 32 || ((iA05 & 64) != 0 && bfm.A67(conversationWidgetContext))) | (i3 == 4 || ((iA05 & 8) != 0 && bfm.A67(hatchWidget)));
            Object objAaT4 = bfm.AaT();
            if (zA672 || objAaT4 == C78N.A00) {
                objAaT4 = new HatchMarketplaceMapWidgetRenderer$Render$3$1(auraNavigatorA05, conversationWidgetContext, hatchWidget);
                BBI.A0O(bbi, objAaT4);
            }
            HatchMarketplaceMapCardKt.m1440HatchMarketplaceMapCard8r3B23s(marketplaceMapWidgetData, str, str2, j, c1d3, g0v, (G0U) objAaT4, bRg.then(MarketplaceMapLoggingKt.rememberMarketplaceMapImpression(hatchWidget.widgetId, marketplaceMapLogContext, bfm, 0)), bfm, MarketplaceMapWidgetData.$stable, 0);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass4 = new AnonymousClass4(hatchWidget, conversationWidgetContext, bRg, i);
            C3cG.A1D(bBbAAc, anonymousClass4);
        }
    }
}
