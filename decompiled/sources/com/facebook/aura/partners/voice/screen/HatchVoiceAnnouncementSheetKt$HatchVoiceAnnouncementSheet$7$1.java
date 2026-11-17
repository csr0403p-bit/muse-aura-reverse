package com.facebook.aura.partners.voice.screen;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C05663ul;
import X.C1BO;
import X.C3UX;
import X.C3cG;
import X.C6v3;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$7$1", f = "HatchVoiceAnnouncementSheet.kt", l = {HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 114}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$7$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<AuraSheetState> $sheetState$delegate;
    public final /* synthetic */ boolean $showsVoiceNux;
    public final /* synthetic */ VoiceNuxTransition $transition;
    public final /* synthetic */ VoiceAnnouncementViewModel $viewModel;
    public int label;

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$7$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ C1BO<AuraSheetState> $sheetState$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C1BO<AuraSheetState> c1bo) {
            super(0);
            this.$sheetState$delegate = c1bo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            AuraSheetState value = this.$sheetState$delegate.getValue();
            boolean z = false;
            if (value != null && !value.isSettled()) {
                z = true;
            }
            return C3cG.A0P(z);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$7$1$2", f = "HatchVoiceAnnouncementSheet.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$7$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
        public /* synthetic */ boolean Z$0;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.Z$0 = AnonymousClass001.A1X(obj);
            return anonymousClass2;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            if (this.label == 0) {
                return AnonymousClass001.A0k(obj, z);
            }
            throw AnonymousClass001.A0n();
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
            return invoke(AnonymousClass001.A1X(bool), htJ);
        }

        public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass2) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$7$1(VoiceNuxTransition voiceNuxTransition, boolean z, VoiceAnnouncementViewModel voiceAnnouncementViewModel, C1BO<AuraSheetState> c1bo, HtJ<? super HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$7$1> htJ) {
        super(2, htJ);
        this.$transition = voiceNuxTransition;
        this.$showsVoiceNux = z;
        this.$viewModel = voiceAnnouncementViewModel;
        this.$sheetState$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$7$1(this.$transition, this.$showsVoiceNux, this.$viewModel, this.$sheetState$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            VoiceNuxTransition voiceNuxTransition = this.$transition;
            boolean z = this.$showsVoiceNux;
            this.label = 1;
            if (voiceNuxTransition.switchTo(z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                this.$viewModel.onVoiceNuxShown();
                return Unit.INSTANCE;
            }
            Hwg.A00(obj);
        }
        if (this.$showsVoiceNux) {
            C05663ul c05663ulA01 = C6v3.A01(new AnonymousClass1(this.$sheetState$delegate));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
            this.label = 2;
            if (AbstractC9777Gfy.A00(this, anonymousClass2, c05663ulA01) == enumC10460Hji) {
                return enumC10460Hji;
            }
            this.$viewModel.onVoiceNuxShown();
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$7$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
