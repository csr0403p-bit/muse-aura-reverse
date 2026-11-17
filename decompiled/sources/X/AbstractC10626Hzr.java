package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Hzr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10626Hzr {
    public static final List<Hzd> A00(List<C10629Hzy> list) {
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        for (C10629Hzy c10629Hzy : list) {
            Hzd hzd = new Hzd(c10629Hzy.A01);
            hzd.A08("payload_identifier", c10629Hzy.A00);
            arrayListA0i.add(hzd);
        }
        return arrayListA0i;
    }
}
