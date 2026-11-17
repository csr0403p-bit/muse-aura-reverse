package X;

import android.content.Context;
import kotlin.Unit;

/* renamed from: X.Ast, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1879Ast extends Ab8<C2099AyO> {
    public final G0V<C1794ArD, Context, Unit> A00;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1879Ast) && this.A00 == ((C1879Ast) obj).A00);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        G0V<C1794ArD, Context, Unit> g0v = this.A00;
        C2099AyO c2099AyO = new C2099AyO();
        c2099AyO.A00 = g0v;
        C2294BSu c2294BSuA00 = C2294BSu.A00(c2099AyO, 20);
        C1796ArF c1796ArF = new C1796ArF();
        c1796ArF.A00 = c2294BSuA00;
        c2099AyO.A0G(c1796ArF);
        return c2099AyO;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "addTextContextMenuDataComponentsWithResources";
        asf.A02.A01("builder", this.A00);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        ((C2099AyO) abstractC1439Aj8).A00 = this.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1879Ast(G0V<? super C1794ArD, ? super Context, Unit> g0v) {
        this.A00 = g0v;
    }
}
