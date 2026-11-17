package X;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class F5T implements InterfaceC5174DbF {
    public final int $t;
    public final Object A00;
    public final String A01;

    public F5T(String str, AtomicBoolean atomicBoolean, int i) {
        this.$t = i;
        this.A01 = str;
        this.A00 = atomicBoolean;
    }

    @Override // X.InterfaceC5174DbF
    public final void onResult(Object obj) {
        String str = this.A01;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.A00;
        Map<String, Dd5<C6837Eap>> map = AbstractC6836Eao.A00;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            ArrayList arrayListA0t = BV4.A0t(AbstractC6836Eao.A01);
            if (0 < arrayListA0t.size()) {
                arrayListA0t.get(0);
                throw BV4.A0a("onIdleChanged");
            }
        }
    }
}
