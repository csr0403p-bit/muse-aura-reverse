package X;

/* loaded from: classes6.dex */
public final class Htu implements C78I<HnY<?>> {
    public final ThreadLocal<?> A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof Htu) && C7384Etj.areEqual(this.A00, ((Htu) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A00, C60O.A0x("ThreadLocalKey(threadLocal="));
    }

    public Htu(ThreadLocal<?> threadLocal) {
        this.A00 = threadLocal;
    }
}
