package X;

/* loaded from: classes5.dex */
public abstract class CA5 {
    public static int A00(long j) {
        long j2 = (j >>> 62) & 1;
        long j3 = j >>> 16;
        return j2 == 1 ? ((int) (j3 & 4294967295L)) & 4095 : (int) (j3 & 65535);
    }
}
