package X;

import android.os.Handler;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.concurrent.Executor;

/* renamed from: X.Dpp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5805Dpp {
    public static volatile C5805Dpp A09;
    public final C5656Dmk A00;
    public final C5664Dmt A01;
    public final Handler A02;
    public final InterfaceC6109Dvo A03;
    public final C5616Dlx A04;
    public final DXW A05;
    public final C5668Dmx A06;
    public final HeroPlayerSetting A07;
    public final Executor A08;

    public C5805Dpp(Handler handler, InterfaceC6109Dvo interfaceC6109Dvo, C5616Dlx c5616Dlx, DXW dxw, C5668Dmx c5668Dmx, HeroPlayerSetting heroPlayerSetting, C5656Dmk c5656Dmk, C5664Dmt c5664Dmt, Executor executor) {
        this.A00 = c5656Dmk;
        this.A01 = c5664Dmt;
        this.A05 = dxw;
        this.A07 = heroPlayerSetting;
        this.A02 = handler;
        this.A04 = c5616Dlx;
        this.A06 = c5668Dmx;
        this.A03 = interfaceC6109Dvo;
        this.A08 = executor;
    }
}
