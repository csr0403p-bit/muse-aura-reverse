package com.facebook.payments.dcp.xapp.controller.init;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C8j3;
import X.C9674Gdd;
import X.C9677Gdh;
import X.C9678Gdi;
import X.EnumC10460Hji;
import X.F0C;
import X.G0V;
import X.HsT;
import X.HtJ;
import X.Hwg;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.payments.dcp.xapp.controller.init.IapStartupController$startup$3", f = "IapStartupController.kt", l = {147}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class IapStartupController$startup$3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AtomicBoolean $answered;
    public final /* synthetic */ HsT $initListener;
    public final /* synthetic */ boolean $persistsRetryFlag;
    public final /* synthetic */ Function0<Unit> $signalServerWork;
    public final /* synthetic */ String $uplSessionId;
    public final /* synthetic */ F0C $userScopedCache$delegate;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public boolean Z$0;
    public int label;
    public final /* synthetic */ C9678Gdi this$0;

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        AtomicBoolean atomicBoolean;
        boolean z;
        C9678Gdi c9678Gdi;
        HsT hsT;
        F0C f0c;
        Object objA06 = obj;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            atomicBoolean = this.$answered;
            z = this.$persistsRetryFlag;
            c9678Gdi = this.this$0;
            hsT = this.$initListener;
            f0c = this.$userScopedCache$delegate;
            IapSyncController iapSyncController = c9678Gdi.A07;
            C9674Gdd c9674Gdd = new C9674Gdd(this.$uplSessionId);
            Function0<Unit> function0 = this.$signalServerWork;
            this.L$0 = atomicBoolean;
            this.L$1 = c9678Gdi;
            this.L$2 = hsT;
            this.L$3 = f0c;
            this.Z$0 = z;
            this.label = 1;
            objA06 = iapSyncController.A06(c9674Gdd, this, function0);
            if (objA06 == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            z = this.Z$0;
            f0c = (F0C) this.L$3;
            hsT = (HsT) this.L$2;
            c9678Gdi = (C9678Gdi) this.L$1;
            atomicBoolean = (AtomicBoolean) this.L$0;
            Hwg.A00(obj);
        }
        C9678Gdi.A00(c9678Gdi, (C9677Gdh) objA06, hsT, atomicBoolean, f0c, z);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IapStartupController$startup$3(C9678Gdi c9678Gdi, HsT hsT, String str, AtomicBoolean atomicBoolean, F0C f0c, HtJ htJ, Function0 function0, boolean z) {
        super(2, htJ);
        this.this$0 = c9678Gdi;
        this.$uplSessionId = str;
        this.$signalServerWork = function0;
        this.$answered = atomicBoolean;
        this.$persistsRetryFlag = z;
        this.$initListener = hsT;
        this.$userScopedCache$delegate = f0c;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        C9678Gdi c9678Gdi = this.this$0;
        String str = this.$uplSessionId;
        Function0<Unit> function0 = this.$signalServerWork;
        return new IapStartupController$startup$3(c9678Gdi, this.$initListener, str, this.$answered, this.$userScopedCache$delegate, htJ, function0, this.$persistsRetryFlag);
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((IapStartupController$startup$3) C8j3.A1E(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
    }
}
