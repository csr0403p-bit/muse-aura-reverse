package com.facebook.acra.util;

import X.BV4;
import X.BV5;
import X.BzX;
import X.C60P;
import android.util.Base64;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes5.dex */
public class AttachmentUtil {
    public static final String TAG = "AttachmentUtil";

    public static File[] sortPruneOldFiles(File[] fileArr, int i) {
        int length = fileArr.length;
        if (length != 0) {
            final HashMap mapA0u = BV4.A0u();
            int i2 = 0;
            do {
                File file = fileArr[i2];
                BV4.A1F(file, mapA0u, file.lastModified());
                i2++;
            } while (i2 < length);
            Arrays.sort(fileArr, new Comparator<File>() { // from class: com.facebook.acra.util.AttachmentUtil.1
                @Override // java.util.Comparator
                public int compare(File file2, File file3) {
                    Number numberA0b = BV4.A0b(file2, mapA0u);
                    return (C60P.A01(BV4.A0b(file3, mapA0u)) > (numberA0b != null ? numberA0b.longValue() : 0L) ? 1 : (C60P.A01(BV4.A0b(file3, mapA0u)) == (numberA0b != null ? numberA0b.longValue() : 0L) ? 0 : -1));
                }
            });
            if (length > i) {
                while (i < length) {
                    fileArr[i].delete();
                    fileArr[i] = null;
                    i++;
                }
            }
        }
        return fileArr;
    }

    public static boolean validateGzip(File file) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        try {
            FileInputStream fileInputStreamA0H = BV4.A0H(file);
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(fileInputStreamA0H);
                try {
                    BufferedReader bufferedReaderA0J = BV5.A0J(gZIPInputStream);
                    while (bufferedReaderA0J.ready()) {
                        try {
                            bufferedReaderA0J.readLine();
                        } finally {
                        }
                    }
                    bufferedReaderA0J.close();
                    gZIPInputStream.close();
                    fileInputStreamA0H.close();
                    return true;
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            BzX.A00(TAG, "Failed to validate gzip file", e);
            return false;
        }
    }

    public static String loadAttachment(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i - i2;
            if (i4 > 0) {
                i3 = inputStream.read(bArr, i2, i4);
                if (i3 == -1) {
                    break;
                }
                i2 += i3;
            } else if (i3 == 0) {
                return "";
            }
        }
        return compressToBase64String(bArr);
    }

    public static String compressToBase64String(byte[] bArr) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        ByteArrayOutputStream byteArrayOutputStreamA0F = BV4.A0F();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStreamA0F);
        try {
            gZIPOutputStream.write(bArr, 0, bArr.length);
            gZIPOutputStream.finish();
            String strEncodeToString = Base64.encodeToString(byteArrayOutputStreamA0F.toByteArray(), 0);
            gZIPOutputStream.close();
            return strEncodeToString;
        } catch (Throwable th) {
            try {
                gZIPOutputStream.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    public static File[] sortPruneOldFiles(File file, int i) {
        File[] fileArrListFiles = file.listFiles();
        sortPruneOldFiles(fileArrListFiles, i);
        return fileArrListFiles;
    }
}
