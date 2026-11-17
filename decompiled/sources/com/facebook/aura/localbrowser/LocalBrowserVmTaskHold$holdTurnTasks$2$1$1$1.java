package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.browsertask.data.BrowserTaskRepository;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserVmTaskHold$holdTurnTasks$2$1$1$1", f = "LocalBrowserVmTaskHold.kt", l = {HatchIdeaShareImageRenderer.TEXT_LEFT}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserVmTaskHold$holdTurnTasks$2$1$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ ConcurrentHashMap.KeySetView<String, Boolean> $holding;
    public final /* synthetic */ String $id;
    public final /* synthetic */ BrowserTaskRepository $repository;
    public int label;
    public final /* synthetic */ LocalBrowserVmTaskHold this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserVmTaskHold$holdTurnTasks$2$1$1$1(LocalBrowserVmTaskHold localBrowserVmTaskHold, BrowserTaskRepository browserTaskRepository, String str, ConcurrentHashMap.KeySetView<String, Boolean> keySetView, HtJ<? super LocalBrowserVmTaskHold$holdTurnTasks$2$1$1$1> htJ) {
        super(2, htJ);
        this.this$0 = localBrowserVmTaskHold;
        this.$repository = browserTaskRepository;
        this.$id = str;
        this.$holding = keySetView;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LocalBrowserVmTaskHold$holdTurnTasks$2$1$1$1(this.this$0, this.$repository, this.$id, this.$holding, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                LocalBrowserVmTaskHold localBrowserVmTaskHold = this.this$0;
                BrowserTaskRepository browserTaskRepository = this.$repository;
                String str = this.$id;
                this.label = 1;
                if (localBrowserVmTaskHold.hold(browserTaskRepository, str, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            this.$holding.remove(this.$id);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            this.$holding.remove(this.$id);
            throw th;
        }
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((LocalBrowserVmTaskHold$holdTurnTasks$2$1$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
