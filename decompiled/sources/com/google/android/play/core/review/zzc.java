package com.google.android.play.core.review;

import X.CSE;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* loaded from: classes5.dex */
public final class zzc extends ResultReceiver {
    public final /* synthetic */ CSE A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(Handler handler, CSE cse) {
        super(handler);
        this.A00 = cse;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.A00.A00.A0H(null);
    }
}
