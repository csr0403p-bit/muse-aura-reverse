package com.facebook.analytics2.logger.legacy.uploader;

import X.BV5;
import X.C4056Ckz;
import X.C7oV;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes5.dex */
public class HighPriUploadRetryReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (C7oV.A01().A00(context, intent, this) && BV5.A1Q(intent, "com.facebook.analytics2.logger.UPLOAD_NOW")) {
            new C4056Ckz(goAsync(), context, intent, this).start();
        }
    }
}
