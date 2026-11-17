package X;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* renamed from: X.1er, reason: invalid class name */
/* loaded from: classes.dex */
public abstract /* synthetic */ class C1er {
    public static final MutableState A00(BFM bfm, Object obj) {
        Object objAaT = bfm.AaT();
        if (objAaT == C78N.A00) {
            objAaT = new ParcelableSnapshotMutableState(AGF.A01(), obj);
            bfm.Ai0(objAaT);
        }
        MutableState mutableState = (MutableState) objAaT;
        mutableState.Af8(obj);
        return mutableState;
    }
}
