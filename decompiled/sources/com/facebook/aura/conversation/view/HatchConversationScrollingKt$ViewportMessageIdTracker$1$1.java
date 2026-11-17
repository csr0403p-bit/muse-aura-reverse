package com.facebook.aura.conversation.view;

import X.A6B;
import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BHL;
import X.C1160Acs;
import X.C16C;
import X.C1BO;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C6v3;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GDB;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.lazy.LazyListState;
import com.facebook.aura.conversation.viewmodel.HatchConversationListItem;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationScrollingKt$ViewportMessageIdTracker$1$1", f = "HatchConversationScrolling.kt", l = {590}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationScrollingKt$ViewportMessageIdTracker$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<AHD<HatchConversationListItem>> $currentItems$delegate;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public int label;

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScrollingKt$ViewportMessageIdTracker$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<String> {
        public final /* synthetic */ C1BO<AHD<HatchConversationListItem>> $currentItems$delegate;
        public final /* synthetic */ LazyListState $listState;

        /* renamed from: com.facebook.aura.conversation.view.HatchConversationScrollingKt$ViewportMessageIdTracker$1$1$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01061 extends AbstractC7559F3s implements G0U<C16C, String> {
            public final /* synthetic */ C1BO<AHD<HatchConversationListItem>> $currentItems$delegate;

            @Override // X.G0U
            public final String invoke(C16C c16c) {
                HatchConversationListItem.Message message;
                HatchMessageUiModel hatchMessageUiModel;
                C7384Etj.A0Y(c16c, 0);
                Object objA0A = AbstractC0878AGe.A0A(((C1160Acs) c16c).A07, this.$currentItems$delegate.getValue());
                if (!(objA0A instanceof HatchConversationListItem.Message) || (message = (HatchConversationListItem.Message) objA0A) == null || (hatchMessageUiModel = message.message) == null) {
                    return null;
                }
                String str = hatchMessageUiModel.executionTurnId;
                return str == null ? hatchMessageUiModel.messageId : str;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C01061(C1BO<? extends AHD<? extends HatchConversationListItem>> c1bo) {
                super(1);
                this.$currentItems$delegate = c1bo;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(LazyListState lazyListState, C1BO<? extends AHD<? extends HatchConversationListItem>> c1bo) {
            super(0);
            this.$listState = lazyListState;
            this.$currentItems$delegate = c1bo;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return (String) A6B.A00(A6B.A04(new C01061(this.$currentItems$delegate), AbstractC0878AGe.A06(BHL.A1B(AnonymousClass003.A0j(this.$listState)))));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationScrollingKt$ViewportMessageIdTracker$1$1(LazyListState lazyListState, C1BO<? extends AHD<? extends HatchConversationListItem>> c1bo, AbstractC3358CGz abstractC3358CGz, HtJ<? super HatchConversationScrollingKt$ViewportMessageIdTracker$1$1> htJ) {
        super(2, htJ);
        this.$listState = lazyListState;
        this.$currentItems$delegate = c1bo;
        this.$userSession = abstractC3358CGz;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationScrollingKt$ViewportMessageIdTracker$1$1(this.$listState, this.$currentItems$delegate, this.$userSession, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C20Q c20qA01 = GDB.A01(C6v3.A01(new AnonymousClass1(this.$listState, this.$currentItems$delegate)));
            final AbstractC3358CGz abstractC3358CGz = this.$userSession;
            C20Z c20z = new C20Z() { // from class: com.facebook.aura.conversation.view.HatchConversationScrollingKt$ViewportMessageIdTracker$1$1.2
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((String) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(String str, HtJ<? super Unit> htJ) {
                    HatchGatewayPrefsStore.Companion.getInstance(abstractC3358CGz).viewportMessageId = str;
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (c20qA01.collect(c20z, this) == enumC10460Hji) {
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
        return ((HatchConversationScrollingKt$ViewportMessageIdTracker$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
