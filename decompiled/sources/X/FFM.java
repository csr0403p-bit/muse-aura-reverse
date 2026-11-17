package X;

import android.database.Observable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bloks.stdlib.components.bkcomponentscollection.StickyItemsLinearLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class FFM extends Observable<FFO> {
    public final void A02(int i, int i2) {
        int size = ((Observable) this).mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            FFO ffo = (FFO) ((Observable) this).mObservers.get(size);
            if (ffo instanceof C8096FTc) {
                C8096FTc c8096FTc = (C8096FTc) ffo;
                RecyclerView recyclerView = c8096FTc.A00;
                recyclerView.A12(null);
                FTZ ftz = recyclerView.A0B;
                if (i2 >= 1) {
                    ArrayList<C8102FTp> arrayList = ftz.A04;
                    arrayList.add(ftz.ARd(null, 4, i, i2));
                    ftz.A00 |= 4;
                    if (arrayList.size() == 1) {
                        C8096FTc.A00(c8096FTc);
                    }
                }
            }
        }
    }

    public final void A00() {
        int size = ((Observable) this).mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((FFO) ((Observable) this).mObservers.get(size)).A01();
            }
        }
    }

    public final void A01(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            FFO ffo = (FFO) ((Observable) this).mObservers.get(size);
            if (ffo instanceof C8096FTc) {
                C8096FTc c8096FTc = (C8096FTc) ffo;
                RecyclerView recyclerView = c8096FTc.A00;
                recyclerView.A12(null);
                FTZ ftz = recyclerView.A0B;
                if (i != i2) {
                    ArrayList<C8102FTp> arrayList = ftz.A04;
                    arrayList.add(ftz.ARd(null, 8, i, i2));
                    ftz.A00 |= 8;
                    if (arrayList.size() == 1) {
                        C8096FTc.A00(c8096FTc);
                    }
                }
            }
        }
    }

    public final void A03(int i, int i2) {
        C7782FEm c7782FEmA01;
        Map<Integer, Integer> map;
        C7782FEm c7782FEmA012;
        int size = ((Observable) this).mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            FFO ffo = (FFO) ((Observable) this).mObservers.get(size);
            if (ffo instanceof FR6) {
                StickyItemsLinearLayoutManager stickyItemsLinearLayoutManager = ((FR6) ffo).A00;
                List<Integer> list = stickyItemsLinearLayoutManager.A05;
                int iA00 = StickyItemsLinearLayoutManager.A00(list, i);
                if (iA00 != -1) {
                    StickyItemsLinearLayoutManager.A0C(list, stickyItemsLinearLayoutManager.A09, iA00, i2);
                }
                List<Integer> list2 = stickyItemsLinearLayoutManager.A04;
                int iA002 = StickyItemsLinearLayoutManager.A00(list2, i);
                if (iA002 != -1) {
                    StickyItemsLinearLayoutManager.A0C(list2, stickyItemsLinearLayoutManager.A08, iA002, i2);
                }
                int i3 = ((LinearLayoutManager) stickyItemsLinearLayoutManager).A01 == 1 ? ((FTN) stickyItemsLinearLayoutManager).A00 : ((FTN) stickyItemsLinearLayoutManager).A03;
                int i4 = i2 + i;
                for (int i5 = i; i5 < i4; i5++) {
                    FFL<?> ffl = stickyItemsLinearLayoutManager.A02;
                    if (ffl == null || (c7782FEmA012 = FFL.A01(ffl, i5)) == null || FF8.A01(c7782FEmA012.A01) != C79.A00) {
                        FFL<?> ffl2 = stickyItemsLinearLayoutManager.A02;
                        if (ffl2 != null && (c7782FEmA01 = FFL.A01(ffl2, i5)) != null && FF8.A01(c7782FEmA01.A01) == C79.A01) {
                            int iA003 = StickyItemsLinearLayoutManager.A00(list2, i5);
                            if (iA003 != -1) {
                                list2.add(iA003, Integer.valueOf(i5));
                            } else {
                                AbstractC7608F5v.A1A(i5, list2);
                            }
                            map = stickyItemsLinearLayoutManager.A08;
                        }
                    } else {
                        int iA004 = StickyItemsLinearLayoutManager.A00(list, i5);
                        if (iA004 != -1) {
                            list.add(iA004, Integer.valueOf(i5));
                        } else {
                            AbstractC7608F5v.A1A(i5, list);
                        }
                        map = stickyItemsLinearLayoutManager.A09;
                    }
                    BV4.A1H(Integer.valueOf(i5), map, FF8.A00(stickyItemsLinearLayoutManager.A02, i5, i3));
                }
            } else {
                C8096FTc c8096FTc = (C8096FTc) ffo;
                RecyclerView recyclerView = c8096FTc.A00;
                recyclerView.A12(null);
                FTZ ftz = recyclerView.A0B;
                if (i2 >= 1) {
                    ArrayList<C8102FTp> arrayList = ftz.A04;
                    arrayList.add(ftz.ARd(null, 1, i, i2));
                    ftz.A00 |= 1;
                    if (arrayList.size() == 1) {
                        C8096FTc.A00(c8096FTc);
                    }
                }
            }
        }
    }

    public final void A04(int i, int i2) {
        int size = ((Observable) this).mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            FFO ffo = (FFO) ((Observable) this).mObservers.get(size);
            if (ffo instanceof FR6) {
                FR6 fr6 = (FR6) ffo;
                int i3 = i + i2;
                int i4 = i3 - 1;
                boolean z = false;
                boolean z2 = false;
                if (i <= i4) {
                    int i5 = i4;
                    while (true) {
                        StickyItemsLinearLayoutManager stickyItemsLinearLayoutManager = fr6.A00;
                        List<Integer> list = stickyItemsLinearLayoutManager.A05;
                        int iA0w = AbstractC0885AGm.A0w(Integer.valueOf(i5), list, list.size());
                        if (iA0w >= 0) {
                            stickyItemsLinearLayoutManager.A09.remove(list.get(iA0w));
                            list.remove(iA0w);
                            List<FR7> list2 = stickyItemsLinearLayoutManager.A07;
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                Iterator<FR7> it = list2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    } else if (it.next().A00 == i5) {
                                        z2 = true;
                                        break;
                                    }
                                }
                            }
                        }
                        if (i5 == i) {
                            break;
                        } else {
                            i5--;
                        }
                    }
                }
                StickyItemsLinearLayoutManager stickyItemsLinearLayoutManager2 = fr6.A00;
                if (!stickyItemsLinearLayoutManager2.A07.isEmpty() && z2) {
                    StickyItemsLinearLayoutManager.A07(null, stickyItemsLinearLayoutManager2);
                }
                List<Integer> list3 = stickyItemsLinearLayoutManager2.A05;
                int iA00 = StickyItemsLinearLayoutManager.A00(list3, i3);
                if (iA00 != -1) {
                    StickyItemsLinearLayoutManager.A0C(list3, stickyItemsLinearLayoutManager2.A09, iA00, -i2);
                }
                if (i <= i4) {
                    while (true) {
                        List<Integer> list4 = stickyItemsLinearLayoutManager2.A04;
                        int iA0w2 = AbstractC0885AGm.A0w(Integer.valueOf(i4), list4, list4.size());
                        if (iA0w2 >= 0) {
                            stickyItemsLinearLayoutManager2.A08.remove(list4.get(iA0w2));
                            list4.remove(iA0w2);
                            List<FR7> list5 = stickyItemsLinearLayoutManager2.A06;
                            if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                                Iterator<FR7> it2 = list5.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if (it2.next().A00 == i4) {
                                        z = true;
                                        break;
                                    }
                                }
                            }
                        }
                        if (i4 == i) {
                            break;
                        } else {
                            i4--;
                        }
                    }
                }
                if (!stickyItemsLinearLayoutManager2.A06.isEmpty() && z) {
                    StickyItemsLinearLayoutManager.A06(null, stickyItemsLinearLayoutManager2);
                }
                List<Integer> list6 = stickyItemsLinearLayoutManager2.A04;
                int iA002 = StickyItemsLinearLayoutManager.A00(list6, i3);
                if (iA002 != -1) {
                    StickyItemsLinearLayoutManager.A0C(list6, stickyItemsLinearLayoutManager2.A08, iA002, -i2);
                }
            } else {
                C8096FTc c8096FTc = (C8096FTc) ffo;
                RecyclerView recyclerView = c8096FTc.A00;
                recyclerView.A12(null);
                FTZ ftz = recyclerView.A0B;
                if (i2 >= 1) {
                    ArrayList<C8102FTp> arrayList = ftz.A04;
                    arrayList.add(ftz.ARd(null, 2, i, i2));
                    ftz.A00 |= 2;
                    if (arrayList.size() == 1) {
                        C8096FTc.A00(c8096FTc);
                    }
                }
            }
        }
    }

    public final boolean A05() {
        return !((Observable) this).mObservers.isEmpty();
    }
}
