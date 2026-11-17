package com.facebook.aura.feedback.view;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.feedback.FeedbackResult;
import com.facebook.aura.feedback.FeedbackTarget;
import com.facebook.aura.feedback.FeedbackVerdict;
import com.facebook.aura.feedback.repo.HatchFeedbackRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class HatchFeedbackViewModel extends AEs {
    public static final int $stable = 8;
    public final HatchFeedbackRepository repository;

    public final class Factory extends AuraViewModelFactory<HatchFeedbackViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HatchFeedbackViewModel create() {
            return new HatchFeedbackViewModel(HatchFeedbackRepository.Companion.getInstance(this.userSession));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.feedback.view.HatchFeedbackViewModel$submit$1", f = "HatchFeedbackViewModel.kt", l = {26}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.feedback.view.HatchFeedbackViewModel$submit$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $reason;
        public final /* synthetic */ FeedbackTarget $target;
        public final /* synthetic */ FeedbackVerdict $verdict;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FeedbackTarget feedbackTarget, FeedbackVerdict feedbackVerdict, String str, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$target = feedbackTarget;
            this.$verdict = feedbackVerdict;
            this.$reason = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchFeedbackViewModel.this.new AnonymousClass1(this.$target, this.$verdict, this.$reason, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchFeedbackRepository hatchFeedbackRepository = HatchFeedbackViewModel.this.repository;
                FeedbackTarget feedbackTarget = this.$target;
                FeedbackVerdict feedbackVerdict = this.$verdict;
                String str = this.$reason;
                this.label = 1;
                obj = hatchFeedbackRepository.submit(feedbackTarget, feedbackVerdict, str, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            FeedbackToastsKt.showFeedbackResultToast((FeedbackResult) obj, this.$verdict, null);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public HatchFeedbackViewModel(HatchFeedbackRepository hatchFeedbackRepository) {
        C7384Etj.A0Y(hatchFeedbackRepository, 0);
        this.repository = hatchFeedbackRepository;
    }

    public final void submit(FeedbackTarget feedbackTarget, FeedbackVerdict feedbackVerdict, String str) {
        AnonymousClass003.A0u(feedbackTarget, feedbackVerdict);
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass1(feedbackTarget, feedbackVerdict, str, null), AEu.A00(this));
    }
}
