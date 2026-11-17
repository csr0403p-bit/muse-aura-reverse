package com.facebook.aura.partners.voice.screen;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1BO;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchVoiceAnnouncementSheetKey;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$6$1", f = "HatchVoiceAnnouncementSheet.kt", l = {106}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$6$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<AuraNavigator> $navigator$delegate;
    public final /* synthetic */ VoiceAnnouncementViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$6$1(VoiceAnnouncementViewModel voiceAnnouncementViewModel, C1BO<? extends AuraNavigator> c1bo, HtJ<? super HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$6$1> htJ) {
        super(2, htJ);
        this.$viewModel = voiceAnnouncementViewModel;
        this.$navigator$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$6$1(this.$viewModel, this.$navigator$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<Unit> c22i = this.$viewModel.closeSheet;
            final C1BO<AuraNavigator> c1bo = this.$navigator$delegate;
            C20Z<? super Unit> c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$6$1.1

                /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$6$1$1$1, reason: invalid class name and collision with other inner class name */
                public final class C02991 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
                    public static final C02991 INSTANCE = new C02991();

                    public C02991() {
                        super(1);
                    }

                    @Override // X.G0U
                    public final Boolean invoke(AuraNavKey auraNavKey) {
                        C7384Etj.A0Y(auraNavKey, 0);
                        return Boolean.valueOf(auraNavKey instanceof HatchVoiceAnnouncementSheetKey);
                    }
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((Unit) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                    c1bo.getValue().popAll(C02991.INSTANCE);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (c22i.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        throw C3cG.A0p();
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$6$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
