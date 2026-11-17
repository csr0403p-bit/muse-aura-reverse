package X;

import com.facebook.aura.bloks.data.AuraBloksDataProps;
import com.facebook.aura.gateway.JarvisProtocolKt;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.FAt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7695FAt implements InterfaceC7700FAy<C7687FAg> {
    public final FBN A00;

    public C7695FAt(FBN fbn) {
        C7384Etj.A0Y(fbn, 0);
        this.A00 = fbn;
    }

    @Override // X.InterfaceC7700FAy
    public final /* bridge */ /* synthetic */ FAN AfK(F6L f6l, Object obj, Map map) {
        C7665F9i c7665F9iA00;
        C7687FAg c7687FAg = (C7687FAg) obj;
        C7708FBg c7708FBg = c7687FAg != null ? c7687FAg.A00 : null;
        C7384Etj.A0Y(map, 1);
        String str = (String) A00(f6l, JarvisProtocolKt.APP_ID_QUERY_PARAM, map);
        if (str == null) {
            throw C60O.A0i("AsyncComponentQuery data manifest entry must specify a non-null appId.");
        }
        Number number = (Number) A00(f6l, "cache_ttl", map);
        if (number == null) {
            throw C60O.A0i("AsyncComponentQuery data manifest entry must specify a non-null cache TTL.");
        }
        long jLongValue = number.longValue();
        Map map2 = (Map) A00(f6l, AuraBloksDataProps.PARAMS, map);
        if (map2 == null) {
            map2 = C9jH.A00;
        }
        Map map3 = (Map) A00(f6l, "client_params", map);
        if (map3 == null) {
            map3 = C9jH.A00;
        }
        FBN fbn = this.A00;
        C7711FBj c7711FBj = new C7711FBj(jLongValue);
        FBX fbx = new FBX(HlX.A02, c7711FBj, str, map2);
        synchronized (fbn.A06) {
            c7665F9iA00 = FBN.A00(fbn, fbx, c7708FBg, false);
        }
        Object obj2 = map.get("query_id");
        C7384Etj.A0Z(obj2, "null cannot be cast to non-null type kotlin.String");
        return new FAN(new C7659F9c(fbn, c7665F9iA00, c7711FBj, (String) obj2, str, map2, map3), c7708FBg != null ? new C7687FAg(c7708FBg) : null);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;+Ljava/lang/Object;>;LX/F6L;)TT; */
    public static final Object A00(F6L f6l, String str, Map map) {
        String str2;
        Object obj = map.get(str);
        if ((obj instanceof String) && (str2 = (String) obj) != null) {
            Object objA00 = FDH.A00(Hj6.A02, new FDG((F9H) null, f6l.A02, (Integer) null, str2), f6l);
            if (objA00 != null) {
                return objA00;
            }
        }
        return null;
    }

    @Override // X.InterfaceC7700FAy
    public final FAO AKk(FB4 fb4) {
        RunnableC7713FBn runnableC7713FBnA00;
        C7687FAg c7687FAg;
        WeakReference weakReferenceA0q = BV4.A0q(fb4);
        FBN fbn = this.A00;
        C8937Ftt c8937Ftt = new C8937Ftt(weakReferenceA0q, 2);
        synchronized (fbn.A07) {
            runnableC7713FBnA00 = fbn.A05.A00(c8937Ftt);
            c7687FAg = new C7687FAg(fbn.A00);
        }
        return new FAO(c7687FAg, runnableC7713FBnA00);
    }
}
