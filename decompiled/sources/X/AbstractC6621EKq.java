package X;

import androidx.room.util.DBUtil__DBUtil_androidKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.EKq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6621EKq {
    public static final List<String> A00(InterfaceC6658EMq interfaceC6658EMq, String str) {
        boolean zA1a = AnonymousClass002.A1a(interfaceC6658EMq, str);
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        EIN ein = ((ELL) interfaceC6658EMq).A01;
        ArrayList arrayListA0R = AbstractC0878AGe.A0R((Collection) DBUtil__DBUtil_androidKt.A01(ein, new C7596F5j(str, 0), zA1a, false));
        while (!arrayListA0R.isEmpty()) {
            String str2 = (String) AbstractC0882AGj.A0p(arrayListA0R);
            linkedHashSetA0k.add(str2);
            C7384Etj.A0Y(str2, 0);
            arrayListA0R.addAll((Collection) DBUtil__DBUtil_androidKt.A01(ein, new C7596F5j(str2, 0), zA1a, false));
        }
        return AbstractC0878AGe.A0X(linkedHashSetA0k);
    }
}
