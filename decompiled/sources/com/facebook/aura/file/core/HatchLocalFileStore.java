package com.facebook.aura.file.core;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;
import X.CEV;
import X.CFP;
import X.DCl;
import android.content.Context;
import java.io.File;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class HatchLocalFileStore {
    public static final HatchLocalFileStore INSTANCE = new HatchLocalFileStore();

    public final AtomicFileWriter openWriter(File file) {
        C7384Etj.A0Y(file, 0);
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        return new AtomicFileWriter(file, C3cJ.A0A(file, file.getParentFile()));
    }

    public final byte[] readBytes(File file) {
        C7384Etj.A0Y(file, 0);
        if (file.exists()) {
            return CFP.A07(file);
        }
        return null;
    }

    public final String readText(File file) {
        C7384Etj.A0Y(file, 0);
        if (file.exists()) {
            return CFP.A04(file, DCl.A05);
        }
        return null;
    }

    public final File cacheSubDir(Context context, String str) {
        AnonymousClass003.A0u(context, str);
        File fileA0O = C3cG.A0O(context.getCacheDir(), str);
        fileA0O.mkdirs();
        return fileA0O;
    }

    public final File filesSubDir(Context context, String str) {
        AnonymousClass003.A0u(context, str);
        File fileA0O = C3cG.A0O(context.getFilesDir(), str);
        fileA0O.mkdirs();
        return fileA0O;
    }

    public final File newCacheTempFile(Context context, String str, String str2, String str3) {
        AnonymousClass005.A14(context, str, str2, str3);
        File fileCacheSubDir = cacheSubDir(context, str);
        UUID uuidRandomUUID = UUID.randomUUID();
        StringBuilder sbA0g = C3cG.A0g(str2);
        sbA0g.append(uuidRandomUUID);
        return C3cG.A0O(fileCacheSubDir, AnonymousClass001.A0v(str3, sbA0g));
    }

    public final void writeBytes(File file, byte[] bArr) {
        AnonymousClass003.A0u(file, bArr);
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        File fileA0A = C3cJ.A0A(file, file.getParentFile());
        try {
            CFP.A06(fileA0A, bArr);
            if (!fileA0A.renameTo(file)) {
                CEV.A02(fileA0A, file);
            }
        } finally {
            fileA0A.delete();
        }
    }

    public final void writeText(File file, String str) {
        AnonymousClass003.A0u(file, str);
        writeBytes(file, C3cG.A1S(str));
    }
}
