package com.facebook.aura.gateway;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.qpl.startup.points.HatchStartupPoints;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class VmFetchSource {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VmFetchSource[] $VALUES;
    public static final VmFetchSource ACTIVATION;
    public static final VmFetchSource CONFIDENTIAL_VM_SWITCH;
    public static final VmFetchSource CVM_SUBSCRIPTION_ENDED_CONTINUE;
    public static final VmFetchSource CVM_SUBSCRIPTION_RENEWED;
    public static final VmFetchSource GATEWAY_CONNECT;
    public static final VmFetchSource GATEWAY_RECOVERY;
    public static final VmFetchSource GATEWAY_SUBSCRIBE_STATUS;
    public static final VmFetchSource INTERNAL_STATUS;
    public static final VmFetchSource PRECONNECT_PREFETCH;
    public static final VmFetchSource STARTUP_JOB;
    public static final VmFetchSource VM_RECONNECT;
    public final String value;

    static {
        VmFetchSource vmFetchSource = new VmFetchSource("ACTIVATION", 0, HatchStartupPoints.SURFACE_ACTIVATION);
        ACTIVATION = vmFetchSource;
        VmFetchSource vmFetchSource2 = new VmFetchSource("CONFIDENTIAL_VM_SWITCH", 1, "confidential_vm_switch");
        CONFIDENTIAL_VM_SWITCH = vmFetchSource2;
        VmFetchSource vmFetchSource3 = new VmFetchSource("CVM_SUBSCRIPTION_ENDED_CONTINUE", 2, "cvm_subscription_ended_continue");
        CVM_SUBSCRIPTION_ENDED_CONTINUE = vmFetchSource3;
        VmFetchSource vmFetchSource4 = new VmFetchSource("CVM_SUBSCRIPTION_RENEWED", 3, "cvm_subscription_renewed");
        CVM_SUBSCRIPTION_RENEWED = vmFetchSource4;
        VmFetchSource vmFetchSource5 = new VmFetchSource("GATEWAY_CONNECT", 4, "gateway_connect");
        GATEWAY_CONNECT = vmFetchSource5;
        VmFetchSource vmFetchSource6 = new VmFetchSource("PRECONNECT_PREFETCH", 5, "preconnect_prefetch");
        PRECONNECT_PREFETCH = vmFetchSource6;
        VmFetchSource vmFetchSource7 = new VmFetchSource("GATEWAY_RECOVERY", 6, "gateway_recovery");
        GATEWAY_RECOVERY = vmFetchSource7;
        VmFetchSource vmFetchSource8 = new VmFetchSource("GATEWAY_SUBSCRIBE_STATUS", 7, "gateway_subscribe_status");
        GATEWAY_SUBSCRIBE_STATUS = vmFetchSource8;
        VmFetchSource vmFetchSource9 = new VmFetchSource("INTERNAL_STATUS", 8, "internal_status");
        INTERNAL_STATUS = vmFetchSource9;
        VmFetchSource vmFetchSource10 = new VmFetchSource("STARTUP_JOB", 9, "startup_job");
        STARTUP_JOB = vmFetchSource10;
        VmFetchSource vmFetchSource11 = new VmFetchSource("VM_RECONNECT", 10, "vm_reconnect");
        VM_RECONNECT = vmFetchSource11;
        VmFetchSource[] vmFetchSourceArr = {vmFetchSource, vmFetchSource2, vmFetchSource3, vmFetchSource4, vmFetchSource5, vmFetchSource6, vmFetchSource7, vmFetchSource8, vmFetchSource9, vmFetchSource10, vmFetchSource11};
        $VALUES = vmFetchSourceArr;
        $ENTRIES = C3cG.A0w(vmFetchSourceArr);
    }

    public static Ey9<VmFetchSource> getEntries() {
        return $ENTRIES;
    }

    public static VmFetchSource valueOf(String str) {
        return (VmFetchSource) Enum.valueOf(VmFetchSource.class, str);
    }

    public static VmFetchSource[] values() {
        return (VmFetchSource[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public VmFetchSource(String str, int i, String str2) {
        this.value = str2;
    }
}
