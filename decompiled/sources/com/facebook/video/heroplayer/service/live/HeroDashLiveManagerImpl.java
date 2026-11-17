package com.facebook.video.heroplayer.service.live;

import X.BZQ;
import X.C5092DXa;
import X.DF8;
import X.DFE;
import X.InterfaceC6113Dvs;
import android.content.Context;
import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public class HeroDashLiveManagerImpl {
    public final DF8 A00;
    public final ServiceEventCallbackImpl A01;

    public HeroDashLiveManagerImpl(Context context, HeroPlayerSetting heroPlayerSetting, DFE dfe, AtomicReference atomicReference, C5092DXa c5092DXa, InterfaceC6113Dvs interfaceC6113Dvs) {
        this.A00 = new DF8(context, c5092DXa, new BZQ(null), heroPlayerSetting.abrSetting, heroPlayerSetting, interfaceC6113Dvs);
        this.A01 = new ServiceEventCallbackImpl(dfe, atomicReference);
    }
}
