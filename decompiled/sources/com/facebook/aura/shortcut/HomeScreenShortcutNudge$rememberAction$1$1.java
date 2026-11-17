package com.facebook.aura.shortcut;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.EnumC10460Hji;
import X.F2N;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import com.facebook.acra.util.minidump.MinidumpReader;
import com.facebook.aura.nudge.NudgeOutcome;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HomeScreenShortcutNudge$rememberAction$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C1BO<G0U<NudgeOutcome, Unit>> $currentOnOutcome$delegate;
    public final /* synthetic */ F2N $lifecycle;
    public final /* synthetic */ C3UX $scope;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    @DebugMetadata(c = "com.facebook.aura.shortcut.HomeScreenShortcutNudge$rememberAction$1$1$1", f = "HomeScreenShortcutNudge.kt", l = {MinidumpReader.MODULE_FULL_SIZE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.shortcut.HomeScreenShortcutNudge$rememberAction$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ C1BO<G0U<NudgeOutcome, Unit>> $currentOnOutcome$delegate;
        public final /* synthetic */ F2N $lifecycle;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Context context, AbstractC3358CGz abstractC3358CGz, F2N f2n, C1BO<? extends G0U<? super NudgeOutcome, Unit>> c1bo, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$userSession = abstractC3358CGz;
            this.$lifecycle = f2n;
            this.$currentOnOutcome$delegate = c1bo;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$context, this.$userSession, this.$lifecycle, this.$currentOnOutcome$delegate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            G0U g0uA0B;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                g0uA0B = C1BO.A0B(this.$currentOnOutcome$delegate);
                HomeScreenShortcutNudge homeScreenShortcutNudge = HomeScreenShortcutNudge.INSTANCE;
                Context context = this.$context;
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                F2N f2n = this.$lifecycle;
                this.L$0 = g0uA0B;
                this.label = 1;
                obj = homeScreenShortcutNudge.pinShortcut(context, abstractC3358CGz, f2n, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                g0uA0B = (G0U) this.L$0;
                Hwg.A00(obj);
            }
            g0uA0B.invoke(obj);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HomeScreenShortcutNudge$rememberAction$1$1(C3UX c3ux, Context context, AbstractC3358CGz abstractC3358CGz, F2N f2n, C1BO<? extends G0U<? super NudgeOutcome, Unit>> c1bo) {
        super(0);
        this.$scope = c3ux;
        this.$context = context;
        this.$userSession = abstractC3358CGz;
        this.$lifecycle = f2n;
        this.$currentOnOutcome$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AnonymousClass001.A1J(new AnonymousClass1(this.$context, this.$userSession, this.$lifecycle, this.$currentOnOutcome$delegate, null), this.$scope);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
