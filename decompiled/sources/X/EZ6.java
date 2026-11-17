package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class EZ6 extends C7438Evz implements Function0 {
    public final int $t;

    /* JADX WARN: Illegal instructions before constructor call */
    public EZ6(Object obj, int i) {
        Class cls;
        String str;
        String str2;
        this.$t = i;
        switch (i) {
            case 0:
                cls = Ct9.class;
                str = "hasAuthenticationResults()Z";
                str2 = "hasAuthenticationResults";
                break;
            case 1:
                cls = Ct9.class;
                str = "hasRemoteResults()Z";
                str2 = "hasRemoteResults";
                break;
            default:
                cls = EIN.class;
                str = "onClosed()V";
                str2 = "onClosed";
                break;
        }
        super(0, obj, cls, str2, str, 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        boolean zA00;
        switch (this.$t) {
            case 0:
                zA00 = Ct9.A00((Ct9) this.receiver);
                break;
            case 1:
                zA00 = Ct9.A01((Ct9) this.receiver);
                break;
            default:
                ((EIN) this.receiver).onClosed();
                return Unit.INSTANCE;
        }
        return Boolean.valueOf(zA00);
    }
}
