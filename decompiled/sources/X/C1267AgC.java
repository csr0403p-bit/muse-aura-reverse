package X;

import android.content.Context;
import android.widget.EdgeEffect;

/* renamed from: X.AgC, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1267AgC {
    public long A00 = 0;
    public EdgeEffect A01;
    public EdgeEffect A02;
    public EdgeEffect A03;
    public EdgeEffect A04;
    public EdgeEffect A05;
    public EdgeEffect A06;
    public EdgeEffect A07;
    public EdgeEffect A08;
    public final int A09;
    public final Context A0A;

    public static final boolean A01(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !(C1268AgD.A00(edgeEffect) == 0.0f);
    }

    public static final EdgeEffect A00(C1267AgC c1267AgC, EnumC1108AYu enumC1108AYu) {
        int i;
        long j;
        EdgeEffect edgeEffectA02 = C1268AgD.A02(c1267AgC.A0A);
        edgeEffectA02.setColor(c1267AgC.A09);
        long j2 = c1267AgC.A00;
        if (j2 != 0) {
            if (enumC1108AYu == EnumC1108AYu.A03) {
                i = (int) (j2 >> 32);
                j = j2 & 4294967295L;
            } else {
                i = (int) (4294967295L & j2);
                j = j2 >> 32;
            }
            edgeEffectA02.setSize(i, (int) j);
        }
        return edgeEffectA02;
    }

    public final EdgeEffect A02() {
        EdgeEffect edgeEffect = this.A01;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA00 = A00(this, EnumC1108AYu.A03);
        this.A01 = edgeEffectA00;
        return edgeEffectA00;
    }

    public final EdgeEffect A03() {
        EdgeEffect edgeEffect = this.A03;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA00 = A00(this, EnumC1108AYu.A02);
        this.A03 = edgeEffectA00;
        return edgeEffectA00;
    }

    public final EdgeEffect A04() {
        EdgeEffect edgeEffect = this.A05;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA00 = A00(this, EnumC1108AYu.A02);
        this.A05 = edgeEffectA00;
        return edgeEffectA00;
    }

    public final EdgeEffect A05() {
        EdgeEffect edgeEffect = this.A07;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA00 = A00(this, EnumC1108AYu.A03);
        this.A07 = edgeEffectA00;
        return edgeEffectA00;
    }

    public C1267AgC(Context context, int i) {
        this.A0A = context;
        this.A09 = i;
    }
}
