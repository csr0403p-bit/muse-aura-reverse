package com.google.firebase.provider;

import X.C3553CTq;
import X.C3554CTr;
import X.C3557CTu;
import X.C3cG;
import X.C7O;
import X.CRy;
import X.FGI;
import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.aura.R;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public class FirebaseInitProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        CRy.A04(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if ("com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            throw C3cG.A0Q("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        C3554CTr c3554CTr;
        Context context = getContext();
        synchronized (C3554CTr.A09) {
            Map<String, C3554CTr> map = C3554CTr.A0A;
            if (map.containsKey("[DEFAULT]")) {
                c3554CTr = C3554CTr.A00();
            } else {
                CRy.A03(context);
                Resources resources = context.getResources();
                String resourcePackageName = resources.getResourcePackageName(R.string._name_removed__res_0x7f1206fa);
                int identifier = resources.getIdentifier("google_app_id", "string", resourcePackageName);
                String string = identifier == 0 ? null : resources.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    c3554CTr = null;
                } else {
                    int identifier2 = resources.getIdentifier("google_api_key", "string", resourcePackageName);
                    String string2 = identifier2 == 0 ? null : resources.getString(identifier2);
                    int identifier3 = resources.getIdentifier("firebase_database_url", "string", resourcePackageName);
                    String string3 = identifier3 == 0 ? null : resources.getString(identifier3);
                    int identifier4 = resources.getIdentifier("ga_trackingId", "string", resourcePackageName);
                    String string4 = identifier4 == 0 ? null : resources.getString(identifier4);
                    int identifier5 = resources.getIdentifier("gcm_defaultSenderId", "string", resourcePackageName);
                    String string5 = identifier5 == 0 ? null : resources.getString(identifier5);
                    int identifier6 = resources.getIdentifier("google_storage_bucket", "string", resourcePackageName);
                    String string6 = identifier6 == 0 ? null : resources.getString(identifier6);
                    int identifier7 = resources.getIdentifier("project_id", "string", resourcePackageName);
                    C3557CTu c3557CTu = new C3557CTu(string, string2, string3, string4, string5, string6, identifier7 == 0 ? null : resources.getString(identifier7));
                    if (context.getApplicationContext() instanceof Application) {
                        Application application = (Application) context.getApplicationContext();
                        AtomicReference<C3553CTq> atomicReference = C3553CTq.A00;
                        if (atomicReference.get() == null) {
                            C3553CTq c3553CTq = new C3553CTq();
                            if (C7O.A00(null, c3553CTq, atomicReference)) {
                                BackgroundDetector.A00(application);
                                BackgroundDetector backgroundDetector = BackgroundDetector.A04;
                                synchronized (backgroundDetector) {
                                    try {
                                        backgroundDetector.A01.add(c3553CTq);
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        }
                    }
                    String strTrim = "[DEFAULT]".trim();
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    try {
                        CRy.A09(!map.containsKey(strTrim), FGI.A0U("FirebaseApp name ", strTrim, " already exists!"));
                        CRy.A04(context, "Application context cannot be null.");
                        c3554CTr = new C3554CTr(context, c3557CTu, strTrim);
                        map.put(strTrim, c3554CTr);
                        C3554CTr.A02(c3554CTr);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        Log.i("FirebaseInitProvider", c3554CTr == null ? "FirebaseApp initialization unsuccessful" : "FirebaseApp initialization successful");
        return false;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }
}
