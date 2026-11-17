package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Axe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2064Axe extends AbstractC1439Aj8 implements InterfaceC1332AhJ {
    public Object A00;
    public Function0<Unit> A01;
    public boolean A02;

    @Override // X.AbstractC1439Aj8
    public final void onReset() {
        this.A02 = false;
    }

    @Override // X.InterfaceC1332AhJ
    public final /* synthetic */ void onMeasureResultChanged() {
    }

    @Override // X.InterfaceC1332AhJ
    public final void draw(C16Z c16z) {
        C16Z.A00(c16z);
        if (this.A02) {
            return;
        }
        this.A02 = true;
        BJW.A00.postAtFrontOfQueue(new RunnableC2090AyF(this));
    }
}
