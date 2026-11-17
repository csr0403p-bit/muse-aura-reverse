package com.facebook.aura.email.repo;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass007;
import X.C3UX;
import X.C9hr;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GAX;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.email.model.EmailOwnerVerification;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$ownerVerification$2", f = "EmailRepository.kt", l = {702}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class EmailRepository$verifyOwnerCode$$inlined$ownerVerification$1 extends AbstractC07127nr implements G0U<HtJ<? super EmailOwnerVerification>, Object> {
    public final /* synthetic */ Object $body;
    public final /* synthetic */ JarvisPath $endpoint;
    public final /* synthetic */ String $id;
    public int label;
    public final /* synthetic */ EmailRepository this$0;

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$ownerVerification$2$1", f = "EmailRepository.kt", l = {703, 939, 720}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$verifyOwnerCode$$inlined$ownerVerification$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super EmailOwnerVerification>, Object> {
        public final /* synthetic */ Object $body;
        public final /* synthetic */ JarvisPath $endpoint;
        public final /* synthetic */ String $id;
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;
        public final /* synthetic */ EmailRepository this$0;

        /* renamed from: com.facebook.aura.email.repo.EmailRepository$verifyOwnerCode$$inlined$ownerVerification$1$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01401 extends AbstractC7559F3s implements Function0<C9hr<EmailOwnerCodeRequestJson>> {
            public static final C01401 INSTANCE = new C01401();

            public C01401() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<EmailOwnerCodeRequestJson> invoke() {
                return EmailOwnerCodeRequestJson$$serializer.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ C9hr<EmailOwnerCodeRequestJson> invoke() {
                return EmailOwnerCodeRequestJson$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(EmailRepository emailRepository, String str, JarvisPath jarvisPath, Object obj, HtJ htJ) {
            super(2, htJ);
            this.this$0 = emailRepository;
            this.$id = str;
            this.$endpoint = jarvisPath;
            this.$body = obj;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.this$0, this.$id, this.$endpoint, this.$body, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1599executeJarvisRequestWithFof5HsY;
            EmailOwnerVerificationJson emailOwnerVerificationJson;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                EmailRepository emailRepository = this.this$0;
                String str = this.$id;
                this.label = 1;
                if (emailRepository.awaitGateway(str, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw AnonymousClass001.A0n();
                        }
                        emailOwnerVerificationJson = (EmailOwnerVerificationJson) this.L$0;
                        Hwg.A00(obj);
                        return emailOwnerVerificationJson.toDomain();
                    }
                    objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
                    Hwg.A00(objM1599executeJarvisRequestWithFof5HsY);
                    emailOwnerVerificationJson = (EmailOwnerVerificationJson) objM1599executeJarvisRequestWithFof5HsY;
                    EmailRepository emailRepository2 = this.this$0;
                    String str2 = this.$id;
                    this.L$0 = emailOwnerVerificationJson;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.label = 3;
                    emailRepository2.checkEnvironment(str2, this);
                    return emailOwnerVerificationJson.toDomain();
                }
                Hwg.A00(obj);
            }
            Set<Integer> setA0f = AnonymousClass007.A0f();
            C9jH c9jHA0E = AGH.A0E();
            C01401 c01401 = C01401.INSTANCE;
            EmailRepository$ownerVerification$2$1$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 emailRepository$ownerVerification$2$1$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = EmailRepository$ownerVerification$2$1$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.L$7 = null;
            this.L$8 = null;
            this.I$0 = 0;
            this.I$1 = 0;
            this.I$2 = 1;
            this.I$3 = 0;
            this.I$4 = 1;
            this.I$5 = 1;
            this.I$6 = 0;
            this.label = 2;
            objM1599executeJarvisRequestWithFof5HsY = HatchHttpApi.INSTANCE.m1599executeJarvisRequestWithFof5HsY(c01401, emailRepository$ownerVerification$2$1$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, false, this.$endpoint, this.$body, RequestType.POST, this.this$0.userSession, new Long(30L), null, new HxE[0], setA0f, false, false, c9jHA0E, null, true, false, true, true, null, false, this);
            if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                return enumC10460Hji;
            }
            Hwg.A00(objM1599executeJarvisRequestWithFof5HsY);
            emailOwnerVerificationJson = (EmailOwnerVerificationJson) objM1599executeJarvisRequestWithFof5HsY;
            EmailRepository emailRepository22 = this.this$0;
            String str22 = this.$id;
            this.L$0 = emailOwnerVerificationJson;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.L$7 = null;
            this.L$8 = null;
            this.label = 3;
            emailRepository22.checkEnvironment(str22, this);
            return emailOwnerVerificationJson.toDomain();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super EmailOwnerVerification> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailRepository$verifyOwnerCode$$inlined$ownerVerification$1(EmailRepository emailRepository, String str, JarvisPath jarvisPath, Object obj, HtJ htJ) {
        super(1, htJ);
        this.this$0 = emailRepository;
        this.$id = str;
        this.$endpoint = jarvisPath;
        this.$body = obj;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new EmailRepository$verifyOwnerCode$$inlined$ownerVerification$1(this.this$0, this.$id, this.$endpoint, this.$body, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$id, this.$endpoint, this.$body, null);
            this.label = 1;
            obj = GAX.A01(this, anonymousClass1, 30000L);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        if (obj != null) {
            return obj;
        }
        throw new NetworkException("Email verification timed out", -1, null, null, null, null, null);
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super EmailOwnerVerification> htJ) {
        return ((EmailRepository$verifyOwnerCode$$inlined$ownerVerification$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
