package androidx.core.app;

import X.C3cG;
import X.EG8;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes5.dex */
public final class NotificationCompat$InboxStyle extends EG8 {
    public ArrayList<CharSequence> A00 = C3cG.A0h();

    @Override // X.EG8
    public final void A04(Bundle bundle) {
        super.A04(bundle);
        ArrayList<CharSequence> arrayList = this.A00;
        arrayList.clear();
        if (bundle.containsKey("android.textLines")) {
            Collections.addAll(arrayList, bundle.getCharSequenceArray("android.textLines"));
        }
    }
}
