package X;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Bdy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2569Bdy {
    public final Object A00 = C3cG.A0T();
    public final Map<String, InterfaceC2610Bfb> A01 = C3cG.A0j();
    public final Set<InterfaceC2610Bfb> A02 = C60O.A13();

    public final LinkedHashSet<InterfaceC2610Bfb> A00() {
        LinkedHashSet<InterfaceC2610Bfb> linkedHashSet;
        synchronized (this.A00) {
            linkedHashSet = new LinkedHashSet<>(this.A01.values());
        }
        return linkedHashSet;
    }
}
