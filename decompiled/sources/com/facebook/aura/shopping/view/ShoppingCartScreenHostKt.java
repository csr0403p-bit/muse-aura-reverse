package com.facebook.aura.shopping.view;

import X.AKO;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BRg;
import X.C1BO;
import X.C2CK;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C78N;
import X.G0U;
import X.G0V;
import X.InterfaceC7353EnQ;
import android.content.Context;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.shopping.viewmodel.ShoppingCartUiState;
import com.facebook.aura.shopping.viewmodel.ShoppingCartViewModel;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class ShoppingCartScreenHostKt {

    /* renamed from: com.facebook.aura.shopping.view.ShoppingCartScreenHostKt$ShoppingCartScreenHost$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $messageId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $presentationId;
        public final /* synthetic */ String $sessionId;
        public final /* synthetic */ String $widgetId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(String str, String str2, String str3, String str4, BRg bRg, int i, int i2) {
            super(2);
            this.$messageId = str;
            this.$presentationId = str2;
            this.$widgetId = str3;
            this.$sessionId = str4;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ShoppingCartScreenHostKt.ShoppingCartScreenHost(this.$messageId, this.$presentationId, this.$widgetId, this.$sessionId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void ShoppingCartScreenHost(String str, String str2, String str3, String str4, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(str, str2);
        bfm.AgG(332539446);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str3);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str4);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BBI bbi = (BBI) bfm;
            AbstractC3358CGz abstractC3358CGzA06 = AKO.A06(LocalUserSessionKt.LocalUserSession, bbi);
            AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
            Context contextA01 = AKO.A01(bbi);
            ShoppingCartViewModel.Factory factory = new ShoppingCartViewModel.Factory(str4, str, str2, str3, abstractC3358CGzA06);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            ShoppingCartViewModel shoppingCartViewModel = (ShoppingCartViewModel) C3cH.A0H(factory, bodA00, AnonymousClass005.A0Y(bodA00), C3cG.A0x(ShoppingCartViewModel.class));
            C1BO c1boA02 = C2CK.A02(bfm, shoppingCartViewModel.uiState);
            Boolean boolValueOf = Boolean.valueOf(((ShoppingCartUiState) c1boA02.getValue()).checkoutSucceeded);
            boolean zA1V = AnonymousClass002.A1V(bfm, auraNavigatorA05, C3cH.A1O(bfm, c1boA02, shoppingCartViewModel, abstractC3358CGzA06), (iA0d & 7168) == 2048);
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new ShoppingCartScreenHostKt$ShoppingCartScreenHost$1$1(shoppingCartViewModel, abstractC3358CGzA06, str4, auraNavigatorA05, c1boA02);
                BBI.A0O(bbi, objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, boolValueOf);
            ShoppingCartUiState shoppingCartUiState = (ShoppingCartUiState) c1boA02.getValue();
            boolean zA67 = bfm.A67(auraNavigatorA05);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == C78N.A00) {
                objAaT2 = new ShoppingCartScreenHostKt$ShoppingCartScreenHost$2$1(auraNavigatorA05);
                BBI.A0O(bbi, objAaT2);
            }
            Function0 function0 = (Function0) objAaT2;
            boolean zA672 = bfm.A67(shoppingCartViewModel);
            Object objAaT3 = bfm.AaT();
            if (zA672 || objAaT3 == C78N.A00) {
                objAaT3 = new ShoppingCartScreenHostKt$ShoppingCartScreenHost$3$1(shoppingCartViewModel);
                BBI.A0O(bbi, objAaT3);
            }
            Function0 function02 = (Function0) ((InterfaceC7353EnQ) objAaT3);
            boolean zA673 = bfm.A67(shoppingCartViewModel);
            Object objAaT4 = bfm.AaT();
            if (zA673 || objAaT4 == C78N.A00) {
                objAaT4 = new ShoppingCartScreenHostKt$ShoppingCartScreenHost$4$1(shoppingCartViewModel);
                BBI.A0O(bbi, objAaT4);
            }
            Function0 function03 = (Function0) ((InterfaceC7353EnQ) objAaT4);
            boolean zA1V2 = AnonymousClass005.A1V(bfm, abstractC3358CGzA06, contextA01, auraNavigatorA05, bfm.A67(shoppingCartViewModel));
            Object objAaT5 = bfm.AaT();
            if (zA1V2 || objAaT5 == C78N.A00) {
                objAaT5 = new ShoppingCartScreenHostKt$ShoppingCartScreenHost$5$1(shoppingCartViewModel, abstractC3358CGzA06, contextA01, auraNavigatorA05);
                BBI.A0O(bbi, objAaT5);
            }
            ShoppingCartScreenKt.ShoppingCartScreen(shoppingCartUiState, function0, function02, function03, (G0U) objAaT5, shoppingCartViewModel.checkoutLogContext((ShoppingCartUiState) c1boA02.getValue()), bRg2, bfm, (iA0d << 6) & 3670016, zA1b ? 1 : 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass6(str, str2, str3, str4, bRg2, i, i2);
        }
    }

    public static final /* synthetic */ ShoppingCartUiState access$ShoppingCartScreenHost$lambda$0(C1BO c1bo) {
        return (ShoppingCartUiState) c1bo.getValue();
    }
}
