package X;

import android.content.Context;
import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;

/* renamed from: X.DDt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4900DDt {
    public final Context A00;
    public final DDR A01;
    public final DEY A02;
    public final C5596Dlb A03;
    public final ServiceEventCallbackImpl A04;
    public final HeroPlayerSetting A05;
    public final InterfaceC6113Dvs A06;
    public volatile C4908DEb A07;

    public C4900DDt(Context context, DDR ddr, DEY dey, C5596Dlb c5596Dlb, ServiceEventCallbackImpl serviceEventCallbackImpl, HeroPlayerSetting heroPlayerSetting, InterfaceC6113Dvs interfaceC6113Dvs) {
        this.A00 = context;
        this.A05 = heroPlayerSetting;
        this.A04 = serviceEventCallbackImpl;
        this.A01 = ddr;
        this.A03 = c5596Dlb;
        this.A06 = interfaceC6113Dvs;
        this.A02 = dey;
    }
}
