package X;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AKM<T> implements AKP<T> {
    public final F0C A00;

    @Override // X.AKP
    public final T AZc(AKQ akq) {
        return (T) this.A00.getValue();
    }

    @Override // X.AKP
    public final AKJ<T> Ah2(AKN<T> akn) {
        BBL.A02("Cannot produce a provider from a lazy value holder");
        throw F60.createAndThrow();
    }

    public AKM(Function0<? extends T> function0) {
        this.A00 = AbstractC5321DgF.A03(function0);
    }
}
