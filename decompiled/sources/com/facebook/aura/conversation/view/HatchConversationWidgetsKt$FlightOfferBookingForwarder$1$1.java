package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C7384Etj;
import X.C78g;
import X.G0U;
import com.facebook.aura.conversation.view.FlightOfferBookingRequest;
import com.facebook.aura.model.HatchSendMessage;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationWidgetsKt$FlightOfferBookingForwarder$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<G0U<HatchSendMessage, Unit>> $currentSend$delegate;
    public final /* synthetic */ C1BO<FlightOfferBookingRequest.Booking> $pending$delegate;
    public final /* synthetic */ String $sessionId;

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        FlightOfferBookingRequest.Booking bookingConsume;
        G0U g0uA0B;
        C7384Etj.A0Y(c0Yr, 0);
        if (this.$pending$delegate.getValue() != null && (bookingConsume = FlightOfferBookingRequest.INSTANCE.consume(this.$sessionId)) != null && (g0uA0B = C1BO.A0B(this.$currentSend$delegate)) != null) {
            g0uA0B.invoke(new HatchSendMessage(bookingConsume.text, null, null, null, null, null, null, null, bookingConsume.hiddenPrompt, false, null, null, null, 7934, null));
        }
        return new C78g() { // from class: com.facebook.aura.conversation.view.HatchConversationWidgetsKt$FlightOfferBookingForwarder$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationWidgetsKt$FlightOfferBookingForwarder$1$1(String str, C1BO<FlightOfferBookingRequest.Booking> c1bo, C1BO<? extends G0U<? super HatchSendMessage, Unit>> c1bo2) {
        super(1);
        this.$sessionId = str;
        this.$pending$delegate = c1bo;
        this.$currentSend$delegate = c1bo2;
    }
}
