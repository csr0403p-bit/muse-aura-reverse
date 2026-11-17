package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FYU extends AbstractC7559F3s implements Function0 {
    public final int $t;
    public final String A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FYU(String str, int i) {
        super(0);
        this.$t = i;
        this.A00 = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.$t != 0) {
            return this.A00;
        }
        AbstractC7724FCa.A01.remove(this.A00);
        return Unit.INSTANCE;
    }
}
