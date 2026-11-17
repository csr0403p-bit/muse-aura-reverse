package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.explore.repo.IdeaCard;
import com.facebook.aura.explore.repo.IdeaCardShareAttempt;
import com.facebook.aura.explore.repo.IdeaCardsDataSource;
import com.facebook.aura.file.actions.HatchShare;
import com.facebook.aura.toast.api.ToastApi;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchIdeaShareLauncherKt$rememberHatchIdeaShareAction$onClick$1$1$1$1$1$1$completed$1", f = "HatchIdeaShareLauncher.kt", l = {71}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchIdeaShareLauncherKt$rememberHatchIdeaShareAction$onClick$1$1$1$1$1$1$completed$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Object>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ IdeaCardsDataSource $dataSource;
    public final /* synthetic */ IdeaCard $idea;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchIdeaShareLauncherKt$rememberHatchIdeaShareAction$onClick$1$1$1$1$1$1$completed$1(IdeaCardsDataSource ideaCardsDataSource, IdeaCard ideaCard, Context context, HtJ<? super HatchIdeaShareLauncherKt$rememberHatchIdeaShareAction$onClick$1$1$1$1$1$1$completed$1> htJ) {
        super(2, htJ);
        this.$dataSource = ideaCardsDataSource;
        this.$idea = ideaCard;
        this.$context = context;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchIdeaShareLauncherKt$rememberHatchIdeaShareAction$onClick$1$1$1$1$1$1$completed$1(this.$dataSource, this.$idea, this.$context, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Object> htJ) {
        return invoke2(c3ux, (HtJ<Object>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        ToastApi toastApi;
        int i;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i2 = this.label;
        if (i2 == 0) {
            Hwg.A00(obj);
            IdeaCardsDataSource ideaCardsDataSource = this.$dataSource;
            String str = this.$idea.ideaCardId;
            this.label = 1;
            obj = ideaCardsDataSource.shareCard(str, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i2 != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        IdeaCardShareAttempt ideaCardShareAttempt = (IdeaCardShareAttempt) obj;
        if (ideaCardShareAttempt instanceof IdeaCardShareAttempt.Shared) {
            HatchShare hatchShare = HatchShare.INSTANCE;
            Context context = this.$context;
            return Boolean.valueOf(hatchShare.shareText(context, HatchIdeaShareTextKt.ideaShareText(context, ((IdeaCardShareAttempt.Shared) ideaCardShareAttempt).result.shareUrl), null, null));
        }
        if (C7384Etj.areEqual(ideaCardShareAttempt, IdeaCardShareAttempt.Unavailable.INSTANCE)) {
            toastApi = ToastApi.INSTANCE;
            i = R.string._name_removed__res_0x7f1205d5;
        } else {
            if (!(ideaCardShareAttempt instanceof IdeaCardShareAttempt.Failed)) {
                throw new NoWhenBranchMatchedException();
            }
            toastApi = ToastApi.INSTANCE;
            i = R.string._name_removed__res_0x7f120b19;
        }
        toastApi.showToast(i);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<Object> htJ) {
        return ((HatchIdeaShareLauncherKt$rememberHatchIdeaShareAction$onClick$1$1$1$1$1$1$completed$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
