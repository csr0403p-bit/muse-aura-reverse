package X;

import android.content.Context;

/* renamed from: X.DeG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5251DeG extends AbstractC5263DeS implements InterfaceC5265DeU {
    public final Context A00;

    @Override // X.InterfaceC5266DeV
    public final /* bridge */ /* synthetic */ C5247DeC AAl() {
        C5247DeC c5247DeCAGU = ((AbstractC5252DeH) this).A00.AGU();
        c5247DeCAGU.A00.add(this);
        return c5247DeCAGU;
    }

    @Override // X.InterfaceC5266DeV
    public final void ABA(Object obj) {
        C5247DeC c5247DeC = (C5247DeC) obj;
        if (c5247DeC != null) {
            c5247DeC.A00();
        }
    }

    public C5251DeG(Context context, AbstractC5257DeM abstractC5257DeM) {
        super(abstractC5257DeM);
        this.A00 = context;
    }
}
