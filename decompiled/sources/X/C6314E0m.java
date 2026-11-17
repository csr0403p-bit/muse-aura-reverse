package X;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.E0m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6314E0m implements InterfaceC6304E0a {
    public final E1P A00 = BV6.A0X();

    @Override // X.InterfaceC6304E0a
    public final /* synthetic */ void reset() {
    }

    /* JADX WARN: Incorrect types in method signature: ([BIILX/E03;LX/Dgn<LX/E00;>;)V */
    @Override // X.InterfaceC6304E0a
    public final void AXd(InterfaceC5344Dgn interfaceC5344Dgn, E03 e03, byte[] bArr, int i, int i2) {
        E0J e0jA00;
        E1P e1p = this.A00;
        e1p.A0T(bArr, i2 + i);
        e1p.A0R(i);
        ArrayList arrayListA0h = C3cG.A0h();
        while (true) {
            int iA04 = e1p.A04();
            if (iA04 <= 0) {
                InterfaceC5344Dgn.A00(interfaceC5344Dgn, arrayListA0h);
                return;
            }
            C1G.A09(BV5.A1P(iA04, 8), "Incomplete Mp4Webvtt Top Level box header found.");
            int iA05 = e1p.A05() - 8;
            if (e1p.A05() == 1987343459) {
                CharSequence charSequenceA00 = null;
                E0L e0lA00 = null;
                while (iA05 > 0) {
                    C1G.A09(BV5.A1P(iA05, 8), "Incomplete vtt cue box header found.");
                    int iA052 = e1p.A05();
                    int iA053 = e1p.A05();
                    int i3 = iA052 - 8;
                    String strA0n = BV4.A0n(StandardCharsets.UTF_8, e1p.A02, e1p.A01, i3);
                    e1p.A0S(i3);
                    iA05 = (iA05 - 8) - i3;
                    if (iA053 == 1937011815) {
                        C6315E0n c6315E0n = new C6315E0n();
                        E1X.A04(c6315E0n, strA0n);
                        e0lA00 = c6315E0n.A00();
                    } else if (iA053 == 1885436268) {
                        charSequenceA00 = E1X.A00(null, strA0n.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceA00 == null) {
                    charSequenceA00 = "";
                }
                if (e0lA00 != null) {
                    e0lA00.A0G = charSequenceA00;
                    e0lA00.A0D = null;
                    e0jA00 = e0lA00.A00();
                } else {
                    C6315E0n c6315E0n2 = new C6315E0n();
                    c6315E0n2.A0A = charSequenceA00;
                    e0jA00 = c6315E0n2.A00().A00();
                }
                arrayListA0h.add(e0jA00);
            } else {
                e1p.A0S(iA05);
            }
        }
    }

    @Override // X.InterfaceC6304E0a
    public final /* synthetic */ E0T AXf(byte[] bArr, int i, int i2) {
        return E0e.A00(this, bArr, i, i2);
    }
}
