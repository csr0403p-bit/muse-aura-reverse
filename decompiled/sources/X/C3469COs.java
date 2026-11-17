package X;

import com.facebook.quicklog.QuickEventImpl;
import com.facebook.quicklog.RealtimeQuickEventListener;
import com.facebook.systrace.Systrace;
import com.facebook.systrace.TraceDirect;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

@RealtimeQuickEventListener
/* renamed from: X.COs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3469COs extends CP8 {
    @Override // X.CP8, X.DI6
    public final void onMarkerAnnotate(COt cOt, int i) {
        C7384Etj.A0Y(cOt, 0);
        if (Systrace.A09(4L)) {
            QuickEventImpl quickEventImpl = (QuickEventImpl) cOt;
            long jA05 = BV4.A05(quickEventImpl.A07);
            int markerId = cOt.getMarkerId();
            int i2 = quickEventImpl.A04;
            AbstractC4952DHl abstractC4952DHl = quickEventImpl.A0R;
            String strA0L = abstractC4952DHl.A0L(i);
            String strA0N = abstractC4952DHl.A0N(i);
            long nanos = TimeUnit.MILLISECONDS.toNanos(jA05);
            Systrace.A05(274877906944L, String.valueOf(markerId), FGI.A0d("<ANNOTATION>=", strA0L, "->", strA0N), markerId ^ (i2 * 179426549), nanos);
        }
    }

    @Override // X.CP8, X.DI6
    public final void onMarkerDrop(COt cOt) {
        C7384Etj.A0Y(cOt, 0);
        if (Systrace.A09(4L)) {
            int markerId = cOt.getMarkerId();
            int i = ((QuickEventImpl) cOt).A04;
            String strValueOf = String.valueOf(markerId);
            int i2 = markerId ^ (i * 179426549);
            if (Systrace.A09(4L)) {
                if (TraceDirect.checkNative()) {
                    TraceDirect.nativeAsyncTraceCancel(strValueOf, i2);
                    return;
                }
                FileOutputStream fileOutputStream = C08.A00;
                C3461COj c3461COjA00 = C3461COj.A00(strValueOf, 'F');
                c3461COjA00.A02("<X>");
                c3461COjA00.A01(i2);
                BV6.A19(c3461COjA00);
            }
        }
    }

    @Override // X.CP8, X.DI6
    public final void onMarkerPoint(COt cOt, int i, long j, boolean z) {
        C7384Etj.A0Y(cOt, 0);
        long jA05 = BV4.A05(j);
        if (Systrace.A09(4L)) {
            int markerId = cOt.getMarkerId();
            QuickEventImpl quickEventImpl = (QuickEventImpl) cOt;
            int i2 = quickEventImpl.A04;
            DHo dHo = quickEventImpl.A0A;
            if (dHo == null) {
                dHo = new DHo();
                quickEventImpl.A0A = dHo;
            }
            String str = dHo.A06[i];
            if (str == null) {
                str = "";
            }
            String strValueOf = String.valueOf(markerId);
            int i3 = markerId ^ (i2 * 179426549);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            Systrace.A05(4L, strValueOf, str, i3, timeUnit.toNanos(jA05));
            DHo dHo2 = quickEventImpl.A0A;
            if (dHo2 == null) {
                dHo2 = new DHo();
                quickEventImpl.A0A = dHo2;
            }
            CPI cpi = dHo2.A04[i];
            if (cpi != null) {
                Systrace.A05(274877906944L, strValueOf, FGI.A0M("<PDATA>=", C60O.A0o(cpi)), i3, timeUnit.toNanos(jA05));
            }
        }
    }

    @Override // X.CP8, X.DI6
    public final void onMarkerRestart(COt cOt) {
        C7384Etj.A0Y(cOt, 0);
        onMarkerStart(cOt);
    }

    @Override // X.CP8, X.DI6
    public final void onMarkerStart(COt cOt) {
        String strA01;
        C7384Etj.A0Y(cOt, 0);
        if (Systrace.A09(4L)) {
            int markerId = cOt.getMarkerId();
            QuickEventImpl quickEventImpl = (QuickEventImpl) cOt;
            int i = quickEventImpl.A04;
            long jA05 = BV4.A05(quickEventImpl.A07);
            String strValueOf = String.valueOf(markerId);
            int i2 = markerId ^ (i * 179426549);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long nanos = timeUnit.toNanos(jA05);
            Systrace.A00();
            if (Systrace.A09(4L)) {
                long jA00 = AbstractC3462COk.A00(nanos);
                if (TraceDirect.checkNative()) {
                    TraceDirect.nativeAsyncTraceBegin(strValueOf, i2, jA00);
                } else {
                    FileOutputStream fileOutputStream = C08.A00;
                    C3461COj c3461COjA00 = C3461COj.A00(strValueOf, 'S');
                    BV8.A1I(c3461COjA00, (jA00 > 0L ? 1 : (jA00 == 0L ? 0 : -1)), jA00);
                    c3461COjA00.A01(i2);
                    BV6.A19(c3461COjA00);
                }
            }
            ArrayList<String> arrayList = quickEventImpl.A0T;
            if (arrayList.isEmpty() || (strA01 = AbstractC06907md.A01(", ", arrayList, null)) == null) {
                return;
            }
            Systrace.A05(274877906944L, strValueOf, FGI.A0M("<TAG>=", strA01), i2, timeUnit.toNanos(jA05));
        }
    }

    @Override // X.CP8, X.DI6
    public final void onMarkerStop(COt cOt) {
        C7384Etj.A0Y(cOt, 0);
        if (Systrace.A09(4L)) {
            QuickEventImpl quickEventImpl = (QuickEventImpl) cOt;
            short s = quickEventImpl.A0J;
            long j = (quickEventImpl.A07 / 1000000) + ((int) (quickEventImpl.A05 / 1000000));
            int markerId = cOt.getMarkerId();
            int i = quickEventImpl.A04;
            String strValueOf = String.valueOf(markerId);
            int i2 = markerId ^ (i * 179426549);
            long nanos = TimeUnit.MILLISECONDS.toNanos(j);
            Systrace.A00();
            if (Systrace.A09(4L)) {
                long jA00 = AbstractC3462COk.A00(nanos);
                if (TraceDirect.checkNative()) {
                    TraceDirect.nativeAsyncTraceEnd(strValueOf, i2, jA00);
                } else {
                    FileOutputStream fileOutputStream = C08.A00;
                    C3461COj c3461COjA00 = C3461COj.A00(strValueOf, 'F');
                    BV8.A1I(c3461COjA00, (jA00 > 0L ? 1 : (jA00 == 0L ? 0 : -1)), jA00);
                    c3461COjA00.A01(i2);
                    BV6.A19(c3461COjA00);
                }
            }
            String strA07 = FGI.A07(markerId, s, "-");
            Systrace.A00();
            if (Systrace.A09(4L)) {
                if (TraceDirect.checkNative()) {
                    TraceDirect.nativeAsyncTraceRename(strValueOf, strA07, i2);
                    return;
                }
                FileOutputStream fileOutputStream2 = C08.A00;
                C3461COj c3461COjA002 = C3461COj.A00(strValueOf, 'F');
                c3461COjA002.A02("<M>");
                c3461COjA002.A01(i2);
                c3461COjA002.A00.append('|');
                c3461COjA002.A02(strA07);
                BV6.A19(c3461COjA002);
            }
        }
    }

    @Override // X.DI6
    public final CP0 getListenerMarkers() {
        return Systrace.A09(4L) ? CP0.A02 : CP0.A04;
    }

    @Override // X.DI6
    public final String getName() {
        return "systrace";
    }
}
