package com.facebook.aura.activation.view;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass007;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.view.View;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.activation.repo.AuraActivationRepository;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraUserStateOverlayKt$AuraUserStateOverlay$3$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ MutableState<Boolean> $isResetting$delegate;
    public final /* synthetic */ Function0<Unit> $onLogOut;
    public final /* synthetic */ String $resetFailedTitle;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public final /* synthetic */ View $view;

    @DebugMetadata(c = "com.facebook.aura.activation.view.AuraUserStateOverlayKt$AuraUserStateOverlay$3$3$1$1", f = "AuraUserStateOverlay.kt", l = {176}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.view.AuraUserStateOverlayKt$AuraUserStateOverlay$3$3$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ MutableState<Boolean> $isResetting$delegate;
        public final /* synthetic */ Function0<Unit> $onLogOut;
        public final /* synthetic */ String $resetFailedTitle;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public final /* synthetic */ View $view;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC3358CGz abstractC3358CGz, Function0<Unit> function0, View view, String str, MutableState<Boolean> mutableState, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$userSession = abstractC3358CGz;
            this.$onLogOut = function0;
            this.$view = view;
            this.$resetFailedTitle = str;
            this.$isResetting$delegate = mutableState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$userSession, this.$onLogOut, this.$view, this.$resetFailedTitle, this.$isResetting$delegate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    AuraActivationRepository companion = AuraActivationRepository.Companion.getInstance(this.$userSession);
                    this.L$0 = null;
                    this.label = 1;
                    obj = companion.debugResetActivation(this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                AuraActivationRepository.DebugResetActivationResult debugResetActivationResult = (AuraActivationRepository.DebugResetActivationResult) obj;
                MutableState.A09(false, this.$isResetting$delegate);
                if (debugResetActivationResult != null) {
                    this.$onLogOut.invoke();
                } else {
                    AuraToast.Companion companion2 = AuraToast.Companion;
                    AnonymousClass007.A0l(this.$view, companion2, AuraToast.Duration.LONG, this.$resetFailedTitle);
                }
            } catch (Exception unused) {
                MutableState.A09(false, this.$isResetting$delegate);
                AuraToast.Companion companion3 = AuraToast.Companion;
                AnonymousClass007.A0l(this.$view, companion3, AuraToast.Duration.LONG, this.$resetFailedTitle);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraUserStateOverlayKt$AuraUserStateOverlay$3$3$1(C3UX c3ux, MutableState<Boolean> mutableState, AbstractC3358CGz abstractC3358CGz, Function0<Unit> function0, View view, String str) {
        super(0);
        this.$coroutineScope = c3ux;
        this.$isResetting$delegate = mutableState;
        this.$userSession = abstractC3358CGz;
        this.$onLogOut = function0;
        this.$view = view;
        this.$resetFailedTitle = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (MutableState.A0A((MutableState) this.$isResetting$delegate)) {
            return;
        }
        MutableState.A09(true, this.$isResetting$delegate);
        AnonymousClass001.A1J(new AnonymousClass1(this.$userSession, this.$onLogOut, this.$view, this.$resetFailedTitle, this.$isResetting$delegate, null), this.$coroutineScope);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
