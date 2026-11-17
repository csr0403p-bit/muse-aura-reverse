package X;

import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class BPW {
    public static final List A01(BFM bfm, List list, List list2) {
        ArrayList arrayListA0i;
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        if (objAaT == obj) {
            objAaT = C3cG.A0k();
            bfm.Ai0(objAaT);
        }
        Set set = (Set) objAaT;
        Object objAaT2 = bfm.AaT();
        if (objAaT2 == obj) {
            objAaT2 = C3cG.A0k();
            bfm.Ai0(objAaT2);
        }
        Set set2 = (Set) objAaT2;
        bfm.AgE(110758886);
        if (list instanceof RandomAccess) {
            arrayListA0i = C60Q.A0t(list);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayListA0i.add(A00(bfm, (BRL) list.get(i), list2, set, set2));
            }
        } else {
            arrayListA0i = AnonymousClass003.A0i(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(A00(bfm, (BRL) it.next(), list2, set, set2));
            }
        }
        A02(bfm, arrayListA0i, list2, set, set2, AnonymousClass001.A1V(bfm) ? 1 : 0);
        return arrayListA0i;
    }

    public static final BRL A00(BFM bfm, final BRL brl, final List list, final Set set, final Set set2) {
        bfm.AgE(-1239021605);
        final MutableState mutableStateA00 = C1er.A00(bfm, list);
        final Object obj = brl.A00;
        bfm.Ag8(-993800456, obj);
        BRL brl2 = new BRL(brl.A01, obj, brl.A02, B1V.A00(bfm, new G0W() { // from class: X.BOU
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r9v4, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r9v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
            @Override // X.G0W
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                ?? A0T;
                Set set3 = set2;
                Object obj5 = obj;
                Set set4 = set;
                C1BO c1bo = mutableStateA00;
                List list2 = list;
                BRL brl3 = brl;
                BFM bfm2 = (BFM) obj3;
                int iA0F = AnonymousClass001.A0F(obj4);
                BRL brl4 = brl3;
                if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0F & 17, 16), bfm2, iA0F)) {
                    boolean zA1R = AnonymousClass001.A1R(bfm2, c1bo, AnonymousClass005.A1S(bfm2, set3, obj5, set4));
                    Object objAaT = bfm2.AaT();
                    if (zA1R || objAaT == C78N.A00) {
                        objAaT = new BTX(set3, obj5, set4, c1bo, 8);
                        bfm2.Ai0(objAaT);
                    }
                    AnonymousClass001.A17(bfm2, objAaT, obj5);
                    bfm2.AgE(358947325);
                    if (list2 instanceof RandomAccess) {
                        C0917AHt c0917AHt = new C0917AHt(list2.size());
                        A0T = C60Q.A0t(list2);
                        int size = list2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj6 = list2.get(i);
                            if (c0917AHt.A0B(obj6)) {
                                A0T.add(obj6);
                            }
                        }
                    } else {
                        A0T = AbstractC0878AGe.A0T(list2);
                    }
                    if (!A0T.isEmpty()) {
                        ListIterator listIterator = A0T.listIterator(A0T.size());
                        while (listIterator.hasPrevious()) {
                            brl3 = new BRL(brl4.A01, brl4.A00, brl4.A02, B1V.A00(bfm2, new BTD(1, listIterator.previous(), brl4), -330823412));
                            brl4 = brl3;
                        }
                    }
                    AnonymousClass001.A1D(bfm2);
                    brl3.A00(bfm2, 0);
                } else {
                    bfm2.Afo();
                }
                return Unit.INSTANCE;
            }
        }, -1349345695));
        AnonymousClass006.A1M(bfm);
        return brl2;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(Ljava/util/List<LX/BRL<TT;>;>;Ljava/util/List<+LX/BQw<TT;>;>;Ljava/util/Set<Ljava/lang/Object;>;Ljava/util/Set<Ljava/lang/Object;>;LX/BFM;I)V */
    public static final void A02(BFM bfm, List list, List list2, Set set, Set set2, int i) {
        bfm.AgG(-720826424);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, list) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, list2);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, set);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, set2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0T), bfm, iA0T)) {
            MutableState mutableStateA00 = C1er.A00(bfm, list);
            MutableState mutableStateA002 = C1er.A00(bfm, list2);
            if (list instanceof RandomAccess) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj = ((BRL) list.get(i2)).A00;
                    set.add(obj);
                    List listA0X = AbstractC0878AGe.A0X(list);
                    boolean zA65 = bfm.A65(mutableStateA00) | bfm.A67(obj) | bfm.A67(set) | bfm.A67(set2) | bfm.A65(mutableStateA002);
                    Object objAaT = bfm.AaT();
                    if (zA65 || objAaT == C78N.A00) {
                        objAaT = new C2301BTb(obj, mutableStateA00, mutableStateA002, set2, set, 3);
                        bfm.Ai0(objAaT);
                    }
                    C78e.A03(bfm, obj, listA0X, (G0U) objAaT);
                }
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Object obj2 = ((BRL) it.next()).A00;
                    set.add(obj2);
                    List listA0X2 = AbstractC0878AGe.A0X(list);
                    boolean zA652 = bfm.A65(mutableStateA00) | bfm.A67(obj2) | bfm.A67(set) | bfm.A67(set2) | bfm.A65(mutableStateA002);
                    Object objAaT2 = bfm.AaT();
                    if (zA652 || objAaT2 == C78N.A00) {
                        objAaT2 = new C2301BTb(obj2, mutableStateA00, mutableStateA002, set2, set, 3);
                        bfm.Ai0(objAaT2);
                    }
                    C78e.A03(bfm, obj2, listA0X2, (G0U) objAaT2);
                }
            }
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new BTZ(list2, list, set2, set, i, 2);
        }
    }
}
