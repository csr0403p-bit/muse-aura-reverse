package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.6tp, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6tp {
    public static final C6od A00 = new C6tr(new C6od[0]);

    public static C6od A00() {
        ArrayList arrayListA11 = C60O.A11(4);
        List listAsList = Arrays.asList("https");
        if (listAsList.isEmpty()) {
            throw C60O.A0i("Cannot set 0 schemes");
        }
        arrayListA11.add(new C6to(listAsList));
        return C6tq.A00(arrayListA11);
    }
}
