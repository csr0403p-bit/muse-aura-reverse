package X;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Pair;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Bc6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2479Bc6 {
    public Bb5 A00;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final int A07;
    public final Bb2 A08;
    public final C2476Bc3 A09;
    public final C2414Bao A0A;
    public final String A0C;
    public final InterfaceC2486BcD A0L;
    public final C2500BcV A0M;
    public final List<C2409BaO> A0F = C3cG.A0h();
    public final List<C2409BaO> A0J = C3cG.A0h();
    public final List<C2409BaO> A0D = C3cG.A0h();
    public final List<C2409BaO> A0E = C3cG.A0h();
    public final Map<AbstractC2485BcC, List<C2409BaO>> A0K = BV4.A0u();
    public final List<C2409BaO> A0G = C3cG.A0h();
    public final List<C2409BaO> A0I = C3cG.A0h();
    public final List<C2409BaO> A0H = C3cG.A0h();
    public List<Integer> A01 = C3cG.A0h();
    public final Bb6 A0B = new Bb6();

    /* JADX WARN: Removed duplicated region for block: B:110:0x0416 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x045f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2479Bc6(android.content.Context r21, X.InterfaceC2486BcD r22, X.C2538BdP r23, java.lang.String r24) throws androidx.camera.core.CameraUnavailableException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1191
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2479Bc6.<init>(android.content.Context, X.BcD, X.BdP, java.lang.String):void");
    }

    public static int A01(Size size, C2476Bc3 c2476Bc3, int i) {
        return (int) (1.0E9d / ((StreamConfigurationMap) c2476Bc3.A02(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(i, size));
    }

    public static Size A03(StreamConfigurationMap streamConfigurationMap, int i, boolean z) {
        Size[] highResolutionOutputSizes;
        Size[] outputSizes = i == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        C2482Bc9 c2482Bc9 = new C2482Bc9();
        Object objMax = Collections.max(Arrays.asList(outputSizes), c2482Bc9);
        Object objMax2 = AbstractC2484BcB.A06;
        if (z && (highResolutionOutputSizes = streamConfigurationMap.getHighResolutionOutputSizes(i)) != null && highResolutionOutputSizes.length > 0) {
            objMax2 = Collections.max(Arrays.asList(highResolutionOutputSizes), c2482Bc9);
        }
        return (Size) Collections.max(Arrays.asList((Size) objMax, (Size) objMax2), c2482Bc9);
    }

    public static final Bb5 A04(C2479Bc6 c2479Bc6, int i) {
        StreamConfigurationMap streamConfigurationMap;
        List<Integer> list = c2479Bc6.A01;
        Integer numValueOf = Integer.valueOf(i);
        if (!list.contains(numValueOf)) {
            c2479Bc6.A07(AbstractC2484BcB.A03, ((Bb4) c2479Bc6.A00).A05, i);
            c2479Bc6.A07(AbstractC2484BcB.A01, ((Bb4) c2479Bc6.A00).A04, i);
            Map<Integer, Size> map = ((Bb4) c2479Bc6.A00).A03;
            C2476Bc3 c2476Bc3 = c2479Bc6.A09;
            Size sizeA03 = A03(((C2474Bc1) c2476Bc3.A01().A00).A00, i, true);
            if (sizeA03 != null) {
                map.put(numValueOf, sizeA03);
            }
            Map<Integer, Size> map2 = ((Bb4) c2479Bc6.A00).A06;
            if (Build.VERSION.SDK_INT >= 31 && c2479Bc6.A04 && (streamConfigurationMap = (StreamConfigurationMap) c2476Bc3.A02(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) != null) {
                map2.put(numValueOf, A03(streamConfigurationMap, i, true));
            }
            list.add(numValueOf);
        }
        return c2479Bc6.A00;
    }

    private final List<Bb3> A05(AbstractC2485BcC abstractC2485BcC, List<Bb3> list) {
        if (AnonymousClass002.A1Q(((C2483BcA) abstractC2485BcC).A00, 8)) {
            Iterator<C2409BaO> it = this.A0H.iterator();
            while (it.hasNext()) {
                List<Bb3> listA07 = it.next().A07(list);
                if (listA07 != null) {
                    return listA07;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5 A[PHI: r1
  0x00b5: PHI (r1v7 int) = (r1v6 int), (r1v9 int), (r1v10 int), (r1v11 int), (r1v12 int), (r1v13 int) binds: [B:26:0x008e, B:28:0x0096, B:30:0x009e, B:32:0x00a5, B:34:0x00ac, B:36:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A06() throws java.lang.NumberFormatException {
        /*
            r12 = this;
            X.Bb2 r1 = r12.A08
            android.util.Size r0 = r1.A03
            if (r0 != 0) goto Lc
            android.util.Size r0 = X.Bb2.A00(r1)
            r1.A03 = r0
        Lc:
            android.util.Size r6 = r1.A03
            java.lang.String r0 = r12.A0C     // Catch: java.lang.NumberFormatException -> L15
            int r2 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L15
            goto L57
        L15:
            X.Bc3 r0 = r12.A09
            X.Bc0 r0 = r0.A01()
            X.Bc2 r0 = r0.A00
            X.Bc1 r0 = (X.C2474Bc1) r0
            android.hardware.camera2.params.StreamConfigurationMap r1 = r0.A00
            java.lang.Class<android.media.MediaRecorder> r0 = android.media.MediaRecorder.class
            android.util.Size[] r5 = r1.getOutputSizes(r0)
            if (r5 == 0) goto L54
            r1 = 1
            X.Bc9 r0 = new X.Bc9
            r0.<init>()
            r0.A00 = r1
            java.util.Arrays.sort(r5, r0)
            int r4 = r5.length
            r3 = 0
        L36:
            if (r3 >= r4) goto L54
            r7 = r5[r3]
            int r1 = r7.getWidth()
            android.util.Size r2 = X.AbstractC2484BcB.A00
            int r0 = r2.getWidth()
            if (r1 > r0) goto L51
            int r1 = r7.getHeight()
            int r0 = r2.getHeight()
            if (r1 > r0) goto L51
            goto L6c
        L51:
            int r3 = r3 + 1
            goto L36
        L54:
            android.util.Size r7 = X.AbstractC2484BcB.A02
            goto L6c
        L57:
            r1 = 1
            boolean r0 = android.media.CamcorderProfile.hasProfile(r2, r1)
            if (r0 == 0) goto L86
            android.media.CamcorderProfile r0 = android.media.CamcorderProfile.get(r2, r1)
            if (r0 == 0) goto L86
            int r1 = r0.videoFrameWidth
            int r0 = r0.videoFrameHeight
            android.util.Size r7 = X.BV6.A0P(r1, r0)
        L6c:
            android.util.Size r5 = X.AbstractC2484BcB.A05
            java.util.HashMap r8 = X.BV4.A0u()
            java.util.HashMap r9 = X.BV4.A0u()
            java.util.HashMap r10 = X.BV4.A0u()
            java.util.HashMap r11 = X.BV4.A0u()
            X.Bb4 r4 = new X.Bb4
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r12.A00 = r4
            return
        L86:
            android.util.Size r7 = X.AbstractC2484BcB.A02
            r1 = 10
            boolean r0 = android.media.CamcorderProfile.hasProfile(r2, r1)
            if (r0 != 0) goto Lb5
            r1 = 8
            boolean r0 = android.media.CamcorderProfile.hasProfile(r2, r1)
            if (r0 != 0) goto Lb5
            r1 = 12
            boolean r0 = android.media.CamcorderProfile.hasProfile(r2, r1)
            if (r0 != 0) goto Lb5
            r1 = 6
            boolean r0 = android.media.CamcorderProfile.hasProfile(r2, r1)
            if (r0 != 0) goto Lb5
            r1 = 5
            boolean r0 = android.media.CamcorderProfile.hasProfile(r2, r1)
            if (r0 != 0) goto Lb5
            r1 = 4
            boolean r0 = android.media.CamcorderProfile.hasProfile(r2, r1)
            if (r0 == 0) goto L6c
        Lb5:
            android.media.CamcorderProfile r0 = android.media.CamcorderProfile.get(r2, r1)
            if (r0 == 0) goto L6c
            int r1 = r0.videoFrameWidth
            int r0 = r0.videoFrameHeight
            android.util.Size r7 = X.BV6.A0P(r1, r0)
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2479Bc6.A06():void");
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Map<Ljava/lang/Integer;Landroid/util/Size;>;Landroid/util/Size;I)V */
    /* JADX WARN: Multi-variable type inference failed */
    private void A07(Size size, Map map, int i) {
        if (this.A05) {
            Size sizeA03 = A03(((C2474Bc1) this.A09.A01().A00).A00, i, false);
            Integer numValueOf = Integer.valueOf(i);
            Size sizeMin = size;
            if (sizeA03 != null) {
                sizeMin = Collections.min(Arrays.asList(size, sizeA03), new C2482Bc9());
            }
            map.put(numValueOf, sizeMin);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    private final boolean A09(AbstractC2485BcC abstractC2485BcC, List<Bb3> list) {
        List<C2409BaO> list2;
        ArrayList arrayListA0z;
        boolean z;
        Map<AbstractC2485BcC, List<C2409BaO>> map = this.A0K;
        if (map.containsKey(abstractC2485BcC)) {
            arrayListA0z = BV4.A0z(abstractC2485BcC, map);
        } else {
            ArrayList arrayListA0h = C3cG.A0h();
            C2483BcA c2483BcA = (C2483BcA) abstractC2485BcC;
            if (c2483BcA.A02) {
                list2 = this.A0I;
            } else {
                int i = c2483BcA.A00;
                if (i == 8) {
                    list2 = c2483BcA.A01 ? this.A0E : this.A0F;
                } else {
                    if (i == 10) {
                        list2 = this.A0G;
                    }
                    map.put(abstractC2485BcC, arrayListA0h);
                    arrayListA0z = arrayListA0h;
                }
            }
            arrayListA0h.addAll(list2);
            map.put(abstractC2485BcC, arrayListA0h);
            arrayListA0z = arrayListA0h;
        }
        Iterator it = arrayListA0z.iterator();
        do {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            z = true;
        } while (((C2409BaO) it.next()).A07(list) == null);
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(android.util.Range<java.lang.Integer> r2, android.util.Range<java.lang.Integer> r3) {
        /*
            java.lang.Comparable r0 = r3.getUpper()
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L15
            java.lang.Comparable r0 = r3.getLower()
            boolean r0 = r2.contains(r0)
            r1 = 1
            if (r0 == 0) goto L16
        L15:
            r1 = 0
        L16:
            java.lang.String r0 = "Ranges must not intersect"
            X.BeS.A07(r1, r0)
            int r1 = X.BV7.A0A(r2)
            int r0 = X.BV7.A09(r3)
            if (r1 <= r0) goto L33
            int r1 = X.BV7.A0A(r2)
            java.lang.Comparable r0 = r3.getUpper()
        L2d:
            int r0 = X.AnonymousClass001.A0F(r0)
            int r1 = r1 - r0
            return r1
        L33:
            int r1 = X.BV7.A0A(r3)
            java.lang.Comparable r0 = r2.getUpper()
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2479Bc6.A00(android.util.Range, android.util.Range):int");
    }

    private Pair A02(List list, List list2, List list3, List list4, Map map, Map map2, int i) {
        int iA01;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2480Bc7 abstractC2480Bc7 = (AbstractC2480Bc7) it.next();
            arrayListA0h.add(((C2487BcE) abstractC2480Bc7).A05);
            if (map != null) {
                map.put(Integer.valueOf(C8j3.A0K(arrayListA0h)), abstractC2480Bc7);
            }
        }
        for (int i2 = 0; i2 < list2.size(); i2++) {
            Size size = (Size) list2.get(i2);
            InterfaceC2490BcH interfaceC2490BcH = (InterfaceC2490BcH) list3.get(C8j4.A0H(list4, i2));
            int iAGW = interfaceC2490BcH.AGW();
            arrayListA0h.add(Bb3.A01(size, A04(this, iAGW), iAGW));
            if (map2 != null) {
                map2.put(Integer.valueOf(C8j3.A0K(arrayListA0h)), interfaceC2490BcH);
            }
            try {
                iA01 = A01(size, this.A09, interfaceC2490BcH.AGW());
            } catch (Exception unused) {
                iA01 = 0;
            }
            i = Math.min(i, iA01);
        }
        return BV5.A0E(arrayListA0h, i);
    }

    public static void A08(AbstractC2531BdI abstractC2531BdI, C2582Bee c2582Bee, InterfaceC2586Bei interfaceC2586Bei) {
        if (interfaceC2586Bei.A74(abstractC2531BdI)) {
            c2582Bee.ANl(abstractC2531BdI, interfaceC2586Bei.Abk(abstractC2531BdI));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:186:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0488 A[PHI: r10 r16 r25
  0x0488: PHI (r10v7 int) = (r10v5 int), (r10v5 int), (r10v9 int), (r10v10 int) binds: [B:187:0x0470, B:189:0x0476, B:193:0x047f, B:196:0x0486] A[DONT_GENERATE, DONT_INLINE]
  0x0488: PHI (r16v4 boolean) = (r16v2 boolean), (r16v2 boolean), (r16v2 boolean), (r16v5 boolean) binds: [B:187:0x0470, B:189:0x0476, B:193:0x047f, B:196:0x0486] A[DONT_GENERATE, DONT_INLINE]
  0x0488: PHI (r25v3 java.util.List) = (r25v1 java.util.List), (r25v1 java.util.List), (r25v5 java.util.List), (r25v6 java.util.List) binds: [B:187:0x0470, B:189:0x0476, B:193:0x047f, B:196:0x0486] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x048a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:406:0x043d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013d  */
    /* JADX WARN: Type inference failed for: r30v0, types: [java.util.AbstractMap, java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair A0A(java.util.List r38, java.util.Map r39, boolean r40, boolean r41) {
        /*
            Method dump skipped, instructions count: 1867
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2479Bc6.A0A(java.util.List, java.util.Map, boolean, boolean):android.util.Pair");
    }
}
