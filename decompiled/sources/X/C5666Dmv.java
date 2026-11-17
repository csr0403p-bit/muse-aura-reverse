package X;

import android.os.Trace;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;

/* renamed from: X.Dmv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5666Dmv implements InterfaceC5745Dog {
    public InterfaceC5745Dog A00;
    public final Dlw A02;
    public final HeroPlayerSetting A03;
    public Integer A01 = C79.A00;
    public volatile boolean A04 = true;

    @Override // X.InterfaceC5745Dog
    public final void AUu(E6Y e6y) {
        this.A04 = false;
        this.A00.AUu(e6y);
    }

    @Override // X.InterfaceC5745Dog
    public final void AWJ(E6Y e6y) {
        this.A04 = true;
        this.A00.AWJ(e6y);
        if (this.A03.gen.enable_exo_player_reuse) {
            Dlw dlw = this.A02;
            Trace.beginSection("HeroServicePlayer.refreshPlayerState");
            try {
                Dlw.A0T(dlw.A0f, dlw, 56);
            } finally {
                Trace.endSection();
            }
        }
    }

    @Override // X.InterfaceC5745Dog
    public final InterfaceC5538DkF ACN() {
        return this.A00.ACN();
    }

    @Override // X.InterfaceC5745Dog
    public final long ACi(E6Y e6y) {
        return this.A00.ACi(e6y);
    }

    @Override // X.InterfaceC5745Dog
    public final void AVG(E6Y e6y) {
        this.A00.AVG(e6y);
    }

    @Override // X.InterfaceC5745Dog
    public final void AWf(C5820Dq6 c5820Dq6, C5414DiA c5414DiA, InterfaceC5441Dic[] interfaceC5441DicArr) {
        this.A00.AWf(c5820Dq6, c5414DiA, interfaceC5441DicArr);
    }

    @Override // X.InterfaceC5745Dog
    public final boolean Abj(E6Y e6y) {
        return this.A00.Abj(e6y);
    }

    @Override // X.InterfaceC5745Dog
    public final boolean AfO(C5820Dq6 c5820Dq6) {
        return this.A00.AfO(c5820Dq6);
    }

    @Override // X.InterfaceC5745Dog
    public final /* synthetic */ boolean AfP() {
        CNC.A04("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    @Override // X.InterfaceC5745Dog
    public final boolean Afb(C5820Dq6 c5820Dq6) {
        boolean zAfb = this.A00.Afb(c5820Dq6);
        if (!zAfb) {
            this.A01 = C79.A0W;
        }
        return zAfb;
    }

    public C5666Dmv(InterfaceC5745Dog interfaceC5745Dog, Dlw dlw, HeroPlayerSetting heroPlayerSetting) {
        this.A00 = interfaceC5745Dog;
        this.A02 = dlw;
        this.A03 = heroPlayerSetting;
    }
}
