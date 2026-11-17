package X;

import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.CUi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3565CUi<T> {
    public final int A00;
    public final int A01;
    public final CUY<T> A02;
    public final Set<C3567CUm> A03;
    public final Set<Class<? super T>> A04;
    public final Set<Class<?>> A05;

    public static void A01(Class cls, Object obj, AbstractCollection abstractCollection) {
        abstractCollection.add(A00(cls, obj, new Class[0]));
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(TT;Ljava/lang/Class<TT;>;[Ljava/lang/Class<-TT;>;)LX/CUi<TT;>; */
    public static C3565CUi A00(Class cls, final Object obj, Class... clsArr) {
        return C3566CUj.A01(new C3566CUj(cls, clsArr), new CUY(obj) { // from class: X.CUv
            public final Object A00;

            {
                this.A00 = obj;
            }

            @Override // X.CUY
            public final Object A7X(CUL cul) {
                return this.A00;
            }
        });
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Component<");
        sbA0x.append(Arrays.toString(this.A04.toArray()));
        sbA0x.append(">{");
        sbA0x.append(this.A00);
        sbA0x.append(", type=");
        sbA0x.append(this.A01);
        sbA0x.append(", deps=");
        sbA0x.append(Arrays.toString(this.A03.toArray()));
        return BV7.A11(sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Set<Ljava/lang/Class<-TT;>;>;Ljava/util/Set<LX/CUm;>;IILX/CUY<TT;>;Ljava/util/Set<Ljava/lang/Class<*>;>;)V */
    public C3565CUi(CUY cuy, Set set, Set set2, Set set3, int i, int i2) {
        this.A04 = Collections.unmodifiableSet(set);
        this.A03 = Collections.unmodifiableSet(set2);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = cuy;
        this.A05 = Collections.unmodifiableSet(set3);
    }
}
