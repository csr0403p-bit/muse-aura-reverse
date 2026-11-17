package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.localbrowser.LocalBrowserEndpointNodeHandler;
import com.hatch.browser.core.CommandReport;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserEndpointNodeHandler$deferred$1$encode$2$4$1$1", f = "LocalBrowserEndpointNodeHandler.kt", l = {577}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserEndpointNodeHandler$deferred$1$encode$2$4$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super JsonObject>, Object> {
    public final /* synthetic */ CommandReport $held;
    public final /* synthetic */ String $it;
    public int label;
    public final /* synthetic */ LocalBrowserEndpointNodeHandler.AnonymousClass1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserEndpointNodeHandler$deferred$1$encode$2$4$1$1(LocalBrowserEndpointNodeHandler.AnonymousClass1 anonymousClass1, CommandReport commandReport, String str, HtJ<? super LocalBrowserEndpointNodeHandler$deferred$1$encode$2$4$1$1> htJ) {
        super(2, htJ);
        this.this$0 = anonymousClass1;
        this.$held = commandReport;
        this.$it = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LocalBrowserEndpointNodeHandler$deferred$1$encode$2$4$1$1(this.this$0, this.$held, this.$it, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            LocalBrowserEndpointNodeHandler.AnonymousClass1 anonymousClass1 = this.this$0;
            CommandReport commandReport = this.$held;
            String str = this.$it;
            this.label = 1;
            obj = anonymousClass1.dropped(commandReport, str, this);
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
    public final Object invoke(C3UX c3ux, HtJ<? super JsonObject> htJ) {
        return ((LocalBrowserEndpointNodeHandler$deferred$1$encode$2$4$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
