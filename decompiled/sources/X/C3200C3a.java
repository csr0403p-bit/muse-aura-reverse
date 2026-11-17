package X;

import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: X.C3a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3200C3a extends C3g implements C3F {
    public final Set<String> A02;
    public final Map<String, Set<String>> A01 = BV4.A0u();
    public final Map<String, Set<String>> A00 = BV4.A0u();

    private void A01() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        int iIndexOf;
        int i;
        Iterator<String> it = this.A02.iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            String strSubstring = (TextUtils.isEmpty(strA0j) || (iIndexOf = strA0j.indexOf(33)) < 0 || (i = iIndexOf + 2) >= strA0j.length()) ? null : strA0j.substring(i);
            if (!TextUtils.isEmpty(strSubstring)) {
                ZipFile zipFile = new ZipFile(BV4.A0j(strA0j, strA0j.indexOf(33)));
                try {
                    Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                    while (enumerationEntries.hasMoreElements()) {
                        ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                        if (zipEntryNextElement != null && zipEntryNextElement.getMethod() == 0 && zipEntryNextElement.getName().startsWith(strSubstring) && zipEntryNextElement.getName().endsWith(".so")) {
                            String strA0g = BV4.A0g(strSubstring.length(), zipEntryNextElement.getName());
                            Map<String, Set<String>> map = this.A01;
                            synchronized (map) {
                                if (!map.containsKey(strA0j)) {
                                    map.put(strA0j, C60O.A13());
                                }
                                BV4.A10(strA0j, map).add(strA0g);
                            }
                        }
                    }
                    zipFile.close();
                } catch (Throwable th) {
                    try {
                        zipFile.close();
                        throw th;
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00af A[PHI: r0
  0x00af: PHI (r0v11 java.util.Set) = (r0v10 java.util.Set), (r0v35 java.util.Set) binds: [B:16:0x003c, B:38:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C3g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A07(android.os.StrictMode.ThreadPolicy r16, java.lang.String r17, int r18) throws java.lang.IllegalAccessException, java.io.IOException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3200C3a.A07(android.os.StrictMode$ThreadPolicy, java.lang.String, int):int");
    }

    @Override // X.C3F
    public final C3g AZr(ApplicationInfo applicationInfo) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C3200C3a c3200C3a = new C3200C3a(applicationInfo);
        try {
            c3200C3a.A01();
            return c3200C3a;
        } catch (IOException e) {
            throw BV4.A0e(e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.Collection, java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.AbstractCollection, java.util.Collection, java.util.LinkedHashSet] */
    public C3200C3a(ApplicationInfo applicationInfo) {
        String strA02;
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        try {
            strA02 = C2D.A02(applicationInfo);
        } catch (IllegalStateException unused) {
            strA02 = null;
        }
        ?? A00 = A00(applicationInfo.sourceDir, strA02);
        if (A00 != 0 && !A00.isEmpty()) {
            linkedHashSetA0k.addAll(A00);
        }
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            for (String str : strArr) {
                ?? A002 = A00(str, strA02);
                if (A002 != 0 && !A002.isEmpty()) {
                    linkedHashSetA0k.addAll(A002);
                }
            }
        }
        this.A02 = linkedHashSetA0k;
    }

    public static Set<String> A00(String str, String str2) {
        String str3;
        String[] strArrA03 = AbstractC3181C1l.A03();
        LinkedHashSet linkedHashSetA0k = null;
        String str4 = HatchCcvLoggingKt.NO_POSTAL_FIELD;
        if (str == null) {
            str3 = "Cannot compute fallback path, apk path is ";
            Log.w("SoLoader", str3.concat(str4));
        } else if (str.isEmpty()) {
            str4 = "empty";
            str3 = "Cannot compute fallback path, apk path is ";
            Log.w("SoLoader", str3.concat(str4));
        } else {
            if (strArrA03 != null) {
                int length = strArrA03.length;
                if (length == 0) {
                    str4 = "empty";
                } else {
                    linkedHashSetA0k = C3cG.A0k();
                    if (str2 != null) {
                        linkedHashSetA0k.add(FGI.A0U(str, "!/lib/", str2));
                    }
                    int i = 0;
                    do {
                        linkedHashSetA0k.add(FGI.A0U(str, "!/lib/", strArrA03[i]));
                        i++;
                    } while (i < length);
                }
            }
            str3 = "Cannot compute fallback path, supportedAbis is ";
            Log.w("SoLoader", str3.concat(str4));
        }
        return linkedHashSetA0k;
    }

    @Override // X.C3g
    public final void A08(int i) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        A01();
    }

    @Override // X.C3g
    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append("DirectApkSoSource");
        sbA0w.append("[root = ");
        BV4.A1O(sbA0w, this.A02);
        return BV5.A0o(sbA0w);
    }
}
