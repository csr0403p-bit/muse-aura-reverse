package androidx.collection;

import X.AIN;
import X.AIT;
import X.AbstractC07117nq;
import X.AnonymousClass001;
import X.BOZ;
import X.C8j3;
import X.C8j5;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Add missing generic type declarations: [E] */
@DebugMetadata(c = "androidx.collection.OrderedSetWrapper$iterator$1", f = "OrderedScatterSet.kt", l = {1484}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class OrderedSetWrapper$iterator$1<E> extends AbstractC07117nq implements G0V<BOZ<? super E>, HtJ<? super Unit>, Object> {
    public int I$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ AIN<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderedSetWrapper$iterator$1(AIN<E> ain, HtJ<? super OrderedSetWrapper$iterator$1> htJ) {
        super(2, htJ);
        this.this$0 = ain;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        OrderedSetWrapper$iterator$1 orderedSetWrapper$iterator$1 = new OrderedSetWrapper$iterator$1(this.this$0, htJ);
        orderedSetWrapper$iterator$1.L$0 = obj;
        return orderedSetWrapper$iterator$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object[] objArr;
        long[] jArr;
        int i;
        BOZ boz;
        Object obj2 = EnumC10460Hji.A02;
        int i2 = this.label;
        if (i2 == 0) {
            Hwg.A00(obj);
            BOZ boz2 = (BOZ) this.L$0;
            AIT<E> ait = this.this$0.A00;
            objArr = ait.A06;
            jArr = ait.A05;
            i = ait.A03;
            boz = boz2;
        } else {
            if (i2 != 1) {
                throw AnonymousClass001.A0n();
            }
            i = this.I$0;
            jArr = (long[]) this.L$2;
            objArr = (Object[]) this.L$1;
            BOZ boz3 = (BOZ) this.L$0;
            Hwg.A00(obj);
            boz = boz3;
        }
        while (i != Integer.MAX_VALUE) {
            int iA05 = C8j5.A05(i, jArr);
            Object obj3 = objArr[i];
            this.L$0 = boz;
            this.L$1 = objArr;
            this.L$2 = jArr;
            this.I$0 = iA05;
            this.label = 1;
            if (boz.A00(obj3, this) == obj2) {
                return obj2;
            }
            i = iA05;
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, HtJ<? super Unit> htJ) {
        return ((OrderedSetWrapper$iterator$1) C8j3.A1E(htJ, obj, this)).invokeSuspend(Unit.INSTANCE);
    }
}
