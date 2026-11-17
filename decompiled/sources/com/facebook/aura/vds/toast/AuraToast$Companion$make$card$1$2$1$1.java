package com.facebook.aura.vds.toast;

import X.AbstractC7559F3s;
import X.Hm3;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraToast$Companion$make$card$1$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $dismissOnClick;
    public final /* synthetic */ View.OnClickListener $onClickListener;
    public final /* synthetic */ Hm3 $snackbar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraToast$Companion$make$card$1$2$1$1(View.OnClickListener onClickListener, Hm3 hm3, boolean z) {
        super(0);
        this.$onClickListener = onClickListener;
        this.$snackbar = hm3;
        this.$dismissOnClick = z;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        View.OnClickListener onClickListener = this.$onClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(this.$snackbar.A0E);
        }
        if (this.$dismissOnClick) {
            this.$snackbar.A04(3);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
