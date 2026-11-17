package com.facebook.aura.vds.toolbar;

import X.AbstractC1712Aov;
import X.AbstractC7559F3s;
import X.C10384HaO;
import X.C2AA;
import X.C7384Etj;
import X.C8j4;
import X.G0U;
import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes4.dex */
public final class NavIconKt$navIconModifier$modifier$1$1 extends AbstractC7559F3s implements G0U<C2AA, Boolean> {
    public final /* synthetic */ View $nextViewToFocus;

    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
    public final Boolean m3130invokeZmokQxo(KeyEvent keyEvent) {
        boolean z;
        C7384Etj.A0Y(keyEvent, 0);
        if (this.$nextViewToFocus != null && C8j4.A0N(keyEvent) == C10384HaO.A0c && AbstractC1712Aov.A00(keyEvent) == 2) {
            this.$nextViewToFocus.requestFocus();
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavIconKt$navIconModifier$modifier$1$1(View view) {
        super(1);
        this.$nextViewToFocus = view;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Boolean invoke(C2AA c2aa) {
        return m3130invokeZmokQxo(c2aa.A00);
    }
}
