package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.3bN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3bN implements Ht9, Function0 {
    public final int $t;

    public C3bN(int i) {
        this.$t = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return C05131Yy.A00;
            case 1:
            case 2:
            case 3:
                return Unit.INSTANCE;
            case 4:
                return C1BS.A00;
            case 5:
                long j = B6A.A08;
                long j2 = B6A.A01;
                return new C17s(4284612846L << 32, 4281794739L << 32, 4278442694L << 32, 4278290310L << 32, j, j, 4289724448L << 32, j, j2, j2, j2, j);
            case 6:
                return Float.valueOf(1.0f);
            case 7:
                return new C17k(null, null, null, null, 7);
            case 8:
                return C19R.A01;
            case 9:
                C1804ArN c1804ArN = C19R.A02;
                return new C19S();
            case 10:
                return C1YH.A00;
            case 11:
                return C17t.A0R;
            case 12:
                throw new IllegalStateException("Unexpected access to LocalNavAnimatedContentScope. You should only access LocalNavAnimatedContentScope inside a NavEntry passed to NavDisplay. AnimatedContentScope in OverlayScenes are no-op.");
            default:
                return null;
        }
    }
}
