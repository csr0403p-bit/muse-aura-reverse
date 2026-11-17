package com.meta.maps.core;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ServiceType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ServiceType[] $VALUES;
    public static final ServiceType AINAV_TRANSFORMER;
    public static final ServiceType ANALYTICS;
    public static final ServiceType HTTP_CLIENT;
    public static final ServiceType MIDGARD_CLIENT;
    public static final ServiceType NAVIGATOR;
    public static final ServiceType ROUTER;
    public static final ServiceType SEARCHER;
    public static final ServiceType TELEMETRY;
    public final int value;

    static {
        ServiceType serviceType = new ServiceType("ANALYTICS", 0, 0);
        ANALYTICS = serviceType;
        ServiceType serviceType2 = new ServiceType("HTTP_CLIENT", 1, 1);
        HTTP_CLIENT = serviceType2;
        ServiceType serviceType3 = new ServiceType("ROUTER", 2, 2);
        ROUTER = serviceType3;
        ServiceType serviceType4 = new ServiceType("TELEMETRY", 3, 3);
        TELEMETRY = serviceType4;
        ServiceType serviceType5 = new ServiceType("NAVIGATOR", 4, 4);
        NAVIGATOR = serviceType5;
        ServiceType serviceType6 = new ServiceType("SEARCHER", 5, 5);
        SEARCHER = serviceType6;
        ServiceType serviceType7 = new ServiceType("MIDGARD_CLIENT", 6, 6);
        MIDGARD_CLIENT = serviceType7;
        ServiceType serviceType8 = new ServiceType("AINAV_TRANSFORMER", 7, 7);
        AINAV_TRANSFORMER = serviceType8;
        ServiceType[] serviceTypeArr = {serviceType, serviceType2, serviceType3, serviceType4, serviceType5, serviceType6, serviceType7, serviceType8};
        $VALUES = serviceTypeArr;
        $ENTRIES = C3cG.A0w(serviceTypeArr);
    }

    public static Ey9<ServiceType> getEntries() {
        return $ENTRIES;
    }

    public static ServiceType valueOf(String str) {
        return (ServiceType) Enum.valueOf(ServiceType.class, str);
    }

    public static ServiceType[] values() {
        return (ServiceType[]) $VALUES.clone();
    }

    public ServiceType(String str, int i, int i2) {
        this.value = i2;
    }
}
