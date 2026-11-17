package com.facebook.aura.nodes;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C10543Hqv;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.nodes.api.HatchNodeInvocation;
import com.facebook.aura.nodes.api.HatchNodeInvocationHandler;
import com.facebook.aura.nodes.api.HatchNodeInvocationResult;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.nodes.HatchNodeInvocationDispatcher$dispatch$2$1$result$1", f = "HatchNodeInvocationDispatcher.kt", l = {105}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchNodeInvocationDispatcher$dispatch$2$1$result$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchNodeInvocationResult>, Object> {
    public final /* synthetic */ String $arguments;
    public final /* synthetic */ String $command;
    public final /* synthetic */ long $deadline;
    public final /* synthetic */ long $generation;
    public final /* synthetic */ HatchNodeInvocationHandler $handler;
    public final /* synthetic */ String $id;
    public final /* synthetic */ C10543Hqv<HatchNodeInvocationResult> $ownedResult;
    public final /* synthetic */ HoC $owner;
    public int label;
    public final /* synthetic */ HatchNodeInvocationDispatcher this$0;

    /* renamed from: com.facebook.aura.nodes.HatchNodeInvocationDispatcher$dispatch$2$1$result$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ HoC $owner;
        public final /* synthetic */ HatchNodeInvocationDispatcher this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HoC hoC, HatchNodeInvocationDispatcher hatchNodeInvocationDispatcher) {
            super(0);
            this.$owner = hoC;
            this.this$0 = hatchNodeInvocationDispatcher;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            boolean zA1Z;
            boolean z = false;
            if (this.$owner.isActive()) {
                HatchNodeInvocationDispatcher hatchNodeInvocationDispatcher = this.this$0;
                Object obj = hatchNodeInvocationDispatcher.lock;
                HoC hoC = this.$owner;
                synchronized (obj) {
                    zA1Z = AnonymousClass002.A1Z(hatchNodeInvocationDispatcher.connection, hoC);
                }
                if (zA1Z) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchNodeInvocationDispatcher$dispatch$2$1$result$1(HatchNodeInvocationHandler hatchNodeInvocationHandler, HatchNodeInvocationDispatcher hatchNodeInvocationDispatcher, String str, String str2, String str3, long j, long j2, HoC hoC, C10543Hqv<HatchNodeInvocationResult> c10543Hqv, HtJ<? super HatchNodeInvocationDispatcher$dispatch$2$1$result$1> htJ) {
        super(2, htJ);
        this.$handler = hatchNodeInvocationHandler;
        this.this$0 = hatchNodeInvocationDispatcher;
        this.$command = str;
        this.$id = str2;
        this.$arguments = str3;
        this.$deadline = j;
        this.$generation = j2;
        this.$owner = hoC;
        this.$ownedResult = c10543Hqv;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchNodeInvocationDispatcher$dispatch$2$1$result$1(this.$handler, this.this$0, this.$command, this.$id, this.$arguments, this.$deadline, this.$generation, this.$owner, this.$ownedResult, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        T t;
        Object obj2 = obj;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj2);
            HatchNodeInvocationHandler hatchNodeInvocationHandler = this.$handler;
            if (hatchNodeInvocationHandler == null) {
                throw C3cG.A0Q("Required value was null.");
            }
            HatchNodeInvocationDispatcher hatchNodeInvocationDispatcher = this.this$0;
            HatchNodeInvocation hatchNodeInvocation = new HatchNodeInvocation(hatchNodeInvocationDispatcher.context, this.$command, this.$id, this.$arguments, this.$deadline, new AnonymousClass1(this.$owner, hatchNodeInvocationDispatcher), this.$generation);
            this.label = 1;
            Object objExecute = hatchNodeInvocationHandler.execute(hatchNodeInvocation, this);
            t = objExecute;
            if (objExecute == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj2);
            t = obj2;
        }
        this.$ownedResult.element = t;
        return t;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super HatchNodeInvocationResult> htJ) {
        return ((HatchNodeInvocationDispatcher$dispatch$2$1$result$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
