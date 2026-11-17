package X;

import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* renamed from: X.Dlk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5605Dlk {
    public DF8 A00;
    public final DwB A01;
    public final DFE A02;
    public final InterfaceC6083DvN A03;
    public final C5092DXa A04;
    public final InterfaceC5637DmL A05;
    public final InterfaceC6101Dvg A06;
    public final Dn5 A07;
    public final BZQ A08;
    public final HeroPlayerSetting A09;
    public final InterfaceC6113Dvs A0A;
    public final InterfaceC6117Dvw A0B;
    public final AtomicReference<DVC> A0C;
    public final AtomicReference A0D;
    public final AtomicReference A0E;
    public volatile C5601Dlg A0F;

    public static final C5831DqK A00(Dlv dlv) {
        return new C5831DqK(dlv.moq_prefetch_mode, dlv.moq_preload_max_duration_ms, dlv.moq_preload_max_bytes, dlv.moq_preload_max_sessions, dlv.moq_preload_max_handoff_age_ms, dlv.moq_preload_max_handoff_backlog_ms, dlv.moq_min_throughput_bps, dlv.moq_throughput_estimate_max_age_ms, dlv.moq_warmup_follow_live_head, dlv.moq_prefetch_decouple_warmup);
    }

    public C5605Dlk(DwB dwB, DFE dfe, C5092DXa c5092DXa, final InterfaceC5637DmL interfaceC5637DmL, BZQ bzq, HeroPlayerSetting heroPlayerSetting, InterfaceC6113Dvs interfaceC6113Dvs, AtomicReference atomicReference, AtomicReference atomicReference2, AtomicReference atomicReference3) {
        this.A09 = heroPlayerSetting;
        this.A0D = atomicReference;
        this.A0A = interfaceC6113Dvs;
        this.A08 = bzq;
        this.A04 = c5092DXa;
        this.A01 = dwB;
        this.A02 = dfe;
        this.A0C = atomicReference2;
        this.A0E = atomicReference3;
        this.A05 = interfaceC5637DmL;
        Dlv dlv = heroPlayerSetting.gen;
        AtomicLong atomicLong = C5601Dlg.A08;
        C7384Etj.A0Y(dlv, 0);
        if (dlv.enable_moq_media_source && (dlv.moq_prefetch_mode != 0 || dlv.moq_warmup_follow_live_head || dlv.moq_min_throughput_bps != 0)) {
            C5831DqK c5831DqKA00 = A00(dlv);
            if (c5831DqKA00.A03 || c5831DqKA00.A01 || c5831DqKA00.A00 != 0) {
                Dlv dlv2 = heroPlayerSetting.gen;
                Supplier supplier = new Supplier() { // from class: X.Dru
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return InterfaceC6099Dve.A00;
                    }
                };
                C7384Etj.A0Y(dlv2, 0);
                this.A0F = new C5601Dlg(c5092DXa, A00(dlv2), supplier, dlv2.enable_moq_media_source);
            }
        }
        this.A0B = interfaceC5637DmL.eventLoggerFactory();
        this.A06 = interfaceC5637DmL.hlsMediaSourceFactory();
        Dlv dlv3 = heroPlayerSetting.gen;
        this.A07 = Dn5.A00(dlv3.dav1d_cross_video_health_mode, dlv3.dav1d_cross_video_progressive_fallback_mode) > 0 ? new Dn5() : null;
        this.A03 = heroPlayerSetting.abrSetting.enableAbrMonitorObserverInjection ? interfaceC5637DmL.abrMonitorObserverFactory(heroPlayerSetting) : InterfaceC6083DvN.A00;
    }
}
