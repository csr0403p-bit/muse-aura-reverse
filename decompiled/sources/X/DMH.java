package X;

/* loaded from: classes5.dex */
public final class DMH implements InterfaceC3585CVk<DMK> {
    @Override // X.InterfaceC3585CVk
    public final /* bridge */ /* synthetic */ void Ab5(AbstractC3582CVd abstractC3582CVd, DMN dmn) {
        DMK dmk = (DMK) abstractC3582CVd;
        C7384Etj.A0Y(dmk, 0);
        double d = dmk.userTimeS;
        if (d != 0.0d) {
            dmn.A3A("cpu_user_time_s", d);
        }
        double d2 = dmk.systemTimeS;
        if (d2 != 0.0d) {
            dmn.A3A("cpu_system_time_s", d2);
        }
        double d3 = dmk.childUserTimeS;
        if (d3 != 0.0d) {
            dmn.A3A("child_cpu_user_time_s", d3);
        }
        double d4 = dmk.childSystemTimeS;
        if (d4 != 0.0d) {
            dmn.A3A("child_cpu_system_time_s", d4);
        }
    }
}
