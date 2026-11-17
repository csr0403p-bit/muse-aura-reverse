package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EZh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6773EZh {
    public static final List<String> A00(List<? extends EnumC6905Ec1> list) {
        ArrayList arrayListA0h = C3cG.A0h();
        for (EnumC6905Ec1 enumC6905Ec1 : list) {
            if (enumC6905Ec1 != EnumC6905Ec1.HTTP_1_0) {
                arrayListA0h.add(enumC6905Ec1);
            }
        }
        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0h);
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().toString());
        }
        return arrayListA0i;
    }
}
