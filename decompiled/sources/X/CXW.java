package X;

import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Map;

/* loaded from: classes5.dex */
public final class CXW {
    public final InterfaceC5637DmL A00;
    public final HeroPlayerSetting A01;
    public final CXY A02;
    public final Map<String, String> A03;
    public final boolean A04;

    public CXW() {
        this(null, HeroPlayerSetting.A01, new CXY(), BV4.A0u(), true);
    }

    public CXW(InterfaceC5637DmL interfaceC5637DmL, HeroPlayerSetting heroPlayerSetting, CXY cxy, Map map, boolean z) {
        C7384Etj.A0Y(heroPlayerSetting, 1);
        this.A03 = map;
        this.A01 = heroPlayerSetting;
        this.A02 = cxy;
        this.A04 = z;
        this.A00 = interfaceC5637DmL;
    }
}
