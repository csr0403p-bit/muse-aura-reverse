package X;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.766, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class AnonymousClass766 {
    public static final Intent A00(C77E c77e, C76Y c76y) {
        if (!(c76y instanceof AnonymousClass762)) {
            throw C3cG.A0Q(AnonymousClass007.A0a("Action type not defined in app widget package: ", c76y));
        }
        Intent intent = ((AnonymousClass762) c76y).A00;
        Map mapUnmodifiableMap = Collections.unmodifiableMap(((AnonymousClass765) c77e).A00);
        ArrayList arrayListA11 = C60O.A11(mapUnmodifiableMap.size());
        Iterator itA0n = AnonymousClass002.A0n(mapUnmodifiableMap);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            AnonymousClass767 anonymousClass767 = (AnonymousClass767) entryA0l.getKey();
            AnonymousClass002.A1J(anonymousClass767.A00, entryA0l.getValue(), arrayListA11);
        }
        intent.putExtras(AbstractC0849A5g.A01(C60R.A1b(arrayListA11)));
        return intent;
    }
}
