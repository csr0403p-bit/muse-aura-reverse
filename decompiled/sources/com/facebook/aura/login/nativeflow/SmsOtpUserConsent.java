package com.facebook.aura.login.nativeflow;

import X.A6B;
import X.AbstractC05643uj;
import X.AbstractC07127nr;
import X.AbstractC4103Cmd;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C06827l3;
import X.C06847l8;
import X.C0881AGi;
import X.C1Lu;
import X.C20Q;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import X.C8fm;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HyO;
import X.HzP;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.facebook.aura.activation.view.AuraWaitlistConfettiKt;
import com.google.android.gms.common.api.Status;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import org.maplibre.android.R;

/* loaded from: classes5.dex */
public final class SmsOtpUserConsent {
    public static final int $stable = 0;
    public static final SmsOtpUserConsent INSTANCE = new SmsOtpUserConsent();

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.SmsOtpUserConsent$consentIntents$1", f = "SmsOtpUserConsent.kt", l = {AuraWaitlistConfettiKt.StandardParticleCount}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.SmsOtpUserConsent$consentIntents$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<HyO<? super Intent>, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* renamed from: com.facebook.aura.login.nativeflow.SmsOtpUserConsent$consentIntents$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02261 extends AbstractC7559F3s implements Function0<Unit> {
            public final /* synthetic */ HyO<Intent> $$this$callbackFlow;
            public final /* synthetic */ Context $context;
            public final /* synthetic */ SmsOtpUserConsent$consentIntents$1$receiver$1 $receiver;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C02261(HyO<? super Intent> hyO, Context context, SmsOtpUserConsent$consentIntents$1$receiver$1 smsOtpUserConsent$consentIntents$1$receiver$1) {
                super(0);
                this.$$this$callbackFlow = hyO;
                this.$context = context;
                this.$receiver = smsOtpUserConsent$consentIntents$1$receiver$1;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                try {
                    this.$context.unregisterReceiver(this.$receiver);
                } catch (Throwable th) {
                    C3cG.A0s(th);
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$context = context;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Type inference failed for: r5v0, types: [android.content.BroadcastReceiver, com.facebook.aura.login.nativeflow.SmsOtpUserConsent$consentIntents$1$receiver$1] */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            final HyO hyO = (HyO) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ?? r5 = new BroadcastReceiver() { // from class: com.facebook.aura.login.nativeflow.SmsOtpUserConsent$consentIntents$1$receiver$1
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        Bundle extras;
                        Status status;
                        if (!"com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent != null ? intent.getAction() : null) || (extras = intent.getExtras()) == null) {
                            return;
                        }
                        Object obj2 = extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
                        if ((obj2 instanceof Status) && (status = (Status) obj2) != null && status.A00 == 0) {
                            Object obj3 = extras.get("com.google.android.gms.auth.api.phone.EXTRA_CONSENT_INTENT");
                            if (!(obj3 instanceof Intent) || obj3 == null) {
                                return;
                            }
                            hyO.AhZ(obj3);
                        }
                    }
                };
                AbstractC4103Cmd.A05(r5, this.$context, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"), "com.google.android.gms.auth.api.phone.permission.SEND", 2);
                C02261 c02261 = new C02261(hyO, this.$context, r5);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (C8fm.A00(this, c02261, hyO) == enumC10460Hji) {
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
        public final Object invoke(HyO<? super Intent> hyO, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(hyO, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.SmsOtpUserConsent$extractCodes$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes3.dex */
    public final class C126461 extends AbstractC7559F3s implements G0U<C1Lu, String> {
        public static final C126461 INSTANCE = new C126461();

        public C126461() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ String invoke(C1Lu c1Lu) {
            C1Lu c1Lu2 = c1Lu;
            C7384Etj.A0Y(c1Lu2, 0);
            return C06847l8.A00((C06847l8) c1Lu2);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String invoke2(C1Lu c1Lu) {
            C7384Etj.A0Y(c1Lu, 0);
            return C06847l8.A00((C06847l8) c1Lu);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.SmsOtpUserConsent", f = "SmsOtpUserConsent.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop}, m = "startListening", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.SmsOtpUserConsent$startListening$1, reason: invalid class name and case insensitive filesystem */
    public final class C126471 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C126471(HtJ<? super C126471> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SmsOtpUserConsent.this.startListening(null, this);
        }
    }

    public final C20Q<Intent> consentIntents(Context context) {
        C7384Etj.A0Y(context, 0);
        return AbstractC05643uj.A00(new AnonymousClass1(context, null));
    }

    public final List<String> extractCodes(String str, int i) {
        if (str == null || C7BY.A0j(str)) {
            return C0881AGi.A00;
        }
        return A6B.A02(A6B.A08(C126461.INSTANCE, C06827l3.A00(str, C06827l3.A02(FGI.A0I("(?<!\\d)\\d{", i, "}(?!\\d)")))));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startListening(android.content.Context r7, X.HtJ<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.login.nativeflow.SmsOtpUserConsent.C126471
            if (r0 == 0) goto L1e
            r5 = r8
            com.facebook.aura.login.nativeflow.SmsOtpUserConsent$startListening$1 r5 = (com.facebook.aura.login.nativeflow.SmsOtpUserConsent.C126471) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r4 = 1
            if (r0 == 0) goto L2d
            if (r0 != r4) goto L28
            goto L24
        L1e:
            com.facebook.aura.login.nativeflow.SmsOtpUserConsent$startListening$1 r5 = new com.facebook.aura.login.nativeflow.SmsOtpUserConsent$startListening$1
            r5.<init>(r8)
            goto L12
        L24:
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L6f
            goto L6a
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r1)
            X.Cpp r3 = X.C4123CnP.A00     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L6f
            X.CuY r1 = X.C4123CnP.A01     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L6f
            java.lang.String r0 = "SmsRetriever.API"
            X.CrC r2 = new X.CrC     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L6f
            r2.<init>(r3, r1, r0)     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L6f
            X.CeV r1 = X.InterfaceC3786CeU.A00     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L6f
            X.Cs4 r0 = X.C4276Cs4.A02     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L6f
            X.CnP r3 = new X.CnP     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L6f
            r3.<init>(r7, r1, r2, r0)     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L6f
            r2 = 0
            X.Cqf r1 = X.C4232Cqg.A00()     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L6f
            X.CnI r0 = new X.CnI     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L6f
            r0.<init>()     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L6f
            r1.A01 = r0     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L6f
            com.google.android.gms.common.Feature r0 = X.AbstractC4122CnL.A03     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L6f
            com.google.android.gms.common.Feature[] r0 = new com.google.android.gms.common.Feature[]{r0}     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L6f
            r1.A03 = r0     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L6f
            r0 = 1568(0x620, float:2.197E-42)
            X.CSC r0 = X.AbstractC4178Com.A01(r3, r1, r0, r4)     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L6f
            r5.L$0 = r2     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L6f
            r5.label = r4     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L6f
            java.lang.Object r0 = X.AbstractC3001Brc.A00(r0, r5)     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L6f
            if (r0 != r6) goto L6a
            return r6
        L69:
            r4 = 0
        L6a:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        L6f:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.SmsOtpUserConsent.startListening(android.content.Context, X.HtJ):java.lang.Object");
    }
}
