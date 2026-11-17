package X;

/* loaded from: classes6.dex */
public final class HoI<T> {
    public static final C2zT A01 = new C2zT();
    public final Object A00;

    public final boolean equals(Object obj) {
        return (obj instanceof HoI) && C7384Etj.areEqual(this.A00, ((HoI) obj).A00);
    }

    public final int hashCode() {
        return AnonymousClass006.A0D(this.A00);
    }

    public final String toString() {
        Object obj = this.A00;
        boolean z = obj instanceof Ho5;
        Object obj2 = obj;
        if (!z) {
            StringBuilder sbA0f = C3cG.A0f(obj, "Value(");
            sbA0f.append(')');
            obj2 = sbA0f;
        }
        return obj2.toString();
    }

    public /* synthetic */ HoI(Object obj) {
        this.A00 = obj;
    }
}
