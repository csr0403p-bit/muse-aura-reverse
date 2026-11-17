package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class BJt {
    public final Map<String, AEs> A00 = C3cG.A0j();

    public final void A00() {
        Map<String, AEs> map = this.A00;
        Iterator<AEs> it = map.values().iterator();
        while (it.hasNext()) {
            it.next().clear$lifecycle_viewmodel();
        }
        map.clear();
    }
}
