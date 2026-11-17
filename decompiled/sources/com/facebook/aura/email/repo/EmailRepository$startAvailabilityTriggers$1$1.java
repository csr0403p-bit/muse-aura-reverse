package com.facebook.aura.email.repo;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3rb;
import X.EnumC10460Hji;
import X.G0V;
import X.G2j;
import X.GDB;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$startAvailabilityTriggers$1$1", f = "EmailRepository.kt", l = {272}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class EmailRepository$startAvailabilityTriggers$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ EmailRepository this$0;

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$startAvailabilityTriggers$1$1$1", f = "EmailRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$startAvailabilityTriggers$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G2j<Boolean, HatchGatewayConnectionState, String, HtJ<? super String>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public /* synthetic */ boolean Z$0;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(4, htJ);
        }

        public final Object invoke(boolean z, HatchGatewayConnectionState hatchGatewayConnectionState, String str, HtJ<? super String> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
            anonymousClass1.Z$0 = z;
            anonymousClass1.L$0 = hatchGatewayConnectionState;
            anonymousClass1.L$1 = str;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            Object obj2 = this.L$0;
            Object obj3 = this.L$1;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            if (z && (obj2 instanceof HatchGatewayConnectionState.Connected)) {
                return obj3;
            }
            return null;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HatchGatewayConnectionState hatchGatewayConnectionState, String str, HtJ<? super String> htJ) {
            return invoke(AnonymousClass001.A1X(bool), hatchGatewayConnectionState, str, htJ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailRepository$startAvailabilityTriggers$1$1(EmailRepository emailRepository, HtJ<? super EmailRepository$startAvailabilityTriggers$1$1> htJ) {
        super(2, htJ);
        this.this$0 = emailRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new EmailRepository$startAvailabilityTriggers$1$1(this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C20Q c20qA01 = GDB.A01(C3rb.A00(new AnonymousClass1(null), AuraAppLifecycleManager.isAppInForegroundFlow, this.this$0.getConnectionState(), this.this$0.prefs.hatcheryVmIdFlow));
            final EmailRepository emailRepository = this.this$0;
            C20Z c20z = new C20Z() { // from class: com.facebook.aura.email.repo.EmailRepository$startAvailabilityTriggers$1$1.2
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((String) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(String str, HtJ<? super Unit> htJ) {
                    Object objRefreshAvailability;
                    if (str != null && (objRefreshAvailability = emailRepository.refreshAvailability(str, htJ)) == EnumC10460Hji.A02) {
                        return objRefreshAvailability;
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (c20qA01.collect(c20z, this) == enumC10460Hji) {
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

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new EmailRepository$startAvailabilityTriggers$1$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
