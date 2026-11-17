package com.facebook.aura.toast;

import X.AbstractC7559F3s;
import X.C78T;
import X.GBM;
import X.InterfaceC10560Hsz;
import android.view.View;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchToastHostKt$HatchToastHostOverlay$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraToast.ToastArgs $args;
    public final /* synthetic */ MutableState<InterfaceC10560Hsz<Unit>> $pendingDismiss$delegate;
    public final /* synthetic */ View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchToastHostKt$HatchToastHostOverlay$3$1(AuraToast.ToastArgs toastArgs, View view, MutableState<InterfaceC10560Hsz<Unit>> mutableState) {
        super(0);
        this.$args = toastArgs;
        this.$view = view;
        this.$pendingDismiss$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        C78T c78t;
        View.OnClickListener onClickListener = this.$args.onClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(this.$view);
        }
        if (!this.$args.dismissOnClick || (c78t = (InterfaceC10560Hsz) this.$pendingDismiss$delegate.getValue()) == null) {
            return;
        }
        ((GBM) c78t).A0R(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
