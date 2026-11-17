package X;

import com.facebook.aura.qpl.AuraQplNameProvider;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.quicklog.QuickPerformanceLoggerGKs;
import java.util.List;

/* loaded from: classes5.dex */
public final class DIU {
    public InterfaceC3472COx A00;
    public DHy A01;
    public QuickPerformanceLoggerGKs A02;
    public DIA A03;
    public F18 A04;
    public final AuraQplNameProvider A05;
    public final AwakeTimeSinceBootClock A06;
    public final InterfaceC7539F0o A07;
    public final DGY A08;
    public final DIF A09;
    public final InterfaceC4945DGj A0A;
    public final Integer A0B;
    public final List<DHp<?, ?>> A0C;
    public final List A0D;
    public final List<DJF> A0E;
    public final List<DI6> A0F;

    public DIU(AuraQplNameProvider auraQplNameProvider, AwakeTimeSinceBootClock awakeTimeSinceBootClock, InterfaceC7539F0o interfaceC7539F0o, DGY dgy, InterfaceC3472COx interfaceC3472COx, DIF dif, InterfaceC4945DGj interfaceC4945DGj, Integer num, F18 f18) {
        C60O.A1N(f18, 1, auraQplNameProvider);
        this.A0B = num;
        this.A04 = f18;
        this.A09 = dif;
        this.A06 = awakeTimeSinceBootClock;
        this.A07 = interfaceC7539F0o;
        this.A00 = interfaceC3472COx;
        this.A08 = dgy;
        this.A0A = interfaceC4945DGj;
        this.A05 = auraQplNameProvider;
        this.A0F = C3cG.A0h();
        this.A0E = C3cG.A0h();
        this.A0C = C3cG.A0h();
        this.A0D = C3cG.A0h();
    }

    public static final C7603F5q A00(DHp... dHpArr) {
        C7384Etj.A0Y(dHpArr, 0);
        int length = dHpArr.length;
        if (length == 0) {
            return null;
        }
        int[] iArr = new int[length];
        int i = 0;
        int i2 = 0;
        do {
            DHp dHp = dHpArr[i2];
            C7384Etj.A0X(dHp);
            iArr[i2] = dHp.getProviderTypeId();
            i2++;
        } while (i2 < length);
        DHp[] dHpArr2 = new DHp[Long.numberOfTrailingZeros(0L) + 1];
        do {
            DHp dHp2 = dHpArr[i];
            C7384Etj.A0X(dHp2);
            dHpArr2[dHp2.getProviderTypeId()] = dHp2;
            i++;
        } while (i < length);
        return new C7603F5q(new C4955DHq(iArr, dHpArr2), 5);
    }
}
