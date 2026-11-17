package X;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.AtO, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1903AtO {
    public static final void A00(C1890At8 c1890At8, String str) {
        Snapshot snapshotA03 = Snapshot.A03();
        G0U g0uA1F = C8j3.A1F(snapshotA03);
        Snapshot snapshotA04 = Snapshot.A04(snapshotA03);
        try {
            MutableState mutableState = c1890At8.A03;
            if (MutableState.A0A(mutableState)) {
                throw C3cG.A0Q("TextFieldState does not support concurrent or nested editing.");
            }
            MutableState.A09(true, mutableState);
            MutableState mutableState2 = c1890At8.A05;
            At0 at0 = (At0) mutableState2.getValue();
            C1891AtA c1891AtA = new C1891AtA(at0, at0, null);
            try {
                C1919Atg c1919Atg = c1891AtA.A05;
                c1891AtA.A05(str, 0, c1919Atg.length());
                int length = c1919Atg.length();
                int length2 = c1919Atg.length() + 1;
                if (0 > length || length >= length2) {
                    StringBuilder sbA0y = C60O.A0y("Expected ", length);
                    sbA0y.append(" to be in [");
                    sbA0y.append(0);
                    C8j3.A1K(sbA0y);
                    AbstractC1061ATk.A00(C8j5.A0X(sbA0y, length2));
                    throw F60.createAndThrow();
                }
                c1891AtA.A00 = C8j3.A0T(length, length);
                boolean zA1N = AnonymousClass002.A1N(c1891AtA.A02().A00.A00);
                boolean z = !(c1891AtA.A00 == c1890At8.A00.A00);
                if (zA1N) {
                    C1890At8.A03(c1891AtA.A02(), (At0) mutableState2.getValue(), C1891AtA.A00(c1891AtA, null, 15), c1890At8, C79.A0C);
                }
                C1890At8.A04(c1891AtA, c1890At8, zA1N, z);
                MutableState.A09(false, mutableState);
                C1890At8.A06(c1890At8, false);
            } catch (Throwable th) {
                MutableState.A09(false, mutableState);
                C1890At8.A06(c1890At8, false);
                throw th;
            }
        } finally {
            Snapshot.A07(snapshotA03, snapshotA04, g0uA1F);
        }
    }
}
