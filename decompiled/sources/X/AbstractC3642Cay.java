package X;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.aura.R;
import com.facebook.aura.auth.credentialmanager.AuraCredentialManagerFetchHelper;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.Locale;

/* renamed from: X.Cay, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3642Cay {
    public static Locale A00;
    public static final DQZ A01 = new DQZ(0);

    public static String A03(Context context, String str) {
        Resources resourcesForApplication;
        DQZ dqz = A01;
        synchronized (dqz) {
            Locale localeA02 = AbstractC7547F2b.A00(context.getResources().getConfiguration()).A02(0);
            if (!localeA02.equals(A00)) {
                dqz.clear();
                A00 = localeA02;
            }
            String str2 = (String) dqz.get(str);
            if (str2 == null) {
                boolean z = GooglePlayServicesUtil.A00;
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(AuraCredentialManagerFetchHelper.PROVIDER_PACKAGE);
                } catch (PackageManager.NameNotFoundException unused) {
                    resourcesForApplication = null;
                }
                str2 = null;
                if (resourcesForApplication != null) {
                    int identifier = resourcesForApplication.getIdentifier(str, "string", AuraCredentialManagerFetchHelper.PROVIDER_PACKAGE);
                    if (identifier == 0) {
                        BV4.A1J("Missing resource: ", str, "GoogleApiAvailability");
                    } else {
                        String string = resourcesForApplication.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            dqz.put(str, string);
                            return string;
                        }
                        BV4.A1J("Got empty resource: ", str, "GoogleApiAvailability");
                    }
                }
            }
            return str2;
        }
    }

    public static String A00(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = CUF.A00(context).A00;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = ((PackageItemInfo) context.getApplicationInfo()).name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String A01(Context context, int i) {
        int i2;
        String str;
        Resources resources = context.getResources();
        String strA00 = A00(context);
        if (i == 1) {
            i2 = R.string._name_removed__res_0x7f1206f6;
        } else if (i != 2) {
            if (i != 3) {
                if (i == 5) {
                    str = "common_google_play_services_invalid_account_text";
                } else if (i == 7) {
                    str = "common_google_play_services_network_error_text";
                } else if (i == 9) {
                    i2 = R.string._name_removed__res_0x7f1206fb;
                } else if (i != 20) {
                    switch (i) {
                        case 16:
                            str = "common_google_play_services_api_unavailable_text";
                            break;
                        case 17:
                            str = "common_google_play_services_sign_in_failed_text";
                            break;
                        case 18:
                            i2 = R.string._name_removed__res_0x7f1206ff;
                            break;
                        default:
                            i2 = R.string._name_removed__res_0x7f1206fa;
                            break;
                    }
                } else {
                    str = "common_google_play_services_restricted_profile_text";
                }
                Resources resources2 = context.getResources();
                String strA03 = A03(context, str);
                if (strA03 == null) {
                    strA03 = resources2.getString(R.string._name_removed__res_0x7f1206fa);
                }
                return String.format(resources2.getConfiguration().locale, strA03, strA00);
            }
            i2 = R.string._name_removed__res_0x7f1206f3;
        } else {
            if (AbstractC3629CaM.A00(context)) {
                return resources.getString(R.string._name_removed__res_0x7f120700);
            }
            i2 = R.string._name_removed__res_0x7f1206fd;
        }
        return resources.getString(i2, strA00);
    }

    public static String A02(Context context, int i) {
        int i2;
        String str;
        String strA0H;
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                i2 = R.string._name_removed__res_0x7f1206f7;
                return resources.getString(i2);
            case 2:
                i2 = R.string._name_removed__res_0x7f1206fe;
                return resources.getString(i2);
            case 3:
                i2 = R.string._name_removed__res_0x7f1206f4;
                return resources.getString(i2);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                str = "common_google_play_services_invalid_account_title";
                return A03(context, str);
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                str = "common_google_play_services_network_error_title";
                return A03(context, str);
            case 8:
                strA0H = "Internal error occurred. Please see logs for detailed information";
                Log.e("GoogleApiAvailability", strA0H);
                return null;
            case 9:
                strA0H = "Google Play services is invalid. Cannot recover.";
                Log.e("GoogleApiAvailability", strA0H);
                return null;
            case 10:
                strA0H = "Developer error occurred. Please see logs for detailed information";
                Log.e("GoogleApiAvailability", strA0H);
                return null;
            case 11:
                strA0H = "The application is not licensed to the user.";
                Log.e("GoogleApiAvailability", strA0H);
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                strA0H = FGI.A0H("Unexpected error code ", i);
                Log.e("GoogleApiAvailability", strA0H);
                return null;
            case 16:
                strA0H = "One of the API components you attempted to connect to is not available.";
                Log.e("GoogleApiAvailability", strA0H);
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                str = "common_google_play_services_sign_in_failed_title";
                return A03(context, str);
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                str = "common_google_play_services_restricted_profile_title";
                return A03(context, str);
        }
    }
}
