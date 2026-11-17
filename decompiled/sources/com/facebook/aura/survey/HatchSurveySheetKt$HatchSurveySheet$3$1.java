package com.facebook.aura.survey;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.survey.HatchSurveySheetKt$HatchSurveySheet$3$1", f = "HatchSurveySheet.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchSurveySheetKt$HatchSurveySheet$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HatchSurveyPage $page;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSurveySheetKt$HatchSurveySheet$3$1(HatchSurveyPage hatchSurveyPage, HtJ<? super HatchSurveySheetKt$HatchSurveySheet$3$1> htJ) {
        super(2, htJ);
        this.$page = hatchSurveyPage;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchSurveySheetKt$HatchSurveySheet$3$1(this.$page, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new HatchSurveySheetKt$HatchSurveySheet$3$1(this.$page, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        HatchSurveyLogger.INSTANCE.logImpression(this.$page);
        return Unit.INSTANCE;
    }
}
