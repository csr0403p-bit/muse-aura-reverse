package X;

import com.facebook.aura.common.prefs.AuraPrefsStorage;
import com.facebook.common.file.FileUtils$CreateDirectoryException;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;

/* renamed from: X.Efj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7083Efj implements InterfaceC7089Efs {
    public final InterfaceC7539F0o A00;
    public final File A01;
    public final File A02;
    public final C7101EgF A03;
    public final boolean A04;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C7083Efj(X.C7101EgF r6, java.io.File r7) throws java.io.IOException {
        /*
            r5 = this;
            r4 = 1
            r0 = 2
            X.C7384Etj.A0Y(r6, r0)
            r5.<init>()
            r5.A01 = r7
            r2 = 0
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L23
            java.lang.String r1 = X.C60O.A0o(r0)     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = r7.getCanonicalPath()     // Catch: java.lang.Throwable -> L23
            X.C7384Etj.A0X(r0)     // Catch: java.lang.Throwable -> L23
            boolean r1 = X.C7BY.A0q(r0, r1, r2)     // Catch: java.lang.Throwable -> L23
            r0 = 1
            if (r1 != 0) goto L24
        L23:
            r0 = 0
        L24:
            r5.A04 = r0
            r0 = 100
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r1 = 3
            java.lang.String r0 = "v2"
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r3, r2}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r0, r1)
            r1 = 0
            java.lang.String r0 = "%s.ols%d.%d"
            java.lang.String r0 = java.lang.String.format(r1, r0, r2)
            java.io.File r0 = X.C3cG.A0O(r7, r0)
            r5.A02 = r0
            r5.A03 = r6
            java.io.File r1 = r5.A01
            boolean r0 = r1.exists()
            if (r0 == 0) goto L5e
            java.io.File r0 = r5.A02
            boolean r0 = r0.exists()
            if (r0 != 0) goto L63
            X.EDB.A00(r1)
        L5e:
            java.io.File r0 = r5.A02     // Catch: com.facebook.common.file.FileUtils$CreateDirectoryException -> L63
            X.Efq.A00(r0)     // Catch: com.facebook.common.file.FileUtils$CreateDirectoryException -> L63
        L63:
            X.C9u r0 = X.C9u.A00
            r5.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7083Efj.<init>(X.EgF, java.io.File):void");
    }

    @Override // X.InterfaceC7089Efs
    public final C7093Efz AJj(Object obj, String str) {
        C7384Etj.A0Y(str, 0);
        File fileA0G = BV4.A0G(FGI.A0d(A00(this, str), File.separator, str, ".cnt"));
        if (!fileA0G.exists()) {
            return null;
        }
        fileA0G.setLastModified(this.A00.now());
        return new C7093Efz(fileA0G);
    }

    @Override // X.InterfaceC7089Efs
    public final C7091Efx ANi(Object obj, String str) throws IOException {
        C7384Etj.A0Y(str, 0);
        File fileA0G = BV4.A0G(A00(this, str));
        if (!fileA0G.exists()) {
            try {
                Efq.A00(fileA0G);
            } catch (FileUtils$CreateDirectoryException | IOException e) {
                throw e;
            }
        }
        File fileCreateTempFile = File.createTempFile(FGI.A0M(str, "."), AuraPrefsStorage.TEMP_FILE_SUFFIX, fileA0G);
        C7384Etj.A0X(fileCreateTempFile);
        return new C7091Efx(this, fileCreateTempFile, str);
    }

    @Override // X.InterfaceC7089Efs
    public final long AaV(C7088Efr c7088Efr) {
        C7384Etj.A0Y(c7088Efr, 0);
        File file = c7088Efr.A02.A00;
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1L;
    }

    @Override // X.InterfaceC7089Efs
    public final long AaW(String str) {
        C7384Etj.A0Y(str, 0);
        File fileA0G = BV4.A0G(FGI.A0d(A00(this, str), File.separator, str, ".cnt"));
        if (!fileA0G.exists()) {
            return 0L;
        }
        long length = fileA0G.length();
        if (fileA0G.delete()) {
            return length;
        }
        return -1L;
    }

    @Override // X.InterfaceC7089Efs
    public final /* bridge */ /* synthetic */ Collection AFF() {
        C7087Efn c7087Efn = new C7087Efn(this);
        A01(c7087Efn, this.A02);
        return Collections.unmodifiableList(c7087Efn.A00);
    }

    @Override // X.InterfaceC7089Efs
    public final void AYi() {
        A01(new C7086Efm(this), this.A01);
    }

    @Override // X.InterfaceC7089Efs
    public final boolean isExternal() {
        return this.A04;
    }

    public static final String A00(C7083Efj c7083Efj, String str) {
        return FGI.A0U(c7083Efj.A02.toString(), File.separator, String.valueOf(Math.abs(str.hashCode() % 100)));
    }

    public static void A01(Eg4 eg4, File file) {
        eg4.AYI(file);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    A01(eg4, file2);
                } else {
                    eg4.AiK(file2);
                }
            }
        }
        eg4.AYG(file);
    }
}
