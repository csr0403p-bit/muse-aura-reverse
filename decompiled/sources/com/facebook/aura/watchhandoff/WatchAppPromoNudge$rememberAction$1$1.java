package com.facebook.aura.watchhandoff;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import com.facebook.aura.nudge.NudgeOutcome;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class WatchAppPromoNudge$rememberAction$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C1BO<G0U<NudgeOutcome, Unit>> $currentOnOutcome$delegate;
    public final /* synthetic */ C3UX $scope;
    public final /* synthetic */ WatchAppPromoNudge this$0;

    @DebugMetadata(c = "com.facebook.aura.watchhandoff.WatchAppPromoNudge$rememberAction$1$1$1", f = "WatchAppPromoNudge.kt", l = {224, 224}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.watchhandoff.WatchAppPromoNudge$rememberAction$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ C1BO<G0U<NudgeOutcome, Unit>> $currentOnOutcome$delegate;
        public Object L$0;
        public int label;
        public final /* synthetic */ WatchAppPromoNudge this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(WatchAppPromoNudge watchAppPromoNudge, Context context, C1BO<? extends G0U<? super NudgeOutcome, Unit>> c1bo, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.this$0 = watchAppPromoNudge;
            this.$context = context;
            this.$currentOnOutcome$delegate = c1bo;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.this$0, this.$context, this.$currentOnOutcome$delegate, htJ);
        }

        /* JADX WARN: Not initialized variable reg: 2, insn: 0x005c: INVOKE (r0v2 ?? I:X.G0U), (r2 I:java.lang.Object) INTERFACE call: X.G0U.invoke(java.lang.Object):java.lang.Object A[MD:(P1):R (m)] (LINE:92), block:B:27:0x0056 */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objInvoke;
            NudgeOutcome nudgeOutcome;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    NudgeOutcome nudgeOutcome2 = NudgeOutcome.UNKNOWN;
                    boolean z = this.this$0.watchAppInstalled;
                    WatchAppPromoNudge watchAppPromoNudge = this.this$0;
                    if (z) {
                        Context context = this.$context;
                        this.L$0 = nudgeOutcome2;
                        this.label = 1;
                        obj = watchAppPromoNudge.openOnWatch(context, this);
                        if (obj == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                        nudgeOutcome = (NudgeOutcome) obj;
                    } else {
                        Context context2 = this.$context;
                        this.L$0 = nudgeOutcome2;
                        this.label = 2;
                        obj = watchAppPromoNudge.openStore(context2, this);
                        if (obj == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                        nudgeOutcome = (NudgeOutcome) obj;
                    }
                } else if (i == 1) {
                    Object obj2 = this.L$0;
                    Hwg.A00(obj);
                    nudgeOutcome = (NudgeOutcome) obj;
                } else {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Object obj3 = this.L$0;
                    Hwg.A00(obj);
                    nudgeOutcome = (NudgeOutcome) obj;
                }
                C1BO.A0B(this.$currentOnOutcome$delegate).invoke(nudgeOutcome);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                C1BO.A0B(this.$currentOnOutcome$delegate).invoke(objInvoke);
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WatchAppPromoNudge$rememberAction$1$1(C3UX c3ux, WatchAppPromoNudge watchAppPromoNudge, Context context, C1BO<? extends G0U<? super NudgeOutcome, Unit>> c1bo) {
        super(0);
        this.$scope = c3ux;
        this.this$0 = watchAppPromoNudge;
        this.$context = context;
        this.$currentOnOutcome$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AnonymousClass001.A1J(new AnonymousClass1(this.this$0, this.$context, this.$currentOnOutcome$delegate, null), this.$scope);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
