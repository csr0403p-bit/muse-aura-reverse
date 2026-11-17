package X;

import com.facebook.battery.metrics.core.ProcFileReader$ParseException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes5.dex */
public final class DMJ {
    public char A00;
    public char A01;
    public int A02;
    public RandomAccessFile A04;
    public int A03 = -1;
    public boolean A05 = true;
    public boolean A06 = false;
    public final byte[] A07 = new byte[512];

    public static final void A01(DMJ dmj) {
        RandomAccessFile randomAccessFile = dmj.A04;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            } finally {
                dmj.A04 = null;
            }
        }
    }

    public static final boolean A02(DMJ dmj) {
        RandomAccessFile randomAccessFile;
        if (dmj.A05 && (randomAccessFile = dmj.A04) != null) {
            int i = dmj.A03;
            int i2 = dmj.A02;
            if (i <= i2 - 1) {
                if (i < i2 - 1) {
                    return true;
                }
                try {
                    dmj.A02 = randomAccessFile.read(dmj.A07);
                    dmj.A03 = -1;
                } catch (IOException unused) {
                    dmj.A05 = false;
                    A01(dmj);
                }
                return A02(dmj);
            }
        }
        return false;
    }

    public final void A03() {
        boolean z = false;
        while (A02(this)) {
            A00(this);
            if (this.A00 == ' ') {
                z = true;
            } else if (z) {
                if (this.A06) {
                    throw new ProcFileReader$ParseException("Can only rewind one step!");
                }
                this.A03--;
                this.A00 = this.A01;
                this.A06 = true;
                return;
            }
        }
    }

    public static void A00(DMJ dmj) {
        if (!A02(dmj)) {
            throw C8j3.A1D();
        }
        int i = dmj.A03 + 1;
        dmj.A03 = i;
        dmj.A01 = dmj.A00;
        dmj.A00 = (char) dmj.A07[i];
        dmj.A06 = false;
    }

    public final void finalize() {
        A01(this);
    }
}
