package X;

import android.graphics.Rect;
import android.util.LongSparseArray;
import com.facebook.aura.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FEg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7776FEg extends AbstractC7559F3s implements G0U {
    public final /* synthetic */ FDW $component;
    public final /* synthetic */ List<List<FDW>> $grid;
    public final /* synthetic */ ArrayList<long[]> $gridItemMeasureProperties;
    public final /* synthetic */ ArrayList<List<Rect>> $offsets;
    public final /* synthetic */ int $scrollDirection;
    public final /* synthetic */ boolean $useContinuations;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/FDW;IZLjava/util/List<+Ljava/util/List<+LX/FDW;>;>;Ljava/util/ArrayList<Ljava/util/List<Landroid/graphics/Rect;>;>;Ljava/util/ArrayList<[J>;)V */
    public C7776FEg(FDW fdw, ArrayList arrayList, ArrayList arrayList2, List list, int i, boolean z) {
        super(1);
        this.$component = fdw;
        this.$scrollDirection = i;
        this.$useContinuations = z;
        this.$grid = list;
        this.$offsets = arrayList;
        this.$gridItemMeasureProperties = arrayList2;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C7775FEf c7775FEf;
        InterfaceC7780FEk interfaceC7780FEk = (InterfaceC7780FEk) obj;
        C7384Etj.A0Y(interfaceC7780FEk, 0);
        FDW fdw = this.$component;
        int i = this.$scrollDirection;
        boolean z = this.$useContinuations;
        List<List<FDW>> list = this.$grid;
        ArrayList<List<Rect>> arrayList = this.$offsets;
        ArrayList<long[]> arrayList2 = this.$gridItemMeasureProperties;
        FBB fbbAJW = interfaceC7780FEk.AJW();
        if (fbbAJW != null) {
            fbbAJW.A01.get(R.id.bk_context_key_rendercore_extensions_creator);
        }
        C7777FEh c7777FEh = new C7777FEh(fdw, interfaceC7780FEk);
        FCA fcaA01 = AbstractC7752FDe.A00.A01();
        ArrayList arrayListA0t = C60Q.A0t(list);
        ArrayList arrayListA0t2 = C60Q.A0t(fdw.A0G());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List<FDW> list2 = list.get(i2);
            ArrayList arrayListA0h = C3cG.A0h();
            long[] jArr = arrayList2.get(i2);
            C7384Etj.A0U(jArr);
            long[] jArr2 = jArr;
            ArrayList arrayListA0m = AnonymousClass002.A0m(list2);
            Iterator<FDW> it = list2.iterator();
            while (it.hasNext()) {
                arrayListA0m.add(new FCW(AbstractC7607F5u.A0y(it), null, null));
            }
            ArrayList arrayListA0m2 = AnonymousClass002.A0m(list2);
            Iterator<FDW> it2 = list2.iterator();
            while (it2.hasNext()) {
                FDW fdwA0y = AbstractC7607F5u.A0y(it2);
                C7384Etj.A0Y(fdwA0y, 0);
                long j = fdwA0y.A04;
                LongSparseArray<C7775FEf> longSparseArray = c7777FEh.A01;
                synchronized (longSparseArray) {
                    c7775FEf = longSparseArray.get(j);
                }
                if (c7775FEf == null) {
                    LongSparseArray<C7775FEf> longSparseArray2 = c7777FEh.A00;
                    if (longSparseArray2 != null) {
                        synchronized (longSparseArray2) {
                            c7775FEf = longSparseArray2.get(j);
                        }
                    } else {
                        c7775FEf = null;
                    }
                }
                arrayListA0m2.add(c7775FEf);
            }
            ArrayList arrayListA0m3 = AnonymousClass002.A0m(arrayListA0m2);
            Iterator it3 = arrayListA0m2.iterator();
            while (it3.hasNext()) {
                C7775FEf c7775FEf2 = (C7775FEf) it3.next();
                arrayListA0m3.add(c7775FEf2 != null ? c7775FEf2.A01 : null);
            }
            ArrayList arrayListA11 = C60O.A11(jArr2.length);
            for (long j2 : jArr2) {
                arrayListA11.add(new C7827FGi(C7827FGi.A00((int) (j2 >> 32), (int) j2)));
            }
            C7773FEd c7773FEd = new C7773FEd(interfaceC7780FEk.ACP(), fbbAJW, fcaA01, arrayListA0m, arrayListA0m3, arrayListA11, i, interfaceC7780FEk.AH0());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                FDW fdwA0z = AbstractC7607F5u.A0z(list2, i3);
                long j3 = jArr2[i3];
                C7775FEf c7775FEf3 = (C7775FEf) arrayListA0m2.get(i3);
                FEI fei = new FEI(c7775FEf3 != null ? c7775FEf3.A00 : null, new CallableC7774FEe(c7775FEf3, c7777FEh, c7773FEd, fdwA0z, fcaA01, interfaceC7780FEk, i3, i), C7827FGi.A00((int) (j3 >> 32), (int) j3));
                if (c7775FEf3 != null) {
                    C7384Etj.A0Y(fdwA0z, 0);
                    LongSparseArray<C7775FEf> longSparseArray3 = c7777FEh.A01;
                    synchronized (longSparseArray3) {
                        longSparseArray3.put(fdwA0z.A04, c7775FEf3);
                    }
                }
                C7782FEm c7782FEm = new C7782FEm(fei, fdwA0z);
                arrayListA0h.add(new C7781FEl(arrayList.get(i2).get(i3), c7782FEm));
                arrayListA0t2.add(c7782FEm);
            }
            arrayListA0t.add(arrayListA0h);
        }
        if (z) {
            interfaceC7780FEk.Aih(fdw, arrayListA0t2);
        }
        return C3cG.A0r(arrayListA0t2, arrayListA0t);
    }
}
