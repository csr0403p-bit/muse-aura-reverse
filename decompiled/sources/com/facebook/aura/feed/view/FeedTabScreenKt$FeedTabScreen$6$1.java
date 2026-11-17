package com.facebook.aura.feed.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.feed.model.FeedViewModel;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.feed.view.FeedTabScreenKt$FeedTabScreen$6$1", f = "FeedTabScreen.kt", l = {337}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class FeedTabScreenKt$FeedTabScreen$6$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Boolean> $editorRevealed$delegate;
    public final /* synthetic */ String $savedToastNoTime;
    public final /* synthetic */ String $savedToastTemplate;
    public final /* synthetic */ FeedViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedTabScreenKt$FeedTabScreen$6$1(FeedViewModel feedViewModel, String str, MutableState<Boolean> mutableState, String str2, HtJ<? super FeedTabScreenKt$FeedTabScreen$6$1> htJ) {
        super(2, htJ);
        this.$viewModel = feedViewModel;
        this.$savedToastNoTime = str;
        this.$editorRevealed$delegate = mutableState;
        this.$savedToastTemplate = str2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new FeedTabScreenKt$FeedTabScreen$6$1(this.$viewModel, this.$savedToastNoTime, this.$editorRevealed$delegate, this.$savedToastTemplate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            final FeedViewModel feedViewModel = this.$viewModel;
            C22I<Unit> c22i = feedViewModel.editSavedToastEvents;
            final String str = this.$savedToastNoTime;
            final MutableState<Boolean> mutableState = this.$editorRevealed$delegate;
            final String str2 = this.$savedToastTemplate;
            C20Z<? super Unit> c20z = new C20Z() { // from class: com.facebook.aura.feed.view.FeedTabScreenKt$FeedTabScreen$6$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((Unit) obj2, (HtJ<? super Unit>) htJ);
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x005f  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(kotlin.Unit r18, X.HtJ<? super kotlin.Unit> r19) {
                    /*
                        r17 = this;
                        r3 = r17
                        androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r3
                        r8 = 0
                        androidx.compose.runtime.MutableState.A09(r8, r0)
                        com.facebook.aura.feed.model.FeedViewModel r0 = r1
                        X.1BN<com.facebook.aura.feed.model.FeedViewModel$FeedUiState> r0 = r0.uiState
                        java.lang.Object r0 = r0.getValue()
                        com.facebook.aura.feed.model.FeedViewModel$FeedUiState r0 = (com.facebook.aura.feed.model.FeedViewModel.FeedUiState) r0
                        com.facebook.aura.feed.repo.FeedStatus r0 = r0.status
                        if (r0 == 0) goto L5f
                        java.lang.Long r0 = r0.nextScheduledAtMs
                        if (r0 == 0) goto L5f
                        long r4 = r0.longValue()
                        r1 = 0
                        int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                        if (r0 <= 0) goto L5f
                        java.lang.String r3 = r4
                        java.util.Locale r2 = java.util.Locale.getDefault()
                        java.lang.String r0 = com.facebook.aura.feed.view.FeedTabScreenKt.formatNextEditionTime(r4)
                        r1 = 1
                        java.lang.Object[] r0 = new java.lang.Object[]{r0}
                        java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
                        java.lang.String r2 = java.lang.String.format(r2, r3, r0)
                    L3b:
                        com.facebook.aura.vds.toast.AuraToast$Duration r4 = com.facebook.aura.vds.toast.AuraToast.Duration.LONG
                        r3 = 0
                        com.facebook.aura.vds.compose.toast.AuraToastOption$None r6 = com.facebook.aura.vds.compose.toast.AuraToastOption.None.INSTANCE
                        com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode r10 = com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode.DEFAULT
                        com.facebook.aura.vds.compose.icons.AuraIconSize r18 = com.facebook.aura.vds.compose.icons.AuraIconSize.MEDIUM
                        com.facebook.aura.vds.toast.AuraToast$ToastArgs r1 = new com.facebook.aura.vds.toast.AuraToast$ToastArgs
                        r5 = r3
                        r7 = r3
                        r9 = r3
                        r11 = r3
                        r12 = r3
                        r13 = r8
                        r14 = r8
                        r15 = r3
                        r16 = r3
                        r17 = r3
                        r19 = r3
                        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                        X.3Em<com.facebook.aura.vds.toast.AuraToast$ToastArgs> r0 = com.facebook.aura.toast.api.ToastApi._toasts
                        r0.AhV(r1)
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    L5f:
                        java.lang.String r2 = r2
                        goto L3b
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.view.FeedTabScreenKt$FeedTabScreen$6$1.AnonymousClass1.emit(kotlin.Unit, X.HtJ):java.lang.Object");
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
        return ((FeedTabScreenKt$FeedTabScreen$6$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
