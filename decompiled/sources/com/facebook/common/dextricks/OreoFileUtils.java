package com.facebook.common.dextricks;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BV4;
import X.BV5;
import X.BV6;
import X.C3cG;
import X.C60O;
import X.C8j4;
import X.ETi;
import X.FGI;
import android.content.Context;
import dalvik.system.VMRuntime;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public class OreoFileUtils {
    public static final OreoFileUtils $redex_init_class = null;

    public static native String getOdexKeyValueNative(String str, String str2);

    static {
        ETi.loadLibrary("oreofileutils-jni");
    }

    public static List<Boolean> areFilesMapped(List<String> list) {
        return areFilesMapped(list, "/proc/self/maps");
    }

    public static DexErrorRecoveryInfoAsync collectAsyncInfoWithSecondary(Context context, File file) {
        List<Boolean> listUsingOptimizedBaseAndMegazipFiles = usingOptimizedBaseAndMegazipFiles(context, file);
        Boolean bool = (Boolean) C8j4.A0p(listUsingOptimizedBaseAndMegazipFiles);
        Boolean bool2 = listUsingOptimizedBaseAndMegazipFiles.get(1);
        Boolean bool3 = listUsingOptimizedBaseAndMegazipFiles.get(2);
        Boolean bool4 = listUsingOptimizedBaseAndMegazipFiles.get(3);
        Boolean bool5 = listUsingOptimizedBaseAndMegazipFiles.get(4);
        DexErrorRecoveryInfoAsync.setAppMetaInfo(DexStoreUtils.getARTVersion(context), DexStoreUtils.getLastAppInstallOrUpdateTime(context), DexStoreUtils.getInstallerName(context));
        Boolean bool6 = Boolean.TRUE;
        return new DexErrorRecoveryInfoAsync(bool, bool2, bool3, bool4, bool5, bool6.equals(bool) ? Long.valueOf(DexStoreUtils.getBaseOdex(context).length()) : null, bool6.equals(bool2) ? Long.valueOf(DexStoreUtils.getBaseVdex(context).length()) : null, bool6.equals(bool) ? Long.valueOf(DexStoreUtils.getBaseOdex(context).lastModified()) : null, bool6.equals(bool2) ? Long.valueOf(DexStoreUtils.getBaseVdex(context).lastModified()) : null, bool6.equals(bool) ? getBaseOdexKeyValue(context, "dex2oat-cmdline") : null, bool6.equals(bool3) ? Long.valueOf(DexStoreUtils.getBaseAppImage(context).length()) : null, bool6.equals(bool3) ? Long.valueOf(DexStoreUtils.getBaseAppImage(context).lastModified()) : null, DexStoreUtils.getBaseDMSize(context), DexStoreUtils.getBaselineProfileInDMSize(context), DexStoreUtils.getVDexFileInDMSize(context), getApkDirStr(context), bool6.equals(bool5) ? Long.valueOf(getImageSize(file)) : null);
    }

    public static DexErrorRecoveryInfoAsync collectBaseAsyncInfo(Context context) {
        List<Boolean> listUsingOptimizedBaseFiles = usingOptimizedBaseFiles(context);
        Boolean bool = (Boolean) C8j4.A0p(listUsingOptimizedBaseFiles);
        Boolean bool2 = listUsingOptimizedBaseFiles.get(1);
        Boolean bool3 = listUsingOptimizedBaseFiles.get(2);
        DexErrorRecoveryInfoAsync.setAppMetaInfo(DexStoreUtils.getARTVersion(context), DexStoreUtils.getLastAppInstallOrUpdateTime(context), DexStoreUtils.getInstallerName(context));
        Boolean bool4 = Boolean.TRUE;
        return new DexErrorRecoveryInfoAsync(bool, bool2, bool3, bool4.equals(bool) ? Long.valueOf(DexStoreUtils.getBaseOdex(context).length()) : null, bool4.equals(bool2) ? Long.valueOf(DexStoreUtils.getBaseVdex(context).length()) : null, bool4.equals(bool) ? Long.valueOf(DexStoreUtils.getBaseOdex(context).lastModified()) : null, bool4.equals(bool2) ? Long.valueOf(DexStoreUtils.getBaseVdex(context).lastModified()) : null, bool4.equals(bool) ? getBaseOdexKeyValue(context, "dex2oat-cmdline") : null, bool4.equals(bool3) ? Long.valueOf(DexStoreUtils.getBaseAppImage(context).length()) : null, bool4.equals(bool3) ? Long.valueOf(DexStoreUtils.getBaseAppImage(context).lastModified()) : null, DexStoreUtils.getBaseDMSize(context), DexStoreUtils.getBaselineProfileInDMSize(context), DexStoreUtils.getVDexFileInDMSize(context), getApkDirStr(context));
    }

    public static long currentProfileSize(File file) {
        return C3cG.A0O(file.getParentFile(), FGI.A0U("oat/", file.getName(), ".cur.prof")).length();
    }

    public static String getBaseOdexDex2OatCmdLine(Context context) {
        return getBaseOdexKeyValue(context, "dex2oat-cmdline");
    }

    public static String getFileContents(File file) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (file == null || !file.exists()) {
            return "";
        }
        StringBuilder sbA0w = C60O.A0w();
        try {
            BufferedReader bufferedReaderA0I = BV5.A0I(file);
            while (true) {
                try {
                    String line = bufferedReaderA0I.readLine();
                    if (line == null) {
                        break;
                    }
                    sbA0w.append(line);
                    sbA0w.append('\n');
                } finally {
                }
            }
            bufferedReaderA0I.close();
        } catch (IOException unused) {
        }
        return sbA0w.toString();
    }

    public static String getMegazipOdexDex2OatCmdLine(File file) {
        return getMegazipOdexKeyValue(file, "dex2oat-cmdline");
    }

    public static File getReferenceProfile(File file) {
        return C3cG.A0O(file.getParentFile(), "oat/".concat(file.getName()).concat(".prof"));
    }

    public static boolean alreadyExtractedForCloudPgo(File file) {
        return BV5.A1R(file.getParentFile(), "oat/cloud_pgo_extracted");
    }

    public static boolean alreadyPostColdStartSpeedProfile(File file) {
        return BV5.A1R(file.getParentFile(), "oat/speed_profile");
    }

    public static String getApkDirStr(Context context) throws IOException {
        File apkDir = DexStoreUtils.getApkDir(context);
        String canonicalPath = "";
        if (apkDir == null) {
            return "";
        }
        try {
            canonicalPath = apkDir.getCanonicalPath();
            return canonicalPath;
        } catch (IOException unused) {
            return canonicalPath;
        }
    }

    public static String getBaseAppImageName(Context context) {
        File apkDir = DexStoreUtils.getApkDir(context);
        if (apkDir == null) {
            return "";
        }
        return apkDir.getName().concat("/oat/").concat(VMRuntime.getRuntime().vmInstructionSet()).concat("/base.art");
    }

    public static String getBaseOdexKeyValue(Context context, String str) {
        File baseOdex = DexStoreUtils.getBaseOdex(context);
        String odexKeyValueNative = "";
        if (!baseOdex.exists()) {
            return "";
        }
        try {
            odexKeyValueNative = getOdexKeyValueNative(baseOdex.getCanonicalPath(), str);
            return odexKeyValueNative;
        } catch (IOException | RuntimeException unused) {
            return odexKeyValueNative;
        }
    }

    public static String getBaseOdexName(Context context) {
        File apkDir = DexStoreUtils.getApkDir(context);
        if (apkDir == null) {
            return "";
        }
        return apkDir.getName().concat("/oat/").concat(VMRuntime.getRuntime().vmInstructionSet()).concat("/base.odex");
    }

    public static String getBaseVdexName(Context context) {
        File apkDir = DexStoreUtils.getApkDir(context);
        if (apkDir == null) {
            return "";
        }
        return apkDir.getName().concat("/oat/").concat(VMRuntime.getRuntime().vmInstructionSet()).concat("/base.vdex");
    }

    public static long getImageSize(File file) {
        return C3cG.A0O(getIsaDir(file), getZipNameNoSuffix(file).concat(".art")).length();
    }

    public static File getIsaDir(File file) {
        return C3cG.A0O(file.getParentFile(), "oat/".concat(VMRuntime.getRuntime().vmInstructionSet()));
    }

    public static String getMegazipAppImageName(File file) {
        return getZipNameNoSuffix(file).concat(".art");
    }

    public static String getMegazipOdexKeyValue(File file, String str) {
        File odex = getOdex(file);
        String odexKeyValueNative = "";
        if (!odex.exists()) {
            return "";
        }
        try {
            odexKeyValueNative = getOdexKeyValueNative(odex.getCanonicalPath(), str);
            return odexKeyValueNative;
        } catch (IOException | RuntimeException unused) {
            return odexKeyValueNative;
        }
    }

    public static File getOdex(File file) {
        return C3cG.A0O(getIsaDir(file), getOdexName(file));
    }

    public static long getOdexLastModified(File file) {
        return getOdex(file).lastModified();
    }

    public static String getOdexName(File file) {
        return getZipNameNoSuffix(file).concat(DexManifest.ODEX_EXT);
    }

    public static long getOdexSize(File file) {
        return getOdex(file).length();
    }

    public static File getOptLogFile(File file) throws IOException {
        File file2 = new File(file.getParent(), "oat/opt_log.txt");
        try {
            Files.deleteIfExists(file2.toPath());
            file2.createNewFile();
            return file2;
        } catch (IOException unused) {
            return null;
        }
    }

    public static File getVdex(File file) {
        return C3cG.A0O(getIsaDir(file), getVdexName(file));
    }

    public static long getVdexLastModified(File file) {
        return getVdex(file).lastModified();
    }

    public static String getVdexName(File file) {
        return getZipNameNoSuffix(file).concat(".vdex");
    }

    public static long getVdexSize(File file) {
        return getVdex(file).length();
    }

    public static String getZipNameNoSuffix(File file) {
        String name = file.getName();
        return BV4.A0j(name, BV6.A0B(name));
    }

    public static boolean hasOdex(File file) {
        return AnonymousClass002.A1N((getOdex(file).length() > 0L ? 1 : (getOdex(file).length() == 0L ? 0 : -1)));
    }

    public static boolean hasVdexOdex(File file) {
        return getVdex(file).length() > 0 && getOdex(file).length() > 0;
    }

    public static boolean isTruncated(File file) {
        return !file.exists() || file.length() < 102400;
    }

    public static void markExtractedForCloudPgo(File file) throws IOException {
        try {
            C3cG.A0O(file.getParentFile(), "oat/cloud_pgo_extracted").createNewFile();
        } catch (IOException unused) {
        }
    }

    public static void markPostColdStartSpeedProfile(File file) throws IOException {
        try {
            C3cG.A0O(file.getParentFile(), "oat/speed_profile").createNewFile();
        } catch (IOException unused) {
        }
    }

    public static long referenceProfileSize(File file) {
        return getReferenceProfile(file).length();
    }

    public static List<Boolean> usingOptimizedBaseAndMegazipFiles(Context context, File file) {
        String baseOdexName = getBaseOdexName(context);
        String baseVdexName = getBaseVdexName(context);
        String baseAppImageName = getBaseAppImageName(context);
        if (baseOdexName.isEmpty()) {
            return Collections.nCopies(5, false);
        }
        return areFilesMapped(BV4.A0t(Arrays.asList(baseOdexName, baseVdexName, baseAppImageName, getOdexName(file), getMegazipAppImageName(file))), "/proc/self/maps");
    }

    public static List<Boolean> usingOptimizedBaseFiles(Context context) {
        String baseOdexName = getBaseOdexName(context);
        return baseOdexName.isEmpty() ? Collections.nCopies(3, false) : areFilesMapped(BV4.A0t(BV5.A12(baseOdexName, getBaseVdexName(context), getBaseAppImageName(context))), "/proc/self/maps");
    }

    public static List<Boolean> areFilesMapped(List<String> list, String str) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayListA0t = BV4.A0t(Collections.nCopies(list.size(), AnonymousClass001.A0h()));
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(str), 128);
            int i = 0;
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null || i == list.size()) {
                        break;
                    }
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        if (!AnonymousClass001.A1X(arrayListA0t.get(i2)) && line.contains(list.get(i2))) {
                            arrayListA0t.set(i2, AnonymousClass001.A0i());
                            i++;
                        }
                    }
                } finally {
                }
            }
            bufferedReader.close();
            return arrayListA0t;
        } catch (IOException unused) {
            return arrayListA0t;
        }
    }
}
