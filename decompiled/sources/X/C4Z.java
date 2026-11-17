package X;

import android.os.Trace;
import java.io.File;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public final class C4Z {
    public static String A05;
    public final C54 A00;
    public final File A01;
    public final List A02;
    public final Set<String> A03;
    public final C3192C2q A04;
    public static final File[] A07 = new File[0];
    public static final Object A06 = C3cG.A0T();

    public static void A00(EnumC3223C4g enumC3223C4g, C4Z c4z, File file, File file2, boolean z, boolean z2) {
        AbstractC3191C2p.A00(FGI.A0M("maybeAssembleReport.", enumC3223C4g.name()));
        try {
            synchronized (A06) {
                List<AbstractC3220C4c> list = c4z.A02;
                list.size();
                for (AbstractC3220C4c abstractC3220C4c : list) {
                    if (!z || !z2 || abstractC3220C4c.A01() != C79.A01) {
                        file.getName();
                        if (file2 != null) {
                            file2.getName();
                        }
                        abstractC3220C4c.A02(enumC3223C4g, file, file2);
                    }
                }
                C2U.A00(file, "mixers");
            }
        } finally {
            Trace.endSection();
        }
    }

    public static final boolean A01(File file, String str) {
        boolean zExists;
        synchronized (A06) {
            zExists = BV5.A0L(str, "_done", file).exists();
        }
        return zExists;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5 A[Catch: all -> 0x00f9, Merged into TryCatch #9 {all -> 0x00fc, blocks: (B:3:0x0005, B:4:0x0007, B:52:0x00fb, B:5:0x0008, B:24:0x0077, B:26:0x008b, B:27:0x0091, B:29:0x0096, B:31:0x00a5, B:32:0x00b3, B:33:0x00b8, B:35:0x00c4, B:39:0x00d2, B:42:0x00ed, B:41:0x00d7, B:48:0x00f5, B:49:0x00f8, B:6:0x000d, B:7:0x0020, B:9:0x0026, B:20:0x006e, B:22:0x0073, B:23:0x0076, B:10:0x003e, B:12:0x0048, B:17:0x0055, B:16:0x0052, B:19:0x0057, B:46:0x00f3), top: B:71:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.C3228C4l r9, java.io.File r10, java.lang.String r11, java.util.List r12) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Z.A02(X.C4l, java.io.File, java.lang.String, java.util.List):void");
    }

    public C4Z(C3192C2q c3192C2q, C54 c54) {
        this.A00 = c54;
        this.A04 = c3192C2q;
        File fileA0O = C3cG.A0O(c54.A06, "reports");
        this.A01 = fileA0O;
        fileA0O.mkdirs();
        this.A02 = C3cG.A0h();
        this.A03 = C60O.A18();
    }
}
