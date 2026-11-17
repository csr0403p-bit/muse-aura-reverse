package com.facebook.aura.rentalcars;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BLG;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.conversation.offline.HatchOfflineConversationRepository;
import com.facebook.aura.rentalcars.RentalCarLoadState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class RentalCarResultsViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<RentalCarLoadState<RentalCarResultsUiState>> state;
    public final C1BN<RentalCarLoadState<RentalCarResultsUiState>> uiState;

    @DebugMetadata(c = "com.facebook.aura.rentalcars.RentalCarResultsViewModel$1", f = "RentalCarViewModels.kt", l = {54}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.rentalcars.RentalCarResultsViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ RentalCarResultsScreenKey $key;
        public final /* synthetic */ HatchOfflineConversationRepository $repository;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchOfflineConversationRepository hatchOfflineConversationRepository, RentalCarResultsScreenKey rentalCarResultsScreenKey, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$repository = hatchOfflineConversationRepository;
            this.$key = rentalCarResultsScreenKey;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return RentalCarResultsViewModel.this.new AnonymousClass1(this.$repository, this.$key, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            BLG<RentalCarLoadState<RentalCarResultsUiState>> blg;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                blg = RentalCarResultsViewModel.this.state;
                HatchOfflineConversationRepository hatchOfflineConversationRepository = this.$repository;
                RentalCarResultsScreenKey rentalCarResultsScreenKey = this.$key;
                String str = rentalCarResultsScreenKey.sessionId;
                String str2 = rentalCarResultsScreenKey.hostMessageId;
                String str3 = rentalCarResultsScreenKey.presentationId;
                this.L$0 = blg;
                this.label = 1;
                obj = RentalCarRepositoryKt.findRentalCarResults(hatchOfflineConversationRepository, str, str2, str3, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                blg = (BLG) this.L$0;
                Hwg.A00(obj);
            }
            RentalCarResults rentalCarResults = (RentalCarResults) obj;
            blg.Af8(rentalCarResults != null ? new RentalCarLoadState.Loaded<>(new RentalCarResultsUiState(rentalCarResults, RentalCarResultsViewModel.this.header(rentalCarResults))) : RentalCarLoadState.Unavailable.INSTANCE);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Factory extends AuraViewModelFactory<RentalCarResultsViewModel> {
        public static final int $stable = 8;
        public final RentalCarResultsScreenKey key;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public RentalCarResultsViewModel create() {
            return new RentalCarResultsViewModel(this.key, HatchOfflineConversationRepository.Companion.getInstance(this.userSession));
        }

        public Factory(RentalCarResultsScreenKey rentalCarResultsScreenKey, AbstractC3358CGz abstractC3358CGz) {
            AnonymousClass003.A0u(rentalCarResultsScreenKey, abstractC3358CGz);
            this.key = rentalCarResultsScreenKey;
            this.userSession = abstractC3358CGz;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RentalCarResultsHeader header(RentalCarResults rentalCarResults) {
        RentalCarRate rentalCarRate = (RentalCarRate) AbstractC0878AGe.A0G(rentalCarResults.rates);
        if (rentalCarRate == null) {
            return null;
        }
        RentalCarStop rentalCarStop = rentalCarRate.pickup;
        return new RentalCarResultsHeader(rentalCarStop.location.name, rentalCarStop.date, rentalCarRate.dropoff.date);
    }

    public final C1BN<RentalCarLoadState<RentalCarResultsUiState>> getUiState() {
        return this.uiState;
    }

    public RentalCarResultsViewModel(RentalCarResultsScreenKey rentalCarResultsScreenKey, HatchOfflineConversationRepository hatchOfflineConversationRepository) {
        AnonymousClass003.A0u(rentalCarResultsScreenKey, hatchOfflineConversationRepository);
        C9286GCn c9286GCnA01 = HnJ.A01(RentalCarLoadState.Loading.INSTANCE);
        this.state = c9286GCnA01;
        this.uiState = C3cG.A11(c9286GCnA01);
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass1(hatchOfflineConversationRepository, rentalCarResultsScreenKey, null), AEu.A00(this));
    }
}
