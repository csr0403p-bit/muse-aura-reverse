package X;

/* renamed from: X.GCt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9292GCt extends C9290GCr<Integer> implements C1BN<Integer> {
    @Override // X.C1BN
    public final /* bridge */ /* synthetic */ Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(AnonymousClass001.A0F(A00(this)));
        }
        return numValueOf;
    }

    public static Object A00(C9290GCr c9290GCr) {
        Object[] objArr = c9290GCr.A04;
        C7384Etj.A0X(objArr);
        return objArr[(objArr.length - 1) & ((int) ((c9290GCr.A03 + ((int) ((Math.min(c9290GCr.A02, r2) + c9290GCr.A00) - r2))) - 1))];
    }
}
