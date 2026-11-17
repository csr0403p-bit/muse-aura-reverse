package X;

import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import com.facebook.video.heroplayer.service.heroexoplayer2.HeroExoPlayer2InitHelper;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import org.json.JSONException;

/* renamed from: X.Doc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5741Doc {
    public InterfaceC6068Dv6[] A00 = new InterfaceC6068Dv6[0];
    public final HeroPlayerSetting A01;

    public static C6322E0x A00(C5615Dlu c5615Dlu, int i) {
        InterfaceC5661Dmq interfaceC5661Dmq = c5615Dlu.A04;
        InterfaceC6068Dv6 interfaceC6068Dv6 = c5615Dlu.A0i.A00[i];
        C6438E5q c6438E5q = (C6438E5q) interfaceC5661Dmq;
        C6438E5q.A0J(c6438E5q);
        return C6438E5q.A0D(c6438E5q, interfaceC6068Dv6);
    }

    public C5741Doc(DmR dmR, InterfaceC5860Dqu interfaceC5860Dqu, HeroExoPlayer2InitHelper heroExoPlayer2InitHelper, HeroPlayerSetting heroPlayerSetting, C5580Dky c5580Dky) throws UnsupportedDrmException, JSONException, ClassNotFoundException {
        this.A01 = heroPlayerSetting;
        A01(dmR, interfaceC5860Dqu, heroExoPlayer2InitHelper, c5580Dky);
    }

    public final void A01(DmR dmR, InterfaceC5860Dqu interfaceC5860Dqu, HeroExoPlayer2InitHelper heroExoPlayer2InitHelper, C5580Dky c5580Dky) throws UnsupportedDrmException, JSONException, ClassNotFoundException {
        InterfaceC6068Dv6[] interfaceC6068Dv6ArrA0E = heroExoPlayer2InitHelper.A0E(dmR, interfaceC5860Dqu, c5580Dky);
        this.A00 = interfaceC6068Dv6ArrA0E;
        Dlv dlv = this.A01.gen;
        if (dlv.enable_audio_codec_init_error_containment || dlv.enable_audio_codec_runtime_error_containment) {
            for (InterfaceC6068Dv6 interfaceC6068Dv6 : interfaceC6068Dv6ArrA0E) {
                if (interfaceC6068Dv6 instanceof C5620Dm3) {
                    ((C5620Dm3) interfaceC6068Dv6).A04(dmR);
                }
            }
        }
    }
}
