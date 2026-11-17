package com.facebook.aura.activation.view;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.C5b2;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.view.View;
import com.facebook.aura.activation.repo.AuraActivationRepository;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import com.facebook.aura.vds.compose.toast.AuraToastOption;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraUserStateOverlayKt$WaitlistStatusDropdownMenu$1$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ String $failedToastTitle;
    public final /* synthetic */ Function0<Unit> $onDismissRequest;
    public final /* synthetic */ Function0<Unit> $onStatusChangeFinished;
    public final /* synthetic */ Function0<Unit> $onStatusChangeStarted;
    public final /* synthetic */ View $parentView;
    public final /* synthetic */ C5b2 $status;
    public final /* synthetic */ String $successToastTitle;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    @DebugMetadata(c = "com.facebook.aura.activation.view.AuraUserStateOverlayKt$WaitlistStatusDropdownMenu$1$1$2$1$1", f = "AuraUserStateOverlay.kt", l = {252}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.view.AuraUserStateOverlayKt$WaitlistStatusDropdownMenu$1$1$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $failedToastTitle;
        public final /* synthetic */ Function0<Unit> $onStatusChangeFinished;
        public final /* synthetic */ View $parentView;
        public final /* synthetic */ C5b2 $status;
        public final /* synthetic */ String $successToastTitle;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC3358CGz abstractC3358CGz, C5b2 c5b2, Function0<Unit> function0, View view, String str, String str2, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$userSession = abstractC3358CGz;
            this.$status = c5b2;
            this.$onStatusChangeFinished = function0;
            this.$parentView = view;
            this.$successToastTitle = str;
            this.$failedToastTitle = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$userSession, this.$status, this.$onStatusChangeFinished, this.$parentView, this.$successToastTitle, this.$failedToastTitle, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            AuraToast auraToastM3114makeKDArT4I;
            Object objDebugSetWaitlistStatus = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(objDebugSetWaitlistStatus);
                    AuraActivationRepository companion = AuraActivationRepository.Companion.getInstance(this.$userSession);
                    C5b2 c5b2 = this.$status;
                    this.L$0 = null;
                    this.label = 1;
                    objDebugSetWaitlistStatus = companion.debugSetWaitlistStatus(c5b2, false, this);
                    if (objDebugSetWaitlistStatus == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(objDebugSetWaitlistStatus);
                }
                AuraActivationRepository.DebugSetWaitlistStatusResult debugSetWaitlistStatusResult = (AuraActivationRepository.DebugSetWaitlistStatusResult) objDebugSetWaitlistStatus;
                this.$onStatusChangeFinished.invoke();
                if (debugSetWaitlistStatusResult == null || !debugSetWaitlistStatusResult.success) {
                    auraToastM3114makeKDArT4I = AuraToast.Companion.m3114makeKDArT4I(this.$parentView, this.$failedToastTitle, null, AuraToast.Duration.LONG, null, AuraToastOption.None.INSTANCE, null, false, null, AuraThemeMode.DEFAULT, null, null, false, false, null, null, null, AuraIconSize.MEDIUM, null);
                    if (auraToastM3114makeKDArT4I != null) {
                        auraToastM3114makeKDArT4I.show();
                    }
                } else {
                    auraToastM3114makeKDArT4I = AuraToast.Companion.m3114makeKDArT4I(this.$parentView, this.$successToastTitle, null, AuraToast.Duration.SHORT, null, AuraToastOption.None.INSTANCE, null, false, null, AuraThemeMode.DEFAULT, null, null, false, false, null, null, null, AuraIconSize.MEDIUM, null);
                    if (auraToastM3114makeKDArT4I != null) {
                        auraToastM3114makeKDArT4I.show();
                    }
                }
            } catch (Exception unused) {
                this.$onStatusChangeFinished.invoke();
                AuraToast auraToastM3114makeKDArT4I2 = AuraToast.Companion.m3114makeKDArT4I(this.$parentView, this.$failedToastTitle, null, AuraToast.Duration.LONG, null, AuraToastOption.None.INSTANCE, null, false, null, AuraThemeMode.DEFAULT, null, null, false, false, null, null, null, AuraIconSize.MEDIUM, null);
                if (auraToastM3114makeKDArT4I2 != null) {
                    auraToastM3114makeKDArT4I2.show();
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraUserStateOverlayKt$WaitlistStatusDropdownMenu$1$1$2$1(Function0<Unit> function0, Function0<Unit> function02, C3UX c3ux, AbstractC3358CGz abstractC3358CGz, C5b2 c5b2, Function0<Unit> function03, View view, String str, String str2) {
        super(0);
        this.$onDismissRequest = function0;
        this.$onStatusChangeStarted = function02;
        this.$coroutineScope = c3ux;
        this.$userSession = abstractC3358CGz;
        this.$status = c5b2;
        this.$onStatusChangeFinished = function03;
        this.$parentView = view;
        this.$successToastTitle = str;
        this.$failedToastTitle = str2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onDismissRequest.invoke();
        this.$onStatusChangeStarted.invoke();
        AnonymousClass001.A1J(new AnonymousClass1(this.$userSession, this.$status, this.$onStatusChangeFinished, this.$parentView, this.$successToastTitle, this.$failedToastTitle, null), this.$coroutineScope);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
