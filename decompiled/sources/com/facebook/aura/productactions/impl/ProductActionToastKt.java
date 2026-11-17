package com.facebook.aura.productactions.impl;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.B6A;
import X.BFM;
import X.BPD;
import X.BRn;
import X.C3cH;
import X.C78N;
import X.G0U;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.toast.api.ToastApi;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import com.facebook.aura.vds.compose.toast.AuraToastOption;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.Unit;

/* loaded from: classes2.dex */
public abstract class ProductActionToastKt {
    public static final G0U<Boolean, Unit> productSaveToast(BFM bfm, int i) {
        final G0U<Integer, Unit> g0uProductActionToast = productActionToast(bfm, 0);
        boolean zA65 = bfm.A65(g0uProductActionToast);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = new G0U() { // from class: com.facebook.aura.productactions.impl.ProductActionToastKt$$ExternalSyntheticLambda0
                @Override // X.G0U
                public final Object invoke(Object obj) {
                    return ProductActionToastKt.productSaveToast$lambda$0$0(g0uProductActionToast, AnonymousClass001.A1X(obj));
                }
            };
            bfm.Ai0(objAaT);
        }
        return (G0U) objAaT;
    }

    public static final Unit productActionToast$lambda$0$0(BRn bRn, Context context, long j, int i) {
        ToastApi toastApi = ToastApi.INSTANCE;
        String strAgV = bRn.AgV(context, i);
        AuraIconSize auraIconSize = AuraIconSize.SMALL;
        toastApi.showToast(new AuraToast.ToastArgs(strAgV, null, AuraToast.Duration.SHORT, Integer.valueOf(R.drawable.circle_check_wght400_filled_24), AuraToastOption.None.INSTANCE, null, false, null, AuraThemeMode.DEFAULT, null, null, false, false, null, null, null, auraIconSize, new B6A(j)));
        return Unit.INSTANCE;
    }

    public static final G0U<Integer, Unit> productActionToast(BFM bfm, int i) {
        final Context contextA0H = AnonymousClass002.A0H(bfm);
        final BRn bRn = (BRn) bfm.A6v(BPD.A00);
        final long j = C3cH.A0W(bfm).success;
        boolean zA1M = AnonymousClass003.A1M(bfm, bRn, contextA0H) | bfm.A64(j);
        Object objAaT = bfm.AaT();
        if (zA1M || objAaT == C78N.A00) {
            objAaT = new G0U() { // from class: com.facebook.aura.productactions.impl.ProductActionToastKt$$ExternalSyntheticLambda1
                @Override // X.G0U
                public final Object invoke(Object obj) {
                    return ProductActionToastKt.productActionToast$lambda$0$0(bRn, contextA0H, j, AnonymousClass001.A0F(obj));
                }
            };
            bfm.Ai0(objAaT);
        }
        return (G0U) objAaT;
    }

    public static final Unit productSaveToast$lambda$0$0(G0U g0u, boolean z) {
        g0u.invoke(Integer.valueOf(productSaveToastTitle(z)));
        return Unit.INSTANCE;
    }

    public static final int productSaveToastTitle(boolean z) {
        return z ? R.string._name_removed__res_0x7f120570 : R.string._name_removed__res_0x7f12056b;
    }
}
