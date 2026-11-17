package com.facebook.aura.localbrowser.core;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C10543Hqv;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.hatch.browser.core.BrowserCore;
import com.hatch.browser.core.BrowserOperationsKt;
import com.hatch.browser.core.CapturedBudget;
import com.hatch.browser.core.CommandReport;
import com.hatch.browser.protocol.CommandRequest;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

@DebugMetadata(c = "com.facebook.aura.localbrowser.core.BrowserEngine$execute$result$1", f = "BrowserEngine.kt", l = {R.styleable.maplibre_MapView_maplibre_uiTiltGestures}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class BrowserEngine$execute$result$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super CommandReport>, Object> {
    public final /* synthetic */ CapturedBudget $budget;
    public final /* synthetic */ CommandRequest $request;
    public final /* synthetic */ C10543Hqv<CommandReport> $retained;
    public int label;
    public final /* synthetic */ BrowserEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowserEngine$execute$result$1(BrowserEngine browserEngine, CommandRequest commandRequest, CapturedBudget capturedBudget, C10543Hqv<CommandReport> c10543Hqv, HtJ<? super BrowserEngine$execute$result$1> htJ) {
        super(2, htJ);
        this.this$0 = browserEngine;
        this.$request = commandRequest;
        this.$budget = capturedBudget;
        this.$retained = c10543Hqv;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new BrowserEngine$execute$result$1(this.this$0, this.$request, this.$budget, this.$retained, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        T t;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            BrowserCore browserCore = this.this$0.core;
            CommandRequest commandRequest = this.$request;
            CommandRequest commandRequestCopy = commandRequest.copy(commandRequest.operationId, commandRequest.page, commandRequest.task, this.$budget.forExecution(), commandRequest.command, commandRequest.observeAfter);
            this.label = 1;
            Object objExecute = BrowserOperationsKt.execute(browserCore, commandRequestCopy, this);
            t = objExecute;
            if (objExecute == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            t = obj;
        }
        this.$retained.element = t;
        return t;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super CommandReport> htJ) {
        return ((BrowserEngine$execute$result$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
