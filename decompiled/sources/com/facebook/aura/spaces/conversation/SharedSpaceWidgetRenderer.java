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
import X.C1DM;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import com.facebook.aura.conversation.widget.api.ConversationWidgetContext;
import com.facebook.aura.conversation.widget.api.ConversationWidgetRenderer;
import com.facebook.aura.model.HatchWidget;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class SharedSpaceWidgetRenderer implements ConversationWidgetRenderer {
    public static final SharedSpaceWidgetRenderer INSTANCE = new SharedSpaceWidgetRenderer();

    /* renamed from: com.facebook.aura.spaces.conversation.SharedSpaceWidgetRenderer$Render$2, reason: invalid class name */
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
            SharedSpaceWidgetRenderer.this.Render(this.$widget, this.$context, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationWidgetRenderer
    public void Render(HatchWidget hatchWidget, ConversationWidgetContext conversationWidgetContext, BRg bRg, BFM bfm, int i) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass2;
        AnonymousClass005.A10(hatchWidget, conversationWidgetContext, bRg);
        bfm.AgG(-238924353);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchWidget, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(conversationWidgetContext, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg);
        }
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A65(hatchWidget))) {
                z = true;
            }
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = SharedSpaceWidgetRendererKt.sharedSpace(hatchWidget);
                bfm.Ai0(objAaT);
            }
            SharedSpace sharedSpace = (SharedSpace) objAaT;
            if (sharedSpace == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass2 = new SharedSpaceWidgetRenderer$Render$space$2(this, hatchWidget, conversationWidgetContext, bRg, i);
                    bBbAAc.A06 = anonymousClass2;
                }
                return;
            }
            long j = conversationWidgetContext.containerBackgroundColor;
            C1DM c1dm = conversationWidgetContext.containerShape;
            if (conversationWidgetContext.inBubble || c1dm == null) {
                bfm.AgE(-1973025117);
                c1dm = AuraTheme.INSTANCE.getShapes(bfm, 6).card;
            } else {
                bfm.AgE(-1973027442);
            }
            AnonymousClass001.A1D(bfm);
            SharedSpaceWidgetRendererKt.m2177SharedSpaceCardsW7UJKQ(sharedSpace, j, c1dm, bRg, bfm, (iA05 << 3) & 7168, 0);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass2 = new AnonymousClass2(hatchWidget, conversationWidgetContext, bRg, i);
            bBbAAc.A06 = anonymousClass2;
        }
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationWidgetRenderer
    public boolean canRender(HatchWidget hatchWidget) {
        C7384Etj.A0Y(hatchWidget, 0);
        return SharedSpaceWidgetRendererKt.sharedSpace(hatchWidget) != null;
    }
}
