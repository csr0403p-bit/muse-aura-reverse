package X;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class FTU implements Runnable {
    public static final String __redex_internal_original_name = "GapWorker";
    public long A00;
    public long A01;
    public ArrayList<RecyclerView> A02 = C3cG.A0h();
    public final ArrayList<FU7> A03 = C3cG.A0h();
    public static final ThreadLocal<FTU> A05 = new ThreadLocal<>();
    public static Comparator<FU7> A04 = new C10634I0e(12);

    public static FTV A00(RecyclerView recyclerView, int i, long j) {
        FTW ftw = recyclerView.A0C;
        int iA05 = ftw.A05();
        for (int i2 = 0; i2 < iA05; i2++) {
            FTV ftvA01 = FTW.A01(ftw, i2);
            if (ftvA01.A04 == i && (ftvA01.A00 & 4) == 0) {
                return null;
            }
        }
        FTR ftr = recyclerView.A11;
        if (j == LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
            try {
                if (Trace.isEnabled()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } finally {
                recyclerView.A13(false);
                Trace.endSection();
            }
        }
        recyclerView.A03++;
        FTV ftvA07 = ftr.A07(i, j);
        if (ftvA07 != null) {
            int i3 = ftvA07.A00;
            if ((i3 & 1) == 0 || (i3 & 4) != 0) {
                ftr.A0E(ftvA07, false);
            } else {
                ftr.A09(ftvA07.A0I);
            }
        }
        return ftvA07;
    }

    public final void A01(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.A0W) {
            if (RecyclerView.A1H && !this.A02.contains(recyclerView)) {
                throw C3cG.A0Q("attempting to post unregistered view!");
            }
            if (this.A01 == 0) {
                this.A01 = System.nanoTime();
                recyclerView.post(this);
            }
        }
        C8095FTb c8095FTb = recyclerView.A0D;
        c8095FTb.A01 = i;
        c8095FTb.A02 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference<RecyclerView> weakReference;
        RecyclerView recyclerView;
        FU7 fu7;
        try {
            Trace.beginSection("RV Prefetch");
            ArrayList<RecyclerView> arrayList = this.A02;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView2 = arrayList.get(i);
                    if (recyclerView2.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView2.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(jMax) + this.A00;
                    int size2 = arrayList.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size2; i3++) {
                        RecyclerView recyclerView3 = arrayList.get(i3);
                        if (recyclerView3.getWindowVisibility() == 0) {
                            C8095FTb c8095FTb = recyclerView3.A0D;
                            c8095FTb.A00(recyclerView3, false);
                            i2 += c8095FTb.A00;
                        }
                    }
                    ArrayList<FU7> arrayList2 = this.A03;
                    arrayList2.ensureCapacity(i2);
                    int i4 = 0;
                    for (int i5 = 0; i5 < size2; i5++) {
                        RecyclerView recyclerView4 = arrayList.get(i5);
                        if (recyclerView4.getWindowVisibility() == 0) {
                            C8095FTb c8095FTb2 = recyclerView4.A0D;
                            int iAbs = Math.abs(c8095FTb2.A01) + Math.abs(c8095FTb2.A02);
                            for (int i6 = 0; i6 < c8095FTb2.A00 * 2; i6 += 2) {
                                if (i4 >= arrayList2.size()) {
                                    fu7 = new FU7();
                                    arrayList2.add(fu7);
                                } else {
                                    fu7 = arrayList2.get(i4);
                                }
                                int[] iArr = c8095FTb2.A03;
                                int i7 = iArr[i6 + 1];
                                boolean z = false;
                                if (i7 <= iAbs) {
                                    z = true;
                                }
                                fu7.A04 = z;
                                fu7.A02 = iAbs;
                                fu7.A00 = i7;
                                fu7.A03 = recyclerView4;
                                fu7.A01 = iArr[i6];
                                i4++;
                            }
                        }
                    }
                    Collections.sort(arrayList2, A04);
                    for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                        FU7 fu72 = arrayList2.get(i8);
                        if (fu72.A03 == null) {
                            break;
                        }
                        FTV ftvA00 = A00(fu72.A03, fu72.A01, fu72.A04 ? LinkEncryptedPairingKt.LINK_COUNTER_MAX : nanos);
                        if (ftvA00 != null && (weakReference = ftvA00.A0D) != null) {
                            int i9 = ftvA00.A00;
                            if ((i9 & 1) != 0 && (i9 & 4) == 0 && (recyclerView = weakReference.get()) != null) {
                                if (recyclerView.A0S && recyclerView.A0C.A05() != 0) {
                                    recyclerView.A0l();
                                }
                                C8095FTb c8095FTb3 = recyclerView.A0D;
                                c8095FTb3.A00(recyclerView, true);
                                if (c8095FTb3.A00 == 0) {
                                    continue;
                                } else {
                                    try {
                                        Trace.beginSection(nanos == LinkEncryptedPairingKt.LINK_COUNTER_MAX ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                                        C8097FTd c8097FTd = recyclerView.A13;
                                        AbstractC8091FSx abstractC8091FSx = recyclerView.A0F;
                                        c8097FTd.A04 = 1;
                                        c8097FTd.A03 = abstractC8091FSx.A03();
                                        c8097FTd.A08 = false;
                                        c8097FTd.A0D = false;
                                        c8097FTd.A09 = false;
                                        for (int i10 = 0; i10 < c8095FTb3.A00 * 2; i10 += 2) {
                                            A00(recyclerView, c8095FTb3.A03[i10], nanos);
                                        }
                                        Trace.endSection();
                                    } finally {
                                        Trace.endSection();
                                    }
                                }
                            }
                        }
                        fu72.A04 = false;
                        fu72.A02 = 0;
                        fu72.A00 = 0;
                        fu72.A03 = null;
                        fu72.A01 = 0;
                    }
                }
            }
        } finally {
            this.A01 = 0L;
        }
    }
}
