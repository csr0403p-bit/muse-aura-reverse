package X;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Base64;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.aura.spaces.repo.HatchSpacesDataSourceKt;
import com.facebook.secure.trustedapp.exception.CannotAttachCallerInfoException;
import com.facebook.secure.trustedapp.exception.SignatureNotFoundException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7mb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC06887mb {
    public static final String A00 = FGI.A0H("Null metadata in caller identity, API=", Build.VERSION.SDK_INT);

    public static void A02(Intent intent, Context context, String str) {
        String str2;
        try {
            intent.setExtrasClassLoader(context.getClassLoader());
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            extras.setClassLoader(context.getClassLoader());
            try {
                str2 = AbstractC06937mg.A00(context, context.getPackageName(), 0).A03;
            } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
                str2 = null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            JSONObject jSONObject = new JSONObject();
            String strEncodeToString = null;
            try {
                jSONObject.put("t", Long.toString(jCurrentTimeMillis));
                jSONObject.put("r", Long.toString(jElapsedRealtime));
                if (str != null) {
                    jSONObject.put("d", str);
                }
                if (str2 != null) {
                    jSONObject.put(HatchSpacesDataSourceKt.VERSION_QUERY_PARAM, str2);
                }
                strEncodeToString = Base64.encodeToString(jSONObject.toString().getBytes(HatchWebPageParserKt.UTF_8), 11);
            } catch (UnsupportedEncodingException | JSONException unused2) {
            }
            C7m7 c7m7 = new C7m7();
            c7m7.A08 = strEncodeToString;
            c7m7.A03 = new ComponentName(context, "com.facebook.invalid_class.f4c3b00c");
            PendingIntent pendingIntentA01 = c7m7.A01(context, 0, 1140850688);
            if (pendingIntentA01 == null) {
                throw new CannotAttachCallerInfoException("Failed to generate CallerInfo metadata.");
            }
            extras.putParcelable("_ci_", pendingIntentA01);
            intent.putExtras(extras);
        } catch (CannotAttachCallerInfoException e) {
            throw e;
        } catch (Exception e2) {
            throw new CannotAttachCallerInfoException(e2);
        }
    }

    public static C06967mj A00(Context context, Intent intent, C7mY c7mY, int i) throws NoSuchAlgorithmException {
        String str;
        if (intent == null) {
            A03(c7mY, "Null launching intent.", null);
            return null;
        }
        try {
            if (!intent.hasExtra("_ci_")) {
                A03(c7mY, "Missing caller identity intent extra.", null);
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("_ci_");
            if (pendingIntent == null) {
                Bundle extras = intent.getExtras();
                if (extras == null || extras.get("_ci_") != null) {
                    A03(c7mY, "Caller identity extra is not a PendingIntent.", null);
                    return null;
                }
                A03(c7mY, "Null caller identity intent extra.", null);
                return null;
            }
            String creatorPackage = pendingIntent.getCreatorPackage();
            int creatorUid = pendingIntent.getCreatorUid();
            if (creatorPackage == null) {
                return null;
            }
            try {
                C7mC c7mCA01 = AbstractC06987ml.A01(context, creatorPackage);
                C06957mi c06957miA00 = AbstractC06987ml.A00(context, creatorPackage);
                C06897mc c06897mcA00 = c06957miA00.A00();
                if (c06897mcA00 == null) {
                    throw new SignatureNotFoundException(c06957miA00.A02);
                }
                List<Signature> list = c06897mcA00.A00;
                try {
                    str = (String) PendingIntent.class.getMethod("getTag", String.class).invoke(pendingIntent, "");
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    A03(c7mY, "Error extracting metadata from caller identity.", e);
                    str = null;
                }
                ApplicationInfo applicationInfo = AbstractC06987ml.A00(context, creatorPackage).A00;
                int i2 = applicationInfo != null ? applicationInfo.flags : 0;
                if (str == null) {
                    A03(c7mY, A00, null);
                    return null;
                }
                try {
                    JSONObject jSONObject = new JSONObject(new String(Base64.decode(str, 11), HatchWebPageParserKt.UTF_8));
                    String string = jSONObject.has("d") ? jSONObject.getString("d") : null;
                    String string2 = jSONObject.has(HatchSpacesDataSourceKt.VERSION_QUERY_PARAM) ? jSONObject.getString(HatchSpacesDataSourceKt.VERSION_QUERY_PARAM) : null;
                    long j = jSONObject.has("t") ? Long.parseLong(jSONObject.getString("t")) : -1L;
                    long j2 = jSONObject.has("r") ? Long.parseLong(jSONObject.getString("r")) : -1L;
                    if (i != Integer.MAX_VALUE) {
                        long j3 = i;
                        if (System.currentTimeMillis() - j >= j3 && C3cG.A04(j2) >= j3) {
                            A03(c7mY, "Caller identity has expired.", null);
                            return null;
                        }
                    }
                    return new C06967mj(string2, string, Collections.singletonList(creatorPackage), Collections.singletonList(c7mCA01), list, creatorUid, i2);
                } catch (UnsupportedEncodingException | IllegalArgumentException | JSONException e2) {
                    A03(c7mY, "Error parsing metadata from caller identity.", e2);
                    return null;
                }
            } catch (SecurityException e3) {
                A03(c7mY, "Failed to get signature.", e3);
                return null;
            }
        } catch (ClassCastException e4) {
            A03(c7mY, "Failed to parse Intent extras, they are of wrong type.", e4);
            return null;
        } catch (RuntimeException e5) {
            A03(c7mY, "Caught a runtime exception when parsing Intent extras.", e5);
            return null;
        }
    }

    public static void A03(C7mY c7mY, String str, Throwable th) {
        if (c7mY != null) {
            c7mY.report("CallerInfoHelper", str, th);
        }
    }

    public static void A01(Context context, Intent intent, C7mY c7mY, String str) {
        try {
            A02(intent, context, str);
        } catch (CannotAttachCallerInfoException e) {
            c7mY.report("CallerInfoHelper", "Error attaching caller info to Intent.", e);
        }
    }
}
