package com.facebook.aura.activation.model;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BLG;
import X.C1BN;
import X.C20Z;
import X.C3Pi;
import X.C3UX;
import X.C7384Etj;
import X.C7Bq;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.activation.repo.InviteTooltipRepository;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.utils.HatchUtils;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes.dex */
public final class InviteTooltipViewModel extends AEs {
    public final BLG<Boolean> _visible;
    public HoC dismissJob;
    public final InviteTooltipRepository repository;
    public final C1BN<Boolean> visible;

    @DebugMetadata(c = "com.facebook.aura.activation.model.InviteTooltipViewModel$1", f = "InviteTooltipViewModel.kt", l = {25}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.model.InviteTooltipViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return InviteTooltipViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final InviteTooltipViewModel inviteTooltipViewModel = InviteTooltipViewModel.this;
                C1BN<Boolean> c1bn = inviteTooltipViewModel.repository.seen;
                C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.activation.model.InviteTooltipViewModel.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        if (z) {
                            inviteTooltipViewModel.onHidden();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c1bn.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return InviteTooltipViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Factory extends AuraViewModelFactory<InviteTooltipViewModel> {
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public InviteTooltipViewModel create() {
            return new InviteTooltipViewModel(InviteTooltipRepository.Companion.getInstance(this.userSession));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.model.InviteTooltipViewModel$onShown$1", f = "InviteTooltipViewModel.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.model.InviteTooltipViewModel$onShown$1, reason: invalid class name and case insensitive filesystem */
    public final class C106801 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ int $seconds;
        public int label;
        public final /* synthetic */ InviteTooltipViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106801(int i, InviteTooltipViewModel inviteTooltipViewModel, HtJ<? super C106801> htJ) {
            super(2, htJ);
            this.$seconds = i;
            this.this$0 = inviteTooltipViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C106801(this.$seconds, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                long j = this.$seconds * 1000;
                this.label = 1;
                if (C7Bq.A01(j, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            this.this$0.dismiss();
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C106801) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public InviteTooltipViewModel(InviteTooltipRepository inviteTooltipRepository) {
        C7384Etj.A0Y(inviteTooltipRepository, 0);
        this.repository = inviteTooltipRepository;
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(false);
        this._visible = c9286GCnA0v;
        this.visible = new C3Pi(null, c9286GCnA0v);
        AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
    }

    public final void dismiss() {
        if (AnonymousClass003.A1Z(this._visible)) {
            this.repository.markSeen();
            onHidden();
        }
    }

    public final C1BN<Boolean> getVisible() {
        return this.visible;
    }

    public final void onHidden() {
        HoC hoC = this.dismissJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.dismissJob = null;
        AnonymousClass003.A14(this._visible, false);
    }

    public final void onShown(boolean z) {
        int inviteButtonToolTipSecs;
        onHidden();
        if (!z || AnonymousClass001.A1X(this.repository.seen.getValue()) || (inviteButtonToolTipSecs = HatchUtils.INSTANCE.getInviteButtonToolTipSecs()) <= 0) {
            return;
        }
        C9286GCn.A00(null, AnonymousClass001.A0i(), (C9286GCn) this._visible);
        this.dismissJob = AnonymousClass001.A11(new C106801(inviteButtonToolTipSecs, this, null), AEu.A00(this));
    }
}
