package X;

import android.app.ActivityManager;
import android.os.Debug;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes5.dex */
public final class CAG implements DHp<CAF, CAF> {
    public final ActivityManager A00;
    public final CAI A01;

    public CAG(ActivityManager activityManager, CAI cai) {
        C7384Etj.A0Y(activityManager, 0);
        this.A00 = activityManager;
        this.A01 = cai;
    }

    @Override // X.DHp
    public final boolean isEnabled(InterfaceC3173C1c interfaceC3173C1c) {
        C7384Etj.A0Y(interfaceC3173C1c, 0);
        return interfaceC3173C1c.isMemoryStatsEnabled();
    }

    public static CAF A00(CAG cag) {
        ActivityManager activityManager = cag.A00;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return new CAF(memoryInfo, Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory(), Debug.getNativeHeapAllocatedSize());
    }

    @Override // X.DHp
    public final /* bridge */ /* synthetic */ ListenableFuture decorateEvent(COt cOt, CAF caf, CAF caf2) {
        CAF caf3 = caf;
        CAF caf4 = caf2;
        C7384Etj.A0Y(cOt, 0);
        if (caf4 != null) {
            EtT etTAHg = cOt.AHg();
            ActivityManager.MemoryInfo memoryInfo = caf4.A02;
            long j = memoryInfo.availMem;
            EtT.A01(COt.A00(COt.A00(etTAHg, cOt, "avail_mem", j), cOt, "low_mem", memoryInfo.threshold), Long.valueOf(memoryInfo.totalMem), "total_mem");
            if (caf3 != null) {
                EtT etTAHg2 = cOt.AHg();
                ActivityManager.MemoryInfo memoryInfo2 = caf3.A02;
                EtT etTA00 = COt.A00(etTAHg2, cOt, "avail_mem_delta", memoryInfo2.availMem - j);
                long j2 = caf4.A00;
                long j3 = caf3.A00;
                EtT etTA002 = COt.A00(etTA00, cOt, "java_heap_used", j2 - j3);
                long j4 = caf4.A01;
                long j5 = caf3.A01;
                EtT.A01(COt.A00(COt.A00(COt.A00(etTA002, cOt, "native_heap_used", j4 - j5), cOt, "java_heap_at_start", j3), cOt, "native_heap_at_start", j5), Boolean.valueOf(memoryInfo2.lowMemory), "is_low_memory");
            }
        }
        return CPZ.A01;
    }

    @Override // X.DHp
    public final String getProviderName() {
        return "memory_stats";
    }

    @Override // X.DHp
    public final int getProviderTypeId() {
        return 5;
    }

    @Override // X.DHp
    public final Class<CAF> getSnapshotType() {
        return CAF.class;
    }

    @Override // X.DHp
    public final Class<CAF> getStartType() {
        return CAF.class;
    }

    @Override // X.DHp
    public final /* bridge */ /* synthetic */ CAF snapshot(int i, int i2) {
        return A00(this);
    }

    @Override // X.DHp
    public final /* bridge */ /* synthetic */ CAF start(int i, int i2) {
        return A00(this);
    }
}
