package X;

import android.os.Debug;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.C1a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3172C1a extends CAH<C1b> {
    @Override // X.DHp
    public final boolean isEnabled(InterfaceC3173C1c interfaceC3173C1c) {
        C7384Etj.A0Y(interfaceC3173C1c, 0);
        return interfaceC3173C1c.isRuntimeStatsEnabled();
    }

    @Override // X.CAH
    public final /* bridge */ /* synthetic */ C1b snapshot() {
        C1b c1b = new C1b();
        c1b.A01 = -1;
        c1b.A03 = -1L;
        c1b.A00 = -1;
        c1b.A02 = -1L;
        String runtimeStat = Debug.getRuntimeStat("art.gc.gc-count");
        if (runtimeStat != null) {
            c1b.A01 = Integer.parseInt(runtimeStat);
        }
        if (Debug.getRuntimeStat("art.gc.gc-time") != null) {
            c1b.A03 = Integer.parseInt(r0);
        }
        String runtimeStat2 = Debug.getRuntimeStat("art.gc.blocking-gc-count");
        if (runtimeStat2 != null) {
            c1b.A00 = Integer.parseInt(runtimeStat2);
        }
        if (Debug.getRuntimeStat("art.gc.blocking-gc-time") != null) {
            c1b.A02 = Integer.parseInt(r0);
        }
        return c1b;
    }

    @Override // X.DHp
    public final /* bridge */ /* synthetic */ ListenableFuture decorateEvent(COt cOt, Object obj, Object obj2) {
        C1b c1b = (C1b) obj;
        C1b c1b2 = (C1b) obj2;
        C7384Etj.A0Y(cOt, 0);
        if (c1b != null && c1b2 != null) {
            EtT.A01(CAH.A01(COt.A00(CAH.A01(cOt.AHg(), cOt, "gc_count", c1b2.A01 - c1b.A01), cOt, "gc_time_ms", c1b2.A03 - c1b.A03), cOt, "blocking_gc_count", c1b2.A00 - c1b.A00), Long.valueOf(c1b2.A02 - c1b.A02), "blocking_gc_time_ms");
        }
        return CPZ.A01;
    }

    @Override // X.DHp
    public final String getProviderName() {
        return "runtime_stats";
    }

    @Override // X.DHp
    public final int getProviderTypeId() {
        return 38;
    }

    @Override // X.DHp
    public final Class<C1b> getSnapshotType() {
        return C1b.class;
    }
}
