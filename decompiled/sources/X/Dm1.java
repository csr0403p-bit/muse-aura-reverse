package X;

import android.os.Trace;
import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class Dm1 implements Runnable {
    public static final String __redex_internal_original_name = "HeroServicePlayer$1";
    public final /* synthetic */ DmR A00;
    public final /* synthetic */ Dlw A01;

    public Dm1(DmR dmR, Dlw dlw) {
        this.A00 = dmR;
        this.A01 = dlw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Dlw dlw = this.A01;
        DmR dmR = this.A00;
        Trace.beginSection("HeroServicePlayer.createOrInitExoPlayer");
        try {
            Dlw.A0s(dlw, "Create new ExoPlayer");
            HeroPlayerSetting heroPlayerSetting = dlw.A2C;
            C5917Ds1 c5917Ds1 = heroPlayerSetting.unstallBufferSetting;
            C5794Dpe c5794Dpe = new C5794Dpe();
            C5437DiY c5437DiY = new C5437DiY(c5794Dpe);
            dlw.A0p = new C6134Dwc();
            C5622Dm5 c5622Dm5 = heroPlayerSetting.gen.enable_player_warning_logging_via_hero_listener ? dlw.A2A : null;
            String str2 = dmR.A03.A0Q;
            AtomicReference atomicReference = dlw.A1F;
            C5605Dlk c5605Dlk = dlw.A27;
            ServiceEventCallbackImpl serviceEventCallbackImpl = new ServiceEventCallbackImpl(c5605Dlk.A02, c5622Dm5, str2, atomicReference);
            Dlv dlv = heroPlayerSetting.gen;
            serviceEventCallbackImpl.A02 = dlv.enable_video_issue_detected_flytrap_logging;
            serviceEventCallbackImpl.A01 = dlv.video_issue_detected_callback_blocklist;
            if (dlv.add_av1_issue_callback) {
                C5622Dm5 c5622Dm52 = dlw.A2A;
                c5622Dm52.getClass();
                serviceEventCallbackImpl.A00 = new DFH(c5622Dm52);
            }
            HashMap mapA0u = BV4.A0u();
            String str3 = dmR.A09;
            if (str3 != null && !str3.isEmpty()) {
                mapA0u.put("session_id", FGI.A0U(str3, "_", Long.toString(Dlw.A01(dlw))));
            }
            C4904DDx c4904DDx = dmR.A03;
            if (c4904DDx != null && (str = c4904DDx.A0Q) != null) {
                mapA0u.put("asset_id", str);
            }
            DEY dey = new DEY(heroPlayerSetting.gen.evaluate_debug_event_extras);
            dlw.A0o = dey;
            C5619Dm2 c5619Dm2 = new C5619Dm2(dlw.A0f, serviceEventCallbackImpl, dey, dmR, c5605Dlk, heroPlayerSetting);
            dlw.A0y = c5619Dm2;
            dlw.A2j = new C5615Dlu(dlw.A0e, dlw.A0g, dlw.A0m, dlw.A0o, dlw.A0p, c5437DiY, dmR, c5605Dlk, dlw.A29, dlw, c5619Dm2, serviceEventCallbackImpl, dlw.A2B, c5917Ds1, dlw.A1E, dlw.A2G, dlw.A2E, dlw.A2F, atomicReference);
            dlw.A0v = new C5621Dm4(dlw);
            dlw.A2j.A0a(dlw.A0v);
            if (heroPlayerSetting.gen.moq_upstream_stall_resubscribe_ms > 0) {
                dlw.A2j.A12 = new BWD(dlw);
            }
            dlw.A2i = new C5617Dly(dlw.A0o, c5794Dpe, c5437DiY, dlw.A23, dmR, c5605Dlk, dlw.A2A, dlw.A0y, dlw.A2j, heroPlayerSetting);
            Dlw.A0h(dlw);
            dlw.A2h = new C5658Dmn(dmR, dlw.A2j, heroPlayerSetting);
        } finally {
            Trace.endSection();
        }
    }
}
