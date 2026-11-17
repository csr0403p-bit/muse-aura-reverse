package X;

import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.ArrayDeque;

/* renamed from: X.DqH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5828DqH {
    public final ArrayDeque A00;

    public C5828DqH(HeroPlayerSetting heroPlayerSetting) {
        Dlv dlv = heroPlayerSetting.gen;
        this.A00 = new ArrayDeque(Math.max(1, dlv != null ? (int) dlv.warmup_surfacetexture_pool_size : 3));
    }
}
