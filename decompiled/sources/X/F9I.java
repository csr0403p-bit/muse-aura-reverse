package X;

import com.instagram.common.lispy.lang.BloksScriptingException;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class F9I {
    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Map<Ljava/lang/String;*>;LX/F6L;)Ljava/lang/Object; */
    public static final Object A00(F6L f6l, Map map) {
        C7384Etj.A0Y(map, 0);
        if (!map.containsKey("initial_lispy")) {
            return map.get("initial");
        }
        try {
            Object obj = map.get("initial_lispy");
            C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlin.String");
            return FDH.A00(Hj6.A02, new FDG((F9H) null, f6l.A02, (Integer) null, (String) obj), f6l);
        } catch (BloksScriptingException e) {
            FFI.A01(null, "Exception gettin initial_lispy value", e);
            return null;
        }
    }
}
