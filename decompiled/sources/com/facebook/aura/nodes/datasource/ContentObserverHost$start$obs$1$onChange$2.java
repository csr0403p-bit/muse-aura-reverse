package com.facebook.aura.nodes.datasource;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.nodes.datasource.ContentObserverHost$start$obs$1$onChange$2", f = "HatchProactiveTriggerManager.kt", l = {149, 150}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class ContentObserverHost$start$obs$1$onChange$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ ContentObserverHost this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentObserverHost$start$obs$1$onChange$2(ContentObserverHost contentObserverHost, HtJ<? super ContentObserverHost$start$obs$1$onChange$2> htJ) {
        super(2, htJ);
        this.this$0 = contentObserverHost;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ContentObserverHost$start$obs$1$onChange$2(this.this$0, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new ContentObserverHost$start$obs$1$onChange$2(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            long j = this.this$0.debounceMs;
            this.label = 1;
            if (C7Bq.A01(j, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Unit.INSTANCE;
            }
            Hwg.A00(obj);
        }
        ContentObserverHost contentObserverHost = this.this$0;
        this.label = 2;
        if (contentObserverHost.runOnChange(this) == enumC10460Hji) {
            return enumC10460Hji;
        }
        return Unit.INSTANCE;
    }
}
