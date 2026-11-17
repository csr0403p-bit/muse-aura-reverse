package X;

import java.util.List;

/* renamed from: X.Eiv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7231Eiv<T> implements InterfaceC7005EeA<InterfaceC7236Ej0<T>> {
    public final List<InterfaceC7005EeA<InterfaceC7236Ej0<T>>> A00;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7231Eiv) {
            return AbstractC7213Eib.A00(this.A00, ((C7231Eiv) obj).A00);
        }
        return false;
    }

    @Override // X.InterfaceC7005EeA
    public final /* bridge */ /* synthetic */ Object get() {
        return new C7221Eil(this);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C7231Eiv(List<InterfaceC7005EeA<InterfaceC7236Ej0<T>>> list) {
        CVn.A04(BV6.A1b(list), "List of suppliers is empty!");
        this.A00 = list;
    }

    public final String toString() {
        C7200EiD c7200EiD = new C7200EiD(C3cI.A0Y(this));
        C7200EiD.A00(c7200EiD, this.A00, "list");
        return c7200EiD.toString();
    }
}
