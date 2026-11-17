package com.facebook.aura.navigation;

import X.AXN;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BFM;
import X.C1er;
import X.C3UX;
import X.C78N;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchDragDismissStateKt {
    public static final float FadeDistance = 320.0f;
    public static final float HatchDragDismissDistance = 96.0f;
    public static final float HatchDragDismissFlingDistance = 24.0f;
    public static final float HatchDragDismissFlingVelocity = 900.0f;
    public static final int SETTLE_DURATION_MS = 240;

    public static final float getHatchDragDismissDistance() {
        return HatchDragDismissDistance;
    }

    public static final float getHatchDragDismissFlingDistance() {
        return HatchDragDismissFlingDistance;
    }

    public static final float getHatchDragDismissFlingVelocity() {
        return HatchDragDismissFlingVelocity;
    }

    public static final HatchDragDismissState rememberHatchDragDismissState(AuraNavKey auraNavKey, Function0<Unit> function0, Function0<Unit> function02, BFM bfm, int i) {
        AnonymousClass005.A0x(auraNavKey, function0, function02);
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, objAaT, obj);
        AXN axnA0Y = AnonymousClass002.A0Y(bfm);
        HatchInteractiveBackController hatchInteractiveBackControllerRememberHatchInteractiveBackController = HatchInteractiveBackControllerKt.rememberHatchInteractiveBackController(auraNavKey, function0, bfm, i & 126);
        float fAh4 = axnA0Y.Ah4(HatchDragDismissDistance);
        float fAh42 = axnA0Y.Ah4(HatchDragDismissFlingDistance);
        float fAh43 = axnA0Y.Ah4(HatchDragDismissFlingVelocity);
        float fAh44 = axnA0Y.Ah4(FadeDistance);
        MutableState mutableStateA00 = C1er.A00(bfm, function02);
        boolean zA1K = AnonymousClass003.A1K(bfm, c3ux, hatchInteractiveBackControllerRememberHatchInteractiveBackController) | bfm.A62(fAh4) | bfm.A62(fAh42) | bfm.A62(fAh43) | bfm.A62(fAh44);
        Object objAaT2 = bfm.AaT();
        if (zA1K || objAaT2 == obj) {
            objAaT2 = new HatchDragDismissState(c3ux, hatchInteractiveBackControllerRememberHatchInteractiveBackController, fAh4, fAh42, fAh43, fAh44, new HatchDragDismissStateKt$rememberHatchDragDismissState$1$1(mutableStateA00));
            bfm.Ai0(objAaT2);
        }
        return (HatchDragDismissState) objAaT2;
    }
}
