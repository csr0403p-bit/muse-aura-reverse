package com.facebook.aura.conversation.view;

import X.AXN;
import X.AbstractC7559F3s;
import X.C0Hi;
import X.C1Ny;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ClearFocusAfterKeyboardHidesKt$rememberClearFocusAfterKeyboardHides$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $clearFocusPending$delegate;
    public final /* synthetic */ AXN $density;
    public final /* synthetic */ C0Hi $focusManager;
    public final /* synthetic */ C1Ny $imeInsets;
    public final /* synthetic */ View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClearFocusAfterKeyboardHidesKt$rememberClearFocusAfterKeyboardHides$2$1(C1Ny c1Ny, AXN axn, View view, C0Hi c0Hi, MutableState<Boolean> mutableState) {
        super(0);
        this.$imeInsets = c1Ny;
        this.$density = axn;
        this.$view = view;
        this.$focusManager = c0Hi;
        this.$clearFocusPending$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        InputMethodManager inputMethodManager;
        if (this.$imeInsets.ACy(this.$density) <= 0 || (inputMethodManager = (InputMethodManager) this.$view.getContext().getSystemService(InputMethodManager.class)) == null || !inputMethodManager.hideSoftInputFromWindow(this.$view.getWindowToken(), 0)) {
            this.$focusManager.A6G(false);
        } else {
            MutableState.A09(true, this.$clearFocusPending$delegate);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
