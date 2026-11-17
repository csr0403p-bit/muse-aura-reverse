package X;

import java.time.Instant;
import java.time.ZoneId;
import kotlin.jvm.functions.Function0;

/* renamed from: X.8in, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C07348in extends AbstractC7559F3s implements Function0 {
    public final int $t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C07348in(int i) {
        super(0);
        this.$t = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        Object objNow;
        C9hr c9hr;
        switch (this.$t) {
            case 1:
                objNow = Instant.now();
                break;
            case 2:
                objNow = ZoneId.systemDefault();
                break;
            case 3:
                c9hr = C8ME.A00;
                return C3cG.A19(c9hr);
            case 4:
            case 6:
                c9hr = C07779iq.A01;
                return C3cG.A19(c9hr);
            case 5:
                c9hr = C8QW.A00;
                return C3cG.A19(c9hr);
            default:
                return null;
        }
        C7384Etj.A0U(objNow);
        return objNow;
    }
}
