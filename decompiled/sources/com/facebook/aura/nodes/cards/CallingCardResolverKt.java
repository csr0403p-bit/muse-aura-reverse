package com.facebook.aura.nodes.cards;

import X.AnonymousClass000;
import X.AnonymousClass002;
import X.C5246DeB;
import X.C7384Etj;
import X.C7BY;
import X.C7lJ;
import X.C8hv;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.Telephony;
import android.telecom.TelecomManager;
import android.telephony.PhoneNumberUtils;

/* loaded from: classes2.dex */
public abstract class CallingCardResolverKt {
    public static final String formatPhoneNumberForDisplay(String str) {
        C7384Etj.A0Y(str, 0);
        String number = PhoneNumberUtils.formatNumber(str, ((C7lJ) C5246DeB.A00(32775)).A01().getCountry());
        return (number == null || C7BY.A0j(number)) ? str : number;
    }

    public static final ContactInfo resolveContact(Context context, String str) {
        boolean zA1a = AnonymousClass002.A1a(context, str);
        if (context.checkSelfPermission(AnonymousClass000.A00(28)) != 0) {
            return null;
        }
        try {
            Cursor cursorQuery = context.getContentResolver().query(Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(str)), new String[]{"display_name", "photo_uri"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null || C7BY.A0j(string)) {
                        string = null;
                    }
                    String string2 = cursorQuery.getString(zA1a ? 1 : 0);
                    if (string2 == null || C7BY.A0j(string2)) {
                        string2 = null;
                    }
                    ContactInfo contactInfo = (string == null && string2 == null) ? null : new ContactInfo(string, string2);
                    cursorQuery.close();
                    return contactInfo;
                } finally {
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static final DialerApp resolveDefaultDialer(Context context) throws PackageManager.NameNotFoundException {
        TelecomManager telecomManager;
        String strA00;
        C7384Etj.A0Y(context, 0);
        Object systemService = context.getSystemService("telecom");
        Drawable applicationIcon = null;
        if ((systemService instanceof TelecomManager) && (telecomManager = (TelecomManager) systemService) != null) {
            try {
                String defaultDialerPackage = telecomManager.getDefaultDialerPackage();
                if (defaultDialerPackage != null && (strA00 = C8hv.A00.A00(defaultDialerPackage, context)) != null) {
                    try {
                        applicationIcon = context.getPackageManager().getApplicationIcon(defaultDialerPackage);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    return new DialerApp(strA00, applicationIcon);
                }
            } catch (SecurityException unused2) {
            }
        }
        return null;
    }

    public static final MessagingApp resolveDefaultMessagingApp(Context context) throws PackageManager.NameNotFoundException {
        String strA00;
        C7384Etj.A0Y(context, 0);
        String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(context);
        Drawable applicationIcon = null;
        if (defaultSmsPackage == null || (strA00 = C8hv.A00.A00(defaultSmsPackage, context)) == null) {
            return null;
        }
        try {
            applicationIcon = context.getPackageManager().getApplicationIcon(defaultSmsPackage);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return new MessagingApp(strA00, applicationIcon);
    }
}
