package com.facebook.aura.conversation.view;

import X.AbstractC04661Bq;
import X.AbstractC1011APs;
import X.AbstractC3358CGz;
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
import X.BOD;
import X.BQN;
import X.BRg;
import X.C0861A6i;
import X.C1003AOr;
import X.C1BO;
import X.C1Cd;
import X.C2CK;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import X.G0W;
import android.content.Context;
import androidx.compose.foundation.lazy.LazyListState;
import com.facebook.aura.audio.HatchAudioItem;
import com.facebook.aura.audio.HatchAudioPlaybackState;
import com.facebook.aura.audio.HatchAudioPlayerRepository;
import com.facebook.aura.audio.view.ChatAudioCallTakeoverKt;
import com.facebook.aura.audio.viewmodel.ChatAudioPlaybackViewModel;
import com.facebook.aura.conversation.viewmodel.HatchConversationListItem;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ConversationAudioPlaybackKt {

    /* renamed from: com.facebook.aura.conversation.view.ConversationAudioPlaybackKt$ConversationAudioMiniPlayerOverlay$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C1Cd, BFM, Integer, Unit> {
        public final /* synthetic */ ConversationAudioPlayback $audio;
        public final /* synthetic */ HatchAudioPlayerRepository $audioRepository;
        public final /* synthetic */ HatchAudioPlaybackState $audioState;
        public final /* synthetic */ G0V<String, String, Unit> $onJumpToAudioSource;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(HatchAudioPlaybackState hatchAudioPlaybackState, ConversationAudioPlayback conversationAudioPlayback, HatchAudioPlayerRepository hatchAudioPlayerRepository, G0V<? super String, ? super String, Unit> g0v) {
            super(3);
            this.$audioState = hatchAudioPlaybackState;
            this.$audio = conversationAudioPlayback;
            this.$audioRepository = hatchAudioPlayerRepository;
            this.$onJumpToAudioSource = g0v;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C1Cd c1Cd, BFM bfm, Integer num) {
            invoke(c1Cd, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00ea  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.C1Cd r15, X.BFM r16, int r17) {
            /*
                Method dump skipped, instructions count: 284
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.ConversationAudioPlaybackKt.AnonymousClass1.invoke(X.1Cd, X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.ConversationAudioPlaybackKt$ConversationAudioMiniPlayerOverlay$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConversationAudioPlayback $audio;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0V<String, String, Unit> $onJumpToAudioSource;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(ConversationAudioPlayback conversationAudioPlayback, G0V<? super String, ? super String, Unit> g0v, BRg bRg, int i, int i2) {
            super(2);
            this.$audio = conversationAudioPlayback;
            this.$onJumpToAudioSource = g0v;
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
            ConversationAudioPlaybackKt.ConversationAudioMiniPlayerOverlay(this.$audio, this.$onJumpToAudioSource, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ConversationAudioMiniPlayerOverlay(ConversationAudioPlayback conversationAudioPlayback, G0V<? super String, ? super String, Unit> g0v, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(conversationAudioPlayback, 0);
        bfm.AgG(-172793172);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, conversationAudioPlayback) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0v);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC04661Bq.A08(AbstractC1011APs.A03(0.0f, 3), AbstractC1011APs.A0E(C1003AOr.A00(null)), bfm, bRg2, null, B1V.A00(bfm, new AnonymousClass1(conversationAudioPlayback.getState(), conversationAudioPlayback, conversationAudioPlayback.repository, g0v), 2000173268), ((iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 200064, 16, conversationAudioPlayback.getShowMiniPlayer());
            ChatAudioCallTakeoverKt.ChatAudioCallTakeoverDialog(conversationAudioPlayback.viewModel, null, bfm, 0, 2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(conversationAudioPlayback, g0v, bRg2, i, i2);
        }
    }

    public static final ConversationAudioPlayback rememberConversationAudioPlayback(LazyListState lazyListState, Function0<? extends List<? extends HatchConversationListItem>> function0, BFM bfm, int i) {
        HatchAudioItem hatchAudioItem;
        AnonymousClass003.A0u(lazyListState, function0);
        AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
        Context contextA0H = AnonymousClass002.A0H(bfm);
        boolean zA1K = AnonymousClass003.A1K(bfm, abstractC3358CGzA0h, contextA0H);
        Object objAaT = bfm.AaT();
        if (zA1K || objAaT == C78N.A00) {
            objAaT = HatchAudioPlayerRepository.Companion.getInstance(abstractC3358CGzA0h, contextA0H);
            bfm.Ai0(objAaT);
        }
        HatchAudioPlayerRepository hatchAudioPlayerRepository = (HatchAudioPlayerRepository) objAaT;
        ChatAudioPlaybackViewModel.Factory factory = new ChatAudioPlaybackViewModel.Factory(hatchAudioPlayerRepository);
        BOD bodA00 = C5wL.A00(bfm);
        if (bodA00 == null) {
            throw AnonymousClass001.A0o();
        }
        ChatAudioPlaybackViewModel chatAudioPlaybackViewModel = (ChatAudioPlaybackViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), "chat_audio_mini_player", new C0861A6i(ChatAudioPlaybackViewModel.class));
        C1BO c1boA02 = C2CK.A02(bfm, hatchAudioPlayerRepository.playbackState);
        C1BO c1boA022 = C2CK.A02(bfm, hatchAudioPlayerRepository.dismissedMiniPlayerSourceId);
        HatchAudioPlaybackState hatchAudioPlaybackState = (HatchAudioPlaybackState) c1boA02.getValue();
        String str = (hatchAudioPlaybackState == null || (hatchAudioItem = hatchAudioPlaybackState.item) == null) ? null : hatchAudioItem.sourceMessageId;
        boolean zA65 = bfm.A65(str);
        Object objAaT2 = bfm.AaT();
        if (zA65 || objAaT2 == C78N.A00) {
            objAaT2 = AnonymousClass002.A0K(bfm, null, new ConversationAudioPlaybackKt$rememberConversationAudioPlayback$isAudioSourceVisible$1$1(str, lazyListState, function0));
        }
        C1BO c1bo = (C1BO) objAaT2;
        boolean zA1R = AnonymousClass005.A1R(bfm, hatchAudioPlayerRepository, chatAudioPlaybackViewModel, c1bo);
        Object objAaT3 = bfm.AaT();
        if (zA1R || objAaT3 == C78N.A00) {
            objAaT3 = new ConversationAudioPlayback(hatchAudioPlayerRepository, chatAudioPlaybackViewModel, c1boA02, c1boA022, c1bo);
            bfm.Ai0(objAaT3);
        }
        return (ConversationAudioPlayback) objAaT3;
    }
}
