package com.facebook.common.dextricks;

import X.AnonymousClass001;
import X.BV4;
import X.BV5;
import X.BV6;
import X.BV8;
import X.C3cG;
import X.FGI;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipFile;

/* loaded from: classes5.dex */
public final class Fs {
    public static File sDalvikCacheDirectory;

    public static void deleteRecursiveNoThrow(File file) {
        if (file != null) {
            try {
                deleteRecursive(file);
            } catch (Exception e) {
                Mlog.w(e, "error deleting %s", file);
            }
        }
    }

    public static File findSystemDalvikCache() {
        File file = sDalvikCacheDirectory;
        if (file != null) {
            return file;
        }
        String property = System.getProperty("os.arch");
        if (property == null) {
            throw BV4.A0c("os.arch system property is null");
        }
        String strA0u = AnonymousClass001.A0u(property);
        String str = "arm";
        if (!strA0u.startsWith("arm")) {
            str = "x86";
            if (!strA0u.startsWith("x86") && (!strA0u.startsWith("i") || !strA0u.endsWith("86"))) {
                throw BV5.A0h("unknown arch: ", strA0u);
            }
        }
        String str2 = System.getenv("ANDROID_DATA");
        if (str2 == null) {
            str2 = "/data";
        }
        String str3 = String.format("%s/dalvik-cache/%s", str2, str);
        if (!BV4.A0G(str3).isDirectory()) {
            str3 = String.format("%s/dalvik-cache", str2);
        }
        File fileA0G = BV4.A0G(str3);
        sDalvikCacheDirectory = fileA0G;
        return fileA0G;
    }

    public static RuntimeException runtimeExFrom(Throwable th) {
        return th == null ? BV4.A0c("missing exception object") : th instanceof RuntimeException ? (RuntimeException) th : BV4.A0e(th);
    }

    public static void safeClose(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                Mlog.w(e, "error closing %s", closeable);
            }
        }
    }

    public static void deleteRecursive(File file) {
        RuntimeInternals.deleteRecursive(file.getAbsolutePath());
    }

    public static File dexOptGenerateCacheFileName(File file, File file2, String str) {
        String absolutePath = file2.getAbsolutePath();
        if (str != null) {
            absolutePath = FGI.A0U(absolutePath, "@", str);
        }
        return C3cG.A0O(file, absolutePath.substring(1).replace(CustomConnectorRegisterRepositoryKt.ROOT_PATH, "@"));
    }

    public static long discardFromInputStream(InputStream inputStream, long j) {
        int i;
        byte[] bArr = new byte[32768];
        long j2 = 0;
        while (j2 < j && (i = inputStream.read(bArr, 0, BV4.A01(OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED, j - j2))) != -1) {
            j2 += i;
        }
        return j2;
    }

    public static void fsyncRecursive(File file, Prio prio) {
        File[] fileArrListFiles;
        if (file.getPath().endsWith("_lock")) {
            return;
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                fsyncRecursive(file2, prio);
            }
        }
        if (file.exists()) {
            RuntimeInternals.fsyncNamed(file.getAbsolutePath(), prio.ioPriority);
        }
    }

    public static void mkdirOrThrow(File file) {
        if (!file.mkdirs() && !file.isDirectory()) {
            throw BV8.A0j(file, "cannot mkdir: ");
        }
    }

    public static void renameOrThrow(File file, File file2) throws IOException {
        if (!file.exists()) {
            throw BV4.A0K(AnonymousClass001.A0v(" because it doesn't exist", C3cG.A0f(file, "Cannot rename ")));
        }
        if (file.renameTo(file2)) {
            return;
        }
        StringBuilder sbA0f = C3cG.A0f(file, "rename of ");
        sbA0f.append(" to ");
        sbA0f.append(file2);
        throw BV4.A0K(AnonymousClass001.A0v(" failed", sbA0f));
    }

    public static String stripLastExtension(String str) {
        int iA0B = BV6.A0B(str);
        return iA0B != -1 ? BV4.A0j(str, iA0B) : str;
    }

    public static void safeClose(ZipFile zipFile) throws IOException {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (Exception e) {
                Mlog.w(e, "error closing %s", zipFile);
            }
        }
    }
}
