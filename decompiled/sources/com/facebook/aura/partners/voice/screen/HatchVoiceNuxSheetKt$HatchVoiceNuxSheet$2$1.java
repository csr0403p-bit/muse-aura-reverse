package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchVoiceNuxSheetKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchVoiceNuxSheetKt$HatchVoiceNuxSheet$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1BO<AuraNavigator> $navigator$delegate;
    public final /* synthetic */ VoiceNuxSheetViewModel $viewModel;

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceNuxSheetKt$HatchVoiceNuxSheet$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public final Boolean invoke(AuraNavKey auraNavKey) {
            C7384Etj.A0Y(auraNavKey, 0);
            return Boolean.valueOf(auraNavKey instanceof HatchVoiceNuxSheetKey);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchVoiceNuxSheetKt$HatchVoiceNuxSheet$2$1(VoiceNuxSheetViewModel voiceNuxSheetViewModel, C1BO<? extends AuraNavigator> c1bo) {
        super(0);
        this.$viewModel = voiceNuxSheetViewModel;
        this.$navigator$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.onContinue();
        this.$navigator$delegate.getValue().popAll(AnonymousClass1.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
