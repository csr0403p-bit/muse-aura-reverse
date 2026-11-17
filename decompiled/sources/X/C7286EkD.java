package X;

/* renamed from: X.EkD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7286EkD {
    public long A00;
    public final InterfaceC7288EkF A01;

    public C7286EkD(InterfaceC7288EkF interfaceC7288EkF) {
        C7384Etj.A0Y(interfaceC7288EkF, 0);
        this.A01 = interfaceC7288EkF;
        this.A00 = -1L;
    }

    public final int A00(long j) {
        long j2 = this.A00;
        if (j2 == -1) {
            this.A00 = 0L;
            int frameCount = this.A01.getFrameCount();
            int i = 0;
            while (true) {
                j2 = this.A00;
                if (i >= frameCount) {
                    break;
                }
                this.A00 = j2 + r6.AFs(i);
                i++;
            }
        }
        long j3 = 0;
        if (j2 != 0) {
            if (this.A01.getLoopCount() != 0 && j / j2 >= r1.getLoopCount()) {
                return -1;
            }
            j3 = j % j2;
        }
        int i2 = 0;
        long jAFs = 0;
        while (true) {
            jAFs += this.A01.AFs(i2);
            int i3 = i2 + 1;
            if (j3 < jAFs) {
                return i2;
            }
            i2 = i3;
        }
    }

    public final long A01(long j) {
        long j2 = this.A00;
        if (j2 == -1) {
            this.A00 = 0L;
            int frameCount = this.A01.getFrameCount();
            int i = 0;
            while (true) {
                j2 = this.A00;
                if (i >= frameCount) {
                    break;
                }
                this.A00 = j2 + r6.AFs(i);
                i++;
            }
        }
        long jAFs = 0;
        if (j2 != 0) {
            InterfaceC7288EkF interfaceC7288EkF = this.A01;
            if (interfaceC7288EkF.getLoopCount() == 0 || j / j2 < interfaceC7288EkF.getLoopCount()) {
                long j3 = j % j2;
                int frameCount2 = interfaceC7288EkF.getFrameCount();
                for (int i2 = 0; i2 < frameCount2 && jAFs <= j3; i2++) {
                    jAFs += interfaceC7288EkF.AFs(i2);
                }
                return j + (jAFs - j3);
            }
        }
        return -1L;
    }
}
