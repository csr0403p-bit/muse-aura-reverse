package X;

import android.os.SystemClock;
import android.util.Pair;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.Dmb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5647Dmb {
    public long A00;
    public long A01;
    public EnumC5743Doe A02;
    public final C5605Dlk A03;
    public final HeroPlayerSetting A04;
    public final DmR A08;
    public final Map<EnumC5743Doe, List<C5827DqG>> A07 = BV4.A0u();
    public final List<Long> A05 = C3cG.A0h();
    public final List<Pair<EnumC5743Doe, Long>> A06 = C3cG.A0h();

    public static void A00(C5647Dmb c5647Dmb) {
        int i;
        int i2;
        int i3;
        int i4;
        Map<EnumC5743Doe, List<C5827DqG>> map = c5647Dmb.A07;
        EnumC5743Doe enumC5743Doe = EnumC5743Doe.A05;
        C5092DXa c5092DXa = c5647Dmb.A03.A04;
        boolean zA02 = c5092DXa.A02();
        HeroPlayerSetting heroPlayerSetting = c5647Dmb.A04;
        if (zA02) {
            i = heroPlayerSetting.liveJumpByTrimBufferThresholdMs;
            i2 = heroPlayerSetting.liveJumpByTrimBufferTargetMs;
        } else {
            i = heroPlayerSetting.liveOnCellJumpByTrimBufferThresholdMs;
            i2 = heroPlayerSetting.liveOnCellJumpByTrimBufferTargetMs;
        }
        if (i2 < 0 || i <= i2) {
            i2 = 10000;
            if (zA02) {
                i2 = 6000;
            }
        }
        Integer num = C79.A01;
        C5827DqG c5827DqG = new C5827DqG(c5647Dmb, num, i2);
        boolean zA022 = c5092DXa.A02();
        if (zA022) {
            i3 = heroPlayerSetting.liveJumpByTrimBufferThresholdMs;
            i4 = heroPlayerSetting.liveJumpByTrimBufferTargetMs;
        } else {
            i3 = heroPlayerSetting.liveOnCellJumpByTrimBufferThresholdMs;
            i4 = heroPlayerSetting.liveOnCellJumpByTrimBufferTargetMs;
        }
        if (i4 < 0 || i3 <= i4) {
            i3 = 25000;
            if (zA022) {
                i3 = 20000;
            }
        }
        Integer num2 = C79.A00;
        map.put(enumC5743Doe, Arrays.asList(c5827DqG, new C5827DqG(c5647Dmb, num2, i3)));
        map.put(EnumC5743Doe.A04, Arrays.asList(new C5827DqG(c5647Dmb, num, 6000), new C5827DqG(c5647Dmb, num2, 20000)));
        map.put(EnumC5743Doe.A06, Collections.singletonList(new C5827DqG(c5647Dmb, num, 4200)));
        map.put(EnumC5743Doe.A03, Collections.singletonList(new C5827DqG(c5647Dmb, num, 4000)));
    }

    public C5647Dmb(DmR dmR, C5605Dlk c5605Dlk, HeroPlayerSetting heroPlayerSetting) {
        SystemClock.elapsedRealtime();
        this.A01 = -9223372036854775807L;
        this.A00 = 3600000L;
        this.A04 = heroPlayerSetting;
        this.A03 = c5605Dlk;
        this.A08 = dmR;
        A00(this);
    }
}
