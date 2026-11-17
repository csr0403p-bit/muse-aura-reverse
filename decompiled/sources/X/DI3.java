package X;

import com.facebook.quicklog.QuickEventImpl;

/* loaded from: classes5.dex */
public final class DI3 {
    public final DIG A00;

    public static final boolean A00(DI1 di1, QuickEventImpl quickEventImpl) {
        C7384Etj.A0Y(di1, 1);
        if (quickEventImpl == null) {
            return false;
        }
        if (!quickEventImpl.A0K) {
            if (!di1.A06(quickEventImpl.A0B, quickEventImpl.getMarkerId(), quickEventImpl.A01)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A04(DI1 di1, long j) {
        C7384Etj.A0Y(di1, 1);
        DI8.A01("qpl.activeTraces.isTraceOn");
        try {
            return A00(di1, this.A00.A00.get(Long.valueOf(j)));
        } finally {
            DI8.A00();
        }
    }

    public final QuickEventImpl A01(long j) {
        DI8.A01("qpl.activeTraces.traceMapGet");
        try {
            return this.A00.A00.get(Long.valueOf(j));
        } finally {
            DI8.A00();
        }
    }

    public final QuickEventImpl A02(long j) {
        DI8.A01("qpl.activeTraces.traceMapRemove");
        try {
            return this.A00.A00.remove(Long.valueOf(j));
        } finally {
            DI8.A00();
        }
    }

    public final void A03(QuickEventImpl quickEventImpl, long j) {
        DI8.A01("qpl.activeTraces.traceMapPut");
        try {
            this.A00.A00.put(Long.valueOf(j), quickEventImpl);
        } finally {
            DI8.A00();
        }
    }

    public DI3(DIG dig) {
        this.A00 = dig;
    }
}
