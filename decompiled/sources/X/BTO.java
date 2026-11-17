package X;

import androidx.compose.runtime.MutableState;
import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BTO implements Ht9, G0U {
    public final int $t;
    public final float A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public BTO(Object obj, Object obj2, Object obj3, float f, int i) {
        this.$t = i;
        this.A00 = f;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj3;
    }

    @Override // X.G0U
    public final Object invoke(Object obj) {
        float fAcG;
        float fA07;
        float fAcG2;
        float fAcG3;
        int i = this.$t;
        float f = this.A00;
        C1051ASv c1051ASv = (C1051ASv) this.A01;
        switch (i) {
            case 0:
                AcX acX = (AcX) this.A02;
                C1051ASv c1051ASv2 = (C1051ASv) this.A03;
                ATT att = (ATT) obj;
                MutableState mutableState = att.A06;
                if ((C8j3.A07(mutableState) < f && c1051ASv.element > f) || (C8j3.A07(mutableState) > f && c1051ASv.element < f)) {
                    float fA072 = C8j3.A07(mutableState);
                    if (f == 0.0f) {
                        fA072 = 0.0f;
                    } else if (f <= 0.0f ? fA072 < f : fA072 > f) {
                        fA072 = f;
                    }
                    G0U<V, T> g0u = ((AOl) att.A04).A00;
                    acX.A9C(fA072, AnonymousClass001.A02(g0u.invoke(att.A02)));
                    c1051ASv2.element = Float.isNaN(AnonymousClass001.A02(g0u.invoke(att.A02))) ? 0.0f : AnonymousClass001.A02(g0u.invoke(att.A02));
                    c1051ASv.element = fA072;
                    att.A00();
                    break;
                } else {
                    float fA073 = C8j3.A07(mutableState);
                    G0U<V, T> g0u2 = ((AOl) att.A04).A00;
                    acX.A9C(fA073, AnonymousClass001.A02(g0u2.invoke(att.A02)));
                    c1051ASv2.element = AnonymousClass001.A02(g0u2.invoke(att.A02));
                    c1051ASv.element = C8j3.A07(mutableState);
                    break;
                }
                break;
            case 1:
                C3Q0 c3q0 = (C3Q0) this.A02;
                G0U g0u3 = (G0U) this.A03;
                ATT att2 = (ATT) obj;
                MutableState mutableState2 = att2.A06;
                float fAbs = Math.abs(C8j3.A07(mutableState2));
                float fAbs2 = Math.abs(f);
                Number number = (Number) mutableState2.getValue();
                if (fAbs >= fAbs2) {
                    fA07 = number.floatValue();
                    if (f == 0.0f) {
                        fA07 = 0.0f;
                    } else if (f <= 0.0f ? fA07 < f : fA07 > f) {
                        fA07 = f;
                    }
                    float f2 = fA07 - c1051ASv.element;
                    try {
                        fAcG2 = c3q0.AcG(f2);
                    } catch (CancellationException unused) {
                        att2.A00();
                        fAcG2 = 0.0f;
                    }
                    g0u3.invoke(Float.valueOf(fAcG2));
                    if (C8j3.A01(f2, fAcG2) > 0.5f) {
                        att2.A00();
                    }
                    att2.A00();
                } else {
                    float fFloatValue = number.floatValue() - c1051ASv.element;
                    try {
                        fAcG = c3q0.AcG(fFloatValue);
                    } catch (CancellationException unused2) {
                        att2.A00();
                        fAcG = 0.0f;
                    }
                    g0u3.invoke(Float.valueOf(fAcG));
                    if (C8j3.A01(fFloatValue, fAcG) > 0.5f) {
                        att2.A00();
                    }
                    fA07 = C8j3.A07(mutableState2);
                }
                c1051ASv.element = fA07;
                break;
            default:
                C3Q0 c3q02 = (C3Q0) this.A02;
                G0U g0u4 = (G0U) this.A03;
                ATT att3 = (ATT) obj;
                MutableState mutableState3 = att3.A06;
                float fA074 = C8j3.A07(mutableState3);
                if (f == 0.0f) {
                    fA074 = 0.0f;
                } else if (f <= 0.0f ? fA074 < f : fA074 > f) {
                    fA074 = f;
                }
                float f3 = fA074 - c1051ASv.element;
                try {
                    fAcG3 = c3q02.AcG(f3);
                } catch (CancellationException unused3) {
                    att3.A00();
                    fAcG3 = 0.0f;
                }
                g0u4.invoke(Float.valueOf(fAcG3));
                if (C8j3.A01(f3, fAcG3) > 0.5f || fA074 != C8j3.A07(mutableState3)) {
                    att3.A00();
                }
                fA07 = c1051ASv.element + fAcG3;
                c1051ASv.element = fA07;
                break;
        }
        return Unit.INSTANCE;
    }
}
