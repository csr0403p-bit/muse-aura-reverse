package X;

/* renamed from: X.72s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C059572s {
    public final int A00;

    public static AnonymousClass736 A00(C75e c75e, C059472r c059472r, int i) {
        return new AnonymousClass736(c75e, c059472r, new C059572s(i), i);
    }

    public static AnonymousClass736 A01(C75e c75e, C059472r c059472r, int i, int i2) {
        return new AnonymousClass736(c75e, c059472r, new C059572s(i), i2);
    }

    public static C059572s A02(int i) {
        return new C059572s(i);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C059572s) && this.A00 == ((C059572s) obj).A00;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return FGI.A0G("Vertical(value=", ')', this.A00);
    }

    public /* synthetic */ C059572s(int i) {
        this.A00 = i;
    }
}
