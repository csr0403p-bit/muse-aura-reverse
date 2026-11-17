package com.facebook.quicklog;

import X.C7384Etj;
import X.DIF;
import X.DJL;

/* loaded from: classes5.dex */
public final class QPLConfigurationNativeBridge {
    public static final int CRASH_RESILIENCY_FALSE = 0;
    public static final int CRASH_RESILIENCY_TRUE = 1;
    public static final int CRASH_RESILIENCY_UNKNOWN = -1;
    public static final QPLConfigurationNativeBridge INSTANCE = new QPLConfigurationNativeBridge();
    public static DIF qplConfiguration;

    public static final long[] getMarkerConfigForNativeQPLOnly(int i) {
        long[] jArr = new long[2];
        DIF dif = qplConfiguration;
        if (dif != null) {
            long samplingSpecForMarker = dif.getSamplingSpecForMarker(i);
            DIF dif2 = qplConfiguration;
            C7384Etj.A0X(dif2);
            long metadataConfigForMarker = dif2.getMetadataConfigForMarker(i);
            jArr[0] = samplingSpecForMarker;
            jArr[1] = metadataConfigForMarker;
        }
        return jArr;
    }

    public static final void setQPLConfiguration(DIF dif) {
        C7384Etj.A0Y(dif, 0);
        qplConfiguration = dif;
    }

    public static final int isMarkerCrashResilientForNativeQPLOnly(int i) {
        DIF dif = qplConfiguration;
        if (dif == null) {
            return -1;
        }
        DJL crashResiliencyConfig = dif.getCrashResiliencyConfig();
        C7384Etj.A0U(crashResiliencyConfig);
        return crashResiliencyConfig.AOj(i) ? 1 : 0;
    }
}
