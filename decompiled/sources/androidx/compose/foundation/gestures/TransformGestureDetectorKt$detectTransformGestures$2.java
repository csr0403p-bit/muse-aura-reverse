package androidx.compose.foundation.gestures;

import X.AWx;
import X.AbstractC07117nq;
import X.G0V;
import X.G2j;
import X.HtJ;
import X.InterfaceC1074AXb;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", f = "TransformGestureDetector.kt", l = {60, HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TransformGestureDetectorKt$detectTransformGestures$2 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super Unit>, Object> {
    public final /* synthetic */ G2j<AWx, AWx, Float, Float, Unit> $onGesture;
    public final /* synthetic */ boolean $panZoomLock;
    public float F$0;
    public float F$1;
    public float F$2;
    public int I$0;
    public int I$1;
    public long J$0;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (ZLX/G2j<-LX/AWx;-LX/AWx;-Ljava/lang/Float;-Ljava/lang/Float;Lkotlin/Unit;>;LX/HtJ<-Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;>;)V */
    public TransformGestureDetectorKt$detectTransformGestures$2(HtJ htJ, G2j g2j, boolean z) {
        super(2, htJ);
        this.$panZoomLock = z;
        this.$onGesture = g2j;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        TransformGestureDetectorKt$detectTransformGestures$2 transformGestureDetectorKt$detectTransformGestures$2 = new TransformGestureDetectorKt$detectTransformGestures$2(htJ, this.$onGesture, this.$panZoomLock);
        transformGestureDetectorKt$detectTransformGestures$2.L$0 = obj;
        return transformGestureDetectorKt$detectTransformGestures$2;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super Unit> htJ) {
        return ((TransformGestureDetectorKt$detectTransformGestures$2) create(interfaceC1074AXb, htJ)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        r14 = X.AbstractC05181yS.A02(r15);
        r12 = X.AbstractC05181yS.A01(r15);
        r20 = X.AbstractC05181yS.A04(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (r8 != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        r7 = r7 * r14;
        r6 = r6 + r12;
        r3 = X.AWx.A05(r3, r20);
        r16 = X.AbstractC05181yS.A03(r15, false);
        r17 = java.lang.Math.abs(1.0f - r7) * r16;
        r16 = java.lang.Math.abs(((3.1415927f * r6) * r16) / 180.0f);
        r1 = X.AWx.A00(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        if (r17 > r2) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0082, code lost:
    
        if (r16 > r2) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0086, code lost:
    
        if (r1 <= r2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008a, code lost:
    
        if (r25.$panZoomLock == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:
    
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        if (r16 < r2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
        r18 = X.AbstractC05181yS.A05(r15, new X.C3bM(3), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009d, code lost:
    
        if (r9 == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
    
        r12 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
    
        if (r14 != 1.0f) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a8, code lost:
    
        if (r20 != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00aa, code lost:
    
        r12 = r0.size();
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00af, code lost:
    
        if (r1 >= r12) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b1, code lost:
    
        r18 = r0.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c1, code lost:
    
        if (X.AbstractC1078AXh.A00(r18) == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c3, code lost:
    
        r18.A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c6, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cb, code lost:
    
        if (r12 != 0.0f) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ce, code lost:
    
        r25.$onGesture.invoke(new X.AWx(r18), new X.AWx(r20), new java.lang.Float(r14), new java.lang.Float(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f8, code lost:
    
        r12 = r0.size();
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fd, code lost:
    
        if (r1 >= r12) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0109, code lost:
    
        if (r0.get(r1).A0F != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010b, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0049 A[EDGE_INSN: B:60:0x0049->B:13:0x0049 BREAK  A[LOOP:0: B:9:0x0036->B:12:0x0046], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x016f -> B:8:0x002b). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
