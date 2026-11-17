package X;

/* renamed from: X.BdH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2530BdH<T> extends AbstractC2531BdI<T> {
    public final Class<T> A00;
    public final Object A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC2531BdI) {
                C2530BdH c2530BdH = (C2530BdH) ((AbstractC2531BdI) obj);
                if (this.A02.equals(c2530BdH.A02) && this.A00.equals(c2530BdH.A00)) {
                    Object obj2 = this.A01;
                    Object obj3 = c2530BdH.A01;
                    if (obj2 == null) {
                        if (obj3 == null) {
                        }
                    } else if (obj2.equals(obj3)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV6.A08(this.A00, (this.A02.hashCode() ^ 1000003) * 1000003) ^ AnonymousClass006.A0D(this.A01);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Option{id=");
        sbA0x.append(this.A02);
        sbA0x.append(", valueClass=");
        sbA0x.append(this.A00);
        sbA0x.append(", token=");
        return BV8.A0v(this.A01, sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/lang/Class<TT;>;Ljava/lang/Object;)V */
    public C2530BdH(Class cls, Object obj, String str) {
        if (str == null) {
            throw BV4.A0a("Null id");
        }
        this.A02 = str;
        if (cls == null) {
            throw BV4.A0a("Null valueClass");
        }
        this.A00 = cls;
        this.A01 = obj;
    }
}
