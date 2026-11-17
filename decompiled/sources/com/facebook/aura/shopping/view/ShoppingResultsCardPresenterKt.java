package com.facebook.aura.shopping.view;

import X.AKO;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BBI;
import X.BFM;
import X.BOD;
import X.C1BO;
import X.C5wL;
import X.C7384Etj;
import android.os.LocaleList;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.model.ShoppingResultsAttribution;
import com.facebook.aura.shopping.viewmodel.ShoppingResultsCardDisplayState;
import com.facebook.aura.shopping.viewmodel.ShoppingResultsCardInputs;
import com.facebook.aura.shopping.viewmodel.ShoppingResultsCardViewModel;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class ShoppingResultsCardPresenterKt {
    public static final ShoppingResultsCardDisplayState shoppingResultsCardDisplayState(String str, List<ShoppingResultProduct> list, ShoppingResultsAttribution shoppingResultsAttribution, int i, BFM bfm, int i2) {
        Locale locale;
        boolean zA1b = AnonymousClass004.A1b(str, list);
        BBI bbi = (BBI) bfm;
        LocaleList localeListA02 = AKO.A02(AndroidCompositionLocals_androidKt.A00, bbi);
        if (localeListA02.isEmpty() || (locale = localeListA02.get(zA1b ? 1 : 0)) == null) {
            locale = Locale.getDefault();
        }
        AbstractC3358CGz abstractC3358CGzA06 = AKO.A06(LocalUserSessionKt.LocalUserSession, bbi);
        C7384Etj.A0X(locale);
        ShoppingResultsCardInputs shoppingResultsCardInputs = new ShoppingResultsCardInputs(list, shoppingResultsAttribution, i, locale);
        String strIdentity = shoppingResultsCardInputs.identity(str);
        ShoppingResultsCardViewModel.Factory factory = new ShoppingResultsCardViewModel.Factory(abstractC3358CGzA06, shoppingResultsCardInputs);
        BOD bodA00 = C5wL.A00(bfm);
        if (bodA00 != null) {
            return (ShoppingResultsCardDisplayState) C1BO.A07(bfm, ((ShoppingResultsCardViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), ShoppingResultsCardViewModel.class, strIdentity)).uiState);
        }
        throw AnonymousClass001.A0o();
    }
}
