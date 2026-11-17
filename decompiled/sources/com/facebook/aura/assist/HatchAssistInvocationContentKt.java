package com.facebook.aura.assist;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.B1V;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C0dx;
import X.C1890At8;
import X.C1BO;
import X.C20Q;
import X.C2CK;
import X.C7384Etj;
import X.C78N;
import X.C7bA;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.InterfaceC7353EnQ;
import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.aura.composer.dictation.ComposerDictationController;
import com.facebook.aura.composer.dictation.DictationMicAvailabilityKt;
import com.facebook.aura.composer.dictation.WaveformBuffer;
import com.facebook.aura.conversation.viewmodel.HatchConversationAnnouncement;
import com.facebook.aura.conversation.viewmodel.HatchConversationUiState;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class HatchAssistInvocationContentKt {

    /* renamed from: com.facebook.aura.assist.HatchAssistInvocationContentKt$AssistOnScreenEffect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ HatchConversationViewModel $conversation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchConversationViewModel hatchConversationViewModel, int i) {
            super(2);
            this.$conversation = hatchConversationViewModel;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchAssistInvocationContentKt.AssistOnScreenEffect(this.$conversation, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.assist.HatchAssistInvocationContentKt$AssistUploadEffects$2, reason: invalid class name and case insensitive filesystem */
    public final class C109562 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ HatchConversationViewModel $conversation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109562(HatchConversationViewModel hatchConversationViewModel, int i) {
            super(2);
            this.$conversation = hatchConversationViewModel;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchAssistInvocationContentKt.AssistUploadEffects(this.$conversation, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.assist.HatchAssistInvocationContentKt$HatchAssistInvocationContent$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<BRg, Function0<? extends Unit>, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onCollapseVoice;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ G0V<String, Function0<Unit>, Unit> $onRequestPermission;
        public final /* synthetic */ HatchAssistOverlayViewModel $overlayViewModel;
        public final /* synthetic */ String $threadId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(HatchAssistOverlayViewModel hatchAssistOverlayViewModel, String str, Function0<Unit> function0, Function0<Unit> function02, G0V<? super String, ? super Function0<Unit>, Unit> g0v) {
            super(4);
            this.$overlayViewModel = hatchAssistOverlayViewModel;
            this.$threadId = str;
            this.$onDismissRequest = function0;
            this.$onCollapseVoice = function02;
            this.$onRequestPermission = g0v;
        }

        public final void invoke(BRg bRg, Function0<Unit> function0, BFM bfm, int i) {
            C7384Etj.A0Y(bRg, 0);
            int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, bRg) : i;
            if ((i & 48) == 0) {
                iA0d |= AnonymousClass004.A0U(bfm, function0);
            }
            if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
                bfm.Afo();
                return;
            }
            Context contextA0O = AnonymousClass003.A0O(bfm);
            VoiceCallStateHolder companion = VoiceCallStateHolder.Companion.getInstance(AnonymousClass002.A0h(bfm));
            C1BO c1boA02 = C2CK.A02(bfm, this.$overlayViewModel.overlayState);
            C1BO c1boA022 = C2CK.A02(bfm, this.$overlayViewModel.conversationViewModel.uiState);
            C1BO c1boA023 = C2CK.A02(bfm, this.$overlayViewModel.conversationViewModel.dictation.isActive);
            C1BO c1boA024 = C2CK.A02(bfm, this.$overlayViewModel.conversationViewModel.listItems);
            C1BO c1boA025 = C2CK.A02(bfm, HatchAssistContextHolder.screenshot);
            AssistOverlayState assistOverlayState = (AssistOverlayState) c1boA02.getValue();
            HatchConversationUiState hatchConversationUiState = (HatchConversationUiState) c1boA022.getValue();
            AHD ahdA0C = C1BO.A0C(c1boA024);
            Bitmap bitmap = (Bitmap) c1boA025.getValue();
            HatchAssistOverlayViewModel hatchAssistOverlayViewModel = this.$overlayViewModel;
            C1890At8 c1890At8 = hatchAssistOverlayViewModel.conversationViewModel.composerTextState;
            boolean zA67 = bfm.A67(hatchAssistOverlayViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchAssistInvocationContentKt$HatchAssistInvocationContent$1$1$1(hatchAssistOverlayViewModel);
                bfm.Ai0(objAaT);
            }
            InterfaceC7353EnQ interfaceC7353EnQ = (InterfaceC7353EnQ) objAaT;
            Object obj = this.$overlayViewModel.conversationViewModel;
            boolean zA672 = bfm.A67(obj);
            Object objAaT2 = bfm.AaT();
            if (zA672 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchAssistInvocationContentKt$HatchAssistInvocationContent$1$2$1(obj);
                bfm.Ai0(objAaT2);
            }
            InterfaceC7353EnQ interfaceC7353EnQ2 = (InterfaceC7353EnQ) objAaT2;
            boolean zIsAutoSubmitMicAvailable = DictationMicAvailabilityKt.isAutoSubmitMicAvailable(this.$overlayViewModel.conversationViewModel.dictation, bfm, ComposerDictationController.$stable);
            WaveformBuffer waveformBuffer = this.$overlayViewModel.conversationViewModel.dictation.waveformBuffer;
            boolean zA0F = C1BO.A0F(c1boA023);
            Object obj2 = this.$overlayViewModel;
            boolean zA673 = bfm.A67(obj2);
            Object objAaT3 = bfm.AaT();
            if (zA673 || objAaT3 == C78N.A00) {
                objAaT3 = new HatchAssistInvocationContentKt$HatchAssistInvocationContent$1$3$1(obj2);
                bfm.Ai0(objAaT3);
            }
            InterfaceC7353EnQ interfaceC7353EnQ3 = (InterfaceC7353EnQ) objAaT3;
            Object obj3 = this.$overlayViewModel;
            boolean zA674 = bfm.A67(obj3);
            Object objAaT4 = bfm.AaT();
            if (zA674 || objAaT4 == C78N.A00) {
                objAaT4 = new HatchAssistInvocationContentKt$HatchAssistInvocationContent$1$4$1(obj3);
                bfm.Ai0(objAaT4);
            }
            InterfaceC7353EnQ interfaceC7353EnQ4 = (InterfaceC7353EnQ) objAaT4;
            Object obj4 = this.$overlayViewModel;
            boolean zA675 = bfm.A67(obj4);
            Object objAaT5 = bfm.AaT();
            if (zA675 || objAaT5 == C78N.A00) {
                objAaT5 = new HatchAssistInvocationContentKt$HatchAssistInvocationContent$1$5$1(obj4);
                bfm.Ai0(objAaT5);
            }
            InterfaceC7353EnQ interfaceC7353EnQ5 = (InterfaceC7353EnQ) objAaT5;
            Object obj5 = this.$overlayViewModel;
            boolean zA676 = bfm.A67(obj5);
            Object objAaT6 = bfm.AaT();
            if (zA676 || objAaT6 == C78N.A00) {
                objAaT6 = new HatchAssistInvocationContentKt$HatchAssistInvocationContent$1$6$1(obj5);
                bfm.Ai0(objAaT6);
            }
            InterfaceC7353EnQ interfaceC7353EnQ6 = (InterfaceC7353EnQ) objAaT6;
            Object obj6 = this.$overlayViewModel.conversationViewModel;
            boolean zA677 = bfm.A67(obj6);
            Object objAaT7 = bfm.AaT();
            if (zA677 || objAaT7 == C78N.A00) {
                objAaT7 = new HatchAssistInvocationContentKt$HatchAssistInvocationContent$1$7$1(obj6);
                bfm.Ai0(objAaT7);
            }
            InterfaceC7353EnQ interfaceC7353EnQ7 = (InterfaceC7353EnQ) objAaT7;
            HatchAssistOverlayViewModel hatchAssistOverlayViewModel2 = this.$overlayViewModel;
            C20Q<HatchConversationAnnouncement> c20q = hatchAssistOverlayViewModel2.conversationViewModel.announcement;
            C20Q<Unit> c20q2 = hatchAssistOverlayViewModel2.micFocusRequests;
            String str = this.$threadId;
            Function0<Unit> function02 = this.$onDismissRequest;
            Function0<Unit> function03 = this.$onCollapseVoice;
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$overlayViewModel, AnonymousClass001.A1R(bfm, this.$threadId, AnonymousClass003.A1M(bfm, companion, contextA0O)));
            String str2 = this.$threadId;
            HatchAssistOverlayViewModel hatchAssistOverlayViewModel3 = this.$overlayViewModel;
            Object objAaT8 = bfm.AaT();
            if (zA1T || objAaT8 == C78N.A00) {
                objAaT8 = new HatchAssistInvocationContentKt$HatchAssistInvocationContent$1$8$1(companion, contextA0O, str2, hatchAssistOverlayViewModel3);
                bfm.Ai0(objAaT8);
            }
            Function0 function04 = (Function0) objAaT8;
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$threadId, bfm.A67(this.$overlayViewModel));
            HatchAssistOverlayViewModel hatchAssistOverlayViewModel4 = this.$overlayViewModel;
            String str3 = this.$threadId;
            Object objAaT9 = bfm.AaT();
            if (zA1R || objAaT9 == C78N.A00) {
                objAaT9 = new HatchAssistInvocationContentKt$HatchAssistInvocationContent$1$9$1(hatchAssistOverlayViewModel4, str3);
                bfm.Ai0(objAaT9);
            }
            Function0 function05 = (Function0) objAaT9;
            G0U g0u = (G0U) interfaceC7353EnQ;
            G0W g0w = (G0W) interfaceC7353EnQ2;
            boolean zA1R2 = AnonymousClass001.A1R(bfm, this.$onRequestPermission, AnonymousClass001.A1T(bfm, this.$overlayViewModel, bfm.A67(contextA0O)));
            HatchAssistOverlayViewModel hatchAssistOverlayViewModel5 = this.$overlayViewModel;
            G0V<String, Function0<Unit>, Unit> g0v = this.$onRequestPermission;
            Object objAaT10 = bfm.AaT();
            if (zA1R2 || objAaT10 == C78N.A00) {
                objAaT10 = new HatchAssistInvocationContentKt$HatchAssistInvocationContent$1$10$1(contextA0O, hatchAssistOverlayViewModel5, g0v);
                bfm.Ai0(objAaT10);
            }
            Function0 function06 = (Function0) objAaT10;
            boolean zA678 = bfm.A67(this.$overlayViewModel);
            HatchAssistOverlayViewModel hatchAssistOverlayViewModel6 = this.$overlayViewModel;
            Object objAaT11 = bfm.AaT();
            if (zA678 || objAaT11 == C78N.A00) {
                objAaT11 = new HatchAssistInvocationContentKt$HatchAssistInvocationContent$1$11$1(hatchAssistOverlayViewModel6);
                bfm.Ai0(objAaT11);
            }
            G0U g0u2 = (G0U) objAaT11;
            boolean zA679 = bfm.A67(this.$overlayViewModel);
            HatchAssistOverlayViewModel hatchAssistOverlayViewModel7 = this.$overlayViewModel;
            Object objAaT12 = bfm.AaT();
            if (zA679 || objAaT12 == C78N.A00) {
                objAaT12 = new HatchAssistInvocationContentKt$HatchAssistInvocationContent$1$12$1(hatchAssistOverlayViewModel7);
                bfm.Ai0(objAaT12);
            }
            int i2 = iA0d << 12;
            HatchAssistOverlayScreenKt.HatchAssistOverlayScreen(assistOverlayState, hatchConversationUiState, ahdA0C, str, function02, function03, function04, c1890At8, function05, g0u, g0w, zIsAutoSubmitMicAvailable, c20q, c20q2, bRg, bitmap, waveformBuffer, zA0F, function06, g0u2, (G0U) objAaT12, (Function0) interfaceC7353EnQ3, (Function0) interfaceC7353EnQ4, (Function0) interfaceC7353EnQ5, (Function0) interfaceC7353EnQ6, function0, (Function0) interfaceC7353EnQ7, bfm, AssistOverlayState.$stable | (HatchConversationUiState.$stable << 3), (i2 & 57344) | (WaveformBuffer.$stable << 18), i2 & 458752, 0);
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(BRg bRg, Function0<? extends Unit> function0, BFM bfm, Integer num) {
            invoke(bRg, (Function0<Unit>) function0, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.assist.HatchAssistInvocationContentKt$HatchAssistInvocationContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C109572 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCollapseVoice;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ G0V<String, Function0<Unit>, Unit> $onRequestPermission;
        public final /* synthetic */ HatchAssistOverlayViewModel $overlayViewModel;
        public final /* synthetic */ String $threadId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C109572(HatchAssistOverlayViewModel hatchAssistOverlayViewModel, String str, Function0<Unit> function0, Function0<Unit> function02, G0V<? super String, ? super Function0<Unit>, Unit> g0v, BRg bRg, int i, int i2) {
            super(2);
            this.$overlayViewModel = hatchAssistOverlayViewModel;
            this.$threadId = str;
            this.$onDismissRequest = function0;
            this.$onCollapseVoice = function02;
            this.$onRequestPermission = g0v;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchAssistInvocationContentKt.HatchAssistInvocationContent(this.$overlayViewModel, this.$threadId, this.$onDismissRequest, this.$onCollapseVoice, this.$onRequestPermission, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchAssistInvocationContent(HatchAssistOverlayViewModel hatchAssistOverlayViewModel, String str, Function0<Unit> function0, Function0<Unit> function02, G0V<? super String, ? super Function0<Unit>, Unit> g0v, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass005.A11(hatchAssistOverlayViewModel, function0, function02, 0);
        C7384Etj.A0Y(g0v, 4);
        bfm.AgG(-829547466);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchAssistOverlayViewModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function02);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, g0v);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA05 |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA05 |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchConversationViewModel hatchConversationViewModel = hatchAssistOverlayViewModel.conversationViewModel;
            int i4 = HatchConversationViewModel.$stable;
            AssistUploadEffects(hatchConversationViewModel, bfm, i4);
            AssistOnScreenEffect(hatchAssistOverlayViewModel.conversationViewModel, bfm, i4);
            HatchAssistVoiceModeKt.HatchAssistVoiceMode(hatchAssistOverlayViewModel, str, bRg2, B1V.A00(bfm, new AnonymousClass1(hatchAssistOverlayViewModel, str, function0, function02, g0v), -1769534257), bfm, HatchAssistOverlayViewModel.$stable | 3072 | (iA05 & 14) | (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | ((iA05 >> 9) & 896), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C109572(hatchAssistOverlayViewModel, str, function0, function02, g0v, bRg2, i, i2);
        }
    }

    public static final void AssistOnScreenEffect(HatchConversationViewModel hatchConversationViewModel, BFM bfm, int i) {
        bfm.AgG(-1353484029);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchConversationViewModel, bfm, i) ? 1 : 0) | i : i;
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 3, 2), bfm, iA05)) {
            int i2 = iA05 & 14;
            if (i2 == 4 || ((iA05 & 8) != 0 && bfm.A67(hatchConversationViewModel))) {
                z = true;
            }
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = new HatchAssistInvocationContentKt$AssistOnScreenEffect$1$1(hatchConversationViewModel);
                bfm.Ai0(objAaT);
            }
            C7bA.A05(bfm, null, hatchConversationViewModel, (G0U) objAaT, HatchConversationViewModel.$stable | i2, 2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(hatchConversationViewModel, i);
        }
    }

    public static final void AssistUploadEffects(HatchConversationViewModel hatchConversationViewModel, BFM bfm, int i) {
        bfm.AgG(-672124262);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchConversationViewModel, bfm, i) ? 1 : 0) | i : i;
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 3, 2), bfm, iA05)) {
            Context contextA0H = AnonymousClass002.A0H(bfm);
            C0dx c0dxA0T = AnonymousClass002.A0T(bfm);
            if ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(hatchConversationViewModel))) {
                z = true;
            }
            boolean zA1V = AnonymousClass002.A1V(bfm, c0dxA0T, bfm.A67(contextA0H), z);
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new HatchAssistInvocationContentKt$AssistUploadEffects$1$1(hatchConversationViewModel, contextA0H, c0dxA0T, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A18(bfm, objAaT, hatchConversationViewModel);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C109562(hatchConversationViewModel, i);
        }
    }
}
