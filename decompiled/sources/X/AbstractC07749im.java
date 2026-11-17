package X;

/* renamed from: X.9im, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC07749im {
    public static final <T> C9hr<T> A00(final C9hr<T> c9hr) {
        C7384Etj.A0Y(c9hr, 0);
        return c9hr.getDescriptor().AOo() ? c9hr : new C9hr<T>(c9hr) { // from class: X.9iB
            public final C9hr<T> A00;
            public final C9iZ A01;

            @Override // X.C9jG
            public final T deserialize(InterfaceC07829iw interfaceC07829iw) {
                C7384Etj.A0Y(interfaceC07829iw, 0);
                if (interfaceC07829iw.A8Y()) {
                    return (T) interfaceC07829iw.A8b(this.A00);
                }
                return null;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj != null && getClass() == obj.getClass() && this.A00.equals(((C9iB) obj).A00));
            }

            @Override // X.C9hv
            public final void serialize(InterfaceC07789is interfaceC07789is, T t) {
                C7384Etj.A0Y(interfaceC07789is, 0);
                if (t != null) {
                    interfaceC07789is.AAR(t, this.A00);
                } else {
                    interfaceC07789is.AAO();
                }
            }

            @Override // X.C9hr, X.C9hv, X.C9jG
            public final C9iZ getDescriptor() {
                return this.A01;
            }

            public final int hashCode() {
                return this.A00.hashCode();
            }

            {
                this.A00 = c9hr;
                this.A01 = new C9iT(c9hr.getDescriptor());
            }
        };
    }

    public static C9hr[] A01() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{A00(c07779iq), A00(c07779iq), A00(c07779iq), A00(c07779iq), A00(c07779iq)};
    }
}
