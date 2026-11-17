package X;

/* renamed from: X.75s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C063675s {
    public final Integer A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C063675s) {
                C063675s c063675s = (C063675s) obj;
                if (this.A01 != c063675s.A01 || this.A00 != c063675s.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public static C063675s A00(Integer num) {
        return new C063675s(num, num);
    }

    public static C063675s A01(Integer num, Integer num2) {
        return new C063675s(num, num2);
    }

    public static HxE A02(Integer num, Integer num2, Object obj) {
        return new HxE(new C063675s(num, num2), obj);
    }

    public static HxE A03(Integer num, Object obj) {
        return new HxE(new C063675s(num, num), obj);
    }

    public final int hashCode() {
        Integer num = this.A01;
        int iHashCode = (AnonymousClass768.A00(num).hashCode() + num.intValue()) * 31;
        Integer num2 = this.A00;
        return iHashCode + AnonymousClass768.A00(num2).hashCode() + num2.intValue();
    }

    public final String toString() {
        return FGI.A0e("SizeSelector(width=", AnonymousClass768.A00(this.A01), ", height=", AnonymousClass768.A00(this.A00), ')');
    }

    public C063675s(Integer num, Integer num2) {
        this.A01 = num;
        this.A00 = num2;
    }
}
