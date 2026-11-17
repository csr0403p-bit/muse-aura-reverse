package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class C0P extends Thread {
    public static final String __redex_internal_original_name = "SimpleCache$1";
    public final /* synthetic */ C0N A00;

    public C0P(C0N c0n) {
        this.A00 = c0n;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00ca: IPUT (r4 I:java.util.List<java.io.File>), (r6 I:X.C0N) A[Catch: all -> 0x00d0, TRY_ENTER] (LINE:202) X.C0N.A01 java.util.List, block:B:55:0x00ca */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        List<File> list;
        C0N c0n = this.A00;
        try {
            try {
            } finally {
            }
        } catch (Exception e) {
            CFK.A08("SimpleCache", "Failed to initialize cache directory", e);
        }
        if (c0n.A0F) {
            try {
                C0Q.A01("VPS-SimpleCacheInit-LightCache");
                File file = c0n.A08;
                BV5.A1H(file);
                C0N.A0A(c0n, file, true);
                C0N.A07(c0n);
                return;
            } finally {
            }
        }
        if (!c0n.A0E) {
            synchronized (c0n) {
                try {
                    try {
                        try {
                            C0Q.A01("VPS-SimpleCacheInit");
                            File file2 = c0n.A08;
                            BV5.A1H(file2);
                            File[] fileArrListFiles = file2.listFiles();
                            if (fileArrListFiles != null) {
                                for (File file3 : fileArrListFiles) {
                                    if (!c0n.A0D.contains(file3.getName())) {
                                        C0N.A0B(c0n, file3, true);
                                    }
                                }
                            }
                            C0N.A07(c0n);
                        } catch (Exception e2) {
                            CFK.A08("SimpleCache", "Failed to initialize cache directory", e2);
                        }
                    } finally {
                    }
                } finally {
                }
            }
            return;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        synchronized (c0n) {
            try {
                try {
                    c0n.A01 = arrayListA0h;
                } catch (Exception e3) {
                    CFK.A08("SimpleCache", "Failed to initialize cache directory", e3);
                }
                try {
                    C0Q.A01("VPS-SimpleCacheInit");
                    File file4 = c0n.A08;
                    BV5.A1H(file4);
                    ArrayList arrayListA0h2 = C3cG.A0h();
                    try {
                        C0Q.A01("VPS-SimpleCacheInit-Scan");
                        C0N.A09(c0n, file4, arrayListA0h2, arrayListA0h, true);
                        C0Q.A00();
                        try {
                            C0Q.A01("VPS-SimpleCacheInit-Insert");
                            Iterator it = arrayListA0h2.iterator();
                            while (it.hasNext()) {
                                C0N.A05((C0J) it.next(), c0n);
                            }
                            C0Q.A00();
                            C0N.A07(c0n);
                            c0n.A01 = null;
                        } catch (Throwable th) {
                            C0Q.A00();
                            throw th;
                        }
                    } finally {
                        C0Q.A00();
                    }
                } finally {
                }
            } catch (Throwable th2) {
                c0n.A01 = list;
                throw th2;
            }
        }
        if (arrayListA0h.isEmpty()) {
            return;
        }
        try {
            C0Q.A01("VPS-SimpleCacheInit-DeferredDeletes");
            Iterator it2 = arrayListA0h.iterator();
            while (it2.hasNext()) {
                ((File) it2.next()).delete();
            }
            C0Q.A00();
        } catch (Throwable th3) {
            C0Q.A00();
            throw th3;
        }
    }
}
