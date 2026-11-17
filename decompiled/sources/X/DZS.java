package X;

import com.facebook.pando.IPandoGraphQLService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class DZS implements IPandoGraphQLService.Token {
    public final AtomicReference<AbstractC5118DZt> A00 = BV4.A16(DZm.A00);

    @Override // X.InterfaceC5106DYe
    public final void cancel() {
        C5115DZk c5115DZk;
        IPandoGraphQLService.Token token;
        AbstractC5118DZt andSet = this.A00.getAndSet(DZn.A00);
        if (!(andSet instanceof C5115DZk) || (c5115DZk = (C5115DZk) andSet) == null || (token = c5115DZk.A00) == null) {
            return;
        }
        token.cancel();
    }
}
