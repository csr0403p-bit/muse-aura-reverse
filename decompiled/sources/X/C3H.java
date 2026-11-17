package X;

import android.os.StrictMode;
import com.facebook.soloader.SoLoaderULErrorFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes5.dex */
public class C3H extends C3g {
    public int A00;
    public final File A01;

    @Override // X.C3g
    public final File A03(String str) {
        File file = new File(this.A01, str);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    @Override // X.C3g
    public String A04() {
        return "DirectorySoSource";
    }

    @Override // X.C3g
    public int A07(StrictMode.ThreadPolicy threadPolicy, String str, int i) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        File file = this.A01;
        if (ETi.A05 == null) {
            throw C3cG.A0Q("SoLoader.init() not yet called");
        }
        File fileA03 = A03(str);
        if (fileA03 == null) {
            C35.A01("SoLoader", FGI.A0U(str, " file not found on ", file.getCanonicalPath()));
            return 0;
        }
        String canonicalPath = fileA03.getCanonicalPath();
        C35.A00(FGI.A0U(str, " file found at ", canonicalPath));
        if ((i & 1) != 0 && (this.A00 & 2) != 0) {
            C35.A00(FGI.A0M(str, " loaded implicitly"));
            return 2;
        }
        if ((this.A00 & 1) != 0) {
            C34 c34 = new C34();
            c34.A00 = fileA03;
            FileInputStream fileInputStreamA0H = BV4.A0H(fileA03);
            c34.A01 = fileInputStreamA0H;
            c34.A02 = fileInputStreamA0H.getChannel();
            try {
                C3J.A01(threadPolicy, c34, str, i);
                c34.close();
            } catch (Throwable th) {
                try {
                    c34.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
        } else {
            C35.A00(FGI.A0M("Not resolving dependencies for ", str));
        }
        try {
            ETi.A05.APh(canonicalPath, i);
            return 1;
        } catch (UnsatisfiedLinkError e) {
            throw SoLoaderULErrorFactory.create(str, e);
        }
    }

    @Override // X.C3g
    public String toString() {
        String name;
        try {
            name = String.valueOf(this.A01.getCanonicalPath());
        } catch (IOException unused) {
            name = this.A01.getName();
        }
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(A04());
        sbA0w.append("[root = ");
        sbA0w.append(name);
        sbA0w.append(" flags = ");
        sbA0w.append(this.A00);
        return BV5.A0o(sbA0w);
    }

    public C3H(File file, int i) {
        this.A01 = file;
        this.A00 = i;
    }

    @Override // X.C3g
    public final String A05(String str) {
        File fileA03 = A03(str);
        if (fileA03 == null) {
            return null;
        }
        return fileA03.getCanonicalPath();
    }

    @Override // X.C3g
    public final String[] A06(String str) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        File fileA03 = A03(str);
        if (fileA03 == null) {
            return null;
        }
        C34 c34 = new C34();
        c34.A00 = fileA03;
        FileInputStream fileInputStreamA0H = BV4.A0H(fileA03);
        c34.A01 = fileInputStreamA0H;
        c34.A02 = fileInputStreamA0H.getChannel();
        try {
            String[] strArrA04 = C3J.A04(c34, str);
            c34.close();
            return strArrA04;
        } catch (Throwable th) {
            try {
                c34.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }
}
