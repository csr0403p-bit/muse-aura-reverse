package X;

import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.view.View;

/* renamed from: X.FPq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnTouchListenerC8017FPq implements View.OnTouchListener {
    public String A02;
    public boolean A04;
    public boolean A05;
    public final GestureDetector A06;
    public final ScaleGestureDetector A07;
    public final ScaleGestureDetectorOnScaleGestureListenerC8018FPr A08;
    public boolean A03 = false;
    public float A00 = Float.MAX_VALUE;
    public float A01 = Float.MAX_VALUE;

    public ViewOnTouchListenerC8017FPq(GestureDetector gestureDetector, ScaleGestureDetector scaleGestureDetector, ScaleGestureDetectorOnScaleGestureListenerC8018FPr scaleGestureDetectorOnScaleGestureListenerC8018FPr, String str, boolean z) {
        this.A08 = scaleGestureDetectorOnScaleGestureListenerC8018FPr;
        this.A06 = gestureDetector;
        this.A07 = scaleGestureDetector;
        this.A04 = z;
        this.A02 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0257 A[Catch: all -> 0x0314, TryCatch #0 {all -> 0x0314, blocks: (B:3:0x0023, B:5:0x0029, B:26:0x00a3, B:28:0x00a9, B:17:0x003e, B:18:0x0041, B:20:0x0048, B:24:0x0083, B:25:0x00a1, B:21:0x006b, B:23:0x0071, B:29:0x00ab, B:31:0x00bb, B:34:0x00c5, B:37:0x00d2, B:45:0x00e2, B:133:0x02a4, B:135:0x02a8, B:136:0x02c8, B:138:0x02d0, B:140:0x02d4, B:141:0x02fa, B:142:0x02fc, B:144:0x0300, B:145:0x0305, B:146:0x030e, B:49:0x00f2, B:51:0x00fb, B:53:0x0101, B:55:0x0107, B:77:0x0158, B:80:0x015e, B:82:0x0167, B:58:0x0110, B:60:0x0114, B:65:0x0121, B:67:0x013a, B:73:0x014f, B:70:0x0145, B:62:0x0118, B:83:0x016e, B:85:0x0174, B:87:0x0178, B:89:0x0188, B:91:0x01a0, B:92:0x01c0, B:93:0x01c2, B:95:0x01c6, B:97:0x01ce, B:99:0x01d6, B:101:0x01de, B:104:0x01e4, B:106:0x01ec, B:108:0x01f2, B:110:0x01fc, B:112:0x020e, B:114:0x0212, B:116:0x0233, B:120:0x0244, B:123:0x0253, B:125:0x0257, B:126:0x025a, B:128:0x0264, B:130:0x0268, B:131:0x028f, B:36:0x00cc), top: B:152:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9 A[Catch: all -> 0x0314, TryCatch #0 {all -> 0x0314, blocks: (B:3:0x0023, B:5:0x0029, B:26:0x00a3, B:28:0x00a9, B:17:0x003e, B:18:0x0041, B:20:0x0048, B:24:0x0083, B:25:0x00a1, B:21:0x006b, B:23:0x0071, B:29:0x00ab, B:31:0x00bb, B:34:0x00c5, B:37:0x00d2, B:45:0x00e2, B:133:0x02a4, B:135:0x02a8, B:136:0x02c8, B:138:0x02d0, B:140:0x02d4, B:141:0x02fa, B:142:0x02fc, B:144:0x0300, B:145:0x0305, B:146:0x030e, B:49:0x00f2, B:51:0x00fb, B:53:0x0101, B:55:0x0107, B:77:0x0158, B:80:0x015e, B:82:0x0167, B:58:0x0110, B:60:0x0114, B:65:0x0121, B:67:0x013a, B:73:0x014f, B:70:0x0145, B:62:0x0118, B:83:0x016e, B:85:0x0174, B:87:0x0178, B:89:0x0188, B:91:0x01a0, B:92:0x01c0, B:93:0x01c2, B:95:0x01c6, B:97:0x01ce, B:99:0x01d6, B:101:0x01de, B:104:0x01e4, B:106:0x01ec, B:108:0x01f2, B:110:0x01fc, B:112:0x020e, B:114:0x0212, B:116:0x0233, B:120:0x0244, B:123:0x0253, B:125:0x0257, B:126:0x025a, B:128:0x0264, B:130:0x0268, B:131:0x028f, B:36:0x00cc), top: B:152:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0165  */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r16, android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC8017FPq.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
