package X;

import com.facebook.aura.devices.pairing.HatchDeviceBleManagerKt;

/* loaded from: classes5.dex */
public final class E3U {
    public int A00;
    public boolean A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public final byte[] A06 = new byte[10];

    public final void A00(E2K e2k) {
        if (this.A01) {
            return;
        }
        byte[] bArr = this.A06;
        e2k.AXi(bArr, 0, 10);
        e2k.AbN();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & HatchDeviceBleManagerKt.CHUNK_MAGIC) == 186) {
                if ((40 << ((bArr[(b & 255) == 187 ? '\t' : '\b'] >> 4) & 7)) != 0) {
                    this.A01 = true;
                }
            }
        }
    }

    public final void A01(DjB djB, InterfaceC5563Dkg interfaceC5563Dkg) {
        if (this.A00 > 0) {
            interfaceC5563Dkg.Abz(djB, this.A02, this.A04, this.A03, this.A05);
            this.A00 = 0;
        }
    }

    public final void A02(DjB djB, InterfaceC5563Dkg interfaceC5563Dkg, int i, int i2, int i3, long j) {
        if (!BV7.A1S(this.A03, i2 + i3)) {
            throw C3cG.A0Q(String.valueOf("TrueHD chunk samples must be contiguous in the sample queue."));
        }
        if (this.A01) {
            int i4 = this.A00;
            int i5 = i4 + 1;
            this.A00 = i5;
            if (i4 == 0) {
                this.A05 = j;
                this.A02 = i;
                this.A04 = 0;
            }
            this.A04 += i2;
            this.A03 = i3;
            if (i5 >= 16) {
                A01(djB, interfaceC5563Dkg);
            }
        }
    }
}
