package com.facebook.aura.conversation.viewmodel;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.conversation.offline.HatchOfflineConversationRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$seedFromOfflineCache$1$pushFetchStartedAt$1", f = "HatchConversationViewModel.kt", l = {771}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationViewModel$seedFromOfflineCache$1$pushFetchStartedAt$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Long>, Object> {
    public int label;
    public final /* synthetic */ HatchConversationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationViewModel$seedFromOfflineCache$1$pushFetchStartedAt$1(HatchConversationViewModel hatchConversationViewModel, HtJ<? super HatchConversationViewModel$seedFromOfflineCache$1$pushFetchStartedAt$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchConversationViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationViewModel$seedFromOfflineCache$1$pushFetchStartedAt$1(this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchOfflineConversationRepository hatchOfflineConversationRepository = this.this$0.offlineRepo;
            this.label = 1;
            obj = hatchOfflineConversationRepository.loadPrimaryPushFetchStartedAt(this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Long> htJ) {
        return new HatchConversationViewModel$seedFromOfflineCache$1$pushFetchStartedAt$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
