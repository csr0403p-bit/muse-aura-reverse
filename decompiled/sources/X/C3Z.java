package X;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes5.dex */
public final class C3Z extends C2x {
    public C3202C3c[] A00;
    public final ZipFile A01;
    public final AbstractC3198C2y A02;
    public final /* synthetic */ C3Y A03;

    public C3Z(C3Y c3y, AbstractC3198C2y abstractC3198C2y) {
        this.A03 = c3y;
        this.A01 = new ZipFile(c3y.A00);
        this.A02 = abstractC3198C2y;
    }

    public final void A02(File file, boolean z) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        C3202C3c[] c3202C3cArrA03 = this.A00;
        if (c3202C3cArrA03 == null) {
            c3202C3cArrA03 = A03();
            this.A00 = c3202C3cArrA03;
        }
        byte[] bArr = new byte[32768];
        for (C3202C3c c3202C3c : c3202C3cArrA03) {
            if (z) {
                File fileA0O = C3cG.A0O(file, ((C30) c3202C3c).A01);
                long length = fileA0O.length();
                ZipEntry zipEntry = c3202C3c.A01;
                if (length == zipEntry.getSize()) {
                    CRC32 crc32 = new CRC32();
                    try {
                        FileInputStream fileInputStreamA0H = BV4.A0H(fileA0O);
                        while (true) {
                            try {
                                int i = fileInputStreamA0H.read(bArr);
                                if (i == -1) {
                                    break;
                                } else {
                                    crc32.update(bArr, 0, i);
                                }
                            } catch (Throwable th) {
                                try {
                                    fileInputStreamA0H.close();
                                } catch (Throwable th2) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                }
                                throw th;
                            }
                        }
                        fileInputStreamA0H.close();
                        if (crc32.getValue() == zipEntry.getCrc()) {
                            String strA0M = FGI.A0M("keeping extracted DSO ", ((C30) c3202C3c).A01);
                            if (Log.isLoggable("soloader.ExtractFromZipSoSource", 4)) {
                                Log.i("soloader.ExtractFromZipSoSource", strA0M);
                            }
                        }
                    } catch (IOException e) {
                        Log.w("soloader.ExtractFromZipSoSource", AnonymousClass007.A0a("Failed to verify extracted DSO ", fileA0O), e);
                    }
                }
                if (fileA0O.exists()) {
                    C2D.A03(fileA0O);
                }
                InputStream inputStream = this.A01.getInputStream(c3202C3c.A01);
                try {
                    C2x.A00(c3202C3c, file, inputStream, bArr);
                    inputStream.close();
                } finally {
                }
            } else {
                InputStream inputStream2 = this.A01.getInputStream(c3202C3c.A01);
                C2x.A00(c3202C3c, file, inputStream2, bArr);
                inputStream2.close();
            }
        }
    }

    public final C3202C3c[] A03() {
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        HashMap mapA0u = BV4.A0u();
        Pattern patternCompile = Pattern.compile(this.A03.A01);
        String[] strArrA03 = AbstractC3181C1l.A03();
        Enumeration<? extends ZipEntry> enumerationEntries = this.A01.entries();
        while (enumerationEntries.hasMoreElements()) {
            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
            Matcher matcher = patternCompile.matcher(zipEntryNextElement.getName());
            if (matcher.matches()) {
                int iGroupCount = matcher.groupCount();
                String strGroup = matcher.group(iGroupCount - 1);
                String strGroup2 = matcher.group(iGroupCount);
                int i = 0;
                while (true) {
                    if (i >= strArrA03.length) {
                        break;
                    }
                    String str = strArrA03[i];
                    if (str == null || !strGroup.equals(str)) {
                        i++;
                    } else if (i >= 0) {
                        linkedHashSetA0k.add(strGroup);
                        C3202C3c c3202C3c = (C3202C3c) mapA0u.get(strGroup2);
                        if (c3202C3c == null || i < c3202C3c.A00) {
                            mapA0u.put(strGroup2, new C3202C3c(strGroup2, zipEntryNextElement, i));
                        }
                    }
                }
            }
        }
        this.A02.A00 = BV5.A1b(linkedHashSetA0k, linkedHashSetA0k.size());
        C3202C3c[] c3202C3cArr = (C3202C3c[]) mapA0u.values().toArray(new C3202C3c[mapA0u.size()]);
        Arrays.sort(c3202C3cArr);
        return c3202C3cArr;
    }
}
