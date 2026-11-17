package X;

import androidx.compose.runtime.MutableState;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Aun, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1949Aun implements InterfaceC2072Axn {
    public static final AFs<C1949Aun, Long> A0C = C0872AFu.A01(C2282BSi.A00(8), 31);
    public AtomicLong A00;
    public Function0<Unit> A01;
    public G0U<? super Long, Unit> A02;
    public G0U<? super Long, Unit> A03;
    public G0U<? super Long, Unit> A04;
    public G0V<? super Boolean, ? super Long, Unit> A05;
    public G2j<? super Boolean, ? super InterfaceC1497Ak4, ? super AWx, ? super Ay9, Unit> A06;
    public G2l<? super Boolean, ? super InterfaceC1497Ak4, ? super AWx, ? super AWx, ? super Boolean, ? super Ay9, Boolean> A07;
    public boolean A08;
    public final AXI<InterfaceC2043AxB> A09;
    public final MutableState A0A;
    public final List<InterfaceC2043AxB> A0B;

    public final List<InterfaceC2043AxB> A00(InterfaceC1497Ak4 interfaceC1497Ak4) {
        if (!this.A08) {
            AbstractC0885AGm.A16(new C2296BSw(interfaceC1497Ak4, 11), this.A0B, 4);
            this.A08 = true;
        }
        return this.A0B;
    }

    @Override // X.InterfaceC2072Axn
    public final boolean ARS(Ay9 ay9, InterfaceC1497Ak4 interfaceC1497Ak4, long j, long j2, boolean z, boolean z2) {
        G2l<? super Boolean, ? super InterfaceC1497Ak4, ? super AWx, ? super AWx, ? super Boolean, ? super Ay9, Boolean> g2l = this.A07;
        if (g2l != null) {
            return AnonymousClass001.A1X(g2l.invoke(Boolean.valueOf(z2), interfaceC1497Ak4, AWx.A0B(j), AWx.A0B(j2), Boolean.valueOf(z), ay9));
        }
        return true;
    }

    @Override // X.InterfaceC2072Axn
    public final void Ahn(InterfaceC2043AxB interfaceC2043AxB) {
        AXI<InterfaceC2043AxB> axi = this.A09;
        long j = ((C1941Aue) interfaceC2043AxB).A02;
        if (axi.A06(j)) {
            this.A0B.remove(interfaceC2043AxB);
            axi.A08(j);
            G0U<? super Long, Unit> g0u = this.A02;
            if (g0u != null) {
                g0u.invoke(Long.valueOf(j));
            }
        }
    }

    public C1949Aun(long j) {
        this.A0B = C3cG.A0h();
        this.A09 = AXJ.A00();
        this.A00 = new AtomicLong(j);
        this.A0A = AbstractC1798ArH.A06(AXJ.A00);
    }

    public C1949Aun() {
        this(1L);
    }
}
