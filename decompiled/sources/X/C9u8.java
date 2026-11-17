package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* renamed from: X.9u8, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class C9u8 {
    /* JADX WARN: Incorrect types in method signature: (LX/9uG<Ljava/lang/Object;>;Ljava/util/List<+LX/9hr<Ljava/lang/Object;>;>;Lkotlin/jvm/functions/Function0<+LX/BO5;>;)LX/9hr<+Ljava/lang/Object;>; */
    public static final C9hr A01(List list, Function0 function0, C9uG c9uG) {
        C7384Etj.A0Y(c9uG, 0);
        if (A04(Collection.class, c9uG) || A04(List.class, c9uG) || A04(List.class, c9uG) || A04(ArrayList.class, c9uG)) {
            return C3cG.A19((C9hr) list.get(0));
        }
        if (A04(HashSet.class, c9uG)) {
            return new A66((C9hr) list.get(0));
        }
        if (A04(Set.class, c9uG) || A04(Set.class, c9uG) || A04(LinkedHashSet.class, c9uG)) {
            return new A65((C9hr) list.get(0));
        }
        if (A04(HashMap.class, c9uG)) {
            return new C9tT((C9hr) list.get(0), (C9hr) list.get(1));
        }
        if (A04(Map.class, c9uG) || A04(Map.class, c9uG) || A04(LinkedHashMap.class, c9uG)) {
            return new C9tS((C9hr) list.get(0), (C9hr) list.get(1));
        }
        if (A04(Map.Entry.class, c9uG)) {
            final C9hr c9hr = (C9hr) list.get(0);
            final C9hr c9hr2 = (C9hr) list.get(1);
            C7384Etj.A0Y(c9hr, 0);
            C7384Etj.A0Y(c9hr2, 1);
            return new C9uB<K, V, Map.Entry<? extends K, ? extends V>>(c9hr, c9hr2) { // from class: X.9u6
                public final C9iZ A00;

                @Override // X.C9hr, X.C9hv, X.C9jG
                public final C9iZ getDescriptor() {
                    return this.A00;
                }

                {
                    super(c9hr, c9hr2);
                    this.A00 = C9iY.A02("kotlin.collections.Map.Entry", new BT9(27, c9hr2, c9hr), C9tE.A00);
                }
            };
        }
        if (A04(HxE.class, c9uG)) {
            final C9hr c9hr3 = (C9hr) list.get(0);
            final C9hr c9hr4 = (C9hr) list.get(1);
            C7384Etj.A0Y(c9hr3, 0);
            C7384Etj.A0Y(c9hr4, 1);
            return new C9uB<K, V, HxE<? extends K, ? extends V>>(c9hr3, c9hr4) { // from class: X.9u7
                public final C9iZ A00;

                @Override // X.C9hr, X.C9hv, X.C9jG
                public final C9iZ getDescriptor() {
                    return this.A00;
                }

                {
                    super(c9hr3, c9hr4);
                    this.A00 = C9iY.A01("X.HxE", new BT9(28, c9hr4, c9hr3));
                }
            };
        }
        if (A04(HwV.class, c9uG)) {
            C9hr c9hr5 = (C9hr) list.get(0);
            C9hr c9hr6 = (C9hr) list.get(1);
            C9hr c9hr7 = (C9hr) list.get(2);
            C7384Etj.A0Y(c9hr5, 0);
            C7384Etj.A0Y(c9hr6, 1);
            C7384Etj.A0Y(c9hr7, 2);
            return new C9uA(c9hr5, c9hr6, c9hr7);
        }
        if (!C9uT.A01(c9uG).isArray()) {
            C9hr[] c9hrArr = (C9hr[]) list.toArray(new C9hr[0]);
            return F2Z.A01(c9uG, (C9hr[]) Arrays.copyOf(c9hrArr, c9hrArr.length));
        }
        Object objInvoke = function0.invoke();
        C7384Etj.A0Z(objInvoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        C9uG c9uG2 = (C9uG) objInvoke;
        C9hr c9hr8 = (C9hr) list.get(0);
        C7384Etj.A0Y(c9uG2, 0);
        C7384Etj.A0Y(c9hr8, 1);
        return new C9uR(c9uG2, c9hr8);
    }

    public static final <T> C9hr<T> A02(C9uG<T> c9uG) {
        C7384Etj.A0Y(c9uG, 0);
        C9hr<T> c9hrA01 = F2Z.A01(c9uG, new C9hr[0]);
        return c9hrA01 == null ? (C9hr) AbstractC08189td.A00.get(c9uG) : c9hrA01;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/9pz;LX/9uE;)LX/9hr<Ljava/lang/Object;>; */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C9hr A03(X.C9uE r7, X.C07959pz r8) {
        /*
            r4 = 0
            r0 = 1
            X.C7384Etj.A0Y(r7, r0)
            X.BO5 r3 = r7.ADh()
            boolean r0 = r3 instanceof X.C9uG
            if (r0 == 0) goto Ld9
            X.9uG r3 = (X.C9uG) r3
            boolean r6 = r7.AOi()
            java.util.List r0 = r7.ACU()
            java.util.ArrayList r5 = X.AnonymousClass003.A0i(r0)
            java.util.Iterator r2 = r0.iterator()
        L1f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L41
            java.lang.Object r0 = r2.next()
            X.7nn r0 = (X.C07107nn) r0
            X.C7384Etj.A0Y(r0, r4)
            X.9uE r1 = r0.A01
            if (r1 == 0) goto L36
            r5.add(r1)
            goto L1f
        L36:
            java.lang.String r0 = "Star projections in type arguments are not allowed, but had "
            java.lang.String r0 = X.AnonymousClass007.A0a(r0, r1)
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            throw r0
        L41:
            boolean r0 = r5.isEmpty()
            r2 = 0
            if (r0 == 0) goto La1
            X.C7384Etj.A0Y(r3, r4)
            java.lang.Class r0 = X.C9uT.A01(r3)
            boolean r0 = r0.isInterface()
            if (r0 == 0) goto Lba
            X.AGi r0 = X.C0881AGi.A00
            X.9hr r0 = r8.A00(r0, r3)
            if (r0 == 0) goto Lba
        L5d:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L8c
            X.9hr r1 = A02(r3)
            if (r1 != 0) goto L83
            X.AGi r0 = X.C0881AGi.A00
            X.9hr r1 = r8.A00(r0, r3)
        L6f:
            if (r1 != 0) goto L83
            X.C7384Etj.A0Y(r3, r4)
            java.lang.Class r0 = X.C9uT.A01(r3)
            boolean r0 = r0.isInterface()
            if (r0 == 0) goto Lce
            kotlinx.serialization.PolymorphicSerializer r1 = new kotlinx.serialization.PolymorphicSerializer
            r1.<init>(r3)
        L83:
            if (r6 == 0) goto L89
            X.9hr r1 = X.AbstractC07749im.A00(r1)
        L89:
            if (r1 == 0) goto Lce
            return r1
        L8c:
            java.util.List r2 = A00(r5, r8)
            r0 = 45
            X.BSt r0 = X.C2293BSt.A00(r5, r0)
            X.9hr r1 = A01(r2, r0, r3)
            if (r1 != 0) goto L83
            X.9hr r1 = r8.A00(r2, r3)
            goto L6f
        La1:
            boolean r0 = r8.A05
            if (r0 != 0) goto L5d
            X.9uC<? extends java.lang.Object> r0 = X.C9u9.A00
            X.C7384Etj.A0Y(r3, r4)
            if (r6 == 0) goto Lae
            X.9uC<java.lang.Object> r0 = X.C9u9.A01
        Lae:
            java.lang.Object r1 = r0.AC5(r5, r3)
            boolean r0 = r1 instanceof X.C10571Hud
            if (r0 == 0) goto Lb7
            r1 = r2
        Lb7:
            X.9hr r1 = (X.C9hr) r1
            goto Lc4
        Lba:
            if (r6 != 0) goto Lc7
            X.9uD<? extends java.lang.Object> r0 = X.C9u9.A02
            X.9hr r1 = r0.AC2(r3)
            if (r1 == 0) goto L5d
        Lc4:
            if (r1 == 0) goto L5d
            return r1
        Lc7:
            X.9uD<java.lang.Object> r0 = X.C9u9.A03
            X.9hr r1 = r0.AC2(r3)
            goto Lc4
        Lce:
            X.C7384Etj.A0Y(r3, r4)
            X.C9iG.A01(r3)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        Ld9:
            java.lang.String r0 = "Only KClass supported as classifier, got "
            java.lang.String r0 = X.AnonymousClass007.A0a(r0, r3)
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9u8.A03(X.9uE, X.9pz):X.9hr");
    }

    public static boolean A04(Class cls, Object obj) {
        return obj.equals(new C0861A6i(cls));
    }

    public static final List A00(List list, C07959pz c07959pz) {
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(A03((C9uE) it.next(), c07959pz));
        }
        return arrayListA0i;
    }
}
