package X;

import android.hardware.camera2.CaptureRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Bgf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2648Bgf {
    /* JADX WARN: Incorrect types in method signature: (LX/Bgd;Landroid/hardware/camera2/CameraDevice;Ljava/util/Map<LX/BjC;Landroid/view/Surface;>;ZLX/BaI;)Landroid/hardware/camera2/CaptureRequest; */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8 A[LOOP:1: B:38:0x00c2->B:40:0x00c8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.hardware.camera2.CaptureRequest A00(android.hardware.camera2.CameraDevice r6, X.C2404BaI r7, X.C2646Bgd r8, java.util.Map r9, boolean r10) throws android.hardware.camera2.CameraAccessException {
        /*
            r2 = 0
            if (r6 == 0) goto L103
            java.util.List<X.BjC> r0 = r8.A05
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.util.ArrayList r3 = X.C3cG.A0h()
            java.util.Iterator r1 = r0.iterator()
        L11:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = r9.get(r0)
            if (r0 == 0) goto L25
            r3.add(r0)
            goto L11
        L25:
            java.lang.String r0 = "DeferrableSurface not in configuredSurfaceMap"
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            throw r0
        L2c:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L103
            X.BnK r0 = r8.A01
            r5 = 5
            java.lang.String r2 = "Camera2CaptureRequestBuilder"
            int r4 = r8.A00
            if (r4 != r5) goto Le6
            if (r0 == 0) goto Le6
            android.hardware.camera2.CaptureResult r1 = r0.ADS()
            boolean r0 = r1 instanceof android.hardware.camera2.TotalCaptureResult
            if (r0 == 0) goto Le6
            java.lang.String r0 = "createReprocessCaptureRequest"
            X.AbstractC2875Bni.A01(r2, r0)
            android.hardware.camera2.TotalCaptureResult r1 = (android.hardware.camera2.TotalCaptureResult) r1
            android.hardware.camera2.CaptureRequest$Builder r2 = r6.createReprocessCaptureRequest(r1)
        L50:
            A01(r2, r7, r4)
            X.Beh r5 = r8.A02
            X.BdI<android.util.Range<java.lang.Integer>> r6 = X.C2646Bgd.A09
            android.util.Range<java.lang.Integer> r4 = X.AbstractC2481Bc8.A00
            java.lang.Object r0 = r5.Abl(r6, r4)
            r0.getClass()
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L72
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE
            java.lang.Object r0 = r5.Abl(r6, r4)
            r0.getClass()
            r2.set(r1, r0)
        L72:
            int r0 = r8.A00()
            r6 = 1
            if (r0 == r6) goto Ldf
            int r0 = r8.A01()
            if (r0 == r6) goto Ldf
            int r0 = r8.A00()
            r1 = 2
            if (r0 != r1) goto Ld2
            android.hardware.camera2.CaptureRequest$Key r4 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L8c:
            r2.set(r4, r0)
        L8f:
            X.BdI<java.lang.Integer> r4 = X.C2646Bgd.A0A
            boolean r0 = r5.A74(r4)
            if (r0 == 0) goto La0
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.JPEG_ORIENTATION
            java.lang.Object r0 = r5.Abk(r4)
            r2.set(r1, r0)
        La0:
            X.BdI<java.lang.Integer> r4 = X.C2646Bgd.A08
            boolean r0 = r5.A74(r4)
            if (r0 == 0) goto Lbb
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.JPEG_QUALITY
            java.lang.Object r0 = r5.Abk(r4)
            java.lang.Number r0 = (java.lang.Number) r0
            byte r0 = r0.byteValue()
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r2.set(r1, r0)
        Lbb:
            A02(r2, r5)
            java.util.Iterator r1 = r3.iterator()
        Lc2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lf9
            java.lang.Object r0 = r1.next()
            android.view.Surface r0 = (android.view.Surface) r0
            r2.addTarget(r0)
            goto Lc2
        Ld2:
            int r0 = r8.A01()
            if (r0 != r1) goto L8f
            android.hardware.camera2.CaptureRequest$Key r4 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            goto L8c
        Ldf:
            android.hardware.camera2.CaptureRequest$Key r4 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE
            java.lang.Integer r0 = X.BV4.A0V()
            goto L8c
        Le6:
            java.lang.String r0 = "createCaptureRequest"
            X.AbstractC2875Bni.A01(r2, r0)
            if (r4 != r5) goto Lf7
            int r0 = X.BV5.A01(r10)
        Lf1:
            android.hardware.camera2.CaptureRequest$Builder r2 = r6.createCaptureRequest(r0)
            goto L50
        Lf7:
            r0 = r4
            goto Lf1
        Lf9:
            X.BhZ r0 = r8.A03
            r2.setTag(r0)
            android.hardware.camera2.CaptureRequest r0 = r2.build()
            return r0
        L103:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2648Bgf.A00(android.hardware.camera2.CameraDevice, X.BaI, X.Bgd, java.util.Map, boolean):android.hardware.camera2.CaptureRequest");
    }

    public static void A01(CaptureRequest.Builder builder, C2404BaI c2404BaI, int i) {
        HashMap mapA0u;
        CaptureRequest.Key key;
        int i2;
        Map mapUnmodifiableMap;
        if (i == 3) {
            if (c2404BaI.A00) {
                mapA0u = BV4.A0u();
                key = CaptureRequest.CONTROL_CAPTURE_INTENT;
                i2 = 1;
                C8j4.A1O(key, mapA0u, i2);
                mapUnmodifiableMap = Collections.unmodifiableMap(mapA0u);
            }
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        } else {
            if (i == 4 && c2404BaI.A01) {
                mapA0u = BV4.A0u();
                key = CaptureRequest.CONTROL_CAPTURE_INTENT;
                i2 = 2;
                C8j4.A1O(key, mapA0u, i2);
                mapUnmodifiableMap = Collections.unmodifiableMap(mapA0u);
            }
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        }
        Iterator itA0n = AnonymousClass002.A0n(mapUnmodifiableMap);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            builder.set((CaptureRequest.Key) entryA0l.getKey(), entryA0l.getValue());
        }
    }

    public static void A02(CaptureRequest.Builder builder, InterfaceC2585Beh interfaceC2585Beh) {
        C2584Beg c2584BegA00 = InterfaceC2585Beh.A00(interfaceC2585Beh);
        for (AbstractC2531BdI<?> abstractC2531BdI : c2584BegA00.APd()) {
            CaptureRequest.Key key = (CaptureRequest.Key) ((C2530BdH) abstractC2531BdI).A01;
            try {
                builder.set(key, c2584BegA00.Abk(abstractC2531BdI));
            } catch (IllegalArgumentException unused) {
                AbstractC2875Bni.A02("Camera2CaptureRequestBuilder", AnonymousClass007.A0a("CaptureRequest.Key is not supported: ", key));
            }
        }
    }
}
