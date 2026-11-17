package X;

import java.lang.Comparable;

/* loaded from: classes4.dex */
public final class AEP<T extends Comparable<? super T>> implements AT1<T> {
    public final T A00;
    public final T A01;

    public static AEP A00(Comparable comparable, float f) {
        return new AEP(comparable, new C1DG(f));
    }

    @Override // X.AT1
    public final T AF8() {
        return this.A00;
    }

    @Override // X.AT1
    public final T AKt() {
        return this.A01;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AEP)) {
            return false;
        }
        if (isEmpty() && ((AEP) obj).isEmpty()) {
            return true;
        }
        AEP aep = (AEP) obj;
        return this.A01.equals(aep.A01) && this.A00.equals(aep.A00);
    }

    @Override // X.AT1
    public final /* bridge */ boolean isEmpty() {
        return AnonymousClass002.A1N(this.A01.compareTo(this.A00));
    }

    public AEP(T t, T t2) {
        this.A01 = t;
        this.A00 = t2;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return AnonymousClass005.A0G(this.A00, AnonymousClass005.A0E(this.A01));
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(this.A01);
        sbA0w.append("..");
        return C8j3.A14(this.A00, sbA0w);
    }
}
