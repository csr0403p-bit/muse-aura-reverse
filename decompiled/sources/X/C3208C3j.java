package X;

import android.os.StrictMode;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipFile;

/* renamed from: X.C3j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3208C3j extends C3g {
    public Map<String, C3215C3x> A00;
    public final AbstractC3211C3m A01;
    public final String A02;

    public C3208C3j() {
        String strA0M;
        String[] strArr = ETi.A01().splitSourceDirs;
        if (strArr != null) {
            strA0M = FGI.A0M("config.", ETi.A03().replace("-", "_"));
            String strA0U = FGI.A0U("split_", strA0M, ".apk");
            for (String str : strArr) {
                if (str.endsWith(strA0U)) {
                    break;
                }
            }
            strA0M = "base";
        } else {
            strA0M = "base";
        }
        C3209C3k c3209C3k = new C3209C3k(strA0M);
        this.A00 = null;
        this.A02 = "base";
        this.A01 = c3209C3k;
    }

    @Override // X.C3g
    public final int A07(StrictMode.ThreadPolicy threadPolicy, String str, int i) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Map<String, C3215C3x> map = this.A00;
        if (map == null) {
            throw C3cG.A0Q("prepare not called");
        }
        C3215C3x c3215C3x = map.get(str);
        if (c3215C3x == null) {
            return 0;
        }
        if ((c3215C3x.A00 & 1) != 0) {
            ZipFile zipFile = new ZipFile(this.A01.A02());
            try {
                String strA03 = ETi.A03();
                String str2 = c3215C3x.A01;
                C3201C3b c3201C3b = new C3201C3b(zipFile.getEntry(FGI.A0d("lib/", strA03, CustomConnectorRegisterRepositoryKt.ROOT_PATH, str2)), zipFile);
                try {
                    C3J.A01(threadPolicy, c3201C3b, str2, i);
                    c3201C3b.close();
                    zipFile.close();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    zipFile.close();
                    throw th;
                } finally {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th);
                }
            }
        }
        C3I c3i = ETi.A05;
        AbstractC3211C3m abstractC3211C3m = this.A01;
        c3i.APh(FGI.A0U(abstractC3211C3m.A02(), "!/", FGI.A0d("lib/", ETi.A03(), CustomConnectorRegisterRepositoryKt.ROOT_PATH, c3215C3x.A01)), i);
        return 1;
    }

    @Override // X.C3g
    public final void A08(int i) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        String str;
        if (this.A00 == null) {
            String str2 = this.A02;
            str2.getClass();
            InputStream inputStreamA01 = this.A01.A01(ETi.A03(), FGI.A0U("lib", str2, ".soloader-manifest.so"));
            try {
                DataInputStream dataInputStream = new DataInputStream(inputStreamA01);
                byte b = dataInputStream.readByte();
                if (b == 1) {
                    str = "arm64-v8a";
                } else if (b == 2) {
                    str = "armeabi-v7a";
                } else if (b == 3) {
                    str = "x86_64";
                } else {
                    if (b != 4) {
                        throw BV5.A0g("Unrecognized abi id: ", b);
                    }
                    str = "x86";
                }
                int i2 = dataInputStream.readShort() & 65535;
                ArrayList arrayListA0h = C3cG.A0h();
                for (int i3 = 0; i3 < i2; i3++) {
                    byte[] bArr = new byte[dataInputStream.readShort() & 65535];
                    dataInputStream.readFully(bArr);
                    arrayListA0h.add(new C3215C3x(new String(bArr, StandardCharsets.UTF_8), dataInputStream.readByte() & 255));
                }
                List<C3215C3x> listUnmodifiableList = Collections.unmodifiableList(arrayListA0h);
                if (!str.equals(ETi.A03())) {
                    throw C3cG.A0Q(FGI.A0d("DirectSplitSoSource only supports primary abi: ", ETi.A03(), "; manifest abi: ", str));
                }
                this.A00 = BV4.A0u();
                for (C3215C3x c3215C3x : listUnmodifiableList) {
                    this.A00.put(c3215C3x.A01, c3215C3x);
                }
                if (inputStreamA01 != null) {
                    inputStreamA01.close();
                }
            } catch (Throwable th) {
                if (inputStreamA01 != null) {
                    try {
                        inputStreamA01.close();
                        throw th;
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        throw th;
                    }
                }
                throw th;
            }
        }
    }

    public C3208C3j(C3213C3u c3213C3u, AbstractC3211C3m abstractC3211C3m) {
        this.A00 = null;
        this.A02 = null;
        this.A01 = abstractC3211C3m;
        String str = c3213C3u.A00;
        if (str.equals(ETi.A03())) {
            this.A00 = BV4.A0u();
            for (C3215C3x c3215C3x : c3213C3u.A01) {
                this.A00.put(c3215C3x.A01, c3215C3x);
            }
            return;
        }
        throw C3cG.A0Q(FGI.A0d("DirectSplitSoSource only supports primary abi: ", ETi.A03(), "; manifest abi: ", str));
    }
}
