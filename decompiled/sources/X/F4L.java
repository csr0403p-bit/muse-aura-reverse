package X;

/* loaded from: classes5.dex */
public final class F4L implements EYY {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public F4L(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    @Override // X.EYY
    public final <T> AbstractC6735EXt<T> create(EYC eyc, C6753EYn<T> c6753EYn) {
        switch (this.$t) {
            case 0:
                if (!c6753EYn.equals(this.A00)) {
                    return null;
                }
                break;
            case 1:
                if (c6753EYn.A01 != this.A00) {
                    return null;
                }
                break;
            default:
                Class<? super T> cls = c6753EYn.A01;
                if (((Class) this.A00).isAssignableFrom(cls)) {
                    return new EY6(this, cls);
                }
                return null;
        }
        return (AbstractC6735EXt) this.A01;
    }

    public final String toString() {
        String str;
        switch (this.$t) {
            case 1:
                str = "Factory[type=";
                break;
            case 2:
                str = "Factory[typeHierarchy=";
                break;
            default:
                return super.toString();
        }
        StringBuilder sbA0x = C60O.A0x(str);
        BV6.A18((Class) this.A00, sbA0x);
        sbA0x.append(",adapter=");
        return BV8.A0u(this.A01, sbA0x);
    }
}
