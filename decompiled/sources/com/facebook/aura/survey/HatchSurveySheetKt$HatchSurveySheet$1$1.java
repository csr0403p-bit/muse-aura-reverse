package com.facebook.aura.survey;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.survey.HatchSurveySheetKt$HatchSurveySheet$1$1", f = "HatchSurveySheet.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchSurveySheetKt$HatchSurveySheet$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<HatchSurveyPage> $currentPage$delegate;
    public final /* synthetic */ AuraNavigator $navigator;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSurveySheetKt$HatchSurveySheet$1$1(AuraNavigator auraNavigator, MutableState<HatchSurveyPage> mutableState, HtJ<? super HatchSurveySheetKt$HatchSurveySheet$1$1> htJ) {
        super(2, htJ);
        this.$navigator = auraNavigator;
        this.$currentPage$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchSurveySheetKt$HatchSurveySheet$1$1(this.$navigator, this.$currentPage$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (this.$currentPage$delegate.getValue() == null) {
            this.$navigator.back();
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchSurveySheetKt$HatchSurveySheet$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
