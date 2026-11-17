package X;

import com.facebook.aura.bloks.fbpay.pttprovider.AuraFBPayExecutors;
import com.facebook.aura.bloks.fbpay.pttprovider.NoopAuthTicketApi;

/* loaded from: classes5.dex */
public final class EVb extends EVi {
    public final NoopAuthTicketApi A00;
    public final /* synthetic */ EVa A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EVb(AuraFBPayExecutors auraFBPayExecutors, NoopAuthTicketApi noopAuthTicketApi, EVa eVa) {
        super(auraFBPayExecutors);
        this.A01 = eVa;
        this.A00 = noopAuthTicketApi;
    }
}
