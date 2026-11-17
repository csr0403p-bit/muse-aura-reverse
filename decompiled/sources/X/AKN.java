package X;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class AKN<T> {
    public final AKP<T> A00;

    public abstract AKP<T> A03(AKJ<T> akj, AKP<T> akp);

    public AKP<T> A02() {
        return this.A00;
    }

    public AKN(Function0<? extends T> function0) {
        this.A00 = new AKM(function0);
    }
}
