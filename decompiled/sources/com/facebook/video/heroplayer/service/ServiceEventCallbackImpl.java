package com.facebook.video.heroplayer.service;

import X.AbstractC3426CMt;
import X.AnonymousClass007;
import X.BV4;
import X.BYA;
import X.BYP;
import X.C4919DEo;
import X.DEF;
import X.DEK;
import X.DFE;
import X.DFH;
import X.HXC;
import X.HXD;
import X.InterfaceC5638DmM;
import com.facebook.exoplayer.monitor.VpsEventCallback;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public class ServiceEventCallbackImpl implements VpsEventCallback {
    public DFH A00;
    public String A01;
    public boolean A02;
    public String A03;
    public final InterfaceC5638DmM A04;
    public final AtomicReference A05;
    public final DFE A06;

    @Override // com.facebook.exoplayer.monitor.VpsEventCallback
    public final void A5s(BYP byp) {
        DEK dek;
        InterfaceC5638DmM interfaceC5638DmM = this.A04;
        if (interfaceC5638DmM != null) {
            int iOrdinal = byp.mEventType.ordinal();
            if (iOrdinal == 10) {
                C4919DEo c4919DEo = (C4919DEo) byp;
                interfaceC5638DmM.AXQ(c4919DEo.errorDomain, c4919DEo.errorCode, c4919DEo.errorDetails);
                return;
            }
            if (iOrdinal == 41) {
                BYA bya = (BYA) byp;
                interfaceC5638DmM.ATb(bya.eventDomain, bya.annotations);
                return;
            }
            if (iOrdinal == 31) {
                HXD hxd = (HXD) byp;
                if (!hxd.isPrefetch && DEF.A00(hxd.streamType) && hxd.segmentStartMs == 0 && hxd.segmentDurationMs > 0) {
                    dek = hxd.cacheType;
                    interfaceC5638DmM.ATN(dek);
                }
            } else if (iOrdinal == 4) {
                HXC hxc = (HXC) byp;
                if (!hxc.isPrefetch && DEF.A00(hxc.streamType) && hxc.segmentStartMs == 0 && hxc.segmentDurationMs > 0) {
                    dek = hxc.cacheType;
                    interfaceC5638DmM.ATN(dek);
                }
            }
        }
        AbstractC3426CMt.A03("ServiceEventCallbackImpl", "skipping log because listener is null", BV4.A1W());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043 A[PHI: r5
  0x0043: PHI (r5v1 boolean) = (r5v0 boolean), (r5v2 boolean) binds: [B:19:0x0041, B:17:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    @Override // com.facebook.exoplayer.monitor.VpsEventCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void errorCallback(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            java.lang.String r0 = r6.A03
            X.BYP.A00(r6, r0, r7, r8, r9)
            X.DFH r1 = r6.A00
            if (r1 == 0) goto L73
            java.lang.String r0 = "DAV1D_FRAME_DROP_LOCK_WAIT"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L7f
            java.lang.String r0 = "DAV1D_FRAME_DROP_INTERVAL"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L7f
            java.lang.String r0 = "DAV1D_INVALID_BUFFER_FORMAT"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L7f
            java.lang.String r0 = "DAV1D_DECODE_ERROR"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L7f
            java.lang.String r0 = "DAV1D_RENDER_EXCEPTION"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L7f
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L40
            java.lang.String r0 = "invalid native window size"
            boolean r0 = r9.contains(r0)
            r5 = 1
            if (r0 != 0) goto L43
        L40:
            r5 = 0
            if (r9 == 0) goto L79
        L43:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L77
            java.lang.String r0 = r6.A01
            if (r0 == 0) goto L77
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L77
            java.lang.String r1 = r6.A01
            java.lang.String r0 = ":"
            java.lang.String[] r4 = r1.split(r0)
            int r3 = r4.length
            r2 = 0
        L5d:
            if (r2 >= r3) goto L77
            r1 = r4[r2]
            if (r1 == 0) goto L74
            boolean r0 = X.C60Q.A1V(r1)
            if (r0 != 0) goto L74
            java.lang.String r0 = r1.trim()
            boolean r0 = r9.contains(r0)
            if (r0 == 0) goto L74
        L73:
            return
        L74:
            int r2 = r2 + 1
            goto L5d
        L77:
            if (r5 != 0) goto L7d
        L79:
            boolean r0 = r6.A02
            if (r0 == 0) goto L73
        L7d:
            X.DFH r1 = r6.A00
        L7f:
            X.Dm5 r1 = r1.A00
            r0 = 0
            r1.AXC(r7, r8, r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.heroplayer.service.ServiceEventCallbackImpl.errorCallback(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public ServiceEventCallbackImpl(DFE dfe, AtomicReference atomicReference) {
        this.A02 = false;
        this.A01 = "";
        this.A05 = atomicReference;
        this.A06 = dfe;
        this.A03 = "";
        this.A04 = null;
        AbstractC3426CMt.A02("ServiceEventCallbackImpl", AnonymousClass007.A0a("setting listener for event callback to: ", atomicReference));
    }

    public ServiceEventCallbackImpl(DFE dfe, InterfaceC5638DmM interfaceC5638DmM, String str, AtomicReference atomicReference) {
        this.A02 = false;
        this.A01 = "";
        this.A05 = atomicReference;
        this.A06 = dfe;
        this.A03 = str == null ? "" : str;
        this.A04 = interfaceC5638DmM;
        AbstractC3426CMt.A02("ServiceEventCallbackImpl", AnonymousClass007.A0a("setting listener for event callback to: ", atomicReference));
    }
}
