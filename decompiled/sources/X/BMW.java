package X;

import X.AEs;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class BMW<VM extends AEs> implements F0C<VM> {
    public VM A00;
    public final Function0<A6J> A01;
    public final Function0<InterfaceC08439ui> A02;
    public final Function0<BJt> A03;
    public final C9uG<VM> A04;

    @Override // X.F0C
    public final boolean AOX() {
        return AnonymousClass002.A1X(this.A00);
    }

    @Override // X.F0C
    public final /* bridge */ /* synthetic */ Object getValue() {
        VM vm = this.A00;
        if (vm != null) {
            return vm;
        }
        VM vm2 = (VM) BON.A00(this.A02.invoke(), this.A03.invoke(), this.A01.invoke()).A02(this.A04);
        this.A00 = vm2;
        return vm2;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/9uG<TVM;>;Lkotlin/jvm/functions/Function0<+LX/BJt;>;Lkotlin/jvm/functions/Function0<+LX/9ui;>;Lkotlin/jvm/functions/Function0<+LX/A6J;>;)V */
    public BMW(Function0 function0, Function0 function02, Function0 function03, C9uG c9uG) {
        this.A04 = c9uG;
        this.A03 = function0;
        this.A02 = function02;
        this.A01 = function03;
    }
}
