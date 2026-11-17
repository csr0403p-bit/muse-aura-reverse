package X;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: X.C3m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3211C3m {
    public final String A02() {
        String str;
        String[] strArr;
        int iBinarySearch;
        String str2;
        if (this instanceof C3r) {
            return ((C3r) this).A00.getPath();
        }
        C3209C3k c3209C3k = (C3209C3k) this;
        synchronized (c3209C3k) {
            String str3 = c3209C3k.A00;
            if (str3 == null || !BV5.A1V(str3)) {
                String str4 = c3209C3k.A01;
                ApplicationInfo applicationInfoA01 = ETi.A01();
                if ("base".equals(str4)) {
                    str = applicationInfoA01.sourceDir;
                } else {
                    String[] strArr2 = applicationInfoA01.splitSourceDirs;
                    str = null;
                    if (strArr2 != null && (strArr = applicationInfoA01.splitNames) != null && (iBinarySearch = Arrays.binarySearch(strArr, str4)) >= 0) {
                        str = strArr2[iBinarySearch];
                    }
                }
                if (str == null) {
                    throw BV5.A0V("Could not find ", str4, " split");
                }
                c3209C3k.A00 = str;
            }
            str2 = c3209C3k.A00;
        }
        return str2;
    }

    public static AbstractC3211C3m A00(File file) {
        ApplicationInfo applicationInfoA01 = ETi.A01();
        if (AbstractC3212C3n.A00(file) != null) {
            String absolutePath = file.getAbsolutePath();
            if (absolutePath.contains(FGI.A0U(CustomConnectorRegisterRepositoryKt.ROOT_PATH, ((PackageItemInfo) applicationInfoA01).packageName, CustomConnectorRegisterRepositoryKt.ROOT_PATH)) || absolutePath.contains(FGI.A0U(CustomConnectorRegisterRepositoryKt.ROOT_PATH, ((PackageItemInfo) applicationInfoA01).packageName, "-"))) {
                String strA00 = AbstractC3212C3n.A00(file);
                if (strA00 != null) {
                    return new C3209C3k(strA00, file.getCanonicalPath());
                }
                throw BV4.A0a(AnonymousClass007.A0a("getSplitName returned null for application split: ", file));
            }
        }
        return new C3r(file);
    }

    public InputStream A01(String str, String str2) {
        ZipFile zipFile = new ZipFile(A02());
        String strA0d = FGI.A0d("lib/", str, CustomConnectorRegisterRepositoryKt.ROOT_PATH, str2);
        ZipEntry entry = zipFile.getEntry(strA0d);
        if (entry == null) {
            zipFile.close();
            throw new FileNotFoundException(FGI.A0d("Entry not found: ", strA0d, " in ", A02()));
        }
        InputStream inputStream = zipFile.getInputStream(entry);
        if (inputStream != null) {
            return new C3o(inputStream, zipFile);
        }
        zipFile.close();
        throw BV4.A0K(FGI.A0d("Failed to open entry: ", strA0d, " in ", A02()));
    }
}
