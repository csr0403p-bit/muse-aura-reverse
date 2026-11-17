package X;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class A1R<T> implements C9hr<SparseArray<T>> {
    public final C9hr<A1S<T>> A00;
    public final C9iZ A01;

    public A1R(C9hr<T> c9hr) {
        C7384Etj.A0Y(c9hr, 0);
        C9iZ c9iZ = A1S.A03;
        A1Q a1q = new A1Q(c9hr);
        this.A00 = a1q;
        this.A01 = a1q.A00;
    }

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        A1S a1s = (A1S) interfaceC07829iw.A8b(this.A00);
        List<Integer> list = a1s.A00;
        int size = list.size();
        List<T> list2 = a1s.A01;
        if (size != list2.size()) {
            throw C60O.A0i("Failed requirement.");
        }
        SparseArray sparseArray = new SparseArray(list.size());
        int size2 = list.size();
        for (int i = 0; i < size2; i++) {
            sparseArray.append(C8j4.A0H(list, i), list2.get(i));
        }
        return sparseArray;
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return this.A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        SparseArray sparseArray = (SparseArray) obj;
        AnonymousClass003.A0u(interfaceC07789is, sparseArray);
        int size = sparseArray.size();
        ArrayList arrayListA11 = C60O.A11(size);
        for (int i = 0; i < size; i++) {
            C60Q.A1P(arrayListA11, sparseArray.keyAt(i));
        }
        int size2 = sparseArray.size();
        ArrayList arrayListA112 = C60O.A11(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            arrayListA112.add(sparseArray.valueAt(i2));
        }
        interfaceC07789is.AAR(new A1S(arrayListA11, arrayListA112), this.A00);
    }
}
