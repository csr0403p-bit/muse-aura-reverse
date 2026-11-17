package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class GRP extends AbstractC7559F3s implements G0U<G0W<? super G0V<? super GRH, ? super Object, ? extends GRH>, ? super GRH, ? super Object, ? extends GRU<GRH>>, G0W<? super G0V<? super GRH, ? super Object, ? extends GRH>, ? super GRH, ? super Object, ? extends GRU<GRH>>> {
    public final /* synthetic */ String $localCallId;
    public final /* synthetic */ List<G0U<GRU<GRH>, G0U<G0U<Object, ? extends Object>, G0U<Object, Object>>>> $middleware;
    public final /* synthetic */ InterfaceC7542F0w $userSession = null;
    public final /* synthetic */ boolean $enableImmediateSubscriberCallbackForBgThreads = false;
    public final /* synthetic */ GSO $perfLogger = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GRP(String str, List list) {
        super(1);
        this.$localCallId = str;
        this.$middleware = list;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ G0W<? super G0V<? super GRH, ? super Object, ? extends GRH>, ? super GRH, ? super Object, ? extends GRU<GRH>> invoke(G0W<? super G0V<? super GRH, ? super Object, ? extends GRH>, ? super GRH, ? super Object, ? extends GRU<GRH>> g0w) {
        G0W<? super G0V<? super GRH, ? super Object, ? extends GRH>, ? super GRH, ? super Object, ? extends GRU<GRH>> g0w2 = g0w;
        C7384Etj.A0Y(g0w2, 0);
        return new GRN(this.$userSession, this.$localCallId, this.$middleware, g0w2, this.$enableImmediateSubscriberCallbackForBgThreads);
    }
}
