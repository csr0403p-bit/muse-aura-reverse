package X;

/* renamed from: X.Gmq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9976Gmq extends AbstractC10130Gpv {
    public static final long serialVersionUID = 1;

    @Override // X.AbstractC9944Glx
    public final Object A0M(AbstractC9904Gkk abstractC9904Gkk, Object[] objArr) {
        Object obj = objArr[0];
        C9517GMk c9517GMk = obj instanceof C9517GMk ? (C9517GMk) obj : new C9517GMk(obj);
        Object obj2 = objArr[1];
        long jA05 = obj2 == null ? 0L : C3cG.A05(obj2);
        Object obj3 = objArr[2];
        long jA052 = obj3 == null ? 0L : C3cG.A05(obj3);
        Object obj4 = objArr[3];
        int iA0F = obj4 == null ? 0 : AnonymousClass001.A0F(obj4);
        Object obj5 = objArr[4];
        return new C9516GMj(c9517GMk, iA0F, obj5 == null ? 0 : AnonymousClass001.A0F(obj5), jA05, jA052);
    }

    public C9976Gmq() {
        super(C9516GMj.class);
    }

    public static C9936Glf A00(AbstractC9870GjI abstractC9870GjI, String str, int i) {
        return new C9936Glf(null, abstractC9870GjI, C10034GoA.A02, C10009Gnh.A00(str), null, null, null, i);
    }
}
