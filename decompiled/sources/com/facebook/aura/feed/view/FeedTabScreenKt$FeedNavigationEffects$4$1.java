package com.facebook.aura.feed.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C06G;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.feed.model.FeedViewModel;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.feed.view.FeedTabScreenKt$FeedNavigationEffects$4$1", f = "FeedTabScreen.kt", l = {562}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class FeedTabScreenKt$FeedNavigationEffects$4$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $openUnitErrorMessage;
    public final /* synthetic */ FeedViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedTabScreenKt$FeedNavigationEffects$4$1(FeedViewModel feedViewModel, String str, HtJ<? super FeedTabScreenKt$FeedNavigationEffects$4$1> htJ) {
        super(2, htJ);
        this.$viewModel = feedViewModel;
        this.$openUnitErrorMessage = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new FeedTabScreenKt$FeedNavigationEffects$4$1(this.$viewModel, this.$openUnitErrorMessage, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<Unit> c22i = this.$viewModel.openUnitErrorEvents;
            final String str = this.$openUnitErrorMessage;
            C20Z<? super Unit> c20z = new C20Z() { // from class: com.facebook.aura.feed.view.FeedTabScreenKt$FeedNavigationEffects$4$1.1
                public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                    C06G.A0i(AuraToast.Duration.SHORT, str);
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    C06G.A0i(AuraToast.Duration.SHORT, str);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (c22i.collect(c20z, this) == enumC10460Hji) {
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
        return ((FeedTabScreenKt$FeedNavigationEffects$4$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
