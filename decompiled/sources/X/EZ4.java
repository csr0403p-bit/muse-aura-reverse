package X;

import android.os.Looper;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class EZ4 extends AbstractC7559F3s implements Function0 {
    public final int $t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EZ4(int i) {
        super(0);
        this.$t = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        Looper looperA0D;
        boolean z;
        switch (this.$t) {
            case 0:
                looperA0D = BV5.A0D("SignalsInitialRenderWarmer");
                break;
            case 1:
                looperA0D = Looper.getMainLooper();
                break;
            case 2:
                AbstractC5053DRd abstractC5053DRd = (AbstractC5053DRd) BV5.A0Z(65561);
                C7491Exw c7491Exw = AbstractC6665EOa.A02;
                z = AbstractC5053DRd.A00(abstractC5053DRd, c7491Exw).getBoolean(c7491Exw);
                return Boolean.valueOf(z);
            case 3:
                z = false;
                return Boolean.valueOf(z);
            default:
                return null;
        }
        return BV4.A09(looperA0D);
    }
}
