package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC07127nr;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.C10649I0t;
import X.C3UX;
import X.C57m;
import X.C7BY;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$resolveCallServerInfoData$callServerInfoData$1", f = "SessionController.kt", l = {5831}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class SessionController$resolveCallServerInfoData$callServerInfoData$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
    public final /* synthetic */ C57m $session;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$resolveCallServerInfoData$callServerInfoData$1$1", f = "SessionController.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$resolveCallServerInfoData$callServerInfoData$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<String, HtJ<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return Boolean.valueOf(!C7BY.A0j(str));
        }

        @Override // X.G0V
        public final Object invoke(String str, HtJ<? super Boolean> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
            anonymousClass1.L$0 = str;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionController$resolveCallServerInfoData$callServerInfoData$1(C57m c57m, HtJ<? super SessionController$resolveCallServerInfoData$callServerInfoData$1> htJ) {
        super(2, htJ);
        this.$session = c57m;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SessionController$resolveCallServerInfoData$callServerInfoData$1(this.$session, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C10649I0t c10649I0t = new C10649I0t(((MetaAiRsysSdkRealTimeSession) this.$session).A0d, 2);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            obj = AbstractC9777Gfy.A01(this, anonymousClass1, c10649I0t);
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
        return new SessionController$resolveCallServerInfoData$callServerInfoData$1(this.$session, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
