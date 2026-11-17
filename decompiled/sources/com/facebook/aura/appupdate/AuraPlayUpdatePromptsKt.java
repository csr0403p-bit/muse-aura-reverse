package com.facebook.aura.appupdate;

import X.AKO;
import X.AbstractC2271BQs;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BBI;
import X.BFM;
import X.C78N;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.R;

/* loaded from: classes4.dex */
public abstract class AuraPlayUpdatePromptsKt {
    public static final AuraPlayUpdatePrompts rememberPlayUpdatePrompts(BFM bfm, int i) {
        BBI bbi = (BBI) bfm;
        Context contextA00 = AKO.A00(AndroidCompositionLocals_androidKt.A01, bbi);
        String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120631);
        String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120632);
        String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120630);
        String strA014 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12062f);
        boolean zA1R = AnonymousClass001.A1R(bfm, strA014, AnonymousClass005.A1T(bfm, strA01, strA012, strA013, bfm.A65(contextA00)));
        Object objAaT = bfm.AaT();
        if (zA1R || objAaT == C78N.A00) {
            objAaT = new AuraPlayUpdatePrompts(contextA00, strA01, strA012, strA013, strA014);
            BBI.A0O(bbi, objAaT);
        }
        return (AuraPlayUpdatePrompts) objAaT;
    }
}
