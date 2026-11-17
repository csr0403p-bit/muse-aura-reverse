package androidx.work.impl.utils;

import X.AbstractC07127nr;
import X.AbstractC2947Bpi;
import X.AbstractC6610EKa;
import X.AbstractC6615EKh;
import X.AnonymousClass001;
import X.BV4;
import X.BV5;
import X.Br3;
import X.Br6;
import X.C3009Brr;
import X.C3UX;
import X.C6614EKg;
import X.C6616EKj;
import X.C6617EKk;
import X.C7384Etj;
import X.E91;
import X.EK9;
import X.EKE;
import X.EKX;
import X.EL0;
import X.EnumC10460Hji;
import X.ExecutorC6622EKr;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.work.impl.utils.WorkForegroundKt$workForeground$2", f = "WorkForeground.kt", l = {42, 50}, m = "invokeSuspend", v = 1)
/* loaded from: classes5.dex */
public final class WorkForegroundKt$workForeground$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Void>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ EL0 $foregroundUpdater;
    public final /* synthetic */ EKE $spec;
    public final /* synthetic */ AbstractC6610EKa $worker;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/EKa;LX/EKE;LX/EL0;Landroid/content/Context;LX/HtJ<-Landroidx/work/impl/utils/WorkForegroundKt$workForeground$2;>;)V */
    public WorkForegroundKt$workForeground$2(Context context, EL0 el0, AbstractC6610EKa abstractC6610EKa, EKE eke, HtJ htJ) {
        super(2, htJ);
        this.$worker = abstractC6610EKa;
        this.$spec = eke;
        this.$foregroundUpdater = el0;
        this.$context = context;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        AbstractC6610EKa abstractC6610EKa = this.$worker;
        EKE eke = this.$spec;
        return new WorkForegroundKt$workForeground$2(this.$context, this.$foregroundUpdater, abstractC6610EKa, eke, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            ListenableFuture<C6617EKk> foregroundInfoAsync = this.$worker.getForegroundInfoAsync();
            C7384Etj.A0U(foregroundInfoAsync);
            AbstractC6610EKa abstractC6610EKa = this.$worker;
            this.label = 1;
            obj = Br6.A00(abstractC6610EKa, foregroundInfoAsync, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    Hwg.A00(obj);
                }
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        C6617EKk c6617EKk = (C6617EKk) obj;
        if (c6617EKk == null) {
            throw BV5.A0V("Worker was marked important (", this.$spec.A0K, ") but did not provide ForegroundInfo");
        }
        BV4.A1E(EK9.A00(), "Updating notification for ", this.$spec.A0K, AbstractC6615EKh.A00);
        EL0 el0 = this.$foregroundUpdater;
        Context context = this.$context;
        UUID uuid = this.$worker.mWorkerParams.A08;
        C6614EKg c6614EKg = (C6614EKg) el0;
        ExecutorC6622EKr executorC6622EKr = ((C6616EKj) c6614EKg.A02).A01;
        EKX ekx = new EKX(context, c6617EKk, c6614EKg, uuid);
        C7384Etj.A0Y(executorC6622EKr, 0);
        C3009Brr c3009BrrA00 = AbstractC2947Bpi.A00(new E91(executorC6622EKr, ekx, "setForegroundAsync", 1));
        this.label = 2;
        obj = Br3.A00(c3009BrrA00, this);
        return obj == enumC10460Hji ? enumC10460Hji : obj;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Void> htJ) {
        return ((WorkForegroundKt$workForeground$2) AbstractC07127nr.A09(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
    }
}
