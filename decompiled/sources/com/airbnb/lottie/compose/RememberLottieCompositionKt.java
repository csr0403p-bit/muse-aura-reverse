package com.airbnb.lottie.compose;

import X.AKO;
import X.AbstractC1798ArH;
import X.AbstractC6836Eao;
import X.AnonymousClass003;
import X.B3C;
import X.BAs;
import X.BBI;
import X.BFM;
import X.C18m;
import X.C2325BTz;
import X.C3cG;
import X.C60P;
import X.C78N;
import X.C78e;
import X.Dd5;
import X.FGI;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes4.dex */
public abstract class RememberLottieCompositionKt {
    public static final Dd5 A00(Context context, C18m c18m, String str) {
        if (!(c18m instanceof B3C)) {
            throw C3cG.A0q();
        }
        boolean zEquals = "__LottieInternalDefaultCacheKey__".equals(str);
        int i = ((B3C) c18m).A00;
        if (zEquals) {
            return AbstractC6836Eao.A01(context, FGI.A0S("rawRes", C60P.A00(context) == 32 ? "_night_" : "_day_", i), i);
        }
        return AbstractC6836Eao.A01(context, str, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(android.content.Context r14, X.C18m r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, X.HtJ<? super X.C6837Eap> r20) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.RememberLottieCompositionKt.A02(android.content.Context, X.18m, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    public static final BAs A01(BFM bfm, C18m c18m) {
        bfm.AgF(1388713460);
        C2325BTz c2325BTz = new C2325BTz(1, null);
        BBI bbi = (BBI) bfm;
        Context contextA00 = AKO.A00(AndroidCompositionLocals_androidKt.A01, bbi);
        bfm.AgF(-3686930);
        boolean zA65 = bfm.A65(c18m);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = AbstractC1798ArH.A04(bbi, new BAs());
        }
        BBI.A0R(bbi, false);
        MutableState mutableState = (MutableState) objAaT;
        bfm.AgF(-3686552);
        boolean zA1K = AnonymousClass003.A1K(bfm, c18m, "__LottieInternalDefaultCacheKey__");
        Object objAaT2 = bfm.AaT();
        if (zA1K || objAaT2 == C78N.A00) {
            bfm.Ai0(A00(contextA00, c18m, "__LottieInternalDefaultCacheKey__"));
        }
        BBI.A0R(bbi, false);
        C78e.A04(bfm, c18m, "__LottieInternalDefaultCacheKey__", new RememberLottieCompositionKt$rememberLottieComposition$3(contextA00, mutableState, c18m, null, "fonts/", ".ttf", "__LottieInternalDefaultCacheKey__", null, c2325BTz));
        BAs bAs = (BAs) mutableState.getValue();
        BBI.A0R(bbi, false);
        return bAs;
    }
}
