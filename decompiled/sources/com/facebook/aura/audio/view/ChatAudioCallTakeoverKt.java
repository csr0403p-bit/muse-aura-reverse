package com.facebook.aura.audio.view;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.B1V;
import X.BA2;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C1BO;
import X.C2CK;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import X.InterfaceC7353EnQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.audio.viewmodel.ChatAudioPlaybackUiState;
import com.facebook.aura.audio.viewmodel.ChatAudioPlaybackViewModel;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ChatAudioCallTakeoverKt {

    /* renamed from: com.facebook.aura.audio.view.ChatAudioCallTakeoverKt$ChatAudioCallTakeoverDialog$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ChatAudioPlaybackViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ChatAudioPlaybackViewModel chatAudioPlaybackViewModel, BRg bRg, int i, int i2) {
            super(2);
            this.$viewModel = chatAudioPlaybackViewModel;
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
            ChatAudioCallTakeoverKt.ChatAudioCallTakeoverDialog(this.$viewModel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.audio.view.ChatAudioCallTakeoverKt$ChatAudioCallTakeoverDialog$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $cancelText;
        public final /* synthetic */ String $confirmText;
        public final /* synthetic */ ChatAudioPlaybackViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, ChatAudioPlaybackViewModel chatAudioPlaybackViewModel, String str2) {
            super(2);
            this.$confirmText = str;
            this.$viewModel = chatAudioPlaybackViewModel;
            this.$cancelText = str2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$cancelText, AnonymousClass001.A1T(bfm, this.$viewModel, bfm.A65(this.$confirmText)));
                String str = this.$confirmText;
                String str2 = this.$cancelText;
                ChatAudioPlaybackViewModel chatAudioPlaybackViewModel = this.$viewModel;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new ChatAudioCallTakeoverKt$ChatAudioCallTakeoverDialog$4$1$1(str, str2, chatAudioPlaybackViewModel);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.audio.view.ChatAudioCallTakeoverKt$ChatAudioCallTakeoverDialog$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ChatAudioPlaybackViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(ChatAudioPlaybackViewModel chatAudioPlaybackViewModel, BRg bRg, int i, int i2) {
            super(2);
            this.$viewModel = chatAudioPlaybackViewModel;
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
            ChatAudioCallTakeoverKt.ChatAudioCallTakeoverDialog(this.$viewModel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ChatAudioCallTakeoverDialog(ChatAudioPlaybackViewModel chatAudioPlaybackViewModel, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass5;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(chatAudioPlaybackViewModel, 0);
        bfm.AgG(-1385123085);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, chatAudioPlaybackViewModel) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1BO c1boA02 = C2CK.A02(bfm, chatAudioPlaybackViewModel.uiState);
            boolean zA67 = bfm.A67(chatAudioPlaybackViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new ChatAudioCallTakeoverKt$ChatAudioCallTakeoverDialog$1$1(chatAudioPlaybackViewModel);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, chatAudioPlaybackViewModel);
            if (!((ChatAudioPlaybackUiState) c1boA02.getValue()).isConfirmingEndCall) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass5 = new AnonymousClass2(chatAudioPlaybackViewModel, bRg2, i, i2);
                    bBbAAc.A06 = anonymousClass5;
                }
                return;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201bc);
            String strA0r = AnonymousClass001.A0r(bfm);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201bd);
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201bb);
            boolean zA672 = bfm.A67(chatAudioPlaybackViewModel);
            Object objAaT2 = bfm.AaT();
            if (zA672 || objAaT2 == C78N.A00) {
                objAaT2 = new ChatAudioCallTakeoverKt$ChatAudioCallTakeoverDialog$3$1(chatAudioPlaybackViewModel);
                bfm.Ai0(objAaT2);
            }
            AuraAlertDialogKt.AuraAlertDialog(bRg2, strA012, strA013, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) B1V.A00(bfm, new AnonymousClass4(strA01, chatAudioPlaybackViewModel, strA0r), -694666172), (Function0<Unit>) ((InterfaceC7353EnQ) objAaT2), (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, ((iA0T >> 3) & 14) | 196608, 0, 1944);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass5 = new AnonymousClass5(chatAudioPlaybackViewModel, bRg2, i, i2);
            bBbAAc.A06 = anonymousClass5;
        }
    }

    public static final void logTakeoverClick(HatchComponent hatchComponent) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchScreen.MAIN_CHAT, hatchComponent, null, null, null);
    }
}
