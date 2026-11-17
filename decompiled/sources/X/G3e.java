package X;

import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;

/* loaded from: classes6.dex */
public final class G3e {
    public int A00 = 0;
    public int A01;
    public int A02;
    public int A03;
    public int A04;

    public final boolean A00() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.A00;
        if ((i5 & 7) != 0) {
            int i6 = this.A02;
            int i7 = this.A04;
            if (i6 > i7) {
                i4 = 1;
            } else {
                i4 = 4;
                if (i6 == i7) {
                    i4 = 2;
                }
            }
            if ((i4 & i5) == 0) {
                return false;
            }
        }
        if ((i5 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) != 0) {
            int i8 = this.A02;
            int i9 = this.A03;
            if (i8 > i9) {
                i3 = 1;
            } else {
                i3 = 4;
                if (i8 == i9) {
                    i3 = 2;
                }
            }
            if (((i3 << 4) & i5) == 0) {
                return false;
            }
        }
        if ((i5 & 1792) != 0) {
            int i10 = this.A01;
            int i11 = this.A04;
            if (i10 > i11) {
                i2 = 1;
            } else {
                i2 = 4;
                if (i10 == i11) {
                    i2 = 2;
                }
            }
            if (((i2 << 8) & i5) == 0) {
                return false;
            }
        }
        if ((i5 & 28672) == 0) {
            return true;
        }
        int i12 = this.A01;
        int i13 = this.A03;
        if (i12 > i13) {
            i = 1;
        } else {
            i = 4;
            if (i12 == i13) {
                i = 2;
            }
        }
        return (i5 & (i << 12)) != 0;
    }
}
