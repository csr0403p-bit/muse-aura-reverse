package X;

import com.google.common.collect.ImmutableCollection;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

/* JADX WARN: Incorrect class signature: super class is equals to this class */
/* loaded from: classes5.dex */
public final class CPr<V> extends CPg {
    public List<C3482CPs<V>> A00;

    public CPr(ImmutableCollection<? extends ListenableFuture<? extends V>> futures, boolean allMustSucceed) {
        List<C3482CPs<V>> listA11;
        super(futures, allMustSucceed, true);
        if (futures.isEmpty()) {
            listA11 = Collections.EMPTY_LIST;
        } else {
            int size = futures.size();
            AbstractC3830CfJ.A00(size, "initialArraySize");
            listA11 = C60O.A11(size);
        }
        for (int i = 0; i < futures.size(); i++) {
            listA11.add(null);
        }
        this.A00 = listA11;
        A04();
    }

    @Override // X.CPg
    public final void A05(Integer reason) {
        super.A05(reason);
        this.A00 = null;
    }
}
