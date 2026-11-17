package com.facebook.acra.util;

import X.FGI;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;

/* loaded from: classes5.dex */
public abstract class ProcFileReader {
    public static final int CANNOT_DETERMINE_OPEN_FDS = -1;
    public static final int SCHEDSTAT_FIELD_COUNT = 2;
    public static final int SCHEDSTAT_RUN_NANOS_INDEX = 0;
    public static final int SCHEDSTAT_WAIT_NANOS_INDEX = 1;
    public static final int SCHED_COUNTERS_ALL_AVAILABLE = 7;
    public static final int SCHED_COUNTERS_READ_FAILED = -1;
    public static final int SCHED_COUNTER_FIELD_COUNT = 3;
    public static final int SCHED_IOWAIT_SUM_AVAILABLE = 4;
    public static final int SCHED_IOWAIT_SUM_NANOS_INDEX = 2;
    public static final int SCHED_SUM_BLOCK_RUNTIME_AVAILABLE = 2;
    public static final int SCHED_SUM_BLOCK_RUNTIME_NANOS_INDEX = 1;
    public static final int SCHED_SUM_SLEEP_RUNTIME_AVAILABLE = 1;
    public static final int SCHED_SUM_SLEEP_RUNTIME_NANOS_INDEX = 0;
    public static final int SECURITY_EXCEPTION = -2;
    public static final int THREAD_STATE_UNAVAILABLE = 0;

    public abstract int getOpenFDCount();

    public abstract OpenFDLimits getOpenFDLimits();

    public abstract String getOpenFileDescriptors();

    public abstract int readSchedCounters(int i, long[] jArr);

    public abstract boolean readSchedStat(int i, long[] jArr);

    public abstract int readThreadStateChar(int i);

    public class OpenFDLimits {
        public final int hardLimit;
        public final int softLimit;

        public OpenFDLimits(int i, int i2) {
            this.softLimit = i;
            this.hardLimit = i2;
        }
    }

    public static ProcFileReader getProcFileReader() {
        return NativeProcFileReader.sReadyToUse.get() ? NativeProcFileReader.getInstance() : JavaProcFileReader.getInstance();
    }

    public static String threadFilePath(int i, String str) {
        return FGI.A0W("/proc/self/task/", CustomConnectorRegisterRepositoryKt.ROOT_PATH, str, i);
    }
}
