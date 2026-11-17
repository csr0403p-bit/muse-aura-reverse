package X;

import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.605, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass605 implements Ht9, Function0 {
    public final int $t;

    public AnonymousClass605(int i) {
        this.$t = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
            case 1:
            case 3:
            case 5:
                return Unit.INSTANCE;
            case 2:
            default:
                return null;
            case 4:
                return new HashSet();
        }
    }
}
