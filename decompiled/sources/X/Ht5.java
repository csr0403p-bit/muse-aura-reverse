package X;

/* loaded from: classes6.dex */
public final class Ht5 implements FH1 {
    public final Class<?> A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof Ht5) && C7384Etj.areEqual(this.A00, ((Ht5) obj).A00));
    }

    @Override // X.FH1
    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C3cJ.A0M("ClassBinderKey(clazz=", this.A00);
    }

    public Ht5(Class<?> cls) {
        this.A00 = cls;
    }
}
