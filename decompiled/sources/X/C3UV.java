package X;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.Arrays;
import kotlin.Unit;

/* renamed from: X.3UV, reason: invalid class name */
/* loaded from: classes.dex */
public abstract /* synthetic */ class C3UV {
    public static final MutableState A00(BFM bfm, Object obj, Object obj2, Object obj3, G0V g0v) {
        Object objAaT = bfm.AaT();
        Object obj4 = C78N.A00;
        if (objAaT == obj4) {
            objAaT = AnonymousClass004.A11(bfm, obj);
        }
        MutableState mutableState = (MutableState) objAaT;
        boolean zA67 = bfm.A67(g0v);
        Object objAaT2 = bfm.AaT();
        if (zA67 || objAaT2 == obj4) {
            objAaT2 = new C05393bl(g0v, (C1BO<AWx>) mutableState, (AT5<AWx, ARY>) null, (HtJ<? super C05393bl>) 12);
            bfm.Ai0(objAaT2);
        }
        AnonymousClass001.A1A(bfm, objAaT2, obj2, obj3);
        return mutableState;
    }

    public static final MutableState A01(BFM bfm, Object obj, Object obj2, G0V g0v) {
        Object objAaT = bfm.AaT();
        Object obj3 = C78N.A00;
        if (objAaT == obj3) {
            objAaT = AnonymousClass004.A11(bfm, obj);
        }
        MutableState mutableState = (MutableState) objAaT;
        boolean zA67 = bfm.A67(g0v);
        Object objAaT2 = bfm.AaT();
        if (zA67 || objAaT2 == obj3) {
            objAaT2 = new C05393bl(g0v, (C1BO<AWx>) mutableState, (AT5<AWx, ARY>) null, (HtJ<? super C05393bl>) 11);
            bfm.Ai0(objAaT2);
        }
        AnonymousClass001.A18(bfm, objAaT2, obj2);
        return mutableState;
    }

    public static final MutableState A02(BFM bfm, Object obj, G0V g0v) {
        Object objAaT = bfm.AaT();
        Object obj2 = C78N.A00;
        if (objAaT == obj2) {
            objAaT = AnonymousClass004.A11(bfm, obj);
        }
        MutableState mutableState = (MutableState) objAaT;
        Unit unit = Unit.INSTANCE;
        boolean zA67 = bfm.A67(g0v);
        Object objAaT2 = bfm.AaT();
        if (zA67 || objAaT2 == obj2) {
            objAaT2 = new C05393bl(g0v, (C1BO<AWx>) mutableState, (AT5<AWx, ARY>) null, (HtJ<? super C05393bl>) 10);
            bfm.Ai0(objAaT2);
        }
        AnonymousClass001.A18(bfm, objAaT2, unit);
        return mutableState;
    }

    public static final MutableState A03(BFM bfm, Object obj, G0V g0v, Object[] objArr) {
        Object objAaT = bfm.AaT();
        Object obj2 = C78N.A00;
        if (objAaT == obj2) {
            objAaT = new ParcelableSnapshotMutableState(AGF.A01(), obj);
            bfm.Ai0(objAaT);
        }
        MutableState mutableState = (MutableState) objAaT;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        boolean zA67 = bfm.A67(g0v);
        Object objAaT2 = bfm.AaT();
        if (zA67 || objAaT2 == obj2) {
            objAaT2 = new C05393bl(g0v, (C1BO<AWx>) mutableState, (AT5<AWx, ARY>) null, (HtJ<? super C05393bl>) 13);
            bfm.Ai0(objAaT2);
        }
        C78e.A08(bfm, (G0V) objAaT2, objArrCopyOf);
        return mutableState;
    }
}
