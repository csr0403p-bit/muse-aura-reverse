package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.facebook.phoneid.PhoneIdResponseReceiver;

/* loaded from: classes5.dex */
public final class EHi {
    public final Context A00;
    public final EHm A01;
    public final C6573EHp A02;
    public final EHg A03;

    public EHi(Context context, C6575EHt c6575EHt, C6573EHp c6573EHp, EHg eHg) {
        C7381Etf c7381Etf = EHj.A01;
        this.A00 = context;
        this.A03 = eHg;
        this.A02 = c6573EHp;
        this.A01 = new EHm(c6575EHt, c6573EHp, eHg);
    }

    public static void A00(EHi eHi, String str) {
        Intent intent = new Intent();
        intent.setAction("com.facebook.GET_PHONE_ID");
        intent.setPackage(str);
        int i = Build.VERSION.SDK_INT >= 30 ? 201326592 : 134217728;
        Context context = eHi.A00;
        PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent(), i);
        Bundle bundleA0N = BV6.A0N();
        bundleA0N.putParcelable("auth", activity);
        context.sendOrderedBroadcast(intent, null, new PhoneIdResponseReceiver(eHi.A01, new EHl(eHi.A03.A00(), str, "broadcasts")), null, 1, null, bundleA0N);
    }
}
