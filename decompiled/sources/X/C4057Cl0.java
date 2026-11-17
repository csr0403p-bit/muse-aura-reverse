package X;

import java.util.ArrayDeque;

/* renamed from: X.Cl0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4057Cl0 implements InterfaceC4069ClG {
    public final int A00;
    public final InterfaceC4069ClG A01;
    public final /* synthetic */ C4052Ckv A02;

    public C4057Cl0(InterfaceC4069ClG interfaceC4069ClG, C4052Ckv c4052Ckv, int i) {
        this.A02 = c4052Ckv;
        this.A00 = i;
        this.A01 = interfaceC4069ClG;
    }

    @Override // X.InterfaceC4069ClG
    public final void ATB() {
        Runnable runnablePoll;
        int i = this.A00;
        C4052Ckv c4052Ckv = this.A02;
        synchronized (c4052Ckv) {
            Cl9 cl9 = c4052Ckv.A01.get(i);
            if (cl9 != null) {
                cl9.A00 = null;
                cl9.A00 = null;
                ArrayDeque<Runnable> arrayDeque = cl9.A01;
                if (arrayDeque != null && (runnablePoll = arrayDeque.poll()) != null) {
                    runnablePoll.run();
                }
            }
            this.A01.ATB();
        }
    }

    @Override // X.InterfaceC4069ClG
    public final void AXM(boolean z) {
        this.A01.AXM(z);
    }
}
