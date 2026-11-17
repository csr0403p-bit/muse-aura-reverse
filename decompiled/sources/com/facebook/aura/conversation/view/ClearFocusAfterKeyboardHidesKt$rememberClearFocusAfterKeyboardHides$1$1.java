package com.facebook.aura.conversation.view;

import X.AXN;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C05663ul;
import X.C0Hi;
import X.C1Ny;
import X.C20Z;
import X.C3UX;
import X.C6v3;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HxE;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.conversation.view.ClearFocusAfterKeyboardHidesKt$rememberClearFocusAfterKeyboardHides$1$1", f = "ClearFocusAfterKeyboardHides.kt", l = {32}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ClearFocusAfterKeyboardHidesKt$rememberClearFocusAfterKeyboardHides$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Boolean> $clearFocusPending$delegate;
    public final /* synthetic */ AXN $density;
    public final /* synthetic */ C0Hi $focusManager;
    public final /* synthetic */ C1Ny $imeInsets;
    public final /* synthetic */ C1Ny $imeTarget;
    public int label;

    /* renamed from: com.facebook.aura.conversation.view.ClearFocusAfterKeyboardHidesKt$rememberClearFocusAfterKeyboardHides$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<HxE<? extends Integer, ? extends Integer>> {
        public final /* synthetic */ AXN $density;
        public final /* synthetic */ C1Ny $imeInsets;
        public final /* synthetic */ C1Ny $imeTarget;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C1Ny c1Ny, AXN axn, C1Ny c1Ny2) {
            super(0);
            this.$imeInsets = c1Ny;
            this.$density = axn;
            this.$imeTarget = c1Ny2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final HxE<? extends Integer, ? extends Integer> invoke() {
            return AnonymousClass002.A0p(Integer.valueOf(this.$imeInsets.ACy(this.$density)), this.$imeTarget.ACy(this.$density));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClearFocusAfterKeyboardHidesKt$rememberClearFocusAfterKeyboardHides$1$1(C1Ny c1Ny, AXN axn, C1Ny c1Ny2, C0Hi c0Hi, MutableState<Boolean> mutableState, HtJ<? super ClearFocusAfterKeyboardHidesKt$rememberClearFocusAfterKeyboardHides$1$1> htJ) {
        super(2, htJ);
        this.$imeInsets = c1Ny;
        this.$density = axn;
        this.$imeTarget = c1Ny2;
        this.$focusManager = c0Hi;
        this.$clearFocusPending$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ClearFocusAfterKeyboardHidesKt$rememberClearFocusAfterKeyboardHides$1$1(this.$imeInsets, this.$density, this.$imeTarget, this.$focusManager, this.$clearFocusPending$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C05663ul c05663ulA01 = C6v3.A01(new AnonymousClass1(this.$imeInsets, this.$density, this.$imeTarget));
            final C0Hi c0Hi = this.$focusManager;
            final MutableState<Boolean> mutableState = this.$clearFocusPending$delegate;
            C20Z c20z = new C20Z() { // from class: com.facebook.aura.conversation.view.ClearFocusAfterKeyboardHidesKt$rememberClearFocusAfterKeyboardHides$1$1.2
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((HxE<Integer, Integer>) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(HxE<Integer, Integer> hxE, HtJ<? super Unit> htJ) {
                    int iA0F = AnonymousClass001.A0F(hxE.first);
                    int iA0F2 = AnonymousClass001.A0F(hxE.second);
                    if (MutableState.A0A((MutableState) mutableState)) {
                        if (iA0F2 > 0) {
                            MutableState.A09(false, mutableState);
                        } else if (iA0F == 0) {
                            MutableState.A09(false, mutableState);
                            c0Hi.A6G(false);
                        }
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (c05663ulA01.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((ClearFocusAfterKeyboardHidesKt$rememberClearFocusAfterKeyboardHides$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
