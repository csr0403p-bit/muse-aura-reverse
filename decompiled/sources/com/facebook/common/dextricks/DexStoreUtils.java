package com.facebook.common.dextricks;

import X.BV4;
import X.BV5;
import X.C3cG;
import X.C60O;
import X.FGI;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import com.facebook.aura.localbrowser.ManagedBrowserSitePolicy;
import dalvik.system.VMRuntime;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes5.dex */
public final class DexStoreUtils {
    public static Long ART_VERSION_CODE = null;
    public static final String BASELINE_PROFILE_NAME = "primary.prof";
    public static Long BP_VARIANT_FILE_SIZE = -1L;
    public static int CANARY_IDX = 2;
    public static Long DM_BASELINE_PROFILE_CRC = null;
    public static Long DM_BASELINE_PROFILE_SIZE = null;
    public static Long DM_VDEX_FILE_SIZE = null;
    public static int HASH_IDX = 1;
    public static final String IGNORE_DIRTY_CHECK_PREFIX = "IGNORE_DIRTY_";
    public static String INSTALLER_NAME = null;
    public static Long LAST_APP_INSTALL_OR_UPDATE_TIME = null;
    public static final String MAIN_DEX_STORE_ID = "dex";
    public static final boolean OREO_OR_NEWER = true;
    public static final String SECONDARY_DEX_MANIFEST = "metadata.txt";
    public static final int STORAGE_KIND_ASEC = 3;
    public static final int STORAGE_KIND_EXPAND = 2;
    public static final int STORAGE_KIND_INTERNAL = 1;
    public static final int STORAGE_KIND_OTHER = 0;
    public static final String VDEX_FILE_NAME_IN_BASE_DM = "primary.vdex";

    public static synchronized boolean checkBPVariantFileExistInDM(Context context, String str) {
        int i;
        try {
            String strA0M = FGI.A0M(sha256(str), ".name");
            long jLongValue = BP_VARIANT_FILE_SIZE.longValue();
            if (jLongValue > -1) {
                i = (jLongValue > 0L ? 1 : (jLongValue == 0L ? 0 : -1));
            } else {
                File baseDM = getBaseDM(context);
                if (baseDM.length() > 0) {
                    try {
                        ZipEntry entry = new ZipFile(baseDM).getEntry(strA0M);
                        if (entry != null) {
                            BP_VARIANT_FILE_SIZE = Long.valueOf(entry.getSize());
                        }
                    } catch (IOException e) {
                        Mlog.w("error reading DM file as zip %s", e);
                    }
                }
                i = (BP_VARIANT_FILE_SIZE.longValue() > 0L ? 1 : (BP_VARIANT_FILE_SIZE.longValue() == 0L ? 0 : -1));
            }
        } catch (Exception e2) {
            Mlog.w("error getting sha256 for variant %s", e2);
            return false;
        }
        return i > 0;
    }

