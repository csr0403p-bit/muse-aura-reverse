package X;

/* loaded from: classes6.dex */
public final class FH5<T> extends C06G {
    public final InterfaceC10512HoG A00;
    public final T A01;

    public FH5(InterfaceC10512HoG interfaceC10512HoG, T t) {
        C7384Etj.A0Y(interfaceC10512HoG, 0);
        this.A00 = interfaceC10512HoG;
        this.A01 = t;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FH5) {
                FH5 fh5 = (FH5) obj;
                if (!C7384Etj.areEqual(this.A00, fh5.A00) || !C7384Etj.areEqual(this.A01, fh5.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0E(this.A00) + AnonymousClass006.A0D(this.A01);
    }
}
