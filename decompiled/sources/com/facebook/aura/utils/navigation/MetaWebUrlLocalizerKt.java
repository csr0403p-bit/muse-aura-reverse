package com.facebook.aura.utils.navigation;

import X.AbstractC0878AGe;
import X.AbstractC10433Hhd;
import X.AnonymousClass003;
import X.C60O;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import X.C7Je;
import X.C7Of;
import X.C7lJ;
import X.FGI;
import android.app.LocaleManager;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import com.facebook.aura.maps.scene.HatchMapThemeKt;
import com.facebook.aura.network.endpoint.AuraAnalyticsEndpointSelector;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class MetaWebUrlLocalizerKt {
    public static final Set<String> META_HOSTS = C60O.A19("meta.com", "www.meta.com");
    public static final Set<String> FACEBOOK_HOSTS = C60O.A1A(AuraAnalyticsEndpointSelector.DEFAULT_DOMAIN_SUFFIX, "www.facebook.com", "m.facebook.com");
    public static final String FB_HASH_LOCALE = C60O.A0o(C7lJ.A07);

    public static final Locale deviceLocale(Context context) {
        LocaleList systemLocales = Build.VERSION.SDK_INT >= 33 ? ((LocaleManager) context.getSystemService(LocaleManager.class)).getSystemLocales() : Resources.getSystem().getConfiguration().getLocales();
        C7384Etj.A0X(systemLocales);
        if (systemLocales.isEmpty()) {
            return null;
        }
        return systemLocales.get(0);
    }

    public static final Uri withFacebookLocale(Uri uri, String str) {
        return uri.getQueryParameter(HatchMapThemeKt.PARAM_LOCALE) == null ? C60R.A0B(uri.buildUpon(), HatchMapThemeKt.PARAM_LOCALE, str) : uri;
    }

    public static final Uri withMetaHelpLanguage(Uri uri, String str) {
        if ("en_US".equals(str)) {
            return uri;
        }
        List<String> pathSegments = uri.getPathSegments();
        C7384Etj.A0U(pathSegments);
        if (!C7384Etj.areEqual(AbstractC0878AGe.A0G(pathSegments), "help")) {
            return uri;
        }
        Uri uriBuild = uri.buildUpon().encodedAuthority("www.meta.com").encodedPath(FGI.A0U(CustomConnectorRegisterRepositoryKt.ROOT_PATH, C60Q.A0j(str).replace('_', '-'), uri.getEncodedPath())).build();
        C7384Etj.A0U(uriBuild);
        return uriBuild;
    }

    public static final String deviceFbLocale(Context context) {
        Locale localeDeviceLocale = deviceLocale(context);
        if (localeDeviceLocale == null) {
            return null;
        }
        Set<String> set = C7Of.A00;
        C7384Etj.A0U(set);
        Locale locale = new Locale(localeDeviceLocale.getLanguage(), localeDeviceLocale.getCountry());
        if (!set.contains(locale.toString())) {
            if (!set.contains(localeDeviceLocale.getLanguage())) {
                return null;
            }
            locale = new Locale(localeDeviceLocale.getLanguage());
        }
        return AbstractC10433Hhd.A01(locale);
    }

    public static final Uri localizedForDevice(Uri uri, Context context) {
        AnonymousClass003.A0u(uri, context);
        String strDeviceFbLocale = deviceFbLocale(context);
        if (strDeviceFbLocale == null) {
            return uri;
        }
        if (strDeviceFbLocale.endsWith("_XA") || strDeviceFbLocale.endsWith("_XB") || strDeviceFbLocale.equals(FB_HASH_LOCALE)) {
            return uri;
        }
        String host = uri.getHost();
        String strA0j = host != null ? C60Q.A0j(host) : null;
        return AbstractC0878AGe.A0k(META_HOSTS, strA0j) ? withMetaHelpLanguage(uri, strDeviceFbLocale) : AbstractC0878AGe.A0k(FACEBOOK_HOSTS, strA0j) ? withFacebookLocale(uri, strDeviceFbLocale) : uri;
    }

    public static final String localizedForDevice(String str, Context context) {
        Uri uriLocalizedForDevice;
        String string;
        AnonymousClass003.A0u(str, context);
        Uri uriA01 = null;
        try {
            uriA01 = C7Je.A01(str);
        } catch (SecurityException | UnsupportedOperationException unused) {
        }
        if (uriA01 != null && (uriLocalizedForDevice = localizedForDevice(uriA01, context)) != null && (string = uriLocalizedForDevice.toString()) != null) {
            return string;
        }
        return str;
    }
}
