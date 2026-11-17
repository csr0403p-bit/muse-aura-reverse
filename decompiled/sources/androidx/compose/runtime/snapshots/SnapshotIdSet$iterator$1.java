package androidx.compose.runtime.snapshots;

import X.AI7;
import X.AbstractC07117nq;
import X.BOZ;
import X.C8j3;
import X.G0V;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", l = {252, 256, 263}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class SnapshotIdSet$iterator$1 extends AbstractC07117nq implements G0V<BOZ<? super Long>, HtJ<? super Unit>, Object> {
    public int I$0;
    public int I$1;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ AI7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotIdSet$iterator$1(AI7 ai7, HtJ<? super SnapshotIdSet$iterator$1> htJ) {
        super(2, htJ);
        this.this$0 = ai7;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        SnapshotIdSet$iterator$1 snapshotIdSet$iterator$1 = new SnapshotIdSet$iterator$1(this.this$0, htJ);
        snapshotIdSet$iterator$1.L$0 = obj;
        return snapshotIdSet$iterator$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        r11 = r17.this$0;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if ((r11.A02 & (r14 << r5)) == 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        r0 = X.C3cG.A0S((r11.A00 + r5) + 64);
        r17.L$0 = r4;
        r17.L$1 = null;
        r17.I$0 = r5;
        r17.label = 3;
        r0 = r4.A00(r0, r17);
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (r0 != r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
    
        if (r12 >= 64) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c8, code lost:
    
        if (r17.this$0.A02 == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d3, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r5 < 64) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x002f -> B:8:0x0022). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0048 -> B:8:0x0022). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0070 -> B:23:0x0082). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0099 -> B:33:0x00bd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00af -> B:33:0x00bd). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(BOZ<? super Long> boz, HtJ<? super Unit> htJ) {
        return ((SnapshotIdSet$iterator$1) C8j3.A1E(htJ, boz, this)).invokeSuspend(Unit.INSTANCE);
    }
}
