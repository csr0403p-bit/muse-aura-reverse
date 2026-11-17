package X;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AGN<T> extends AKH<T> {
    public final ATF<T> A00;

    @Override // X.AKH
    public final AKJ<T> A04(T t) {
        return new AKJ<>(this, null, this.A00, t, null, t == null, true);
    }

    public static AGN A00(int i) {
        return new AGN(AGE.A00, new C2283BSj(i));
    }

    public AGN(ATF<T> atf, Function0<? extends T> function0) {
        super(function0);
        this.A00 = atf;
    }
}
