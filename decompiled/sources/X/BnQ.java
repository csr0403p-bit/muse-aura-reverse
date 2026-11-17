package X;

import android.media.ImageReader;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class BnQ implements InterfaceC2864BnO, InterfaceC2889Bnx {
    public int A00;
    public int A01;
    public BeX A02;
    public InterfaceC2888Bnw A03;
    public InterfaceC2888Bnw A04;
    public Executor A05;
    public boolean A06;
    public final LongSparseArray<InterfaceC2886Bnt> A07;
    public final LongSparseArray<InterfaceC2873Bng> A08;
    public final InterfaceC2864BnO A09;
    public final Object A0A;
    public final List<InterfaceC2873Bng> A0B;
    public final List<InterfaceC2873Bng> A0C;

    public static void A00(final BnQ bnQ) {
        synchronized (bnQ.A0A) {
            LongSparseArray<InterfaceC2886Bnt> longSparseArray = bnQ.A07;
            int size = longSparseArray.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                InterfaceC2886Bnt interfaceC2886BntValueAt = longSparseArray.valueAt(size);
                long timestamp = interfaceC2886BntValueAt.getTimestamp();
                LongSparseArray<InterfaceC2873Bng> longSparseArray2 = bnQ.A08;
                InterfaceC2873Bng interfaceC2873Bng = longSparseArray2.get(timestamp);
                if (interfaceC2873Bng != null) {
                    longSparseArray2.remove(timestamp);
                    longSparseArray.removeAt(size);
                    C2872Bnf c2872Bnf = new C2872Bnf(null, interfaceC2886BntValueAt, interfaceC2873Bng);
                    List<InterfaceC2873Bng> list = bnQ.A0C;
                    if (list.size() < bnQ.AHQ()) {
                        c2872Bnf.A00(bnQ);
                        list.add(c2872Bnf);
                        final InterfaceC2888Bnw interfaceC2888Bnw = bnQ.A03;
                        Executor executor = bnQ.A05;
                        if (interfaceC2888Bnw != null) {
                            if (executor != null) {
                                executor.execute(new Runnable() { // from class: X.Bnm
                                    public static final String __redex_internal_original_name = "MetadataImageReader$$ExternalSyntheticLambda1";

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        interfaceC2888Bnw.ATX(this.A00);
                                    }
                                });
                            } else {
                                interfaceC2888Bnw.ATX(bnQ);
                            }
                        }
                    } else {
                        AbstractC2875Bni.A01("TAG", "Maximum image number reached.");
                        c2872Bnf.close();
                    }
                }
            }
            LongSparseArray<InterfaceC2873Bng> longSparseArray3 = bnQ.A08;
            if (longSparseArray3.size() != 0 && longSparseArray.size() != 0) {
                long jKeyAt = longSparseArray3.keyAt(0);
                Long lValueOf = Long.valueOf(jKeyAt);
                long jKeyAt2 = longSparseArray.keyAt(0);
                BeS.A05(!Long.valueOf(jKeyAt2).equals(lValueOf));
                if (jKeyAt2 <= jKeyAt) {
                    int size2 = longSparseArray.size();
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        } else if (longSparseArray.keyAt(size2) < jKeyAt) {
                            longSparseArray.removeAt(size2);
                        }
                    }
                } else {
                    int size3 = longSparseArray3.size();
                    while (true) {
                        size3--;
                        if (size3 < 0) {
                            break;
                        } else if (longSparseArray3.keyAt(size3) < jKeyAt2) {
                            longSparseArray3.valueAt(size3).close();
                            longSparseArray3.removeAt(size3);
                        }
                    }
                }
            }
        }
    }

    public static final void A01(BnQ bnQ, InterfaceC2864BnO interfaceC2864BnO) {
        synchronized (bnQ.A0A) {
            if (!bnQ.A06) {
                LongSparseArray<InterfaceC2873Bng> longSparseArray = bnQ.A08;
                int size = longSparseArray.size() + bnQ.A0C.size();
                if (size >= interfaceC2864BnO.AHQ()) {
                    AbstractC2875Bni.A01("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                } else {
                    do {
                        try {
                            InterfaceC2873Bng interfaceC2873BngA31 = interfaceC2864BnO.A31();
                            if (interfaceC2873BngA31 == null) {
                                break;
                            }
                            bnQ.A01--;
                            size++;
                            longSparseArray.put(interfaceC2873BngA31.AGK().getTimestamp(), interfaceC2873BngA31);
                            A00(bnQ);
                            if (bnQ.A01 <= 0) {
                                break;
                            }
                        } catch (IllegalStateException e) {
                            if (AbstractC2875Bni.A08("MetadataImageReader", 3)) {
                                Log.d("MetadataImageReader", "Failed to acquire next image.", e);
                            }
                        }
                    } while (size < interfaceC2864BnO.AHQ());
                }
            }
        }
    }

    @Override // X.InterfaceC2864BnO
    public final InterfaceC2873Bng A30() {
        InterfaceC2873Bng interfaceC2873Bng;
        synchronized (this.A0A) {
            List<InterfaceC2873Bng> list = this.A0C;
            if (list.isEmpty()) {
                interfaceC2873Bng = null;
            } else {
                if (this.A00 >= list.size()) {
                    throw C3cG.A0Q("Maximum image number reached.");
                }
                ArrayList arrayListA0h = C3cG.A0h();
                for (int i = 0; i < C60O.A00(list); i++) {
                    if (!this.A0B.contains(list.get(i))) {
                        arrayListA0h.add(list.get(i));
                    }
                }
                Iterator it = arrayListA0h.iterator();
                while (it.hasNext()) {
                    ((InterfaceC2873Bng) it.next()).close();
                }
                int size = list.size();
                this.A00 = size;
                interfaceC2873Bng = list.get(size - 1);
                this.A0B.add(interfaceC2873Bng);
            }
        }
        return interfaceC2873Bng;
    }

    @Override // X.InterfaceC2864BnO
    public final InterfaceC2873Bng A31() {
        InterfaceC2873Bng interfaceC2873Bng;
        synchronized (this.A0A) {
            List<InterfaceC2873Bng> list = this.A0C;
            if (list.isEmpty()) {
                interfaceC2873Bng = null;
            } else {
                if (this.A00 >= list.size()) {
                    throw C3cG.A0Q("Maximum image number reached.");
                }
                int i = this.A00;
                this.A00 = i + 1;
                interfaceC2873Bng = list.get(i);
                this.A0B.add(interfaceC2873Bng);
            }
        }
        return interfaceC2873Bng;
    }

    @Override // X.InterfaceC2864BnO
    public final void A6K() {
        synchronized (this.A0A) {
            this.A09.A6K();
            this.A03 = null;
            this.A05 = null;
            this.A01 = 0;
        }
    }

    @Override // X.InterfaceC2864BnO
    public final int AGJ() {
        int iAGJ;
        synchronized (this.A0A) {
            iAGJ = this.A09.AGJ();
        }
        return iAGJ;
    }

    @Override // X.InterfaceC2864BnO
    public final int AHQ() {
        int iAHQ;
        synchronized (this.A0A) {
            iAHQ = this.A09.AHQ();
        }
        return iAHQ;
    }

    @Override // X.InterfaceC2889Bnx
    public final void ATY(InterfaceC2873Bng interfaceC2873Bng) {
        synchronized (this.A0A) {
            List<InterfaceC2873Bng> list = this.A0C;
            int iIndexOf = list.indexOf(interfaceC2873Bng);
            if (iIndexOf >= 0) {
                list.remove(iIndexOf);
                int i = this.A00;
                if (iIndexOf <= i) {
                    this.A00 = i - 1;
                }
            }
            this.A0B.remove(interfaceC2873Bng);
            if (this.A01 > 0) {
                A01(this, this.A09);
            }
        }
    }

    @Override // X.InterfaceC2864BnO
    public final void Adw(InterfaceC2888Bnw interfaceC2888Bnw, Executor executor) {
        synchronized (this.A0A) {
            interfaceC2888Bnw.getClass();
            this.A03 = interfaceC2888Bnw;
            executor.getClass();
            this.A05 = executor;
            this.A09.Adw(this.A04, executor);
        }
    }

    @Override // X.InterfaceC2864BnO
    public final void close() {
        synchronized (this.A0A) {
            if (!this.A06) {
                List<InterfaceC2873Bng> list = this.A0C;
                Iterator itA0z = BV5.A0z(list);
                while (itA0z.hasNext()) {
                    ((InterfaceC2873Bng) itA0z.next()).close();
                }
                list.clear();
                this.A09.close();
                this.A06 = true;
            }
        }
    }

    @Override // X.InterfaceC2864BnO
    public final int getHeight() {
        int height;
        synchronized (this.A0A) {
            height = this.A09.getHeight();
        }
        return height;
    }

    @Override // X.InterfaceC2864BnO
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.A0A) {
            surface = this.A09.getSurface();
        }
        return surface;
    }

    @Override // X.InterfaceC2864BnO
    public final int getWidth() {
        int width;
        synchronized (this.A0A) {
            width = this.A09.getWidth();
        }
        return width;
    }

    public BnQ(int i, int i2, int i3, int i4) {
        C2884Bnr c2884Bnr = new C2884Bnr(ImageReader.newInstance(i, i2, i3, i4));
        this.A0A = C3cG.A0T();
        this.A02 = new F43(this, 1);
        this.A01 = 0;
        this.A04 = new F4O(this, 1);
        this.A06 = false;
        this.A07 = new LongSparseArray<>();
        this.A08 = new LongSparseArray<>();
        this.A0B = C3cG.A0h();
        this.A09 = c2884Bnr;
        this.A00 = 0;
        this.A0C = C60O.A11(AHQ());
    }
}
