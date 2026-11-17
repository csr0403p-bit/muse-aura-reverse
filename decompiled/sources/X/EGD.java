package X;

import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes5.dex */
public final class EGD {

    @Deprecated
    public int A00;
    public PendingIntent A01;
    public IconCompat A02;
    public CharSequence A03;
    public final Bundle A04;
    public final C7390EuO[] A05;
    public final C7390EuO[] A06;

    public EGD(PendingIntent pendingIntent, CharSequence charSequence, int i) {
        this(pendingIntent, BV6.A0N(), i != 0 ? IconCompat.A00(null, "", i) : null, charSequence, null, null);
    }

    public EGD(PendingIntent pendingIntent, Bundle bundle, IconCompat iconCompat, CharSequence charSequence, C7390EuO[] c7390EuOArr, C7390EuO[] c7390EuOArr2) {
        this.A02 = iconCompat;
        if (iconCompat != null) {
            int i = iconCompat.A02;
            if ((i == -1 ? ((Icon) iconCompat.A06).getType() : i) == 2) {
                this.A00 = iconCompat.A02();
            }
        }
        this.A03 = EG6.A00(charSequence);
        this.A01 = pendingIntent;
        this.A04 = bundle;
        this.A05 = c7390EuOArr;
        this.A06 = c7390EuOArr2;
    }
}
