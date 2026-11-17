package X;

import androidx.fragment.app.strictmode.Violation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class Hi5 {
    public static final Hi5 A02 = new Hi5(C9jH.A00, A3q.A00);
    public final Map<String, Set<Class<? extends Violation>>> A00;
    public final Set<EnumC8520FfT> A01;

    public Hi5(Map map, Set set) {
        this.A01 = set;
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            AnonymousClass006.A1R(linkedHashMapA0j, C3cH.A0l(itA0n));
        }
        this.A00 = linkedHashMapA0j;
    }
}
