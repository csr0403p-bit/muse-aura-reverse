package X;

import java.util.Collections;
import java.util.Set;

/* renamed from: X.Eiy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7234Eiy<T> implements InterfaceC7005EeA<InterfaceC7236Ej0<T>> {
    public final Set<C7229Eit> A01 = Collections.newSetFromMap(BV4.A11());
    public InterfaceC7005EeA<InterfaceC7236Ej0<T>> A00 = null;

    @Override // X.InterfaceC7005EeA
    public final /* bridge */ /* synthetic */ Object get() {
        C7229Eit c7229Eit = new C7229Eit();
        c7229Eit.A08(this.A00);
        this.A01.add(c7229Eit);
        return c7229Eit;
    }
}
