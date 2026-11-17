package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;

/* renamed from: X.CjS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class HandlerC3999CjS extends HandlerC4000CjT {
    public final Context A00;
    public final /* synthetic */ C4001CjU A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC3999CjS(Context context, C4001CjU c4001CjU) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.A01 = c4001CjU;
        this.A00 = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Resources.NotFoundException {
        int i = message.what;
        if (i != 1) {
            Log.w("GoogleApiAvailability", FGI.A0H("Don't know how to handle this message: ", i));
            return;
        }
        C4001CjU c4001CjU = this.A01;
        Context context = this.A00;
        int iA01 = c4001CjU.A01(context, 12451000);
        boolean z = GooglePlayServicesUtil.A00;
        if (iA01 == 1 || iA01 == 2 || iA01 == 3 || iA01 == 9) {
            Intent intentA02 = c4001CjU.A02(context, "n", iA01);
            C4001CjU.A00(intentA02 == null ? null : PendingIntent.getActivity(context, 0, intentA02, 201326592), context, c4001CjU, iA01);
        }
    }
}
