package X;

import com.facebook.aura.localbrowser.LocalBrowserTask;
import com.facebook.aura.sharesheet.HatchShareSheetRepository;
import java.io.IOException;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.Efk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7084Efk {
    public long A00;
    public CountDownLatch A02;
    public final C7106EgK A05;
    public final InterfaceC7089Efs A06;
    public final C7092Efy A07;
    public final C8T A08;
    public final InterfaceC7539F0o A09;
    public final Set<String> A0B;
    public final C7101EgF A0C;
    public final C7102EgG A0D;
    public final Object A0A = C3cG.A0T();
    public final long A04 = 10485760;
    public final long A03 = HatchShareSheetRepository.MAX_UPLOAD_BYTES;
    public long A01 = HatchShareSheetRepository.MAX_UPLOAD_BYTES;

    public C7084Efk(C7101EgF c7101EgF, C7102EgG c7102EgG, C7106EgK c7106EgK, InterfaceC7089Efs interfaceC7089Efs) {
        C8T c8t;
        this.A06 = interfaceC7089Efs;
        this.A05 = c7106EgK;
        this.A0D = c7102EgG;
        this.A0C = c7101EgF;
        synchronized (C8T.class) {
            c8t = C8T.A07;
            if (c8t == null) {
                c8t = new C8T();
                C8T.A07 = c8t;
            }
        }
        this.A08 = c8t;
        this.A00 = -1L;
        this.A07 = new C7092Efy();
        this.A09 = C9u.A00;
        this.A0B = C60O.A13();
        this.A02 = new CountDownLatch(0);
    }

    public static final boolean A00(C7084Efk c7084Efk) {
        boolean z;
        long j;
        InterfaceC7539F0o interfaceC7539F0o = c7084Efk.A09;
        long jNow = interfaceC7539F0o.now();
        C7092Efy c7092Efy = c7084Efk.A07;
        synchronized (c7092Efy) {
            z = c7092Efy.A02;
        }
        if (z) {
            long j2 = c7084Efk.A00;
            if (j2 != -1 && jNow - j2 <= 1800000) {
                return false;
            }
        }
        long jNow2 = interfaceC7539F0o.now();
        long j3 = LocalBrowserTask.DISCONNECT_GRACE_MS + jNow2;
        try {
            Collection<C7088Efr> collectionAFF = c7084Efk.A06.AFF();
            C7384Etj.A0U(collectionAFF);
            long j4 = 0;
            int i = 0;
            for (C7088Efr c7088Efr : collectionAFF) {
                i++;
                long length = c7088Efr.A00;
                if (length < 0) {
                    length = c7088Efr.A02.A00.length();
                    c7088Efr.A00 = length;
                }
                j4 += length;
                if (c7088Efr.A00() > j3) {
                    if (c7088Efr.A00 < 0) {
                        c7088Efr.A00 = c7088Efr.A02.A00.length();
                    }
                    c7088Efr.A00();
                }
            }
            synchronized (c7092Efy) {
                try {
                    j = c7092Efy.A00;
                } catch (Throwable th) {
                    throw th;
                }
            }
            long j5 = i;
            if (j != j5 || c7092Efy.A00() != j4) {
                synchronized (c7092Efy) {
                    try {
                        c7092Efy.A00 = j5;
                        c7092Efy.A01 = j4;
                        c7092Efy.A02 = true;
                    } finally {
                    }
                }
            }
            c7084Efk.A00 = jNow2;
            return true;
        } catch (IOException e) {
            e.getMessage();
            return false;
        }
    }
}
