package com.facebook.rp.platform.callutil;

import X.AbstractC07127nr;
import X.AbstractC9603GRj;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C0881AGi;
import X.C10543Hqv;
import X.C3UX;
import X.C7Bq;
import X.C8j3;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GRH;
import X.GRZ;
import X.GS5;
import X.GSE;
import X.GSQ;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.Hy5;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.rp.platform.callutil.WaitForCallConditionKt$waitForCallCondition$3", f = "WaitForCallCondition.kt", l = {137}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class WaitForCallConditionKt$waitForCallCondition$3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ G0U<GRH, Boolean> $condition;
    public final /* synthetic */ String $localCallId;
    public final /* synthetic */ AtomicReference<GSQ> $resultValue;
    public final /* synthetic */ G0U<GSQ, Unit> $run;
    public final /* synthetic */ GRZ $store;
    public final /* synthetic */ C10543Hqv<Function0<Unit>> $storeSubscription;
    public final /* synthetic */ C10543Hqv<HoC> $timeoutJob;
    public final /* synthetic */ long $timeoutMs;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (JLX/G0U<-LX/GRH;Ljava/lang/Boolean;>;LX/GRZ;Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicReference<LX/GSQ;>;LX/Hqv<LX/HoC;>;LX/Hqv<Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;>;LX/G0U<-LX/GSQ;Lkotlin/Unit;>;LX/HtJ<-Lcom/facebook/rp/platform/callutil/WaitForCallConditionKt$waitForCallCondition$3;>;)V */
    public WaitForCallConditionKt$waitForCallCondition$3(GRZ grz, String str, AtomicReference atomicReference, HtJ htJ, G0U g0u, G0U g0u2, C10543Hqv c10543Hqv, C10543Hqv c10543Hqv2, long j) {
        super(2, htJ);
        this.$timeoutMs = j;
        this.$condition = g0u;
        this.$store = grz;
        this.$localCallId = str;
        this.$resultValue = atomicReference;
        this.$timeoutJob = c10543Hqv;
        this.$storeSubscription = c10543Hqv2;
        this.$run = g0u2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        long j = this.$timeoutMs;
        G0U<GRH, Boolean> g0u = this.$condition;
        return new WaitForCallConditionKt$waitForCallCondition$3(this.$store, this.$localCallId, this.$resultValue, htJ, g0u, this.$run, this.$timeoutJob, this.$storeSubscription, j);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        AtomicReference<GSQ> atomicReference;
        C10543Hqv<HoC> c10543Hqv;
        C10543Hqv<Function0<Unit>> c10543Hqv2;
        G0U<GSQ, Unit> g0u;
        GSQ gs5;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            long j = this.$timeoutMs;
            this.label = 1;
            if (C7Bq.A01(j, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        if (AnonymousClass003.A1X(this.$store.AFy().invoke(), this.$condition)) {
            Hy5.A00("wait_for_call_condition_timeout_but_condition_passed", this.$localCallId, C0881AGi.A00);
            atomicReference = this.$resultValue;
            c10543Hqv = this.$timeoutJob;
            c10543Hqv2 = this.$storeSubscription;
            g0u = this.$run;
            gs5 = new GS5(this.$store);
        } else {
            atomicReference = this.$resultValue;
            c10543Hqv = this.$timeoutJob;
            c10543Hqv2 = this.$storeSubscription;
            g0u = this.$run;
            gs5 = GSE.A00;
        }
        AbstractC9603GRj.A01(gs5, atomicReference, g0u, c10543Hqv, c10543Hqv2);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((WaitForCallConditionKt$waitForCallCondition$3) C8j3.A1E(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
    }
}
