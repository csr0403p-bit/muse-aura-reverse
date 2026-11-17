package com.facebook.aura.network;

import X.AbstractC2159Azp;
import X.AbstractC5321DgF;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.BV4;
import X.BZG;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C83;
import X.CGT;
import X.F0C;
import X.FGI;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt;
import com.facebook.aura.maps.model.HatchMapSceneKt;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class AuraUserAgent {
    public static final AuraUserAgent INSTANCE = new AuraUserAgent();
    public static final F0C<String> fullUserAgent = AbstractC5321DgF.A03(AuraUserAgent$fullUserAgent$1.INSTANCE);

    public final class WithoutTelephonyContext extends ContextWrapper {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithoutTelephonyContext(Context context) {
            super(context);
            C7384Etj.A0Y(context, 0);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            C7384Etj.A0Y(str, 0);
            if (str.equals(HatchLinkOrderSheetKt.PHONE)) {
                return null;
            }
            return super.getSystemService(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String generateUserAgent(Context context) throws PackageManager.NameNotFoundException, IOException {
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        int i = packageInfo.versionCode;
        String strA00 = A00(context, Integer.valueOf(i), packageInfo.versionName, null, additionalValues(), false);
        C7384Etj.A0U(strA00);
        return useRawDeviceModel(strA00);
    }

    public final String generateWebUserAgent(String str) throws IOException {
        C7384Etj.A0Y(str, 0);
        String strA00 = A00(C3cG.A06(), null, null, str, additionalValues(), true);
        C7384Etj.A0U(strA00);
        return useRawDeviceModel(strA00);
    }

    public final String instanceWithoutWaiting(Executor executor) {
        C7384Etj.A0Y(executor, 0);
        F0C<String> f0c = fullUserAgent;
        if (f0c.AOX()) {
            return f0c.getValue();
        }
        executor.execute(new Runnable() { // from class: com.facebook.aura.network.AuraUserAgent.instanceWithoutWaiting.1
            @Override // java.lang.Runnable
            public final void run() {
                AuraUserAgent.fullUserAgent.getValue();
            }
        });
        return generateUserAgent(new WithoutTelephonyContext(C3cG.A06()));
    }

    public static String A00(Context context, Integer num, String str, String str2, Map map, boolean z) throws IOException {
        int iIntValue;
        String str3;
        StringWriter stringWriter = new StringWriter();
        C83 c83 = new C83(stringWriter);
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HatchLinkOrderSheetKt.PHONE);
            if (str2 == null) {
                str2 = System.getProperty("http.agent");
            }
            stringWriter.append((CharSequence) str2).append((CharSequence) " [");
            A02(stringWriter, "FBAN", "AuraForAndroid");
            if (str == null) {
                CGT.A00(context);
                str = CGT.A00;
            }
            A01(stringWriter, c83, "FBAV", str);
            A02(stringWriter, "FBPN", context.getPackageName());
            Locale locale = Locale.getDefault();
            if (locale == null) {
                locale = BZG.A00;
            }
            String strA0o = C60O.A0o(locale);
            if (strA0o.length() == 0) {
                strA0o = "en_US";
            }
            A01(stringWriter, c83, "FBLC", strA0o);
            if (num == null) {
                CGT.A00(context);
                iIntValue = CGT.A01;
            } else {
                iIntValue = num.intValue();
            }
            A02(stringWriter, "FBBV", Integer.toString(iIntValue));
            A01(stringWriter, c83, "FBCR", telephonyManager != null ? telephonyManager.getNetworkOperatorName() : "");
            A01(stringWriter, c83, "FBMF", Build.MANUFACTURER);
            A01(stringWriter, c83, "FBBD", Build.BRAND);
            A01(stringWriter, c83, "FBDV", Build.MODEL);
            A01(stringWriter, c83, "FBSV", Build.VERSION.RELEASE);
            String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
            int length = strArr.length;
            if (length > 0) {
                str3 = strArr[0];
            } else {
                strArr = Build.SUPPORTED_ABIS;
                str3 = strArr[0];
                length = strArr.length;
            }
            String str4 = length > 1 ? strArr[1] : "";
            stringWriter.append((CharSequence) "FBCA").append('/');
            c83.append((CharSequence) str3);
            stringWriter.append(HatchMapSceneKt.ARTIFACT_ID_SEPARATOR);
            c83.append((CharSequence) str4);
            stringWriter.append(';');
            DisplayMetrics displayMetricsA0B = C60Q.A0B(context);
            Point point = new Point(displayMetricsA0B.widthPixels, displayMetricsA0B.heightPixels);
            stringWriter.append((CharSequence) "FBDM").append('/').append((CharSequence) "{density=").append((CharSequence) Float.toString(displayMetricsA0B.density)).append((CharSequence) ",width=").append((CharSequence) Integer.toString(point.x)).append((CharSequence) ",height=").append((CharSequence) Integer.toString(point.y)).append('}').append(';');
            if (z) {
                stringWriter.append((CharSequence) "FB_FW/1;");
            }
            if (map != null) {
                Iterator itA0n = AnonymousClass002.A0n(map);
                while (itA0n.hasNext()) {
                    Map.Entry entry = (Map.Entry) itA0n.next();
                    String str5 = (String) entry.getKey();
                    String str6 = (String) entry.getValue();
                    if (str5 != null && str6 != null) {
                        A01(stringWriter, c83, (String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            stringWriter.append(']');
            String string = stringWriter.toString();
            try {
                c83.close();
                stringWriter.close();
                return string;
            } catch (IOException e) {
                throw BV4.A0e(e);
            }
        } catch (Throwable th) {
            try {
                c83.close();
                stringWriter.close();
                throw th;
            } catch (IOException e2) {
                throw BV4.A0e(e2);
            }
        }
    }

    private final String useRawDeviceModel(String str) throws IOException {
        StringWriter stringWriter = new StringWriter();
        C83 c83 = new C83(stringWriter);
        String str2 = Build.MODEL;
        c83.write(str2);
        return AbstractC2159Azp.A0z(str, AnonymousClass007.A0a("FBDV/", stringWriter), FGI.A0M("FBDV/", str2));
    }

    public final String getInstance() {
        return fullUserAgent.getValue();
    }

    public static void A01(Writer writer, Writer writer2, String str, String str2) throws IOException {
        writer.append((CharSequence) str).append('/');
        writer2.append((CharSequence) str2);
        writer.append(';');
    }

    public static void A02(Writer writer, String str, String str2) throws IOException {
        writer.append((CharSequence) str).append('/').append((CharSequence) str2).append(';');
    }

    private final Map<String, String> additionalValues() {
        if (C3cG.A06().getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return AnonymousClass006.A10("FBSN", "WearOS");
        }
        return null;
    }
}
