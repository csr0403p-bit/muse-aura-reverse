package X;

import android.os.SystemClock;
import com.facebook.aura.common.video.HatchVideoPlayerMetadataProvider;

/* renamed from: X.DmJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5635DmJ implements InterfaceC6037DuY {
    public HatchVideoPlayerMetadataProvider A00;
    public C5630DmE A01;

    public final void A00() {
        Object objA0s;
        C5630DmE c5630DmE = this.A01;
        if (c5630DmE != null) {
            c5630DmE.A0C.A01();
            C5699Dng c5699Dng = c5630DmE.A0F;
            if (c5699Dng.mFixLeakInPlayerListener) {
                c5630DmE.A0H.set(true);
            }
            String strA01 = c5630DmE.A08;
            if (strA01 == null) {
                strA01 = C5630DmE.A01(c5630DmE);
            }
            InterfaceC5724DoJ interfaceC5724DoJ = c5630DmE.A0B;
            C5627DmA c5627DmA = (C5627DmA) interfaceC5724DoJ;
            C5623Dm6 c5623Dm6A0i = BV7.A0i(c5627DmA.A07);
            C5630DmE.A0H(c5630DmE, c5623Dm6A0i, strA01);
            C5654Dmi.A00(EnumC5667Dmw.A0B, c5630DmE.A0E, strA01);
            c5630DmE.A08 = null;
            C5700Dnh c5700DnhA00 = c5630DmE.A0D.A00(c5630DmE.A0S, strA01);
            if (c5700DnhA00 != null) {
                if (c5699Dng.gen.enable_dropped_frames_metadata && c5623Dm6A0i != null) {
                    try {
                        DmR dmR = c5627DmA.A08;
                        objA0s = dmR != null ? dmR.A09 : null;
                    } catch (Throwable th) {
                        objA0s = C3cG.A0s(th);
                    }
                    if (objA0s instanceof C10571Hud) {
                        objA0s = null;
                    }
                    C5630DmE.A06(c5630DmE);
                    C5630DmE.A05(c5630DmE);
                    C5785DpT c5785DpT = c5699Dng.gen;
                    c5630DmE.A0K(AbstractC5640DmU.A00(interfaceC5724DoJ, c5623Dm6A0i, interfaceC5724DoJ.ALH((String) objA0s, true), c5785DpT.enable_hdr_frame_count_metadata, c5785DpT.enable_inference_frame_count_metadata));
                }
                c5700DnhA00.A02(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, c5699Dng.mEnableResetEvent ? "reset" : "requested_pause", strA01, null, null, null, null, null, null, null, BV7.A0U(c5627DmA), c5630DmE.A03, SystemClock.elapsedRealtime(), false);
                c5700DnhA00.A01(1L);
            }
        }
        this.A01 = null;
    }

    @Override // X.InterfaceC6037DuY
    public final void AWX(C5962Dsy c5962Dsy) {
        C5630DmE c5630DmE = this.A01;
        if (c5630DmE == null || this.A00 == null) {
            return;
        }
        c5630DmE.A0K(c5962Dsy);
    }
}
