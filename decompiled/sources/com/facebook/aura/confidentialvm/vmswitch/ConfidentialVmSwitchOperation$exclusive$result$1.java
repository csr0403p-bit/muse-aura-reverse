package com.facebook.aura.confidentialvm.vmswitch;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3UX;
import X.C78T;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Add missing generic type declarations: [T] */
@DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$exclusive$result$1", f = "ConfidentialVmSwitchOperation.kt", l = {207}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class ConfidentialVmSwitchOperation$exclusive$result$1<T> extends AbstractC07127nr implements G0U<HtJ<? super T>, Object> {
    public final /* synthetic */ G0U<HtJ<? super T>, Object> $action;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$exclusive$result$1$1", f = "ConfidentialVmSwitchOperation.kt", l = {207}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$exclusive$result$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super T>, Object> {
        public final /* synthetic */ G0U<HtJ<? super T>, Object> $action;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0U<? super HtJ<? super T>, ? extends Object> g0u, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$action = g0u;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$action, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                G0U<HtJ<? super T>, Object> g0u = this.$action;
                this.label = 1;
                obj = g0u.invoke(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super T> htJ) {
            return new AnonymousClass1(this.$action, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConfidentialVmSwitchOperation$exclusive$result$1(G0U<? super HtJ<? super T>, ? extends Object> g0u, HtJ<? super ConfidentialVmSwitchOperation$exclusive$result$1> htJ) {
        super(1, htJ);
        this.$action = g0u;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new ConfidentialVmSwitchOperation$exclusive$result$1(this.$action, htJ);
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super T> htJ) {
        return new ConfidentialVmSwitchOperation$exclusive$result$1(this.$action, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            C78T c78tA0s = AnonymousClass002.A0s(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$action, null);
            this.label = 1;
            obj = GAo.A00(this, c78tA0s, anonymousClass1);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }
}
