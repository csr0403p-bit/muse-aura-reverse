package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.io.FileAlreadyExistsException;
import kotlin.io.FileSystemException;
import kotlin.io.NoSuchFileException;

/* loaded from: classes5.dex */
public abstract class CEV extends AbstractC2968BqN {
    public static final String A01(File file) {
        C7384Etj.A0Y(file, 0);
        String name = file.getName();
        C7384Etj.A0U(name);
        return C7BY.A0R(name, "", '.');
    }

    public static final void A02(File file, File file2) throws IOException {
        C7384Etj.A0Y(file, 0);
        if (!file.exists()) {
            throw new NoSuchFileException(file, null, "The source file doesn't exist.");
        }
        if (file2.exists() && !file2.delete()) {
            throw new FileAlreadyExistsException(file, file2, "Tried to overwrite the destination, but failed to delete it.");
        }
        if (file.isDirectory()) {
            if (!file2.mkdirs()) {
                throw new FileSystemException(file, file2, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStreamA0H = BV4.A0H(file);
        try {
            FileOutputStream fileOutputStreamA0I = BV4.A0I(file2);
            try {
                F0H.A00(fileInputStreamA0H, fileOutputStreamA0I);
                fileOutputStreamA0I.close();
                fileInputStreamA0H.close();
            } finally {
            }
        } finally {
        }
    }

    public static final boolean A03(File file) {
        C7384Etj.A0Y(file, 0);
        CEZ cez = new CEZ(new CEW(file));
        while (true) {
            boolean z = true;
            while (cez.hasNext()) {
                File next = cez.next();
                if (!next.delete() && next.exists()) {
                    z = false;
                } else {
                    if (z) {
                        break;
                    }
                    z = false;
                }
            }
            return z;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r0 > 0) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.File A00(java.io.File r6, java.lang.String r7) {
        /*
            java.io.File r3 = X.BV4.A0G(r7)
            r0 = 0
            java.lang.String r5 = r3.getPath()
            X.C7384Etj.A0U(r5)
            char r2 = java.io.File.separatorChar
            int r4 = X.C7BY.A08(r5, r2, r0)
            r1 = 1
            if (r4 != 0) goto L35
            int r0 = r5.length()
            if (r0 <= r1) goto L34
            char r0 = r5.charAt(r1)
            if (r0 != r2) goto L34
            r0 = 2
            int r0 = X.C7BY.A08(r5, r2, r0)
            if (r0 < 0) goto L34
            int r0 = r0 + 1
            int r0 = X.C7BY.A08(r5, r2, r0)
            if (r0 < 0) goto L34
            int r0 = r0 + 1
        L32:
            if (r0 <= 0) goto L52
        L34:
            return r3
        L35:
            r1 = 58
            if (r4 <= 0) goto L44
            int r0 = r4 + (-1)
            char r0 = r5.charAt(r0)
            if (r0 != r1) goto L52
            int r0 = r4 + 1
            goto L32
        L44:
            r0 = -1
            if (r4 != r0) goto L52
            boolean r0 = X.C7BY.A0l(r5, r1)
            if (r0 == 0) goto L52
            int r0 = r5.length()
            goto L32
        L52:
            java.lang.String r1 = X.C60O.A0o(r6)
            int r0 = r1.length()
            if (r0 == 0) goto L72
            boolean r0 = X.C7BY.A0l(r1, r2)
            if (r0 != 0) goto L72
            java.lang.StringBuilder r0 = X.C3cG.A0g(r1)
            r0.append(r2)
        L69:
            java.lang.String r0 = X.C8j3.A14(r3, r0)
            java.io.File r3 = X.BV4.A0G(r0)
            return r3
        L72:
            java.lang.StringBuilder r0 = X.C3cG.A0g(r1)
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CEV.A00(java.io.File, java.lang.String):java.io.File");
    }
}
