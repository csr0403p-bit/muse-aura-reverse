package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Af0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1222Af0 extends Ab8<C1221Aez> {
    public final Function0<Unit> A00;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1222Af0) && this.A00 == ((C1222Af0) obj).A00);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        return new C1221Aez(this.A00);
    }

    @Override // X.Ab8
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "stylusHandwriting";
        asf.A02.A01("onHandwritingSlopExceeded", this.A00);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        ((C1221Aez) abstractC1439Aj8).A00 = this.A00;
    }

    public C1222Af0(Function0<Unit> function0) {
        this.A00 = function0;
    }
}
