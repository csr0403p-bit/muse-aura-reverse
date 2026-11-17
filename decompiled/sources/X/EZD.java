package X;

import androidx.room.TriggerBasedInvalidationTracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class EZD extends AbstractC07127nr implements G0V {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EZD(Object obj, TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, Function0<Unit> function0, HtJ<? super EZD> htJ) {
        super(2, function0);
        this.$t = htJ;
        this.A02 = obj;
        this.A01 = triggerBasedInvalidationTracker;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        Object obj2;
        int i;
        Object obj3;
        Object obj4;
        int i2;
        Object obj5;
        Object obj6;
        int i3;
        Object obj7;
        int i4;
        switch (this.$t) {
            case 0:
                obj2 = this.A02;
                i = 0;
                EZD ezd = new EZD(obj2, htJ, i);
                ezd.A01 = obj;
                return ezd;
            case 1:
                obj2 = this.A02;
                i = 1;
                EZD ezd2 = new EZD(obj2, htJ, i);
                ezd2.A01 = obj;
                return ezd2;
            case 2:
                obj3 = this.A02;
                obj4 = this.A01;
                i2 = 2;
                return new EZD(obj3, (TriggerBasedInvalidationTracker) obj4, (Function0<Unit>) htJ, (HtJ<? super EZD>) i2);
            case 3:
                obj5 = this.A01;
                obj6 = this.A02;
                i3 = 3;
                return new EZD(obj6, (TriggerBasedInvalidationTracker) obj5, (Function0<Unit>) htJ, (HtJ<? super EZD>) i3);
            case 4:
                obj5 = this.A01;
                obj6 = this.A02;
                i3 = 4;
                return new EZD(obj6, (TriggerBasedInvalidationTracker) obj5, (Function0<Unit>) htJ, (HtJ<? super EZD>) i3);
            case 5:
                obj5 = this.A01;
                obj6 = this.A02;
                i3 = 5;
                return new EZD(obj6, (TriggerBasedInvalidationTracker) obj5, (Function0<Unit>) htJ, (HtJ<? super EZD>) i3);
            case 6:
                obj7 = this.A01;
                i4 = 6;
                EZD ezd3 = new EZD(obj7, htJ, i4, 42);
                ezd3.A02 = obj;
                return ezd3;
            case 7:
                obj7 = this.A01;
                i4 = 7;
                EZD ezd32 = new EZD(obj7, htJ, i4, 42);
                ezd32.A02 = obj;
                return ezd32;
            case 8:
                obj3 = this.A02;
                obj4 = this.A01;
                i2 = 8;
                return new EZD(obj3, (TriggerBasedInvalidationTracker) obj4, (Function0<Unit>) htJ, (HtJ<? super EZD>) i2);
            case 9:
                obj2 = this.A02;
                i = 9;
                EZD ezd22 = new EZD(obj2, htJ, i);
                ezd22.A01 = obj;
                return ezd22;
            default:
                obj7 = this.A01;
                i4 = 10;
                EZD ezd322 = new EZD(obj7, htJ, i4, 42);
                ezd322.A02 = obj;
                return ezd322;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0198 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v19, types: [T, java.lang.Boolean] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EZD.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EZD) AbstractC07127nr.A09(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EZD(Object obj, TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, HtJ<? super EZD> htJ) {
        super(2, triggerBasedInvalidationTracker);
        this.$t = htJ;
        this.A02 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EZD(Object obj, HtJ htJ, int i, int i2) {
        super(2, htJ);
        this.$t = i;
        this.A01 = obj;
    }
}
