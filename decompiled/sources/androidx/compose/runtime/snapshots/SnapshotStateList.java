package androidx.compose.runtime.snapshots;

import X.AHE;
import X.AHT;
import X.AHV;
import X.AMf;
import X.AMg;
import X.AMh;
import X.AMi;
import X.AN8;
import X.AbstractC0905AHh;
import X.BDh;
import X.BDo;
import X.BDs;
import X.BT5;
import X.C0992AMx;
import X.C2297BSx;
import X.C60O;
import X.C7384Etj;
import X.C8j5;
import X.InterfaceC0884AGl;
import X.InterfaceC0900AHc;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class SnapshotStateList implements List, BDs, Parcelable, RandomAccess, InterfaceC0884AGl {
    public static final Parcelable.Creator<SnapshotStateList<Object>> CREATOR = new C0992AMx();
    public AN8 A00;

    public final void A00(int i, int i2) {
        int i3;
        InterfaceC0900AHc<? extends T> interfaceC0900AHc;
        Snapshot snapshotA00;
        boolean zA0s;
        do {
            synchronized (AMg.A00) {
                AMi aMiA0L = C8j5.A0L(this);
                i3 = aMiA0L.A00;
                interfaceC0900AHc = aMiA0L.A02;
            }
            C7384Etj.A0X(interfaceC0900AHc);
            AHV ahvA5a = interfaceC0900AHc.A5a();
            ahvA5a.subList(i, i2).clear();
            InterfaceC0900AHc interfaceC0900AHcA0U = ahvA5a.A0U();
            if (C7384Etj.areEqual(interfaceC0900AHcA0U, interfaceC0900AHc)) {
                return;
            }
            AN8 an8 = this.A00;
            synchronized (BDh.A08) {
                snapshotA00 = BDh.A00();
                zA0s = C8j5.A0s(interfaceC0900AHcA0U, snapshotA00, this, an8, i3);
            }
            BDh.A0G(snapshotA00, this);
        } while (!zA0s);
    }

    @Override // X.BDs
    public final AN8 AFh() {
        return this.A00;
    }

    @Override // X.BDs
    public final void AYT(AN8 an8) {
        an8.A01 = this.A00;
        this.A00 = an8;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        int i;
        InterfaceC0900AHc<? extends T> interfaceC0900AHc;
        Snapshot snapshotA00;
        boolean zA02;
        do {
            synchronized (AMg.A00) {
                AMi aMi = (AMi) BDh.A08((AMi) this.A00);
                i = aMi.A00;
                interfaceC0900AHc = aMi.A02;
            }
            C7384Etj.A0X(interfaceC0900AHc);
            InterfaceC0900AHc interfaceC0900AHcA33 = interfaceC0900AHc.A33(t);
            if (C7384Etj.areEqual(interfaceC0900AHcA33, interfaceC0900AHc)) {
                return false;
            }
            AN8 an8 = this.A00;
            synchronized (BDh.A08) {
                snapshotA00 = BDh.A00();
                zA02 = AMg.A02(interfaceC0900AHcA33, (AMi) BDh.A02(snapshotA00, this, an8), i, true);
            }
            BDh.A0G(snapshotA00, this);
        } while (!zA02);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        int i;
        InterfaceC0900AHc<? extends T> interfaceC0900AHc;
        Snapshot snapshotA00;
        boolean zA02;
        do {
            synchronized (AMg.A00) {
                AMi aMi = (AMi) BDh.A08((AMi) this.A00);
                i = aMi.A00;
                interfaceC0900AHc = aMi.A02;
            }
            C7384Etj.A0X(interfaceC0900AHc);
            InterfaceC0900AHc interfaceC0900AHcA3L = interfaceC0900AHc.A3L(collection);
            if (C7384Etj.areEqual(interfaceC0900AHcA3L, interfaceC0900AHc)) {
                return false;
            }
            AN8 an8 = this.A00;
            synchronized (BDh.A08) {
                snapshotA00 = BDh.A00();
                zA02 = AMg.A02(interfaceC0900AHcA3L, (AMi) BDh.A02(snapshotA00, this, an8), i, true);
            }
            BDh.A0G(snapshotA00, this);
        } while (!zA02);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        Snapshot snapshotA00;
        AN8 an8 = this.A00;
        synchronized (BDh.A08) {
            snapshotA00 = BDh.A00();
            AMi aMi = (AMi) BDh.A02(snapshotA00, this, an8);
            synchronized (AMg.A00) {
                aMi.A02 = AHT.A01;
                aMi.A00++;
                aMi.A01++;
            }
        }
        BDh.A0G(snapshotA00, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return ((AMi) BDh.A07(this, this.A00)).A02.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return ((AMi) BDh.A07(this, this.A00)).A02.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    @Override // java.util.List
    public final T get(int i) {
        return ((AMi) BDh.A07(this, this.A00)).A02.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return ((AMi) BDh.A07(this, this.A00)).A02.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return ((AMi) BDh.A07(this, this.A00)).A02.isEmpty();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return ((AMi) BDh.A07(this, this.A00)).A02.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new AMh(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        InterfaceC0900AHc interfaceC0900AHc;
        Snapshot snapshotA00;
        boolean zA02;
        do {
            synchronized (AMg.A00) {
                AMi aMi = (AMi) BDh.A08((AMi) this.A00);
                i = aMi.A00;
                interfaceC0900AHc = aMi.A02;
            }
            C7384Etj.A0X(interfaceC0900AHc);
            InterfaceC0900AHc interfaceC0900AHcAal = (AHE) interfaceC0900AHc;
            int iIndexOf = interfaceC0900AHcAal.indexOf(obj);
            if (iIndexOf != -1) {
                interfaceC0900AHcAal = interfaceC0900AHcAal.Aal(iIndexOf);
            }
            if (C7384Etj.areEqual(interfaceC0900AHcAal, interfaceC0900AHc)) {
                return false;
            }
            AN8 an8 = this.A00;
            synchronized (BDh.A08) {
                snapshotA00 = BDh.A00();
                zA02 = AMg.A02(interfaceC0900AHcAal, (AMi) BDh.A02(snapshotA00, this, an8), i, true);
            }
            BDh.A0G(snapshotA00, this);
        } while (!zA02);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        int i;
        InterfaceC0900AHc<? extends T> interfaceC0900AHc;
        Snapshot snapshotA00;
        boolean zA02;
        do {
            synchronized (AMg.A00) {
                AMi aMiA0L = C8j5.A0L(this);
                i = aMiA0L.A00;
                interfaceC0900AHc = aMiA0L.A02;
            }
            C7384Etj.A0X(interfaceC0900AHc);
            InterfaceC0900AHc interfaceC0900AHcAag = interfaceC0900AHc.Aag(C2297BSx.A00(collection, 27));
            if (C7384Etj.areEqual(interfaceC0900AHcAag, interfaceC0900AHc)) {
                return false;
            }
            AN8 an8 = this.A00;
            synchronized (BDh.A08) {
                snapshotA00 = BDh.A00();
                zA02 = AMg.A02(interfaceC0900AHcAag, (AMi) BDh.A02(snapshotA00, this, an8), i, true);
            }
            BDh.A0G(snapshotA00, this);
        } while (!zA02);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return AMg.A03(this, C2297BSx.A00(collection, 34));
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return ((AMi) BDh.A07(this, this.A00)).A02.size();
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > size()) {
            throw C60O.A0i("fromIndex or toIndex are out of bounds");
        }
        return new AMf(this, i, i2);
    }

    public final String toString() {
        AMi aMi = (AMi) BDh.A08(this.A00);
        StringBuilder sbA0x = C60O.A0x("SnapshotStateList(value=");
        sbA0x.append(aMi.A02);
        return C8j5.A0V(this, sbA0x);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = ((AMi) BDh.A07(this, this.A00)).A02;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeValue(list.get(i2));
        }
    }

    public SnapshotStateList(InterfaceC0900AHc<? extends T> interfaceC0900AHc) {
        Snapshot snapshotA00 = BDh.A00();
        long jA09 = snapshotA00.A09();
        AMi aMi = new AMi();
        ((AN8) aMi).A00 = jA09;
        aMi.A02 = interfaceC0900AHc;
        if (!(snapshotA00 instanceof BDo)) {
            AMi aMi2 = new AMi();
            ((AN8) aMi2).A00 = 1L;
            aMi2.A02 = interfaceC0900AHc;
            ((AN8) aMi).A01 = aMi2;
        }
        this.A00 = aMi;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator();
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.Object] */
    @Override // java.util.List
    public final T set(int i, T t) {
        int i2;
        InterfaceC0900AHc<? extends T> interfaceC0900AHc;
        Snapshot snapshotA00;
        boolean zA02;
        ?? r6 = get(i);
        do {
            synchronized (AMg.A00) {
                AMi aMi = (AMi) BDh.A08((AMi) this.A00);
                i2 = aMi.A00;
                interfaceC0900AHc = aMi.A02;
            }
            C7384Etj.A0X(interfaceC0900AHc);
            InterfaceC0900AHc interfaceC0900AHcAcc = interfaceC0900AHc.Acc(t, i);
            if (C7384Etj.areEqual(interfaceC0900AHcAcc, interfaceC0900AHc)) {
                break;
            }
            AN8 an8 = this.A00;
            synchronized (BDh.A08) {
                snapshotA00 = BDh.A00();
                zA02 = AMg.A02(interfaceC0900AHcAcc, (AMi) BDh.A02(snapshotA00, this, an8), i2, false);
            }
            BDh.A0G(snapshotA00, this);
        } while (!zA02);
        return r6;
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) AbstractC0905AHh.A01(this, tArr);
    }

    @Override // X.BDs
    public final /* synthetic */ AN8 AQi(AN8 an8, AN8 an82, AN8 an83) {
        return null;
    }

    public SnapshotStateList() {
        this(AHT.A01);
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        int i2;
        InterfaceC0900AHc<? extends T> interfaceC0900AHc;
        Snapshot snapshotA00;
        boolean zA0s;
        do {
            synchronized (AMg.A00) {
                AMi aMiA0L = C8j5.A0L(this);
                i2 = aMiA0L.A00;
                interfaceC0900AHc = aMiA0L.A02;
            }
            C7384Etj.A0X(interfaceC0900AHc);
            InterfaceC0900AHc interfaceC0900AHcA3C = interfaceC0900AHc.A3C(t, i);
            if (!C7384Etj.areEqual(interfaceC0900AHcA3C, interfaceC0900AHc)) {
                AN8 an8 = this.A00;
                synchronized (BDh.A08) {
                    snapshotA00 = BDh.A00();
                    zA0s = C8j5.A0s(interfaceC0900AHcA3C, snapshotA00, this, an8, i2);
                }
                BDh.A0G(snapshotA00, this);
            } else {
                return;
            }
        } while (!zA0s);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        return AMg.A03(this, new BT5(collection, i, 2));
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return new AMh(this, 0);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [T, java.lang.Object] */
    @Override // java.util.List
    public final /* bridge */ T remove(int i) {
        int i2;
        InterfaceC0900AHc<? extends T> interfaceC0900AHc;
        Snapshot snapshotA00;
        boolean zA0s;
        ?? r5 = get(i);
        do {
            synchronized (AMg.A00) {
                AMi aMiA0L = C8j5.A0L(this);
                i2 = aMiA0L.A00;
                interfaceC0900AHc = aMiA0L.A02;
            }
            C7384Etj.A0X(interfaceC0900AHc);
            InterfaceC0900AHc interfaceC0900AHcAal = interfaceC0900AHc.Aal(i);
            if (!C7384Etj.areEqual(interfaceC0900AHcAal, interfaceC0900AHc)) {
                AN8 an8 = this.A00;
                synchronized (BDh.A08) {
                    snapshotA00 = BDh.A00();
                    zA0s = C8j5.A0s(interfaceC0900AHcAal, snapshotA00, this, an8, i2);
                }
                BDh.A0G(snapshotA00, this);
            } else {
                return r5;
            }
        } while (!zA0s);
        return r5;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC0905AHh.A00(this);
    }
}
