package X;

/* loaded from: classes5.dex */
public final class DMG implements InterfaceC3585CVk<DMF> {
    @Override // X.InterfaceC3585CVk
    public final /* bridge */ /* synthetic */ void Ab5(AbstractC3582CVd abstractC3582CVd, DMN dmn) {
        DMF dmf = (DMF) abstractC3582CVd;
        C7384Etj.A0Y(dmf, 0);
        long j = dmf.realtimeMs;
        if (j != 0) {
            dmn.A3B("realtime_ms", j);
        }
        long j2 = dmf.uptimeMs;
        if (j2 != 0) {
            dmn.A3B("uptime_ms", j2);
        }
    }
}
