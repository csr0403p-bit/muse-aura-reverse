package X;

import androidx.compose.material3.internal.AnchoredDraggableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.1rP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1rP extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ Function0<Unit> $animateToDismiss;
    public final /* synthetic */ String $collapseActionLabel;
    public final /* synthetic */ String $dismissActionLabel;
    public final /* synthetic */ String $expandActionLabel;
    public final /* synthetic */ C3UX $scope;
    public final /* synthetic */ C1Pn $sheetState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1rP(C1Pn c1Pn, String str, String str2, String str3, Function0<Unit> function0, C3UX c3ux) {
        super(1);
        this.$sheetState = c1Pn;
        this.$dismissActionLabel = str;
        this.$expandActionLabel = str2;
        this.$collapseActionLabel = str3;
        this.$animateToDismiss = function0;
        this.$scope = c3ux;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        C0920AHw<C0864A6l<Function0<Boolean>>> c0920AHw;
        C0864A6l c0864A6l;
        InterfaceC0857A6e interfaceC0857A6e2 = interfaceC0857A6e;
        C1Pn c1Pn = this.$sheetState;
        String str = this.$dismissActionLabel;
        String str2 = this.$expandActionLabel;
        String str3 = this.$collapseActionLabel;
        Function0<Unit> function0 = this.$animateToDismiss;
        C3UX c3ux = this.$scope;
        interfaceC0857A6e2.Aca(AbstractC1578Alt.A05, new C0864A6l(str, new C05453br(function0, 7)));
        AnchoredDraggableState<C1Vj> anchoredDraggableState = c1Pn.A00;
        Object value = anchoredDraggableState.A07.getValue();
        C1Vj c1Vj = C1Vj.PartiallyExpanded;
        if (value != c1Vj) {
            if (((C1E7) ((C3Sn) anchoredDraggableState.A06.getValue())).A00.containsKey(c1Vj)) {
                C05523by c05523by = new C05523by(2, c1Pn, c3ux);
                c0920AHw = AbstractC1578Alt.A01;
                c0864A6l = new C0864A6l(str3, c05523by);
            }
            return Unit.INSTANCE;
        }
        C3c5 c3c5 = new C3c5(c1Pn, c1Pn, c3ux, 1);
        c0920AHw = AbstractC1578Alt.A06;
        c0864A6l = new C0864A6l(str2, c3c5);
        interfaceC0857A6e2.Aca(c0920AHw, c0864A6l);
        return Unit.INSTANCE;
    }
}
