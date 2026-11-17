package X;

import android.content.Context;
import android.os.Trace;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class C4I {
    public static int A0G;
    public static boolean A0H;
    public C4U A00;
    public ScheduledExecutorService A01;
    public final int A02;
    public final Context A03;
    public final C4E A04;
    public final C4J A05;
    public final C2R A06;
    public final Runnable A07;
    public final Set<File> A08;
    public final Executor A09;
    public final AtomicInteger A0A;
    public final F18<String> A0B;
    public final F18<String> A0C;
    public final F18<String> A0D;
    public final F18<C4Z> A0E;
    public final F18<String> A0F;

    private final int A00(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles(new F5D(5));
        int length = (fileArrListFiles == null ? 0 : fileArrListFiles.length) + 1;
        A01(file, "_report.txt");
        C3cG.A0O(file, FGI.A0H("_attempt", length)).createNewFile();
        return length;
    }

    public static File A01(File file, String str) {
        File[] fileArrListFiles = file.listFiles(new F5F(str, 1));
        if (fileArrListFiles == null || fileArrListFiles.length != 1) {
            return null;
        }
        return fileArrListFiles[0];
    }

    public C4I(Context context, C4E c4e, Runnable runnable, Executor executor, F18 f18, F18 f182, F18 f183, F18 f184, F18 f185, F18 f186, int i) {
        C2R c2r = new C2R();
        this.A08 = C60O.A13();
        this.A0A = new AtomicInteger();
        this.A03 = context;
        this.A0F = f18;
        this.A0C = f182;
        this.A0B = f183;
        this.A0D = f184;
        this.A05 = new C4J(f186);
        this.A04 = c4e;
        this.A09 = executor;
        this.A07 = runnable;
        this.A02 = i;
        this.A06 = c2r;
        this.A0E = f186;
        this.A00 = (C4U) f185.AMN();
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0148 A[Catch: all -> 0x01da, IOException -> 0x01e7, TryCatch #1 {IOException -> 0x01e7, blocks: (B:6:0x0015, B:8:0x001d, B:9:0x002c, B:13:0x003b, B:16:0x0047, B:17:0x0059, B:19:0x006e, B:58:0x013b, B:60:0x0148, B:72:0x0183, B:65:0x0162, B:67:0x0169, B:69:0x0170, B:75:0x0195, B:76:0x0198, B:80:0x01be, B:82:0x01cf, B:83:0x01d6, B:79:0x01b5, B:57:0x012c, B:12:0x003a), top: B:93:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(X.C4S r22, final X.C4I r23, final X.C4T r24, final java.io.File r25) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4I.A02(X.C4S, X.C4I, X.C4T, java.io.File):void");
    }

    public final void A03() {
        AbstractC3191C2p.A00("cleanupSentReports");
        try {
            final CountDownLatch countDownLatchA16 = BV5.A16();
            C51.A01().execute(new Runnable() { // from class: X.C4H
                public static final String __redex_internal_original_name = "ReportSender$$ExternalSyntheticLambda5";

                @Override // java.lang.Runnable
                public final void run() {
                    File[] fileArrListFiles;
                    C4I c4i = this.A00;
                    CountDownLatch countDownLatch = countDownLatchA16;
                    if (c4i.A06.A00("cleanup")) {
                        return;
                    }
                    try {
                        c4i.A04.A03();
                    } catch (IOException e) {
                        C2Q.A00().AT9("ReportSenderCleanup", e, null);
                    }
                    F18<C4Z> f18 = c4i.A05.A00;
                    if (f18 == null) {
                        fileArrListFiles = new File[0];
                    } else {
                        fileArrListFiles = f18.AMN().A01.listFiles();
                        if (fileArrListFiles == null) {
                            return;
                        }
                    }
                    for (File file : fileArrListFiles) {
                        try {
                            File[] fileArrListFiles2 = file.listFiles(new F5D(5));
                            int length = fileArrListFiles2 == null ? 0 : fileArrListFiles2.length;
                            C4E c4e = c4i.A04;
                            boolean z = false;
                            if (length >= c4i.A02) {
                                z = true;
                                c4i.A07.run();
                            }
                            if (new File(file, "_sent").exists() || z) {
                                if (C4I.A0H) {
                                    CFK.A0H(C9Y.TAG, "Would have deleted: %s", file.getPath());
                                } else if (new File(file, "_sent").exists()) {
                                    synchronized (C4E.class) {
                                        Iterator it = C4E.A05.iterator();
                                        while (it.hasNext()) {
                                            it.next();
                                        }
                                        C4E.A00(c4e, file, "reports");
                                    }
                                } else if (z) {
                                    c4e.A04(file);
                                }
                            }
                        } catch (IOException e2) {
                            CFK.A0A(C9Y.TAG, "Error while deleting report directory", e2);
                            C2Q.A00().AT9("ReportSenderPurge", e2, null);
                        }
                    }
                    countDownLatch.countDown();
                }
            });
        } finally {
            Trace.endSection();
        }
    }

    public final void A04(EnumC3223C4g enumC3223C4g, File[] fileArr) {
        int iAUW = C2Q.A00().AUW("sendPendingReports");
        AbstractC3191C2p.A00(FGI.A0U("sendPendingReports.", enumC3223C4g.name(), ""));
        try {
            this.A09.execute(new C4L(enumC3223C4g, this, new CountDownLatch(1), fileArr));
            C2Q.A00().AUV(iAUW, null);
        } finally {
            Trace.endSection();
        }
    }
}
