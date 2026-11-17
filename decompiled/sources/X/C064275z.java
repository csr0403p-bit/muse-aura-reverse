package X;

/* renamed from: X.75z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C064275z {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C064275z) && this.A00 == ((C064275z) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return FGI.A0G("LayoutInfo(layoutId=", ')', this.A00);
    }

    public C064275z(int i) {
        this.A00 = i;
    }
}
