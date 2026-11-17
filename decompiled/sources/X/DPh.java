package X;

/* loaded from: classes5.dex */
public abstract class DPh<E> extends DNX<E> implements InterfaceC5026DPa<E> {
    @Override // X.InterfaceC5026DPa
    public final int A7Q(Object element) {
        return ((C5036DPy) this).A03.A7Q(element);
    }

    @Override // X.InterfaceC5026DPa
    public final int AaU(Object element, int occurrences) {
        return ((C5036DPy) this).A03.AaU(element, occurrences);
    }

    @Override // X.InterfaceC5026DPa
    public final boolean AdC(E element, int oldCount, int newCount) {
        return ((C5036DPy) this).A03.AdC(element, oldCount, newCount);
    }

    @Override // java.util.Collection
    public final boolean equals(Object object) {
        return object == this || ((C5036DPy) this).A03.equals(object);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return ((C5036DPy) this).A03.hashCode();
    }
}
