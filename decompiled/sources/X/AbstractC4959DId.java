package X;

/* renamed from: X.DId, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4959DId {
    public int A00 = -1;
    public final int A01;
    public final Class<?> A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && BV5.A1T(this, obj)) {
                AbstractC4959DId abstractC4959DId = (AbstractC4959DId) obj;
                if (!this.A03.equals(abstractC4959DId.A03) || !A00().equals(abstractC4959DId.A00()) || this.A01 != abstractC4959DId.A01 || this.A00 != abstractC4959DId.A00) {
                }
            }
            return false;
        }
        return true;
    }

    private final String A00() {
        Class<?> cls = this.A02;
        if (String.class.equals(cls)) {
            return "String";
        }
        if (Integer.class.equals(cls)) {
            return "Int";
        }
        if (Long.class.equals(cls)) {
            return "Long";
        }
        StringBuilder sb = new StringBuilder("Unsupported type: ");
        sb.append(cls);
        throw new IllegalArgumentException(sb.toString());
    }

    public final int hashCode() {
        return (((((this.A03.hashCode() * 17) + A00().hashCode()) * 17) + this.A01) * 17) + this.A00;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/lang/Class<*>;I)V */
    public AbstractC4959DId(Class cls, String str, int i) {
        this.A03 = str;
        this.A02 = cls;
        this.A01 = i;
    }
}
