package X;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.aura.R;
import java.io.File;

/* renamed from: X.ClP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4077ClP extends BroadcastReceiver {
    public final /* synthetic */ C4075ClN A00;

    public C4077ClP(C4075ClN c4075ClN) {
        this.A00 = c4075ClN;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Parcelable parcelableExtra;
        int iA01;
        if (intent == null || (parcelableExtra = intent.getParcelableExtra("uploader_service_broadcast_auth_token")) == null) {
            return;
        }
        if (context.getPackageName().equals(((PendingIntent) parcelableExtra).getCreatorPackage())) {
            Bundle extras = intent.getExtras();
            int i = extras.getInt("job_id", -1);
            String string = extras.getString("hack_action");
            boolean z = extras.getBoolean("will_retry");
            DQZ<String, File> dqzA00 = CMV.A00(extras.getStringArrayList("successful_processes"), extras.getStringArrayList("newest_files_uploaded"));
            if (i == -1) {
                throw C60O.A0i("jobId = -1");
            }
            C4075ClN c4075ClN = this.A00;
            if (i == R.id.jobscheduler_analytics2_micro_batch) {
                if (string != null) {
                    synchronized (c4075ClN) {
                        if (c4075ClN.A0A && "com.facebook.analytics2.logger.UPLOAD_NOW".equals(string)) {
                            C4055Cky.A01().A02(c4075ClN.A0C);
                        }
                    }
                    if (z) {
                        return;
                    }
                    synchronized (c4075ClN) {
                        String str = c4075ClN.A07;
                        if (str != null && str.equals(string)) {
                            c4075ClN.A07 = null;
                        }
                    }
                } else if (z) {
                    return;
                } else {
                    C4075ClN.A02(c4075ClN);
                }
                String strA00 = AbstractC3294CCd.A00();
                if (strA00 == null || (iA01 = DQZ.A01(dqzA00, strA00, strA00.hashCode())) < 0) {
                    return;
                }
                File fileA07 = dqzA00.A07(iA01);
                try {
                    synchronized (c4075ClN) {
                        if (c4075ClN.A0B) {
                            File file = c4075ClN.A05;
                            if (fileA07 == null) {
                                if (file == null) {
                                    File file2 = c4075ClN.A06;
                                    if (fileA07 == null ? !(file2 == null || file2.compareTo(fileA07) <= 0) : file2 != null) {
                                        c4075ClN.ARM();
                                    }
                                }
                                c4075ClN.ARL();
                            } else {
                                if (file == null || file.compareTo(fileA07) <= 0) {
                                    File file22 = c4075ClN.A06;
                                    if (fileA07 == null) {
                                        c4075ClN.ARM();
                                    }
                                }
                                c4075ClN.ARL();
                            }
                        }
                        c4075ClN.A05 = null;
                        c4075ClN.A06 = null;
                        c4075ClN.A02 = null;
                    }
                } catch (NullPointerException e) {
                    String message = e.getMessage();
                    if (message == null || !message.contains("Attempt to invoke virtual method 'int com.android.server.job.controllers.JobStatus.getUid()' on a null object reference")) {
                        throw e;
                    }
                    CFK.A0L("MicroBatchUploadManager", e, "system error while performing catch-up scheduling");
                }
            }
        }
    }
}
