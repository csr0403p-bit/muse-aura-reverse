package com.facebook.aura.nodes;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.nodes.registry.HatchNodeCommandHandler;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.nodes.HatchNodeClient$executeCommand$validationError$1", f = "HatchNodeClient.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchNodeClient$executeCommand$validationError$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
    public final /* synthetic */ HatchNodeCommandHandler $handler;
    public final /* synthetic */ String $paramsJson;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchNodeClient$executeCommand$validationError$1(HatchNodeCommandHandler hatchNodeCommandHandler, String str, HtJ<? super HatchNodeClient$executeCommand$validationError$1> htJ) {
        super(2, htJ);
        this.$handler = hatchNodeCommandHandler;
        this.$paramsJson = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchNodeClient$executeCommand$validationError$1(this.$handler, this.$paramsJson, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return this.$handler.validateParams(this.$paramsJson);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
        return ((HatchNodeClient$executeCommand$validationError$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
