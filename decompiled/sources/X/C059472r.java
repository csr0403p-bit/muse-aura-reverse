package X;

/* renamed from: X.72r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C059472r {
    public final int A00;

    public static AnonymousClass736 A00(C75e c75e, int i) {
        return new AnonymousClass736(c75e, new C059472r(i), null, i);
    }

    public static AnonymousClass736 A01(C75e c75e, int i, int i2) {
        return new AnonymousClass736(c75e, new C059472r(i), null, i2);
    }

    public static AnonymousClass736 A02(C75e c75e, int i, int i2) {
        return new AnonymousClass736(c75e, new C059472r(i), new C059572s(i), i2);
    }

    public static AnonymousClass736 A03(C75e c75e, int i, int i2) {
        return new AnonymousClass736(c75e, new C059472r(i), new C059572s(i2), i2);
    }

    public static AnonymousClass736 A04(C75e c75e, int i, int i2, int i3) {
        return new AnonymousClass736(c75e, new C059472r(i), new C059572s(i2), i3);
    }

    public static C059472r A05(int i) {
        return new C059472r(i);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C059472r) && this.A00 == ((C059472r) obj).A00;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return FGI.A0G("Horizontal(value=", ')', this.A00);
    }

    public /* synthetic */ C059472r(int i) {
        this.A00 = i;
    }
}
