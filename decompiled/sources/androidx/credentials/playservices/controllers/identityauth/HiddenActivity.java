package androidx.credentials.playservices.controllers.identityauth;

import X.BV5;
import X.BV6;
import X.C7384Etj;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;

/* loaded from: classes5.dex */
public class HiddenActivity extends Activity {
    public ResultReceiver A00;
    public boolean A01;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws IntentSender.SendIntentException {
        String str;
        String str2;
        ResultReceiver resultReceiver;
        String str3;
        String str4;
        String strA0n;
        Bundle bundleA0N;
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra("TYPE");
        ResultReceiver resultReceiver2 = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.A00 = resultReceiver2;
        if (resultReceiver2 == null) {
            finish();
        }
        if (bundle != null) {
            this.A01 = bundle.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
        if (this.A01) {
            return;
        }
        if (stringExtra == null) {
            Log.w("HiddenActivity", "Activity handed an unsupported type");
        } else {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("EXTRA_FLOW_PENDING_INTENT");
            int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
            if (pendingIntent != null) {
                try {
                    this.A01 = true;
                    startIntentSenderForResult(pendingIntent.getIntentSender(), intExtra, null, 0, 0, 0, null);
                    return;
                } catch (IntentSender.SendIntentException e) {
                    str = "CREATE_UNKNOWN";
                    str2 = "GET_UNKNOWN";
                    switch (stringExtra.hashCode()) {
                        case -441061071:
                            if (stringExtra.equals("BEGIN_SIGN_IN")) {
                                resultReceiver = this.A00;
                                C7384Etj.A0X(resultReceiver);
                                str3 = "During begin sign in, one tap ui intent sender failure: ";
                                strA0n = BV5.A0n(str3, e);
                                break;
                            }
                            break;
                        case 15545322:
                            if (stringExtra.equals("CREATE_PUBLIC_KEY_CREDENTIAL")) {
                                resultReceiver = this.A00;
                                C7384Etj.A0X(resultReceiver);
                                str4 = "During public key credential, found IntentSender failure on public key creation: ";
                                strA0n = BV5.A0n(str4, e);
                                break;
                            }
                            break;
                        case 1246634622:
                            if (stringExtra.equals("CREATE_PASSWORD")) {
                                resultReceiver = this.A00;
                                C7384Etj.A0X(resultReceiver);
                                str4 = "During save password, found UI intent sender failure: ";
                                strA0n = BV5.A0n(str4, e);
                                break;
                            }
                            break;
                        case 1980564212:
                            if (stringExtra.equals("SIGN_IN_INTENT")) {
                                resultReceiver = this.A00;
                                C7384Etj.A0X(resultReceiver);
                                str3 = "During get sign-in intent, one tap ui intent sender failure: ";
                                strA0n = BV5.A0n(str3, e);
                                break;
                            }
                            break;
                    }
                    return;
                }
            }
            str = "CREATE_UNKNOWN";
            str2 = "GET_UNKNOWN";
            switch (stringExtra.hashCode()) {
                case -441061071:
                    if (stringExtra.equals("BEGIN_SIGN_IN")) {
                        resultReceiver = this.A00;
                        C7384Etj.A0X(resultReceiver);
                        strA0n = "internal error during the begin sign in operation";
                        bundleA0N = BV6.A0N();
                        bundleA0N.putBoolean("FAILURE_RESPONSE", true);
                        bundleA0N.putString("EXCEPTION_TYPE", str2);
                        break;
                    }
                    break;
                case 15545322:
                    if (stringExtra.equals("CREATE_PUBLIC_KEY_CREDENTIAL")) {
                        resultReceiver = this.A00;
                        C7384Etj.A0X(resultReceiver);
                        strA0n = "internal error during public key credential creation";
                        bundleA0N = BV6.A0N();
                        bundleA0N.putBoolean("FAILURE_RESPONSE", true);
                        bundleA0N.putString("EXCEPTION_TYPE", str);
                        break;
                    }
                    break;
                case 1246634622:
                    if (stringExtra.equals("CREATE_PASSWORD")) {
                        resultReceiver = this.A00;
                        C7384Etj.A0X(resultReceiver);
                        strA0n = "internal error during password creation";
                        bundleA0N = BV6.A0N();
                        bundleA0N.putBoolean("FAILURE_RESPONSE", true);
                        bundleA0N.putString("EXCEPTION_TYPE", str);
                        break;
                    }
                    break;
                case 1980564212:
                    if (stringExtra.equals("SIGN_IN_INTENT")) {
                        resultReceiver = this.A00;
                        C7384Etj.A0X(resultReceiver);
                        strA0n = "internal error during the sign-in intent operation";
                        bundleA0N = BV6.A0N();
                        bundleA0N.putBoolean("FAILURE_RESPONSE", true);
                        bundleA0N.putString("EXCEPTION_TYPE", str2);
                        break;
                    }
                    break;
            }
            return;
            bundleA0N.putString("EXCEPTION_MESSAGE", strA0n);
            resultReceiver.send(Integer.MAX_VALUE, bundleA0N);
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C7384Etj.A0Y(bundle, 0);
        bundle.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.A01);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ResultReceiver resultReceiver = this.A00;
        if (resultReceiver != null) {
            Bundle bundleA0N = BV6.A0N();
            bundleA0N.putBoolean("FAILURE_RESPONSE", false);
            bundleA0N.putInt("ACTIVITY_REQUEST_CODE", i);
            bundleA0N.putParcelable("RESULT_DATA", intent);
            resultReceiver.send(i2, bundleA0N);
        }
        this.A01 = false;
        finish();
    }
}
