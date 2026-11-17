package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C05663ul;
import X.C20Z;
import X.C3UX;
import X.C6v3;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.pager.PagerState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.file.view.MediaViewerContentKt$MediaViewerContent$4$1", f = "MediaViewerContent.kt", l = {215}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class MediaViewerContentKt$MediaViewerContent$4$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ G0U<Integer, Unit> $onPageChanged;
    public final /* synthetic */ PagerState $pagerState;
    public int label;

    /* renamed from: com.facebook.aura.file.view.MediaViewerContentKt$MediaViewerContent$4$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Integer> {
        public final /* synthetic */ PagerState $pagerState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PagerState pagerState) {
            super(0);
            this.$pagerState = pagerState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(this.$pagerState.A07());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaViewerContentKt$MediaViewerContent$4$1(PagerState pagerState, G0U<? super Integer, Unit> g0u, HtJ<? super MediaViewerContentKt$MediaViewerContent$4$1> htJ) {
        super(2, htJ);
        this.$pagerState = pagerState;
        this.$onPageChanged = g0u;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new MediaViewerContentKt$MediaViewerContent$4$1(this.$pagerState, this.$onPageChanged, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C05663ul c05663ulA01 = C6v3.A01(new AnonymousClass1(this.$pagerState));
            final G0U<Integer, Unit> g0u = this.$onPageChanged;
            C20Z c20z = new C20Z() { // from class: com.facebook.aura.file.view.MediaViewerContentKt$MediaViewerContent$4$1.2
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit(AnonymousClass001.A0F(obj2), (HtJ<? super Unit>) htJ);
                }

                public final Object emit(int i2, HtJ<? super Unit> htJ) {
                    g0u.invoke(new Integer(i2));
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (c05663ulA01.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
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
        return ((MediaViewerContentKt$MediaViewerContent$4$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
