package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C05663ul;
import X.C1Pn;
import X.C1Vj;
import X.C20Z;
import X.C3UX;
import X.C6v3;
import X.EnumC10460Hji;
import X.F1F;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchMessageShareReviewKt$HatchShareCancellationEffects$3$1", f = "HatchMessageShareReview.kt", l = {100}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchMessageShareReviewKt$HatchShareCancellationEffects$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1Pn $sheetState;
    public final /* synthetic */ HatchShareSheetViewModel $viewModel;
    public Object L$0;
    public int label;

    /* renamed from: com.facebook.aura.sharesheet.HatchMessageShareReviewKt$HatchShareCancellationEffects$3$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C1Vj> {
        public final /* synthetic */ C1Pn $sheetState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C1Pn c1Pn) {
            super(0);
            this.$sheetState = c1Pn;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final C1Vj invoke() {
            return (C1Vj) this.$sheetState.A00.A0A.getValue();
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [X.1Vj, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ C1Vj invoke() {
            return this.$sheetState.A00.A0A.getValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageShareReviewKt$HatchShareCancellationEffects$3$1(C1Pn c1Pn, HatchShareSheetViewModel hatchShareSheetViewModel, HtJ<? super HatchMessageShareReviewKt$HatchShareCancellationEffects$3$1> htJ) {
        super(2, htJ);
        this.$sheetState = c1Pn;
        this.$viewModel = hatchShareSheetViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchMessageShareReviewKt$HatchShareCancellationEffects$3$1(this.$sheetState, this.$viewModel, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C1Pn c1Pn = this.$sheetState;
            if (c1Pn != null) {
                final F1F f1f = new F1F();
                f1f.element = c1Pn.A02();
                C05663ul c05663ulA01 = C6v3.A01(new AnonymousClass1(this.$sheetState));
                final HatchShareSheetViewModel hatchShareSheetViewModel = this.$viewModel;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.sharesheet.HatchMessageShareReviewKt$HatchShareCancellationEffects$3$1.2
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((C1Vj) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(C1Vj c1Vj, HtJ<? super Unit> htJ) {
                        C1Vj c1Vj2 = C1Vj.Hidden;
                        F1F f1f2 = f1f;
                        if (c1Vj != c1Vj2) {
                            f1f2.element = true;
                        } else if (f1f2.element) {
                            hatchShareSheetViewModel.cancelShare$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.L$0 = null;
                this.label = 1;
                if (c05663ulA01.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
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
        return ((HatchMessageShareReviewKt$HatchShareCancellationEffects$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
