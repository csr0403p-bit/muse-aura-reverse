package com.facebook.aura.confidentialvm.model;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C10571Hud;
import X.C22I;
import X.C3Em;
import X.C3UX;
import X.C3pd;
import X.C7384Etj;
import X.C79;
import X.C9290GCr;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.R;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository;
import com.facebook.aura.toast.api.ToastApi;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class ConfidentialVmTemporaryAccessViewModel extends AEs {
    public static final int $stable = 8;
    public final C3Em<Unit> _dismiss;
    public final C22I<Unit> dismiss;
    public boolean submitting;
    public final AbstractC3358CGz userSession;

    public final class Factory extends AuraViewModelFactory<ConfidentialVmTemporaryAccessViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public /* bridge */ /* synthetic */ AEs create() {
            return new ConfidentialVmTemporaryAccessViewModel(this.userSession);
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ConfidentialVmTemporaryAccessViewModel create() {
            return new ConfidentialVmTemporaryAccessViewModel(this.userSession);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmTemporaryAccessViewModel$onGiveAccessClick$1", f = "ConfidentialVmTemporaryAccessViewModel.kt", l = {34}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmTemporaryAccessViewModel$onGiveAccessClick$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmTemporaryAccessViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ConfidentialVmRepository companion;
            Object objM450enableOperatorSshIoAF18A;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                companion = ConfidentialVmRepository.Companion.getInstance(ConfidentialVmTemporaryAccessViewModel.this.userSession);
                this.L$0 = companion;
                this.label = 1;
                objM450enableOperatorSshIoAF18A = companion.m450enableOperatorSshIoAF18A(this);
                if (objM450enableOperatorSshIoAF18A == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                companion = (ConfidentialVmRepository) this.L$0;
                objM450enableOperatorSshIoAF18A = AnonymousClass001.A0q(obj);
            }
            boolean z = !(objM450enableOperatorSshIoAF18A instanceof C10571Hud);
            ConfidentialVmTemporaryAccessViewModel.this.submitting = false;
            if (z) {
                companion.showSupportInvestigating();
            }
            ToastApi toastApi = ToastApi.INSTANCE;
            int i2 = R.string._name_removed__res_0x7f120b19;
            if (z) {
                i2 = R.string._name_removed__res_0x7f1207a7;
            }
            toastApi.showToast(i2);
            C3Em<Unit> c3Em = ConfidentialVmTemporaryAccessViewModel.this._dismiss;
            Unit unit = Unit.INSTANCE;
            c3Em.AhV(unit);
            return unit;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ConfidentialVmTemporaryAccessViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public ConfidentialVmTemporaryAccessViewModel(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        C9290GCr c9290GCr = new C9290GCr(C79.A00, 0, 1);
        this._dismiss = c9290GCr;
        this.dismiss = new C3pd(c9290GCr);
    }

    public final C22I<Unit> getDismiss() {
        return this.dismiss;
    }

    public final void onGiveAccessClick() {
        if (this.submitting) {
            return;
        }
        this.submitting = true;
        AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
    }
}
