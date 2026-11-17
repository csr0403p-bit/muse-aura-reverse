package X;

import android.graphics.Color;
import java.util.Arrays;

/* renamed from: X.EGc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6567EGc {
    public int A00;
    public int A01;
    public boolean A02;
    public float[] A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C6567EGc c6567EGc = (C6567EGc) obj;
                if (this.A04 != c6567EGc.A04 || this.A05 != c6567EGc.A05) {
                }
            }
            return false;
        }
        return true;
    }

    private void A00() {
        int iA05;
        if (this.A02) {
            return;
        }
        int i = this.A05;
        int iA03 = EGb.A03(4.5f, -1, i);
        int iA032 = EGb.A03(3.0f, -1, i);
        if (iA03 == -1 || iA032 == -1) {
            int iA033 = EGb.A03(4.5f, -16777216, i);
            int iA034 = EGb.A03(3.0f, -16777216, i);
            if (iA033 == -1 || iA034 == -1) {
                this.A00 = iA03 != -1 ? EGb.A05(-1, iA03) : EGb.A05(-16777216, iA033);
                iA05 = iA032 != -1 ? EGb.A05(-1, iA032) : EGb.A05(-16777216, iA034);
            } else {
                this.A00 = EGb.A05(-16777216, iA033);
                iA05 = EGb.A05(-16777216, iA034);
            }
        } else {
            this.A00 = EGb.A05(-1, iA03);
            iA05 = EGb.A05(-1, iA032);
        }
        this.A01 = iA05;
        this.A02 = true;
    }

    public final float[] A01() {
        float[] fArr = this.A03;
        if (fArr == null) {
            fArr = new float[3];
            this.A03 = fArr;
        }
        EGb.A07(this.A08, this.A07, fArr, this.A06);
        return fArr;
    }

    public final int hashCode() {
        return (this.A05 * 31) + this.A04;
    }

    public C6567EGc(int i, int i2) {
        this.A08 = Color.red(i);
        this.A07 = Color.green(i);
        this.A06 = Color.blue(i);
        this.A05 = i;
        this.A04 = i2;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(C3cI.A0Y(this));
        sbA0w.append(" [RGB: #");
        BV4.A1N(sbA0w, this.A05);
        sbA0w.append("] [HSL: ");
        sbA0w.append(Arrays.toString(A01()));
        sbA0w.append("] [Population: ");
        sbA0w.append(this.A04);
        sbA0w.append("] [Title Text: #");
        A00();
        BV4.A1N(sbA0w, this.A01);
        sbA0w.append("] [Body Text: #");
        A00();
        BV4.A1N(sbA0w, this.A00);
        return BV5.A0o(sbA0w);
    }
}
