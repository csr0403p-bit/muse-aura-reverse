package X;

import com.instagram.common.bloks.payload.BloksACQResources;
import com.instagram.common.bloks.payload.BloksComponentQueryResources;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class FBP extends AbstractC7559F3s implements G0V {
    public final /* synthetic */ String $appId;
    public final /* synthetic */ Map<String, Object> $params;
    public final /* synthetic */ Long $refetchIfOlderThanSeconds;
    public final /* synthetic */ FBU $request;
    public final /* synthetic */ boolean $shouldPrefetchSubqueries;
    public final /* synthetic */ FBN this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (ZLX/FBN;Ljava/util/Map<Ljava/lang/String;+Ljava/lang/Object;>;Ljava/lang/Long;Ljava/lang/String;LX/FBU;)V */
    public FBP(FBN fbn, FBU fbu, Long l, String str, Map map, boolean z) {
        super(2);
        this.$shouldPrefetchSubqueries = z;
        this.this$0 = fbn;
        this.$params = map;
        this.$refetchIfOlderThanSeconds = l;
        this.$appId = str;
        this.$request = fbu;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws NoSuchAlgorithmException {
        BloksComponentQueryResources bloksComponentQueryResources;
        HoL hoL = (HoL) obj;
        C7384Etj.A0Y(hoL, 0);
        if (hoL instanceof C7682FAa) {
            try {
                if (this.$shouldPrefetchSubqueries && (bloksComponentQueryResources = ((C7682FAa) hoL).A00) != null) {
                    FBN fbn = this.this$0;
                    Map<String, Object> map = this.$params;
                    Long l = this.$refetchIfOlderThanSeconds;
                    List<BloksACQResources> list = bloksComponentQueryResources.asyncComponentQueries;
                    if (list != null && !list.isEmpty()) {
                        List<BloksACQResources> list2 = bloksComponentQueryResources.asyncComponentQueries;
                        C7384Etj.A0T(list2);
                        for (BloksACQResources bloksACQResources : list2) {
                            String str = bloksACQResources.appId;
                            C7384Etj.A0T(str);
                            LinkedHashMap linkedHashMapA0j = C3cG.A0j();
                            Map<String, String> map2 = bloksACQResources.consumedParams;
                            if (map2 != null) {
                                Iterator itA0n = AnonymousClass002.A0n(map2);
                                while (itA0n.hasNext()) {
                                    Map.Entry entryA0l = C3cH.A0l(itA0n);
                                    linkedHashMapA0j.put(entryA0l.getKey(), map.get(entryA0l.getValue()));
                                }
                            }
                            Set<String> set = bloksACQResources.cacheKeys;
                            Long l2 = bloksACQResources.cacheTtl;
                            C7384Etj.A0T(l2);
                            fbn.A0A.execute(new FBO(HlX.A03, fbn, l, str, linkedHashMapA0j, set, l2.longValue(), true, false));
                        }
                    }
                }
            } catch (ClassCastException unused) {
                FBN fbn2 = this.this$0;
                String str2 = this.$appId;
                Map<String, Object> map3 = this.$params;
                AnonymousClass003.A0u(str2, map3);
                C7403Euh c7403Euh = new C7403Euh(str2, map3);
                FBL fbl = fbn2.A04.A01;
                fbl.A01.A01(c7403Euh);
                EEO eeo = fbl.A00;
                if (eeo != null) {
                    eeo.A03(c7403Euh);
                }
            }
        } else {
            if (!(hoL instanceof FAZ) && !(hoL instanceof Hnp)) {
                throw C3cG.A0q();
            }
            FBN.A01(this.this$0, hoL);
        }
        return Unit.INSTANCE;
    }
}
