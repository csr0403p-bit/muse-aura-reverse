package com.facebook.traffic.nts.tasos.bwemanager;

import X.C06H;
import X.C3cG;
import X.C3cH;
import X.Ey9;

/* loaded from: classes5.dex */
public final class BweWithMetadata {
    public static final Companion Companion = new Companion();
    public static final int STORE_IMAGE = 2;
    public static final int STORE_LIVE = 0;
    public static final int STORE_VOD = 1;
    public final String bweKey;
    public final long detectedThrottlingRateBpsRaw;
    public final long headerAgeMs;
    public final int isThrottledRaw;
    public final long longTermSustainableRateBpsRaw;
    public final String rawBweHeader;
    public final long sconeRateCapAgeMsRaw;
    public final long sconeRateCapBpsRaw;
    public final boolean sconeRateCapEnabled;
    public final int sconeSignalStateRaw;
    public final double srsMaxPrefetchRaw;
    public final double srsMaxRaw;
    public final double srsMinPrefetchRaw;
    public final double srsMinRaw;
    public final long storeConfidenceTooLowCount;
    public final int storeContentType;
    public final long storeHeaderNotParsableCount;
    public final String storeId;
    public final long storeReceivedHeaderCount;
    public final long tasosThrottlingRateBpsRaw;
    public final boolean throttlingRateCapEnabled;
    public final long[] transferTimeTable;
    public final long unscaledBweRaw;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class SconeSignalState {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ SconeSignalState[] $VALUES;
        public static final Companion Companion;
        public static final SconeSignalState NO_ADVICE;
        public static final SconeSignalState NO_SIGNAL;
        public static final SconeSignalState RATE_ADVICE;
        public final int rawValue;

        public final class Companion {
            public final SconeSignalState fromRawValue(int i) {
                SconeSignalState sconeSignalState = SconeSignalState.NO_ADVICE;
                if (i == sconeSignalState.getRawValue()) {
                    return sconeSignalState;
                }
                SconeSignalState sconeSignalState2 = SconeSignalState.RATE_ADVICE;
                return i != sconeSignalState2.getRawValue() ? SconeSignalState.NO_SIGNAL : sconeSignalState2;
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        static {
            SconeSignalState sconeSignalState = new SconeSignalState("NO_SIGNAL", 0, 0);
            NO_SIGNAL = sconeSignalState;
            SconeSignalState sconeSignalState2 = new SconeSignalState("NO_ADVICE", 1, 1);
            NO_ADVICE = sconeSignalState2;
            SconeSignalState sconeSignalState3 = new SconeSignalState("RATE_ADVICE", 2, 2);
            RATE_ADVICE = sconeSignalState3;
            SconeSignalState[] sconeSignalStateArr = {sconeSignalState, sconeSignalState2, sconeSignalState3};
            $VALUES = sconeSignalStateArr;
            $ENTRIES = C3cG.A0w(sconeSignalStateArr);
            Companion = new Companion();
        }

        public static Ey9<SconeSignalState> getEntries() {
            return $ENTRIES;
        }

        public static SconeSignalState valueOf(String str) {
            return (SconeSignalState) Enum.valueOf(SconeSignalState.class, str);
        }

        public static SconeSignalState[] values() {
            return (SconeSignalState[]) $VALUES.clone();
        }

        public final int getRawValue() {
            return this.rawValue;
        }

        public SconeSignalState(String str, int i, int i2) {
            this.rawValue = i2;
        }
    }

    public BweWithMetadata(long j) {
        this(j, Double.NaN, Double.NaN, Double.NaN, Double.NaN, null, null, -1L, -1, null, -1L, false, -1L, -1L, SconeSignalState.NO_SIGNAL.getRawValue(), -1L, -1L, -1L, null, -1, -1L, -1L, false);
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final String getBweKey() {
        return this.bweKey;
    }

    public final Long getDetectedThrottlingRateBps() {
        long j = this.detectedThrottlingRateBpsRaw;
        if (j < 0) {
            return null;
        }
        return Long.valueOf(j);
    }

    public final Long getHeaderAge() {
        long j = this.headerAgeMs;
        if (j < 0) {
            return null;
        }
        return Long.valueOf(j);
    }

    public final long getHeaderAgeMs() {
        return this.headerAgeMs;
    }

    public final Long getLongTermSustainableRateBps() {
        long j = this.longTermSustainableRateBpsRaw;
        if (j < 0) {
            return null;
        }
        return Long.valueOf(j);
    }

    public final long getLongTermSustainableRateBpsRaw() {
        return this.longTermSustainableRateBpsRaw;
    }

    public final String getRawBweHeader() {
        return this.rawBweHeader;
    }

    public final Long getSconeRateCapAgeMs() {
        long j = this.sconeRateCapAgeMsRaw;
        if (j < 0) {
            return null;
        }
        return Long.valueOf(j);
    }

    public final long getSconeRateCapAgeMsRaw() {
        return this.sconeRateCapAgeMsRaw;
    }

    public final Long getSconeRateCapBps() {
        long j = this.sconeRateCapBpsRaw;
        if (j < 0) {
            return null;
        }
        return Long.valueOf(j);
    }

    public final long getSconeRateCapBpsRaw() {
        return this.sconeRateCapBpsRaw;
    }

    public final boolean getSconeRateCapEnabled() {
        return this.sconeRateCapEnabled;
    }

    public final SconeSignalState getSconeSignalState() {
        return SconeSignalState.Companion.fromRawValue(this.sconeSignalStateRaw);
    }

    public final Double getSrsMax() {
        double d = this.srsMaxRaw;
        if (Double.isNaN(d)) {
            return null;
        }
        return Double.valueOf(d);
    }

    public final Double getSrsMaxPrefetch() {
        double d = this.srsMaxPrefetchRaw;
        if (Double.isNaN(d)) {
            return null;
        }
        return Double.valueOf(d);
    }

    public final double getSrsMaxPrefetchRaw() {
        return this.srsMaxPrefetchRaw;
    }

    public final double getSrsMaxRaw() {
        return this.srsMaxRaw;
    }

    public final Double getSrsMin() {
        double d = this.srsMinRaw;
        if (Double.isNaN(d)) {
            return null;
        }
        return Double.valueOf(d);
    }

    public final Double getSrsMinPrefetch() {
        double d = this.srsMinPrefetchRaw;
        if (Double.isNaN(d)) {
            return null;
        }
        return Double.valueOf(d);
    }

    public final double getSrsMinPrefetchRaw() {
        return this.srsMinPrefetchRaw;
    }

    public final double getSrsMinRaw() {
        return this.srsMinRaw;
    }

    public final long getStoreConfidenceTooLowCount() {
        return this.storeConfidenceTooLowCount;
    }

    public final int getStoreContentType() {
        return this.storeContentType;
    }

    public final long getStoreHeaderNotParsableCount() {
        return this.storeHeaderNotParsableCount;
    }

    public final String getStoreId() {
        return this.storeId;
    }

    public final long getStoreReceivedHeaderCount() {
        return this.storeReceivedHeaderCount;
    }

    public final Integer getStoreType() {
        int i = this.storeContentType;
        if (i < 0) {
            return null;
        }
        return Integer.valueOf(i);
    }

    public final Long getTasosThrottlingRateBps() {
        long j = this.tasosThrottlingRateBpsRaw;
        if (j > 0) {
            return Long.valueOf(j);
        }
        return null;
    }

    public final long getTasosThrottlingRateBpsRaw() {
        return this.tasosThrottlingRateBpsRaw;
    }

    public final boolean getThrottlingRateCapEnabled() {
        return this.throttlingRateCapEnabled;
    }

    public final long[] getTransferTimeTable() {
        return this.transferTimeTable;
    }

    public final Long getUnscaledBwe() {
        long j = this.unscaledBweRaw;
        if (j < 0) {
            return null;
        }
        return Long.valueOf(j);
    }

    public final long getUnscaledBweRaw() {
        return this.unscaledBweRaw;
    }

    public final Boolean isThrottled() {
        int i = this.isThrottledRaw;
        boolean z = false;
        if (i != 0) {
            z = true;
            if (i != 1) {
                return null;
            }
        }
        return Boolean.valueOf(z);
    }

    public BweWithMetadata(long j, double d, double d2, double d3, double d4, String str, long[] jArr, long j2, int i, String str2, long j3, boolean z, long j4, long j5, int i2, long j6, long j7, long j8, String str3, int i3, long j9, long j10, boolean z2) {
        this.unscaledBweRaw = j;
        this.srsMaxRaw = d;
        this.srsMinRaw = d2;
        this.srsMaxPrefetchRaw = d3;
        this.srsMinPrefetchRaw = d4;
        this.rawBweHeader = str;
        this.transferTimeTable = jArr;
        this.headerAgeMs = j2;
        this.storeContentType = i;
        this.bweKey = str2;
        this.sconeRateCapBpsRaw = j3;
        this.sconeRateCapEnabled = z;
        this.sconeRateCapAgeMsRaw = j4;
        this.longTermSustainableRateBpsRaw = j5;
        this.sconeSignalStateRaw = i2;
        this.storeReceivedHeaderCount = j6;
        this.storeHeaderNotParsableCount = j7;
        this.storeConfidenceTooLowCount = j8;
        this.storeId = str3;
        this.isThrottledRaw = i3;
        this.detectedThrottlingRateBpsRaw = j9;
        this.tasosThrottlingRateBpsRaw = j10;
        this.throttlingRateCapEnabled = z2;
    }

    public /* synthetic */ BweWithMetadata(long j, double d, double d2, double d3, double d4, String str, long[] jArr, long j2, int i, String str2, long j3, boolean z, long j4, long j5, int i2, long j6, long j7, long j8, String str3, int i3, long j9, long j10, boolean z2, int i4, C06H c06h) {
        this(j, d, d2, d3, d4, (i4 & 32) != 0 ? null : str, (i4 & 64) != 0 ? null : jArr, (i4 & 128) != 0 ? -1L : j2, (i4 & 256) != 0 ? -1 : i, (i4 & 512) != 0 ? null : str2, (i4 & 1024) != 0 ? -1L : j3, C3cG.A1K(i4 & 2048, z), (i4 & 4096) != 0 ? -1L : j4, (i4 & 8192) != 0 ? -1L : j5, (i4 & 16384) != 0 ? SconeSignalState.NO_SIGNAL.getRawValue() : i2, (32768 & i4) != 0 ? -1L : j6, (65536 & i4) != 0 ? -1L : j7, (131072 & i4) != 0 ? -1L : j8, (262144 & i4) != 0 ? null : str3, (524288 & i4) != 0 ? -1 : i3, (1048576 & i4) != 0 ? -1L : j9, (2097152 & i4) != 0 ? -1L : j10, C3cH.A1L(i4, 4194304, z2));
    }

    public BweWithMetadata(long j, double d, double d2, double d3, double d4, String str) {
        this(j, d, d2, d3, d4, str, null, -1L, -1, null, -1L, false, -1L, -1L, SconeSignalState.NO_SIGNAL.getRawValue(), -1L, -1L, -1L, null, -1, -1L, -1L, false);
    }
}
