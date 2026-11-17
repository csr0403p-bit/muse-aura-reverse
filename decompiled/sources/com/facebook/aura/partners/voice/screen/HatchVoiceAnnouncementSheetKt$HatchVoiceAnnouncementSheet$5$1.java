package com.facebook.aura.partners.voice.screen;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C05663ul;
import X.C1BO;
import X.C20Z;
import X.C3UX;
import X.C3cI;
import X.C6v3;
import X.EnumC10460Hji;
import X.F2X;
import X.G0V;
import X.Ht9;
import X.HtJ;
import X.Hwg;
import X.InterfaceC2349BUy;
import com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$5$1", f = "HatchVoiceAnnouncementSheet.kt", l = {103}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$5$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<AuraSheetState> $sheetState$delegate;
    public final /* synthetic */ VoiceAnnouncementViewModel $viewModel;
    public int label;

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$5$1$1, reason: invalid class name */
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
            if (value != null && value.isHiding()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$5$1$2, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass2 implements C20Z, InterfaceC2349BUy {
        public final /* synthetic */ VoiceAnnouncementViewModel $tmp0;

        public AnonymousClass2(VoiceAnnouncementViewModel voiceAnnouncementViewModel) {
            this.$tmp0 = voiceAnnouncementViewModel;
        }

        public final Object emit(boolean z, HtJ<? super Unit> htJ) {
            this.$tmp0.sheetHiding = z;
            return Unit.INSTANCE;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof C20Z) && (obj instanceof InterfaceC2349BUy)) {
                return C3cI.A1V(obj, getFunctionDelegate());
            }
            return false;
        }

        @Override // X.InterfaceC2349BUy
        public final Ht9<?> getFunctionDelegate() {
            return new F2X(2, this.$tmp0, VoiceAnnouncementViewModel.class, "onSheetHiding", "onSheetHiding(Z)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // X.C20Z
        public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
            this.$tmp0.sheetHiding = AnonymousClass001.A1X(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$5$1(VoiceAnnouncementViewModel voiceAnnouncementViewModel, C1BO<AuraSheetState> c1bo, HtJ<? super HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$5$1> htJ) {
        super(2, htJ);
        this.$viewModel = voiceAnnouncementViewModel;
        this.$sheetState$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$5$1(this.$viewModel, this.$sheetState$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C05663ul c05663ulA01 = C6v3.A01(new AnonymousClass1(this.$sheetState$delegate));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$viewModel);
            this.label = 1;
            if (c05663ulA01.collect(anonymousClass2, this) == enumC10460Hji) {
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
        return ((HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$5$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
