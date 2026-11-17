package X;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* loaded from: classes6.dex */
public abstract class GNG extends AbstractCollection implements Serializable {
    public static final Object[] A00 = BV4.A1W();

    private final int A02() {
        if ((this instanceof GNH) || (this instanceof GNJ)) {
            return 0;
        }
        if (!(this instanceof GNI)) {
            throw C8j3.A17();
        }
        GNI gni = (GNI) this;
        return gni.e.A02() + gni.A00;
    }

    private final int A03(Object[] objArr) {
        Object[] objArr2;
        int size;
        if (this instanceof GNE) {
            GNE gne = (GNE) this;
            if (!(gne instanceof GNJ)) {
                size = gne.size();
                for (int i = 0; i < size; i++) {
                    objArr[i] = gne.get(i);
                }
                return size;
            }
            GNJ gnj = (GNJ) gne;
            objArr2 = gnj.A01;
            size = gnj.A00;
        } else {
            if (this instanceof GND) {
                objArr[0] = ((GND) this).A00;
                return 1;
            }
            if (!(this instanceof GNH)) {
                return (this instanceof GN8 ? ((GN8) this).A00 : A04()).A03(objArr);
            }
            GNH gnh = (GNH) this;
            objArr2 = gnh.A03;
            size = gnh.A02;
        }
        System.arraycopy(objArr2, 0, objArr, 0, size);
        return size;
    }

    private final Object[] A05() {
        if (this instanceof GNH) {
            return ((GNH) this).A03;
        }
        if (this instanceof GNJ) {
            return ((GNJ) this).A01;
        }
        if (this instanceof GNI) {
            return ((GNI) this).e.A05();
        }
        return null;
    }

    public final GNE A04() {
        Object[] array;
        int length;
        GNE gna;
        if (this instanceof GNE) {
            return (GNE) this;
        }
        GNF gnf = (GNF) this;
        if (gnf instanceof GND) {
            return GNE.A01(((GND) gnf).A00);
        }
        if (gnf instanceof GN8) {
            return ((GN8) gnf).A00;
        }
        GNE gne = gnf.A00;
        if (gne != null) {
            return gne;
        }
        if (gnf instanceof GNH) {
            GNH gnh = (GNH) gnf;
            array = gnh.A03;
            length = gnh.A02;
        } else {
            if (gnf instanceof GN9) {
                gna = new GNA((GN9) gnf);
                gnf.A00 = gna;
                return gna;
            }
            array = gnf.toArray(A00);
            length = array.length;
        }
        GNC gnc = GNE.A00;
        gna = length == 0 ? GNJ.A02 : new GNJ(length, array);
        gnf.A00 = gna;
        return gna;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw C8j3.A17();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw C8j3.A17();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw C8j3.A17();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw C8j3.A17();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw C8j3.A17();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw C8j3.A17();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        int iA02;
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] objArrA05 = A05();
            if (objArrA05 != null) {
                int iA022 = A02();
                if (this instanceof GNH) {
                    iA02 = ((GNH) this).A02;
                } else if (this instanceof GNJ) {
                    iA02 = ((GNJ) this).A00;
                } else if (this instanceof GNI) {
                    GNI gni = (GNI) this;
                    iA02 = gni.e.A02() + gni.A00 + gni.A01;
                } else {
                    throw C8j3.A17();
                }
                return Arrays.copyOfRange(objArrA05, iA022, iA02, objArr.getClass());
            }
            if (length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        A03(objArr);
        return objArr;
    }
}
