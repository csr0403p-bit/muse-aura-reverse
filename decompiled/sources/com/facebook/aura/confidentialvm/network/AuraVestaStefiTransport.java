package com.facebook.aura.confidentialvm.network;

import X.ADl;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C3UX;
import X.C7384Etj;
import X.C78W;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.network.AuraHttpResponse;
import com.facebook.aura.network.api.StefiHatchPath;
import com.facebook.aura.network.stefi.AuraStefiClient;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraVestaStefiTransport {
    public final C3UX scope = C78W.A03();

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.network.AuraVestaStefiTransport$post$1", f = "AuraVestaStefiTransport.kt", l = {33}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.network.AuraVestaStefiTransport$post$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ADl $callback;
        public final /* synthetic */ Executor $executor;
        public final /* synthetic */ byte[] $jsonBody;
        public final /* synthetic */ String $path;
        public int label;
        public final /* synthetic */ AuraVestaStefiTransport this$0;

        /* renamed from: com.facebook.aura.confidentialvm.network.AuraVestaStefiTransport$post$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00851 extends AbstractC7559F3s implements Function0<Unit> {
            public final /* synthetic */ ADl $callback;
            public final /* synthetic */ AuraHttpResponse $response;
            public final /* synthetic */ AuraVestaStefiTransport this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00851(ADl aDl, AuraVestaStefiTransport auraVestaStefiTransport, AuraHttpResponse auraHttpResponse) {
                super(0);
                this.$callback = aDl;
                this.this$0 = auraVestaStefiTransport;
                this.$response = auraHttpResponse;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$callback.onFailure(this.this$0.transportFailure(this.$response));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.facebook.aura.confidentialvm.network.AuraVestaStefiTransport$post$1$2, reason: invalid class name */
        /* loaded from: classes6.dex */
        public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
            public final /* synthetic */ String $body;
            public final /* synthetic */ ADl $callback;
            public final /* synthetic */ AuraHttpResponse $response;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ADl aDl, AuraHttpResponse auraHttpResponse, String str) {
                super(0);
                this.$callback = aDl;
                this.$response = auraHttpResponse;
                this.$body = str;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(11:(2:81|19)|22|(1:24)|25|(6:85|27|30|(1:32)|33|(14:35|(1:37)|38|(1:40)|41|(2:47|(1:49)(1:50))|(2:73|54)(1:55)|58|(1:60)|61|(2:79|63)(1:64)|67|(1:69)|70))|75|51|38|(0)|41|(11:43|47|(0)(0)|(0)(0)|58|(0)|61|(0)(0)|67|(0)|70)(0)) */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x00b1, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x00b2, code lost:
            
                r10 = X.C3cG.A0s(r0);
             */
            /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x009f  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x00a8  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x00be  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x00c9  */
            /* JADX WARN: Removed duplicated region for block: B:64:0x00d5  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x00e0  */
            /* JADX WARN: Removed duplicated region for block: B:73:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:79:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void invoke2() {
                /*
                    Method dump skipped, instructions count: 249
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.network.AuraVestaStefiTransport.AnonymousClass1.AnonymousClass2.invoke2():void");
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, byte[] bArr, AuraVestaStefiTransport auraVestaStefiTransport, Executor executor, ADl aDl, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$path = str;
            this.$jsonBody = bArr;
            this.this$0 = auraVestaStefiTransport;
            this.$executor = executor;
            this.$callback = aDl;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$path, this.$jsonBody, this.this$0, this.$executor, this.$callback, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            AuraVestaStefiTransport auraVestaStefiTransport;
            Executor executor;
            Function0 auraVestaStefiTransport$post$1$response$1;
            Function0 anonymousClass2;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    AuraStefiClient auraStefiClient = AuraStefiClient.INSTANCE;
                    StefiHatchPath.Raw raw = new StefiHatchPath.Raw(this.$path);
                    byte[] bArr = this.$jsonBody;
                    C9jH c9jH = C9jH.A00;
                    this.label = 1;
                    obj = auraStefiClient.post(raw, AuraVestaStefiTransportKt.FRIENDLY_NAME, bArr, c9jH, "application/json", null, true, null, false, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                AuraHttpResponse auraHttpResponse = (AuraHttpResponse) obj;
                if (auraHttpResponse.code == -1) {
                    auraVestaStefiTransport = this.this$0;
                    executor = this.$executor;
                    anonymousClass2 = new C00851(this.$callback, auraVestaStefiTransport, auraHttpResponse);
                } else {
                    try {
                        String strBodyString = auraHttpResponse.bodyString();
                        if (strBodyString == null) {
                            strBodyString = "";
                        }
                        auraVestaStefiTransport = this.this$0;
                        executor = this.$executor;
                        anonymousClass2 = new AnonymousClass2(this.$callback, auraHttpResponse, strBodyString);
                    } catch (IOException e) {
                        auraVestaStefiTransport = this.this$0;
                        executor = this.$executor;
                        auraVestaStefiTransport$post$1$response$1 = new AuraVestaStefiTransport$post$1$body$1(this.$callback, e);
                        anonymousClass2 = auraVestaStefiTransport$post$1$response$1;
                        auraVestaStefiTransport.deliver(executor, anonymousClass2);
                        return Unit.INSTANCE;
                    }
                }
            } catch (CancellationException e2) {
                throw e2;
            } catch (Throwable th) {
                auraVestaStefiTransport = this.this$0;
                executor = this.$executor;
                auraVestaStefiTransport$post$1$response$1 = new AuraVestaStefiTransport$post$1$response$1(this.$callback, th);
            }
            auraVestaStefiTransport.deliver(executor, anonymousClass2);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public void post(String str, byte[] bArr, ADl aDl, Executor executor) {
        AnonymousClass005.A0x(str, bArr, aDl);
        AnonymousClass001.A1J(new AnonymousClass1(str, bArr, this, executor, aDl, null), this.scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deliver(Executor executor, final Function0<Unit> function0) {
        if (executor != null) {
            executor.execute(new Runnable(function0) { // from class: com.facebook.aura.confidentialvm.network.AuraVestaStefiTransportKt$sam$java_lang_Runnable$0
                public final /* synthetic */ Function0 function;

                {
                    C7384Etj.A0Y(function0, 0);
                    this.function = function0;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.function.invoke();
                }
            });
        } else {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable transportFailure(AuraHttpResponse auraHttpResponse) {
        Throwable th = auraHttpResponse.cause;
        if (th != null) {
            return th;
        }
        String str = auraHttpResponse.errorMessage;
        if (str == null) {
            str = "Vesta Stefi transport failed before receiving response";
        }
        return new IOException(str);
    }
}
