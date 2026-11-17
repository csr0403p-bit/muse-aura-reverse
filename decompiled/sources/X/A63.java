package X;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public final class A63 implements A6F {
    public final Set<String> A00 = C3cG.A0k();

    @Override // X.A6F
    public final Bundle Ac4() {
        HxE[] hxEArrA1b;
        C9jH c9jH = C9jH.A00;
        if (c9jH.isEmpty()) {
            hxEArrA1b = new HxE[0];
        } else {
            ArrayList arrayListA1A = C8j3.A1A(c9jH);
            Iterator itA1B = C8j3.A1B(c9jH);
            while (itA1B.hasNext()) {
                C8j5.A0q(arrayListA1A, itA1B);
            }
            hxEArrA1b = C8j3.A1b(arrayListA1A);
        }
        Bundle bundleA00 = AbstractC0849A5g.A00(hxEArrA1b);
        List listA0X = AbstractC0878AGe.A0X(this.A00);
        C7384Etj.A0Y(listA0X, 2);
        bundleA00.putStringArrayList("classes_to_restore", listA0X instanceof ArrayList ? (ArrayList) listA0X : new ArrayList<>(listA0X));
        return bundleA00;
    }

    public A63(SavedStateRegistry savedStateRegistry) {
        savedStateRegistry.A03(this, "androidx.savedstate.Restarter");
    }
}
