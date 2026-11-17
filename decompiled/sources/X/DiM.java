package X;

import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.List;

/* loaded from: classes5.dex */
public final class DiM extends AbstractC5434DiV implements InterfaceC5546DkO {
    public float A00;
    public int A01;
    public int A02;
    public C5505Djh A03;
    public InterfaceC5478DjF A04;
    public C5435DiW A05;
    public C5619Dm2 A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final InterfaceC5385Dhc A0A;
    public final C3083BxP A0B;
    public final HeroPlayerSetting A0C;

    @Override // X.InterfaceC5441Dic
    public final int AKG() {
        return this.A01;
    }

    @Override // X.InterfaceC5441Dic
    public final Object AKJ() {
        return this.A05;
    }

    @Override // X.InterfaceC5441Dic
    public final int AKK() {
        return this.A02;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000a  */
    @Override // X.InterfaceC5441Dic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AUa(boolean r4) {
        /*
            r3 = this;
            boolean r0 = r3.A09
            r2 = 1
            if (r0 != 0) goto La
            boolean r1 = r3.A08
            r0 = 0
            if (r1 == r4) goto Lb
        La:
            r0 = 1
        Lb:
            r3.A09 = r0
            r3.A07 = r2
            r3.A08 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DiM.AUa(boolean):void");
    }

    /* JADX WARN: Incorrect types in method signature: (JLX/Di6;Ljava/util/List<+LX/DiB;>;)Z */
    @Override // X.InterfaceC5441Dic
    public final boolean AfM(AbstractC5411Di6 abstractC5411Di6, List list, long j) {
        if (!this.A09) {
            return false;
        }
        this.A09 = false;
        return !this.A08;
    }

    public DiM(C5382DhZ c5382DhZ, InterfaceC5478DjF interfaceC5478DjF, InterfaceC5385Dhc interfaceC5385Dhc, C5619Dm2 c5619Dm2, C3083BxP c3083BxP, HeroPlayerSetting heroPlayerSetting, int[] iArr) {
        super(c5382DhZ, iArr);
        this.A00 = 1.0f;
        this.A04 = interfaceC5478DjF;
        this.A0C = heroPlayerSetting;
        this.A06 = c5619Dm2;
        this.A0A = interfaceC5385Dhc;
        this.A0B = c3083BxP;
        this.A08 = false;
        this.A09 = false;
        this.A07 = false;
    }

    @Override // X.InterfaceC5441Dic
    public final void AUe(float f) {
        this.A00 = f;
    }

    /* JADX WARN: Incorrect types in method signature: (JJJLjava/util/List<+LX/DiB;>;[LX/Di8;)V */
    @Override // X.InterfaceC5441Dic
    public final void Ai3(List list, InterfaceC5412Di8[] interfaceC5412Di8Arr, long j, long j2, long j3) {
    }
}
