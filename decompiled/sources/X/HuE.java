package X;

import android.util.LongSparseArray;
import android.util.SparseIntArray;

/* loaded from: classes6.dex */
public final class HuE implements F8H {
    public static F8H A04;
    public static final FXZ A05 = new FXZ();
    public final LongSparseArray<FNA> A00 = new LongSparseArray<>();
    public final LongSparseArray<FNA> A01 = new LongSparseArray<>();
    public final SparseIntArray A02 = new SparseIntArray();
    public final Ao0<Integer> A03 = new Ao0<>(0);

    @Override // X.F8H
    public final synchronized void A37(FNA fna) {
        C7384Etj.A0Y(fna, 0);
        int markerId = fna.getMarkerId();
        LongSparseArray<FNA> longSparseArray = this.A01;
        long j = markerId;
        FNA fna2 = longSparseArray.get(j);
        if (fna2 != null) {
            fna.AQG("ttrc_marker_overlap", true);
            fna2.AQG("ttrc_marker_overlap", true);
        }
        this.A00.put(fna.AM7(), fna);
        longSparseArray.put(j, fna);
        SparseIntArray sparseIntArray = this.A02;
        sparseIntArray.put(markerId, sparseIntArray.get(markerId, 0) + 1);
        this.A03.add(Integer.valueOf(markerId));
    }

    @Override // X.F8H
    public final synchronized void Aac(FNA fna) {
        int markerId = fna.getMarkerId();
        this.A01.remove(markerId);
        this.A00.remove(fna.AM7());
        SparseIntArray sparseIntArray = this.A02;
        int i = sparseIntArray.get(markerId);
        sparseIntArray.put(markerId, i - 1);
        if (i == 1) {
            this.A03.remove(Integer.valueOf(markerId));
        }
    }
}
