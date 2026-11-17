package com.facebook.aura.browsertask.view;

import X.AbstractC2271BQs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.B1U;
import X.B1V;
import X.BA2;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import android.graphics.drawable.Drawable;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class BrowserControlConflictDialogKt {
    public static final void BrowserControlConflictDialog(final String str, final Function0<Unit> function0, BFM bfm, final int i) {
        C7384Etj.A0Y(function0, 1);
        bfm.AgG(-542106363);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120191);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12018f);
            final String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120190);
            B1U b1uA00 = B1V.A00(bfm, new G0V() { // from class: com.facebook.aura.browsertask.view.BrowserControlConflictDialogKt$$ExternalSyntheticLambda0
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    return BrowserControlConflictDialogKt.BrowserControlConflictDialog$lambda$0(strA013, str, function0, (BFM) obj, AnonymousClass001.A0F(obj2));
                }
            }, -667269868);
            boolean zA1B = AnonymousClass003.A1B(iA0d) | AnonymousClass001.A1N(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = new Function0() { // from class: com.facebook.aura.browsertask.view.BrowserControlConflictDialogKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String str2 = str;
                        Function0 function02 = function0;
                        BrowserControlConflictDialogKt.logConflictDialogDismiss(str2);
                        function02.invoke();
                        return Unit.INSTANCE;
                    }
                };
                BBI.A0T(bfm, objAaT);
            }
            AuraAlertDialogKt.AuraAlertDialog((BRg) null, strA01, strA012, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) b1uA00, (Function0<Unit>) objAaT, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, 196608, 0, 1945);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.browsertask.view.BrowserControlConflictDialogKt$$ExternalSyntheticLambda2
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    String str2 = str;
                    Function0 function02 = function0;
                    int i2 = i;
                    AnonymousClass001.A0F(obj2);
                    BrowserControlConflictDialogKt.BrowserControlConflictDialog(str2, function02, (BFM) obj, AnonymousClass011.A00(i2));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit BrowserControlConflictDialog$lambda$0$0$0(String str, final String str2, final Function0 function0, AuraButtonGroupScope auraButtonGroupScope) {
        C7384Etj.A0Y(auraButtonGroupScope, 3);
        auraButtonGroupScope.primaryButton(str, (Drawable) null, true, false, AuraButtonGroupsKt.DEFAULT_PRIMARY_BUTTON_ID, new Function0() { // from class: com.facebook.aura.browsertask.view.BrowserControlConflictDialogKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String str3 = str2;
                Function0 function02 = function0;
                BrowserControlConflictDialogKt.logConflictDialogOkClick(str3);
                function02.invoke();
                return Unit.INSTANCE;
            }
        }, (String) null, Integer.MAX_VALUE, (BRg) BRg.A00);
        return Unit.INSTANCE;
    }

    public static final void logConflictDialogDismiss(String str) {
        HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.CHAT, null, HatchScreen.BROWSER_OVERLAY, HatchComponent.DISMISS_ERROR_BUTTON, null, str != null ? AnonymousClass007.A0c(HatchMetadataKey.BROWSER_TASK_ID, str) : null);
    }

    public static final void logConflictDialogOkClick(String str) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, null, HatchScreen.BROWSER_OVERLAY, HatchComponent.DISMISS_ERROR_BUTTON, null, str != null ? AnonymousClass007.A0c(HatchMetadataKey.BROWSER_TASK_ID, str) : null, null);
    }

    public static /* synthetic */ Unit $r8$lambda$09pD47_XcaUHYUdHFbVIWVk4JoI(String str, Function0 function0) {
        logConflictDialogOkClick(str);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$sLssketvyXJx0dj9NFBpo-wq4Lw, reason: not valid java name */
    public static /* synthetic */ Unit m318$r8$lambda$sLssketvyXJx0dj9NFBpowq4Lw(String str, Function0 function0) {
        logConflictDialogDismiss(str);
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit BrowserControlConflictDialog$lambda$0(final String str, final String str2, final Function0 function0, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            boolean zA1R = AnonymousClass005.A1R(bfm, str, str2, function0);
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new G0U() { // from class: com.facebook.aura.browsertask.view.BrowserControlConflictDialogKt$$ExternalSyntheticLambda4
                    @Override // X.G0U
                    public final Object invoke(Object obj) {
                        return BrowserControlConflictDialogKt.BrowserControlConflictDialog$lambda$0$0$0(str, str2, function0, (AuraButtonGroupScope) obj);
                    }
                };
                BBI.A0T(bfm, objAaT);
            }
            AuraButtonGroupsKt.m2455AuraButtonGroupStyleExplicitFLdL6rA(null, null, null, null, null, null, null, false, (G0U) objAaT, bfm, 0, 255);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    public static final Unit BrowserControlConflictDialog$lambda$0$0$0$0(String str, Function0 function0) {
        logConflictDialogOkClick(str);
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit BrowserControlConflictDialog$lambda$1$0(String str, Function0 function0) {
        logConflictDialogDismiss(str);
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit BrowserControlConflictDialog$lambda$2(String str, Function0 function0, int i, BFM bfm, int i2) {
        BrowserControlConflictDialog(str, function0, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }
}
