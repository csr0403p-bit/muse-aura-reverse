package com.facebook.aura.iap.iac;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C10543Hqv;
import X.C7384Etj;
import X.F1F;
import X.G0W;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraIacBottomSheetLauncher$show$finish$1 extends AbstractC7559F3s implements G0W<String, Integer, Integer, Unit> {
    public final /* synthetic */ ViewGroup $decorView;
    public final /* synthetic */ G0W<String, Integer, Integer, Unit> $deliver;
    public final /* synthetic */ F1F $delivered;
    public final /* synthetic */ C10543Hqv<ComposeView> $host;

    public final void invoke(String str, int i, int i2) {
        C7384Etj.A0Y(str, 0);
        if (this.$delivered.element) {
            return;
        }
        AnonymousClass001.A1G(str, Integer.valueOf(i), this.$deliver, i2);
        ComposeView composeView = this.$host.element;
        if (composeView != null) {
            this.$decorView.removeView(composeView);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraIacBottomSheetLauncher$show$finish$1(F1F f1f, G0W<? super String, ? super Integer, ? super Integer, Unit> g0w, C10543Hqv<ComposeView> c10543Hqv, ViewGroup viewGroup) {
        super(3);
        this.$delivered = f1f;
        this.$deliver = g0w;
        this.$host = c10543Hqv;
        this.$decorView = viewGroup;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(String str, Integer num, Integer num2) {
        invoke(str, AnonymousClass001.A0F(num), AnonymousClass001.A0F(num2));
        return Unit.INSTANCE;
    }
}
