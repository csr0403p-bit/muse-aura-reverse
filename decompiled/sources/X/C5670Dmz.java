package X;

import com.facebook.video.heroplayer.setting.HeroPlayerSetting;

/* renamed from: X.Dmz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5670Dmz implements InterfaceC5965Dt6 {
    public long A00;
    public float A02;
    public final int A04;
    public final int A05;
    public final HeroPlayerSetting A06;
    public long A03 = -9223372036854775807L;
    public Integer A01 = C79.A00;

    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004d  */
    @Override // X.InterfaceC5965Dt6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float AHx(X.DmT r11, float r12, int r13) {
        /*
            Method dump skipped, instructions count: 193
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5670Dmz.AHx(X.DmT, float, int):float");
    }

    public C5670Dmz(HeroPlayerSetting heroPlayerSetting) {
        this.A06 = heroPlayerSetting;
        this.A04 = heroPlayerSetting.scalingBufferErrorMs;
        this.A05 = heroPlayerSetting.timeBetweenPIDSamplesMs;
        this.A02 = heroPlayerSetting.pidParameterMultiplierInitial;
    }
}
