package com.facebook.analytics2.logger.legacy.uploader;

import X.C1H;
import X.C3958Chx;
import X.C4053Ckw;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes5.dex */
public class AlarmBasedUploadService extends Service {
    public C4053Ckw A00;

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String action;
        if (intent != null && (action = intent.getAction()) != null && action.startsWith("com.facebook.analytics2.logger.UPLOAD_NOW")) {
            intent.setAction("com.facebook.analytics2.logger.UPLOAD_NOW");
        }
        C4053Ckw c4053Ckw = this.A00;
        C1H.A00(c4053Ckw);
        return c4053Ckw.A03(intent, new C3958Chx(this, i2));
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        this.A00 = C4053Ckw.A00(this);
    }
}
