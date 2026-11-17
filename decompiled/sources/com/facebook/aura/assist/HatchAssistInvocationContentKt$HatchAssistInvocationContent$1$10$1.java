package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import X.G0V;
import android.content.Context;
import com.facebook.aura.utils.HatchPermissionUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchAssistInvocationContentKt$HatchAssistInvocationContent$1$10$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ G0V<String, Function0<Unit>, Unit> $onRequestPermission;
    public final /* synthetic */ HatchAssistOverlayViewModel $overlayViewModel;

    /* renamed from: com.facebook.aura.assist.HatchAssistInvocationContentKt$HatchAssistInvocationContent$1$10$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ HatchAssistOverlayViewModel $overlayViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchAssistOverlayViewModel hatchAssistOverlayViewModel, Context context) {
            super(0);
            this.$overlayViewModel = hatchAssistOverlayViewModel;
            this.$context = context;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$overlayViewModel.onMicClick(this.$context);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchAssistInvocationContentKt$HatchAssistInvocationContent$1$10$1(Context context, HatchAssistOverlayViewModel hatchAssistOverlayViewModel, G0V<? super String, ? super Function0<Unit>, Unit> g0v) {
        super(0);
        this.$context = context;
        this.$overlayViewModel = hatchAssistOverlayViewModel;
        this.$onRequestPermission = g0v;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (HatchPermissionUtils.INSTANCE.hasPermission(this.$context, "android.permission.RECORD_AUDIO")) {
            this.$overlayViewModel.onMicClick(this.$context);
        } else {
            this.$onRequestPermission.invoke("android.permission.RECORD_AUDIO", new AnonymousClass1(this.$overlayViewModel, this.$context));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
