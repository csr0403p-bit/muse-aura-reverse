package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Bie, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2708Bie extends CameraCaptureSession.CaptureCallback {
    public InterfaceC2803Blg A00 = null;
    public final Map<CaptureRequest, List<CameraCaptureSession.CaptureCallback>> A01 = BV4.A0u();

    public final void A00(CaptureRequest captureRequest, List<CameraCaptureSession.CaptureCallback> list) {
        Map<CaptureRequest, List<CameraCaptureSession.CaptureCallback>> map = this.A01;
        List listA0z = BV4.A0z(captureRequest, map);
        if (listA0z == null) {
            map.put(captureRequest, list);
            return;
        }
        ArrayList arrayListA11 = C60O.A11(list.size() + listA0z.size());
        arrayListA11.addAll(list);
        arrayListA11.addAll(listA0z);
        map.put(captureRequest, arrayListA11);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        List listA0z = BV4.A0z(captureRequest, this.A01);
        if (listA0z == null) {
            listA0z = Collections.EMPTY_LIST;
        }
        Iterator it = listA0z.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        List listA0z = BV4.A0z(captureRequest, this.A01);
        if (listA0z == null) {
            listA0z = Collections.EMPTY_LIST;
        }
        Iterator it = listA0z.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        List listA0z = BV4.A0z(captureRequest, this.A01);
        if (listA0z == null) {
            listA0z = Collections.EMPTY_LIST;
        }
        Iterator it = listA0z.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        List listA0z = BV4.A0z(captureRequest, this.A01);
        if (listA0z == null) {
            listA0z = Collections.EMPTY_LIST;
        }
        Iterator it = listA0z.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        Iterator itA10 = BV5.A10(this.A01);
        while (itA10.hasNext()) {
            Iterator it = ((List) itA10.next()).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureSequenceAborted(cameraCaptureSession, i);
            }
        }
        InterfaceC2803Blg interfaceC2803Blg = this.A00;
        if (interfaceC2803Blg != null) {
            C2714Bik c2714Bik = ((C2712Bii) interfaceC2803Blg).A00;
            synchronized (c2714Bik.A0E) {
                if (c2714Bik.A05 == C79.A0P) {
                    c2714Bik.A03(c2714Bik.A02);
                }
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        Iterator itA10 = BV5.A10(this.A01);
        while (itA10.hasNext()) {
            Iterator it = ((List) itA10.next()).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureSequenceCompleted(cameraCaptureSession, i, j);
            }
        }
        InterfaceC2803Blg interfaceC2803Blg = this.A00;
        if (interfaceC2803Blg != null) {
            C2714Bik c2714Bik = ((C2712Bii) interfaceC2803Blg).A00;
            synchronized (c2714Bik.A0E) {
                if (c2714Bik.A05 == C79.A0P) {
                    c2714Bik.A03(c2714Bik.A02);
                }
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        List listA0z = BV4.A0z(captureRequest, this.A01);
        if (listA0z == null) {
            listA0z = Collections.EMPTY_LIST;
        }
        Iterator it = listA0z.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        }
    }
}
