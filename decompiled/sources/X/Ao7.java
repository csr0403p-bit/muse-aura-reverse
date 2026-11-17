package X;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class Ao7 {
    public final Function0<Float> A00;
    public final Function0<Float> A01;
    public final boolean A02;

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ScrollAxisRange(value=");
        sbA0x.append(AnonymousClass003.A04(this.A01));
        sbA0x.append(", maxValue=");
        sbA0x.append(AnonymousClass003.A04(this.A00));
        sbA0x.append(", reverseScrolling=");
        sbA0x.append(this.A02);
        return AnonymousClass006.A0z(sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function0<Ljava/lang/Float;>;Lkotlin/jvm/functions/Function0<Ljava/lang/Float;>;Z)V */
    public Ao7(boolean z, Function0 function0, Function0 function02) {
        this.A01 = function0;
        this.A00 = function02;
        this.A02 = z;
    }
}
