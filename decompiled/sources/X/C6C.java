package X;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import com.facebook.acra.util.CrashTimeDataCollectorHelper;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import com.facebook.common.build.BuildConstants;
import com.facebook.errorreporting.field.ReportFieldString;
import dalvik.system.VMRuntime;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* loaded from: classes5.dex */
public final class C6C implements InterfaceC3231C4o {
    public Application A00;
    public C6S A01;
    public C54 A02;
    public final /* synthetic */ C3241C4y A03;
    public final /* synthetic */ F4S A04;

    public C6C(Application application, C6S c6s, C3241C4y c3241C4y, C54 c54, F4S f4s) {
        this.A03 = c3241C4y;
        this.A04 = f4s;
        this.A00 = application;
        this.A02 = c54;
        this.A01 = c6s;
    }

    public static void A02(PackageManager packageManager, C3228C4l c3228C4l) {
        c3228C4l.A02(C6B.A0H, packageManager.isDeviceUpgrading());
    }

    @Override // X.InterfaceC3231C4o
    public final Integer AHt() {
        return C79.A0c;
    }

    @Override // X.InterfaceC3231C4o
    public final void AY4(C3228C4l c3228C4l, EnumC3223C4g enumC3223C4g) throws IllegalAccessException, PackageManager.NameNotFoundException, IOException, IllegalArgumentException, InvocationTargetException {
        long j;
        String string;
        ReportFieldString reportFieldString = C6B.A53;
        C3241C4y c3241C4y = this.A03;
        c3228C4l.A03(reportFieldString, "4331325740476680");
        Application application = this.A00;
        String packageName = application.getPackageName();
        c3228C4l.A03(C6B.A57, packageName);
        C3221C4e c3221C4e = C6B.A1j;
        BuildConstants.A01();
        Map<C3221C4e, Long> map = c3228C4l.A06;
        map.put(c3221C4e, 1114131228L);
        C3221C4e c3221C4e2 = C6B.A1F;
        BuildConstants.A00();
        C3228C4l.A01(c3221C4e2, c3228C4l, 1062101792L);
        C3221C4e c3221C4e3 = C6B.A2q;
        BuildConstants.A01();
        map.put(c3221C4e3, 1114131228L);
        C3221C4e c3221C4e4 = C6B.A3G;
        String[] strArrSplit = {HatchPriceImpressionEventDataKt.NO_DISCOUNT, HatchPriceImpressionEventDataKt.NO_DISCOUNT};
        char[] cArr = new char[20];
        final File fileA0O = C3cG.A0O(c3241C4y.A03().A06, "prev_build_id.txt");
        if (fileA0O.exists()) {
            try {
                FileReader fileReader = new FileReader(fileA0O);
                try {
                    strArrSplit = new String(cArr, 0, fileReader.read(cArr)).split(PairsDiscretionDocument.TERMINATOR);
                    fileReader.close();
                } finally {
                }
            } catch (Exception e) {
                CFK.A0A(C9Y.TAG, "Reading the previous build id failed", e);
                C2Q.A00().AT9("StartupConfigPrevBuildIdReading", e, null);
            }
        }
        BuildConstants.A01();
        final String strValueOf = String.valueOf(1114131228L);
        final String str = strArrSplit[1];
        if (str.equals(strValueOf)) {
            try {
                j = Long.parseLong(strArrSplit[0]);
            } catch (Exception e2) {
                CFK.A0A(C9Y.TAG, "Returning the existing previous build id failed", e2);
                C2Q.A00().AT9("StartupConfigPrevBuildIdReturning", e2, null);
            }
        } else {
            C51.A01().execute(new Runnable() { // from class: X.C7D
                public static final String __redex_internal_original_name = "StartupConfig$11$1$$ExternalSyntheticLambda0";

                @Override // java.lang.Runnable
                public final void run() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
                    File file = fileA0O;
                    String str2 = str;
                    String str3 = strValueOf;
                    try {
                        FileWriter fileWriter = new FileWriter(file, false);
                        try {
                            fileWriter.write(FGI.A0U(str2, PairsDiscretionDocument.TERMINATOR, str3));
                            fileWriter.close();
                        } finally {
                        }
                    } catch (IOException e3) {
                        CFK.A0A(C9Y.TAG, "Writing the previous build id failed", e3);
                        C2Q.A00().AT9("StartupConfigPrevBuildIdWriting", e3, null);
                    }
                }
            });
            try {
                j = Long.parseLong(str);
            } catch (Exception e3) {
                CFK.A0A(C9Y.TAG, "Returning the new previous build id failed", e3);
                C2Q.A00().AT9("StartupConfigPrevBuildIdReturning", e3, null);
                j = 0;
            }
        }
        C3228C4l.A01(c3221C4e4, c3228C4l, j);
        C3221C4e c3221C4e5 = C6B.A1M;
        C54 c54 = this.A02;
        long j2 = c54.A02;
        C3228C4l.A01(c3221C4e5, c3228C4l, j2);
        C3228C4l.A01(C6B.A1L, c3228C4l, System.currentTimeMillis() - (SystemClock.uptimeMillis() - j2));
        String str2 = "not set";
        try {
            PackageManager packageManager = application.getPackageManager();
            C1H.A00(packageManager);
            c3228C4l.A03(C6B.A7H, packageManager.getInstallerPackageName(packageName));
            A02(packageManager, c3228C4l);
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            if (packageInfo != null) {
                if (packageInfo.versionName != null) {
                    long jA00 = A00(packageInfo);
                    BuildConstants.A00();
                    if (jA00 != 1062101792) {
                        BuildConstants.A00();
                    } else {
                        str2 = packageInfo.versionName;
                    }
                }
                C3228C4l.A01(C6B.A1N, c3228C4l, Process.myUid());
                C3228C4l.A01(C6B.A1K, c3228C4l, packageInfo.firstInstallTime);
                C3221C4e c3221C4e6 = C6B.A1O;
                C3228C4l.A01(c3221C4e6, c3228C4l, packageInfo.lastUpdateTime);
                c3228C4l.A03(C6B.A55, CrashTimeDataCollectorHelper.formatTimestamp(packageInfo.firstInstallTime));
                C3228C4l.A01(c3221C4e6, c3228C4l, packageInfo.lastUpdateTime);
                C6S c6s = this.A01;
                if (c6s != null) {
                    long j3 = Long.parseLong(c6s.A00("last_first_run", HatchPriceImpressionEventDataKt.NO_DISCOUNT));
                    long j4 = packageInfo.firstInstallTime;
                    long j5 = packageInfo.lastUpdateTime;
                    long jMax = Math.max(j4, j5);
                    if (jMax > j3) {
                        boolean zA1M = AnonymousClass002.A1M((jMax > j4 ? 1 : (jMax == j4 ? 0 : -1)));
                        boolean z = jMax == j5;
                        c6s.A00.edit().putString("last_first_run", Long.toString(jMax)).apply();
                        c3228C4l.A02(C6B.A0O, zA1M);
                        c3228C4l.A02(C6B.A0P, z);
                    } else {
                        c3228C4l.A02(C6B.A0O, false);
                        c3228C4l.A02(C6B.A0P, false);
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException e4) {
            C2Q.A00().AT9("AppInfoCollect", e4, null);
        }
        c3228C4l.A03(C6B.A8o, str2);
        ReportFieldString reportFieldString2 = C6B.A4V;
        try {
            string = Settings.Secure.getString(application.getContentResolver(), "android_id");
            if (string == null) {
                string = HatchPriceImpressionEventDataKt.NO_DISCOUNT;
            }
        } catch (Exception e5) {
            C2Q.A00().AT9("GetAndroidID", e5, null);
            CFK.A08(C9Y.TAG, "Failed to fetch the constant field ANDROID_ID", e5);
            string = HatchPriceImpressionEventDataKt.NO_DISCOUNT;
        }
        c3228C4l.A03(reportFieldString2, string);
        ReportFieldString reportFieldString3 = C6B.A6m;
        File filesDir = application.getFilesDir();
        c3228C4l.A03(reportFieldString3, filesDir != null ? filesDir.getAbsolutePath() : "n/a");
        String str3 = c54.A07;
        c3228C4l.A03(C6B.A58, FGI.A0M(packageName, "".equals(str3) ? "" : FGI.A0M(":", str3)));
        c3228C4l.A02(C6B.A0G, BuildConstants.A03());
        C3228C4l.A01(C6B.A3F, c3228C4l, Process.myPid());
        C3221C4e c3221C4e7 = C6B.A22;
        BXy.A00.A01("/proc/self/status", new long[1], new String[]{"PPid:"}, -1L);
        C3228C4l.A01(c3221C4e7, c3228C4l, (int) r8[0]);
        c3228C4l.A02(C6B.A0W, BuildConstants.A04());
        ReportFieldString reportFieldString4 = C6B.AAh;
        ApplicationInfo applicationInfo = application.getApplicationInfo();
        c3228C4l.A03(reportFieldString4, applicationInfo == null ? "n/a" : Integer.toString(applicationInfo.targetSdkVersion));
        c3228C4l.A03(C6B.A9k, application.getApplicationInfo().publicSourceDir);
        C3221C4e c3221C4e8 = C6B.A1a;
        File fileA01 = A01(application);
        int i = -1;
        if (fileA01 != null) {
            File fileA0O2 = C3cG.A0O(fileA01, "base.vdex");
            if (fileA0O2.exists()) {
                long length = fileA0O2.length();
                if (length >= 0) {
                    i = length < 2147483647L ? (int) length : Integer.MAX_VALUE;
                }
            }
        }
        C3228C4l.A01(c3221C4e8, c3228C4l, i);
        C3221C4e c3221C4e9 = C6B.A1Z;
        File fileA012 = A01(application);
        int i2 = -1;
        if (fileA012 != null) {
            File fileA0O3 = C3cG.A0O(fileA012, "base.odex");
            if (fileA0O3.exists()) {
                long length2 = fileA0O3.length();
                if (length2 >= 0) {
                    i2 = length2 < 2147483647L ? (int) length2 : Integer.MAX_VALUE;
                }
            }
        }
        C3228C4l.A01(c3221C4e9, c3228C4l, i2);
        C3221C4e c3221C4e10 = C6B.A1Y;
        File parentFile = BV4.A0G(application.getApplicationInfo().publicSourceDir).getParentFile();
        int i3 = -1;
        if (parentFile != null) {
            File fileA0O4 = C3cG.A0O(parentFile, "base.dm");
            if (fileA0O4.exists()) {
                long length3 = fileA0O4.length();
                if (length3 >= 0) {
                    i3 = length3 < 2147483647L ? (int) length3 : Integer.MAX_VALUE;
                }
            }
        }
        C3228C4l.A01(c3221C4e10, c3228C4l, i3);
        C3228C4l.A01(C6B.A3x, c3228C4l, -1L);
    }

    public static long A00(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static File A01(Context context) {
        String strVmInstructionSet;
        File parentFile = BV4.A0G(context.getApplicationInfo().publicSourceDir).getParentFile();
        if (parentFile == null || (strVmInstructionSet = VMRuntime.getRuntime().vmInstructionSet()) == null) {
            return null;
        }
        return C3cG.A0O(parentFile, "oat/".concat(strVmInstructionSet));
    }
}
