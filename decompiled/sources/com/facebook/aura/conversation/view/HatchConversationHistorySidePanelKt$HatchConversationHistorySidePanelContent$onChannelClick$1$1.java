package com.facebook.aura.conversation.view;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C3UX;
import X.C7384Etj;
import X.C7BY;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.G2k;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.conversation.repo.HatchThreadsRepository;
import com.facebook.aura.gateway.HatchSessionItem;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$onChannelClick$1$1 extends AbstractC7559F3s implements G0U<HatchSessionItem, Unit> {
    public final /* synthetic */ Function0<Unit> $onDismissRequest;
    public final /* synthetic */ G2k<String, String, Boolean, String, Long, Unit> $onThreadSelected;
    public final /* synthetic */ C3UX $swipeScope;
    public final /* synthetic */ HatchThreadsRepository $threadsRepo;

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$onChannelClick$1$1$1", f = "HatchConversationHistorySidePanel.kt", l = {401}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$onChannelClick$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchSessionItem $session;
        public final /* synthetic */ HatchThreadsRepository $threadsRepo;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchThreadsRepository hatchThreadsRepository, HatchSessionItem hatchSessionItem, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$threadsRepo = hatchThreadsRepository;
            this.$session = hatchSessionItem;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$threadsRepo, this.$session, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchThreadsRepository hatchThreadsRepository = this.$threadsRepo;
                String str = this.$session.sessionId;
                this.label = 1;
                if (hatchThreadsRepository.markThreadAsSeen(str, this) == enumC10460Hji) {
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
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSessionItem hatchSessionItem) {
        C7384Etj.A0Y(hatchSessionItem, 0);
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, null, HatchScreen.CONVERSATION_HISTORY, HatchComponent.CHANNELS_BUTTON, null, AGH.A0D(new HxE(HatchMetadataKey.THREAD_ID.getValue(), hatchSessionItem.sessionId), new HxE(HatchMetadataKey.IS_PRIMARY_THREAD.getValue(), "false"), AnonymousClass006.A12(HatchMetadataKey.IS_ARCHIVED, "false")), null);
        AnonymousClass001.A1J(new AnonymousClass1(this.$threadsRepo, hatchSessionItem, null), this.$swipeScope);
        this.$onDismissRequest.invoke();
        G2k<String, String, Boolean, String, Long, Unit> g2k = this.$onThreadSelected;
        String str = hatchSessionItem.sessionId;
        String str2 = hatchSessionItem.title;
        if (str2 == null || C7BY.A0j(str2)) {
            str2 = null;
        }
        g2k.invoke(str, str2, false, null, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$onChannelClick$1$1(C3UX c3ux, Function0<Unit> function0, G2k<? super String, ? super String, ? super Boolean, ? super String, ? super Long, Unit> g2k, HatchThreadsRepository hatchThreadsRepository) {
        super(1);
        this.$swipeScope = c3ux;
        this.$onDismissRequest = function0;
        this.$onThreadSelected = g2k;
        this.$threadsRepo = hatchThreadsRepository;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSessionItem hatchSessionItem) {
        invoke2(hatchSessionItem);
        return Unit.INSTANCE;
    }
}
