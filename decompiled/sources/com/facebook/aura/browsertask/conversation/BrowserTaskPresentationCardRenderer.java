package com.facebook.aura.browsertask.conversation;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C3cG;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.conversation.widget.api.ConversationPresentationCardContext;
import com.facebook.aura.conversation.widget.api.ConversationPresentationCardRenderer;
import com.facebook.aura.model.BrowserTaskPresentation;
import com.facebook.aura.model.BrowserTaskPresentationData;
import com.facebook.aura.model.HatchPresentationData;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class BrowserTaskPresentationCardRenderer implements ConversationPresentationCardRenderer {
    public static final BrowserTaskPresentationCardRenderer INSTANCE = new BrowserTaskPresentationCardRenderer();

    /* renamed from: com.facebook.aura.browsertask.conversation.BrowserTaskPresentationCardRenderer$Render$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ ConversationPresentationCardContext $context;
        public final /* synthetic */ HatchPresentationData $data;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchPresentationData hatchPresentationData, ConversationPresentationCardContext conversationPresentationCardContext, BRg bRg, int i) {
            super(2);
            this.$data = hatchPresentationData;
            this.$context = conversationPresentationCardContext;
            this.$modifier = bRg;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            BrowserTaskPresentationCardRenderer.this.Render(this.$data, this.$context, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationPresentationCardRenderer
    public void Render(HatchPresentationData hatchPresentationData, ConversationPresentationCardContext conversationPresentationCardContext, BRg bRg, BFM bfm, int i) {
        Object anonymousClass1;
        BBb bBbAAc;
        BrowserTaskPresentationData browserTaskPresentationData;
        BrowserTaskPresentation browserTaskPresentation;
        AnonymousClass005.A10(hatchPresentationData, conversationPresentationCardContext, bRg);
        bfm.AgG(1164869997);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchPresentationData, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(conversationPresentationCardContext, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            bfm.Afo();
        } else {
            if (!(hatchPresentationData instanceof BrowserTaskPresentationData) || (browserTaskPresentationData = (BrowserTaskPresentationData) hatchPresentationData) == null || (browserTaskPresentation = browserTaskPresentationData.browserTask) == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass1 = new BrowserTaskPresentationCardRenderer$Render$browserTask$1(this, hatchPresentationData, conversationPresentationCardContext, bRg, i);
                    C3cG.A1D(bBbAAc, anonymousClass1);
                }
                return;
            }
            HatchBrowserTaskCardKt.m301HatchBrowserTaskCardcf5BqRc(browserTaskPresentation, bRg, conversationPresentationCardContext.containerBackgroundColor, conversationPresentationCardContext.containerShape, bfm, BrowserTaskPresentation.$stable | ((iA05 >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 0);
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass1 = new AnonymousClass1(hatchPresentationData, conversationPresentationCardContext, bRg, i);
            C3cG.A1D(bBbAAc, anonymousClass1);
        }
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationPresentationCardRenderer
    public boolean canRender(HatchPresentationData hatchPresentationData) {
        C7384Etj.A0Y(hatchPresentationData, 0);
        return hatchPresentationData instanceof BrowserTaskPresentationData;
    }
}
