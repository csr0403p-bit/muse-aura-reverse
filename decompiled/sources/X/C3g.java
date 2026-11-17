package X;

import android.os.StrictMode;
import android.text.TextUtils;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipFile;

/* loaded from: classes5.dex */
public abstract class C3g {
    public abstract int A07(StrictMode.ThreadPolicy threadPolicy, String str, int i);

    public File A03(String str) {
        if (!(this instanceof C3208C3j)) {
            if (this instanceof C3205C3f) {
                return ((C3205C3f) this).A00.A03(str);
            }
            return null;
        }
        String strA05 = A05(str);
        if (strA05 != null) {
            return BV4.A0G(strA05);
        }
        return null;
    }

    public String A04() {
        if (this instanceof C2A) {
            return "SystemLoadWrapperSoSource";
        }
        if (this instanceof C3216C3y) {
            return "NoopSoSource";
        }
        if (this instanceof C3208C3j) {
            return BV8.A0u(((C3208C3j) this).A01, C60O.A0x("DirectSplitSoSource["));
        }
        return this instanceof C3200C3a ? "DirectApkSoSource" : "ApplicationSoSource";
    }

    public String A05(String str) {
        String strA0j;
        if (this instanceof C2A) {
            String strA01 = C2D.A01();
            if (TextUtils.isEmpty(strA01)) {
                return null;
            }
            String[] strArrSplit = strA01.split(":");
            int length = strArrSplit.length;
            for (int i = 0; i < length; i++) {
                strA0j = strArrSplit[i];
                if (!AbstractC3181C1l.A01(ETi.A03) || !strA0j.contains(".apk!")) {
                    File file = new File(strA0j, str);
                    if (file.exists()) {
                        return file.getCanonicalPath();
                    }
                }
            }
            return null;
        }
        if (this instanceof C3208C3j) {
            C3208C3j c3208C3j = (C3208C3j) this;
            Map<String, C3215C3x> map = c3208C3j.A00;
            if (map == null) {
                throw C3cG.A0Q("prepare not called");
            }
            C3215C3x c3215C3x = map.get(str);
            if (c3215C3x == null) {
                return null;
            }
            AbstractC3211C3m abstractC3211C3m = c3208C3j.A01;
            return FGI.A0U(abstractC3211C3m.A02(), "!/", FGI.A0d("lib/", ETi.A03(), CustomConnectorRegisterRepositoryKt.ROOT_PATH, c3215C3x.A01));
        }
        if (!(this instanceof C3200C3a)) {
            return null;
        }
        C3200C3a c3200C3a = (C3200C3a) this;
        Iterator<String> it = c3200C3a.A02.iterator();
        while (it.hasNext()) {
            strA0j = AnonymousClass005.A0j(it);
            Set setA10 = BV4.A10(strA0j, c3200C3a.A01);
            if (TextUtils.isEmpty(strA0j) || setA10 == null || !setA10.contains(str)) {
            }
        }
        return null;
        return FGI.A0U(strA0j, File.separator, str);
    }

    public String[] A06(String str) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (!(this instanceof C3208C3j)) {
            return null;
        }
        C3208C3j c3208C3j = (C3208C3j) this;
        Map<String, C3215C3x> map = c3208C3j.A00;
        if (map == null) {
            throw C3cG.A0Q("prepare not called");
        }
        C3215C3x c3215C3x = map.get(str);
        if (c3215C3x == null) {
            return null;
        }
        ZipFile zipFile = new ZipFile(c3208C3j.A01.A02());
        try {
            String strA03 = ETi.A03();
            String str2 = c3215C3x.A01;
            C3201C3b c3201C3b = new C3201C3b(zipFile.getEntry(FGI.A0d("lib/", strA03, CustomConnectorRegisterRepositoryKt.ROOT_PATH, str2)), zipFile);
            try {
                String[] strArrA04 = C3J.A04(c3201C3b, str2);
                c3201C3b.close();
                zipFile.close();
                return strArrA04;
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

    public void A08(int i) {
    }

    public String toString() {
        return A04();
    }
}
