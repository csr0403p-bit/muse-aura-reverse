package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.explore.repo.IdeaCardShareAttempt;
import com.facebook.aura.settings.MC;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$requestIdeaShare$1$result$1", f = "HatchShareSheetViewModel.kt", l = {MC.mwa_help_and_support.__CONFIG__}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchShareSheetViewModel$requestIdeaShare$1$result$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super IdeaCardShareAttempt>, Object> {
    public int label;
    public final /* synthetic */ HatchShareSheetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShareSheetViewModel$requestIdeaShare$1$result$1(HatchShareSheetViewModel hatchShareSheetViewModel, HtJ<? super HatchShareSheetViewModel$requestIdeaShare$1$result$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchShareSheetViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchShareSheetViewModel$requestIdeaShare$1$result$1(this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchShareSheetViewModel hatchShareSheetViewModel = this.this$0;
            this.label = 1;
            obj = hatchShareSheetViewModel.prepareIdeaShare(this);
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
    public final Object invoke(C3UX c3ux, HtJ<? super IdeaCardShareAttempt> htJ) {
        return new HatchShareSheetViewModel$requestIdeaShare$1$result$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
