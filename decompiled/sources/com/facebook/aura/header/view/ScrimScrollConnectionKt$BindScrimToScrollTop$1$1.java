package com.facebook.aura.header.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C05663ul;
import X.C20Z;
import X.C3UX;
import X.C6v3;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.header.view.ScrimScrollConnectionKt$BindScrimToScrollTop$1$1", f = "ScrimScrollConnection.kt", l = {115}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class ScrimScrollConnectionKt$BindScrimToScrollTop$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ ScrimScrollState $scrim;
    public int label;

    /* renamed from: com.facebook.aura.header.view.ScrimScrollConnectionKt$BindScrimToScrollTop$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ LazyListState $listState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LazyListState lazyListState) {
            super(0);
            this.$listState = lazyListState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke() {
            /*
                r1 = this;
                androidx.compose.foundation.lazy.LazyListState r0 = r1.$listState
                int r0 = r0.A02()
                if (r0 != 0) goto L11
                androidx.compose.foundation.lazy.LazyListState r0 = r1.$listState
                int r1 = r0.A03()
                r0 = 1
                if (r1 == 0) goto L12
            L11:
                r0 = 0
            L12:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.header.view.ScrimScrollConnectionKt$BindScrimToScrollTop$1$1.AnonymousClass1.invoke():java.lang.Boolean");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrimScrollConnectionKt$BindScrimToScrollTop$1$1(LazyListState lazyListState, ScrimScrollState scrimScrollState, HtJ<? super ScrimScrollConnectionKt$BindScrimToScrollTop$1$1> htJ) {
        super(2, htJ);
        this.$listState = lazyListState;
        this.$scrim = scrimScrollState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ScrimScrollConnectionKt$BindScrimToScrollTop$1$1(this.$listState, this.$scrim, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C05663ul c05663ulA01 = C6v3.A01(new AnonymousClass1(this.$listState));
            final ScrimScrollState scrimScrollState = this.$scrim;
            C20Z c20z = new C20Z() { // from class: com.facebook.aura.header.view.ScrimScrollConnectionKt$BindScrimToScrollTop$1$1.2
                public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                    if (z) {
                        scrimScrollState.setOffset(0.0f);
                    }
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
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
        return ((ScrimScrollConnectionKt$BindScrimToScrollTop$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
