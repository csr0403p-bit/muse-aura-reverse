package com.facebook.aura.browsertask.conversation;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass602;
import X.C0dx;
import X.C1BO;
import X.C20Z;
import X.C2135Az3;
import X.C3UX;
import X.C5303Dfm;
import X.C6v3;
import X.EnumC10460Hji;
import X.EnumC10573Huf;
import X.F2N;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.browsertask.conversation.HatchBrowserTaskCardKt$BrowserTaskStateHapticEffect$1$1", f = "HatchBrowserTaskCard.kt", l = {160}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchBrowserTaskCardKt$BrowserTaskStateHapticEffect$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C0dx $haptics;
    public final /* synthetic */ F2N $lifecycle;
    public final /* synthetic */ C1BO<C2135Az3> $stateHaptic$delegate;
    public int label;

    /* renamed from: com.facebook.aura.browsertask.conversation.HatchBrowserTaskCardKt$BrowserTaskStateHapticEffect$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C2135Az3> {
        public final /* synthetic */ C1BO<C2135Az3> $stateHaptic$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C1BO<C2135Az3> c1bo) {
            super(0);
            this.$stateHaptic$delegate = c1bo;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ C2135Az3 invoke() {
            return this.$stateHaptic$delegate.getValue();
        }

        /* renamed from: invoke-QTGlAvA, reason: not valid java name */
        public final C2135Az3 m302invokeQTGlAvA() {
            return this.$stateHaptic$delegate.getValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchBrowserTaskCardKt$BrowserTaskStateHapticEffect$1$1(C1BO<C2135Az3> c1bo, F2N f2n, C0dx c0dx, HtJ<? super HatchBrowserTaskCardKt$BrowserTaskStateHapticEffect$1$1> htJ) {
        super(2, htJ);
        this.$stateHaptic$delegate = c1bo;
        this.$lifecycle = f2n;
        this.$haptics = c0dx;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchBrowserTaskCardKt$BrowserTaskStateHapticEffect$1$1(this.$stateHaptic$delegate, this.$lifecycle, this.$haptics, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AnonymousClass602 anonymousClass602A00 = AnonymousClass602.A00(C6v3.A01(new AnonymousClass1(this.$stateHaptic$delegate)));
            final F2N f2n = this.$lifecycle;
            final C0dx c0dx = this.$haptics;
            C20Z c20z = new C20Z() { // from class: com.facebook.aura.browsertask.conversation.HatchBrowserTaskCardKt$BrowserTaskStateHapticEffect$1$1.2
                @Override // X.C20Z
                /* renamed from: emit-o1pOxQM, reason: not valid java name and merged with bridge method [inline-methods] */
                public final Object emit(C2135Az3 c2135Az3, HtJ<? super Unit> htJ) {
                    if (c2135Az3 != null && ((C5303Dfm) f2n).A01.A00(EnumC10573Huf.A05)) {
                        c0dx.AXr(c2135Az3.A00);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (anonymousClass602A00.collect(c20z, this) == enumC10460Hji) {
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
        return ((HatchBrowserTaskCardKt$BrowserTaskStateHapticEffect$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
