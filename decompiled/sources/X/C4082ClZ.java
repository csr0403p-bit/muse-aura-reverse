package X;

import com.facebook.aura.lifecycle.AuraAppLifecycleManager;

/* renamed from: X.ClZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4082ClZ {
    public C4080ClS A00;
    public C4080ClS A01;
    public C4080ClS A02;
    public C4080ClS A03;
    public C4080ClS A04;
    public C4080ClS A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final InterfaceC4081ClT A09;
    public final InterfaceC4083Clb A0A;
    public final InterfaceC4083Clb A0B;

    public final C4080ClS A00(long j) {
        if (j == -3) {
            throw new IllegalArgumentException("got unset latency for event when scheduling upload!");
        }
        if (j == -2) {
            if (!AuraAppLifecycleManager.INSTANCE.isAppInForeground()) {
                C4080ClS c4080ClS = this.A01;
                if (c4080ClS != null) {
                    return c4080ClS;
                }
                C4079ClR backgroundParams = this.A0A.getBackgroundParams();
                C4080ClS c4080ClS2 = new C4080ClS(backgroundParams.A03, backgroundParams.A01);
                this.A01 = c4080ClS2;
                return c4080ClS2;
            }
            C4080ClS c4080ClS3 = this.A02;
            if (c4080ClS3 != null) {
                return c4080ClS3;
            }
            C4079ClR foregroundParams = this.A0A.getForegroundParams();
            C4080ClS c4080ClS4 = new C4080ClS(foregroundParams.A03, foregroundParams.A01);
            this.A02 = c4080ClS4;
            return c4080ClS4;
        }
        if (j == -1) {
            if (!AuraAppLifecycleManager.INSTANCE.isAppInForeground()) {
                C4080ClS c4080ClS5 = this.A03;
                if (c4080ClS5 != null) {
                    return c4080ClS5;
                }
                C4079ClR backgroundParams2 = this.A0B.getBackgroundParams();
                C4080ClS c4080ClS6 = new C4080ClS(backgroundParams2.A03, backgroundParams2.A01);
                this.A03 = c4080ClS6;
                return c4080ClS6;
            }
            C4080ClS c4080ClS7 = this.A04;
            if (c4080ClS7 != null) {
                return c4080ClS7;
            }
            C4079ClR foregroundParams2 = this.A0B.getForegroundParams();
            C4080ClS c4080ClS8 = new C4080ClS(foregroundParams2.A03, foregroundParams2.A01);
            this.A04 = c4080ClS8;
            return c4080ClS8;
        }
        if (j == -4) {
            C4080ClS c4080ClS9 = this.A05;
            if (c4080ClS9 != null) {
                return c4080ClS9;
            }
            long j2 = this.A08;
            C4080ClS c4080ClS10 = new C4080ClS(j2, this.A07 * j2);
            this.A05 = c4080ClS10;
            return c4080ClS10;
        }
        if (j != -5) {
            return new C4080ClS(j, this.A07 * j);
        }
        C4080ClS c4080ClS11 = this.A00;
        if (c4080ClS11 != null) {
            return c4080ClS11;
        }
        long j3 = this.A06;
        C4080ClS c4080ClS12 = new C4080ClS(j3, this.A07 * j3);
        this.A00 = c4080ClS12;
        return c4080ClS12;
    }

    public C4082ClZ(InterfaceC4081ClT interfaceC4081ClT, InterfaceC4083Clb interfaceC4083Clb, InterfaceC4083Clb interfaceC4083Clb2, long j, long j2, long j3) {
        this.A09 = interfaceC4081ClT;
        this.A0B = interfaceC4083Clb;
        this.A0A = interfaceC4083Clb2;
        this.A08 = j;
        this.A06 = j2;
        this.A07 = j3;
    }
}
