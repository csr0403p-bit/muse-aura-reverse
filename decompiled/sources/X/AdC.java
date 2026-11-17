package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AdC extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ int $it;
    public final /* synthetic */ LazyGridState $lazyGridState;
    public final /* synthetic */ String $scrollToEarlierYearsLabel;
    public final /* synthetic */ String $scrollToLaterYearsLabel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdC(LazyGridState lazyGridState, String str, String str2, C3UX c3ux, int i) {
        super(1);
        this.$lazyGridState = lazyGridState;
        this.$it = i;
        this.$coroutineScope = c3ux;
        this.$scrollToEarlierYearsLabel = str;
        this.$scrollToLaterYearsLabel = str2;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        List listAsList;
        Ae6 ae6;
        InterfaceC0857A6e interfaceC0857A6e2 = interfaceC0857A6e;
        if (this.$lazyGridState.A09.A03.AGd() == this.$it || ((ae6 = (Ae6) AbstractC0878AGe.A0I(C8j4.A0U(this.$lazyGridState.A0I).A0D)) != null && ((Ad0) ae6).A08 == this.$it)) {
            LazyGridState lazyGridState = this.$lazyGridState;
            C3UX c3ux = this.$coroutineScope;
            listAsList = Arrays.asList(new BHP(this.$scrollToEarlierYearsLabel, new C2335BUj(1, c3ux, lazyGridState)), new BHP(this.$scrollToLaterYearsLabel, new C2335BUj(0, c3ux, lazyGridState)));
        } else {
            listAsList = C0881AGi.A00;
        }
        AbstractC1564Ale.A0C(interfaceC0857A6e2, listAsList);
        return Unit.INSTANCE;
    }
}
