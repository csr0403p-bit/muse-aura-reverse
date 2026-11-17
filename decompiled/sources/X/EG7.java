package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class EG7 {
    public int A01;
    public int A03;
    public int A07;
    public PendingIntent A08;
    public Bitmap A09;
    public String A0A;
    public String A0B;
    public ArrayList<EGD> A0C = C3cG.A0h();
    public int A05 = 1;
    public ArrayList<Notification> A0D = C3cG.A0h();
    public int A02 = 8388613;
    public int A00 = -1;
    public int A04 = 0;
    public int A06 = 80;

    public final /* bridge */ /* synthetic */ Object clone() {
        EG7 eg7 = new EG7();
        eg7.A0C = BV4.A0t(this.A0C);
        eg7.A05 = this.A05;
        eg7.A08 = this.A08;
        eg7.A0D = BV4.A0t(this.A0D);
        eg7.A09 = this.A09;
        eg7.A01 = this.A01;
        eg7.A02 = this.A02;
        eg7.A00 = this.A00;
        eg7.A04 = this.A04;
        eg7.A03 = this.A03;
        eg7.A06 = this.A06;
        eg7.A07 = this.A07;
        eg7.A0B = this.A0B;
        eg7.A0A = this.A0A;
        return eg7;
    }

    public final void A00(EG6 eg6) {
        int i;
        Bundle bundleA0N = BV6.A0N();
        ArrayList<EGD> arrayList = this.A0C;
        if (!arrayList.isEmpty()) {
            ArrayList<? extends Parcelable> arrayListA19 = C8j3.A19(arrayList);
            Iterator<EGD> it = arrayList.iterator();
            while (it.hasNext()) {
                EGD next = it.next();
                IconCompat iconCompatA00 = next.A02;
                if (iconCompatA00 == null && (i = next.A00) != 0) {
                    iconCompatA00 = IconCompat.A00(null, "", i);
                    next.A02 = iconCompatA00;
                }
                Notification.Action.Builder builder = new Notification.Action.Builder(iconCompatA00 != null ? EFo.A00(null, iconCompatA00) : null, next.A03, next.A01);
                Bundle bundle = new Bundle(next.A04);
                bundle.putBoolean("android.support.allowGeneratedReplies", true);
                builder.setAllowGeneratedReplies(true);
                if (Build.VERSION.SDK_INT >= 31) {
                    EGK.A00(builder);
                }
                builder.addExtras(bundle);
                C7390EuO[] c7390EuOArr = next.A05;
                if (c7390EuOArr != null) {
                    for (RemoteInput remoteInput : C7390EuO.A00(c7390EuOArr)) {
                        builder.addRemoteInput(remoteInput);
                    }
                }
                arrayListA19.add(builder.build());
            }
            bundleA0N.putParcelableArrayList("actions", arrayListA19);
        }
        int i2 = this.A05;
        if (i2 != 1) {
            bundleA0N.putInt("flags", i2);
        }
        PendingIntent pendingIntent = this.A08;
        if (pendingIntent != null) {
            bundleA0N.putParcelable("displayIntent", pendingIntent);
        }
        ArrayList<Notification> arrayList2 = this.A0D;
        if (!arrayList2.isEmpty()) {
            bundleA0N.putParcelableArray("pages", (Parcelable[]) arrayList2.toArray(new Notification[arrayList2.size()]));
        }
        Bitmap bitmap = this.A09;
        if (bitmap != null) {
            bundleA0N.putParcelable("background", bitmap);
        }
        int i3 = this.A01;
        if (i3 != 0) {
            bundleA0N.putInt("contentIcon", i3);
        }
        int i4 = this.A02;
        if (i4 != 8388613) {
            bundleA0N.putInt("contentIconGravity", i4);
        }
        int i5 = this.A00;
        if (i5 != -1) {
            bundleA0N.putInt("contentActionIndex", i5);
        }
        int i6 = this.A04;
        if (i6 != 0) {
            bundleA0N.putInt("customSizePreset", i6);
        }
        int i7 = this.A03;
        if (i7 != 0) {
            bundleA0N.putInt("customContentHeight", i7);
        }
        int i8 = this.A06;
        if (i8 != 80) {
            bundleA0N.putInt("gravity", i8);
        }
        int i9 = this.A07;
        if (i9 != 0) {
            bundleA0N.putInt("hintScreenTimeout", i9);
        }
        String str = this.A0B;
        if (str != null) {
            bundleA0N.putString("dismissalId", str);
        }
        String str2 = this.A0A;
        if (str2 != null) {
            bundleA0N.putString("bridgeTag", str2);
        }
        Bundle bundleA0N2 = eg6.A0B;
        if (bundleA0N2 == null) {
            bundleA0N2 = BV6.A0N();
            eg6.A0B = bundleA0N2;
        }
        bundleA0N2.putBundle("android.wearable.EXTENSIONS", bundleA0N);
    }
}
