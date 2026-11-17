package X;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.BUb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2327BUb extends AbstractC7559F3s implements Function0 {
    public final int $t;
    public final Object A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2327BUb(Object obj, int i) {
        super(0);
        this.$t = i;
        this.A00 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return Boolean.valueOf(AnonymousClass002.A1X(((BAs) this.A00).A01.getValue()));
            case 1:
                ((Function0) this.A00).invoke();
                break;
            case 2:
                return Integer.valueOf(C1BO.A02(((PagerState) this.A00).A0W));
            case 3:
                return C60Q.A0W((List) this.A00);
            case 4:
                MutableState.A09(!MutableState.A0A(r1), (MutableState) this.A00);
                break;
            case 5:
                return ((Function0) this.A00).invoke();
            default:
                return Float.valueOf(C8j3.A06((MutableState) this.A00));
        }
        return Unit.INSTANCE;
    }
}
