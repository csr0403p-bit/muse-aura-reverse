package X;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {921}, m = "awaitAllPointersUpWithSlopDetection", v = 1)
/* renamed from: X.AyC, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2087AyC extends HzP {
    public float F$0;
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.A02(null, null, null, this);
    }

    public C2087AyC(HtJ<? super C2087AyC> htJ) {
        super(htJ);
    }
}
