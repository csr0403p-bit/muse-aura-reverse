package com.facebook.aura.watchhandoff;

import X.AbstractC05643uj;
import X.AbstractC07127nr;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.C05593uc;
import X.C0881AGi;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HyO;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.watchhandoff.WatchAppPromoNudge$openStore$watch$1", f = "WatchAppPromoNudge.kt", l = {296}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class WatchAppPromoNudge$openStore$watch$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Intent $intent;
    public int label;
    public final /* synthetic */ WatchAppPromoNudge this$0;

    @DebugMetadata(c = "com.facebook.aura.watchhandoff.WatchAppPromoNudge$openStore$watch$1$1", f = "WatchAppPromoNudge.kt", l = {292}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.watchhandoff.WatchAppPromoNudge$openStore$watch$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<HyO<? super String>, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ Intent $intent;
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ WatchAppPromoNudge this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WatchAppPromoNudge watchAppPromoNudge, Context context, Intent intent, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.this$0 = watchAppPromoNudge;
            this.$context = context;
            this.$intent = intent;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$context, this.$intent, htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            List list;
            HyO hyO = (HyO) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                WatchAppPromoNudge watchAppPromoNudge = this.this$0;
                Context context = this.$context;
                this.L$0 = hyO;
                this.label = 1;
                obj = watchAppPromoNudge.connectedWatches(context, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            ConnectedWatches connectedWatches = (ConnectedWatches) obj;
            if (connectedWatches == null || (list = connectedWatches.withoutMuse) == null) {
                list = C0881AGi.A00;
            }
            WatchAppPromoNudge watchAppPromoNudge2 = this.this$0;
            Context context2 = this.$context;
            Intent intent = this.$intent;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass001.A1J(new WatchAppPromoNudge$openStore$watch$1$1$1$1(watchAppPromoNudge2, context2, intent, (String) it.next(), hyO, null), hyO);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(HyO<? super String> hyO, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(hyO, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchAppPromoNudge$openStore$watch$1(WatchAppPromoNudge watchAppPromoNudge, Context context, Intent intent, HtJ<? super WatchAppPromoNudge$openStore$watch$1> htJ) {
        super(2, htJ);
        this.this$0 = watchAppPromoNudge;
        this.$context = context;
        this.$intent = intent;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new WatchAppPromoNudge$openStore$watch$1(this.this$0, this.$context, this.$intent, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C05593uc c05593ucA01 = AbstractC05643uj.A01(new AnonymousClass1(this.this$0, this.$context, this.$intent, null));
            this.label = 1;
            obj = AbstractC9777Gfy.A03(c05593ucA01, this);
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
    public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
        return ((WatchAppPromoNudge$openStore$watch$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
