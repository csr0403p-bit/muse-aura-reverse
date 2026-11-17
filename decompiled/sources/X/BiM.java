package X;

/* loaded from: classes5.dex */
public final class BiM<T> implements BeM<T> {
    public BeM<T> A00;

    @Override // X.BeM
    public final void accept(T t) {
        C7384Etj.A0Z(this.A00, "Listener is not set.");
        this.A00.accept(t);
    }
}
