package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/* renamed from: X.Ce8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3766Ce8 implements F18 {
    public final F18<InterfaceC3770CeD> A00;

    @Override // X.F18
    /* renamed from: get */
    public final /* bridge */ /* synthetic */ Object AMN() {
        InterfaceC3770CeD interfaceC3770CeDAMN = this.A00.AMN();
        HashMap mapA0u = BV4.A0u();
        Ce5 ce5 = Ce5.DEFAULT;
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            throw BV4.A0a("Null flags");
        }
        if (!"".isEmpty()) {
            throw BV8.A0l("");
        }
        mapA0u.put(ce5, new C3768CeB(30000L, set));
        mapA0u.put(Ce5.HIGHEST, new C3768CeB(1000L, set));
        mapA0u.put(Ce5.VERY_LOW, new C3768CeB(86400000L, Collections.unmodifiableSet(BV5.A0v(new EnumC3767CeA[]{EnumC3767CeA.NETWORK_UNMETERED, EnumC3767CeA.DEVICE_IDLE}))));
        if (interfaceC3770CeDAMN == null) {
            throw BV4.A0a("missing required property: clock");
        }
        if (mapA0u.keySet().size() >= Ce5.values().length) {
            return new Ce9(interfaceC3770CeDAMN, mapA0u);
        }
        throw C3cG.A0Q("Not all priorities have been configured");
    }

    public C3766Ce8(F18<InterfaceC3770CeD> f18) {
        this.A00 = f18;
    }
}
