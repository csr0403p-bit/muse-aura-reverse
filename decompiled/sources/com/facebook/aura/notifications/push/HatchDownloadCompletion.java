package com.facebook.aura.notifications.push;

import X.AnonymousClass005;
import X.C3cI;
import X.C60N;
import X.C7380Etd;
import X.C7384Etj;
import X.C7m8;
import X.C7mU;
import X.CFK;
import X.EG6;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.AndroidRuntimeException;
import android.view.View;
import com.facebook.aura.R;
import com.facebook.aura.notifications.suppression.HatchNotificationSuppression;
import com.facebook.aura.toast.api.ToastApi;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import com.facebook.aura.vds.compose.toast.AuraToastOption;
import com.facebook.aura.vds.toast.AuraToast;

/* loaded from: classes2.dex */
public final class HatchDownloadCompletion {
    public static final HatchDownloadCompletion INSTANCE = new HatchDownloadCompletion();
    public static final String TAG = "HatchDownloadCompletion";

    private final Intent createOpenFileIntent(Uri uri, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(uri, str);
        intent.addFlags(1);
        intent.addFlags(268435456);
        intent.addFlags(524288);
        return intent;
    }

    private final Intent createViewDownloadsIntent(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
        intent.addFlags(268435456);
        return resolvedOrNull(intent, context);
    }

    private final void showOpenSnackbar(final Context context, final Uri uri, final String str, String str2) {
        ToastApi.INSTANCE.showToast(new AuraToast.ToastArgs(str2, null, AuraToast.Duration.LONG, null, new AuraToastOption.Button(context.getString(R.string._name_removed__res_0x7f1209e5), null, false, true), new View.OnClickListener() { // from class: com.facebook.aura.notifications.push.HatchDownloadCompletion.showOpenSnackbar.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (HatchDownloadCompletion.INSTANCE.openDownloadedFile(context, uri, str)) {
                    return;
                }
                ToastApi.INSTANCE.showToast(R.string._name_removed__res_0x7f1209e8);
            }
        }, true, null, AuraThemeMode.DEFAULT, null, null, false, false, null, null, null, AuraIconSize.MEDIUM, null));
    }

    public final boolean openDownloadedFile(Context context, Uri uri, String str) {
        Intent intentCreateViewDownloadsIntent;
        String str2;
        boolean zA1Z = AnonymousClass005.A1Z(context, uri, str);
        Intent intentCreateOpenFileIntent = createOpenFileIntent(uri, str);
        if (intentCreateOpenFileIntent.resolveActivity(context.getPackageManager()) != null) {
            intentCreateViewDownloadsIntent = Intent.createChooser(intentCreateOpenFileIntent, null);
            intentCreateViewDownloadsIntent.addFlags(268435456);
        } else {
            intentCreateViewDownloadsIntent = createViewDownloadsIntent(context);
            if (intentCreateViewDownloadsIntent == null) {
                return false;
            }
        }
        try {
            C7mU.A00().A03().A05(context, intentCreateViewDownloadsIntent);
            return zA1Z;
        } catch (ActivityNotFoundException unused) {
            CFK.A06(TAG, "No activity available to open downloaded file");
            return false;
        } catch (AndroidRuntimeException e) {
            e = e;
            str2 = "Activity start canceled for the downloaded file";
            CFK.A0A(TAG, str2, e);
            return false;
        } catch (NullPointerException e2) {
            e = e2;
            str2 = "Package manager failed to resolve a viewer for the downloaded file";
            CFK.A0A(TAG, str2, e);
            return false;
        } catch (SecurityException e3) {
            e = e3;
            str2 = "Cannot grant read access to the downloaded file";
            CFK.A0A(TAG, str2, e);
            return false;
        }
    }

    private final Intent createNotificationTapIntent(Context context, Uri uri, String str) {
        Intent intentResolvedOrNull = resolvedOrNull(createOpenFileIntent(uri, str), context);
        return intentResolvedOrNull == null ? createViewDownloadsIntent(context) : intentResolvedOrNull;
    }

    private final void postOpenNotification(Context context, Uri uri, String str, String str2) {
        PendingIntent pendingIntentA01;
        Context applicationContext = context.getApplicationContext();
        AuraNotificationChannels auraNotificationChannels = AuraNotificationChannels.INSTANCE;
        C7384Etj.A0X(applicationContext);
        auraNotificationChannels.ensureChannelsExist(applicationContext);
        C7380Etd c7380Etd = new C7380Etd(applicationContext);
        if (c7380Etd.A00.areNotificationsEnabled()) {
            int iHashCode = uri.toString().hashCode();
            Intent intentCreateNotificationTapIntent = createNotificationTapIntent(applicationContext, uri, str);
            if (intentCreateNotificationTapIntent != null) {
                C7m8 c7m8 = new C7m8();
                c7m8.A04(intentCreateNotificationTapIntent, null);
                pendingIntentA01 = c7m8.A01(applicationContext, iHashCode, 1140850688);
            } else {
                pendingIntentA01 = null;
            }
            EG6 eg6A08 = C3cI.A08(applicationContext, C60N.A00(70));
            eg6A08.A08(applicationContext.getString(R.string._name_removed__res_0x7f120931));
            eg6A08.A07(str2);
            eg6A08.A02();
            eg6A08.A04 = 0;
            eg6A08.A0T = HatchNotificationSuppression.voiceCallActive;
            if (pendingIntentA01 != null) {
                eg6A08.A09 = pendingIntentA01;
            }
            Notification notificationA01 = eg6A08.A01();
            C7384Etj.A0U(notificationA01);
            c7380Etd.A01(null, iHashCode, notificationA01);
        }
    }

    private final Intent resolvedOrNull(Intent intent, Context context) {
        ComponentName componentNameResolveActivity = intent.resolveActivity(context.getPackageManager());
        if (componentNameResolveActivity == null) {
            return null;
        }
        intent.setComponent(componentNameResolveActivity);
        return intent;
    }

    public final void onDownloadComplete(Context context, Uri uri, String str, String str2, String str3) {
        AnonymousClass005.A17(context, uri, str, str2, str3);
        showOpenSnackbar(context, uri, str, str3);
        postOpenNotification(context, uri, str, str2);
    }
}
