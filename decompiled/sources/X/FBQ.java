package X;

import com.facebook.aura.bloks.asynccomponent.AuraComponentQueryStoreFetcher;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class FBQ {
    public final HsW A00;
    public final FBt A01;
    public final AuraComponentQueryStoreFetcher A04;
    public final Set<String> A03 = C3cG.A0k();
    public final Map<String, C7718FBu> A02 = C3cG.A0j();
    public final ConcurrentHashMap<String, C10443Hhq<List<HoL>>> A05 = C60O.A1C();

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;LX/FBk;ZLjava/util/concurrent/Executor;LX/G0U<-LX/HoL;Lkotlin/Unit;>;LX/G0U<-Ljava/util/List<LX/F9A;>;Lkotlin/Unit;>;)V */
    public final void A01(AbstractC7712FBk abstractC7712FBk, String str, Executor executor, G0U g0u, G0U g0u2, boolean z) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A12(abstractC7712FBk, executor, g0u, 1);
        Map<String, C7718FBu> map = this.A02;
        C7718FBu c7718FBu = map.get(str);
        if (c7718FBu != null) {
            c7718FBu.A00 = BGK.A02(abstractC7712FBk.A00, c7718FBu.A00);
            return;
        }
        HlX hlX = abstractC7712FBk.A00;
        Set<? extends HlX> setSingleton = Collections.singleton(hlX);
        C7718FBu c7718FBu2 = new C7718FBu();
        c7718FBu2.A00 = setSingleton;
        c7718FBu2.A01 = false;
        map.put(str, c7718FBu2);
        FC6 fc6 = new FC6("component_query_fetcher");
        fc6.A02("query_src", "www");
        FBW fbw = new FBW(c7718FBu2, this, fc6, abstractC7712FBk, str, C3cG.A0j(), C3cG.A0j(), executor, g0u2, g0u, z);
        fc6.A01("request_start", 0L);
        fc6.A02("query_src", "www");
        this.A04.fetchFromResource(abstractC7712FBk.A02, abstractC7712FBk instanceof FBX ? ((FBX) abstractC7712FBk).A05 : ((FBU) abstractC7712FBk).A05, false, hlX, executor, fbw);
    }

    public FBQ(AuraComponentQueryStoreFetcher auraComponentQueryStoreFetcher, HsW hsW, FBt fBt) {
        this.A04 = auraComponentQueryStoreFetcher;
        this.A00 = hsW;
        this.A01 = fBt;
    }

    public static final Map<String, Object> A00(Map<String, ? extends Object> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator itA0n = AnonymousClass002.A0n(map2);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            Object key = entryA0l.getKey();
            Object value = entryA0l.getValue();
            linkedHashMapA0j.put(key, map.containsKey(value) ? map.get(value) : null);
        }
        return linkedHashMapA0j;
    }
}
