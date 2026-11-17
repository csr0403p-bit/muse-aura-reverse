package X;

import kotlin.Unit;

/* renamed from: X.604, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass604 implements Ht9, G0U {
    public final int $t;

    public AnonymousClass604(int i) {
        this.$t = i;
    }

    @Override // X.G0U
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
            case 1:
                return Unit.INSTANCE;
            case 2:
                return AnonymousClass001.A0i();
            case 3:
                return obj;
            default:
                return null;
        }
    }
}
