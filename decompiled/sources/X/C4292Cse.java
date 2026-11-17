package X;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.ResultReceiver;
import java.util.Set;

/* renamed from: X.Cse, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C4292Cse {
    public static final C4299Csn A01 = new C4299Csn();
    public static final Set<Integer> A02 = BFI.A0H(new Integer[]{7, 20});
    public final Context A00;

    public final void A02(Intent intent, ResultReceiver resultReceiver, String str) {
        C7384Etj.A0Y(resultReceiver, 0);
        intent.putExtra("TYPE", str);
        intent.putExtra("ACTIVITY_REQUEST_CODE", 1);
        Parcel parcelObtain = Parcel.obtain();
        C7384Etj.A0U(parcelObtain);
        resultReceiver.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        intent.putExtra("RESULT_RECEIVER", resultReceiver2);
        intent.setFlags(65536);
    }

    public C4292Cse(Context context) {
        this.A00 = context;
    }
}
