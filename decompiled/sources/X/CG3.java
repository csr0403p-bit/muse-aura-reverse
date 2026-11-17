package X;

import com.facebook.aura.pairs.PairsDiscretionDocument;

/* loaded from: classes5.dex */
public final class CG3 extends DFW {
    public static DFX A01;
    public static CG3 A02;
    public C3341CFl A00;

    @Override // X.DFW
    public final C3341CFl A04() {
        C3341CFl c3341CFl = this.A00;
        if (c3341CFl != null) {
            return c3341CFl;
        }
        C3341CFl c3341CFlA03 = A01.A0B.A03();
        this.A00 = c3341CFlA03;
        return c3341CFlA03;
    }

    @Override // X.DFW
    public final void A05() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StringBuilder sbA0w = C60O.A0w();
        for (StackTraceElement stackTraceElement : stackTrace) {
            sbA0w.append("SampledOutEvent is logged: ");
            BV4.A1O(sbA0w, stackTraceElement);
            sbA0w.append(PairsDiscretionDocument.TERMINATOR);
        }
        CFK.A07("SampledOutEventBuilder", sbA0w.toString());
        this.A00 = null;
    }

    @Override // X.DFW
    public final boolean A0A() {
        return false;
    }

    @Override // X.DFW
    public final void A06(long j) {
    }

    @Override // X.DFW
    public final void A07(Boolean bool, String str) {
    }

    @Override // X.DFW
    public final void A08(String str, Number number) {
    }

    @Override // X.DFW
    public final void A09(String str, String str2) {
    }
}
