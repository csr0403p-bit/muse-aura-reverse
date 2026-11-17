package X;

import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* renamed from: X.3bq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05443bq extends AbstractC7559F3s implements Function0 {
    public final int $t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05443bq(int i) {
        super(0);
        this.$t = i;
    }

    public static AGO A00(int i) {
        return new AGO(new C05443bq(i));
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                long j = C1X0.A0J;
                return new C04921Xv(j, C1X0.A09, C1X0.A0K, C1X0.A0A, C1X0.A04, C1X0.A0M, C1X0.A0B, C1X0.A0N, C1X0.A0C, C1X0.A0X, C1X0.A0F, C1X0.A0Y, C1X0.A0G, C1X0.A00, C1X0.A06, C1X0.A0O, C1X0.A0D, C1X0.A0W, C1X0.A0E, j, C1X0.A05, C1X0.A03, C1X0.A01, C1X0.A07, C1X0.A02, C1X0.A08, C1X0.A0H, C1X0.A0I, C1X0.A0L, C1X0.A0P, C1X0.A0V, C1X0.A0Q, C1X0.A0R, C1X0.A0S, C1X0.A0T, C1X0.A0U);
            case 1:
            case 21:
                return AnonymousClass001.A0i();
            case 2:
                return new B6A(B6A.A01);
            case 3:
                return AnonymousClass002.A0P("");
            case 4:
            case 16:
            case 17:
                return AnonymousClass005.A0Q();
            case 5:
            case 8:
            case 13:
                return AnonymousClass001.A0h();
            case 6:
            case 14:
                return UUID.randomUUID();
            case 7:
                return new C05061Yl(B6A.A07);
            case 9:
                return new C1AI(null, 31);
            case 10:
                return C1DG.A03();
            case 11:
                return C0ys.A00;
            case 12:
                C1822Arm c1822Arm = null;
                return new HWA(c1822Arm, c1822Arm, c1822Arm, c1822Arm, c1822Arm, c1822Arm, c1822Arm, c1822Arm, c1822Arm, 32767);
            case 15:
            case 18:
            case 19:
            default:
                return null;
            case 20:
                return Float.valueOf(1.0f);
        }
    }
}
