package X;

/* renamed from: X.CUn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3568CUn {
    public static C3565CUi<?> A00(String str, String str2) {
        final C3529CSk c3529CSk = new C3529CSk(str, str2);
        C3566CUj c3566CUjA00 = C3566CUj.A00(AbstractC3533CSo.class);
        c3566CUjA00.A01 = 1;
        return C3566CUj.A01(c3566CUjA00, new CUY(c3529CSk) { // from class: X.CUw
            public final Object A00;

            {
                this.A00 = c3529CSk;
            }

            @Override // X.CUY
            public final Object A7X(CUL cul) {
                return this.A00;
            }
        });
    }
}
