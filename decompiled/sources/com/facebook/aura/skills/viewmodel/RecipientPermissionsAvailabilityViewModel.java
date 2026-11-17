package com.facebook.aura.skills.viewmodel;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BLG;
import X.C10571Hud;
import X.C1BN;
import X.C3Pi;
import X.C3UX;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.skills.repo.RecipientPermissionsRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class RecipientPermissionsAvailabilityViewModel extends AEs {
    public final BLG<Boolean> _isVisible;
    public final String connectorId;
    public final C1BN<Boolean> isVisible;
    public final SingleFlight singleFlight;
    public final AbstractC3358CGz userSession;

    public final class Factory extends AuraViewModelFactory<RecipientPermissionsAvailabilityViewModel> {
        public final String connectorId;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public RecipientPermissionsAvailabilityViewModel create() {
            return new RecipientPermissionsAvailabilityViewModel(this.userSession, this.connectorId);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str) {
            AnonymousClass003.A0u(abstractC3358CGz, str);
            this.userSession = abstractC3358CGz;
            this.connectorId = str;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.viewmodel.RecipientPermissionsAvailabilityViewModel$refresh$1", f = "RecipientPermissionsAvailabilityViewModel.kt", l = {26}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.viewmodel.RecipientPermissionsAvailabilityViewModel$refresh$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.skills.viewmodel.RecipientPermissionsAvailabilityViewModel$refresh$1$1", f = "RecipientPermissionsAvailabilityViewModel.kt", l = {29}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.skills.viewmodel.RecipientPermissionsAvailabilityViewModel$refresh$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03761 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public Object L$0;
            public int label;
            public final /* synthetic */ RecipientPermissionsAvailabilityViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03761(RecipientPermissionsAvailabilityViewModel recipientPermissionsAvailabilityViewModel, HtJ<? super C03761> htJ) {
                super(1, htJ);
                this.this$0 = recipientPermissionsAvailabilityViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C03761(this.this$0, htJ);
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return new C03761(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                BLG blg;
                Object objM2124hasPermissionsgIAlus;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    RecipientPermissionsAvailabilityViewModel recipientPermissionsAvailabilityViewModel = this.this$0;
                    blg = recipientPermissionsAvailabilityViewModel._isVisible;
                    RecipientPermissionsRepository recipientPermissionsRepository = new RecipientPermissionsRepository(recipientPermissionsAvailabilityViewModel.userSession);
                    String str = this.this$0.connectorId;
                    this.L$0 = blg;
                    this.label = 1;
                    objM2124hasPermissionsgIAlus = recipientPermissionsRepository.m2124hasPermissionsgIAlus(str, this);
                    if (objM2124hasPermissionsgIAlus == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    blg = (BLG) this.L$0;
                    objM2124hasPermissionsgIAlus = AnonymousClass001.A0q(obj);
                }
                if (objM2124hasPermissionsgIAlus instanceof C10571Hud) {
                    objM2124hasPermissionsgIAlus = true;
                }
                blg.Af8(objM2124hasPermissionsgIAlus);
                return Unit.INSTANCE;
            }
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return RecipientPermissionsAvailabilityViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                RecipientPermissionsAvailabilityViewModel recipientPermissionsAvailabilityViewModel = RecipientPermissionsAvailabilityViewModel.this;
                SingleFlight singleFlight = recipientPermissionsAvailabilityViewModel.singleFlight;
                C03761 c03761 = new C03761(recipientPermissionsAvailabilityViewModel, null);
                this.label = 1;
                if (singleFlight.invoke(Unit.INSTANCE, c03761, this) == enumC10460Hji) {
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
            return RecipientPermissionsAvailabilityViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final C1BN<Boolean> isVisible() {
        return this.isVisible;
    }

    public RecipientPermissionsAvailabilityViewModel(AbstractC3358CGz abstractC3358CGz, String str) {
        boolean zA1b = AnonymousClass004.A1b(abstractC3358CGz, str);
        this.userSession = abstractC3358CGz;
        this.connectorId = str;
        this.singleFlight = SingleFlightKt.SingleFlight(abstractC3358CGz, OnDuplicateCall.Join.INSTANCE, zA1b);
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(zA1b);
        this._isVisible = c9286GCnA0v;
        this.isVisible = C3Pi.A00(c9286GCnA0v);
    }

    public final void refresh() {
        AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
    }
}
