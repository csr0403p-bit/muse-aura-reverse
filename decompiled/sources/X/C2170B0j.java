package X;

import androidx.compose.runtime.MutableState;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.B0j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2170B0j extends AbstractC2175B0t {
    public float A00;
    public float A01;
    public String A02;
    public Function0<Unit> A03;
    public boolean A04;
    public long A05;
    public C1423Ais A06;
    public final MutableState A07;
    public final MutableState A08;
    public final B0r A09;
    public final C2171B0k A0A;
    public final G0U<AT3, Unit> A0B;

    public C2170B0j(C2171B0k c2171B0k) {
        this.A0A = c2171B0k;
        c2171B0k.A0B = BUX.A00(this, 22);
        this.A02 = "";
        this.A04 = true;
        this.A09 = new B0r();
        this.A03 = new BUS(11);
        AGE age = AGE.A00;
        this.A07 = C3cG.A08(age, null);
        this.A08 = C3cG.A08(age, new AWA(0L));
        this.A05 = 9205357640488583168L;
        this.A00 = 1.0f;
        this.A01 = 1.0f;
        this.A0B = BUX.A00(this, 23);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(X.C1423Ais r25, X.AT3 r26, float r27) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2170B0j.A05(X.Ais, X.AT3, float):void");
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Params: \tname: ");
        sbA0x.append(this.A02);
        sbA0x.append("\n\tviewportWidth: ");
        MutableState mutableState = this.A08;
        sbA0x.append(AnonymousClass003.A03(AWA.A03(mutableState)));
        sbA0x.append("\n\tviewportHeight: ");
        sbA0x.append(AnonymousClass004.A00(AWA.A03(mutableState)));
        return AnonymousClass001.A0v(PairsDiscretionDocument.TERMINATOR, sbA0x);
    }
}
