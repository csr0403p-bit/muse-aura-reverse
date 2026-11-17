package com.facebook.video.heroplayer.client;

import X.C5625Dm8;
import X.C5874Dr9;
import X.InterfaceC6081DvL;
import android.os.Bundle;
import android.os.ResultReceiver;

/* loaded from: classes5.dex */
public final class HeroClientResultReceiver extends ResultReceiver {
    public InterfaceC6081DvL A00;

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        InterfaceC6081DvL interfaceC6081DvL = this.A00;
        if (interfaceC6081DvL != null) {
            C5874Dr9 c5874Dr9 = (C5874Dr9) interfaceC6081DvL;
            C5625Dm8 c5625Dm8 = c5874Dr9.A00;
            c5874Dr9.A01.set(i);
            Object obj = c5625Dm8.A0L;
            synchronized (obj) {
                obj.notifyAll();
            }
        }
        this.A00 = null;
    }
}
