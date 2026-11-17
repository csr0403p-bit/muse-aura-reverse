package androidx.core.app;

import X.EG8;
import android.os.Bundle;

/* loaded from: classes5.dex */
public final class NotificationCompat$BigTextStyle extends EG8 {
    public CharSequence A00;

    @Override // X.EG8
    public final void A04(Bundle bundle) {
        super.A04(bundle);
        this.A00 = bundle.getCharSequence("android.bigText");
    }
}
