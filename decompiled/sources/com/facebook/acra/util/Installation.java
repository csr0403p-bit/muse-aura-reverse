package com.facebook.acra.util;

import X.AnonymousClass002;
import X.BV4;
import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes5.dex */
public class Installation {
    public static final String INSTALLATION = "ACRA-INSTALLATION";
    public static String sID;

    public static synchronized String id(Context context) {
        String installationFile;
        installationFile = sID;
        if (installationFile == null) {
            File filesDir = context.getFilesDir();
            if (filesDir == null) {
                installationFile = "n/a";
            } else {
                File file = new File(filesDir.getParent(), INSTALLATION);
                try {
                    if (!file.exists()) {
                        writeInstallationFile(file);
                    }
                    installationFile = readInstallationFile(file);
                    sID = installationFile;
                } catch (Exception unused) {
                    installationFile = "n/a";
                }
            }
        }
        return installationFile;
    }

    public static String readInstallationFile(File file) throws IOException {
        RandomAccessFile randomAccessFileA0L = BV4.A0L(file);
        try {
            byte[] bArr = new byte[(int) randomAccessFileA0L.length()];
            randomAccessFileA0L.readFully(bArr);
            return new String(bArr);
        } finally {
            randomAccessFileA0L.close();
        }
    }

    public static void writeInstallationFile(File file) throws IOException {
        FileOutputStream fileOutputStreamA0I = BV4.A0I(file);
        try {
            fileOutputStreamA0I.write(AnonymousClass002.A0k().getBytes());
        } finally {
            fileOutputStreamA0I.close();
        }
    }
}
