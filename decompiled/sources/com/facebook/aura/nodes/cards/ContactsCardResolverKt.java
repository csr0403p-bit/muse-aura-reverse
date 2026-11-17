package com.facebook.aura.nodes.cards;

import X.C7384Etj;
import X.C8hv;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.provider.ContactsContract;

/* loaded from: classes2.dex */
public abstract class ContactsCardResolverKt {
    public static final ContactsApp resolveDefaultContactsApp(Context context) throws PackageManager.NameNotFoundException {
        ActivityInfo activityInfo;
        String str;
        String strA00;
        C7384Etj.A0Y(context, 0);
        PackageManager packageManager = context.getPackageManager();
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW").setData(ContactsContract.Contacts.CONTENT_URI), 65536);
        Drawable applicationIcon = null;
        if (resolveInfoResolveActivity == null || (activityInfo = resolveInfoResolveActivity.activityInfo) == null || (str = ((PackageItemInfo) activityInfo).packageName) == null || (strA00 = C8hv.A00.A00(str, context)) == null) {
            return null;
        }
        try {
            applicationIcon = packageManager.getApplicationIcon(str);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return new ContactsApp(strA00, applicationIcon);
    }
}
