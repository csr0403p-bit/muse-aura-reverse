package com.facebook.aura.flights;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import com.facebook.aura.conversation.widget.api.ConversationListPresentationContext;
import com.facebook.aura.conversation.widget.api.ConversationListPresentationRenderer;
import com.facebook.aura.model.GenericListPresentation;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class FlightResultsListRenderer implements ConversationListPresentationRenderer {
    public static final FlightResultsListRenderer INSTANCE = new FlightResultsListRenderer();

    /* renamed from: com.facebook.aura.flights.FlightResultsListRenderer$Render$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ ConversationListPresentationContext $context;
        public final /* synthetic */ GenericListPresentation $list;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(GenericListPresentation genericListPresentation, ConversationListPresentationContext conversationListPresentationContext, BRg bRg, int i) {
            super(2);
            this.$list = genericListPresentation;
            this.$context = conversationListPresentationContext;
            this.$modifier = bRg;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FlightResultsListRenderer.this.Render(this.$list, this.$context, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationListPresentationRenderer
    public void Render(GenericListPresentation genericListPresentation, ConversationListPresentationContext conversationListPresentationContext, BRg bRg, BFM bfm, int i) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass1;
        AnonymousClass005.A10(genericListPresentation, conversationListPresentationContext, bRg);
        bfm.AgG(1504252437);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, genericListPresentation) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, conversationListPresentationContext);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            boolean zA65 = bfm.A65(conversationListPresentationContext.presentationId) | AnonymousClass001.A1M(iA0d);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = FlightResultsKt.flightResults(genericListPresentation, conversationListPresentationContext.presentationId);
                bfm.Ai0(objAaT);
            }
            FlightResults flightResults = (FlightResults) objAaT;
            if (flightResults == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass1 = new FlightResultsListRenderer$Render$results$2(this, genericListPresentation, conversationListPresentationContext, bRg, i);
                    bBbAAc.A06 = anonymousClass1;
                }
                return;
            }
            FlightResultsCardKt.m948FlightResultsCardT042LqI(flightResults, conversationListPresentationContext.sessionId, conversationListPresentationContext.containerBackgroundColor, conversationListPresentationContext.containerShape, bRg, bfm, (iA0d << 6) & 57344, 0);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass1 = new AnonymousClass1(genericListPresentation, conversationListPresentationContext, bRg, i);
            bBbAAc.A06 = anonymousClass1;
        }
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationListPresentationRenderer
    public boolean canRender(GenericListPresentation genericListPresentation) {
        C7384Etj.A0Y(genericListPresentation, 0);
        return FlightResultsKt.isFlightResults(genericListPresentation);
    }
}
