package androidx.room;

import X.AbstractC07127nr;
import X.EJ8;
import X.EJA;
import X.EJE;
import X.G0V;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1", f = "InvalidationTracker.kt", l = {318, 319}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1 extends AbstractC07127nr implements G0V<EJE<Unit>, HtJ<? super Unit>, Object> {
    public final /* synthetic */ EJA $connection;
    public final /* synthetic */ EJ8[] $tablesToSync;
    public int I$0;
    public int I$1;
    public int I$2;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ TriggerBasedInvalidationTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: ([LX/EJ8;Landroidx/room/TriggerBasedInvalidationTracker;LX/EJA;LX/HtJ<-Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1;>;)V */
    public TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1(EJA eja, TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, HtJ htJ, EJ8[] ej8Arr) {
        super(2, htJ);
        this.$tablesToSync = ej8Arr;
        this.this$0 = triggerBasedInvalidationTracker;
        this.$connection = eja;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        EJ8[] ej8Arr = this.$tablesToSync;
        return new TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1(this.$connection, this.this$0, htJ, ej8Arr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005a -> B:10:0x0034). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006f -> B:10:0x0034). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.Hji r11 = X.EnumC10460Hji.A02
            int r0 = r12.label
            r10 = 2
            r9 = 1
            r8 = 0
            if (r0 == 0) goto L12
            if (r0 == r9) goto L1f
            if (r0 == r10) goto L1f
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L12:
            X.Hwg.A00(r13)
            X.EJ8[] r3 = r12.$tablesToSync
            androidx.room.TriggerBasedInvalidationTracker r4 = r12.this$0
            X.EJA r5 = r12.$connection
            int r0 = r3.length
            r6 = 0
            r7 = 0
            goto L36
        L1f:
            int r0 = r12.I$2
            int r7 = r12.I$1
            int r6 = r12.I$0
            java.lang.Object r5 = r12.L$2
            X.EJD r5 = (X.EJD) r5
            java.lang.Object r4 = r12.L$1
            androidx.room.TriggerBasedInvalidationTracker r4 = (androidx.room.TriggerBasedInvalidationTracker) r4
            java.lang.Object r3 = r12.L$0
            X.EJ8[] r3 = (X.EJ8[]) r3
            X.Hwg.A00(r13)
        L34:
            int r7 = r7 + 1
        L36:
            if (r7 >= r0) goto L76
            r1 = r3[r7]
            int r2 = r6 + 1
            int r1 = r1.ordinal()
            if (r1 == r8) goto L6f
            if (r1 == r9) goto L5c
            if (r1 != r10) goto L71
            r12.L$0 = r3
            r12.L$1 = r4
            r12.L$2 = r5
            r12.I$0 = r2
            r12.I$1 = r7
            r12.I$2 = r0
            r12.label = r10
            java.lang.Object r1 = androidx.room.TriggerBasedInvalidationTracker.A02(r5, r4, r12, r6)
        L58:
            if (r1 == r11) goto L78
            r6 = r2
            goto L34
        L5c:
            r12.L$0 = r3
            r12.L$1 = r4
            r12.L$2 = r5
            r12.I$0 = r2
            r12.I$1 = r7
            r12.I$2 = r0
            r12.label = r9
            java.lang.Object r1 = androidx.room.TriggerBasedInvalidationTracker.A01(r5, r4, r12, r6)
            goto L58
        L6f:
            r6 = r2
            goto L34
        L71:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L76:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
        L78:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(EJE<Unit> eje, HtJ<? super Unit> htJ) {
        return ((TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1) AbstractC07127nr.A09(htJ, eje, this)).invokeSuspend(Unit.INSTANCE);
    }
}
