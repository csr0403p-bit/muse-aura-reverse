package com.google.android.gms.common.api;

import X.AbstractC3642Cay;
import X.AnonymousClass001;
import X.BV4;
import X.BV5;
import X.C4001CjU;
import X.C4005Cja;
import X.C4163CoN;
import X.DialogFragmentC4002CjV;
import X.FGI;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import com.facebook.aura.model.GenericListPresentationKt;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* loaded from: classes5.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public int A00 = 0;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.A00 = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException, IntentSender.SendIntentException {
        String str;
        int i;
        super.onCreate(bundle);
        if (bundle != null) {
            this.A00 = bundle.getInt("resolution");
        }
        if (this.A00 != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                str = "Activity started without extras";
            } else {
                PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
                Object obj = extras.get("error_code");
                if (pendingIntent != null) {
                    try {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                        this.A00 = 1;
                        return;
                    } catch (ActivityNotFoundException e) {
                        if (extras.getBoolean("notify_manager", true)) {
                            C4163CoN c4163CoNA01 = C4163CoN.A01(this);
                            ConnectionResult connectionResult = new ConnectionResult(null, null, 1, 22);
                            int intExtra = getIntent().getIntExtra("failing_client_id", -1);
                            if (!c4163CoNA01.A07(connectionResult, intExtra)) {
                                Handler handler = c4163CoNA01.A05;
                                handler.sendMessage(handler.obtainMessage(5, intExtra, 0, connectionResult));
                            }
                        } else {
                            String strA0U = FGI.A0U("Activity not found while launching ", pendingIntent.toString(), ".");
                            if (Build.FINGERPRINT.contains(GenericListPresentationKt.GENERIC_LIST_ROW_TYPE_GENERIC)) {
                                strA0U = strA0U.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                            }
                            Log.e("GoogleApiActivity", strA0U, e);
                        }
                        this.A00 = 1;
                    } catch (IntentSender.SendIntentException e2) {
                        Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e2);
                    }
                } else {
                    if (obj != null) {
                        int iA0F = AnonymousClass001.A0F(obj);
                        C4005Cja c4005Cja = new C4005Cja(this, C4001CjU.A00.A02(this, "d", iA0F));
                        if (iA0F != 0) {
                            TypedValue typedValue = new TypedValue();
                            getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
                            AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(this, 5) : new AlertDialog.Builder(this);
                            builder.setMessage(AbstractC3642Cay.A01(this, iA0F));
                            builder.setOnCancelListener(this);
                            Resources resources = getResources();
                            if (iA0F == 1) {
                                i = com.facebook.aura.R.string._name_removed__res_0x7f1206f5;
                            } else if (iA0F != 2) {
                                i = com.facebook.aura.R.string._name_removed__res_0x7f1206f2;
                                if (iA0F != 3) {
                                    i = R.string.ok;
                                }
                            } else {
                                i = com.facebook.aura.R.string._name_removed__res_0x7f1206fc;
                            }
                            String string = resources.getString(i);
                            if (string != null) {
                                builder.setPositiveButton(string, c4005Cja);
                            }
                            String strA02 = AbstractC3642Cay.A02(this, iA0F);
                            if (strA02 != null) {
                                builder.setTitle(strA02);
                            }
                            Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", BV5.A1Y(iA0F)), BV4.A0P());
                            AlertDialog alertDialogCreate = builder.create();
                            if (alertDialogCreate != null) {
                                FragmentManager fragmentManager = getFragmentManager();
                                DialogFragmentC4002CjV dialogFragmentC4002CjV = new DialogFragmentC4002CjV();
                                alertDialogCreate.setOnCancelListener(null);
                                alertDialogCreate.setOnDismissListener(null);
                                dialogFragmentC4002CjV.A00 = alertDialogCreate;
                                dialogFragmentC4002CjV.A01 = this;
                                dialogFragmentC4002CjV.show(fragmentManager, "GooglePlayServicesErrorDialog");
                            }
                        }
                        this.A00 = 1;
                        return;
                    }
                    str = "Activity started without resolution";
                }
            }
            Log.e("GoogleApiActivity", str);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.A00);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        Handler handler;
        Message messageObtainMessage;
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.A00 = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                C4163CoN c4163CoNA01 = C4163CoN.A01(this);
                if (i2 == -1) {
                    handler = c4163CoNA01.A05;
                    messageObtainMessage = handler.obtainMessage(3);
                } else if (i2 == 0) {
                    ConnectionResult connectionResult = new ConnectionResult(null, null, 1, 13);
                    int intExtra = getIntent().getIntExtra("failing_client_id", -1);
                    if (!c4163CoNA01.A07(connectionResult, intExtra)) {
                        handler = c4163CoNA01.A05;
                        messageObtainMessage = handler.obtainMessage(5, intExtra, 0, connectionResult);
                    }
                }
                handler.sendMessage(messageObtainMessage);
            }
        } else if (i == 2) {
            this.A00 = 0;
            setResult(i2, intent);
        }
        finish();
    }
}
