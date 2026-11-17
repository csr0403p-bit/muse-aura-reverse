package X;

/* renamed from: X.760, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass760 {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass760) && this.A00 == ((AnonymousClass760) obj).A00);
    }

    public static HxE A00(Object obj, int i) {
        return new HxE(obj, new AnonymousClass760(i));
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return FGI.A0G("ContainerInfo(layoutId=", ')', this.A00);
    }

    public AnonymousClass760(int i) {
        this.A00 = i;
    }
}
