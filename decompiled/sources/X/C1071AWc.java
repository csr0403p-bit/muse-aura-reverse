package X;

import com.meta.compose.indication.bouncy.BouncyNode;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.meta.compose.indication.bouncy.BouncyNode", f = "BouncyIndication.kt", l = {72}, m = "animateToResting", v = 2)
/* renamed from: X.AWc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1071AWc extends HzP {
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BouncyNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1071AWc(BouncyNode bouncyNode, HtJ<? super C1071AWc> htJ) {
        super(htJ);
        this.this$0 = bouncyNode;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return BouncyNode.A01(this.this$0, this, false);
    }
}
