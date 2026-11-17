package X;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* renamed from: X.14c, reason: invalid class name */
/* loaded from: classes.dex */
public final class C14c extends AbstractC7559F3s implements G0U<C1958Aux, Unit> {
    public final /* synthetic */ String $affordance;
    public final /* synthetic */ MutableState<Boolean> $expanded$delegate;
    public final /* synthetic */ MutableState<Integer> $head$delegate;
    public final /* synthetic */ G0U<C1958Aux, Unit> $onTextLayout;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/G0U<-LX/Aux;Lkotlin/Unit;>;Ljava/lang/String;Landroidx/compose/runtime/MutableState<Ljava/lang/Boolean;>;Landroidx/compose/runtime/MutableState<Ljava/lang/Integer;>;)V */
    public C14c(MutableState mutableState, MutableState mutableState2, String str, G0U g0u) {
        super(1);
        this.$onTextLayout = g0u;
        this.$affordance = str;
        this.$expanded$delegate = mutableState;
        this.$head$delegate = mutableState2;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(C1958Aux c1958Aux) {
        C1958Aux c1958Aux2 = c1958Aux;
        C7384Etj.A0Y(c1958Aux2, 0);
        this.$onTextLayout.invoke(c1958Aux2);
        if (!MutableState.A0A((MutableState) this.$expanded$delegate)) {
            MutableState<Integer> mutableState = this.$head$delegate;
            int iA02 = MutableState.A02((MutableState) mutableState);
            int length = this.$affordance.length();
            if (c1958Aux2.A0A()) {
                C1956Auv c1956Auv = c1958Aux2.A03;
                int iA0A = c1956Auv.A0A(c1956Auv.A02 - 1, true) - length;
                if (iA0A < 0) {
                    iA0A = 0;
                }
                if (iA02 < 0) {
                    iA02 = iA0A;
                } else {
                    iA02 = Math.min(iA02 - 1, iA0A);
                    if (iA02 < 0) {
                        iA02 = 0;
                    }
                }
            } else if (iA02 == -1) {
                iA02 = -2;
            }
            MutableState.A07(iA02, mutableState);
        }
        return Unit.INSTANCE;
    }
}
