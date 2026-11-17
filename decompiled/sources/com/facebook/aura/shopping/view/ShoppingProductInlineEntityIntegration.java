package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BO6;
import X.C0953AJg;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.conversation.api.inlineentity.ConversationInlineEntityIntegration;
import com.facebook.aura.conversation.api.inlineentity.ConversationInlineEntityState;
import com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument;
import com.facebook.aura.markdown.parser.custom.extensions.IndexedInlineEntityExtension;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ShoppingProductInlineEntityIntegration implements ConversationInlineEntityIntegration {
    public static final ShoppingProductInlineEntityIntegration INSTANCE = new ShoppingProductInlineEntityIntegration();

    /* renamed from: com.facebook.aura.shopping.view.ShoppingProductInlineEntityIntegration$ProvideInlineEntities$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ boolean $isPrimaryThread;
        public final /* synthetic */ String $messageId;
        public final /* synthetic */ String $sessionId;
        public final /* synthetic */ ConversationInlineEntityState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(ConversationInlineEntityState conversationInlineEntityState, String str, String str2, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, int i) {
            super(2);
            this.$state = conversationInlineEntityState;
            this.$messageId = str;
            this.$sessionId = str2;
            this.$isPrimaryThread = z;
            this.$content = g0v;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            ShoppingProductInlineEntityIntegration.this.ProvideInlineEntities(this.$state, this.$messageId, this.$sessionId, this.$isPrimaryThread, this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    @Override // com.facebook.aura.conversation.api.inlineentity.ConversationInlineEntityIntegration
    public void ProvideInlineEntities(ConversationInlineEntityState conversationInlineEntityState, String str, String str2, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        BO6 bo6;
        ShoppingProductInlineEntityState shoppingProductInlineEntityState;
        AnonymousClass002.A1C(str, 1, g0v);
        bfm.AgG(-231636097);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(conversationInlineEntityState, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, str2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 8339, 8338), bfm, iA05)) {
            if (!(conversationInlineEntityState instanceof ShoppingProductInlineEntityState) || (shoppingProductInlineEntityState = (ShoppingProductInlineEntityState) conversationInlineEntityState) == null || (bo6 = shoppingProductInlineEntityState.productsByPillId) == null) {
                bo6 = C0953AJg.A03;
            }
            HatchProductPillProviderKt.HatchProductPillProvider(bo6, str2, str, true, g0v, bfm, AnonymousClass001.A0B(iA05, ShoppingResultProduct.$stable | 3072 | ((iA05 >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | ((iA05 << 3) & 896)));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(conversationInlineEntityState, str, str2, z, g0v, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000f  */
    @Override // com.facebook.aura.conversation.api.inlineentity.ConversationInlineEntityIntegration
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.facebook.aura.conversation.api.inlineentity.ConversationInlineEntityPreparation prepare(java.util.List<com.facebook.aura.model.HatchTextEntitySegment> r9) {
        /*
            r8 = this;
            r4 = 0
            X.C7384Etj.A0Y(r9, r4)
            boolean r3 = r9 instanceof java.util.Collection
            r8 = 0
            if (r3 == 0) goto L1a
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L1a
        Lf:
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L3c
        L15:
            com.facebook.aura.conversation.api.inlineentity.ConversationInlineEntityPreparation$NotApplicable r1 = com.facebook.aura.conversation.api.inlineentity.ConversationInlineEntityPreparation.NotApplicable.INSTANCE
        L17:
            com.facebook.aura.conversation.api.inlineentity.ConversationInlineEntityPreparation r1 = (com.facebook.aura.conversation.api.inlineentity.ConversationInlineEntityPreparation) r1
            return r1
        L1a:
            java.util.Iterator r2 = r9.iterator()
        L1e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L39
            java.lang.Object r0 = r2.next()
            com.facebook.aura.model.HatchTextEntitySegment r0 = (com.facebook.aura.model.HatchTextEntitySegment) r0
            java.lang.String r1 = r0.text
            if (r1 == 0) goto L1e
            char r0 = com.facebook.aura.shopping.view.ShoppingProductEntityMarkdown.SENTINEL_CHAR
            int r0 = X.C7BY.A08(r1, r0, r4)
            if (r0 < 0) goto L1e
        L36:
            com.facebook.aura.conversation.api.inlineentity.ConversationInlineEntityPreparation$Rejected r1 = com.facebook.aura.conversation.api.inlineentity.ConversationInlineEntityPreparation.Rejected.INSTANCE
            goto L17
        L39:
            if (r3 == 0) goto L3c
            goto Lf
        L3c:
            java.util.Iterator r1 = r9.iterator()
        L40:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L15
            java.lang.Object r0 = r1.next()
            com.facebook.aura.model.HatchTextEntitySegment r0 = (com.facebook.aura.model.HatchTextEntitySegment) r0
            com.facebook.aura.shopping.model.ShoppingResultProduct r0 = r0.product
            if (r0 == 0) goto L40
            boolean r0 = com.facebook.aura.shopping.view.ShoppingProductInlineEntityIntegrationKt.getProductEntityChipsEnabled()
            if (r0 == 0) goto L36
            java.util.LinkedHashMap r7 = X.C3cG.A0j()
            java.util.LinkedHashMap r6 = X.C3cG.A0j()
            java.util.Iterator r5 = r9.iterator()
        L62:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L9c
            java.lang.Object r0 = r5.next()
            int r4 = r4 + 1
            if (r8 >= 0) goto L78
            X.AbstractC0885AGm.A14()
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L78:
            com.facebook.aura.model.HatchTextEntitySegment r0 = (com.facebook.aura.model.HatchTextEntitySegment) r0
            com.facebook.aura.shopping.model.ShoppingResultProduct r3 = r0.product
            if (r3 == 0) goto L9a
            int r2 = r6.size()
            com.facebook.aura.markdown.parser.custom.extensions.IndexedInlineEntityExtension r1 = com.facebook.aura.markdown.parser.custom.extensions.IndexedInlineEntityExtension.INSTANCE
            java.lang.String r0 = "shopping.product"
            java.lang.String r1 = r1.sentinelFor(r0, r2)
            if (r1 == 0) goto L36
            java.lang.String r0 = java.lang.String.valueOf(r2)
            r6.put(r0, r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r7.put(r0, r1)
        L9a:
            r8 = r4
            goto L62
        L9c:
            X.BO6 r2 = X.AGI.A08(r7)
            X.BO6 r0 = X.AGI.A08(r6)
            com.facebook.aura.shopping.view.ShoppingProductInlineEntityState r1 = new com.facebook.aura.shopping.view.ShoppingProductInlineEntityState
            r1.<init>(r0)
            com.facebook.aura.conversation.api.inlineentity.ConversationInlineEntityPlan r0 = new com.facebook.aura.conversation.api.inlineentity.ConversationInlineEntityPlan
            r0.<init>(r2, r1)
            com.facebook.aura.conversation.api.inlineentity.ConversationInlineEntityPreparation$Ready r1 = new com.facebook.aura.conversation.api.inlineentity.ConversationInlineEntityPreparation$Ready
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.view.ShoppingProductInlineEntityIntegration.prepare(java.util.List):com.facebook.aura.conversation.api.inlineentity.ConversationInlineEntityPreparation");
    }

    @Override // com.facebook.aura.conversation.api.inlineentity.ConversationInlineEntityIntegration
    public boolean rendersInlineEntitiesCleanly(AuraMarkdownDocument auraMarkdownDocument, int i) {
        C7384Etj.A0Y(auraMarkdownDocument, 0);
        return i > 0 && ShoppingProductEntityMarkdown.INSTANCE.pillsRenderCleanly(auraMarkdownDocument, i);
    }

    @Override // com.facebook.aura.conversation.api.inlineentity.ConversationInlineEntityIntegration
    public int sentinelCount(String str) {
        C7384Etj.A0Y(str, 0);
        return IndexedInlineEntityExtension.INSTANCE.sentinelCount(str, ShoppingProductEntityMarkdown.INLINE_NAME);
    }
}
