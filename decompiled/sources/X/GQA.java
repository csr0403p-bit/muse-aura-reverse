package X;

/* loaded from: classes6.dex */
public final class GQA {
    public final long[] A00 = new long[128];

    public static void A00(GQA gqa, GQA gqa2, GQA gqa3) {
        long[] jArr = gqa.A00;
        long[] jArr2 = gqa2.A00;
        long[] jArr3 = gqa3.A00;
        int i = 0;
        do {
            jArr[i] = jArr2[i] ^ jArr3[i];
            i++;
        } while (i < 128);
    }
}
