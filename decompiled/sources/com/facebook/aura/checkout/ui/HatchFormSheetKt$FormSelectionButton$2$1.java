package com.facebook.aura.checkout.ui;

import X.AbstractC1712Aov;
import X.AbstractC7559F3s;
import X.C10384HaO;
import X.C1BO;
import X.C2AA;
import X.C7384Etj;
import X.C8j4;
import X.G0U;
import android.view.KeyEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchFormSheetKt$FormSelectionButton$2$1 extends AbstractC7559F3s implements G0U<C2AA, Boolean> {
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnClick$delegate;

    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
    public final Boolean m348invokeZmokQxo(KeyEvent keyEvent) {
        boolean z;
        C7384Etj.A0Y(keyEvent, 0);
        long jA0N = C8j4.A0N(keyEvent);
        if (jA0N == C10384HaO.A0F || jA0N == C10384HaO.A0R || jA0N == C10384HaO.A0A || jA0N == C10384HaO.A0b) {
            if (AbstractC1712Aov.A00(keyEvent) == 1) {
                C1BO.A0D(this.$currentOnClick$delegate);
            }
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchFormSheetKt$FormSelectionButton$2$1(C1BO<? extends Function0<Unit>> c1bo) {
        super(1);
        this.$currentOnClick$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Boolean invoke(C2AA c2aa) {
        return m348invokeZmokQxo(c2aa.A00);
    }
}
