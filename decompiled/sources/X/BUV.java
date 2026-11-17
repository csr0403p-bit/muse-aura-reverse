package X;

import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class BUV extends AbstractC7559F3s implements Function0 {
    public final int $t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BUV(int i) {
        super(0);
        this.$t = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
            case 7:
                return Unit.INSTANCE;
            case 1:
                return AnonymousClass001.A0h();
            case 2:
                return "DEFAULT_TEST_TAG";
            case 3:
                return UUID.randomUUID();
            case 4:
                F0C f0c = B15.A02;
                return null;
            case 5:
            case 6:
            case 8:
            case 12:
            default:
                return null;
            case 9:
                return C60O.A0k();
            case 10:
                return AnonymousClass001.A0i();
            case 11:
                return BRY.A00;
            case 13:
                return C3cG.A19(C9tf.A00);
            case 14:
                return AnonymousClass001.A13();
            case 15:
                return C3cG.A19(C9gv.A00);
            case 16:
                C07779iq c07779iq = C07779iq.A01;
                return new C9tS(c07779iq, c07779iq);
        }
    }
}
