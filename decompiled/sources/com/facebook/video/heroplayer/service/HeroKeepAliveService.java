package com.facebook.video.heroplayer.service;

import X.BinderC3410CKx;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

/* loaded from: classes5.dex */
public final class HeroKeepAliveService extends Service {
    public final Binder A00 = new BinderC3410CKx();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.A00;
    }
}
