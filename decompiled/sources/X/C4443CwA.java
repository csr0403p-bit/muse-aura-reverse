package X;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.ResultReceiver;
import java.util.concurrent.Executor;

/* renamed from: X.CwA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4443CwA {
    public AbstractC4099CmT A00;
    public InterfaceC4452CwU A01;
    public final Context A02;
    public final Executor A03;

    public C4443CwA(Context context, Executor executor) {
        C7384Etj.A0Y(executor, 1);
        this.A02 = context;
        this.A03 = executor;
        C4276Cs4 c4276Cs4 = C4276Cs4.A02;
        this.A00 = new C4179Cop(context, C4278Cs8.A00, AbstractC4267Crq.A00, c4276Cs4);
        this.A01 = new C4446CwI(context);
    }

    public static final Intent A00(Intent intent, ResultReceiver resultReceiver, String str, String str2) {
        Intent intentA03 = C60P.A03("com.google.android.wearable.intent.action.REMOTE_INTENT");
        if (intent != null) {
            intentA03.putExtra("com.google.android.wearable.intent.extra.INTENT", intent);
        }
        if (resultReceiver != null) {
            Parcel parcelObtain = Parcel.obtain();
            C7384Etj.A0U(parcelObtain);
            resultReceiver.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
            C7384Etj.A0S(resultReceiver2);
            intentA03.putExtra("com.google.android.wearable.intent.extra.RESULT_RECEIVER", resultReceiver2);
        }
        if (str != null) {
            intentA03.putExtra("com.google.android.wearable.intent.extra.NODE_ID", str);
        }
        if (str2 != null) {
            intentA03.setPackage(str2);
        }
        return intentA03;
    }
}
