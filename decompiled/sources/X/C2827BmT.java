package X;

/* renamed from: X.BmT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2827BmT extends AbstractC2841Bmk {
    public final AbstractC2850Bmv A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2827BmT) {
            return this.A00.equals(((C2827BmT) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return this.A00.toString().replaceFirst("FileOutputOptionsInternal", "FileOutputOptions");
    }

    public C2827BmT(AbstractC2850Bmv abstractC2850Bmv) {
        super(abstractC2850Bmv);
        this.A00 = abstractC2850Bmv;
    }
}
