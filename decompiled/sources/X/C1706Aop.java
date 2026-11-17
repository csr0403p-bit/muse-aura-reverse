package X;

import androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback", f = "ComposeScrollCaptureCallback.android.kt", l = {134, 137}, m = "onScrollCaptureImageRequest", v = 1)
/* renamed from: X.Aop, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1706Aop extends HzP {
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ComposeScrollCaptureCallback this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1706Aop(ComposeScrollCaptureCallback composeScrollCaptureCallback, HtJ<? super C1706Aop> htJ) {
        super(htJ);
        this.this$0 = composeScrollCaptureCallback;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ComposeScrollCaptureCallback.A03(null, this.this$0, null, this);
    }
}
