package com.facebook.aura.confidentialvm.model;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C10571Hud;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class ConfidentialVmSupportAccessViewModel extends AEs {
    public static final int $stable = 8;
    public final ConfidentialVmRepository repository;

    public final class Factory extends AuraViewModelFactory<ConfidentialVmSupportAccessViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public /* bridge */ /* synthetic */ AEs create() {
            return new ConfidentialVmSupportAccessViewModel(this.userSession);
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ConfidentialVmSupportAccessViewModel create() {
            return new ConfidentialVmSupportAccessViewModel(this.userSession);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmSupportAccessViewModel$onRevokeAccessClick$1", f = "ConfidentialVmSupportAccessViewModel.kt", l = {20}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmSupportAccessViewModel$onRevokeAccessClick$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmSupportAccessViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM449disableOperatorSshIoAF18A;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ConfidentialVmRepository confidentialVmRepository = ConfidentialVmSupportAccessViewModel.this.repository;
                this.label = 1;
                objM449disableOperatorSshIoAF18A = confidentialVmRepository.m449disableOperatorSshIoAF18A(this);
                if (objM449disableOperatorSshIoAF18A == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM449disableOperatorSshIoAF18A = AnonymousClass001.A0q(obj);
            }
            if (!(objM449disableOperatorSshIoAF18A instanceof C10571Hud)) {
                ConfidentialVmSupportAccessViewModel.this.repository.dismissSupportInvestigating();
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ConfidentialVmSupportAccessViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public ConfidentialVmSupportAccessViewModel(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.repository = ConfidentialVmRepository.Companion.getInstance(abstractC3358CGz);
    }

    public final void onRevokeAccessClick() {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass1(null), AEu.A00(this));
    }
}
