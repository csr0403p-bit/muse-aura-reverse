package com.facebook.aura.watchhandoff;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C06H;
import X.C10550Hrx;
import X.C3UX;
import X.C3cH;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.CSA;
import X.CSE;
import X.G0U;
import X.GAo;
import X.Hxb;
import X.InterfaceC7549F2g;
import com.facebook.aura.watchlink.WatchLinkResponse;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class WatchHandoffRenewal implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final C3UX scope;
    public final AbstractC3358CGz session;

    /* renamed from: com.facebook.aura.watchhandoff.WatchHandoffRenewal$answerAfterRenewal$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
        public final /* synthetic */ CSE<WatchLinkResponse> $response;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CSE<WatchLinkResponse> cse) {
            super(1);
            this.$response = cse;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            if (th != null) {
                this.$response.A01(new CancellationException("Watch renewal cancelled"));
            }
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        Hxb.A03(null, this.scope);
    }

    public final class Companion {
        public final WatchHandoffRenewal getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (WatchHandoffRenewal) abstractC3358CGz.A03(WatchHandoffRenewal.class, new WatchHandoffRenewal$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public WatchHandoffRenewal(AbstractC3358CGz abstractC3358CGz) {
        this.session = abstractC3358CGz;
        this.scope = C3cH.A0w();
    }

    public final CSA<WatchLinkResponse> answerAfterRenewal(String str, Function0<WatchLinkResponse> function0) {
        AnonymousClass003.A0u(str, function0);
        CSE cse = new CSE();
        C3UX c3ux = this.scope;
        WatchHandoffRenewal$answerAfterRenewal$renewal$1 watchHandoffRenewal$answerAfterRenewal$renewal$1 = new WatchHandoffRenewal$answerAfterRenewal$renewal$1(this, str, null);
        C6ys c6ys = C6ys.A00;
        Integer num = C79.A00;
        C10550Hrx c10550HrxA01 = GAo.A01(num, c6ys, watchHandoffRenewal$answerAfterRenewal$renewal$1, c3ux);
        GAo.A02(num, c6ys, new WatchHandoffRenewal$answerAfterRenewal$waiter$1(cse, function0, c10550HrxA01, null), this.scope).AO5(new AnonymousClass1(cse));
        return cse.A00;
    }

    public /* synthetic */ WatchHandoffRenewal(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
