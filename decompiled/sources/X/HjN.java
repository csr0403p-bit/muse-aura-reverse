package X;

import java.security.GeneralSecurityException;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class HjN<P> {
    public final Map<C6966EdO, List<P>> A00 = BV4.A0u();

    /* JADX WARN: Incorrect return type in method signature: (LX/EdO;TP;)LX/HjN<TP;>; */
    public final void A00(C6966EdO prefix, Object primitive) throws GeneralSecurityException {
        List<P> listA0h;
        int length = prefix.A00.length;
        if (length != 0 && length != 5) {
            throw BV6.A0u("PrefixMap only supports 0 and 5 byte prefixes");
        }
        Map<C6966EdO, List<P>> map = this.A00;
        if (map.containsKey(prefix)) {
            listA0h = map.get(prefix);
        } else {
            listA0h = C3cG.A0h();
            map.put(prefix, listA0h);
        }
        listA0h.add(primitive);
    }
}
