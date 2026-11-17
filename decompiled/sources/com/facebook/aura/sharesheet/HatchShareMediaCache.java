package com.facebook.aura.sharesheet;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BFI;
import X.C06H;
import X.C0881AGi;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;
import X.CEV;
import X.F0H;
import X.FGI;
import X.G0U;
import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchShareMediaCache {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final String DIRECTORY_NAME = "shared";
    public static final String KEY_PREFIX = "share-media-";
    public static final long MAX_AGE_MS = 86400000;
    public static final long MAX_BYTES = 67108864;
    public static final long MIN_RETENTION_MS = 3600000;
    public static final long PARTIAL_FILE_MAX_AGE_MS = 3600000;
    public static final long TARGET_BYTES = 50331648;
    public final File directory;

    /* renamed from: com.facebook.aura.sharesheet.HatchShareMediaCache$store$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<OutputStream, Unit> {
        public final /* synthetic */ InputStream $input;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(OutputStream outputStream) throws IOException {
            C7384Etj.A0Y(outputStream, 0);
            F0H.A00(this.$input, outputStream);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InputStream inputStream) {
            super(1);
            this.$input = inputStream;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(OutputStream outputStream) throws IOException {
            invoke2(outputStream);
            return Unit.INSTANCE;
        }
    }

    public HatchShareMediaCache(Context context) {
        C7384Etj.A0Y(context, 0);
        File fileA0O = C3cG.A0O(context.getCacheDir(), "shared");
        fileA0O.mkdirs();
        this.directory = fileA0O;
        prune();
    }

    public final File find(String str) {
        C7384Etj.A0Y(str, 0);
        File[] fileArrListFiles = this.directory.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.isFile()) {
                    String name = file.getName();
                    C7384Etj.A0U(name);
                    if (name.startsWith(FGI.A0M(str, ".")) && file.length() > 0) {
                        touch(file);
                        return file;
                    }
                }
            }
        }
        return null;
    }

    public final File findNamed(String str) {
        C7384Etj.A0Y(str, 0);
        File fileA0O = C3cG.A0O(this.directory, str);
        if (!fileA0O.isFile() || fileA0O.length() <= 0) {
            return null;
        }
        touch(fileA0O);
        return fileA0O;
    }

    public final File newPendingFile(String str) {
        C7384Etj.A0Y(str, 0);
        File file = this.directory;
        UUID uuidRandomUUID = UUID.randomUUID();
        StringBuilder sbA0g = C3cG.A0g(str);
        sbA0g.append("-");
        sbA0g.append(uuidRandomUUID);
        return C3cG.A0O(file, AnonymousClass001.A0v(".download", sbA0g));
    }

    public final class Companion {
        public final String keyFor(String str) {
            C7384Etj.A0Y(str, 0);
            byte[] bArrA1T = C3cH.A1T(str);
            C7384Etj.A0X(bArrA1T);
            return FGI.A0M(HatchShareMediaCache.KEY_PREFIX, BFI.A0C("", HatchShareMediaCache$Companion$keyFor$1.INSTANCE, bArrA1T));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.AGi] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.AGi] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    private final void prune() {
        ?? A0h;
        ?? A0h2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        File[] fileArrListFiles = this.directory.listFiles();
        if (fileArrListFiles != null) {
            A0h = C3cG.A0h();
            for (File file : fileArrListFiles) {
                if (file.isFile()) {
                    A0h.add(file);
                }
            }
        } else {
            A0h = C0881AGi.A00;
        }
        for (File file2 : A0h) {
            long jLastModified = jCurrentTimeMillis - file2.lastModified();
            if (jLastModified < 86400000) {
                String name = file2.getName();
                C7384Etj.A0U(name);
                if (!name.endsWith(".download") || jLastModified < 3600000) {
                }
            }
            file2.delete();
        }
        File[] fileArrListFiles2 = this.directory.listFiles();
        if (fileArrListFiles2 != null) {
            A0h2 = C3cG.A0h();
            for (File file3 : fileArrListFiles2) {
                if (file3.isFile()) {
                    A0h2.add(file3);
                }
            }
        } else {
            A0h2 = C0881AGi.A00;
        }
        Iterator it = A0h2.iterator();
        long length = 0;
        while (it.hasNext()) {
            length += ((File) it.next()).length();
        }
        if (length > 67108864) {
            ArrayList arrayListA0h = C3cG.A0h();
            for (Object obj : A0h2) {
                if (jCurrentTimeMillis - ((File) obj).lastModified() >= 3600000) {
                    arrayListA0h.add(obj);
                }
            }
            for (File file4 : AbstractC0878AGe.A0c(arrayListA0h, new Comparator() { // from class: com.facebook.aura.sharesheet.HatchShareMediaCache$prune$$inlined$sortedBy$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return C3cJ.A04(t, t2);
                }
            })) {
                if (length > 50331648) {
                    long length2 = file4.length();
                    if (file4.delete()) {
                        length -= length2;
                    }
                }
            }
        }
    }

    private final void touch(File file) {
        file.setLastModified(System.currentTimeMillis());
    }

    public final File commit(File file, String str, String str2) throws IOException {
        AnonymousClass005.A0x(file, str, str2);
        File fileA0O = C3cG.A0O(this.directory, FGI.A0U(str, ".", str2));
        if (fileA0O.isFile() && fileA0O.length() > 0) {
            file.delete();
        } else if (!file.renameTo(fileA0O)) {
            CEV.A02(file, fileA0O);
            file.delete();
        }
        touch(fileA0O);
        return fileA0O;
    }

    public final File store(String str, String str2, InputStream inputStream) throws Exception {
        AnonymousClass005.A0x(str, str2, inputStream);
        File fileA0O = C3cG.A0O(this.directory, FGI.A0U(str, ".", str2));
        store(fileA0O, new AnonymousClass1(inputStream));
        return fileA0O;
    }

    public final File storeNamed(String str, G0U<? super OutputStream, Unit> g0u) throws Exception {
        AnonymousClass003.A0u(str, g0u);
        File fileA0O = C3cG.A0O(this.directory, str);
        store(fileA0O, g0u);
        return fileA0O;
    }

    private final File store(File file, G0U<? super OutputStream, Unit> g0u) throws Exception {
        File file2 = this.directory;
        String name = file.getName();
        UUID uuidRandomUUID = UUID.randomUUID();
        StringBuilder sbA0g = C3cG.A0g(name);
        sbA0g.append("-");
        sbA0g.append(uuidRandomUUID);
        File fileA0O = C3cG.A0O(file2, AnonymousClass001.A0v(".download", sbA0g));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileA0O);
            try {
                g0u.invoke(fileOutputStream);
                fileOutputStream.close();
                if (file.isFile() && file.length() > 0) {
                    fileA0O.delete();
                } else if (!fileA0O.renameTo(file)) {
                    CEV.A02(fileA0O, file);
                    fileA0O.delete();
                }
                touch(file);
                return file;
            } finally {
            }
        } catch (Exception e) {
            fileA0O.delete();
            throw e;
        }
    }
}
