package X;

import android.os.SystemClock;
import android.os.Trace;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class C54 {
    public static C54 A09;
    public static Map<String, File[]> A0A;
    public long A00;
    public final int A01;
    public final long A02;
    public final C3264C6k A03;
    public final C4E A04;
    public final File A05;
    public final File A06;
    public final String A07;
    public final String A08;
    public static final List A0C = C3cG.A0h();
    public static final Object A0B = C3cG.A0T();

    public C54(C4E c4e, InterfaceC3189C2f interfaceC3189C2f, File file, String str, String str2, long j) {
        File fileA0L;
        A0A = BV4.A0u();
        this.A07 = str2;
        this.A06 = file;
        this.A08 = str;
        synchronized (this) {
            File file2 = this.A06;
            String strA0U = FGI.A0U("sess_", str2, "_");
            File[] fileArrA02 = A02(str2);
            int length = fileArrA02.length;
            String strValueOf = String.valueOf(length >= 1 ? 1 + A00(fileArrA02[length - 1], str2) : 1L);
            fileA0L = BV5.A0L(strA0U, FGI.A0U(FGI.A0M("000000000", strValueOf).substring(strValueOf.length()), "-", str), file2);
            fileA0L.mkdirs();
        }
        this.A05 = fileA0L;
        this.A04 = c4e;
        this.A01 = 3;
        File fileA0O = C3cG.A0O(fileA0L, "state.txt");
        C3193C2r c3193C2rA7U = interfaceC3189C2f.A7U(fileA0O, 4096);
        this.A03 = new C3264C6k(c3193C2rA7U == null ? new C3193C2r(fileA0O, 4096) : c3193C2rA7U);
        this.A00 = SystemClock.uptimeMillis();
        this.A02 = j;
        C5W c5w = C5V.A04;
        if (c5w != null) {
            c5w.A03 = str;
            c5w.A09 = fileA0L;
        }
        List list = A0C;
        synchronized (list) {
            A09 = this;
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next();
                throw BV4.A0a("onSetInstance");
            }
            list.clear();
        }
    }

    public final File[] A02(String str) {
        AbstractC3191C2p.A00(FGI.A0M("getOrderedSessionDirs.", str));
        try {
            File[] fileArrListFiles = this.A06.listFiles(new F5F(str, 2));
            if (fileArrListFiles == null) {
                fileArrListFiles = new File[0];
            } else {
                Arrays.sort(fileArrListFiles, new C7572F4l(22));
            }
            return fileArrListFiles;
        } finally {
            Trace.endSection();
        }
    }

    public static long A00(File file, String str) {
        String strReplace = file.getName().replace(FGI.A0U("sess_", str, "_"), "");
        int iIndexOf = strReplace.indexOf(45);
        if (iIndexOf != -1) {
            strReplace = BV4.A0j(strReplace, iIndexOf);
        }
        try {
            return Long.parseLong(strReplace);
        } catch (NumberFormatException e) {
            C2Q.A00().AT9("SessMgrSessCount", e, null);
            return 0L;
        }
    }

    public final File A01(String str) {
        File[] fileArrA02 = A02(str);
        int length = fileArrA02.length;
        if (length < 2) {
            return null;
        }
        return fileArrA02[length - 2];
    }
}
