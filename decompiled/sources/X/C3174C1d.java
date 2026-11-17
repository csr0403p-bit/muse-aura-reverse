package X;

import android.os.PowerManager;
import android.os.Process;
import android.os.SystemClock;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.C1d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3174C1d extends CAH<C3175C1e> {
    public final F18<PowerManager> A00;
    public final String A01;
    public volatile boolean A02;

    @Override // X.DHp
    public final boolean isEnabled(InterfaceC3173C1c interfaceC3173C1c) {
        C7384Etj.A0Y(interfaceC3173C1c, 0);
        return interfaceC3173C1c.isCpuStatsEnabled();
    }

    @Override // X.DHp
    public final /* bridge */ /* synthetic */ ListenableFuture decorateEvent(COt cOt, Object obj, Object obj2) {
        C3175C1e c3175C1e = (C3175C1e) obj;
        C3175C1e c3175C1e2 = (C3175C1e) obj2;
        C7384Etj.A0Y(cOt, 0);
        if (c3175C1e != null && c3175C1e2 != null) {
            EtT.A01(CAH.A01(CAH.A01(cOt.AHg(), cOt, "start_pri", c3175C1e.A00), cOt, "stop_pri", c3175C1e2.A00), String.valueOf(c3175C1e2.A02 - c3175C1e.A02), "ps_cpu_ms");
            if (c3175C1e.A01 == c3175C1e2.A01) {
                EtT.A01(cOt.AHg(), Long.valueOf(c3175C1e2.A03 - c3175C1e.A03), "th_cpu_ms");
            }
            EtT.A01(cOt.AHg(), c3175C1e.A04, "low_power_state");
        }
        return CPZ.A01;
    }

    @Override // X.DHp
    public final String getProviderName() {
        return this.A01;
    }

    @Override // X.DHp
    public final int getProviderTypeId() {
        return 9;
    }

    @Override // X.DHp
    public final Class<C3175C1e> getSnapshotType() {
        return C3175C1e.class;
    }

    public C3174C1d(F18<PowerManager> f18) {
        this.A00 = f18;
        this.A01 = "cpu_stats";
    }

    @Override // X.CAH
    public final /* bridge */ /* synthetic */ C3175C1e snapshot() throws IllegalArgumentException {
        F18<PowerManager> f18;
        int iMyTid = Process.myTid();
        int threadPriority = Process.getThreadPriority(iMyTid);
        long elapsedCpuTime = Process.getElapsedCpuTime();
        long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        String str = "unknown";
        if (!this.A02 && (f18 = this.A00) != null) {
            try {
                str = f18.AMN().isPowerSaveMode() ? "true" : "false";
            } catch (Exception unused) {
                this.A02 = true;
            }
        }
        return new C3175C1e(str, iMyTid, threadPriority, elapsedCpuTime, jCurrentThreadTimeMillis);
    }

    public C3174C1d() {
        this(null);
    }
}
