package com.facebook.aura.rentalcars;

import X.AEs;
import X.AEu;
import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC10623Hzj;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BLG;
import X.C1BN;
import X.C20Q;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.GCV;
import X.HnJ;
import X.HtJ;
import X.Hu1;
import X.Hwg;
import X.HzR;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.conversation.offline.HatchOfflineConversationRepository;
import com.facebook.aura.rentalcars.RentalCarLoadState;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class RentalCarDetailsViewModel extends AEs {
    public static final int $stable = 8;
    public final HzR<RentalCarRate> bookingRequests;
    public boolean bookingSent;
    public final C20Q<RentalCarRate> bookings;
    public final BLG<RentalCarLoadState<RentalCarRate>> state;
    public final C1BN<RentalCarLoadState<RentalCarRate>> uiState;

    @DebugMetadata(c = "com.facebook.aura.rentalcars.RentalCarDetailsViewModel$1", f = "RentalCarViewModels.kt", l = {87}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.rentalcars.RentalCarDetailsViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ RentalCarDetailsScreenKey $key;
        public final /* synthetic */ HatchOfflineConversationRepository $repository;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchOfflineConversationRepository hatchOfflineConversationRepository, RentalCarDetailsScreenKey rentalCarDetailsScreenKey, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$repository = hatchOfflineConversationRepository;
            this.$key = rentalCarDetailsScreenKey;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return RentalCarDetailsViewModel.this.new AnonymousClass1(this.$repository, this.$key, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v2, types: [com.facebook.aura.rentalcars.RentalCarRate] */
        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            BLG<RentalCarLoadState<RentalCarRate>> blg;
            RentalCarLoadState<RentalCarRate> loaded;
            AHD<RentalCarRate> ahd;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                blg = RentalCarDetailsViewModel.this.state;
                HatchOfflineConversationRepository hatchOfflineConversationRepository = this.$repository;
                RentalCarDetailsScreenKey rentalCarDetailsScreenKey = this.$key;
                String str = rentalCarDetailsScreenKey.sessionId;
                String str2 = rentalCarDetailsScreenKey.hostMessageId;
                String str3 = rentalCarDetailsScreenKey.presentationId;
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
            if (rentalCarResults == null || (ahd = rentalCarResults.rates) == null) {
                loaded = RentalCarLoadState.Unavailable.INSTANCE;
            } else {
                RentalCarDetailsScreenKey rentalCarDetailsScreenKey2 = this.$key;
                Object next = (RentalCarRate) AbstractC0878AGe.A0A(rentalCarDetailsScreenKey2.rateIndex, ahd);
                if (next == 0 || !C7384Etj.areEqual(next.rateId, rentalCarDetailsScreenKey2.rateId)) {
                    Iterator it = ahd.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        next = it.next();
                        if (C7384Etj.areEqual(((RentalCarRate) next).rateId, rentalCarDetailsScreenKey2.rateId)) {
                            if (next != 0) {
                            }
                        }
                    }
                    loaded = RentalCarLoadState.Unavailable.INSTANCE;
                }
                loaded = new RentalCarLoadState.Loaded<>(next);
            }
            blg.Af8(loaded);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Factory extends AuraViewModelFactory<RentalCarDetailsViewModel> {
        public static final int $stable = 8;
        public final RentalCarDetailsScreenKey key;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public RentalCarDetailsViewModel create() {
            return new RentalCarDetailsViewModel(this.key, HatchOfflineConversationRepository.Companion.getInstance(this.userSession));
        }

        public Factory(RentalCarDetailsScreenKey rentalCarDetailsScreenKey, AbstractC3358CGz abstractC3358CGz) {
            AnonymousClass003.A0u(rentalCarDetailsScreenKey, abstractC3358CGz);
            this.key = rentalCarDetailsScreenKey;
            this.userSession = abstractC3358CGz;
        }
    }

    public final void onBookingFailed() {
        this.bookingSent = false;
    }

    public final void book() {
        RentalCarLoadState.Loaded loaded;
        T t;
        RentalCarLoadState<RentalCarRate> value = this.state.getValue();
        if (!(value instanceof RentalCarLoadState.Loaded) || (loaded = (RentalCarLoadState.Loaded) value) == null || (t = loaded.value) == 0 || this.bookingSent) {
            return;
        }
        this.bookingSent = true;
        this.bookingRequests.AhZ(t);
    }

    public final C20Q<RentalCarRate> getBookings() {
        return this.bookings;
    }

    public final C1BN<RentalCarLoadState<RentalCarRate>> getUiState() {
        return this.uiState;
    }

    public RentalCarDetailsViewModel(RentalCarDetailsScreenKey rentalCarDetailsScreenKey, HatchOfflineConversationRepository hatchOfflineConversationRepository) {
        AnonymousClass003.A0u(rentalCarDetailsScreenKey, hatchOfflineConversationRepository);
        C9286GCn c9286GCnA01 = HnJ.A01(RentalCarLoadState.Loading.INSTANCE);
        this.state = c9286GCnA01;
        this.uiState = C3cG.A11(c9286GCnA01);
        Integer num = C79.A00;
        GCV gcvA00 = AbstractC10623Hzj.A00(num, -1);
        this.bookingRequests = gcvA00;
        this.bookings = Hu1.A01(gcvA00);
        GAo.A02(num, AnonymousClass001.A0y(), new AnonymousClass1(hatchOfflineConversationRepository, rentalCarDetailsScreenKey, null), AEu.A00(this));
    }
}
