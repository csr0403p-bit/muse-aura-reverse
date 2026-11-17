package X;

import com.facebook.acra.util.JavaProcFileReader;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;

/* renamed from: X.Dml, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5657Dml {
    public float A00;
    public float A01;
    public long A02;
    public boolean A03;
    public boolean A04;
    public final int A05;
    public final C5916Drz A06;
    public final C5793Dpc A07;
    public final C5615Dlu A08;
    public final HeroPlayerSetting A09;

    public C5657Dml(C5615Dlu c5615Dlu, HeroPlayerSetting heroPlayerSetting) {
        C7384Etj.A0Y(c5615Dlu, 1);
        this.A09 = heroPlayerSetting;
        this.A08 = c5615Dlu;
        this.A05 = heroPlayerSetting.vodStarvationControllerMode;
        int i = heroPlayerSetting.vodStarvationLowBufferMs;
        int i2 = heroPlayerSetting.vodStarvationHighBufferMs;
        float f = heroPlayerSetting.vodStarvationMinSpeed;
        this.A06 = new C5916Drz(i, i2, f);
        this.A07 = new C5793Dpc(f, heroPlayerSetting.vodStarvationBufferEmaAlpha, i, heroPlayerSetting.vodStarvationTtsLowMs, heroPlayerSetting.vodStarvationTtsHighMs);
        this.A00 = 1.0f;
        this.A02 = -9223372036854775807L;
        this.A01 = -1.0f;
    }

    public static final void A00(C5657Dml c5657Dml, float f, long j) {
        float fMin = Math.min(1.0f, f);
        float f2 = c5657Dml.A00;
        StringBuilder sbA0x = C60O.A0x("VodStarvationSpeed: speed ");
        sbA0x.append(f2);
        sbA0x.append(JavaProcFileReader.LS_SYMLINK_ARROW);
        sbA0x.append(f);
        sbA0x.append(" pitch=");
        sbA0x.append(fMin);
        AbstractC3426CMt.A04("HeroService", BV7.A0z(" bufferMs=", sbA0x, j), BV4.A1W());
        c5657Dml.A08.A0W(f, fMin);
        c5657Dml.A00 = f;
    }
}
