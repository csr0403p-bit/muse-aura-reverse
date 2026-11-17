package com.facebook.aura.channels;

import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C7384Etj;
import X.C7Je;
import X.C7mU;
import X.C7n0;
import X.CFK;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.aura.browser.AuraBrowserLauncherKt;
import com.facebook.aura.common.url.PlayStoreListingKt;
import com.facebook.aura.main.AuraDeeplinkHandlerActivity;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class ChannelAppLauncherKt {
    public static final String TAG = "ChannelAppLauncher";

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChannelApp.values().length];
            try {
                AnonymousClass002.A13(ChannelApp.WHATSAPP, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ChannelApp.TELEGRAM, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ChannelApp.MESSENGER, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(ChannelApp.INSTAGRAM, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(ChannelApp.THREADS, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean isWebScheme(String str) {
        String strA0u = str != null ? AnonymousClass001.A0u(str) : null;
        return AuraDeeplinkHandlerActivity.HTTP.equals(strA0u) || "https".equals(strA0u);
    }

    public static final C7n0 launcher(ChannelApp channelApp) {
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = channelApp.ordinal();
        if (iOrdinal == 0 || iOrdinal == 2) {
            return C7mU.A00().A04();
        }
        if (iOrdinal == 1 || iOrdinal == 3 || iOrdinal == 4) {
            return C7mU.A00().A05();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean pinsPackageFor(ChannelApp channelApp, String str) {
        return channelApp != ChannelApp.MESSENGER || isWebScheme(str);
    }

    public static final boolean tryLaunch(C7n0 c7n0, Intent intent, Context context) {
        Object[] objArr;
        String str;
        boolean zA05 = false;
        try {
            zA05 = c7n0.A05(context, intent);
            return zA05;
        } catch (ActivityNotFoundException e) {
            e = e;
            objArr = new Object[]{intent.getData()};
            str = "No activity for %s";
            CFK.A0D(TAG, str, e, objArr);
            return zA05;
        } catch (SecurityException e2) {
            e = e2;
            objArr = new Object[]{intent.getData()};
            str = "Blocked from launching %s";
            CFK.A0D(TAG, str, e, objArr);
            return zA05;
        }
    }

    public static final Intent viewIntent(Uri uri) {
        Intent intentAddFlags = new Intent("android.intent.action.VIEW", uri).addFlags(268435456);
        C7384Etj.A0U(intentAddFlags);
        return intentAddFlags;
    }

    public static final String installedChannelPackage(Context context, ChannelApp channelApp) {
        String next;
        AnonymousClass003.A0u(context, channelApp);
        Iterator<String> it = channelApp.getPackageNames().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (context.getPackageManager().getLaunchIntentForPackage(next) != null) {
                break;
            }
        }
        return next;
    }

    public static final ChannelLaunchOutcome launchChannelUrl(Context context, ChannelApp channelApp, String str) {
        Object[] objArr;
        String str2;
        AnonymousClass005.A0x(context, channelApp, str);
        Uri uriA01 = null;
        try {
            uriA01 = C7Je.A01(str);
        } catch (SecurityException | UnsupportedOperationException unused) {
        }
        if (uriA01 == null) {
            objArr = new Object[]{channelApp.name()};
            str2 = "Unparseable %s url";
        } else {
            String strInstalledChannelPackage = installedChannelPackage(context, channelApp);
            if (strInstalledChannelPackage == null) {
                CFK.A0H(TAG, "%s not installed, sending to store", channelApp.name());
                return storeOutcome(channelApp, context);
            }
            if (tryLaunchUri(channelApp, context, uriA01, strInstalledChannelPackage)) {
                return ChannelLaunchOutcome.OPENED_DEEPLINK;
            }
            if (isWebScheme(uriA01.getScheme())) {
                AuraBrowserLauncherKt.openExternalUrl(str, context);
                return ChannelLaunchOutcome.OPENED_WEB;
            }
            String strName = channelApp.name();
            String scheme = uriA01.getScheme();
            if (scheme == null) {
                scheme = "";
            }
            objArr = new Object[]{strName, scheme};
            str2 = "%s declined a %s url";
        }
        CFK.A0H(TAG, str2, objArr);
        return ChannelLaunchOutcome.FAILED;
    }

    public static final ChannelLaunchOutcome openChannelApp(Context context, ChannelApp channelApp, String str) {
        AnonymousClass003.A0u(context, channelApp);
        String strInstalledChannelPackage = installedChannelPackage(context, channelApp);
        if (strInstalledChannelPackage == null) {
            CFK.A0H(TAG, "%s not installed, sending to store", channelApp.name());
            return storeOutcome(channelApp, context);
        }
        if (str != null || (str = channelApp.getHandoffUrl()) != null) {
            Uri uriA01 = null;
            try {
                uriA01 = C7Je.A01(str);
            } catch (SecurityException | UnsupportedOperationException unused) {
            }
            if (uriA01 != null) {
                if (tryLaunchUri(channelApp, context, uriA01, strInstalledChannelPackage)) {
                    return ChannelLaunchOutcome.OPENED_DEEPLINK;
                }
                CFK.A0H(TAG, "%s declined %s, opening the app instead", channelApp.name(), uriA01);
            }
        }
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(strInstalledChannelPackage);
        if (launchIntentForPackage != null) {
            C7n0 c7n0Launcher = launcher(channelApp);
            Intent intentAddFlags = launchIntentForPackage.addFlags(268435456);
            C7384Etj.A0U(intentAddFlags);
            if (tryLaunch(c7n0Launcher, intentAddFlags, context)) {
                return ChannelLaunchOutcome.OPENED_APP;
            }
        }
        return webOutcome(channelApp, context);
    }

    public static final boolean openChannelStore(Context context, ChannelApp channelApp) {
        AnonymousClass003.A0u(context, channelApp);
        return PlayStoreListingKt.openPlayStoreListing(context, (String) AbstractC0878AGe.A0F(channelApp.getPackageNames()));
    }

    public static final ChannelLaunchOutcome storeOutcome(ChannelApp channelApp, Context context) {
        return openChannelStore(context, channelApp) ? ChannelLaunchOutcome.SENT_TO_STORE : webOutcome(channelApp, context);
    }

    public static final boolean tryLaunchUri(ChannelApp channelApp, Context context, Uri uri, String str) {
        Intent intentViewIntent = viewIntent(uri);
        if (pinsPackageFor(channelApp, uri.getScheme())) {
            intentViewIntent.setPackage(str);
        }
        return tryLaunch(launcher(channelApp), intentViewIntent, context);
    }

    public static final ChannelLaunchOutcome webOutcome(ChannelApp channelApp, Context context) {
        return AuraBrowserLauncherKt.openBrowser(channelApp.getWebUrl(), context) ? ChannelLaunchOutcome.OPENED_WEB : ChannelLaunchOutcome.FAILED;
    }
}
