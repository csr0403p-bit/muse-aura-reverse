package X;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Bij, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class RunnableC2713Bij implements Runnable {
    public static final String __redex_internal_original_name = "CaptureSession$$ExternalSyntheticLambda3";
    public final /* synthetic */ C2714Bik A00;

    @Override // java.lang.Runnable
    public final void run() {
        String strA0y;
        InterfaceC2861BnK interfaceC2861BnK;
        C2714Bik c2714Bik = this.A00;
        synchronized (c2714Bik.A0E) {
            List<C2646Bgd> list = c2714Bik.A0F;
            if (!list.isEmpty()) {
                try {
                    if (c2714Bik.A05 != C79.A0P) {
                        AbstractC2875Bni.A01("CaptureSession", "Skipping issueBurstCaptureRequest due to session closed");
                    } else if (!list.isEmpty()) {
                        try {
                            C2708Bie c2708Bie = new C2708Bie();
                            ArrayList arrayListA0h = C3cG.A0h();
                            AbstractC2875Bni.A01("CaptureSession", "Issuing capture request.");
                            Iterator<C2646Bgd> it = list.iterator();
                            boolean z = false;
                            while (true) {
                                if (it.hasNext()) {
                                    C2646Bgd next = it.next();
                                    List<BjC> list2 = next.A05;
                                    if (Collections.unmodifiableList(list2).isEmpty()) {
                                        strA0y = "Skipping issuing empty capture request.";
                                    } else {
                                        for (BjC bjC : Collections.unmodifiableList(list2)) {
                                            if (!c2714Bik.A0G.containsKey(bjC)) {
                                                strA0y = AnonymousClass006.A0y(bjC, "Skipping capture request with invalid surface: ", C60O.A0w());
                                            }
                                        }
                                        int i = next.A00;
                                        if (i == 2) {
                                            z = true;
                                        }
                                        C2645Bgc c2645Bgc = new C2645Bgc(next);
                                        if (i == 5 && (interfaceC2861BnK = next.A01) != null) {
                                            c2645Bgc.A01 = interfaceC2861BnK;
                                        }
                                        C2643Bga c2643Bga = c2714Bik.A02;
                                        if (c2643Bga != null) {
                                            c2645Bgc.A02(c2643Bga.A02.A02);
                                        }
                                        c2645Bgc.A02(next.A02);
                                        CaptureRequest captureRequestA00 = AbstractC2648Bgf.A00(C2715Bil.A00(c2714Bik.A01).getDevice(), c2714Bik.A0C, c2645Bgc.A01(), c2714Bik.A0G, false);
                                        if (captureRequestA00 == null) {
                                            AbstractC2875Bni.A01("CaptureSession", "Skipping issuing request without surface.");
                                            break;
                                        }
                                        ArrayList arrayListA0h2 = C3cG.A0h();
                                        Iterator<BeX> it2 = next.A04.iterator();
                                        while (it2.hasNext()) {
                                            AbstractC2658Bgq.A00(it2.next(), arrayListA0h2);
                                        }
                                        c2708Bie.A00(captureRequestA00, arrayListA0h2);
                                        arrayListA0h.add(captureRequestA00);
                                    }
                                    AbstractC2875Bni.A01("CaptureSession", strA0y);
                                } else if (arrayListA0h.isEmpty()) {
                                    AbstractC2875Bni.A01("CaptureSession", "Skipping issuing burst request due to no valid request elements");
                                } else {
                                    if (c2714Bik.A0B.A00 && z) {
                                        Iterator it3 = arrayListA0h.iterator();
                                        while (it3.hasNext()) {
                                            int iA07 = BV6.A07(((CaptureRequest) it3.next()).get(CaptureRequest.CONTROL_AE_MODE));
                                            if (iA07 == 2 || iA07 == 3) {
                                                BeS.A00((C2715Bil) c2714Bik.A01).stopRepeating();
                                                c2708Bie.A00 = new C2712Bii(c2714Bik);
                                                break;
                                            }
                                        }
                                    }
                                    if (c2714Bik.A0D.A00 && z) {
                                        Iterator it4 = arrayListA0h.iterator();
                                        while (true) {
                                            if (!it4.hasNext()) {
                                                break;
                                            }
                                            Integer num = (Integer) ((CaptureRequest) it4.next()).get(CaptureRequest.FLASH_MODE);
                                            if (num != null && num.intValue() == 2) {
                                                c2708Bie.A00((CaptureRequest) arrayListA0h.get(arrayListA0h.size() - 1), Collections.singletonList(new C2709Bif(c2714Bik)));
                                                break;
                                            }
                                        }
                                    }
                                    C2715Bil c2715Bil = (C2715Bil) c2714Bik.A01;
                                    CameraCaptureSession.CaptureCallback captureCallbackA00 = c2715Bil.A0F.A00(c2708Bie);
                                    BeS.A03(c2715Bil.A01, "Need to call openCaptureSession before using this API.");
                                    ((Bl1) c2715Bil.A01.A00).A00.captureBurstRequests(arrayListA0h, c2715Bil.A0J, captureCallbackA00);
                                }
                            }
                        } catch (CameraAccessException e) {
                            AbstractC2875Bni.A02("CaptureSession", BV5.A0n("Unable to access camera: ", e));
                            Thread.dumpStack();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public /* synthetic */ RunnableC2713Bij(C2714Bik c2714Bik) {
        this.A00 = c2714Bik;
    }
}
