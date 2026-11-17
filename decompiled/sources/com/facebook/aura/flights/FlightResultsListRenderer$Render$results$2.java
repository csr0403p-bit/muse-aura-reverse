package com.facebook.aura.flights;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.conversation.widget.api.ConversationListPresentationContext;
import com.facebook.aura.model.GenericListPresentation;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class FlightResultsListRenderer$Render$results$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ ConversationListPresentationContext $context;
    public final /* synthetic */ GenericListPresentation $list;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ FlightResultsListRenderer $tmp2_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightResultsListRenderer$Render$results$2(FlightResultsListRenderer flightResultsListRenderer, GenericListPresentation genericListPresentation, ConversationListPresentationContext conversationListPresentationContext, BRg bRg, int i) {
        super(2);
        this.$tmp2_rcvr = flightResultsListRenderer;
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
        this.$tmp2_rcvr.Render(this.$list, this.$context, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
    }
}
