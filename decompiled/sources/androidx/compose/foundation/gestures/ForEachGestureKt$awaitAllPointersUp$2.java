package androidx.compose.foundation.gestures;

import X.AbstractC07117nq;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.EnumC1080AXj;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC1074AXb;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2", f = "ForEachGesture.kt", l = {75}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class ForEachGestureKt$awaitAllPointersUp$2 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super Unit>, Object> {
    public /* synthetic */ Object L$0;
    public int label;

    public ForEachGestureKt$awaitAllPointersUp$2(HtJ<? super ForEachGestureKt$awaitAllPointersUp$2> htJ) {
        super(2, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        ForEachGestureKt$awaitAllPointersUp$2 forEachGestureKt$awaitAllPointersUp$2 = new ForEachGestureKt$awaitAllPointersUp$2(htJ);
        forEachGestureKt$awaitAllPointersUp$2.L$0 = obj;
        return forEachGestureKt$awaitAllPointersUp$2;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super Unit> htJ) {
        ForEachGestureKt$awaitAllPointersUp$2 forEachGestureKt$awaitAllPointersUp$2 = new ForEachGestureKt$awaitAllPointersUp$2(htJ);
        forEachGestureKt$awaitAllPointersUp$2.L$0 = interfaceC1074AXb;
        return forEachGestureKt$awaitAllPointersUp$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            InterfaceC1074AXb interfaceC1074AXb = (InterfaceC1074AXb) this.L$0;
            this.label = 1;
            if (ForEachGestureKt.A00(interfaceC1074AXb, EnumC1080AXj.A02, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }
}
