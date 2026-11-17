package X;

import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", l = {113, 118}, m = "onPostFling-RZ2iAVY", v = 1)
/* renamed from: X.Akw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1538Akw extends HzP {
    public long J$0;
    public long J$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NestedScrollNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1538Akw(NestedScrollNode nestedScrollNode, HtJ<? super C1538Akw> htJ) {
        super(htJ);
        this.this$0 = nestedScrollNode;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo3onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
