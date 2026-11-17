package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.57m, reason: invalid class name */
/* loaded from: classes2.dex */
public interface C57m {
    /* JADX WARN: Incorrect types in method signature: (LX/Hou;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;)V */
    void A3l(InterfaceC10526Hou interfaceC10526Hou, Integer num, Integer num2, String str, Function0 function0);

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;ZILX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    Object AAY(String str, HtJ htJ, int i, boolean z);

    C1BN<InterfaceC05673vm> ADx();

    Object AXy(boolean z, HtJ<? super Unit> htJ);

    void Aav(InterfaceC10526Hou interfaceC10526Hou, String str);

    void Acv(boolean z);

    void Acw(float f);

    void Adk(boolean z);

    static boolean A00(C57m c57m) {
        return c57m.ADx().getValue() instanceof C57l;
    }
}
