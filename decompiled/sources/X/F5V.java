package X;

import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListMap;

/* loaded from: classes5.dex */
public final class F5V implements InterfaceC6739EXx {
    public final int $t;

    public F5V(int i) {
        this.$t = i;
    }

    @Override // X.InterfaceC6739EXx
    public final Object A6t() {
        switch (this.$t) {
            case 0:
                return new ERD();
            case 1:
                return new TreeSet();
            case 2:
                return C3cG.A0k();
            case 3:
                return BV4.A0s();
            case 4:
                return C3cG.A0h();
            case 5:
                return new ConcurrentSkipListMap();
            case 6:
                return C60O.A1C();
            case 7:
                return new TreeMap();
            case 8:
                return C3cG.A0j();
            default:
                return null;
        }
    }
}
