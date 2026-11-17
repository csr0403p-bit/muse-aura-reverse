package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class Av6 implements InterfaceC2076Axr {
    public long A00 = 0;
    public final /* synthetic */ long A01;
    public final /* synthetic */ InterfaceC2072Axn A02;
    public final /* synthetic */ Function0<InterfaceC1497Ak4> A03;

    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function0<+LX/Ak4;>;LX/Axn;J)V */
    public Av6(InterfaceC2072Axn interfaceC2072Axn, Function0 function0, long j) {
        this.A03 = function0;
        this.A02 = interfaceC2072Axn;
        this.A01 = j;
    }

    @Override // X.InterfaceC2076Axr
    public final boolean ASe(Ay9 ay9, long j) {
        InterfaceC1497Ak4 interfaceC1497Ak4Invoke = this.A03.invoke();
        if (interfaceC1497Ak4Invoke != null) {
            InterfaceC2072Axn interfaceC2072Axn = this.A02;
            long j2 = this.A01;
            if (!interfaceC1497Ak4Invoke.isAttached() || !AbstractC1965AvH.A00(interfaceC2072Axn, j2)) {
                return false;
            }
            if (interfaceC2072Axn.ARS(ay9, interfaceC1497Ak4Invoke, j, this.A00, false, false)) {
                this.A00 = j;
            }
        }
        return true;
    }

    @Override // X.InterfaceC2076Axr
    public final void ASg() {
        Function0<Unit> function0 = ((C1949Aun) this.A02).A01;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // X.InterfaceC2076Axr
    public final boolean ATE(long j) {
        InterfaceC1497Ak4 interfaceC1497Ak4Invoke = this.A03.invoke();
        if (interfaceC1497Ak4Invoke != null) {
            InterfaceC2072Axn interfaceC2072Axn = this.A02;
            long j2 = this.A01;
            if (interfaceC1497Ak4Invoke.isAttached()) {
                if (interfaceC2072Axn.ARS(C2025Awe.A02, interfaceC1497Ak4Invoke, j, this.A00, false, false)) {
                    this.A00 = j;
                }
                return AbstractC1965AvH.A00(interfaceC2072Axn, j2);
            }
        }
        return false;
    }

    @Override // X.InterfaceC2076Axr
    public final boolean ATF(long j) {
        InterfaceC1497Ak4 interfaceC1497Ak4Invoke = this.A03.invoke();
        if (interfaceC1497Ak4Invoke != null) {
            InterfaceC2072Axn interfaceC2072Axn = this.A02;
            long j2 = this.A01;
            if (!interfaceC1497Ak4Invoke.isAttached() || !AbstractC1965AvH.A00(interfaceC2072Axn, j2)) {
                return false;
            }
            if (interfaceC2072Axn.ARS(C2025Awe.A02, interfaceC1497Ak4Invoke, j, this.A00, false, false)) {
                this.A00 = j;
            }
        }
        return true;
    }

    @Override // X.InterfaceC2076Axr
    public final boolean AW8(Ay9 ay9, int i, long j) {
        InterfaceC1497Ak4 interfaceC1497Ak4Invoke = this.A03.invoke();
        if (interfaceC1497Ak4Invoke != null) {
            InterfaceC2072Axn interfaceC2072Axn = this.A02;
            long j2 = this.A01;
            if (interfaceC1497Ak4Invoke.isAttached()) {
                G2j<? super Boolean, ? super InterfaceC1497Ak4, ? super AWx, ? super Ay9, Unit> g2j = ((C1949Aun) interfaceC2072Axn).A06;
                if (g2j != null) {
                    g2j.invoke(false, interfaceC1497Ak4Invoke, AWx.A0B(j), ay9);
                }
                this.A00 = j;
                return AbstractC1965AvH.A00(interfaceC2072Axn, j2);
            }
        }
        return false;
    }
}