    public static synchronized long getARTVersion(Context context) {
        long jLongValue;
        String str;
        Object[] objArr;
        Long l = ART_VERSION_CODE;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            PackageManager packageManager = context.getPackageManager();
            jLongValue = -1;
            if (packageManager == null) {
                str = "Could not get package manager";
                objArr = new Object[0];
            } else {
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.art", 1073741824);
                    if (packageInfo != null) {
                        long longVersionCode = packageInfo.getLongVersionCode();
                        ART_VERSION_CODE = Long.valueOf(longVersionCode);
                        jLongValue = longVersionCode;
                    } else {
                        Mlog.e("Could not get pacakge info for com.google.android.art", new Object[0]);
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    str = "could not find package com.google.android.art %s";
                    objArr = new Object[]{e};
                }
            }
            Mlog.e(str, objArr);
        }
        return jLongValue;
    }

    public static synchronized Long getBaselineProfileInDMCrc(Context context) {
        Long l;
        l = DM_BASELINE_PROFILE_CRC;
        if (l == null) {
            File baseDM = getBaseDM(context);
            if (baseDM.length() > 0) {
                obtainInfoFromDMFile(baseDM);
            }
            l = DM_BASELINE_PROFILE_CRC;
        }
        return l;
    }

    public static synchronized Long getBaselineProfileInDMSize(Context context) {
        Long l;
        l = DM_BASELINE_PROFILE_SIZE;
        if (l == null) {
            File baseDM = getBaseDM(context);
            if (baseDM.length() > 0) {
                obtainInfoFromDMFile(baseDM);
            }
            l = DM_BASELINE_PROFILE_SIZE;
        }
        return l;
    }

    public static synchronized String getInstallerName(Context context) {
        String str;
        Object[] objArr;
        String installerPackageName = INSTALLER_NAME;
        if (installerPackageName == null) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                str = "Could not get package manager";
                objArr = new Object[0];
            } else {
                try {
                    if (Build.VERSION.SDK_INT >= 30) {
                        installerPackageName = packageManager.getInstallSourceInfo(context.getPackageName()).getInstallingPackageName();
                        INSTALLER_NAME = installerPackageName;
                    } else {
                        installerPackageName = packageManager.getInstallerPackageName(context.getPackageName());
                        INSTALLER_NAME = installerPackageName;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    str = "Could not find package name %s";
                    objArr = new Object[]{e};
                }
            }
            Mlog.e(str, objArr);
            return null;
        }
        return installerPackageName;
    }

    public static synchronized long getLastAppInstallOrUpdateTime(Context context) {
        long jLongValue;
        String str;
        Object[] objArr;
        Long lValueOf = LAST_APP_INSTALL_OR_UPDATE_TIME;
        jLongValue = -1;
        if (lValueOf != null) {
            jLongValue = lValueOf.longValue();
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                str = "Could not get package manager";
                objArr = new Object[0];
            } else {
                String packageName = context.getPackageName();
                try {
                    lValueOf = Long.valueOf(packageManager.getPackageInfo(packageName, 0).lastUpdateTime);
                    LAST_APP_INSTALL_OR_UPDATE_TIME = lValueOf;
                    jLongValue = lValueOf.longValue();
                } catch (PackageManager.NameNotFoundException unused) {
                    str = "Could not get package info for %s";
                    objArr = new Object[]{packageName};
                }
            }
            Mlog.e(str, objArr);
        }
        return jLongValue;
    }

    public static String getMainDexStoreId() {
        return MAIN_DEX_STORE_ID;
    }

    public static DexManifest getSecondaryDexManifest(ResProvider resProvider, boolean z) {
        return DexManifest.loadManifestFrom(resProvider, SECONDARY_DEX_MANIFEST, z);
    }

    public static int getStorageKind(String str) {
        if (str.startsWith("/data/app/")) {
            return 1;
        }
        if (str.startsWith("/mnt/expand/")) {
            return 2;
        }
        return str.startsWith("/mnt/asec/") ? 3 : 0;
    }

    public static synchronized Long getVDexFileInDMSize(Context context) {
        Long l;
        l = DM_VDEX_FILE_SIZE;
        if (l == null) {
            File baseDM = getBaseDM(context);
            if (baseDM.length() > 0) {
                obtainInfoFromDMFile(baseDM);
            }
            l = DM_VDEX_FILE_SIZE;
        }
        return l;
    }

    public static boolean isIgnoreDirtyFileName(String str) {
        return str != null && str.startsWith(IGNORE_DIRTY_CHECK_PREFIX);
    }

    public static boolean isMainDexStoreId(String str) {
        return MAIN_DEX_STORE_ID.equals(str);
    }

    public static boolean isSecondaryDexManifest(String str) {
        return SECONDARY_DEX_MANIFEST.equals(str);
    }

    public static File makeIgnoreDirtyCheckFile(File file, String str) {
        return BV5.A0L(IGNORE_DIRTY_CHECK_PREFIX, str, file);
    }

    public static synchronized void obtainInfoFromDMFile(File file) {
        try {
            ZipFile zipFile = new ZipFile(file);
            ZipEntry entry = zipFile.getEntry(VDEX_FILE_NAME_IN_BASE_DM);
            if (entry != null) {
                DM_VDEX_FILE_SIZE = Long.valueOf(entry.getSize());
            }
            ZipEntry entry2 = zipFile.getEntry(BASELINE_PROFILE_NAME);
            if (entry2 != null) {
                DM_BASELINE_PROFILE_CRC = Long.valueOf(entry2.getCrc());
                DM_BASELINE_PROFILE_SIZE = Long.valueOf(entry2.getSize());
            }
        } catch (IOException e) {
            Mlog.w("error reading DM file as zip %s", e);
        }
    }

    public static InputStream openSecondaryDexManifest(ResProvider resProvider) {
        return resProvider.open(SECONDARY_DEX_MANIFEST);
    }

    public static String sha1ForFile(String str) throws IllegalAccessException, NoSuchAlgorithmException, IOException, IllegalArgumentException, InvocationTargetException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i == -1) {
                    fileInputStream.close();
                    return toHex(messageDigest.digest());
                }
                messageDigest.update(bArr, 0, i);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    public static String sha256(String str) {
        return toHex(MessageDigest.getInstance(ConfidentialVmPinVerifierCrypto.SHA_256).digest(str.getBytes()));
    }

    public static File getApkDir(Context context) {
        return BV4.A0G(context.getApplicationInfo().publicSourceDir).getParentFile();
    }

    public static int getBaseApkStorageKind(Context context) {
        return getStorageKind(context.getApplicationInfo().publicSourceDir);
    }

    public static File getBaseAppImage(Context context) {
        return C3cG.A0O(getBaseIsaDir(context), "base.art");
    }

    public static long getBaseAppImageLastModifield(Context context) {
        return getBaseAppImage(context).lastModified();
    }

    public static long getBaseAppImageSize(Context context) {
        return getBaseAppImage(context).length();
    }

    public static File getBaseDM(Context context) {
        return C3cG.A0O(getApkDir(context), "base.dm");
    }

    public static Long getBaseDMSize(Context context) {
        return Long.valueOf(getBaseDM(context).length());
    }

    public static File getBaseIsaDir(Context context) {
        File apkDir = getApkDir(context);
        if (apkDir == null) {
            return null;
        }
        return C3cG.A0O(apkDir, "oat/".concat(VMRuntime.getRuntime().vmInstructionSet()));
    }

    public static File getBaseOdex(Context context) {
        return C3cG.A0O(getBaseIsaDir(context), "base.odex");
    }

    public static long getBaseOdexLastModifield(Context context) {
        return getBaseOdex(context).lastModified();
    }

    public static long getBaseOdexSize(Context context) {
        return getBaseOdex(context).length();
    }

    public static File getBaseVdex(Context context) {
        return C3cG.A0O(getBaseIsaDir(context), "base.vdex");
    }

    public static long getBaseVdexLastModifield(Context context) {
        return getBaseVdex(context).lastModified();
    }

    public static long getBaseVdexSize(Context context) {
        return getBaseVdex(context).length();
    }

    public static File getMainDexStoreLocation(Context context) {
        String str = context.getApplicationInfo().dataDir;
        String strRealpath = OREO_OR_NEWER ? str : RuntimeInternals.realpath(str);
        if (!str.equals(strRealpath)) {
            Mlog.v("resolved non-canonical data directory %s to %s", str, strRealpath);
        }
        return new File(strRealpath, MAIN_DEX_STORE_ID);
    }

    public static String toHex(byte[] bArr) {
        StringBuilder sbA0w = C60O.A0w();
        char[] charArray = ManagedBrowserSitePolicy.HEX.toCharArray();
        for (byte b : bArr) {
            sbA0w.append(charArray[(b >> 4) & 15]);
            sbA0w.append(charArray[b & 15]);
        }
        return sbA0w.toString();
    }
}
