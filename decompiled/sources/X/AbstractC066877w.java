package X;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.77w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC066877w {
    /* JADX WARN: Incorrect return type in method signature: (Landroid/content/Intent;Ljava/util/Set<Ljava/lang/String;>;LX/7mY;Z)Landroid/content/Intent; */
    public static void A00(Intent intent, C7mY c7mY, boolean z) {
        Bundle extras;
        String str;
        if (intent.getExtras() == null || (extras = intent.getExtras()) == null) {
            return;
        }
        Set<String> setKeySet = extras.keySet();
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<String> it = setKeySet.iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            Object obj = extras.get(strA0j);
            if (obj != null && C7mF.class.getClassLoader().equals(obj.getClass().getClassLoader())) {
                arrayListA0h.add(strA0j);
            }
        }
        Iterator it2 = arrayListA0h.iterator();
        while (it2.hasNext()) {
            String strA0j2 = AnonymousClass005.A0j(it2);
            if (z) {
                str = "Found an internal class in a different-key intent but not removing: ";
            } else {
                intent.removeExtra(strA0j2);
                str = "Removed an internal class in a different-key intent: ";
            }
            c7mY.report("ExternalIntentSanitization", FGI.A0M(str, strA0j2), null);
        }
    }
}
