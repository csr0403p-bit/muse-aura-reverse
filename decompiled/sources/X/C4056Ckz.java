package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.analytics2.logger.interfaces.IllegalRemoteArgumentException;
import com.facebook.analytics2.logger.legacy.uploader.HighPriUploadRetryReceiver;

/* renamed from: X.Ckz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4056Ckz extends Thread {
    public static final String __redex_internal_original_name = "HighPriUploadRetryReceiver$1";
    public final /* synthetic */ BroadcastReceiver.PendingResult A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Intent A02;
    public final /* synthetic */ HighPriUploadRetryReceiver A03;

    public C4056Ckz(BroadcastReceiver.PendingResult pendingResult, Context context, Intent intent, HighPriUploadRetryReceiver highPriUploadRetryReceiver) {
        this.A02 = intent;
        this.A01 = context;
        this.A00 = pendingResult;
        this.A03 = highPriUploadRetryReceiver;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            Bundle extras = this.A02.getExtras();
            Context context = this.A01;
            C4054Ckx c4054CkxA00 = C4054Ckx.A00(context, extras);
            C4053Ckw.A01(context, c4054CkxA00.A06, C4053Ckw.A00(context), c4054CkxA00.A02);
            this.A00.finish();
        } catch (IllegalRemoteArgumentException e) {
            CFK.A0B("HighPriUploadRetryReceiver", "Exception when scheduling high pri upload via alarm", e);
        }
    }
}
