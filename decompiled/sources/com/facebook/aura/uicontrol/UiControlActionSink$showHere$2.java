package com.facebook.aura.uicontrol;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C3UX;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.uicontrol.UiAction;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.uicontrol.UiControlActionSink$showHere$2", f = "UiControlActionSink.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class UiControlActionSink$showHere$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public final /* synthetic */ UiAction.Navigation $action;
    public int label;
    public final /* synthetic */ UiControlActionSink this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiControlActionSink$showHere$2(UiControlActionSink uiControlActionSink, UiAction.Navigation navigation, HtJ<? super UiControlActionSink$showHere$2> htJ) {
        super(2, htJ);
        this.this$0 = uiControlActionSink;
        this.$action = navigation;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new UiControlActionSink$showHere$2(this.this$0, this.$action, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        CopyOnWriteArraySet<G0U<UiAction.Navigation, Boolean>> copyOnWriteArraySet = this.this$0.localNavigation;
        UiAction.Navigation navigation = this.$action;
        boolean z = false;
        if (!(copyOnWriteArraySet instanceof Collection) || !copyOnWriteArraySet.isEmpty()) {
            Iterator<G0U<UiAction.Navigation, Boolean>> it = copyOnWriteArraySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (AnonymousClass003.A1X(navigation, it.next())) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return ((UiControlActionSink$showHere$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
