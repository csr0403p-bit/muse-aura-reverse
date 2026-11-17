package X;

import android.os.SystemClock;
import android.util.LruCache;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class COW {
    public static final COW A08 = new COW(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 7);
    public static final String A09 = COW.class.getName();
    public long A00;
    public C8C A01;
    public COX A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final LruCache<String, COX> A07;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public COW() {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        this(null, objArr, objArr2, 0, 7);
    }

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r3v0 X.COW) */
    public static final synchronized ArrayList A00(COW cow) {
        ArrayList arrayListA0h;
        synchronized (cow) {
            arrayListA0h = C3cG.A0h();
            Map<String, COX> mapSnapshot = cow.A07.snapshot();
            C7384Etj.A0U(mapSnapshot);
            Iterator itA0n = AnonymousClass002.A0n(mapSnapshot);
            while (itA0n.hasNext()) {
                arrayListA0h.add(((COX) BV7.A0s(itA0n)).toString());
            }
        }
        return arrayListA0h;
    }

    public final synchronized void A02(String str) {
        String strA0z;
        String strA0z2;
        String strA0z3;
        boolean z;
        C8C c8c;
        if (!this.A06 && (strA0z = AbstractC2159Azp.A0z(str, InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, "-")) != null && (strA0z2 = AbstractC2159Azp.A0z(strA0z, PairsDiscretionDocument.TERMINATOR, "-")) != null && (strA0z3 = AbstractC2159Azp.A0z(strA0z2, ",", "-")) != null) {
            String str2 = this.A03;
            if (!strA0z3.equals(str2)) {
                if (str2 != null && (c8c = this.A01) != null) {
                    c8c.A00(A00(this));
                    this.A00 = SystemClock.elapsedRealtime();
                }
                this.A03 = strA0z3;
                LruCache<String, COX> lruCache = this.A07;
                COX cox = lruCache.get(strA0z3);
                this.A02 = cox;
                if (cox == null) {
                    String str3 = this.A03;
                    C7384Etj.A0X(str3);
                    COX cox2 = new COX(str3, -1L, -1L, -1L, -1L);
                    this.A02 = cox2;
                    lruCache.put(this.A03, cox2);
                }
                COX cox3 = this.A02;
                C7384Etj.A0X(cox3);
                if (cox3.A02 != -1) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    COX cox4 = this.A02;
                    C7384Etj.A0X(cox4);
                    long j = jElapsedRealtime - cox4.A02;
                    z = false;
                    if (j >= 120000) {
                    }
                    this.A05 = z;
                }
                z = true;
                this.A05 = z;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1 A[Catch: IndexOutOfBoundsException | NumberFormatException | PatternSyntaxException -> 0x0056, TryCatch #6 {IndexOutOfBoundsException | NumberFormatException | PatternSyntaxException -> 0x0056, blocks: (B:26:0x0068, B:28:0x0078, B:29:0x007c, B:31:0x0082, B:33:0x0088, B:34:0x008c, B:37:0x00a1, B:39:0x00ac, B:52:0x00f8, B:40:0x00b1, B:42:0x00b9, B:43:0x00c2, B:45:0x00cb, B:46:0x00d5, B:48:0x00de, B:49:0x00e7, B:51:0x00ef, B:54:0x00fd, B:35:0x009c), top: B:106:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.COW r19) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.COW.A01(X.COW):void");
    }

    public /* synthetic */ COW(COY coy, C8C c8c, C06H c06h, int i, int i2) throws IOException, NumberFormatException {
        this.A01 = null;
        this.A07 = new LruCache<>(20);
        if (this.A01 != null) {
            A01(this);
        }
    }
}
