package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C10543Hqv;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.nodes.api.HatchNodeInvocation;
import com.facebook.aura.nodes.api.HatchNodeInvocationResult;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserEndpointNodeHandler$execute$result$1", f = "LocalBrowserEndpointNodeHandler.kt", l = {91}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserEndpointNodeHandler$execute$result$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchNodeInvocationResult>, Object> {
    public final /* synthetic */ long $deadline;
    public final /* synthetic */ String $id;
    public final /* synthetic */ HatchNodeInvocation $invocation;
    public final /* synthetic */ C10543Hqv<HatchNodeInvocationResult> $owned;
    public final /* synthetic */ JsonObject $wire;
    public int label;
    public final /* synthetic */ LocalBrowserEndpointNodeHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserEndpointNodeHandler$execute$result$1(LocalBrowserEndpointNodeHandler localBrowserEndpointNodeHandler, HatchNodeInvocation hatchNodeInvocation, String str, JsonObject jsonObject, long j, C10543Hqv<HatchNodeInvocationResult> c10543Hqv, HtJ<? super LocalBrowserEndpointNodeHandler$execute$result$1> htJ) {
        super(2, htJ);
        this.this$0 = localBrowserEndpointNodeHandler;
        this.$invocation = hatchNodeInvocation;
        this.$id = str;
        this.$wire = jsonObject;
        this.$deadline = j;
        this.$owned = c10543Hqv;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LocalBrowserEndpointNodeHandler$execute$result$1(this.this$0, this.$invocation, this.$id, this.$wire, this.$deadline, this.$owned, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws Throwable {
        T t;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            LocalBrowserEndpointNodeHandler localBrowserEndpointNodeHandler = this.this$0;
            HatchNodeInvocation hatchNodeInvocation = this.$invocation;
            String str = this.$id;
            JsonObject jsonObject = this.$wire;
            long j = this.$deadline;
            this.label = 1;
            Object objDispatch = localBrowserEndpointNodeHandler.dispatch(hatchNodeInvocation, str, jsonObject, j, this);
            t = objDispatch;
            if (objDispatch == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            t = obj;
        }
        this.$owned.element = t;
        return t;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super HatchNodeInvocationResult> htJ) {
        return ((LocalBrowserEndpointNodeHandler$execute$result$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
