package X;

import com.facebook.common.dextricks.Experiments;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

/* renamed from: X.Bzb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3145Bzb {
    public static final Map<String, Integer> A00 = BV5.A14();

    /* JADX WARN: Finally extract failed */
    public static int A00(C3146Bzc c3146Bzc, String str) {
        boolean zExists;
        FileInputStream fileInputStreamOpenFileInput;
        DataInputStream dataInputStream;
        int i = 0;
        Map<String, Integer> map = A00;
        Number numberA0b = BV4.A0b(str, map);
        if (numberA0b != null) {
            return numberA0b.intValue();
        }
        try {
            zExists = A01(c3146Bzc, str).exists();
            try {
            } catch (Throwable th) {
                if (!zExists) {
                    try {
                        c3146Bzc.A00.deleteFile(str);
                    } catch (SecurityException e) {
                        BzX.A00("GkBootstrap", "Failed to delete legacy GK file", e);
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            BzX.A00("GkBootstrap", "Failed to read GK value from file", e2);
        }
        try {
            if (!zExists) {
                if (BV5.A1R(c3146Bzc.A00.getFilesDir(), str)) {
                    fileInputStreamOpenFileInput = c3146Bzc.A00.openFileInput(str);
                }
                BV4.A1H(str, map, i);
                return i;
            }
            fileInputStreamOpenFileInput = BV4.A0H(A01(c3146Bzc, str));
            int i2 = dataInputStream.readInt();
            if (!zExists) {
                A03(c3146Bzc, str, i2);
            }
            dataInputStream.close();
            if (!zExists) {
                try {
                    c3146Bzc.A00.deleteFile(str);
                } catch (SecurityException e3) {
                    BzX.A00("GkBootstrap", "Failed to delete legacy GK file", e3);
                }
            }
            i = i2;
            BV4.A1H(str, map, i);
            return i;
        } finally {
        }
        dataInputStream = new DataInputStream(fileInputStreamOpenFileInput);
    }

    public static File A01(C3146Bzc c3146Bzc, String str) {
        return C3cG.A0O(C3cG.A0O(c3146Bzc.A00.getFilesDir(), "GkBootstrap"), str);
    }

    @Deprecated
    public static void A02(C3146Bzc c3146Bzc) {
        File fileA01 = A01(c3146Bzc, Experiments.STARTUP_JIT_SUSPEND).exists() ? A01(c3146Bzc, Experiments.STARTUP_JIT_SUSPEND) : C3cG.A0O(c3146Bzc.A00.getFilesDir(), Experiments.STARTUP_JIT_SUSPEND);
        try {
        } catch (SecurityException e) {
            BzX.A00("GkBootstrap", "Security exception while deleting GK file", e);
        }
        if (fileA01.delete()) {
            return;
        }
        if (fileA01.exists()) {
            CFK.A0H("GkBootstrap", "Unable to clean up GK file %s", Experiments.STARTUP_JIT_SUSPEND);
        }
    }

    public static void A03(C3146Bzc c3146Bzc, String str, int i) {
        if (c3146Bzc != null) {
            try {
                File fileA0O = C3cG.A0O(c3146Bzc.A00.getFilesDir(), "GkBootstrap");
                if (!fileA0O.exists()) {
                    if (!fileA0O.mkdir()) {
                        return;
                    }
                }
                File fileA01 = A01(c3146Bzc, str);
                try {
                    DataOutputStream dataOutputStream = new DataOutputStream(BV4.A0I(fileA01));
                    try {
                        dataOutputStream.writeInt(i);
                        dataOutputStream.close();
                    } catch (Throwable th) {
                        try {
                            dataOutputStream.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                        throw th;
                    }
                } catch (IOException | SecurityException e) {
                    CFK.A0D("GkBootstrap", "Unable to persist GK value to %s", e, fileA01);
                }
            } catch (SecurityException e2) {
                CFK.A0C("GkBootstrap", "Unable to create %s directory", e2, "GkBootstrap");
            }
        }
    }
}
