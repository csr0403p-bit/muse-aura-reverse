package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class Av5 implements InterfaceC2045AxD {
    public final /* synthetic */ long A03;
    public final /* synthetic */ InterfaceC2072Axn A04;
    public final /* synthetic */ Function0<InterfaceC1497Ak4> A05;
    public long A01 = 0;
    public long A00 = 0;
    public Ay9 A02 = C2025Awe.A02;

    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function0<+LX/Ak4;>;LX/Axn;J)V */
    public Av5(InterfaceC2072Axn interfaceC2072Axn, Function0 function0, long j) {
        this.A05 = function0;
        this.A04 = interfaceC2072Axn;
        this.A03 = j;
    }

    @Override // X.InterfaceC2045AxD
    public final void ASa() {
    }

    @Override // X.InterfaceC2045AxD
    public final void ASf(long j) {
        InterfaceC1497Ak4 interfaceC1497Ak4Invoke = this.A05.invoke();
        if (interfaceC1497Ak4Invoke != null) {
            InterfaceC2072Axn interfaceC2072Axn = this.A04;
            long j2 = this.A03;
            if (interfaceC1497Ak4Invoke.isAttached() && AbstractC1965AvH.A00(interfaceC2072Axn, j2)) {
                long jA05 = AWx.A05(this.A00, j);
                this.A00 = jA05;
                long j3 = this.A01;
                long jA052 = AWx.A05(j3, jA05);
                if (interfaceC2072Axn.ARS(this.A02, interfaceC1497Ak4Invoke, jA052, j3, false, true)) {
                    this.A01 = jA052;
                    this.A00 = 0L;
                }
            }
        }
    }

    @Override // X.InterfaceC2045AxD
    public final void AW7(Ay9 ay9, long j) {
        this.A02 = ay9;
        InterfaceC1497Ak4 interfaceC1497Ak4Invoke = this.A05.invoke();
        if (interfaceC1497Ak4Invoke != null) {
            InterfaceC2072Axn interfaceC2072Axn = this.A04;
            if (!interfaceC1497Ak4Invoke.isAttached()) {
                return;
            }
            Ay9 ay92 = this.A02;
            G2j<? super Boolean, ? super InterfaceC1497Ak4, ? super AWx, ? super Ay9, Unit> g2j = ((C1949Aun) interfaceC2072Axn).A06;
            if (g2j != null) {
                g2j.invoke(true, interfaceC1497Ak4Invoke, AWx.A0B(j), ay92);
            }
            this.A01 = j;
        }
        if (AbstractC1965AvH.A00(this.A04, this.A03)) {
            this.A00 = 0L;
        }
    }

    @Override // X.InterfaceC2045AxD
    public final void AWF() {
        Function0<Unit> function0;
        InterfaceC2072Axn interfaceC2072Axn = this.A04;
        if (!AbstractC1965AvH.A00(interfaceC2072Axn, this.A03) || (function0 = ((C1949Aun) interfaceC2072Axn).A01) == null) {
            return;
        }
        function0.invoke();
    }

    @Override // X.InterfaceC2045AxD
    public final void AWw() {
    }

    @Override // X.InterfaceC2045AxD
    public final void onCancel() {
        Function0<Unit> function0;
        InterfaceC2072Axn interfaceC2072Axn = this.A04;
        if (!AbstractC1965AvH.A00(interfaceC2072Axn, this.A03) || (function0 = ((C1949Aun) interfaceC2072Axn).A01) == null) {
            return;
        }
        function0.invoke();
    }
}
