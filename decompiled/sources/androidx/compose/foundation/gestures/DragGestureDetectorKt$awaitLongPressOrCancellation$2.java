package androidx.compose.foundation.gestures;

import X.AbstractC07117nq;
import X.C10543Hqv;
import X.C1299Agk;
import X.C8j3;
import X.F1F;
import X.G0V;
import X.HtJ;
import X.InterfaceC1074AXb;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", l = {1079, 1101}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class DragGestureDetectorKt$awaitLongPressOrCancellation$2 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C10543Hqv<C1299Agk> $currentDown;
    public final /* synthetic */ F1F $deepPress;
    public final /* synthetic */ C10543Hqv<C1299Agk> $longPress;
    public int I$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/F1F;LX/Hqv<LX/Agk;>;LX/Hqv<LX/Agk;>;LX/HtJ<-Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$2;>;)V */
    public DragGestureDetectorKt$awaitLongPressOrCancellation$2(HtJ htJ, F1F f1f, C10543Hqv c10543Hqv, C10543Hqv c10543Hqv2) {
        super(2, htJ);
        this.$deepPress = f1f;
        this.$currentDown = c10543Hqv;
        this.$longPress = c10543Hqv2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(htJ, this.$deepPress, this.$currentDown, this.$longPress);
        dragGestureDetectorKt$awaitLongPressOrCancellation$2.L$0 = obj;
        return dragGestureDetectorKt$awaitLongPressOrCancellation$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r1 == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        r16.$currentDown.element = r1;
        r16.$longPress.element = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r5 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e5, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0030 A[EDGE_INSN: B:59:0x0030->B:12:0x0030 BREAK  A[LOOP:0: B:8:0x0027->B:32:0x009b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [T, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00fd -> B:7:0x001e). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super Unit> htJ) {
        return ((DragGestureDetectorKt$awaitLongPressOrCancellation$2) C8j3.A1E(htJ, interfaceC1074AXb, this)).invokeSuspend(Unit.INSTANCE);
    }
}
