package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* renamed from: X.9sD, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9sD {
    public final Map<C9iZ, Map<C9sE<Object>, Object>> A00 = new ConcurrentHashMap(16);

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/9iZ;LX/9sE<TT;>;Lkotlin/jvm/functions/Function0<+TT;>;)TT; */
    public final Object A00(Function0 function0, C9iZ c9iZ, C9sE c9sE) {
        Object objInvoke;
        Map<C9iZ, Map<C9sE<Object>, Object>> map = this.A00;
        Map<C9sE<Object>, Object> map2 = map.get(c9iZ);
        if (map2 == null || (objInvoke = map2.get(c9sE)) == null) {
            objInvoke = function0.invoke();
            C7384Etj.A0Y(objInvoke, 2);
            Map<C9sE<Object>, Object> concurrentHashMap = map.get(c9iZ);
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap<>(2);
                map.put(c9iZ, concurrentHashMap);
            }
            concurrentHashMap.put(c9sE, objInvoke);
        }
        return objInvoke;
    }
}
