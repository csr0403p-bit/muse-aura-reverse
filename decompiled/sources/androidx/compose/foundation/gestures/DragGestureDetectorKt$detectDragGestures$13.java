package androidx.compose.foundation.gestures;

import X.AWx;
import X.AbstractC07117nq;
import X.AnonymousClass001;
import X.C1299Agk;
import X.EnumC10460Hji;
import X.EnumC1080AXj;
import X.EnumC1108AYu;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HtJ;
import X.Hwg;
import X.InterfaceC1074AXb;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$13", f = "DragGestureDetector.kt", l = {248, 249}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$detectDragGestures$13 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super Unit>, Object> {
    public final /* synthetic */ G0V<C1299Agk, AWx, Unit> $onDrag;
    public final /* synthetic */ Function0<Unit> $onDragCancel;
    public final /* synthetic */ G0U<C1299Agk, Unit> $onDragEnd;
    public final /* synthetic */ G0W<C1299Agk, C1299Agk, AWx, Unit> $onDragStart;
    public final /* synthetic */ EnumC1108AYu $orientationLock;
    public final /* synthetic */ Function0<Boolean> $shouldAwaitTouchSlop;
    public /* synthetic */ Object L$0;
    public int label;

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        InterfaceC1074AXb interfaceC1074AXb;
        Object objA04 = obj;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            interfaceC1074AXb = (InterfaceC1074AXb) this.L$0;
            EnumC1080AXj enumC1080AXj = EnumC1080AXj.A03;
            this.L$0 = interfaceC1074AXb;
            this.label = 1;
            objA04 = TapGestureDetectorKt.A04(interfaceC1074AXb, enumC1080AXj, this, false);
            if (objA04 == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Unit.INSTANCE;
            }
            interfaceC1074AXb = (InterfaceC1074AXb) this.L$0;
            Hwg.A00(obj);
        }
        Function0<Boolean> function0 = this.$shouldAwaitTouchSlop;
        EnumC1108AYu enumC1108AYu = this.$orientationLock;
        G0W<C1299Agk, C1299Agk, AWx, Unit> g0w = this.$onDragStart;
        G0V<C1299Agk, AWx, Unit> g0v = this.$onDrag;
        Function0<Unit> function02 = this.$onDragCancel;
        G0U<C1299Agk, Unit> g0u = this.$onDragEnd;
        this.L$0 = null;
        this.label = 2;
        if (DragGestureDetectorKt.A01(enumC1108AYu, interfaceC1074AXb, (C1299Agk) objA04, this, function0, function02, g0u, g0v, g0w) == enumC10460Hji) {
            return enumC10460Hji;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function0<Ljava/lang/Boolean;>;LX/AYu;LX/G0W<-LX/Agk;-LX/Agk;-LX/AWx;Lkotlin/Unit;>;LX/G0V<-LX/Agk;-LX/AWx;Lkotlin/Unit;>;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/G0U<-LX/Agk;Lkotlin/Unit;>;LX/HtJ<-Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$13;>;)V */
    public DragGestureDetectorKt$detectDragGestures$13(EnumC1108AYu enumC1108AYu, HtJ htJ, Function0 function0, Function0 function02, G0U g0u, G0V g0v, G0W g0w) {
        super(2, htJ);
        this.$shouldAwaitTouchSlop = function0;
        this.$orientationLock = enumC1108AYu;
        this.$onDragStart = g0w;
        this.$onDrag = g0v;
        this.$onDragCancel = function02;
        this.$onDragEnd = g0u;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        Function0<Boolean> function0 = this.$shouldAwaitTouchSlop;
        EnumC1108AYu enumC1108AYu = this.$orientationLock;
        G0W<C1299Agk, C1299Agk, AWx, Unit> g0w = this.$onDragStart;
        DragGestureDetectorKt$detectDragGestures$13 dragGestureDetectorKt$detectDragGestures$13 = new DragGestureDetectorKt$detectDragGestures$13(enumC1108AYu, htJ, function0, this.$onDragCancel, this.$onDragEnd, this.$onDrag, g0w);
        dragGestureDetectorKt$detectDragGestures$13.L$0 = obj;
        return dragGestureDetectorKt$detectDragGestures$13;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super Unit> htJ) {
        return ((DragGestureDetectorKt$detectDragGestures$13) create(interfaceC1074AXb, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
