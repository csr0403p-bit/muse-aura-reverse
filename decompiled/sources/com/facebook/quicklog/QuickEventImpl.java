package com.facebook.quicklog;

import X.AbstractC4952DHl;
import X.C7384Etj;
import X.COt;
import X.CPI;
import X.CRS;
import X.DHk;
import X.DHo;
import X.DHr;
import X.DI8;
import X.DJJ;
import X.EtT;
import X.InterfaceC4978DJv;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class QuickEventImpl implements Runnable, COt {
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public DHo A0A;
    public DJJ A0B;
    public CRS A0C;
    public InterfaceC4978DJv<?> A0D;
    public InterfaceC4978DJv<?> A0E;
    public Integer A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public short A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public EtT A0Q;
    public final DHr A0S;
    public int mMarkerId;
    public long mTimestampMs;
    public int A00 = 0;
    public final ArrayList<String> A0T = new ArrayList<>();
    public final AbstractC4952DHl A0R = new DHk();
    public long A09 = -1;

    public static QuickEventImpl A00(AwakeTimeSinceBootClock awakeTimeSinceBootClock, TimeUnit timeUnit, int i, int i2, int i3, int i4, long j, long j2, boolean z, boolean z2) {
        DI8.A01("qpl.QuickEvent.allocateInactiveEvent");
        QuickEventImpl quickEventImpl = new QuickEventImpl(awakeTimeSinceBootClock);
        quickEventImpl.mMarkerId = i;
        quickEventImpl.A02 = i2;
        quickEventImpl.A07 = timeUnit.toNanos(j);
        quickEventImpl.A0P = z;
        quickEventImpl.mTimestampMs = j2;
        quickEventImpl.A04 = i3;
        quickEventImpl.A01 = i4;
        quickEventImpl.A0N = z2;
        quickEventImpl.A05 = 0L;
        DI8.A00();
        return quickEventImpl;
    }

    /* JADX WARN: Incorrect types in method signature: (JLjava/util/concurrent/TimeUnit;ZILjava/lang/String;LX/CPI;LX/DJv<*>;)I */
    /* JADX WARN: Multi-variable type inference failed */
    public final int A01(CPI cpi, InterfaceC4978DJv interfaceC4978DJv, String str, TimeUnit timeUnit, int i, long j, boolean z) {
        DHo dHo = this.A0A;
        if (dHo == null) {
            dHo = new DHo();
            this.A0A = dHo;
        }
        C7384Etj.A0Y(str, 4);
        int i2 = dHo.A01;
        int i3 = dHo.A00;
        if (i2 == i3) {
            int i4 = i3 + (i3 >> 1);
            long[] jArr = dHo.A03;
            if (jArr.length < i4) {
                long[] jArrCopyOf = Arrays.copyOf(jArr, i4);
                C7384Etj.A0U(jArrCopyOf);
                dHo.A03 = jArrCopyOf;
            }
            boolean[] zArr = dHo.A07;
            if (zArr.length < i4) {
                boolean[] zArrCopyOf = Arrays.copyOf(zArr, i4);
                C7384Etj.A0U(zArrCopyOf);
                dHo.A07 = zArrCopyOf;
            }
            String[] strArr = dHo.A06;
            if (strArr.length < i4) {
                Object[] objArrCopyOf = Arrays.copyOf(strArr, i4);
                C7384Etj.A0U(objArrCopyOf);
                dHo.A06 = (String[]) objArrCopyOf;
            }
            CPI[] cpiArr = dHo.A04;
            if (cpiArr.length < i4) {
                Object[] objArrCopyOf2 = Arrays.copyOf(cpiArr, i4);
                C7384Etj.A0U(objArrCopyOf2);
                dHo.A04 = (CPI[]) objArrCopyOf2;
            }
            int[] iArr = dHo.A02;
            if (iArr.length < i4) {
                int[] iArrCopyOf = Arrays.copyOf(iArr, i4);
                C7384Etj.A0U(iArrCopyOf);
                dHo.A02 = iArrCopyOf;
            }
            InterfaceC4978DJv<?>[] interfaceC4978DJvArr = dHo.A05;
            if (interfaceC4978DJvArr.length < i4) {
                Object[] objArrCopyOf3 = Arrays.copyOf(interfaceC4978DJvArr, i4);
                C7384Etj.A0U(objArrCopyOf3);
                dHo.A05 = (InterfaceC4978DJv[]) objArrCopyOf3;
            }
            dHo.A00 = i4;
        }
        if (cpi != null && !cpi.A03) {
            throw new IllegalStateException("PointData should be locked before passing to the storage");
        }
        dHo.A03[dHo.A01] = timeUnit.toNanos(j);
        boolean[] zArr2 = dHo.A07;
        int i5 = dHo.A01;
        zArr2[i5] = z;
        dHo.A06[i5] = str;
        dHo.A04[i5] = cpi;
        dHo.A02[i5] = i;
        dHo.A05[i5] = interfaceC4978DJv;
        dHo.A01 = i5 + 1;
        return i5;
    }

    public final String A02() {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arrayList = this.A0T;
        int size = arrayList.size();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (size > 1) {
                sb.append(",");
            }
            size--;
        }
        return sb.toString();
    }

    @Override // X.COt
    public final EtT AHg() {
        EtT etT = this.A0Q;
        if (etT != null) {
            return etT;
        }
        EtT etT2 = new EtT();
        this.A0Q = etT2;
        return etT2;
    }

    @Override // X.COt
    public final int getMarkerId() {
        return this.mMarkerId;
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x03d9 A[Catch: NumberFormatException -> 0x0560, Exception -> 0x06b0, LOOP:8: B:171:0x03d7->B:172:0x03d9, LOOP_END, TryCatch #1 {NumberFormatException -> 0x0560, blocks: (B:158:0x035e, B:159:0x0367, B:160:0x0368, B:161:0x037e, B:163:0x038d, B:164:0x0395, B:166:0x039b, B:168:0x03a7, B:169:0x03b1, B:172:0x03d9, B:175:0x03e7, B:170:0x03d4, B:176:0x03f3, B:178:0x0402, B:179:0x040a, B:181:0x0410, B:183:0x041c, B:184:0x0426, B:187:0x044e, B:190:0x045c, B:185:0x0449, B:191:0x0468, B:193:0x0477, B:194:0x047f, B:196:0x0485, B:198:0x0491, B:199:0x049b, B:202:0x04c3, B:205:0x04d1, B:200:0x04be, B:206:0x04dd, B:208:0x04ec, B:209:0x04f4, B:211:0x04fa, B:213:0x0506, B:214:0x0510, B:215:0x0522, B:216:0x0525, B:217:0x0533, B:218:0x0541, B:219:0x054b), top: B:280:0x0368, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03e7 A[Catch: NumberFormatException -> 0x0560, Exception -> 0x06b0, LOOP:9: B:174:0x03e5->B:175:0x03e7, LOOP_END, TryCatch #1 {NumberFormatException -> 0x0560, blocks: (B:158:0x035e, B:159:0x0367, B:160:0x0368, B:161:0x037e, B:163:0x038d, B:164:0x0395, B:166:0x039b, B:168:0x03a7, B:169:0x03b1, B:172:0x03d9, B:175:0x03e7, B:170:0x03d4, B:176:0x03f3, B:178:0x0402, B:179:0x040a, B:181:0x0410, B:183:0x041c, B:184:0x0426, B:187:0x044e, B:190:0x045c, B:185:0x0449, B:191:0x0468, B:193:0x0477, B:194:0x047f, B:196:0x0485, B:198:0x0491, B:199:0x049b, B:202:0x04c3, B:205:0x04d1, B:200:0x04be, B:206:0x04dd, B:208:0x04ec, B:209:0x04f4, B:211:0x04fa, B:213:0x0506, B:214:0x0510, B:215:0x0522, B:216:0x0525, B:217:0x0533, B:218:0x0541, B:219:0x054b), top: B:280:0x0368, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x044e A[Catch: NumberFormatException -> 0x0560, Exception -> 0x06b0, LOOP:11: B:186:0x044c->B:187:0x044e, LOOP_END, TryCatch #1 {NumberFormatException -> 0x0560, blocks: (B:158:0x035e, B:159:0x0367, B:160:0x0368, B:161:0x037e, B:163:0x038d, B:164:0x0395, B:166:0x039b, B:168:0x03a7, B:169:0x03b1, B:172:0x03d9, B:175:0x03e7, B:170:0x03d4, B:176:0x03f3, B:178:0x0402, B:179:0x040a, B:181:0x0410, B:183:0x041c, B:184:0x0426, B:187:0x044e, B:190:0x045c, B:185:0x0449, B:191:0x0468, B:193:0x0477, B:194:0x047f, B:196:0x0485, B:198:0x0491, B:199:0x049b, B:202:0x04c3, B:205:0x04d1, B:200:0x04be, B:206:0x04dd, B:208:0x04ec, B:209:0x04f4, B:211:0x04fa, B:213:0x0506, B:214:0x0510, B:215:0x0522, B:216:0x0525, B:217:0x0533, B:218:0x0541, B:219:0x054b), top: B:280:0x0368, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x045c A[Catch: NumberFormatException -> 0x0560, Exception -> 0x06b0, LOOP:12: B:189:0x045a->B:190:0x045c, LOOP_END, TryCatch #1 {NumberFormatException -> 0x0560, blocks: (B:158:0x035e, B:159:0x0367, B:160:0x0368, B:161:0x037e, B:163:0x038d, B:164:0x0395, B:166:0x039b, B:168:0x03a7, B:169:0x03b1, B:172:0x03d9, B:175:0x03e7, B:170:0x03d4, B:176:0x03f3, B:178:0x0402, B:179:0x040a, B:181:0x0410, B:183:0x041c, B:184:0x0426, B:187:0x044e, B:190:0x045c, B:185:0x0449, B:191:0x0468, B:193:0x0477, B:194:0x047f, B:196:0x0485, B:198:0x0491, B:199:0x049b, B:202:0x04c3, B:205:0x04d1, B:200:0x04be, B:206:0x04dd, B:208:0x04ec, B:209:0x04f4, B:211:0x04fa, B:213:0x0506, B:214:0x0510, B:215:0x0522, B:216:0x0525, B:217:0x0533, B:218:0x0541, B:219:0x054b), top: B:280:0x0368, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04c3 A[Catch: NumberFormatException -> 0x0560, Exception -> 0x06b0, LOOP:14: B:201:0x04c1->B:202:0x04c3, LOOP_END, TryCatch #1 {NumberFormatException -> 0x0560, blocks: (B:158:0x035e, B:159:0x0367, B:160:0x0368, B:161:0x037e, B:163:0x038d, B:164:0x0395, B:166:0x039b, B:168:0x03a7, B:169:0x03b1, B:172:0x03d9, B:175:0x03e7, B:170:0x03d4, B:176:0x03f3, B:178:0x0402, B:179:0x040a, B:181:0x0410, B:183:0x041c, B:184:0x0426, B:187:0x044e, B:190:0x045c, B:185:0x0449, B:191:0x0468, B:193:0x0477, B:194:0x047f, B:196:0x0485, B:198:0x0491, B:199:0x049b, B:202:0x04c3, B:205:0x04d1, B:200:0x04be, B:206:0x04dd, B:208:0x04ec, B:209:0x04f4, B:211:0x04fa, B:213:0x0506, B:214:0x0510, B:215:0x0522, B:216:0x0525, B:217:0x0533, B:218:0x0541, B:219:0x054b), top: B:280:0x0368, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04d1 A[Catch: NumberFormatException -> 0x0560, Exception -> 0x06b0, LOOP:15: B:204:0x04cf->B:205:0x04d1, LOOP_END, TryCatch #1 {NumberFormatException -> 0x0560, blocks: (B:158:0x035e, B:159:0x0367, B:160:0x0368, B:161:0x037e, B:163:0x038d, B:164:0x0395, B:166:0x039b, B:168:0x03a7, B:169:0x03b1, B:172:0x03d9, B:175:0x03e7, B:170:0x03d4, B:176:0x03f3, B:178:0x0402, B:179:0x040a, B:181:0x0410, B:183:0x041c, B:184:0x0426, B:187:0x044e, B:190:0x045c, B:185:0x0449, B:191:0x0468, B:193:0x0477, B:194:0x047f, B:196:0x0485, B:198:0x0491, B:199:0x049b, B:202:0x04c3, B:205:0x04d1, B:200:0x04be, B:206:0x04dd, B:208:0x04ec, B:209:0x04f4, B:211:0x04fa, B:213:0x0506, B:214:0x0510, B:215:0x0522, B:216:0x0525, B:217:0x0533, B:218:0x0541, B:219:0x054b), top: B:280:0x0368, outer: #0 }] */
    /* JADX WARN: Type inference failed for: r0v83, types: [TMap, X.CFl] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.quicklog.QuickEventImpl.run():void");
    }

    public QuickEventImpl(AwakeTimeSinceBootClock awakeTimeSinceBootClock) {
        this.A0S = new DHr(awakeTimeSinceBootClock);
    }
}
