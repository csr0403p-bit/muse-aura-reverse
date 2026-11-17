package X;

import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", l = {236}, m = "invokeSuspend", v = 1)
/* loaded from: classes6.dex */
public final class HyZ extends AbstractC07127nr implements G0V<HoI<? extends Object>, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C20Z<T> $downstream;
    public final /* synthetic */ C10543Hqv<Object> $lastValue;
    public int I$0;
    public int I$1;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/Hqv<Ljava/lang/Object;>;LX/20Z<-TT;>;LX/HtJ<-LX/HyZ;>;)V */
    public HyZ(HtJ htJ, C10543Hqv c10543Hqv, C20Z c20z) {
        super(2, htJ);
        this.$lastValue = c10543Hqv;
        this.$downstream = c20z;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HyZ hyZ = new HyZ(htJ, this.$lastValue, this.$downstream);
        hyZ.L$0 = ((HoI) obj).A00;
        return hyZ;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(HoI<? extends Object> hoI, HtJ<? super Unit> htJ) {
        return ((HyZ) create(new HoI(hoI.A00), htJ)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [T, X.HrH] */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.Object] */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws Throwable {
        C10543Hqv<Object> c10543Hqv;
        Ho5 ho5;
        Throwable th;
        ?? r6 = this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            c10543Hqv = this.$lastValue;
            boolean z = r6 instanceof C2zT;
            if (!z) {
                c10543Hqv.element = r6;
            }
            C20Z<T> c20z = this.$downstream;
            if (z) {
                if ((r6 instanceof Ho5) && (ho5 = (Ho5) r6) != null && (th = ho5.A00) != null) {
                    throw th;
                }
                Object obj2 = c10543Hqv.element;
                if (obj2 != null) {
                    if (obj2 == HwN.A01) {
                        obj2 = null;
                    }
                    this.L$0 = null;
                    this.L$1 = r6;
                    this.L$2 = c10543Hqv;
                    this.L$3 = null;
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    if (c20z.emit(obj2, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        c10543Hqv = (C10543Hqv) this.L$2;
        Hwg.A00(obj);
        c10543Hqv.element = HwN.A00;
        return Unit.INSTANCE;
    }
}
