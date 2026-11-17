package X;

import androidx.compose.runtime.MutableState;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class AFz {
    public static final MutableState A00(BFM bfm, AFs aFs, Function0 function0, Object[] objArr) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        C7384Etj.A0Z(aFs, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver, kotlin.Any>");
        return (MutableState) A02(bfm, new C0872AFu(new C2296BSw(aFs, 17), C2297BSx.A00(aFs, 30)), function0, objArrCopyOf, 0);
    }

    public static final Object A01(BFM bfm, AFs aFs, Function0 function0, Object[] objArr) {
        return A02(bfm, aFs, function0, Arrays.copyOf(objArr, objArr.length), 0);
    }

    @Deprecated(message = " 'rememberSaveable' with a custom 'key' is no longer supported. It bypasses positional scoping, leading to state bugs and inconsistent behavior (e.g., unintentional state sharing or loss, issues in nested LazyLayouts). Please remove the 'key' parameter to use positional scoping for consistent, locally-scoped state. See https://r.android.com/3610053 for details.")
    public static final Object A02(BFM bfm, AFs aFs, Function0 function0, final Object[] objArr, int i) {
        final Object objInvoke;
        Object objInvoke2;
        Object objA71;
        final AFs aFs2 = aFs;
        if ((i & 2) != 0) {
            aFs2 = AG6.A00;
        }
        BBI bbi = (BBI) bfm;
        final String string = Long.toString(bbi.A06, 36);
        C7384Etj.A0U(string);
        C7384Etj.A0Z(aFs2, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        final AFx aFx = (AFx) AKO.A08(AG8.A00, BBI.A04(bbi));
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        if (objAaT == obj) {
            if (aFx == null || (objA71 = aFx.A71(string)) == null || (objInvoke2 = aFs2.Abb(objA71)) == null) {
                objInvoke2 = function0.invoke();
            }
            objAaT = new AG1(aFx, aFs2, objInvoke2, string, objArr);
            bfm.Ai0(objAaT);
        }
        final AG1 ag1 = (AG1) objAaT;
        if (!Arrays.equals(objArr, ag1.A05) || (objInvoke = ag1.A03) == null) {
            objInvoke = function0.invoke();
        }
        boolean zA67 = bfm.A67(ag1) | (bfm.A67(aFs2)) | bfm.A67(aFx) | bfm.A65(string) | bfm.A67(objInvoke) | bfm.A67(objArr);
        Object objAaT2 = bfm.AaT();
        if (zA67 || objAaT2 == obj) {
            objAaT2 = new Function0() { // from class: X.AG0
                /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean z;
                    AG1 ag12 = ag1;
                    AFs<T, Object> aFs3 = aFs2;
                    AFx aFx2 = aFx;
                    String str = string;
                    ?? r4 = objInvoke;
                    Object[] objArr2 = objArr;
                    boolean z2 = true;
                    if (ag12.A01 != aFx2) {
                        ag12.A01 = aFx2;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (ag12.A04.equals(str)) {
                        z2 = z;
                    } else {
                        ag12.A04 = str;
                    }
                    ag12.A02 = aFs3;
                    ag12.A03 = r4;
                    ag12.A05 = objArr2;
                    AG2 ag2 = ag12.A00;
                    if (ag2 != null && z2) {
                        ag2.Ahh();
                        ag12.A00 = null;
                        AG1.A00(ag12);
                    }
                    return Unit.INSTANCE;
                }
            };
            bfm.Ai0(objAaT2);
        }
        bfm.AZp((Function0) objAaT2);
        return objInvoke;
    }

    public static final Object A03(BFM bfm, Function0 function0, Object[] objArr) {
        return A02(bfm, AG6.A00, function0, Arrays.copyOf(objArr, objArr.length), 0);
    }
}
