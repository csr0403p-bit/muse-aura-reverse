package X;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.File;

/* renamed from: X.ClQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4078ClQ extends BroadcastReceiver {
    public final /* synthetic */ C4076ClO A00;

    public C4078ClQ(C4076ClO c4076ClO) {
        this.A00 = c4076ClO;
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
            C4076ClO c4076ClO = this.A00;
            if (i == c4076ClO.A08) {
                if (string != null) {
                    synchronized (c4076ClO) {
                        if (c4076ClO.A07 && "com.facebook.analytics2.logger.UPLOAD_NOW".equals(string)) {
                            C4055Cky.A01().A02(c4076ClO.A09);
                        }
                    }
                    if (z) {
                        return;
                    }
                    synchronized (c4076ClO) {
                        String str = c4076ClO.A04;
                        if (str != null && str.equals(string)) {
                            c4076ClO.A04 = null;
                        }
                    }
                } else if (z) {
                    return;
                } else {
                    C4076ClO.A01(c4076ClO);
                }
                String strA00 = AbstractC3294CCd.A00();
                if (strA00 == null || (iA01 = DQZ.A01(dqzA00, strA00, strA00.hashCode())) < 0) {
                    return;
                }
                File fileA07 = dqzA00.A07(iA01);
                try {
                    synchronized (c4076ClO) {
                        File file = c4076ClO.A02;
                        if (fileA07 == null) {
                            if (file == null) {
                                File file2 = c4076ClO.A03;
                                if (fileA07 == null ? !(file2 == null || file2.compareTo(fileA07) <= 0) : file2 != null) {
                                    c4076ClO.ARM();
                                }
                            }
                            c4076ClO.ARL();
                        } else {
                            if (file == null || file.compareTo(fileA07) <= 0) {
                                File file22 = c4076ClO.A03;
                                if (fileA07 == null) {
                                    c4076ClO.ARM();
                                }
                            }
                            c4076ClO.ARL();
                        }
                        c4076ClO.A02 = null;
                        c4076ClO.A03 = null;
                    }
                } catch (NullPointerException e) {
                    String message = e.getMessage();
                    if (message == null || !message.contains("Attempt to invoke virtual method 'int com.android.server.job.controllers.JobStatus.getUid()' on a null object reference")) {
                        throw e;
                    }
                    CFK.A0L("UploadManager", e, "system error while performing catch-up scheduling");
                }
            }
        }
    }
}
