package X;

import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Alz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1584Alz implements C60K {
    public MutableState<AnV> A00;
    public Function0<AnV> A01;
    public final MutableState A02 = AbstractC1798ArH.A08(false);

    @Override // X.C60K
    public final long AE1() {
        AnV anVInvoke;
        MutableState mutableStateA06 = this.A00;
        if (mutableStateA06 == null) {
            Function0<AnV> function0 = this.A01;
            if (function0 == null || (anVInvoke = function0.invoke()) == null) {
                anVInvoke = AnV.A02;
            }
            mutableStateA06 = AbstractC1798ArH.A06(anVInvoke);
            this.A00 = mutableStateA06;
            this.A01 = null;
        }
        return ((AnV) mutableStateA06.getValue()).A00;
    }
}
