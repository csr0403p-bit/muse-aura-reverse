package X;

import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FYS extends AbstractC7559F3s implements Function0 {
    public final int $t;
    public final int A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FYS(int i, int i2) {
        super(0);
        this.$t = i2;
        this.A00 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        return String.valueOf(Integer.valueOf(this.A00));
    }
}
