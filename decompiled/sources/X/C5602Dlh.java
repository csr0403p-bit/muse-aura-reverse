package X;

import android.media.MediaFormat;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Iterator;
import java.util.concurrent.BlockingDeque;

/* renamed from: X.Dlh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5602Dlh implements InterfaceC6271DzO {
    public final /* synthetic */ C5615Dlu A00;

    public C5602Dlh(C5615Dlu c5615Dlu) {
        this.A00 = c5615Dlu;
    }

    @Override // X.InterfaceC6271DzO
    public final void AX9(MediaFormat mediaFormat, C6154Dwx c6154Dwx, long j, long j2) {
        C3066Bwo c3066Bwo;
        C5615Dlu c5615Dlu = this.A00;
        C5879DrF c5879DrF = c5615Dlu.A0F;
        synchronized (c5879DrF) {
            long[] jArr = c5879DrF.A02;
            int i = c5879DrF.A00;
            jArr[i] = j;
            c5879DrF.A01[i] = j2;
            c5879DrF.A03[i] = c6154Dwx;
            c5879DrF.A00 = i + 1;
            c5879DrF.A00 = i % 30;
        }
        HeroPlayerSetting heroPlayerSetting = c5615Dlu.A0k;
        C5785DpT c5785DpT = heroPlayerSetting.loggerSDKConfig.gen;
        if (c5785DpT.enable_dropped_frames_metadata && c5785DpT.enable_hdr_frame_count_metadata) {
            C7384Etj.A0Y(c6154Dwx, 0);
            if (C6180DxO.A03(c6154Dwx.A0S) || BV6.A1W(c6154Dwx, "video/dolby-vision")) {
                Dlw dlw = c5615Dlu.A0e;
                C5785DpT c5785DpT2 = dlw.A2C.loggerSDKConfig.gen;
                if (c5785DpT2.enable_dropped_frames_metadata && c5785DpT2.enable_hdr_frame_count_metadata) {
                    dlw.A2H.incrementAndGet();
                }
            }
        }
        DmR dmR = c5615Dlu.A0C;
        if (dmR == null || dmR.A03 == null) {
            return;
        }
        if (c5615Dlu.A0p && (c3066Bwo = c5615Dlu.A09) != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C3067Bwp c3067Bwp = new C3067Bwp();
            long j3 = (j / 1000) * 100;
            c3067Bwp.A03 = j3;
            c3067Bwp.A01 = j3;
            c3067Bwp.A02 = jCurrentTimeMillis * 100;
            c3067Bwp.A00 = -1L;
            c3067Bwp.A04 = -100L;
            BlockingDeque<C3067Bwp> blockingDeque = c3066Bwo.A00;
            C3067Bwp c3067BwpPeekLast = blockingDeque.peekLast();
            if (c3067BwpPeekLast == null || c3067BwpPeekLast.A03 != c3067Bwp.A03 || c3067BwpPeekLast.A01 != c3067Bwp.A01) {
                blockingDeque.add(c3067Bwp);
            }
        }
        if (!heroPlayerSetting.enableExoPlayerViperLogging || c5615Dlu.A0C.A03.A0Q == null) {
            return;
        }
        long j4 = j / 1000;
        Iterator it = c5615Dlu.A0l.iterator();
        while (it.hasNext()) {
            ((C5621Dm4) it.next()).A00.A2A.ATS(c5615Dlu.A0C.A03.A0Q, j4);
        }
    }
}
