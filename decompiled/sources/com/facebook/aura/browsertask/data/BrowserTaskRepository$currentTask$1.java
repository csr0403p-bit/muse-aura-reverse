package com.facebook.aura.browsertask.data;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0W;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.model.BrowserTaskPresentation;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.browsertask.data.BrowserTaskRepository$currentTask$1", f = "BrowserTaskRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class BrowserTaskRepository$currentTask$1 extends AbstractC07127nr implements G0W<List<? extends BrowserTaskPresentation>, String, HtJ<? super BrowserTaskPresentation>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public BrowserTaskRepository$currentTask$1(HtJ<? super BrowserTaskRepository$currentTask$1> htJ) {
        super(3, htJ);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<BrowserTaskPresentation> list, String str, HtJ<? super BrowserTaskPresentation> htJ) {
        BrowserTaskRepository$currentTask$1 browserTaskRepository$currentTask$1 = new BrowserTaskRepository$currentTask$1(htJ);
        browserTaskRepository$currentTask$1.L$0 = list;
        browserTaskRepository$currentTask$1.L$1 = str;
        return browserTaskRepository$currentTask$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        String str = (String) this.L$1;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return BrowserTaskStateKt.selectCurrentBrowserTask(list, str);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Object invoke(List<? extends BrowserTaskPresentation> list, String str, HtJ<? super BrowserTaskPresentation> htJ) {
        return invoke2((List<BrowserTaskPresentation>) list, str, htJ);
    }
}
