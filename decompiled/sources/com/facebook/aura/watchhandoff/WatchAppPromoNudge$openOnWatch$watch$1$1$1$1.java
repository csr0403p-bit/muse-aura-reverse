package com.facebook.aura.watchhandoff;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HyO;
import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.watchhandoff.WatchAppPromoNudge$openOnWatch$watch$1$1$1$1", f = "WatchAppPromoNudge.kt", l = {263, 263}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class WatchAppPromoNudge$openOnWatch$watch$1$1$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HyO<String> $$this$channelFlow;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $node;
    public int label;
    public final /* synthetic */ WatchAppPromoNudge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WatchAppPromoNudge$openOnWatch$watch$1$1$1$1(WatchAppPromoNudge watchAppPromoNudge, Context context, String str, HyO<? super String> hyO, HtJ<? super WatchAppPromoNudge$openOnWatch$watch$1$1$1$1> htJ) {
        super(2, htJ);
        this.this$0 = watchAppPromoNudge;
        this.$context = context;
        this.$node = str;
        this.$$this$channelFlow = hyO;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new WatchAppPromoNudge$openOnWatch$watch$1$1$1$1(this.this$0, this.$context, this.$node, this.$$this$channelFlow, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            WatchAppPromoNudge watchAppPromoNudge = this.this$0;
            Context context = this.$context;
            String str = this.$node;
            this.label = 1;
            obj = watchAppPromoNudge.openChatOnWatch(context, str, this);
            if (obj == enumC10460Hji) {
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
        if (AnonymousClass001.A1X(obj)) {
            HyO<String> hyO = this.$$this$channelFlow;
            String str2 = this.$node;
            this.label = 2;
            if (hyO.AcU(str2, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((WatchAppPromoNudge$openOnWatch$watch$1$1$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
