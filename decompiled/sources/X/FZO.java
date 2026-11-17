package X;

import androidx.datastore.core.SingleProcessDataStore;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FZO extends AbstractC7559F3s implements Function0 {
    public final int $t;
    public final Object A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FZO(Object obj, SingleProcessDataStore<T> singleProcessDataStore) {
        super(0);
        this.$t = singleProcessDataStore;
        this.A00 = obj;
    }

    public static F0C A00(Integer num, Object obj, int i) {
        return AbstractC5321DgF.A02(num, new FZO(obj, i));
    }

    public static FZO A02(Object obj, int i) {
        return new FZO(obj, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            Method dump skipped, instructions count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FZO.invoke():java.lang.Object");
    }
}
