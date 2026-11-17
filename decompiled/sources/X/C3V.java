package X;

import android.util.Log;
import com.facebook.soloader.SoLoaderDSONotFoundError;
import com.facebook.soloader.SoLoaderULError;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes5.dex */
public final class C3V implements InterfaceC3204C3e {
    public int A00 = 0;

    @Override // X.InterfaceC3204C3e
    public final boolean AZs(UnsatisfiedLinkError unsatisfiedLinkError, C3g[] c3gArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z;
        if (unsatisfiedLinkError instanceof SoLoaderULError) {
            SoLoaderULError soLoaderULError = (SoLoaderULError) unsatisfiedLinkError;
            String str = soLoaderULError.mSoName;
            String message = soLoaderULError.getMessage();
            if (str == null) {
                Log.e("SoLoader", "No so name provided in ULE, cannot recover");
            } else if (soLoaderULError instanceof SoLoaderDSONotFoundError) {
                if ((this.A00 & 1) != 0) {
                    Log.e("SoLoader", C60P.A1M(", retrying for specific library ", str, C3cG.A0f(soLoaderULError, "Reunpacking BackupSoSources due to ")));
                    try {
                        for (C3g c3g : c3gArr) {
                            if (c3g != null && (c3g instanceof C3X)) {
                                C3X c3x = (C3X) c3g;
                                C3W c3w = new C3W(c3x);
                                try {
                                    C30[] c30ArrA01 = c3w.A01();
                                    int length = c30ArrA01.length;
                                    int i = 0;
                                    while (true) {
                                        if (i >= length) {
                                            z = false;
                                            break;
                                        }
                                        if (c30ArrA01[i].A01.equals(str)) {
                                            Log.e("SoLoader", FGI.A0d("Found ", str, " in ", "BackupSoSource"));
                                            z = true;
                                            break;
                                        }
                                        i++;
                                    }
                                    c3w.close();
                                    if (z) {
                                        Log.e("SoLoader", FGI.A0M("Preparing ", "BackupSoSource"));
                                        c3x.A08(0);
                                        return true;
                                    }
                                } finally {
                                }
                            }
                        }
                        return false;
                    } catch (IOException e) {
                        Log.e("SoLoader", AnonymousClass007.A0a("Failed to run recovery for backup so source due to: ", e));
                        return false;
                    }
                }
            } else if (message != null) {
                if (!message.contains("/app/") && !message.contains("/mnt/")) {
                    return false;
                }
                Log.e("SoLoader", C60P.A1M(", retrying for specific library ", str, C3cG.A0f(soLoaderULError, "Reunpacking BackupSoSources due to ")));
                for (C3g c3g2 : c3gArr) {
                    if (c3g2 != null && (c3g2 instanceof C3X)) {
                        try {
                            Log.e("SoLoader", FGI.A0M("Preparing BackupSoSource for the first time ", "BackupSoSource"));
                            c3g2.A08(0);
                            for (C3g c3g3 : c3gArr) {
                                if (c3g3 != null && (c3g3 instanceof C3H) && !(c3g3 instanceof C3X)) {
                                    ((C3H) c3g3).A00 |= 1;
                                }
                            }
                            return true;
                        } catch (Exception e2) {
                            Log.e("SoLoader", FGI.A0h("Encountered an exception while reunpacking BackupSoSource ", "BackupSoSource", " for library ", str, ": "), e2);
                            return false;
                        }
                    }
                }
                return false;
            }
        }
        return false;
    }
}
