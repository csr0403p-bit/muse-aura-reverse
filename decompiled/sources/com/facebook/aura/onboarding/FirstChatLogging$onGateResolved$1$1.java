package com.facebook.aura.onboarding;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass602;
import X.C20Z;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.F2X;
import X.G0V;
import X.Ht9;
import X.HtJ;
import X.Hwg;
import X.InterfaceC2349BUy;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

@DebugMetadata(c = "com.facebook.aura.onboarding.FirstChatLogging$onGateResolved$1$1", f = "FirstChatLogging.kt", l = {R.styleable.maplibre_MapView_maplibre_uiRotateGestures}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class FirstChatLogging$onGateResolved$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ FirstChatLogging this$0;

    /* renamed from: com.facebook.aura.onboarding.FirstChatLogging$onGateResolved$1$1$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 implements C20Z, InterfaceC2349BUy {
        public final /* synthetic */ FirstChatLogging $tmp0;

        public AnonymousClass1(FirstChatLogging firstChatLogging) {
            this.$tmp0 = firstChatLogging;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof C20Z) && (obj instanceof InterfaceC2349BUy)) {
                return C7384Etj.areEqual(getFunctionDelegate(), ((InterfaceC2349BUy) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // X.InterfaceC2349BUy
        public final Ht9<?> getFunctionDelegate() {
            return new F2X(2, this.$tmp0, FirstChatLogging.class, "onForegroundChanged", "onForegroundChanged(Z)V", 4);
        }

        @Override // X.C20Z
        public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
            this.$tmp0.onForegroundChanged(AnonymousClass001.A1X(obj));
            return Unit.INSTANCE;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final Object emit(boolean z, HtJ<? super Unit> htJ) {
            this.$tmp0.onForegroundChanged(z);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirstChatLogging$onGateResolved$1$1(FirstChatLogging firstChatLogging, HtJ<? super FirstChatLogging$onGateResolved$1$1> htJ) {
        super(2, htJ);
        this.this$0 = firstChatLogging;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new FirstChatLogging$onGateResolved$1$1(this.this$0, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new FirstChatLogging$onGateResolved$1$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AnonymousClass602 anonymousClass602A00 = AnonymousClass602.A00(AuraAppLifecycleManager.isAppInForegroundFlow);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            if (anonymousClass602A00.collect(anonymousClass1, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }
}
