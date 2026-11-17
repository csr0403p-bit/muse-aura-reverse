package X;

/* renamed from: X.AiL, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1390AiL implements C2av {
    public float A01;
    public float A02;
    public float A03;
    public float A06;
    public float A07;
    public float A08;
    public int A09;
    public int A0A;
    public int A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public AbstractC1555AlK A0G;
    public AbstractC1408Aid A0H;
    public C1DM A0I;
    public AXN A0J;
    public EnumC1820Arj A0K;
    public boolean A0L;
    public float A04 = 1.0f;
    public float A05 = 1.0f;
    public float A00 = 1.0f;

    @Override // X.AXN
    public final /* synthetic */ float Agy(int i) {
        return i / this.A0J.AEm();
    }

    public final void A00() {
        AeX(1.0f);
        AeY(1.0f);
        Acj(1.0f);
        Af5(0.0f);
        Af6(0.0f);
        Aef(0.0f);
        long j = C0er.A00;
        Acl(j);
        Aej(j);
        AeV(0.0f);
        AeW(0.0f);
        if (this.A01 != 8.0f) {
            this.A0B |= 2048;
            this.A01 = 8.0f;
        }
        Af4(C15k.A01);
        Aeg(C1OM.A00);
        Ad2(false);
        AeM(null);
        if (this.A09 != 3) {
            this.A0B |= 524288;
            this.A09 = 3;
        }
        Ad7(0);
        this.A0D = 9205357640488583168L;
        this.A0G = null;
        this.A0B = 0;
    }

    @Override // X.AXN
    public final float AEm() {
        return this.A0J.AEm();
    }

    @Override // X.C0dm
    public final float AFo() {
        return this.A0J.AFo();
    }

    @Override // X.C2av
    public final void Acj(float f) {
        if (this.A00 != f) {
            this.A0B |= 4;
            this.A00 = f;
        }
    }

    @Override // X.C2av
    public final void Acl(long j) {
        long j2 = this.A0C;
        long j3 = B6A.A01;
        if (j2 != j) {
            this.A0B |= 64;
            this.A0C = j;
        }
    }

    @Override // X.C2av
    public final void Ad2(boolean z) {
        if (this.A0L != z) {
            this.A0B |= 16384;
            this.A0L = z;
        }
    }

    @Override // X.C2av
    public final void Ad7(int i) {
        if (this.A0A != i) {
            this.A0B |= 32768;
            this.A0A = i;
        }
    }

    @Override // X.C2av
    public final void AeM(AbstractC1408Aid abstractC1408Aid) {
        if (C7384Etj.areEqual(this.A0H, abstractC1408Aid)) {
            return;
        }
        this.A0B |= 131072;
        this.A0H = abstractC1408Aid;
    }

    @Override // X.C2av
    public final void AeV(float f) {
        if (this.A02 != f) {
            this.A0B |= 256;
            this.A02 = f;
        }
    }

    @Override // X.C2av
    public final void AeW(float f) {
        if (this.A03 != f) {
            this.A0B |= 1024;
            this.A03 = f;
        }
    }

    @Override // X.C2av
    public final void AeX(float f) {
        if (this.A04 != f) {
            this.A0B |= 1;
            this.A04 = f;
        }
    }

    @Override // X.C2av
    public final void AeY(float f) {
        if (this.A05 != f) {
            this.A0B |= 2;
            this.A05 = f;
        }
    }

    @Override // X.C2av
    public final void Aef(float f) {
        if (this.A06 != f) {
            this.A0B |= 32;
            this.A06 = f;
        }
    }

    @Override // X.C2av
    public final void Aeg(C1DM c1dm) {
        if (C7384Etj.areEqual(this.A0I, c1dm)) {
            return;
        }
        this.A0B |= 8192;
        this.A0I = c1dm;
    }

    @Override // X.C2av
    public final void Aej(long j) {
        long j2 = this.A0E;
        long j3 = B6A.A01;
        if (j2 != j) {
            this.A0B |= 128;
            this.A0E = j;
        }
    }

    @Override // X.C2av
    public final void Af4(long j) {
        long j2 = this.A0F;
        long j3 = C15k.A01;
        if (j2 != j) {
            this.A0B |= 4096;
            this.A0F = j;
        }
    }

    @Override // X.C2av
    public final void Af5(float f) {
        if (this.A07 != f) {
            this.A0B |= 8;
            this.A07 = f;
        }
    }

    @Override // X.C2av
    public final void Af6(float f) {
        if (this.A08 != f) {
            this.A0B |= 16;
            this.A08 = f;
        }
    }

    @Override // X.AXN
    public final /* synthetic */ float Agx(float f) {
        return f / this.A0J.AEm();
    }

    @Override // X.AXN
    public final /* synthetic */ float Ah4(float f) {
        return AXN.A01(this.A0J, f);
    }

    public C1390AiL() {
        long j = C0er.A00;
        this.A0C = j;
        this.A0E = j;
        this.A01 = 8.0f;
        this.A0F = C15k.A01;
        this.A0I = C1OM.A00;
        this.A0A = 0;
        this.A0D = 9205357640488583168L;
        this.A0J = new ATH(1.0f, 1.0f);
        this.A0K = EnumC1820Arj.A02;
        this.A09 = 3;
    }

    @Override // X.AXN
    public final /* synthetic */ int Abr(float f) {
        return ASU.A01(this, f);
    }

    @Override // X.C0dm
    public final /* synthetic */ float Agw(long j) {
        return AbstractC1499Ak6.A00(this, j);
    }

    @Override // X.AXN
    public final /* synthetic */ long Agz(long j) {
        return ASU.A02(this, j);
    }

    @Override // X.AXN
    public final /* synthetic */ float Ah3(long j) {
        return ASU.A00(j, this);
    }

    @Override // X.AXN
    public final /* synthetic */ long Ah6(long j) {
        return ASU.A03(this, j);
    }

    @Override // X.C0dm
    public final /* synthetic */ long Ah7(float f) {
        return AbstractC1499Ak6.A01(this, f);
    }

    @Override // X.AXN
    public final /* synthetic */ long Ah8(float f) {
        return AXN.A02(this, f);
    }

    @Override // X.AXN
    public final /* synthetic */ long Ah9(int i) {
        return AXN.A03(this, i);
    }
}
