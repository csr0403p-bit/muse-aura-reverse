package com.facebook.common.dextricks;

import X.CIP;
import android.app.Application;
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import com.facebook.perf.background.BackgroundStartupDetector;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class FadviseHelper {
    public static final String TAG = "FadviseHelper";

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void doFadvise(android.app.Application r5, java.lang.String r6, java.lang.String r7, long r8, long r10, boolean r12) {
        /*
            r4 = r7
            int r0 = r6.hashCode()
            r3 = -1
            switch(r0) {
                case -408188177: goto L46;
                case 975766907: goto L50;
                case 1728122231: goto L5a;
                case 1787945532: goto L64;
                default: goto L9;
            }
        L9:
            java.lang.String r2 = "FadviseHelper"
            java.lang.String r1 = "/"
            switch(r3) {
                case 0: goto L1a;
                case 1: goto L21;
                case 2: goto L35;
                case 3: goto L23;
                default: goto L10;
            }
        L10:
            java.lang.Object[] r1 = new java.lang.Object[]{r6}
            java.lang.String r0 = "Unknown path_type: %s, skipping entry"
        L16:
            X.CFK.A0H(r2, r0, r1)
        L19:
            return
        L1a:
            android.content.pm.ApplicationInfo r0 = r5.getApplicationInfo()
            java.lang.String r0 = r0.dataDir
            goto L31
        L21:
            r5 = 1
            goto L36
        L23:
            android.content.pm.ApplicationInfo r0 = r5.getApplicationInfo()
            java.lang.String r0 = r0.sourceDir
            java.io.File r0 = X.BV4.A0G(r0)
            java.lang.String r0 = r0.getParent()
        L31:
            java.lang.String r4 = X.FGI.A0U(r0, r1, r7)
        L35:
            r5 = 0
        L36:
            r6 = r8
            r8 = r10
            r10 = r12
            int r0 = com.facebook.common.dextricks.RuntimeInternals.fadvise(r4, r5, r6, r8, r10)
            if (r0 == 0) goto L19
            java.lang.Object[] r1 = X.BV5.A1a(r4, r0)
            java.lang.String r0 = "fadvise failed for %s with result %d"
            goto L16
        L46:
            java.lang.String r0 = "data/data"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L9
            r3 = 0
            goto L9
        L50:
            java.lang.String r0 = "lib_compressed"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L9
            r3 = 1
            goto L9
        L5a:
            java.lang.String r0 = "absolute"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L9
            r3 = 2
            goto L9
        L64:
            java.lang.String r0 = "data/app"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L9
            r3 = 3
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.FadviseHelper.doFadvise(android.app.Application, java.lang.String, java.lang.String, long, long, boolean):void");
    }

    public static void fadviseFromConfig(Application application, String str) throws JSONException {
        fadviseFromConfig(application, str, false, false);
    }

    public static /* synthetic */ void lambda$fadviseEntry$0(Application application, String str, String str2, long j, long j2, boolean z, int i, boolean z2) {
        if (i == 1) {
            doFadvise(application, str, str2, j, j2, z);
        }
    }

    public static void fadviseEntry(final Application application, JSONObject jSONObject, boolean z) throws JSONException {
        final String string = jSONObject.getString("path_type");
        final String string2 = jSONObject.getString("file_path");
        final long j = jSONObject.getLong(PhotosSearchHandlerKt.PARAM_OFFSET);
        final long j2 = jSONObject.getLong("length");
        final boolean z2 = jSONObject.getBoolean("force_sync");
        if (!z || BackgroundStartupDetector.backgroundStartupDetector == null) {
            doFadvise(application, string, string2, j, j2, z2);
        } else {
            BackgroundStartupDetector.getColdStartMode(new CIP() { // from class: com.facebook.common.dextricks.FadviseHelper$$ExternalSyntheticLambda0
                @Override // X.CIP
                public final void onColdStartMode(int i, boolean z3) {
                    Application application2 = application;
                    String str = string;
                    String str2 = string2;
                    long j3 = j;
                    long j4 = j2;
                    boolean z4 = z2;
                    if (i == 1) {
                        FadviseHelper.doFadvise(application2, str, str2, j3, j4, z4);
                    }
                }
            });
        }
    }

    public static void fadviseFromConfig(Application application, String str, boolean z) throws JSONException {
        fadviseFromConfig(application, str, z, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void fadviseFromConfig(android.app.Application r5, java.lang.String r6, boolean r7, boolean r8) throws org.json.JSONException {
        /*
            if (r6 == 0) goto L3a
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L3a
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: org.json.JSONException -> L32
            r4.<init>(r6)     // Catch: org.json.JSONException -> L32
            r3 = 0
        Le:
            int r0 = r4.length()     // Catch: org.json.JSONException -> L32
            if (r3 >= r0) goto L3a
            org.json.JSONObject r2 = r4.getJSONObject(r3)     // Catch: org.json.JSONException -> L32
            java.lang.String r0 = "file_path"
            java.lang.String r1 = r2.getString(r0)     // Catch: org.json.JSONException -> L32
            java.lang.String r0 = "libcoldstart"
            boolean r0 = r1.contains(r0)     // Catch: org.json.JSONException -> L32
            if (r0 == 0) goto L2b
            if (r7 != 0) goto L2f
            r0 = 1
            if (r8 != 0) goto L2c
        L2b:
            r0 = 0
        L2c:
            fadviseEntry(r5, r2, r0)     // Catch: org.json.JSONException -> L32
        L2f:
            int r3 = r3 + 1
            goto Le
        L32:
            r2 = move-exception
            java.lang.String r1 = "FadviseHelper"
            java.lang.String r0 = "Failed to parse fadvise config JSON"
            X.CFK.A08(r1, r0, r2)
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.FadviseHelper.fadviseFromConfig(android.app.Application, java.lang.String, boolean, boolean):void");
    }
}
