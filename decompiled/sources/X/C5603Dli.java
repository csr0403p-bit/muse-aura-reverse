package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import com.google.common.base.Supplier;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Dli, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5603Dli implements InterfaceC5665Dmu {
    public final Context A00;
    public final InterfaceC6101Dvg A01;
    public final ServiceEventCallbackImpl A02;
    public final C4900DDt A03;
    public final HeroPlayerSetting A04;

    @Override // X.InterfaceC5665Dmu
    public final /* synthetic */ void AbR() {
    }

    @Override // X.InterfaceC5665Dmu
    public final /* synthetic */ C5431DiS AC6() {
        return null;
    }

    @Override // X.InterfaceC5665Dmu
    public final /* synthetic */ C4908DEb AC8() {
        return null;
    }

    @Override // X.InterfaceC5665Dmu
    public final InterfaceC4913DEg ACm() {
        return null;
    }

    @Override // X.InterfaceC5665Dmu
    public final C5594DlX AEZ() {
        return null;
    }

    @Override // X.InterfaceC5665Dmu
    public final InterfaceC5745Dog AHA(DmR dmR, C5917Ds1 c5917Ds1, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, boolean z) {
        try {
            return new DmP();
        } catch (Exception e) {
            throw BV4.A0e(e);
        }
    }

    @Override // X.InterfaceC5665Dmu
    public final Dn1 AHc(C5678DnH c5678DnH) {
        C5608Dln c5608Dln;
        Supplier<Long> supplier = c5678DnH.A08;
        if (supplier.get() != null) {
            supplier.get();
        }
        try {
            HeroPlayerSetting heroPlayerSetting = this.A04;
            if (heroPlayerSetting.gen.enable_preload_in_hero_manager) {
                DmR dmR = c5678DnH.A04;
                String strA00 = DmR.A00(dmR, heroPlayerSetting);
                c5608Dln = new C5608Dln();
                Uri uri = dmR.A03.A08;
                if (uri == null) {
                    uri = Uri.EMPTY;
                }
                c5608Dln.A00 = uri;
                strA00.getClass();
                c5608Dln.A05 = strA00;
            } else {
                Uri uri2 = c5678DnH.A04.A03.A08;
                C5704Dnm c5704Dnm = C5704Dnm.A08;
                c5608Dln = new C5608Dln();
                c5608Dln.A00 = uri2;
            }
            c5608Dln.A00();
            return null;
        } catch (Exception e) {
            throw BV4.A0e(e);
        }
    }

    @Override // X.InterfaceC5665Dmu
    public final /* synthetic */ C5750Dol AJU() {
        return null;
    }

    @Override // X.InterfaceC5665Dmu
    public final /* synthetic */ InterfaceC4913DEg AKV() {
        return null;
    }

    @Override // X.InterfaceC5665Dmu
    public final InterfaceC5478DjF AMd(InterfaceC5683DnM interfaceC5683DnM, DmR dmR) {
        return new C5479DjG();
    }

    public C5603Dli(Context context, DDR ddr, InterfaceC6101Dvg interfaceC6101Dvg, C5596Dlb c5596Dlb, ServiceEventCallbackImpl serviceEventCallbackImpl, HeroPlayerSetting heroPlayerSetting, InterfaceC6113Dvs interfaceC6113Dvs) {
        this.A00 = context;
        this.A04 = heroPlayerSetting;
        this.A02 = serviceEventCallbackImpl;
        this.A01 = interfaceC6101Dvg;
        this.A03 = new C4900DDt(context, ddr, new DEY(heroPlayerSetting.gen.evaluate_debug_event_extras), c5596Dlb, serviceEventCallbackImpl, heroPlayerSetting, interfaceC6113Dvs);
    }

    @Override // X.InterfaceC5665Dmu
    public final /* synthetic */ C5506Dji AJv(DmR dmR) {
        return null;
    }

    @Override // X.InterfaceC5665Dmu
    public final void AdY(boolean z) {
    }

    @Override // X.InterfaceC5665Dmu
    public final /* synthetic */ void Ae3(C6031DuQ c6031DuQ) {
    }

    @Override // X.InterfaceC5665Dmu
    public final /* synthetic */ void Aee(C5515Djr c5515Djr) {
    }

    @Override // X.InterfaceC5665Dmu
    public final InterfaceC5478DjF ACX(InterfaceC5683DnM interfaceC5683DnM, DmR dmR) {
        return null;
    }
}
