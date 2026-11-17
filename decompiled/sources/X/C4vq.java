package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.4vq, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4vq {
    /* JADX WARN: Incorrect types in method signature: <R:Ljava/lang/Object;T:Ljava/lang/Object;>(LX/20Z<-TR;>;[LX/20Q<+TT;>;Lkotlin/jvm/functions/Function0<[TT;>;LX/G0W<-LX/20Z<-TR;>;-[TT;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    public static final Object A00(HtJ htJ, Function0 function0, G0W g0w, C20Z c20z, C20Q[] c20qArr) {
        C4vo c4vo = new C4vo(null, function0, g0w, c20z, c20qArr);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = GBM.A00;
        HzQ hzQ = new HzQ(htJ, htJ.getContext());
        Object objA00 = GAj.A00(hzQ, c4vo, hzQ, true);
        return objA00 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA00;
    }
}
