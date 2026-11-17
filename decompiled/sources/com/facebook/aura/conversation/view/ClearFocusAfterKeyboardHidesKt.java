package com.facebook.aura.conversation.view;

import X.AXN;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BFM;
import X.C0Hi;
import X.C1741Ape;
import X.C1743Apg;
import X.C1751Apo;
import X.C78N;
import X.C78e;
import X.G0V;
import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ClearFocusAfterKeyboardHidesKt {
    public static final Function0<Unit> rememberClearFocusAfterKeyboardHides(BFM bfm, int i) {
        View view = (View) bfm.A6v(AndroidCompositionLocals_androidKt.A05);
        C0Hi c0Hi = (C0Hi) bfm.A6v(Am0.A05);
        C1741Ape c1741Ape = C1743Apg.A01(bfm).A02;
        C1751Apo c1751Apo = C1743Apg.A01(bfm).A0A;
        AXN axn = (AXN) bfm.A6v(Am0.A04);
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
        Object[] objArr = {c1741Ape, c1751Apo, axn, c0Hi};
        boolean zA1T = AnonymousClass001.A1T(bfm, c0Hi, AnonymousClass005.A1R(bfm, c1741Ape, axn, c1751Apo));
        Object objAaT2 = bfm.AaT();
        if (zA1T || objAaT2 == obj) {
            objAaT2 = new ClearFocusAfterKeyboardHidesKt$rememberClearFocusAfterKeyboardHides$1$1(c1741Ape, axn, c1751Apo, c0Hi, mutableState, null);
            bfm.Ai0(objAaT2);
        }
        C78e.A08(bfm, (G0V) objAaT2, objArr);
        boolean zA1T2 = AnonymousClass005.A1T(bfm, c0Hi, c1741Ape, axn, bfm.A65(view));
        Object objAaT3 = bfm.AaT();
        if (zA1T2 || objAaT3 == obj) {
            objAaT3 = new ClearFocusAfterKeyboardHidesKt$rememberClearFocusAfterKeyboardHides$2$1(c1741Ape, axn, view, c0Hi, mutableState);
            bfm.Ai0(objAaT3);
        }
        return (Function0) objAaT3;
    }
}
