package com.facebook.aura.spaces.conversation;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C1D3;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.conversation.widget.api.ConversationWidgetContext;
import com.facebook.aura.conversation.widget.api.ConversationWidgetRenderer;
import com.facebook.aura.model.HatchWidget;
import com.facebook.aura.model.HatchWidgetData;
import com.facebook.aura.model.SpaceBuildCompletedPresentation;
import com.facebook.aura.model.SpaceBuildCompletedWidgetData;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class SpaceBuildCompletedWidgetRenderer implements ConversationWidgetRenderer {
    public static final SpaceBuildCompletedWidgetRenderer INSTANCE = new SpaceBuildCompletedWidgetRenderer();

    /* renamed from: com.facebook.aura.spaces.conversation.SpaceBuildCompletedWidgetRenderer$Render$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ ConversationWidgetContext $context;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchWidget $widget;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchWidget hatchWidget, ConversationWidgetContext conversationWidgetContext, BRg bRg, int i) {
            super(2);
            this.$widget = hatchWidget;
            this.$context = conversationWidgetContext;
            this.$modifier = bRg;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceBuildCompletedWidgetRenderer.this.Render(this.$widget, this.$context, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationWidgetRenderer
    public boolean canRender(HatchWidget hatchWidget) {
        C7384Etj.A0Y(hatchWidget, 0);
        return hatchWidget.data instanceof SpaceBuildCompletedWidgetData;
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationWidgetRenderer
    public void Render(HatchWidget hatchWidget, ConversationWidgetContext conversationWidgetContext, BRg bRg, BFM bfm, int i) {
        G0V<? super BFM, ? super Integer, Unit> anonymousClass2;
        BBb bBbAAc;
        SpaceBuildCompletedWidgetData spaceBuildCompletedWidgetData;
        AnonymousClass005.A0x(hatchWidget, conversationWidgetContext, bRg);
        bfm.AgG(270999423);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchWidget, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(conversationWidgetContext, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            HatchWidgetData hatchWidgetData = hatchWidget.data;
            if (!(hatchWidgetData instanceof SpaceBuildCompletedWidgetData) || (spaceBuildCompletedWidgetData = (SpaceBuildCompletedWidgetData) hatchWidgetData) == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass2 = new SpaceBuildCompletedWidgetRenderer$Render$data$1(this, hatchWidget, conversationWidgetContext, bRg, i);
                    bBbAAc.A06 = anonymousClass2;
                }
                return;
            }
            SpaceBuildCompletedPresentation spaceBuildCompletedPresentation = spaceBuildCompletedWidgetData.card;
            long j = conversationWidgetContext.containerBackgroundColor;
            C1D3 c1d3 = conversationWidgetContext.containerShape;
            C1D3 c1d32 = null;
            if (!conversationWidgetContext.inBubble) {
                c1d32 = c1d3;
            }
            HatchSpaceBuildCompletedCardKt.m2172HatchSpaceBuildCompletedCardT042LqI(spaceBuildCompletedPresentation, bRg, j, c1d32, null, bfm, SpaceBuildCompletedPresentation.$stable | ((iA05 >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 16);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass2 = new AnonymousClass2(hatchWidget, conversationWidgetContext, bRg, i);
            bBbAAc.A06 = anonymousClass2;
        }
    }
}
