package X;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class DE3 {
    public static final DE3 A00 = new DE3(new DE7((byte) 3, true), "DEFAULT", 0);
    public static final DE3 A01 = new DE3(new DE7((byte) 4, false), "PREFETCH", 1);
    public static final DE3 A02;
    public static final DE3 A03;
    public static final DE3 A04;
    public static final DE3 A05;
    public final DE7 mHttpPriority;

    static {
        new DE3(new DE7((byte) 3, false), "IMPORTANT_PREFETCH", 2);
        new DE3(new DE7((byte) 4, true), "PREFETCH_INCREMENTAL", 3);
        new DE3(new DE7((byte) 3, true), "IMPORTANT_PREFETCH_INCREMENTAL", 4);
        A03 = new DE3(new DE7((byte) 5, false), "UNIMPORTANT_PREFETCH", 5);
        new DE3(new DE7((byte) 5, true), "UNIMPORTANT_PREFETCH_INCREMENTAL", 6);
        A04 = new DE3(new DE7((byte) 6, false), "VERY_UNIMPORTANT_PREFETCH", 7);
        new DE3(new DE7((byte) 6, true), "VERY_UNIMPORTANT_PREFETCH_INCREMENTAL", 8);
        new DE3(new DE7((byte) 0, false), "STREAMING", 9);
        new DE3(new DE7((byte) 2, false), "WARMUP", 10);
        A05 = new DE3(new DE7((byte) 2, true), "WARMUP_INCREMENTAL", 11);
        A02 = new DE3(new DE7((byte) 0, true), "STREAMING_INCREMENTAL", 12);
    }

    public DE3(DE7 de7, String str, int i) {
        this.mHttpPriority = de7;
    }
}
