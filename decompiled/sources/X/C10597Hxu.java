package X;

import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Add missing generic type declarations: [T] */
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", l = {215, 415}, m = "invokeSuspend", v = 1)
/* renamed from: X.Hxu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10597Hxu<T> extends AbstractC07127nr implements G0W<C3UX, C20Z<? super T>, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C20Q<T> $this_debounceInternal;
    public final /* synthetic */ G0U<T, Long> $timeoutMillisSelector;
    public int I$0;
    public int I$1;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/G0U<-TT;Ljava/lang/Long;>;LX/20Q<+TT;>;LX/HtJ<-LX/Hxu;>;)V */
    public C10597Hxu(HtJ htJ, G0U g0u, C20Q c20q) {
        super(3, htJ);
        this.$timeoutMillisSelector = g0u;
        this.$this_debounceInternal = c20q;
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, Object obj, HtJ<? super Unit> htJ) {
        C10597Hxu c10597Hxu = new C10597Hxu(htJ, this.$timeoutMillisSelector, this.$this_debounceInternal);
        c10597Hxu.L$0 = c3ux;
        c10597Hxu.L$1 = obj;
        return c10597Hxu.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00c5 -> B:7:0x0022). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10597Hxu.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
