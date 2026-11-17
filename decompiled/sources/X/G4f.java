package X;

/* loaded from: classes6.dex */
public final class G4f extends G4e {
    public boolean A00;
    public final Object A01;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.A00;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.A00) {
            throw C8j3.A1D();
        }
        this.A00 = true;
        return this.A01;
    }

    public G4f(Object obj) {
        this.A01 = obj;
    }
}
