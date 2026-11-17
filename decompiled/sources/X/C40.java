package X;

import android.content.Context;
import com.facebook.common.dextricks.ResProvider;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes5.dex */
public final class C40 extends ResProvider {
    public final Context A00;
    public final String A01;
    public final List<String> A02;
    public final ZipFile A03;

    @Override // com.facebook.common.dextricks.ResProvider
    public final InputStream open(String str) throws IOException {
        InputStream inputStream;
        C7384Etj.A0Y(str, 0);
        String str2 = this.A01;
        ZipFile zipFile = this.A03;
        if (zipFile != null) {
            Iterator<String> it = this.A02.iterator();
            while (it.hasNext()) {
                ZipEntry entry = zipFile.getEntry(FGI.A0M(AnonymousClass005.A0j(it), str));
                if (entry != null && (inputStream = zipFile.getInputStream(entry)) != null) {
                    return inputStream;
                }
            }
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                if (zipEntryNextElement != null) {
                    String name = zipEntryNextElement.getName();
                    C7384Etj.A0U(name);
                    if (name.endsWith(str)) {
                        CFK.A0H("VoltronResProvider", "found %s at %s", str, zipEntryNextElement.getName());
                        InputStream inputStream2 = zipFile.getInputStream(zipEntryNextElement);
                        if (inputStream2 != null) {
                            return inputStream2;
                        }
                    } else {
                        continue;
                    }
                }
            }
        } else {
            try {
                InputStream inputStreamOpen = this.A00.getAssets().open(FGI.A0U(str2, File.separator, str));
                C7384Etj.A0U(inputStreamOpen);
                return inputStreamOpen;
            } catch (IOException unused) {
            }
        }
        throw new FileNotFoundException(FGI.A0M("unable to find ", str));
    }

    @Override // com.facebook.common.dextricks.ResProvider, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ZipFile zipFile = this.A03;
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException e) {
                CFK.A0E("VoltronResProvider", "failed to close module zip file for module %s", e, this.A01);
            }
        }
    }

    public C40(Context context, File file, String str) {
        this.A00 = context;
        this.A01 = str;
        this.A03 = file != null ? new ZipFile(file) : null;
        String str2 = File.separator;
        this.A02 = Collections.singletonList(FGI.A0d("assets", str2, str, str2));
    }
}
