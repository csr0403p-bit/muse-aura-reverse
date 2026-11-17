package X;

import android.util.SparseArray;
import com.facebook.aura.bloks.coreplugins.AuraBloksCorePlugins;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public final class FCC {
    public final int A00;
    public final FCA A01;
    public final Integer A02;
    public final List<FDW> A03;
    public final Executor A04;
    public final AtomicInteger A05;

    public static final boolean A01(FCC fcc, List list, boolean z) {
        if (z) {
            for (int iA0E = AnonymousClass002.A0E(list); -1 < iA0E; iA0E--) {
                if (!fcc.A00(AbstractC7607F5u.A0z(list, iA0E))) {
                    return false;
                }
            }
        } else {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (!fcc.A00(AbstractC7607F5u.A0z(list, i))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean A00(FDW fdw) {
        int i;
        SparseArray<HsM> sparseArrayA00;
        if (((fdw.A00 & 1) != 0) && ((i = fdw.A05) != 13320 || !"gone".equals(fdw.A0F(49)))) {
            AtomicInteger atomicInteger = this.A05;
            int i2 = this.A00;
            if (atomicInteger.get() != i2) {
                return false;
            }
            if ((fdw.A00 & 8) != 0 && (sparseArrayA00 = fdw.A07.A00()) != null) {
                int size = sparseArrayA00.size();
                for (int i3 = 0; i3 < size; i3++) {
                    int iKeyAt = sparseArrayA00.keyAt(i3);
                    HsM hsMValueAt = sparseArrayA00.valueAt(i3);
                    C7384Etj.A0U(hsMValueAt);
                    FCA.A01(this.A01, null, new FAU(fdw, hsMValueAt, iKeyAt), iKeyAt | (fdw.A04 << 27) | 1152921504606846976L);
                    if (atomicInteger.get() != i2) {
                        return false;
                    }
                }
            }
            FAP fap = AuraBloksCorePlugins.CHILD_ATTRIBUTE_MAPPER;
            C7384Etj.A0U(fap);
            int[] subNodes = fap.getSubNodes(i);
            C7384Etj.A0U(subNodes);
            for (int i4 : subNodes) {
                FDW fdwA0C = fdw.A0C(i4);
                if (fdwA0C != null && !A00(fdwA0C)) {
                    return false;
                }
            }
            int[] pluralSubNodes = fap.getPluralSubNodes(i);
            C7384Etj.A0U(pluralSubNodes);
            for (int i5 : pluralSubNodes) {
                if (i == 13317 && i5 == 32) {
                    List listA14 = AbstractC7608F5v.A14(fdw, i5);
                    boolean zA0L = fdw.A0L(73, false);
                    int iIntValue = this.A02.intValue();
                    if (iIntValue == 1) {
                        List<FDW> list = this.A03;
                        if (list != 0) {
                            if (zA0L) {
                                for (int iA00 = C60O.A00(listA14); -1 < iA00; iA00--) {
                                    list.add(listA14.get(iA00));
                                }
                            } else {
                                list.addAll(listA14);
                            }
                        }
                    } else if (iIntValue != 2) {
                        if (iIntValue != 0) {
                            throw C3cG.A0q();
                        }
                        if (!A01(this, listA14, zA0L)) {
                            return false;
                        }
                    } else if (!listA14.isEmpty()) {
                        this.A04.execute(new FCG(this, listA14, zA0L));
                    }
                } else {
                    List<FDW> listA0I = fdw.A0I(i5);
                    if (listA0I != null) {
                        int size2 = listA0I.size();
                        for (int i6 = 0; i6 < size2; i6++) {
                            FDW fdwA0z = AbstractC7607F5u.A0z(listA0I, i6);
                            if (fdwA0z != null && !A00(fdwA0z)) {
                                return false;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
            for (int i7 : FA7.A02(i)) {
                if (i == 13317 && i7 == 32) {
                    List listA142 = AbstractC7608F5v.A14(fdw, i7);
                    boolean zA0L2 = fdw.A0L(73, false);
                    int iIntValue2 = this.A02.intValue();
                    if (iIntValue2 == 1) {
                        List<FDW> list2 = this.A03;
                        if (list2 != 0) {
                            if (zA0L2) {
                                for (int iA002 = C60O.A00(listA142); -1 < iA002; iA002--) {
                                    list2.add(listA142.get(iA002));
                                }
                            } else {
                                list2.addAll(listA142);
                            }
                        }
                    } else if (iIntValue2 != 2) {
                        if (iIntValue2 != 0) {
                            throw C3cG.A0q();
                        }
                        if (!A01(this, listA142, zA0L2)) {
                            return false;
                        }
                    } else if (!listA142.isEmpty()) {
                        this.A04.execute(new FCG(this, listA142, zA0L2));
                    }
                } else {
                    List<?> listA01 = FA7.A01(fdw, i7, true);
                    if (listA01 != null) {
                        int size3 = listA01.size();
                        for (int i8 = 0; i8 < size3; i8++) {
                            FDW fdwA00 = FA7.A00(listA01, i8, true);
                            if (fdwA00 != null && !A00(fdwA00)) {
                                return false;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return true;
    }

    public FCC(FCA fca, Integer num, Executor executor, AtomicInteger atomicInteger, int i) {
        this.A01 = fca;
        this.A05 = atomicInteger;
        this.A00 = i;
        this.A04 = executor;
        this.A02 = num;
        this.A03 = num == C79.A01 ? C3cG.A0h() : null;
    }

    public final void A02(FDW fdw) {
        List<FDW> list;
        if (!A00(fdw) || (list = this.A03) == null) {
            return;
        }
        int i = 0;
        while (i < list.size()) {
            int i2 = i + 1;
            if (!A00(AbstractC7607F5u.A0z(list, i))) {
                return;
            } else {
                i = i2;
            }
        }
    }
}
