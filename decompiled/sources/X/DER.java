package X;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class DER {
    public static final SparseArray<DER> A00;
    public static final /* synthetic */ DER[] A01;
    public static final DER A02;
    public static final DER A03;
    public static final DER A04;
    public static final DER A05;
    public static final DER A06;
    public static final DER A07;
    public static final DER A08;
    public static final DER A09;
    public static final DER A0A;
    public static final DER A0B;
    public static final DER A0C;
    public static final DER A0D;
    public static final DER A0E;
    public static final DER A0F;
    public static final DER A0G;
    public static final DER A0H;
    public static final DER A0I;
    public static final DER A0J;
    public static final DER A0K;
    public final int mValue;

    static {
        DER derA00 = A00("DEBUG_STATS", 0, -1);
        A05 = derA00;
        DER derA002 = A00("PREFETCH_COMPLETE", 1, 0);
        DER derA003 = A00("MANIFEST_FETCH_END", 2, 1);
        A0E = derA003;
        DER derA004 = A00("MANIFEST_MISALIGNED", 3, 2);
        DER derA005 = A00("HTTP_TRANSFER_END", 4, 3);
        A0A = derA005;
        DER derA006 = A00("PREFETCH_CACHE_EVICT", 5, 4);
        DER derA007 = A00("QUALITY_CHANGED", 6, 5);
        DER derA008 = A00("SPAN_CHANGED", 7, 6);
        DER derA009 = A00("QUALITY_SUMMARY", 8, 7);
        DER derA0010 = A00("CACHE_ERROR", 9, 8);
        DER derA0011 = A00("PLAYER_WARNING", 10, 9);
        A0H = derA0011;
        DER derA0012 = A00("PREFETCH_START", 11, 10);
        DER derA0013 = A00("EXTERNAL_OBSERVER_ESTIMATE", 12, 11);
        DER derA0014 = A00("DATABASE_FULL", 13, 12);
        DER derA0015 = A00("MANIFEST_PARSE_ERROR", 14, 13);
        DER derA0016 = A00("SUGGEST_UNBIND", 15, 14);
        DER derA0017 = A00("PREFETCH_CANCELED", 16, 15);
        A0I = derA0017;
        DER derA0018 = A00("ABR_DECISION", 17, 16);
        A02 = derA0018;
        DER derA0019 = A00("SEGMENT_DOWNLOADED", 18, 17);
        A0J = derA0019;
        DER derA0020 = A00("FRAME_DISPLAYED", 19, 18);
        A08 = derA0020;
        DER derA0021 = A00("CACHED", 20, 19);
        DER derA0022 = A00("PLAYER_CAPABILITY", 21, 20);
        DER derA0023 = A00("FRAME_DOWNLOADED", 22, 21);
        A09 = derA0023;
        DER derA0024 = A00("MANIFEST_FAILOVER", 23, 22);
        DER derA0025 = A00("CUSTOM_LIVE_TRACE", 24, 23);
        A04 = derA0025;
        DER derA0026 = A00("TRACK_SYNC", 25, 24);
        DER derA0027 = A00("CUSTOM_ANALYTICS_EVENT", 26, 25);
        DER derA0028 = A00("CACHE_INSTRUMENTATION", 27, 26);
        A03 = derA0028;
        DER derA0029 = A00("PREFETCH_TASK_QUEUE_START", 28, 27);
        DER derA0030 = A00("PREFETCH_TASK_QUEUE_EXIT", 29, 28);
        DER derA0031 = A00("PREFETCH_TASK_QUEUE_COMPLETE", 30, 29);
        DER derA0032 = A00("HTTP_TRANSFER_START", 31, 30);
        A0C = derA0032;
        DER derA0033 = A00("HTTP_TRANSFER_REQUESTED", 32, 31);
        A0B = derA0033;
        DER derA0034 = A00("MEDIA_CODEC_LIFECYCLE", 33, 32);
        A0F = derA0034;
        DER derA0035 = A00("LATENCY_DECISION", 34, 33);
        A0D = derA0035;
        DER derA0036 = A00("PREFETCH_TASK_DATA_FETCH_ISSUED", 35, 34);
        DER derA0037 = A00("PREFETCH_TASK_DATA_FETCH_COMPLETED", 36, 35);
        DER derA0038 = A00("FIRST_DATA_SEGMENT_CACHE_CHECK_START", 37, 36);
        A07 = derA0038;
        DER derA0039 = A00("FIRST_DATA_SEGMENT_CACHE_CHECK_END", 38, 37);
        A06 = derA0039;
        DER derA0040 = A00("PREFETCH_TASK_CACHE_CHECK", 39, 38);
        DER derA0041 = A00("PREFETCH_TASK_QUEUE_INSERTED", 40, 39);
        DER derA0042 = A00("PLAYER_INFO", 41, 40);
        A0G = derA0042;
        DER derA0043 = A00("VIDEO_REQUEST_DIAGNOSTIC", 42, 41);
        A0K = derA0043;
        DER derA0044 = A00("LIVE_PREFETCH_COMPLETE", 43, 42);
        DER derA0045 = A00("PREFETCH_DEMAND_OUTCOME", 44, 43);
        DER[] derArr = new DER[45];
        System.arraycopy(new DER[]{derA00, derA002, derA003, derA004, derA005, derA006, derA007, derA008, derA009, derA0010, derA0011, derA0012, derA0013, derA0014, derA0015, derA0016, derA0017, derA0018, derA0019, derA0020, derA0021, derA0022, derA0023, derA0024, derA0025, derA0026, derA0027}, 0, derArr, 0, 27);
        System.arraycopy(new DER[]{derA0028, derA0029, derA0030, derA0031, derA0032, derA0033, derA0034, derA0035, derA0036, derA0037, derA0038, derA0039, derA0040, derA0041, derA0042, derA0043, derA0044, derA0045}, 0, derArr, 27, 18);
        A01 = derArr;
        A00 = BV4.A0B();
        for (DER der : values()) {
            A00.put(der.mValue, der);
        }
    }

    public static DER A00(String str, int i, int i2) {
        return new DER(str, i, i2);
    }

    public static DER valueOf(String str) {
        return (DER) Enum.valueOf(DER.class, str);
    }

    public static DER[] values() {
        return (DER[]) A01.clone();
    }

    public DER(String str, int i, int i2) {
        this.mValue = i2;
    }
}
