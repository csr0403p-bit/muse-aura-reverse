package X;

import android.content.Intent;
import java.util.Iterator;

/* renamed from: X.7o4, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7o4 {
    public final void A00(Intent intent, String str) {
        Iterator it = ((C7o2) this).A00.iterator();
        while (it.hasNext()) {
            ((C7o4) it.next()).A00(intent, str);
        }
    }

    public final void A01(Intent intent, String str, String str2) {
        Iterator it = ((C7o2) this).A00.iterator();
        while (it.hasNext()) {
            ((C7o4) it.next()).A01(intent, str, str2);
        }
    }
}
