package com.facebook.aura.qpl.module;

import X.AbstractC3625Ca8;
import X.C31u;
import X.C3cG;
import X.InterfaceC7359EnW;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.qpl.module.MC;

/* loaded from: classes5.dex */
public final class AuraQplModule$provideQuickPerformanceLoggerGKs$1$getMetadataGKs$1 extends AbstractC3625Ca8 {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {C3cG.A0y(AuraQplModule$provideQuickPerformanceLoggerGKs$1$getMetadataGKs$1.class, "isMemoryStatsEnabled", "isMemoryStatsEnabled()Z"), C3cG.A0y(AuraQplModule$provideQuickPerformanceLoggerGKs$1$getMetadataGKs$1.class, "isRuntimeStatsEnabled", "isRuntimeStatsEnabled()Z"), C3cG.A0y(AuraQplModule$provideQuickPerformanceLoggerGKs$1$getMetadataGKs$1.class, "isCpuStatsEnabled", "isCpuStatsEnabled()Z"), C3cG.A0y(AuraQplModule$provideQuickPerformanceLoggerGKs$1$getMetadataGKs$1.class, "isThermalStatsEnabled", "isThermalStatsEnabled()Z")};
    public final C31u isMemoryStatsEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.mwa_qpl_metadata.enable_memory_stats);
    public final C31u isRuntimeStatsEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.mwa_qpl_metadata.enable_runtime_stats);
    public final C31u isCpuStatsEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.mwa_qpl_metadata.enable_cpu_stats);
    public final C31u isThermalStatsEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.mwa_qpl_metadata.enable_thermal_stats);
    public final boolean isNetworkStatsEnabled = true;
    public final boolean isNetworkConnectivityEnabled = true;
    public final boolean isPowerStatsEnabled = true;

    @Override // X.AbstractC3625Ca8, X.InterfaceC3173C1c
    public boolean isCpuStatsEnabled() {
        return C31u.A01(this, this.isCpuStatsEnabled$delegate, $$delegatedProperties, 2);
    }

    @Override // X.AbstractC3625Ca8, X.InterfaceC3173C1c
    public boolean isMemoryStatsEnabled() {
        return C31u.A01(this, this.isMemoryStatsEnabled$delegate, $$delegatedProperties, 0);
    }

    @Override // X.AbstractC3625Ca8
    public boolean isNetworkConnectivityEnabled() {
        return this.isNetworkConnectivityEnabled;
    }

    @Override // X.AbstractC3625Ca8
    public boolean isNetworkStatsEnabled() {
        return this.isNetworkStatsEnabled;
    }

    @Override // X.AbstractC3625Ca8
    public boolean isPowerStatsEnabled() {
        return this.isPowerStatsEnabled;
    }

    @Override // X.AbstractC3625Ca8, X.InterfaceC3173C1c
    public boolean isRuntimeStatsEnabled() {
        return C31u.A01(this, this.isRuntimeStatsEnabled$delegate, $$delegatedProperties, 1);
    }

    @Override // X.AbstractC3625Ca8, X.InterfaceC3173C1c
    public boolean isThermalStatsEnabled() {
        return C31u.A01(this, this.isThermalStatsEnabled$delegate, $$delegatedProperties, 3);
    }
}
