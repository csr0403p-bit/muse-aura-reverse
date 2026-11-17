package X;

import android.content.ContentResolver;
import android.content.Context;
import android.media.AudioManager;
import android.os.Trace;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes6.dex */
public final class GVo {
    public C9632GVp A00;
    public GXS A01;
    public Future<?> A02;
    public final ContentResolver A03;
    public final AudioManager A04;
    public final InterfaceC9648GXn A05;
    public final ExecutorService A06;

    public final void A00() {
        AbstractC3136BzG.A00("VolumeChangeAnnouncer::unregisterVolumeObserver");
        try {
            C9632GVp c9632GVp = this.A00;
            if (c9632GVp != null) {
                this.A03.unregisterContentObserver(c9632GVp);
            }
            this.A00 = null;
            this.A02 = null;
        } finally {
            Trace.endSection();
        }
    }

    public GVo(Context context, AudioManager audioManager, GXS gxs, InterfaceC9648GXn interfaceC9648GXn, ExecutorService executorService) {
        this.A04 = audioManager;
        this.A05 = interfaceC9648GXn;
        ContentResolver contentResolver = context.getContentResolver();
        C7384Etj.A0U(contentResolver);
        this.A03 = contentResolver;
        this.A01 = gxs;
        this.A06 = executorService;
    }
}
