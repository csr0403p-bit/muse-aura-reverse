package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class C3X extends AbstractC3198C2y implements C3F {
    public boolean A00;
    public final ArrayList<C3Y> A01;

    @Override // X.C3H, X.C3g
    public final String A04() {
        return "BackupSoSource";
    }

    @Override // X.C3H, X.C3g
    public final int A07(StrictMode.ThreadPolicy threadPolicy, String str, int i) {
        if (this.A00) {
            return super.A07(threadPolicy, str, i);
        }
        return 0;
    }

    @Override // X.AbstractC3198C2y, X.C3g
    public final void A08(int i) throws IOException {
        if ((i & 8) == 0) {
            super.A08(i);
            this.A00 = true;
        }
    }

    @Override // X.C3F
    public final C3g AZr(ApplicationInfo applicationInfo) {
        C3X c3x = new C3X(((AbstractC3198C2y) this).A01, applicationInfo, ((C3H) this).A01, true, false);
        try {
            c3x.A08(0);
            return c3x;
        } catch (IOException e) {
            throw BV4.A0e(e);
        }
    }

    public C3X(Context context, ApplicationInfo applicationInfo, File file, boolean z, boolean z2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super(context, file, z, z2);
        ArrayList<C3Y> arrayListA0h = C3cG.A0h();
        this.A01 = arrayListA0h;
        this.A00 = false;
        arrayListA0h.add(new C3Y(context, file, BV4.A0G(applicationInfo.sourceDir), "^lib/([^/]+)/([^/]+\\.so)$"));
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            try {
                for (String str : strArr) {
                    C3Y c3y = new C3Y(context, file, new File(str), "^lib/([^/]+)/([^/]+\\.so)$");
                    C3Z c3z = new C3Z(c3y, c3y);
                    try {
                        boolean z3 = c3z.A03().length != 0;
                        c3z.close();
                        if (z3) {
                            Log.w("BackupSoSource", FGI.A0M("adding backup source from split: ", c3y.toString()));
                            this.A01.add(c3y);
                        }
                    } catch (Throwable th) {
                        try {
                            c3z.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                        throw th;
                    }
                }
            } catch (IOException e) {
                Log.w("BackupSoSource", "failed to read split apks", e);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.File] */
    @Override // X.C3H, X.C3g
    public final String toString() throws IOException {
        String name;
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append("BackupSoSource");
        sbA0w.append("[root = ");
        ?? canonicalPath = ((C3H) this).A01;
        try {
            canonicalPath = canonicalPath.getCanonicalPath();
            name = canonicalPath;
        } catch (IOException unused) {
            name = canonicalPath.getName();
        }
        sbA0w.append(name);
        sbA0w.append(" flags = ");
        sbA0w.append(((C3H) this).A00);
        sbA0w.append(" apks = ");
        BV4.A1O(sbA0w, this.A01);
        return AnonymousClass001.A0v("]", sbA0w);
    }
}
