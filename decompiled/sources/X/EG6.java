package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class EG6 {
    public int A03;
    public int A04;
    public long A06;
    public Notification A07;
    public Notification A08;
    public PendingIntent A09;
    public Context A0A;
    public Bundle A0B;
    public EG8 A0C;
    public IconCompat A0D;
    public CharSequence A0E;
    public CharSequence A0F;
    public CharSequence A0G;
    public CharSequence A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;

    @Deprecated
    public ArrayList<String> A0O;
    public boolean A0Q;
    public boolean A0T;
    public boolean A0U;
    public ArrayList<EGD> A0M = C3cG.A0h();
    public ArrayList<EFx> A0P = C3cG.A0h();
    public ArrayList<EGD> A0N = C3cG.A0h();
    public boolean A0S = true;
    public boolean A0R = false;
    public int A00 = 0;
    public int A05 = 0;
    public int A02 = 0;
    public int A01 = 0;

    public static CharSequence A00(CharSequence charSequence) {
        return (charSequence == null || charSequence.length() <= 5120) ? charSequence : charSequence.subSequence(0, 5120);
    }

    public final Notification A01() {
        Bundle bundle;
        EG5 eg5 = new EG5(this);
        EG8 eg8 = eg5.A03.A0C;
        if (eg8 != null) {
            eg8.A05(eg5);
        }
        Notification notificationBuild = eg5.A01.build();
        if (eg8 != null && (bundle = notificationBuild.extras) != null) {
            eg8.A03(bundle);
        }
        return notificationBuild;
    }

    public final void A02() {
        this.A07.flags |= 16;
    }

    public final void A03(int i) {
        this.A07.icon = i;
    }

    public final void A04(PendingIntent pendingIntent, CharSequence charSequence, int i) {
        this.A0M.add(new EGD(pendingIntent, charSequence, i));
    }

    public final void A05(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            iconCompat = new IconCompat(1);
            iconCompat.A06 = bitmap;
        }
        this.A0D = iconCompat;
    }

    public final void A06(EG8 eg8) {
        if (this.A0C != eg8) {
            this.A0C = eg8;
            if (eg8.A00 != this) {
                eg8.A00 = this;
                A06(eg8);
            }
        }
    }

    public EG6(Context context, String str) {
        Notification notification = new Notification();
        this.A07 = notification;
        this.A0A = context;
        this.A0J = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.A04 = 0;
        this.A0O = C3cG.A0h();
    }

    public final void A07(CharSequence charSequence) {
        this.A0F = A00(charSequence);
    }

    public final void A08(CharSequence charSequence) {
        this.A0G = A00(charSequence);
    }
}
