package X;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.EyJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7502EyJ {
    public ArrayList<C7390EuO> A00;
    public final PendingIntent A01;
    public final Bundle A02;
    public final IconCompat A03;
    public final CharSequence A04;

    public C7502EyJ(PendingIntent pendingIntent, CharSequence charSequence, int i) {
        IconCompat iconCompatA00 = IconCompat.A00(null, "", i);
        Bundle bundleA0N = BV6.A0N();
        this.A03 = iconCompatA00;
        this.A04 = EG6.A00(charSequence);
        this.A01 = pendingIntent;
        this.A02 = bundleA0N;
        this.A00 = null;
    }

    public final EGD A00() {
        ArrayList arrayListA0h = C3cG.A0h();
        ArrayList arrayListA0h2 = C3cG.A0h();
        ArrayList<C7390EuO> arrayList = this.A00;
        if (arrayList != null) {
            Iterator<C7390EuO> it = arrayList.iterator();
            while (it.hasNext()) {
                BV6.A1S(arrayListA0h2, it);
            }
        }
        C7390EuO[] c7390EuOArr = arrayListA0h.isEmpty() ? null : (C7390EuO[]) arrayListA0h.toArray(new C7390EuO[arrayListA0h.size()]);
        return new EGD(this.A01, this.A02, this.A03, this.A04, arrayListA0h2.isEmpty() ? null : (C7390EuO[]) arrayListA0h2.toArray(new C7390EuO[arrayListA0h2.size()]), c7390EuOArr);
    }

    public C7502EyJ(PendingIntent pendingIntent, IconCompat iconCompat, CharSequence charSequence) {
        Bundle bundleA0N = BV6.A0N();
        this.A03 = iconCompat;
        this.A04 = EG6.A00(charSequence);
        this.A01 = pendingIntent;
        this.A02 = bundleA0N;
        this.A00 = null;
    }
}
