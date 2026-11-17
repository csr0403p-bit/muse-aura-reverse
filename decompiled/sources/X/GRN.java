package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class GRN extends AbstractC7559F3s implements G0W<G0V<? super GRH, ? super Object, ? extends GRH>, GRH, Object, GRU<GRH>> {
    public final /* synthetic */ boolean $enableImmediateSubscriberCallbackForBgThreads;
    public final /* synthetic */ String $localCallId;
    public final /* synthetic */ List<G0U<GRU<GRH>, G0U<G0U<Object, ? extends Object>, G0U<Object, Object>>>> $middleware;
    public final /* synthetic */ GSO $perfLogger = null;
    public final /* synthetic */ G0W<G0V<? super GRH, Object, GRH>, GRH, Object, GRU<GRH>> $storeCreator;
    public final /* synthetic */ InterfaceC7542F0w $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GRN(InterfaceC7542F0w interfaceC7542F0w, String str, List list, G0W g0w, boolean z) {
        super(3);
        this.$localCallId = str;
        this.$storeCreator = g0w;
        this.$middleware = list;
        this.$userSession = interfaceC7542F0w;
        this.$enableImmediateSubscriberCallbackForBgThreads = z;
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ GRU<GRH> invoke(G0V<? super GRH, ? super Object, ? extends GRH> g0v, GRH grh, Object obj) {
        AnonymousClass002.A1a(g0v, grh);
        AtomicReference atomicReference = new AtomicReference();
        FZJ fzj = new FZJ(new G0V[]{g0v, new FZJ(atomicReference, 14)}, 18);
        C8826Fle c8826Fle = new C8826Fle(atomicReference, 8);
        String str = this.$localCallId;
        G0W<G0V<? super GRH, Object, GRH>, GRH, Object, GRU<GRH>> g0w = this.$storeCreator;
        G0U[] g0uArr = (G0U[]) this.$middleware.toArray(new G0U[0]);
        Object[] objArrCopyOf = Arrays.copyOf(g0uArr, g0uArr.length);
        C7384Etj.A0Y(objArrCopyOf, 0);
        GRZ grz = new GRZ(this.$userSession, str, c8826Fle, g0w.invoke(fzj, grh, FZS.A02(objArrCopyOf, 49)), this.$enableImmediateSubscriberCallbackForBgThreads);
        G0U<Object, ? extends Object> g0u = ((C9658Gci) grz).A00;
        ((C9658Gci) grz).A00 = C8631Fhi.A00(32);
        List<G0U<GRU<GRH>, G0U<G0U<Object, ? extends Object>, G0U<Object, Object>>>> list = this.$middleware;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<G0U<GRU<GRH>, G0U<G0U<Object, ? extends Object>, G0U<Object, Object>>>> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().invoke(grz));
        }
        FZG fzg = new FZG(g0u);
        C8196FYn c8196FYn = new C8196FYn(grz);
        ((C9658Gci) grz).A00 = new FY9(grz, this.$localCallId, arrayListA0i, new AtomicInteger(0), fzg, c8196FYn);
        grz.A00(FZS.A02(grz, 40), false);
        return grz;
    }
}
