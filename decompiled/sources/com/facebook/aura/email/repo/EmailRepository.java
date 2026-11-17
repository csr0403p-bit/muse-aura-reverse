package com.facebook.aura.email.repo;

import X.ADq;
import X.AGH;
import X.AGI;
import X.AHD;
import X.AbstractC05643uj;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BFI;
import X.BGK;
import X.BLG;
import X.BzK;
import X.C06H;
import X.C1BN;
import X.C20Q;
import X.C27i;
import X.C3Pi;
import X.C3UX;
import X.C4oT;
import X.C7384Etj;
import X.C78T;
import X.C7BY;
import X.C8eM;
import X.C8eO;
import X.C9286GCn;
import X.C9jH;
import X.EnumC10460Hji;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAo;
import X.GCQ;
import X.HnJ;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.Hxb;
import X.HyO;
import X.HzP;
import X.HzS;
import X.InterfaceC7549F2g;
import android.content.Context;
import com.facebook.aura.auth.credentialmanager.MC;
import com.facebook.aura.avatarassets.appearance.MC;
import com.facebook.aura.browsertask.control.BrowserTaskStopKt;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import com.facebook.aura.common.prefs.HatchPrefsStore;
import com.facebook.aura.components.reactions.AuraScatterKt;
import com.facebook.aura.email.model.EmailAddressAvailability;
import com.facebook.aura.email.model.EmailAttachment;
import com.facebook.aura.email.model.EmailAttachmentFile;
import com.facebook.aura.email.model.EmailMailbox;
import com.facebook.aura.email.model.EmailMessage;
import com.facebook.aura.email.model.EmailOwnerVerification;
import com.facebook.aura.email.model.EmailPage;
import com.facebook.aura.email.model.EmailPermissions;
import com.facebook.aura.email.model.EmailSendPermission;
import com.facebook.aura.email.model.EmailSender;
import com.facebook.aura.email.model.EmailSettings;
import com.facebook.aura.email.model.EmailSetup;
import com.facebook.aura.email.model.EmailSummary;
import com.facebook.aura.email.model.EmailThread;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.utils.HatchUtils;
import com.facebook.aura.utils.MC;
import com.facebook.aura.utils.MuseMailAvailability;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class EmailRepository implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public static final String EMAIL_INVALID_HANDLE = "email_invalid_handle";
    public static final String EMAIL_NOT_ENABLED = "email_not_enabled";
    public static final String MUSE_MAIL_CONNECTOR = "muse_mail";
    public static final int SENDER_PAGE_SIZE = 50;
    public static final int THREAD_PAGE_SIZE = 50;
    public final BLG<Map<String, Integer>> _invalidations;
    public final C8eM attachmentRequests;
    public final MuseMailAvailability availability;
    public final C3UX availabilityScope;
    public HoC availabilityTriggers;
    public volatile boolean closed;
    public final Set<String> creatingMailboxes;
    public final C1BN<Map<String, Integer>> invalidations;
    public final Map<String, String> pendingResets;
    public final HatchGatewayPrefsStore prefs;
    public final Object requestLock;
    public final Map<HoC, String> requests;
    public final Map<String, HoC> resetJobs;
    public final C4oT resetPrefs;
    public final SingleFlight setupEndFlight;
    public final C3UX setupEndScope;
    public boolean stubAutoForward;
    public final Object stubLock;
    public final AbstractC3358CGz userSession;
    public final SingleFlight verificationFlight;

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$accountEmailAddresses$2", f = "EmailRepository.kt", l = {933}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$accountEmailAddresses$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0U<HtJ<? super List<? extends String>>, Object> {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(1, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new AnonymousClass2(htJ);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(HtJ<? super List<String>> htJ) {
            return new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [X.Hji] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1596executeBodylessStefiRequestWithtZkwj4A;
            Object objA0i = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                EmailPath emailPath = new EmailPath(EmailEndpoint.ACCOUNT_EMAILS);
                RequestType requestType = RequestType.GET;
                C9jH c9jHA0E = AGH.A0E();
                EmailRepository$accountEmailAddresses$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1 emailRepository$accountEmailAddresses$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1 = EmailRepository$accountEmailAddresses$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 1;
                objM1596executeBodylessStefiRequestWithtZkwj4A = hatchHttpApi.m1596executeBodylessStefiRequestWithtZkwj4A(emailRepository$accountEmailAddresses$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1, false, emailPath, requestType, null, null, c9jHA0E, c9jHA0E, this);
                if (objM1596executeBodylessStefiRequestWithtZkwj4A != objA0i) {
                }
                return objA0i;
            }
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1596executeBodylessStefiRequestWithtZkwj4A = AnonymousClass001.A0q(obj);
            Hwg.A00(objM1596executeBodylessStefiRequestWithtZkwj4A);
            List<EmailAccountAddressJson> list = ((EmailAccountAddressesJson) objM1596executeBodylessStefiRequestWithtZkwj4A).emails;
            objA0i = AnonymousClass003.A0i(list);
            Iterator<EmailAccountAddressJson> it = list.iterator();
            while (it.hasNext()) {
                objA0i.add(it.next().email_address);
            }
            return objA0i;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Object invoke(HtJ<? super List<? extends String>> htJ) {
            return invoke2((HtJ<? super List<String>>) htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$addressAvailability$2", f = "EmailRepository.kt", l = {346, 940, 354}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$addressAvailability$2, reason: invalid class name and case insensitive filesystem */
    public final class C117122 extends AbstractC07127nr implements G0U<HtJ<? super EmailAddressAvailability>, Object> {
        public final /* synthetic */ String $domain;
        public final /* synthetic */ String $handle;
        public final /* synthetic */ String $id;
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117122(String str, String str2, String str3, HtJ<? super C117122> htJ) {
            super(1, htJ);
            this.$id = str;
            this.$handle = str2;
            this.$domain = str3;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return EmailRepository.this.new C117122(this.$id, this.$handle, this.$domain, htJ);
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x00b4, code lost:
        
            if (r6.awaitGateway(r0, r22) == r3) goto L46;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0136  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 321
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailRepository.C117122.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super EmailAddressAvailability> htJ) {
            return ((C117122) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$attachmentFile$1", f = "EmailRepository.kt", l = {141}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$attachmentFile$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<HyO<? super EmailAttachmentFile>, HtJ<? super Unit>, Object> {
        public final /* synthetic */ int $attachmentIndex;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $id;
        public final /* synthetic */ String $messageId;
        public /* synthetic */ Object L$0;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$attachmentFile$1$1", f = "EmailRepository.kt", l = {142}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.email.repo.EmailRepository$attachmentFile$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01411 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public final /* synthetic */ HyO<EmailAttachmentFile> $$this$channelFlow;
            public final /* synthetic */ int $attachmentIndex;
            public final /* synthetic */ Context $context;
            public final /* synthetic */ String $id;
            public final /* synthetic */ String $messageId;
            public int label;
            public final /* synthetic */ EmailRepository this$0;

            @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$attachmentFile$1$1$1", f = "EmailRepository.kt", l = {143, 938, 149, 154, 162, 168}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.email.repo.EmailRepository$attachmentFile$1$1$1, reason: invalid class name and collision with other inner class name */
            public final class C01421 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
                public final /* synthetic */ HyO<EmailAttachmentFile> $$this$channelFlow;
                public final /* synthetic */ int $attachmentIndex;
                public final /* synthetic */ Context $context;
                public final /* synthetic */ String $id;
                public final /* synthetic */ String $messageId;
                public Object L$0;
                public Object L$1;
                public Object L$2;
                public Object L$3;
                public Object L$4;
                public Object L$5;
                public Object L$6;
                public int label;
                public final /* synthetic */ EmailRepository this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C01421(EmailRepository emailRepository, String str, String str2, Context context, HyO<? super EmailAttachmentFile> hyO, int i, HtJ<? super C01421> htJ) {
                    super(2, htJ);
                    this.this$0 = emailRepository;
                    this.$id = str;
                    this.$messageId = str2;
                    this.$context = context;
                    this.$$this$channelFlow = hyO;
                    this.$attachmentIndex = i;
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    return new C01421(this.this$0, this.$id, this.$messageId, this.$context, this.$$this$channelFlow, this.$attachmentIndex, htJ);
                }

                /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
                    	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
                    	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
                    	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
                    	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
                    	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
                    	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
                    */
                /* JADX WARN: Not initialized variable reg: 5, insn: 0x01be: INVOKE (r5 I:java.io.File) VIRTUAL call: java.io.File.delete():boolean A[MD:():boolean (c)] (LINE:446), block:B:72:0x01be */
                @Override // X.AbstractC8884Fsp
                public final java.lang.Object invokeSuspend(java.lang.Object r16) {
                    /*
                        Method dump skipped, instructions count: 468
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailRepository.AnonymousClass1.C01411.C01421.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // X.G0V
                public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                    return ((C01421) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C01411(EmailRepository emailRepository, String str, String str2, Context context, HyO<? super EmailAttachmentFile> hyO, int i, HtJ<? super C01411> htJ) {
                super(1, htJ);
                this.this$0 = emailRepository;
                this.$id = str;
                this.$messageId = str2;
                this.$context = context;
                this.$$this$channelFlow = hyO;
                this.$attachmentIndex = i;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C01411(this.this$0, this.$id, this.$messageId, this.$context, this.$$this$channelFlow, this.$attachmentIndex, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    C78T c78tA0s = AnonymousClass002.A0s(obj);
                    C01421 c01421 = new C01421(this.this$0, this.$id, this.$messageId, this.$context, this.$$this$channelFlow, this.$attachmentIndex, null);
                    this.label = 1;
                    if (GAo.A00(this, c78tA0s, c01421) == enumC10460Hji) {
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

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return ((C01411) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, Context context, int i, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$id = str;
            this.$messageId = str2;
            this.$context = context;
            this.$attachmentIndex = i;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = EmailRepository.this.new AnonymousClass1(this.$id, this.$messageId, this.$context, this.$attachmentIndex, htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HyO hyO = (HyO) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                EmailRepository emailRepository = EmailRepository.this;
                String str = this.$id;
                C01411 c01411 = new C01411(emailRepository, str, this.$messageId, this.$context, hyO, this.$attachmentIndex, null);
                this.L$0 = null;
                this.label = 1;
                if (EmailRepository.perform$default(emailRepository, str, false, false, c01411, this, 6, null) == enumC10460Hji) {
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
        public final Object invoke(HyO<? super EmailAttachmentFile> hyO, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(hyO, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository", f = "EmailRepository.kt", l = {100}, m = "attachmentPreview", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$attachmentPreview$1, reason: invalid class name and case insensitive filesystem */
    public final class C117131 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C117131(HtJ<? super C117131> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EmailRepository.this.attachmentPreview(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$autoForwardStub$2", f = "EmailRepository.kt", l = {891}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$autoForwardStub$2, reason: invalid class name and case insensitive filesystem */
    public final class C117142 extends AbstractC07127nr implements G0U<HtJ<? super Boolean>, Object> {
        public final /* synthetic */ String $id;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117142(String str, HtJ<? super C117142> htJ) {
            super(1, htJ);
            this.$id = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return EmailRepository.this.new C117142(this.$id, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Boolean boolValueOf;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                EmailRepository emailRepository = EmailRepository.this;
                String str = this.$id;
                this.label = 1;
                emailRepository.checkEnvironment(str, this);
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            EmailRepository emailRepository2 = EmailRepository.this;
            synchronized (emailRepository2.stubLock) {
                boolValueOf = Boolean.valueOf(emailRepository2.stubAutoForward);
            }
            return boolValueOf;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Boolean> htJ) {
            return ((C117142) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository", f = "EmailRepository.kt", l = {322, 323, 324}, m = "awaitGateway", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$awaitGateway$1, reason: invalid class name and case insensitive filesystem */
    public final class C117151 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C117151(HtJ<? super C117151> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EmailRepository.this.awaitGateway(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$create$2", f = "EmailRepository.kt", l = {MC.xe_feta_entrypoint_rl.__CONFIG__, 964, 388, 394}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$create$2, reason: invalid class name and case insensitive filesystem */
    public final class C117162 extends AbstractC07127nr implements G0U<HtJ<? super EmailMailbox>, Object> {
        public final /* synthetic */ String $handle;
        public final /* synthetic */ String $id;
        public final /* synthetic */ String $name;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117162(String str, String str2, String str3, HtJ<? super C117162> htJ) {
            super(1, htJ);
            this.$id = str;
            this.$handle = str2;
            this.$name = str3;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return EmailRepository.this.new C117162(this.$id, this.$handle, this.$name, htJ);
        }

        /* JADX WARN: Code restructure failed: missing block: B:41:0x0110, code lost:
        
            if (r3 < 500) goto L48;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00f6  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r34) {
            /*
                Method dump skipped, instructions count: 313
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailRepository.C117162.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super EmailMailbox> htJ) {
            return ((C117162) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$deleteMailbox$2", f = "EmailRepository.kt", l = {483, 491, 495, 942, BrowserTaskStopKt.HTTP_SERVICE_UNAVAILABLE, 510, 519}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$deleteMailbox$2, reason: invalid class name and case insensitive filesystem */
    public final class C117172 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ EmailMailbox $expectedMailbox;
        public final /* synthetic */ String $id;
        public int I$0;
        public int I$1;
        public int I$2;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117172(String str, EmailMailbox emailMailbox, HtJ<? super C117172> htJ) {
            super(2, htJ);
            this.$id = str;
            this.$expectedMailbox = emailMailbox;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return EmailRepository.this.new C117172(this.$id, this.$expectedMailbox, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[Catch: all -> 0x019f, TRY_ENTER, TryCatch #4 {, blocks: (B:67:0x0169, B:14:0x0044, B:16:0x004c, B:18:0x0054, B:80:0x0197, B:81:0x019e, B:76:0x0189, B:6:0x0013, B:8:0x001c, B:72:0x0180, B:62:0x0142, B:46:0x0104, B:47:0x0107, B:49:0x0110, B:50:0x0117, B:21:0x0061, B:25:0x0074, B:27:0x0078, B:28:0x007a, B:30:0x007e, B:31:0x0080, B:37:0x008d, B:41:0x00a2, B:45:0x00e7, B:52:0x0119, B:71:0x0179, B:24:0x0071, B:40:0x009f, B:44:0x00e3), top: B:86:0x000b, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0078 A[Catch: all -> 0x0181, TryCatch #1 {all -> 0x0181, blocks: (B:6:0x0013, B:8:0x001c, B:72:0x0180, B:62:0x0142, B:46:0x0104, B:47:0x0107, B:49:0x0110, B:50:0x0117, B:21:0x0061, B:25:0x0074, B:27:0x0078, B:28:0x007a, B:30:0x007e, B:31:0x0080, B:37:0x008d, B:41:0x00a2, B:45:0x00e7, B:52:0x0119, B:71:0x0179, B:24:0x0071, B:40:0x009f, B:44:0x00e3), top: B:86:0x000b, outer: #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x007e A[Catch: all -> 0x0181, TryCatch #1 {all -> 0x0181, blocks: (B:6:0x0013, B:8:0x001c, B:72:0x0180, B:62:0x0142, B:46:0x0104, B:47:0x0107, B:49:0x0110, B:50:0x0117, B:21:0x0061, B:25:0x0074, B:27:0x0078, B:28:0x007a, B:30:0x007e, B:31:0x0080, B:37:0x008d, B:41:0x00a2, B:45:0x00e7, B:52:0x0119, B:71:0x0179, B:24:0x0071, B:40:0x009f, B:44:0x00e3), top: B:86:0x000b, outer: #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00e2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0110 A[Catch: Exception -> 0x0118, CancellationException -> 0x0140, all -> 0x0181, TryCatch #0 {CancellationException -> 0x0140, blocks: (B:8:0x001c, B:46:0x0104, B:47:0x0107, B:49:0x0110, B:50:0x0117, B:37:0x008d, B:41:0x00a2, B:45:0x00e7, B:52:0x0119, B:40:0x009f, B:44:0x00e3), top: B:86:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0161 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0169 A[Catch: all -> 0x019f, TRY_ENTER, TRY_LEAVE, TryCatch #4 {, blocks: (B:67:0x0169, B:14:0x0044, B:16:0x004c, B:18:0x0054, B:80:0x0197, B:81:0x019e, B:76:0x0189, B:6:0x0013, B:8:0x001c, B:72:0x0180, B:62:0x0142, B:46:0x0104, B:47:0x0107, B:49:0x0110, B:50:0x0117, B:21:0x0061, B:25:0x0074, B:27:0x0078, B:28:0x007a, B:30:0x007e, B:31:0x0080, B:37:0x008d, B:41:0x00a2, B:45:0x00e7, B:52:0x0119, B:71:0x0179, B:24:0x0071, B:40:0x009f, B:44:0x00e3), top: B:86:0x000b, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0179 A[Catch: all -> 0x0181, TRY_ENTER, TryCatch #1 {all -> 0x0181, blocks: (B:6:0x0013, B:8:0x001c, B:72:0x0180, B:62:0x0142, B:46:0x0104, B:47:0x0107, B:49:0x0110, B:50:0x0117, B:21:0x0061, B:25:0x0074, B:27:0x0078, B:28:0x007a, B:30:0x007e, B:31:0x0080, B:37:0x008d, B:41:0x00a2, B:45:0x00e7, B:52:0x0119, B:71:0x0179, B:24:0x0071, B:40:0x009f, B:44:0x00e3), top: B:86:0x000b, outer: #4 }] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 438
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailRepository.C117172.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C117172) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository", f = "EmailRepository.kt", l = {628}, m = "deleteMessage", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$deleteMessage$1, reason: invalid class name and case insensitive filesystem */
    public final class C117181 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C117181(HtJ<? super C117181> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EmailRepository.this.deleteMessage(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$deleteMessage$2", f = "EmailRepository.kt", l = {629, 940, 637}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$deleteMessage$2, reason: invalid class name and case insensitive filesystem */
    public final class C117192 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $id;
        public final /* synthetic */ String $messageId;
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117192(String str, String str2, HtJ<? super C117192> htJ) {
            super(1, htJ);
            this.$id = str;
            this.$messageId = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return EmailRepository.this.new C117192(this.$id, this.$messageId, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                r21 = this;
                X.Hji r1 = X.EnumC10460Hji.A02
                r5 = r21
                int r6 = r5.label
                java.lang.String r3 = "Check failed."
                r4 = 3
                r2 = 2
                r0 = 1
                if (r6 == 0) goto L24
                if (r6 == r0) goto L34
                if (r6 == r2) goto L84
                if (r6 != r4) goto La8
                java.lang.Object r6 = r5.L$0
                X.Hwg.A00(r22)
            L18:
                X.Hwg.A00(r6)
                com.facebook.aura.email.repo.EmailDeletedJson r6 = (com.facebook.aura.email.repo.EmailDeletedJson) r6
                boolean r0 = r6.deleted
                if (r0 == 0) goto La2
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L24:
                X.Hwg.A00(r22)
                com.facebook.aura.email.repo.EmailRepository r7 = com.facebook.aura.email.repo.EmailRepository.this
                java.lang.String r6 = r5.$id
                r5.label = r0
                java.lang.Object r6 = com.facebook.aura.email.repo.EmailRepository.access$awaitGateway(r7, r6, r5)
                if (r6 != r1) goto L37
                return r1
            L34:
                X.Hwg.A00(r22)
            L37:
                com.facebook.aura.utils.HatchUtils r6 = com.facebook.aura.utils.HatchUtils.INSTANCE
                boolean r6 = r6.isEmailDeleteEnabled()
                if (r6 == 0) goto Lad
                com.facebook.aura.network.http.HatchHttpApi r7 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
                java.lang.String r6 = r5.$messageId
                com.facebook.aura.email.repo.EmailDaemonMessagePath r10 = new com.facebook.aura.email.repo.EmailDaemonMessagePath
                r10.<init>(r6)
                com.facebook.aura.network.http.RequestType r11 = com.facebook.aura.network.http.RequestType.DELETE
                com.facebook.aura.email.repo.EmailRepository r6 = com.facebook.aura.email.repo.EmailRepository.this
                X.CGz r12 = r6.userSession
                r9 = 0
                X.HxE[] r14 = new X.HxE[r9]
                java.util.Set r16 = X.AnonymousClass004.A18()
                X.9jH r18 = X.AGH.A0E()
                com.facebook.aura.email.repo.EmailRepository$deleteMessage$2$invokeSuspend$$inlined$executeJarvisRequest-1iavgos$default$1 r8 = com.facebook.aura.email.repo.EmailRepository$deleteMessage$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
                r13 = 0
                r5.L$0 = r13
                r5.L$1 = r13
                r5.L$2 = r13
                r5.L$3 = r13
                r5.L$4 = r13
                r5.L$5 = r13
                r5.L$6 = r13
                r5.I$0 = r0
                r5.I$1 = r0
                r5.I$2 = r9
                r5.label = r2
                r15 = r13
                r19 = r0
                r20 = r13
                r21 = r9
                r22 = r5
                r17 = r0
                java.lang.Object r6 = r7.m1595executeBodylessJarvisRequestWithp3iPjrY(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                if (r6 != r1) goto L88
                return r1
            L84:
                java.lang.Object r6 = X.AnonymousClass002.A0j(r22)
            L88:
                com.facebook.aura.email.repo.EmailRepository r2 = com.facebook.aura.email.repo.EmailRepository.this
                java.lang.String r1 = r5.$id
                r5.L$0 = r6
                r0 = 0
                r5.L$1 = r0
                r5.L$2 = r0
                r5.L$3 = r0
                r5.L$4 = r0
                r5.L$5 = r0
                r5.L$6 = r0
                r5.label = r4
                com.facebook.aura.email.repo.EmailRepository.access$checkEnvironment(r2, r1, r5)
                goto L18
            La2:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>(r3)
                throw r0
            La8:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            Lad:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailRepository.C117192.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C117192) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository", f = "EmailRepository.kt", l = {926, 183}, m = "downloadAttachment", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$downloadAttachment$1, reason: invalid class name and case insensitive filesystem */
    public final class C117201 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C117201(HtJ<? super C117201> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EmailRepository.this.downloadAttachment(null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository", f = "EmailRepository.kt", l = {217, 940, 226}, m = "fetchAttachment", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$fetchAttachment$1, reason: invalid class name and case insensitive filesystem */
    public final class C117211 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public C117211(HtJ<? super C117211> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EmailRepository.this.fetchAttachment(null, null, null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository", f = "EmailRepository.kt", l = {308, 940, 315}, m = "fetchMailbox", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$fetchMailbox$1, reason: invalid class name and case insensitive filesystem */
    public final class C117221 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;
        public /* synthetic */ Object result;

        public C117221(HtJ<? super C117221> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EmailRepository.this.fetchMailbox(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository", f = "EmailRepository.kt", l = {829, 833}, m = "fetchPermissions", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$fetchPermissions$1, reason: invalid class name and case insensitive filesystem */
    public final class C117231 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C117231(HtJ<? super C117231> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EmailRepository.this.fetchPermissions(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository", f = "EmailRepository.kt", l = {659, 943, 669}, m = "fetchSenders", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$fetchSenders$1, reason: invalid class name and case insensitive filesystem */
    public final class C117241 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
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
        public /* synthetic */ Object result;

        public C117241(HtJ<? super C117241> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EmailRepository.this.fetchSenders(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository", f = "EmailRepository.kt", l = {845}, m = "hasActiveSender", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$hasActiveSender$1, reason: invalid class name and case insensitive filesystem */
    public final class C117251 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C117251(HtJ<? super C117251> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EmailRepository.this.hasActiveSender(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$mailbox$2", f = "EmailRepository.kt", l = {305}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$mailbox$2, reason: invalid class name and case insensitive filesystem */
    public final class C117262 extends AbstractC07127nr implements G0U<HtJ<? super EmailMailbox>, Object> {
        public final /* synthetic */ String $id;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117262(String str, HtJ<? super C117262> htJ) {
            super(1, htJ);
            this.$id = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return EmailRepository.this.new C117262(this.$id, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                EmailRepository emailRepository = EmailRepository.this;
                String str = this.$id;
                this.label = 1;
                obj = emailRepository.fetchMailbox(str, this);
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

        @Override // X.G0U
        public final Object invoke(HtJ<? super EmailMailbox> htJ) {
            return ((C117262) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository", f = "EmailRepository.kt", l = {478, 479}, m = "mailboxForReset", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$mailboxForReset$1, reason: invalid class name and case insensitive filesystem */
    public final class C117271 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C117271(HtJ<? super C117271> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EmailRepository.this.mailboxForReset(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$mailboxForReset$2", f = "EmailRepository.kt", l = {479}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$mailboxForReset$2, reason: invalid class name and case insensitive filesystem */
    public final class C117282 extends AbstractC07127nr implements G0U<HtJ<? super EmailMailbox>, Object> {
        public final /* synthetic */ String $id;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117282(String str, HtJ<? super C117282> htJ) {
            super(1, htJ);
            this.$id = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return EmailRepository.this.new C117282(this.$id, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                EmailRepository emailRepository = EmailRepository.this;
                String str = this.$id;
                this.label = 1;
                obj = emailRepository.fetchMailbox(str, this);
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

        @Override // X.G0U
        public final Object invoke(HtJ<? super EmailMailbox> htJ) {
            return ((C117282) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$message$2", f = "EmailRepository.kt", l = {644, 940, 651, 652}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$message$2, reason: invalid class name and case insensitive filesystem */
    public final class C117292 extends AbstractC07127nr implements G0U<HtJ<? super EmailMessage>, Object> {
        public final /* synthetic */ String $id;
        public final /* synthetic */ String $messageId;
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$message$2$1", f = "EmailRepository.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.email.repo.EmailRepository$message$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super EmailMessage>, Object> {
            public final /* synthetic */ Object $result;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Object obj, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.$result = obj;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(this.$result, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                Object obj2 = this.$result;
                Hwg.A00(obj2);
                return ((EmailMessageJson) obj2).toDomain();
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super EmailMessage> htJ) {
                return new AnonymousClass1(this.$result, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117292(String str, String str2, HtJ<? super C117292> htJ) {
            super(1, htJ);
            this.$id = str;
            this.$messageId = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return EmailRepository.this.new C117292(this.$id, this.$messageId, htJ);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        
            if (r7.awaitGateway(r6, r21) == r3) goto L14;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00ab A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                r21 = this;
                X.Hji r3 = X.EnumC10460Hji.A02
                r4 = r21
                int r6 = r4.label
                r5 = 4
                r2 = 3
                r1 = 2
                r0 = 1
                r13 = 0
                if (r6 == 0) goto L1e
                if (r6 == r0) goto L2e
                if (r6 == r1) goto L75
                if (r6 == r2) goto L91
                if (r6 != r5) goto L19
                X.Hwg.A00(r22)
                return r22
            L19:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L1e:
                X.Hwg.A00(r22)
                com.facebook.aura.email.repo.EmailRepository r7 = com.facebook.aura.email.repo.EmailRepository.this
                java.lang.String r6 = r4.$id
                r4.label = r0
                java.lang.Object r6 = com.facebook.aura.email.repo.EmailRepository.access$awaitGateway(r7, r6, r4)
                if (r6 != r3) goto L31
            L2d:
                return r3
            L2e:
                X.Hwg.A00(r22)
            L31:
                com.facebook.aura.network.http.HatchHttpApi r7 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
                java.lang.String r6 = r4.$messageId
                com.facebook.aura.email.repo.EmailDaemonMessagePath r10 = new com.facebook.aura.email.repo.EmailDaemonMessagePath
                r10.<init>(r6)
                com.facebook.aura.network.http.RequestType r11 = com.facebook.aura.network.http.RequestType.GET
                com.facebook.aura.email.repo.EmailRepository r6 = com.facebook.aura.email.repo.EmailRepository.this
                X.CGz r12 = r6.userSession
                r9 = 0
                X.HxE[] r14 = new X.HxE[r9]
                java.util.Set r16 = X.AnonymousClass004.A18()
                X.9jH r18 = X.AGH.A0E()
                com.facebook.aura.email.repo.EmailRepository$message$2$invokeSuspend$$inlined$executeJarvisRequest-1iavgos$default$1 r8 = com.facebook.aura.email.repo.EmailRepository$message$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
                r4.L$0 = r13
                r4.L$1 = r13
                r4.L$2 = r13
                r4.L$3 = r13
                r4.L$4 = r13
                r4.L$5 = r13
                r4.L$6 = r13
                r4.I$0 = r0
                r4.I$1 = r0
                r4.I$2 = r9
                r4.label = r1
                r15 = r13
                r19 = r0
                r20 = r13
                r21 = r9
                r22 = r4
                r17 = r0
                java.lang.Object r6 = r7.m1595executeBodylessJarvisRequestWithp3iPjrY(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                if (r6 != r3) goto L79
                return r3
            L75:
                java.lang.Object r6 = X.AnonymousClass002.A0j(r22)
            L79:
                com.facebook.aura.email.repo.EmailRepository r1 = com.facebook.aura.email.repo.EmailRepository.this
                java.lang.String r0 = r4.$id
                r4.L$0 = r6
                r4.L$1 = r13
                r4.L$2 = r13
                r4.L$3 = r13
                r4.L$4 = r13
                r4.L$5 = r13
                r4.L$6 = r13
                r4.label = r2
                com.facebook.aura.email.repo.EmailRepository.access$checkEnvironment(r1, r0, r4)
                goto L96
            L91:
                java.lang.Object r6 = r4.L$0
                X.Hwg.A00(r22)
            L96:
                com.facebook.aura.executors.AuraDispatchers r0 = com.facebook.aura.executors.AuraDispatchers.INSTANCE
                X.78T r1 = r0.m764default()
                com.facebook.aura.email.repo.EmailRepository$message$2$1 r0 = new com.facebook.aura.email.repo.EmailRepository$message$2$1
                r0.<init>(r6, r13)
                r4.L$0 = r13
                r4.label = r5
                java.lang.Object r0 = X.GAo.A00(r4, r1, r0)
                if (r0 == r3) goto L2d
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailRepository.C117292.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super EmailMessage> htJ) {
            return ((C117292) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$ownerVerification$2", f = "EmailRepository.kt", l = {702}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$ownerVerification$2, reason: invalid class name and case insensitive filesystem */
    public final class C117302 extends AbstractC07127nr implements G0U<HtJ<? super EmailOwnerVerification>, Object> {
        public final /* synthetic */ T $body;
        public final /* synthetic */ JarvisPath $endpoint;
        public final /* synthetic */ String $id;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$ownerVerification$2$1", f = "EmailRepository.kt", l = {703, 939, 720}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.email.repo.EmailRepository$ownerVerification$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super EmailOwnerVerification>, Object> {
            public final /* synthetic */ T $body;
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(EmailRepository emailRepository, String str, JarvisPath jarvisPath, T t, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.this$0 = emailRepository;
                this.$id = str;
                this.$endpoint = jarvisPath;
                this.$body = t;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(this.this$0, this.$id, this.$endpoint, this.$body, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
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
                        if (i == 2) {
                            Object objA0j = AnonymousClass002.A0j(obj);
                            Hwg.A00(objA0j);
                            emailOwnerVerificationJson = (EmailOwnerVerificationJson) objA0j;
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
                        } else {
                            if (i != 3) {
                                throw AnonymousClass001.A0n();
                            }
                            emailOwnerVerificationJson = (EmailOwnerVerificationJson) this.L$0;
                            Hwg.A00(obj);
                        }
                        return emailOwnerVerificationJson.toDomain();
                    }
                    Hwg.A00(obj);
                }
                BFI.A0H(new Integer[]{new Integer(200), new Integer(201), new Integer(400), new Integer(403), new Integer(404), new Integer(409), new Integer(410), new Integer(429)});
                C7384Etj.A0P();
                throw F60.createAndThrow();
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super EmailOwnerVerification> htJ) {
                return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117302(String str, JarvisPath jarvisPath, T t, HtJ<? super C117302> htJ) {
            super(1, htJ);
            this.$id = str;
            this.$endpoint = jarvisPath;
            this.$body = t;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return EmailRepository.this.new C117302(this.$id, this.$endpoint, this.$body, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C7384Etj.A0P();
                throw F60.createAndThrow();
            }
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            if (obj != null) {
                return obj;
            }
            throw new NetworkException("Email verification timed out", -1, null, null, null, null, null);
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super EmailOwnerVerification> htJ) {
            C117302 c117302 = (C117302) create(htJ);
            Unit unit = Unit.INSTANCE;
            c117302.invokeSuspend(unit);
            return unit;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$perform$2", f = "EmailRepository.kt", l = {543, 557, 562}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$perform$2, reason: invalid class name and case insensitive filesystem */
    public final class C117312<T> extends AbstractC07127nr implements G0V<C3UX, HtJ<? super T>, Object> {
        public final /* synthetic */ boolean $allowPendingReset;
        public final /* synthetic */ G0U<HtJ<? super T>, Object> $block;
        public final /* synthetic */ boolean $creating;
        public final /* synthetic */ String $id;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C117312(String str, G0U<? super HtJ<? super T>, ? extends Object> g0u, boolean z, boolean z2, HtJ<? super C117312> htJ) {
            super(2, htJ);
            this.$id = str;
            this.$block = g0u;
            this.$allowPendingReset = z;
            this.$creating = z2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C117312 c117312 = EmailRepository.this.new C117312(this.$id, this.$block, this.$allowPendingReset, this.$creating, htJ);
            c117312.L$0 = obj;
            return c117312;
        }

        /* JADX WARN: Removed duplicated region for block: B:75:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 300
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailRepository.C117312.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super T> htJ) {
            return ((C117312) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$permissions$2", f = "EmailRepository.kt", l = {826}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$permissions$2, reason: invalid class name and case insensitive filesystem */
    public final class C117322 extends AbstractC07127nr implements G0U<HtJ<? super EmailPermissions>, Object> {
        public final /* synthetic */ String $id;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117322(String str, HtJ<? super C117322> htJ) {
            super(1, htJ);
            this.$id = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return EmailRepository.this.new C117322(this.$id, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                EmailRepository emailRepository = EmailRepository.this;
                String str = this.$id;
                this.label = 1;
                obj = emailRepository.fetchPermissions(str, this);
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

        @Override // X.G0U
        public final Object invoke(HtJ<? super EmailPermissions> htJ) {
            return ((C117322) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository", f = "EmailRepository.kt", l = {940}, m = "refreshAvailability", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$refreshAvailability$1, reason: invalid class name and case insensitive filesystem */
    public final class C117331 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;
        public /* synthetic */ Object result;

        public C117331(HtJ<? super C117331> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EmailRepository.this.refreshAvailability(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$removeSender$2", f = "EmailRepository.kt", l = {773, 940, 782}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$removeSender$2, reason: invalid class name and case insensitive filesystem */
    public final class C117342 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $id;
        public final /* synthetic */ String $senderId;
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117342(String str, String str2, HtJ<? super C117342> htJ) {
            super(1, htJ);
            this.$id = str;
            this.$senderId = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return EmailRepository.this.new C117342(this.$id, this.$senderId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                EmailRepository emailRepository = EmailRepository.this;
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
                        objM1595executeBodylessJarvisRequestWithp3iPjrY = this.L$0;
                        Hwg.A00(obj);
                        Hwg.A00(objM1595executeBodylessJarvisRequestWithp3iPjrY);
                        return Unit.INSTANCE;
                    }
                    objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
                    EmailRepository emailRepository2 = EmailRepository.this;
                    String str2 = this.$id;
                    this.L$0 = objM1595executeBodylessJarvisRequestWithp3iPjrY;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.label = 3;
                    emailRepository2.checkEnvironment(str2, this);
                    Hwg.A00(objM1595executeBodylessJarvisRequestWithp3iPjrY);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            Set<Integer> setA0g = AbstractC0878AGe.A0g(new ADq(200, 299));
            C9jH c9jHA0E = AGH.A0E();
            EmailRepository$removeSender$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 emailRepository$removeSender$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = EmailRepository$removeSender$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.I$0 = 1;
            this.I$1 = 0;
            this.I$2 = 0;
            this.label = 2;
            objM1595executeBodylessJarvisRequestWithp3iPjrY = HatchHttpApi.INSTANCE.m1595executeBodylessJarvisRequestWithp3iPjrY(emailRepository$removeSender$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, true, new EmailDaemonOwnerPath(this.$senderId), RequestType.DELETE, EmailRepository.this.userSession, null, new HxE[0], null, setA0g, true, c9jHA0E, false, null, false, this);
            if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                return enumC10460Hji;
            }
            EmailRepository emailRepository22 = EmailRepository.this;
            String str22 = this.$id;
            this.L$0 = objM1595executeBodylessJarvisRequestWithp3iPjrY;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.label = 3;
            emailRepository22.checkEnvironment(str22, this);
            Hwg.A00(objM1595executeBodylessJarvisRequestWithp3iPjrY);
            return Unit.INSTANCE;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C117342) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$requestSenderVerification$2", f = "EmailRepository.kt", l = {759, 936, 767}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$requestSenderVerification$2, reason: invalid class name and case insensitive filesystem */
    public final class C117352 extends AbstractC07127nr implements G0U<HtJ<? super EmailSender>, Object> {
        public final /* synthetic */ String $address;
        public final /* synthetic */ String $id;
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117352(String str, String str2, HtJ<? super C117352> htJ) {
            super(1, htJ);
            this.$id = str;
            this.$address = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return EmailRepository.this.new C117352(this.$id, this.$address, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1604executeStefiRequestWithjLovISM;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                EmailRepository emailRepository = EmailRepository.this;
                String str = this.$id;
                this.label = 1;
                emailRepository.checkEnvironment(str, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw AnonymousClass001.A0n();
                        }
                        objM1604executeStefiRequestWithjLovISM = this.L$0;
                        Hwg.A00(obj);
                        Hwg.A00(objM1604executeStefiRequestWithjLovISM);
                        return ((EmailSenderJson) objM1604executeStefiRequestWithjLovISM).toDomain();
                    }
                    objM1604executeStefiRequestWithjLovISM = AnonymousClass002.A0j(obj);
                    EmailRepository emailRepository2 = EmailRepository.this;
                    String str2 = this.$id;
                    this.L$0 = objM1604executeStefiRequestWithjLovISM;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 3;
                    emailRepository2.checkEnvironment(str2, this);
                    Hwg.A00(objM1604executeStefiRequestWithjLovISM);
                    return ((EmailSenderJson) objM1604executeStefiRequestWithjLovISM).toDomain();
                }
                Hwg.A00(obj);
            }
            HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
            EmailPath emailPath = new EmailPath(EmailEndpoint.VERIFY);
            EmailVerifyRequestJson emailVerifyRequestJson = new EmailVerifyRequestJson(this.$id, this.$address);
            RequestType requestType = RequestType.POST;
            C9jH c9jHA0E = AGH.A0E();
            EmailRepository$requestSenderVerification$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1 emailRepository$requestSenderVerification$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1 = EmailRepository$requestSenderVerification$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1.INSTANCE;
            EmailRepository$requestSenderVerification$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2 emailRepository$requestSenderVerification$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2 = EmailRepository$requestSenderVerification$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2.INSTANCE;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.I$0 = 0;
            this.I$1 = 0;
            this.label = 2;
            objM1604executeStefiRequestWithjLovISM = hatchHttpApi.m1604executeStefiRequestWithjLovISM(emailRepository$requestSenderVerification$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1, emailRepository$requestSenderVerification$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2, false, emailPath, emailVerifyRequestJson, requestType, c9jHA0E, false, null, false, null, this);
            if (objM1604executeStefiRequestWithjLovISM == enumC10460Hji) {
                return enumC10460Hji;
            }
            EmailRepository emailRepository22 = EmailRepository.this;
            String str22 = this.$id;
            this.L$0 = objM1604executeStefiRequestWithjLovISM;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 3;
            emailRepository22.checkEnvironment(str22, this);
            Hwg.A00(objM1604executeStefiRequestWithjLovISM);
            return ((EmailSenderJson) objM1604executeStefiRequestWithjLovISM).toDomain();
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super EmailSender> htJ) {
            return ((C117352) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository", f = "EmailRepository.kt", l = {MC.frl_google_credential_manager.__CONFIG__}, m = "requireResetAccess", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$requireResetAccess$1, reason: invalid class name and case insensitive filesystem */
    public final class C117361 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C117361(HtJ<? super C117361> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EmailRepository.this.requireResetAccess(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$savePendingReset$2", f = "EmailRepository.kt", l = {464}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$savePendingReset$2, reason: invalid class name and case insensitive filesystem */
    public final class C117372 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $address;
        public final /* synthetic */ String $id;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117372(String str, String str2, HtJ<? super C117372> htJ) {
            super(2, htJ);
            this.$id = str;
            this.$address = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return EmailRepository.this.new C117372(this.$id, this.$address, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Unit unit;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                EmailRepository emailRepository = EmailRepository.this;
                String str = this.$id;
                this.label = 1;
                emailRepository.checkEnvironment(str, this);
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            BzK bzKA9q = EmailRepository.this.resetPrefs.A9q();
            bzKA9q.AYr(FGI.A0M("email_pending_reset:", this.$id), this.$address);
            if (!bzKA9q.commit()) {
                throw new IllegalStateException("Email reset state could not be persisted");
            }
            EmailRepository emailRepository2 = EmailRepository.this;
            Object obj2 = emailRepository2.requestLock;
            String str2 = this.$id;
            String str3 = this.$address;
            synchronized (obj2) {
                emailRepository2.pendingResets.put(str2, str3);
                unit = Unit.INSTANCE;
            }
            return unit;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C117372) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository", f = "EmailRepository.kt", l = {438}, m = "sendSetupEnd", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$sendSetupEnd$1, reason: invalid class name and case insensitive filesystem */
    public final class C117381 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C117381(HtJ<? super C117381> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EmailRepository.this.sendSetupEnd(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$sendSetupEnd$2", f = "EmailRepository.kt", l = {439, 940, 447}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$sendSetupEnd$2, reason: invalid class name and case insensitive filesystem */
    public final class C117392 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $id;
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117392(String str, HtJ<? super C117392> htJ) {
            super(1, htJ);
            this.$id = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return EmailRepository.this.new C117392(this.$id, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
            /*
                r19 = this;
                X.Hji r1 = X.EnumC10460Hji.A02
                r4 = r19
                int r0 = r4.label
                r3 = 3
                r2 = 2
                r15 = 1
                r11 = 0
                if (r0 == 0) goto L2f
                if (r0 == r15) goto L3f
                if (r0 == r2) goto L7f
                if (r0 != r3) goto L9c
                java.lang.Object r2 = r4.L$0
                X.Hwg.A00(r20)
            L17:
                java.lang.Throwable r2 = X.HsJ.A00(r2)
                if (r2 == 0) goto L2c
                boolean r0 = r2 instanceof com.facebook.aura.json.NetworkException
                if (r0 == 0) goto La0
                r0 = r2
                com.facebook.aura.json.NetworkException r0 = (com.facebook.aura.json.NetworkException) r0
                if (r0 == 0) goto La0
                int r1 = r0.httpResponseCode
                r0 = 404(0x194, float:5.66E-43)
                if (r1 != r0) goto La0
            L2c:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
            L2f:
                X.Hwg.A00(r20)
                com.facebook.aura.email.repo.EmailRepository r5 = com.facebook.aura.email.repo.EmailRepository.this
                java.lang.String r0 = r4.$id
                r4.label = r15
                java.lang.Object r0 = com.facebook.aura.email.repo.EmailRepository.access$awaitGateway(r5, r0, r4)
                if (r0 != r1) goto L42
                return r1
            L3f:
                X.Hwg.A00(r20)
            L42:
                com.facebook.aura.network.http.HatchHttpApi r5 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
                com.facebook.aura.email.repo.EmailDaemonPath r8 = com.facebook.aura.email.repo.EmailDaemonPath.SETUP_END
                com.facebook.aura.network.http.RequestType r9 = com.facebook.aura.network.http.RequestType.POST
                com.facebook.aura.email.repo.EmailRepository r0 = com.facebook.aura.email.repo.EmailRepository.this
                X.CGz r10 = r0.userSession
                r7 = 0
                X.HxE[] r12 = new X.HxE[r7]
                java.util.Set r14 = X.AnonymousClass004.A18()
                X.9jH r16 = X.AGH.A0E()
                com.facebook.aura.email.repo.EmailRepository$sendSetupEnd$2$invokeSuspend$$inlined$executeJarvisRequest-1iavgos$default$1 r6 = com.facebook.aura.email.repo.EmailRepository$sendSetupEnd$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
                r4.L$0 = r11
                r4.L$1 = r11
                r4.L$2 = r11
                r4.L$3 = r11
                r4.L$4 = r11
                r4.L$5 = r11
                r4.L$6 = r11
                r4.I$0 = r15
                r4.I$1 = r7
                r4.I$2 = r7
                r4.label = r2
                r13 = r11
                r17 = r7
                r18 = r11
                r19 = r7
                r20 = r4
                java.lang.Object r2 = r5.m1595executeBodylessJarvisRequestWithp3iPjrY(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                if (r2 != r1) goto L83
                return r1
            L7f:
                java.lang.Object r2 = X.AnonymousClass002.A0j(r20)
            L83:
                com.facebook.aura.email.repo.EmailRepository r1 = com.facebook.aura.email.repo.EmailRepository.this
                java.lang.String r0 = r4.$id
                r4.L$0 = r2
                r4.L$1 = r11
                r4.L$2 = r11
                r4.L$3 = r11
                r4.L$4 = r11
                r4.L$5 = r11
                r4.L$6 = r11
                r4.label = r3
                com.facebook.aura.email.repo.EmailRepository.access$checkEnvironment(r1, r0, r4)
                goto L17
            L9c:
                java.lang.IllegalStateException r2 = X.AnonymousClass001.A0n()
            La0:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailRepository.C117392.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C117392) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository", f = "EmailRepository.kt", l = {417, 432}, m = "sendSetupEndWithRetry", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$sendSetupEndWithRetry$1, reason: invalid class name and case insensitive filesystem */
    public final class C117401 extends HzP {
        public int I$0;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C117401(HtJ<? super C117401> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EmailRepository.this.sendSetupEndWithRetry(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$senders$2", f = "EmailRepository.kt", l = {656}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$senders$2, reason: invalid class name and case insensitive filesystem */
    public final class C117412 extends AbstractC07127nr implements G0U<HtJ<? super EmailPage<EmailSender>>, Object> {
        public final /* synthetic */ String $after;
        public final /* synthetic */ String $id;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117412(String str, String str2, HtJ<? super C117412> htJ) {
            super(1, htJ);
            this.$id = str;
            this.$after = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return EmailRepository.this.new C117412(this.$id, this.$after, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                EmailRepository emailRepository = EmailRepository.this;
                String str = this.$id;
                String str2 = this.$after;
                this.label = 1;
                obj = emailRepository.fetchSenders(str, str2, this);
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

        @Override // X.G0U
        public final Object invoke(HtJ<? super EmailPage<EmailSender>> htJ) {
            return ((C117412) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository", f = "EmailRepository.kt", l = {787, 940, 794}, m = "sendingPermissions", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$sendingPermissions$1, reason: invalid class name and case insensitive filesystem */
    public final class C117421 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;
        public /* synthetic */ Object result;

        public C117421(HtJ<? super C117421> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EmailRepository.this.sendingPermissions(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$settings$2", f = "EmailRepository.kt", l = {800, 940, 807}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$settings$2, reason: invalid class name and case insensitive filesystem */
    public final class C117432 extends AbstractC07127nr implements G0U<HtJ<? super EmailSettings>, Object> {
        public final /* synthetic */ String $id;
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117432(String str, HtJ<? super C117432> htJ) {
            super(1, htJ);
            this.$id = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return EmailRepository.this.new C117432(this.$id, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                EmailRepository emailRepository = EmailRepository.this;
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
                        objM1595executeBodylessJarvisRequestWithp3iPjrY = this.L$0;
                        Hwg.A00(obj);
                        Hwg.A00(objM1595executeBodylessJarvisRequestWithp3iPjrY);
                        return ((EmailSettingsJson) objM1595executeBodylessJarvisRequestWithp3iPjrY).toDomain();
                    }
                    objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
                    EmailRepository emailRepository2 = EmailRepository.this;
                    String str2 = this.$id;
                    this.L$0 = objM1595executeBodylessJarvisRequestWithp3iPjrY;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.label = 3;
                    emailRepository2.checkEnvironment(str2, this);
                    Hwg.A00(objM1595executeBodylessJarvisRequestWithp3iPjrY);
                    return ((EmailSettingsJson) objM1595executeBodylessJarvisRequestWithp3iPjrY).toDomain();
                }
                Hwg.A00(obj);
            }
            Set<Integer> setA18 = AnonymousClass004.A18();
            C9jH c9jHA0E = AGH.A0E();
            EmailRepository$settings$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 emailRepository$settings$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = EmailRepository$settings$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.I$0 = 1;
            this.I$1 = 1;
            this.I$2 = 0;
            this.label = 2;
            objM1595executeBodylessJarvisRequestWithp3iPjrY = HatchHttpApi.INSTANCE.m1595executeBodylessJarvisRequestWithp3iPjrY(emailRepository$settings$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, EmailDaemonPath.SETTINGS, RequestType.GET, EmailRepository.this.userSession, null, new HxE[0], null, setA18, true, c9jHA0E, true, null, false, this);
            if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                return enumC10460Hji;
            }
            EmailRepository emailRepository22 = EmailRepository.this;
            String str22 = this.$id;
            this.L$0 = objM1595executeBodylessJarvisRequestWithp3iPjrY;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.label = 3;
            emailRepository22.checkEnvironment(str22, this);
            Hwg.A00(objM1595executeBodylessJarvisRequestWithp3iPjrY);
            return ((EmailSettingsJson) objM1595executeBodylessJarvisRequestWithp3iPjrY).toDomain();
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super EmailSettings> htJ) {
            return ((C117432) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$setup$2", f = "EmailRepository.kt", l = {329, 940, 336}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$setup$2, reason: invalid class name and case insensitive filesystem */
    public final class C117442 extends AbstractC07127nr implements G0U<HtJ<? super EmailSetup>, Object> {
        public final /* synthetic */ String $id;
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117442(String str, HtJ<? super C117442> htJ) {
            super(1, htJ);
            this.$id = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return EmailRepository.this.new C117442(this.$id, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                EmailRepository emailRepository = EmailRepository.this;
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
                        objM1595executeBodylessJarvisRequestWithp3iPjrY = this.L$0;
                        Hwg.A00(obj);
                        Hwg.A00(objM1595executeBodylessJarvisRequestWithp3iPjrY);
                        return ((EmailSetupJson) objM1595executeBodylessJarvisRequestWithp3iPjrY).toDomain();
                    }
                    objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
                    EmailRepository emailRepository2 = EmailRepository.this;
                    String str2 = this.$id;
                    this.L$0 = objM1595executeBodylessJarvisRequestWithp3iPjrY;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.label = 3;
                    emailRepository2.checkEnvironment(str2, this);
                    Hwg.A00(objM1595executeBodylessJarvisRequestWithp3iPjrY);
                    return ((EmailSetupJson) objM1595executeBodylessJarvisRequestWithp3iPjrY).toDomain();
                }
                Hwg.A00(obj);
            }
            Set<Integer> setA18 = AnonymousClass004.A18();
            C9jH c9jHA0E = AGH.A0E();
            EmailRepository$setup$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 emailRepository$setup$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = EmailRepository$setup$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.I$0 = 1;
            this.I$1 = 1;
            this.I$2 = 0;
            this.label = 2;
            objM1595executeBodylessJarvisRequestWithp3iPjrY = HatchHttpApi.INSTANCE.m1595executeBodylessJarvisRequestWithp3iPjrY(emailRepository$setup$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, EmailDaemonPath.SETUP, RequestType.GET, EmailRepository.this.userSession, null, new HxE[0], null, setA18, true, c9jHA0E, true, null, false, this);
            if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                return enumC10460Hji;
            }
            EmailRepository emailRepository22 = EmailRepository.this;
            String str22 = this.$id;
            this.L$0 = objM1595executeBodylessJarvisRequestWithp3iPjrY;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.label = 3;
            emailRepository22.checkEnvironment(str22, this);
            Hwg.A00(objM1595executeBodylessJarvisRequestWithp3iPjrY);
            return ((EmailSetupJson) objM1595executeBodylessJarvisRequestWithp3iPjrY).toDomain();
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super EmailSetup> htJ) {
            return ((C117442) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$thread$2", f = "EmailRepository.kt", l = {616, 940, 623, MC.hatch_android_avatar_abra.__CONFIG__}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$thread$2, reason: invalid class name and case insensitive filesystem */
    public final class C117452 extends AbstractC07127nr implements G0U<HtJ<? super EmailThread>, Object> {
        public final /* synthetic */ String $id;
        public final /* synthetic */ String $threadId;
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$thread$2$1", f = "EmailRepository.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.email.repo.EmailRepository$thread$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super EmailThread>, Object> {
            public final /* synthetic */ Object $result;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Object obj, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.$result = obj;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(this.$result, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                Object obj2 = this.$result;
                Hwg.A00(obj2);
                return ((EmailThreadJson) obj2).toDomain();
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super EmailThread> htJ) {
                return new AnonymousClass1(this.$result, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117452(String str, String str2, HtJ<? super C117452> htJ) {
            super(1, htJ);
            this.$id = str;
            this.$threadId = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return EmailRepository.this.new C117452(this.$id, this.$threadId, htJ);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        
            if (r7.awaitGateway(r6, r21) == r3) goto L14;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00ab A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                r21 = this;
                X.Hji r3 = X.EnumC10460Hji.A02
                r4 = r21
                int r6 = r4.label
                r5 = 4
                r2 = 3
                r1 = 2
                r0 = 1
                r13 = 0
                if (r6 == 0) goto L1e
                if (r6 == r0) goto L2e
                if (r6 == r1) goto L75
                if (r6 == r2) goto L91
                if (r6 != r5) goto L19
                X.Hwg.A00(r22)
                return r22
            L19:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L1e:
                X.Hwg.A00(r22)
                com.facebook.aura.email.repo.EmailRepository r7 = com.facebook.aura.email.repo.EmailRepository.this
                java.lang.String r6 = r4.$id
                r4.label = r0
                java.lang.Object r6 = com.facebook.aura.email.repo.EmailRepository.access$awaitGateway(r7, r6, r4)
                if (r6 != r3) goto L31
            L2d:
                return r3
            L2e:
                X.Hwg.A00(r22)
            L31:
                com.facebook.aura.network.http.HatchHttpApi r7 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
                java.lang.String r6 = r4.$threadId
                com.facebook.aura.email.repo.EmailDaemonThreadPath r10 = new com.facebook.aura.email.repo.EmailDaemonThreadPath
                r10.<init>(r6)
                com.facebook.aura.network.http.RequestType r11 = com.facebook.aura.network.http.RequestType.GET
                com.facebook.aura.email.repo.EmailRepository r6 = com.facebook.aura.email.repo.EmailRepository.this
                X.CGz r12 = r6.userSession
                r9 = 0
                X.HxE[] r14 = new X.HxE[r9]
                java.util.Set r16 = X.AnonymousClass004.A18()
                X.9jH r18 = X.AGH.A0E()
                com.facebook.aura.email.repo.EmailRepository$thread$2$invokeSuspend$$inlined$executeJarvisRequest-1iavgos$default$1 r8 = com.facebook.aura.email.repo.EmailRepository$thread$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
                r4.L$0 = r13
                r4.L$1 = r13
                r4.L$2 = r13
                r4.L$3 = r13
                r4.L$4 = r13
                r4.L$5 = r13
                r4.L$6 = r13
                r4.I$0 = r0
                r4.I$1 = r0
                r4.I$2 = r9
                r4.label = r1
                r15 = r13
                r19 = r0
                r20 = r13
                r21 = r9
                r22 = r4
                r17 = r0
                java.lang.Object r6 = r7.m1595executeBodylessJarvisRequestWithp3iPjrY(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                if (r6 != r3) goto L79
                return r3
            L75:
                java.lang.Object r6 = X.AnonymousClass002.A0j(r22)
            L79:
                com.facebook.aura.email.repo.EmailRepository r1 = com.facebook.aura.email.repo.EmailRepository.this
                java.lang.String r0 = r4.$id
                r4.L$0 = r6
                r4.L$1 = r13
                r4.L$2 = r13
                r4.L$3 = r13
                r4.L$4 = r13
                r4.L$5 = r13
                r4.L$6 = r13
                r4.label = r2
                com.facebook.aura.email.repo.EmailRepository.access$checkEnvironment(r1, r0, r4)
                goto L96
            L91:
                java.lang.Object r6 = r4.L$0
                X.Hwg.A00(r22)
            L96:
                com.facebook.aura.executors.AuraDispatchers r0 = com.facebook.aura.executors.AuraDispatchers.INSTANCE
                X.78T r1 = r0.m764default()
                com.facebook.aura.email.repo.EmailRepository$thread$2$1 r0 = new com.facebook.aura.email.repo.EmailRepository$thread$2$1
                r0.<init>(r6, r13)
                r4.L$0 = r13
                r4.label = r5
                java.lang.Object r0 = X.GAo.A00(r4, r1, r0)
                if (r0 == r3) goto L2d
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailRepository.C117452.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super EmailThread> htJ) {
            return ((C117452) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$threads$2", f = "EmailRepository.kt", l = {593, 943, 603, 604}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$threads$2, reason: invalid class name and case insensitive filesystem */
    public final class C117462 extends AbstractC07127nr implements G0U<HtJ<? super EmailPage<EmailSummary>>, Object> {
        public final /* synthetic */ String $after;
        public final /* synthetic */ String $id;
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$threads$2$1", f = "EmailRepository.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.email.repo.EmailRepository$threads$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super EmailPage<EmailSummary>>, Object> {
            public final /* synthetic */ Object $result;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Object obj, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.$result = obj;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(this.$result, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EmailCursorsJson emailCursorsJson;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                Object obj2 = this.$result;
                Hwg.A00(obj2);
                EmailPageJson emailPageJson = (EmailPageJson) obj2;
                List<T> list = emailPageJson.data;
                ArrayList arrayListA0i = AnonymousClass003.A0i(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayListA0i.add(((EmailSummaryJson) it.next()).toDomain());
                }
                AHD ahdA07 = AGI.A07(arrayListA0i);
                EmailPagingJson emailPagingJson = emailPageJson.paging;
                return new EmailPage(ahdA07, (emailPagingJson == null || (emailCursorsJson = emailPagingJson.cursors) == null) ? null : emailCursorsJson.after);
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super EmailPage<EmailSummary>> htJ) {
                return new AnonymousClass1(this.$result, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117462(String str, String str2, HtJ<? super C117462> htJ) {
            super(1, htJ);
            this.$id = str;
            this.$after = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return EmailRepository.this.new C117462(this.$id, this.$after, htJ);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        
            if (r8.awaitGateway(r7, r26) == r4) goto L14;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00db A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
                Method dump skipped, instructions count: 220
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailRepository.C117462.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super EmailPage<EmailSummary>> htJ) {
            return ((C117462) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$updateAutoForwardStub$2", f = "EmailRepository.kt", l = {897, 898, 899}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$updateAutoForwardStub$2, reason: invalid class name and case insensitive filesystem */
    public final class C117472 extends AbstractC07127nr implements G0U<HtJ<? super Boolean>, Object> {
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ String $id;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117472(String str, boolean z, HtJ<? super C117472> htJ) {
            super(1, htJ);
            this.$id = str;
            this.$enabled = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return EmailRepository.this.new C117472(this.$id, this.$enabled, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                X.Hji r5 = X.EnumC10460Hji.A02
                int r0 = r6.label
                r4 = 3
                r3 = 2
                r2 = 1
                if (r0 == 0) goto L1a
                if (r0 == r2) goto L27
                if (r0 == r3) goto L35
                if (r0 != r4) goto L4d
                X.Hwg.A00(r7)
            L12:
                com.facebook.aura.email.repo.EmailRepository r2 = com.facebook.aura.email.repo.EmailRepository.this
                java.lang.Object r1 = r2.stubLock
                boolean r0 = r6.$enabled
                monitor-enter(r1)
                goto L42
            L1a:
                X.Hwg.A00(r7)
                com.facebook.aura.email.repo.EmailRepository r1 = com.facebook.aura.email.repo.EmailRepository.this
                java.lang.String r0 = r6.$id
                r6.label = r2
                com.facebook.aura.email.repo.EmailRepository.access$checkEnvironment(r1, r0, r6)
                goto L2a
            L27:
                X.Hwg.A00(r7)
            L2a:
                r6.label = r3
                r0 = 300(0x12c, double:1.48E-321)
                java.lang.Object r0 = X.C7Bq.A01(r0, r6)
                if (r0 != r5) goto L38
                return r5
            L35:
                X.Hwg.A00(r7)
            L38:
                com.facebook.aura.email.repo.EmailRepository r1 = com.facebook.aura.email.repo.EmailRepository.this
                java.lang.String r0 = r6.$id
                r6.label = r4
                com.facebook.aura.email.repo.EmailRepository.access$checkEnvironment(r1, r0, r6)
                goto L12
            L42:
                r2.stubAutoForward = r0     // Catch: java.lang.Throwable -> L4a
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L4a
                monitor-exit(r1)
                return r5
            L4a:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            L4d:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailRepository.C117472.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Boolean> htJ) {
            return ((C117472) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$updateIncludeSignature$2", f = "EmailRepository.kt", l = {813, 964, 822}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$updateIncludeSignature$2, reason: invalid class name and case insensitive filesystem */
    public final class C117482 extends AbstractC07127nr implements G0U<HtJ<? super EmailSettings>, Object> {
        public final /* synthetic */ String $id;
        public final /* synthetic */ boolean $includeSignature;
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
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117482(String str, boolean z, HtJ<? super C117482> htJ) {
            super(1, htJ);
            this.$id = str;
            this.$includeSignature = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return EmailRepository.this.new C117482(this.$id, this.$includeSignature, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1599executeJarvisRequestWithFof5HsY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                EmailRepository emailRepository = EmailRepository.this;
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
                        objM1599executeJarvisRequestWithFof5HsY = this.L$0;
                        Hwg.A00(obj);
                        Hwg.A00(objM1599executeJarvisRequestWithFof5HsY);
                        return ((EmailSettingsJson) objM1599executeJarvisRequestWithFof5HsY).toDomain();
                    }
                    objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
                    EmailRepository emailRepository2 = EmailRepository.this;
                    String str2 = this.$id;
                    this.L$0 = objM1599executeJarvisRequestWithFof5HsY;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.label = 3;
                    emailRepository2.checkEnvironment(str2, this);
                    Hwg.A00(objM1599executeJarvisRequestWithFof5HsY);
                    return ((EmailSettingsJson) objM1599executeJarvisRequestWithFof5HsY).toDomain();
                }
                Hwg.A00(obj);
            }
            Set<Integer> setA18 = AnonymousClass004.A18();
            C9jH c9jHA0E = AGH.A0E();
            EmailRepository$updateIncludeSignature$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 emailRepository$updateIncludeSignature$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = EmailRepository$updateIncludeSignature$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
            EmailRepository$updateIncludeSignature$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 emailRepository$updateIncludeSignature$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = EmailRepository$updateIncludeSignature$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.L$7 = null;
            this.I$0 = 1;
            this.I$1 = 0;
            this.I$2 = 0;
            this.I$3 = 1;
            this.I$4 = 0;
            this.I$5 = 0;
            this.I$6 = 0;
            this.label = 2;
            objM1599executeJarvisRequestWithFof5HsY = HatchHttpApi.INSTANCE.m1599executeJarvisRequestWithFof5HsY(emailRepository$updateIncludeSignature$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, emailRepository$updateIncludeSignature$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, false, EmailDaemonPath.SETTINGS, new EmailSettingsUpdateJson(this.$includeSignature), RequestType.PATCH, EmailRepository.this.userSession, null, null, new HxE[0], setA18, true, false, c9jHA0E, null, false, true, false, false, null, false, this);
            if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                return enumC10460Hji;
            }
            EmailRepository emailRepository22 = EmailRepository.this;
            String str22 = this.$id;
            this.L$0 = objM1599executeJarvisRequestWithFof5HsY;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.L$7 = null;
            this.label = 3;
            emailRepository22.checkEnvironment(str22, this);
            Hwg.A00(objM1599executeJarvisRequestWithFof5HsY);
            return ((EmailSettingsJson) objM1599executeJarvisRequestWithFof5HsY).toDomain();
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super EmailSettings> htJ) {
            return ((C117482) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$updateName$2", f = "EmailRepository.kt", l = {MC.hatch_activity_screen.__CONFIG__, 964, 586}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$updateName$2, reason: invalid class name and case insensitive filesystem */
    public final class C117492 extends AbstractC07127nr implements G0U<HtJ<? super EmailMailbox>, Object> {
        public final /* synthetic */ String $id;
        public final /* synthetic */ String $name;
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
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117492(String str, String str2, HtJ<? super C117492> htJ) {
            super(1, htJ);
            this.$id = str;
            this.$name = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return EmailRepository.this.new C117492(this.$id, this.$name, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r28) {
            /*
                r27 = this;
                X.Hji r3 = X.EnumC10460Hji.A02
                r4 = r27
                int r5 = r4.label
                r2 = 3
                r1 = 2
                r0 = 1
                if (r5 == 0) goto L2c
                if (r5 == r0) goto L3c
                if (r5 == r1) goto L9e
                if (r5 != r2) goto Lbe
                java.lang.Object r6 = r4.L$0
                X.Hwg.A00(r28)
            L16:
                java.lang.Throwable r1 = X.HsJ.A00(r6)
                if (r1 == 0) goto L22
                com.facebook.aura.email.model.EmailSenderNameException r0 = com.facebook.aura.email.repo.EmailRepositoryJsonKt.emailSenderNameRejection(r1, r0)
                if (r0 != 0) goto Lc2
            L22:
                X.Hwg.A00(r6)
                com.facebook.aura.email.repo.EmailMailboxJson r6 = (com.facebook.aura.email.repo.EmailMailboxJson) r6
                com.facebook.aura.email.model.EmailMailbox r3 = r6.toDomain()
                return r3
            L2c:
                X.Hwg.A00(r28)
                com.facebook.aura.email.repo.EmailRepository r6 = com.facebook.aura.email.repo.EmailRepository.this
                java.lang.String r5 = r4.$id
                r4.label = r0
                java.lang.Object r5 = com.facebook.aura.email.repo.EmailRepository.access$awaitGateway(r6, r5, r4)
                if (r5 != r3) goto L3f
                return r3
            L3c:
                X.Hwg.A00(r28)
            L3f:
                com.facebook.aura.network.http.HatchHttpApi r6 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
                com.facebook.aura.email.repo.EmailDaemonPath r10 = com.facebook.aura.email.repo.EmailDaemonPath.MAILBOX
                java.lang.String r5 = r4.$name
                com.facebook.aura.email.repo.EmailUpdateRequestJson r11 = new com.facebook.aura.email.repo.EmailUpdateRequestJson
                r11.<init>(r5)
                com.facebook.aura.network.http.RequestType r12 = com.facebook.aura.network.http.RequestType.PATCH
                com.facebook.aura.email.repo.EmailRepository r5 = com.facebook.aura.email.repo.EmailRepository.this
                X.CGz r13 = r5.userSession
                r9 = 0
                X.HxE[] r5 = new X.HxE[r9]
                java.util.Set r17 = X.AnonymousClass004.A18()
                X.9jH r20 = X.AGH.A0E()
                com.facebook.aura.email.repo.EmailRepository$updateName$2$invokeSuspend$$inlined$executeJarvisRequest-Z6QaZII$default$1 r7 = com.facebook.aura.email.repo.EmailRepository$updateName$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE
                com.facebook.aura.email.repo.EmailRepository$updateName$2$invokeSuspend$$inlined$executeJarvisRequest-Z6QaZII$default$2 r8 = com.facebook.aura.email.repo.EmailRepository$updateName$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE
                r14 = 0
                r4.L$0 = r14
                r4.L$1 = r14
                r4.L$2 = r14
                r4.L$3 = r14
                r4.L$4 = r14
                r4.L$5 = r14
                r4.L$6 = r14
                r4.L$7 = r14
                r4.I$0 = r0
                r4.I$1 = r0
                r4.I$2 = r9
                r4.I$3 = r0
                r4.I$4 = r9
                r4.I$5 = r9
                r4.I$6 = r9
                r4.label = r1
                r15 = r14
                r18 = r0
                r19 = r0
                r21 = r14
                r22 = r9
                r23 = r0
                r24 = r9
                r25 = r9
                r26 = r14
                r27 = r9
                r28 = r4
                r16 = r5
                java.lang.Object r6 = r6.m1599executeJarvisRequestWithFof5HsY(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
                if (r6 != r3) goto La2
                return r3
            L9e:
                java.lang.Object r6 = X.AnonymousClass002.A0j(r28)
            La2:
                com.facebook.aura.email.repo.EmailRepository r5 = com.facebook.aura.email.repo.EmailRepository.this
                java.lang.String r3 = r4.$id
                r4.L$0 = r6
                r1 = 0
                r4.L$1 = r1
                r4.L$2 = r1
                r4.L$3 = r1
                r4.L$4 = r1
                r4.L$5 = r1
                r4.L$6 = r1
                r4.L$7 = r1
                r4.label = r2
                com.facebook.aura.email.repo.EmailRepository.access$checkEnvironment(r5, r3, r4)
                goto L16
            Lbe:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            Lc2:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailRepository.C117492.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super EmailMailbox> htJ) {
            return ((C117492) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$updatePermissionMode$2", f = "EmailRepository.kt", l = {858, 966, 880, 882}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$updatePermissionMode$2, reason: invalid class name and case insensitive filesystem */
    public final class C117502 extends AbstractC07127nr implements G0U<HtJ<? super EmailPermissions>, Object> {
        public final /* synthetic */ String $id;
        public final /* synthetic */ String $methodKey;
        public final /* synthetic */ EmailSendPermission $mode;
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
        public Object L$9;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117502(String str, EmailSendPermission emailSendPermission, String str2, HtJ<? super C117502> htJ) {
            super(1, htJ);
            this.$id = str;
            this.$mode = emailSendPermission;
            this.$methodKey = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return EmailRepository.this.new C117502(this.$id, this.$mode, this.$methodKey, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0156 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x015f  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r35) {
            /*
                Method dump skipped, instructions count: 372
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailRepository.C117502.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super EmailPermissions> htJ) {
            return ((C117502) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository", f = "EmailRepository.kt", l = {726}, m = "verify", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$verify$1, reason: invalid class name and case insensitive filesystem */
    public final class C117511 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C117511(HtJ<? super C117511> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EmailRepository.this.verify(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$verifySender$2", f = "EmailRepository.kt", l = {745, 746, AuraScatterKt.SCATTER_TOTAL_MS}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$verifySender$2, reason: invalid class name and case insensitive filesystem */
    public final class C117522 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super EmailSender>, Object> {
        public final /* synthetic */ String $address;
        public final /* synthetic */ String $id;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117522(String str, String str2, HtJ<? super C117522> htJ) {
            super(2, htJ);
            this.$id = str;
            this.$address = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C117522 c117522 = EmailRepository.this.new C117522(this.$id, this.$address, htJ);
            c117522.L$0 = obj;
            return c117522;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00ae A[Catch: all -> 0x00b4, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00b4, blocks: (B:42:0x00a3, B:43:0x00a6, B:47:0x00ae, B:52:0x00b3), top: B:58:0x000c }] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                java.lang.Object r9 = r10.L$0
                X.3UX r9 = (X.C3UX) r9
                X.Hji r5 = X.EnumC10460Hji.A02
                int r0 = r10.label
                r6 = 3
                r7 = 2
                r8 = 1
                r4 = 0
                if (r0 == 0) goto L2f
                if (r0 == r8) goto L2a
                if (r0 == r7) goto L23
                if (r0 != r6) goto L1e
                java.lang.Object r2 = r10.L$2
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                java.lang.Object r3 = r10.L$1
                X.HoC r3 = (X.HoC) r3
                goto La3
            L1e:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L23:
                java.lang.Object r1 = r10.L$2
                java.lang.Object r3 = r10.L$1
                X.27k r3 = (X.C27k) r3
                goto L72
            L2a:
                java.lang.Object r3 = r10.L$1
                X.27k r3 = (X.C27k) r3
                goto L54
            L2f:
                X.Hwg.A00(r11)
                com.facebook.aura.email.repo.EmailRepository r3 = com.facebook.aura.email.repo.EmailRepository.this
                java.lang.String r2 = r10.$id
                java.lang.String r1 = r10.$address
                com.facebook.aura.email.repo.EmailRepository$verifySender$2$storedSender$1 r0 = new com.facebook.aura.email.repo.EmailRepository$verifySender$2$storedSender$1
                r0.<init>(r3, r2, r1, r4)
                X.Hrx r3 = X.AnonymousClass001.A10(r0, r9)
                com.facebook.aura.email.repo.EmailRepository r2 = com.facebook.aura.email.repo.EmailRepository.this     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> Lb2 java.lang.Throwable -> Lb6
                java.lang.String r1 = r10.$id     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> Lb2 java.lang.Throwable -> Lb6
                java.lang.String r0 = r10.$address     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> Lb2 java.lang.Throwable -> Lb6
                r10.L$0 = r4     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> Lb2 java.lang.Throwable -> Lb6
                r10.L$1 = r3     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> Lb2 java.lang.Throwable -> Lb6
                r10.label = r8     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> Lb2 java.lang.Throwable -> Lb6
                java.lang.Object r11 = com.facebook.aura.email.repo.EmailRepository.access$requestSenderVerification(r2, r1, r0, r10)     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> Lb2 java.lang.Throwable -> Lb6
                if (r11 != r5) goto L57
                return r5
            L54:
                X.Hwg.A00(r11)     // Catch: java.lang.Exception -> L7e java.util.concurrent.CancellationException -> L80 java.lang.Throwable -> Lb0
            L57:
                r1 = r11
                com.facebook.aura.email.model.EmailSender r1 = (com.facebook.aura.email.model.EmailSender) r1     // Catch: java.lang.Exception -> L7e java.util.concurrent.CancellationException -> L80 java.lang.Throwable -> Lb0
                boolean r0 = r3.AOG()     // Catch: java.lang.Exception -> L7e java.util.concurrent.CancellationException -> L80 java.lang.Throwable -> Lb0
                if (r0 == 0) goto L7a
                r10.L$0 = r4     // Catch: java.lang.Exception -> L7e java.util.concurrent.CancellationException -> L80 java.lang.Throwable -> Lb0
                r10.L$1 = r3     // Catch: java.lang.Exception -> L7e java.util.concurrent.CancellationException -> L80 java.lang.Throwable -> Lb0
                r10.L$2 = r1     // Catch: java.lang.Exception -> L7e java.util.concurrent.CancellationException -> L80 java.lang.Throwable -> Lb0
                r10.label = r7     // Catch: java.lang.Exception -> L7e java.util.concurrent.CancellationException -> L80 java.lang.Throwable -> Lb0
                r0 = r3
                X.GBM r0 = (X.GBM) r0     // Catch: java.lang.Exception -> L7e java.util.concurrent.CancellationException -> L80 java.lang.Throwable -> Lb0
                java.lang.Object r11 = r0.A0E(r10)     // Catch: java.lang.Exception -> L7e java.util.concurrent.CancellationException -> L80 java.lang.Throwable -> Lb0
                if (r11 != r5) goto L75
                return r5
            L72:
                X.Hwg.A00(r11)     // Catch: java.lang.Exception -> L7e java.util.concurrent.CancellationException -> L80 java.lang.Throwable -> Lb0
            L75:
                com.facebook.aura.email.model.EmailSender r11 = (com.facebook.aura.email.model.EmailSender) r11     // Catch: java.lang.Exception -> L7e java.util.concurrent.CancellationException -> L80 java.lang.Throwable -> Lb0
                if (r11 == 0) goto L7a
                r1 = r11
            L7a:
                r3.A5w(r4)
                return r1
            L7e:
                r2 = move-exception
                goto L83
            L80:
                r0 = move-exception
                goto Lb3
            L82:
                r2 = move-exception
            L83:
                boolean r0 = r2 instanceof com.facebook.aura.json.NetworkException     // Catch: java.lang.Throwable -> Lb0
                if (r0 == 0) goto Laf
                r0 = r2
                com.facebook.aura.json.NetworkException r0 = (com.facebook.aura.json.NetworkException) r0     // Catch: java.lang.Throwable -> Lb0
                if (r0 == 0) goto Laf
                int r1 = r0.httpResponseCode     // Catch: java.lang.Throwable -> Lb0
                r0 = -1
                if (r1 != r0) goto Laf
                r10.L$0 = r4     // Catch: java.lang.Throwable -> Lb0
                r10.L$1 = r3     // Catch: java.lang.Throwable -> Lb0
                r10.L$2 = r2     // Catch: java.lang.Throwable -> Lb0
                r10.label = r6     // Catch: java.lang.Throwable -> Lb0
                r0 = r3
                X.GBM r0 = (X.GBM) r0     // Catch: java.lang.Throwable -> Lb0
                java.lang.Object r11 = r0.A0E(r10)     // Catch: java.lang.Throwable -> Lb0
                if (r11 != r5) goto La6
                return r5
            La3:
                X.Hwg.A00(r11)     // Catch: java.lang.Throwable -> Lb4
            La6:
                com.facebook.aura.email.model.EmailSender r11 = (com.facebook.aura.email.model.EmailSender) r11     // Catch: java.lang.Throwable -> Lb4
                if (r11 == 0) goto Lae
                r3.A5w(r4)
                return r11
            Lae:
                throw r2     // Catch: java.lang.Throwable -> Lb4
            Laf:
                throw r2     // Catch: java.lang.Throwable -> Lb0
            Lb0:
                r0 = move-exception
                goto Lb7
            Lb2:
                r0 = move-exception
            Lb3:
                throw r0     // Catch: java.lang.Throwable -> Lb4
            Lb4:
                r0 = move-exception
                goto Lb7
            Lb6:
                r0 = move-exception
            Lb7:
                r3.A5w(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailRepository.C117522.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super EmailSender> htJ) {
            return ((C117522) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Object perform(String str, boolean z, boolean z2, G0U<? super HtJ<? super T>, ? extends Object> g0u, HtJ<? super T> htJ) {
        return Hxb.A00(new C117312(str, g0u, z2, z, null), htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object requestSenderVerification(String str, String str2, HtJ<? super EmailSender> htJ) {
        return perform(str, false, false, new C117352(str, str2, null), htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object verifySender(String str, String str2, HtJ<? super EmailSender> htJ) {
        return Hxb.A00(new C117522(str, str2, null), htJ);
    }

    public final Object accountEmailAddresses(String str, HtJ<? super List<String>> htJ) {
        return perform(str, false, false, new AnonymousClass2(null), htJ);
    }

    public final Object addressAvailability(String str, String str2, String str3, HtJ<? super EmailAddressAvailability> htJ) {
        return perform(str, false, false, new C117122(str, str2, str3, null), htJ);
    }

    public final C20Q<EmailAttachmentFile> attachmentFile(Context context, String str, String str2, int i) {
        AnonymousClass005.A0x(context, str, str2);
        return AbstractC05643uj.A01(new AnonymousClass1(str, str2, context, i, null));
    }

    public final Object autoForwardStub(String str, HtJ<? super Boolean> htJ) {
        return perform(str, false, false, new C117142(str, null), htJ);
    }

    public final Object create(String str, String str2, String str3, HtJ<? super EmailMailbox> htJ) {
        return perform(str, true, false, new C117162(str, str2, str3, null), htJ);
    }

    public final Object deleteMailbox(String str, EmailMailbox emailMailbox, HtJ<? super Unit> htJ) {
        Object objA00 = Hxb.A00(new C117172(str, emailMailbox, null), htJ);
        return objA00 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA00;
    }

    public final boolean isResetting(String str) {
        boolean zContainsKey;
        C7384Etj.A0Y(str, 0);
        synchronized (this.requestLock) {
            zContainsKey = this.resetJobs.containsKey(str);
        }
        return zContainsKey;
    }

    public final Object mailbox(String str, HtJ<? super EmailMailbox> htJ) {
        return perform(str, false, false, new C117262(str, null), htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mailboxForReset(java.lang.String r9, X.HtJ<? super com.facebook.aura.email.model.EmailMailbox> r10) {
        /*
            r8 = this;
            r5 = r9
            boolean r0 = r10 instanceof com.facebook.aura.email.repo.EmailRepository.C117271
            r4 = r8
            if (r0 == 0) goto L26
            r9 = r10
            com.facebook.aura.email.repo.EmailRepository$mailboxForReset$1 r9 = (com.facebook.aura.email.repo.EmailRepository.C117271) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r9.label = r2
        L14:
            java.lang.Object r3 = r9.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r9.label
            r1 = 2
            r7 = 1
            if (r0 == 0) goto L31
            if (r0 == r7) goto L3c
            if (r0 != r1) goto L2c
            X.Hwg.A00(r3)
            return r3
        L26:
            com.facebook.aura.email.repo.EmailRepository$mailboxForReset$1 r9 = new com.facebook.aura.email.repo.EmailRepository$mailboxForReset$1
            r9.<init>(r10)
            goto L14
        L2c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L31:
            X.Hwg.A00(r3)
            r9.L$0 = r5
            r9.label = r7
            r8.requireResetAccess(r5, r9)
            goto L43
        L3c:
            java.lang.Object r5 = r9.L$0
            java.lang.String r5 = (java.lang.String) r5
            X.Hwg.A00(r3)
        L43:
            r0 = 0
            com.facebook.aura.email.repo.EmailRepository$mailboxForReset$2 r8 = new com.facebook.aura.email.repo.EmailRepository$mailboxForReset$2
            r8.<init>(r5, r0)
            r9.L$0 = r0
            r9.label = r1
            r6 = 0
            java.lang.Object r0 = r4.perform(r5, r6, r7, r8, r9)
            if (r0 != r2) goto L55
            return r2
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailRepository.mailboxForReset(java.lang.String, X.HtJ):java.lang.Object");
    }

    public final Object message(String str, String str2, HtJ<? super EmailMessage> htJ) {
        return perform(str, false, false, new C117292(str, str2, null), htJ);
    }

    public final Object permissions(String str, HtJ<? super EmailPermissions> htJ) {
        return perform(str, false, false, new C117322(str, null), htJ);
    }

    public final void releaseSetupAnnouncement(String str) {
        C7384Etj.A0Y(str, 0);
        synchronized (this.requestLock) {
            if (!this.closed) {
                AnonymousClass001.A1J(new EmailRepository$releaseSetupAnnouncement$1$1(this, str, null), this.setupEndScope);
            }
        }
    }

    public final Object removeSender(String str, String str2, HtJ<? super Unit> htJ) {
        return perform(str, false, false, new C117342(str, str2, null), htJ);
    }

    public final Object senders(String str, String str2, HtJ<? super EmailPage<EmailSender>> htJ) {
        return perform(str, false, false, new C117412(str, str2, null), htJ);
    }

    public final Object settings(String str, HtJ<? super EmailSettings> htJ) {
        return perform(str, false, false, new C117432(str, null), htJ);
    }

    public final Object setup(String str, HtJ<? super EmailSetup> htJ) {
        return perform(str, false, false, new C117442(str, null), htJ);
    }

    public final Object thread(String str, String str2, HtJ<? super EmailThread> htJ) {
        return perform(str, false, false, new C117452(str, str2, null), htJ);
    }

    public final Object threads(String str, String str2, HtJ<? super EmailPage<EmailSummary>> htJ) {
        return perform(str, false, false, new C117462(str, str2, null), htJ);
    }

    public final Object updateAutoForwardStub(String str, boolean z, HtJ<? super Boolean> htJ) {
        return perform(str, false, false, new C117472(str, z, null), htJ);
    }

    public final Object updateIncludeSignature(String str, boolean z, HtJ<? super EmailSettings> htJ) {
        return perform(str, false, false, new C117482(str, z, null), htJ);
    }

    public final Object updateName(String str, String str2, HtJ<? super EmailMailbox> htJ) {
        return perform(str, false, false, new C117492(str, str2, null), htJ);
    }

    public final Object updatePermissionMode(String str, String str2, EmailSendPermission emailSendPermission, HtJ<? super EmailPermissions> htJ) {
        return perform(str, false, false, new C117502(str, emailSendPermission, str2, null), htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitGateway(java.lang.String r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.email.repo.EmailRepository.C117151
            if (r0 == 0) goto L66
            r6 = r9
            com.facebook.aura.email.repo.EmailRepository$awaitGateway$1 r6 = (com.facebook.aura.email.repo.EmailRepository.C117151) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L66
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r2 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r1 = r6.label
            r4 = 3
            r3 = 2
            r0 = 1
            if (r1 == 0) goto L29
            if (r1 == r0) goto L34
            if (r1 == r3) goto L50
            if (r1 != r4) goto L6c
            X.Hwg.A00(r2)
        L26:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L29:
            X.Hwg.A00(r2)
            r6.L$0 = r8
            r6.label = r0
            r7.checkEnvironment(r8, r6)
            goto L3b
        L34:
            java.lang.Object r8 = r6.L$0
            java.lang.String r8 = (java.lang.String) r8
            X.Hwg.A00(r2)
        L3b:
            com.facebook.aura.gateway.service.HatchGatewayServiceManager r1 = com.facebook.aura.gateway.service.HatchGatewayServiceManager.INSTANCE
            X.CGz r0 = r7.userSession
            com.facebook.aura.gateway.HatchGatewayConnection r2 = r1.getGateway(r0)
            r6.L$0 = r8
            r6.label = r3
            r0 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r2 = r2.awaitConnected(r0, r6)
            if (r2 != r5) goto L57
            return r5
        L50:
            java.lang.Object r8 = r6.L$0
            java.lang.String r8 = (java.lang.String) r8
            X.Hwg.A00(r2)
        L57:
            boolean r0 = X.AnonymousClass001.A1X(r2)
            if (r0 == 0) goto L71
            r0 = 0
            r6.L$0 = r0
            r6.label = r4
            r7.checkEnvironment(r8, r6)
            goto L26
        L66:
            com.facebook.aura.email.repo.EmailRepository$awaitGateway$1 r6 = new com.facebook.aura.email.repo.EmailRepository$awaitGateway$1
            r6.<init>(r9)
            goto L12
        L6c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L71:
            java.lang.String r1 = "Check failed."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailRepository.awaitGateway(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchAttachment(java.lang.String r27, java.lang.String r28, com.facebook.aura.email.model.EmailAttachment r29, long r30, X.HtJ<? super com.facebook.aura.email.repo.EmailAttachmentContentJson> r32) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailRepository.fetchAttachment(java.lang.String, java.lang.String, com.facebook.aura.email.model.EmailAttachment, long, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchMailbox(java.lang.String r19, X.HtJ<? super com.facebook.aura.email.model.EmailMailbox> r20) {
        /*
            r18 = this;
            r3 = r19
            r6 = r20
            boolean r0 = r6 instanceof com.facebook.aura.email.repo.EmailRepository.C117221
            r4 = r18
            if (r0 == 0) goto Lb4
            r2 = r6
            com.facebook.aura.email.repo.EmailRepository$fetchMailbox$1 r2 = (com.facebook.aura.email.repo.EmailRepository.C117221) r2
            int r5 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r5 & r1
            if (r0 == 0) goto Lb4
            int r5 = r5 - r1
            r2.label = r5
        L18:
            java.lang.Object r7 = r2.result
            X.Hji r0 = X.EnumC10460Hji.A02
            int r6 = r2.label
            r5 = 3
            r1 = 2
            r15 = 1
            r11 = 0
            if (r6 == 0) goto L42
            if (r6 == r15) goto L50
            if (r6 == r1) goto L94
            if (r6 != r5) goto Lc5
            java.lang.Object r1 = r2.L$1
            X.Hwg.A00(r7)
        L2f:
            java.lang.Throwable r2 = X.HsJ.A00(r1)
            boolean r0 = r2 instanceof com.facebook.aura.json.NetworkException
            if (r0 == 0) goto Lbb
            com.facebook.aura.json.NetworkException r2 = (com.facebook.aura.json.NetworkException) r2
            if (r2 == 0) goto Lbb
            int r2 = r2.httpResponseCode
            r0 = 404(0x194, float:5.66E-43)
            if (r2 != r0) goto Lbb
            return r11
        L42:
            X.Hwg.A00(r7)
            r2.L$0 = r3
            r2.label = r15
            java.lang.Object r5 = r4.awaitGateway(r3, r2)
            if (r5 != r0) goto L57
            return r0
        L50:
            java.lang.Object r3 = r2.L$0
            java.lang.String r3 = (java.lang.String) r3
            X.Hwg.A00(r7)
        L57:
            com.facebook.aura.network.http.HatchHttpApi r5 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.email.repo.EmailDaemonPath r8 = com.facebook.aura.email.repo.EmailDaemonPath.MAILBOX
            com.facebook.aura.network.http.RequestType r9 = com.facebook.aura.network.http.RequestType.GET
            X.CGz r10 = r4.userSession
            r7 = 0
            X.HxE[] r12 = new X.HxE[r7]
            java.util.Set r14 = X.AnonymousClass004.A18()
            X.9jH r16 = X.AGH.A0E()
            com.facebook.aura.email.repo.EmailRepository$fetchMailbox$$inlined$executeJarvisRequest-1iavgos$default$1 r6 = com.facebook.aura.email.repo.EmailRepository$fetchMailbox$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r2.L$0 = r3
            r2.L$1 = r11
            r2.L$2 = r11
            r2.L$3 = r11
            r2.L$4 = r11
            r2.L$5 = r11
            r2.L$6 = r11
            r2.L$7 = r11
            r2.I$0 = r15
            r2.I$1 = r15
            r2.I$2 = r7
            r2.label = r1
            r13 = r11
            r17 = r15
            r18 = r11
            r19 = r7
            r20 = r2
            java.lang.Object r1 = r5.m1595executeBodylessJarvisRequestWithp3iPjrY(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r1 != r0) goto L9c
            return r0
        L94:
            java.lang.Object r3 = r2.L$0
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = X.AnonymousClass001.A0q(r7)
        L9c:
            r2.L$0 = r11
            r2.L$1 = r1
            r2.L$2 = r11
            r2.L$3 = r11
            r2.L$4 = r11
            r2.L$5 = r11
            r2.L$6 = r11
            r2.L$7 = r11
            r0 = 3
            r2.label = r0
            r4.checkEnvironment(r3, r2)
            goto L2f
        Lb4:
            com.facebook.aura.email.repo.EmailRepository$fetchMailbox$1 r2 = new com.facebook.aura.email.repo.EmailRepository$fetchMailbox$1
            r2.<init>(r6)
            goto L18
        Lbb:
            X.Hwg.A00(r1)
            com.facebook.aura.email.repo.EmailMailboxJson r1 = (com.facebook.aura.email.repo.EmailMailboxJson) r1
            com.facebook.aura.email.model.EmailMailbox r0 = r1.toDomain()
            return r0
        Lc5:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailRepository.fetchMailbox(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchPermissions(java.lang.String r7, X.HtJ<? super com.facebook.aura.email.model.EmailPermissions> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.email.repo.EmailRepository.C117231
            if (r0 == 0) goto L25
            r5 = r8
            com.facebook.aura.email.repo.EmailRepository$fetchPermissions$1 r5 = (com.facebook.aura.email.repo.EmailRepository.C117231) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r0 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r5.label
            r3 = 2
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 == r2) goto L3e
            if (r1 != r3) goto L2b
            java.lang.Object r1 = r5.L$1
            com.facebook.aura.email.repo.EmailConnectorPermissionsJson r1 = (com.facebook.aura.email.repo.EmailConnectorPermissionsJson) r1
            goto L61
        L25:
            com.facebook.aura.email.repo.EmailRepository$fetchPermissions$1 r5 = new com.facebook.aura.email.repo.EmailRepository$fetchPermissions$1
            r5.<init>(r8)
            goto L12
        L2b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L30:
            X.Hwg.A00(r0)
            r5.L$0 = r7
            r5.label = r2
            java.lang.Object r0 = r6.sendingPermissions(r7, r5)
            if (r0 != r4) goto L45
            return r4
        L3e:
            java.lang.Object r7 = r5.L$0
            java.lang.String r7 = (java.lang.String) r7
            X.Hwg.A00(r0)
        L45:
            r1 = r0
            com.facebook.aura.email.repo.EmailConnectorPermissionsJson r1 = (com.facebook.aura.email.repo.EmailConnectorPermissionsJson) r1
            boolean r0 = r1.getShowsThreadReply()
            if (r0 != 0) goto L53
            com.facebook.aura.email.model.EmailPermissions r4 = r1.toPermissions(r2)
            return r4
        L53:
            r0 = 0
            r5.L$0 = r0     // Catch: java.lang.Exception -> L6a java.util.concurrent.CancellationException -> L6f
            r5.L$1 = r1     // Catch: java.lang.Exception -> L6a java.util.concurrent.CancellationException -> L6f
            r5.label = r3     // Catch: java.lang.Exception -> L6a java.util.concurrent.CancellationException -> L6f
            java.lang.Object r0 = r6.hasActiveSender(r7, r5)     // Catch: java.lang.Exception -> L6a java.util.concurrent.CancellationException -> L6f
            if (r0 != r4) goto L64
            return r4
        L61:
            X.Hwg.A00(r0)     // Catch: java.lang.Exception -> L6a java.util.concurrent.CancellationException -> L6f
        L64:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L6a java.util.concurrent.CancellationException -> L6f
            boolean r2 = r0.booleanValue()     // Catch: java.lang.Exception -> L6a java.util.concurrent.CancellationException -> L6f
        L6a:
            com.facebook.aura.email.model.EmailPermissions r0 = r1.toPermissions(r2)
            return r0
        L6f:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailRepository.fetchPermissions(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047 A[LOOP:0: B:14:0x0041->B:16:0x0047, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchSenders(java.lang.String r26, java.lang.String r27, X.HtJ<? super com.facebook.aura.email.model.EmailPage<com.facebook.aura.email.model.EmailSender>> r28) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailRepository.fetchSenders(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (r5 < r4) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:13:0x0034, B:22:0x005b], limit reached: 37 */
    /* JADX WARN: Path cross not found for [B:22:0x005b, B:13:0x0034], limit reached: 37 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0058 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hasActiveSender(java.lang.String r11, X.HtJ<? super java.lang.Boolean> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.facebook.aura.email.repo.EmailRepository.C117251
            if (r0 == 0) goto L82
            r7 = r12
            com.facebook.aura.email.repo.EmailRepository$hasActiveSender$1 r7 = (com.facebook.aura.email.repo.EmailRepository.C117251) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L82
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r9 = r7.result
            X.Hji r8 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r6 = 1
            if (r0 == 0) goto L76
            if (r0 != r6) goto L8e
            int r5 = r7.I$1
            int r4 = r7.I$0
            java.lang.Object r3 = r7.L$1
            X.Hqv r3 = (X.C10543Hqv) r3
            java.lang.Object r11 = r7.L$0
            java.lang.String r11 = (java.lang.String) r11
            X.Hwg.A00(r9)
        L2c:
            com.facebook.aura.email.model.EmailPage r9 = (com.facebook.aura.email.model.EmailPage) r9
            X.AHD<T> r1 = r9.data
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L5b
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L5b
        L3a:
            java.lang.String r0 = r9.nextCursor
            if (r0 == 0) goto L88
            r3.element = r0
            int r5 = r5 + 1
            if (r5 >= r4) goto L88
        L44:
            T r0 = r3.element
            java.lang.String r0 = (java.lang.String) r0
            r7.L$0 = r11
            r7.L$1 = r3
            r7.I$0 = r4
            r7.I$1 = r5
            r7.I$2 = r5
            r7.label = r6
            java.lang.Object r9 = r10.fetchSenders(r11, r0, r7)
            if (r9 != r8) goto L2c
            return r8
        L5b:
            java.util.Iterator r2 = r1.iterator()
        L5f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r2.next()
            com.facebook.aura.email.model.EmailSender r0 = (com.facebook.aura.email.model.EmailSender) r0
            java.lang.String r1 = r0.status
            java.lang.String r0 = "ACTIVE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5f
            goto L89
        L76:
            X.Hwg.A00(r9)
            X.Hqv r3 = new X.Hqv
            r3.<init>()
            r4 = 10
            r5 = 0
            goto L44
        L82:
            com.facebook.aura.email.repo.EmailRepository$hasActiveSender$1 r7 = new com.facebook.aura.email.repo.EmailRepository$hasActiveSender$1
            r7.<init>(r12)
            goto L12
        L88:
            r6 = 0
        L89:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)
            return r8
        L8e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailRepository.hasActiveSender(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidate(String str) {
        List listA0X;
        synchronized (this.requestLock) {
            BLG<Map<String, Integer>> blg = this._invalidations;
            Map<String, Integer> value = blg.getValue();
            Integer num = this._invalidations.getValue().get(str);
            blg.Af8(AnonymousClass006.A11(str, Integer.valueOf((num != null ? num.intValue() : 0) + 1), value));
            Map<HoC, String> map = this.requests;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entry = (Map.Entry) itA0n.next();
                if (C7384Etj.areEqual((String) entry.getValue(), str)) {
                    AnonymousClass006.A1R(linkedHashMap, entry);
                }
            }
            listA0X = AbstractC0878AGe.A0X(linkedHashMap.keySet());
        }
        Iterator it = listA0X.iterator();
        while (it.hasNext()) {
            ((HoC) it.next()).A5w(null);
        }
        this.verificationFlight.clearAndCancelAll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refreshAvailability(java.lang.String r19, X.HtJ<? super kotlin.Unit> r20) {
        /*
            r18 = this;
            r6 = r20
            r1 = r19
            boolean r0 = r6 instanceof com.facebook.aura.email.repo.EmailRepository.C117331
            r4 = r18
            if (r0 == 0) goto Lc0
            r3 = r6
            com.facebook.aura.email.repo.EmailRepository$refreshAvailability$1 r3 = (com.facebook.aura.email.repo.EmailRepository.C117331) r3
            int r5 = r3.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r5 & r2
            if (r0 == 0) goto Lc0
            int r5 = r5 - r2
            r3.label = r5
        L18:
            java.lang.Object r5 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r7 = 0
            r15 = 1
            if (r0 == 0) goto L6e
            if (r0 != r15) goto Lc7
            java.lang.Object r1 = r3.L$0
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r5 = X.AnonymousClass001.A0q(r5)
        L2c:
            boolean r0 = r4.closed
            if (r0 != 0) goto L51
            com.facebook.aura.gateway.store.HatchGatewayPrefsStore r0 = r4.prefs
            java.lang.String r0 = r0.getHatcheryVMId()
            boolean r0 = X.C7384Etj.areEqual(r0, r1)
            if (r0 == 0) goto L51
            java.lang.Throwable r3 = X.HsJ.A00(r5)
            boolean r0 = r3 instanceof com.facebook.aura.json.NetworkException
            if (r0 == 0) goto L6c
            com.facebook.aura.json.NetworkException r3 = (com.facebook.aura.json.NetworkException) r3
        L46:
            boolean r0 = r5 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto L54
            com.facebook.aura.utils.MuseMailAvailability r0 = r4.availability
            r0.record(r1, r15)
        L51:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L54:
            if (r3 == 0) goto L51
            int r2 = r3.httpResponseCode
            r0 = 403(0x193, float:5.65E-43)
            if (r2 != r0) goto L51
            java.lang.String r2 = r3.errorCode
            java.lang.String r0 = "email_not_enabled"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L51
            com.facebook.aura.utils.MuseMailAvailability r0 = r4.availability
            r0.record(r1, r7)
            goto L51
        L6c:
            r3 = 0
            goto L46
        L6e:
            X.Hwg.A00(r5)
            boolean r0 = r4.closed
            if (r0 != 0) goto L51
            com.facebook.aura.confidentialvm.session.ConfidentialSessionGate$Companion r5 = com.facebook.aura.confidentialvm.session.ConfidentialSessionGate.Companion
            X.CGz r0 = r4.userSession
            com.facebook.aura.confidentialvm.session.ConfidentialSessionGate r0 = r5.getInstance(r0)
            boolean r0 = r0.isStandardVm()
            if (r0 == 0) goto L51
            com.facebook.aura.network.http.HatchHttpApi r5 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.email.repo.EmailDaemonPath r8 = com.facebook.aura.email.repo.EmailDaemonPath.SETTINGS
            com.facebook.aura.network.http.RequestType r9 = com.facebook.aura.network.http.RequestType.GET
            X.CGz r10 = r4.userSession
            X.HxE[] r12 = new X.HxE[r7]
            java.util.Set r14 = X.AnonymousClass004.A18()
            X.9jH r16 = X.AGH.A0E()
            com.facebook.aura.email.repo.EmailRepository$refreshAvailability$$inlined$executeJarvisRequest-1iavgos$default$1 r6 = com.facebook.aura.email.repo.EmailRepository$refreshAvailability$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r3.L$0 = r1
            r11 = 0
            r3.L$1 = r11
            r3.L$2 = r11
            r3.L$3 = r11
            r3.L$4 = r11
            r3.L$5 = r11
            r3.L$6 = r11
            r3.L$7 = r11
            r3.I$0 = r15
            r3.I$1 = r15
            r3.I$2 = r7
            r3.label = r15
            r13 = r11
            r17 = r15
            r18 = r11
            r19 = r7
            r20 = r3
            java.lang.Object r5 = r5.m1595executeBodylessJarvisRequestWithp3iPjrY(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r5 != r2) goto L2c
            return r2
        Lc0:
            com.facebook.aura.email.repo.EmailRepository$refreshAvailability$1 r3 = new com.facebook.aura.email.repo.EmailRepository$refreshAvailability$1
            r3.<init>(r6)
            goto L18
        Lc7:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailRepository.refreshAvailability(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object requireResetAccess(java.lang.String r5, X.HtJ<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.facebook.aura.email.repo.EmailRepository.C117361
            if (r0 == 0) goto L35
            r3 = r6
            com.facebook.aura.email.repo.EmailRepository$requireResetAccess$1 r3 = (com.facebook.aura.email.repo.EmailRepository.C117361) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L35
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r2 = r3.result
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L43
            X.Hwg.A00(r2)
        L1e:
            com.facebook.aura.utils.HatchUtil r0 = com.facebook.aura.utils.HatchUtil.INSTANCE
            boolean r0 = r0.isInternalSettingsEnabled()
            if (r0 == 0) goto L3b
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L29:
            X.Hwg.A00(r2)
            r0 = 0
            r3.L$0 = r0
            r3.label = r1
            r4.checkEnvironment(r5, r3)
            goto L1e
        L35:
            com.facebook.aura.email.repo.EmailRepository$requireResetAccess$1 r3 = new com.facebook.aura.email.repo.EmailRepository$requireResetAccess$1
            r3.<init>(r6)
            goto L12
        L3b:
            java.lang.String r0 = "Email reset is internal only"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L43:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailRepository.requireResetAccess(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendSetupEnd(java.lang.String r10, X.HtJ<? super kotlin.Unit> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.facebook.aura.email.repo.EmailRepository.C117381
            r4 = r9
            if (r0 == 0) goto L3b
            r9 = r11
            com.facebook.aura.email.repo.EmailRepository$sendSetupEnd$1 r9 = (com.facebook.aura.email.repo.EmailRepository.C117381) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r9.label = r2
        L13:
            java.lang.Object r3 = r9.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r9.label
            r1 = 1
            if (r0 == 0) goto L24
            if (r0 != r1) goto L41
            X.Hwg.A00(r3)
        L21:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L24:
            X.Hwg.A00(r3)
            r0 = 0
            com.facebook.aura.email.repo.EmailRepository$sendSetupEnd$2 r8 = new com.facebook.aura.email.repo.EmailRepository$sendSetupEnd$2
            r5 = r10
            r8.<init>(r10, r0)
            r9.L$0 = r0
            r9.label = r1
            r6 = 0
            r7 = r6
            java.lang.Object r0 = r4.perform(r5, r6, r7, r8, r9)
            if (r0 != r2) goto L21
            return r2
        L3b:
            com.facebook.aura.email.repo.EmailRepository$sendSetupEnd$1 r9 = new com.facebook.aura.email.repo.EmailRepository$sendSetupEnd$1
            r9.<init>(r11)
            goto L13
        L41:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailRepository.sendSetupEnd(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00b2 -> B:12:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendSetupEndWithRetry(java.lang.String r13, X.HtJ<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailRepository.sendSetupEndWithRetry(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendingPermissions(java.lang.String r21, X.HtJ<? super com.facebook.aura.email.repo.EmailConnectorPermissionsJson> r22) {
        /*
            r20 = this;
            r4 = r21
            r6 = r22
            boolean r0 = r6 instanceof com.facebook.aura.email.repo.EmailRepository.C117421
            r5 = r20
            if (r0 == 0) goto Lad
            r3 = r6
            com.facebook.aura.email.repo.EmailRepository$sendingPermissions$1 r3 = (com.facebook.aura.email.repo.EmailRepository.C117421) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lad
            int r2 = r2 - r1
            r3.label = r2
        L18:
            java.lang.Object r8 = r3.result
            X.Hji r0 = X.EnumC10460Hji.A02
            int r7 = r3.label
            r6 = 3
            r2 = 2
            r1 = 1
            if (r7 == 0) goto L32
            if (r7 == r1) goto L40
            if (r7 == r2) goto L8d
            if (r7 != r6) goto Lb4
            java.lang.Object r1 = r3.L$1
            X.Hwg.A00(r8)
        L2e:
            X.Hwg.A00(r1)
            return r1
        L32:
            X.Hwg.A00(r8)
            r3.L$0 = r4
            r3.label = r1
            java.lang.Object r6 = r5.awaitGateway(r4, r3)
            if (r6 != r0) goto L47
            return r0
        L40:
            java.lang.Object r4 = r3.L$0
            java.lang.String r4 = (java.lang.String) r4
            X.Hwg.A00(r8)
        L47:
            com.facebook.aura.network.http.HatchHttpApi r7 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            java.lang.String r6 = "muse_mail"
            com.facebook.aura.network.api.JarvisPath$ConnectorPermissions r10 = new com.facebook.aura.network.api.JarvisPath$ConnectorPermissions
            r10.<init>(r6)
            com.facebook.aura.network.http.RequestType r11 = com.facebook.aura.network.http.RequestType.GET
            X.CGz r12 = r5.userSession
            r9 = 0
            X.HxE[] r14 = new X.HxE[r9]
            java.util.Set r16 = X.AnonymousClass004.A18()
            X.9jH r18 = X.AGH.A0E()
            com.facebook.aura.email.repo.EmailRepository$sendingPermissions$$inlined$executeJarvisRequest-1iavgos$default$1 r8 = com.facebook.aura.email.repo.EmailRepository$sendingPermissions$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r3.L$0 = r4
            r13 = 0
            r3.L$1 = r13
            r3.L$2 = r13
            r3.L$3 = r13
            r3.L$4 = r13
            r3.L$5 = r13
            r3.L$6 = r13
            r3.L$7 = r13
            r3.I$0 = r1
            r3.I$1 = r1
            r3.I$2 = r9
            r3.label = r2
            r2 = 3
            r15 = r13
            r19 = r1
            r20 = r13
            r21 = r9
            r22 = r3
            r17 = r1
            java.lang.Object r1 = r7.m1595executeBodylessJarvisRequestWithp3iPjrY(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            if (r1 != r0) goto L96
            return r0
        L8d:
            java.lang.Object r4 = r3.L$0
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r1 = X.AnonymousClass001.A0q(r8)
            r2 = 3
        L96:
            r0 = 0
            r3.L$0 = r0
            r3.L$1 = r1
            r3.L$2 = r0
            r3.L$3 = r0
            r3.L$4 = r0
            r3.L$5 = r0
            r3.L$6 = r0
            r3.L$7 = r0
            r3.label = r2
            r5.checkEnvironment(r4, r3)
            goto L2e
        Lad:
            com.facebook.aura.email.repo.EmailRepository$sendingPermissions$1 r3 = new com.facebook.aura.email.repo.EmailRepository$sendingPermissions$1
            r3.<init>(r6)
            goto L18
        Lb4:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailRepository.sendingPermissions(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.8eM] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.8eM] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object attachmentImage$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(java.lang.String r17, java.lang.String r18, com.facebook.aura.email.model.EmailAttachment r19, long r20, X.HtJ<? super com.facebook.aura.email.repo.EmailInlineImage> r22) {
        /*
            r16 = this;
            r3 = r22
            r14 = r20
            r13 = r19
            r12 = r18
            r11 = r17
            boolean r0 = r3 instanceof com.facebook.aura.email.repo.EmailRepository$attachmentImage$1
            r10 = r16
            if (r0 == 0) goto L31
            r4 = r3
            com.facebook.aura.email.repo.EmailRepository$attachmentImage$1 r4 = (com.facebook.aura.email.repo.EmailRepository$attachmentImage$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L31
            int r2 = r2 - r1
            r4.label = r2
        L1e:
            java.lang.Object r2 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r6 = 1
            r5 = 2
            if (r0 == 0) goto L52
            if (r0 == r6) goto L3c
            if (r0 != r5) goto L37
            java.lang.Object r1 = r4.L$3
            X.8eM r1 = (X.C8eM) r1
            goto La4
        L31:
            com.facebook.aura.email.repo.EmailRepository$attachmentImage$1 r4 = new com.facebook.aura.email.repo.EmailRepository$attachmentImage$1
            r4.<init>(r10, r3)
            goto L1e
        L37:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L3c:
            long r14 = r4.J$0
            java.lang.Object r1 = r4.L$3
            X.8eM r1 = (X.C8eM) r1
            java.lang.Object r13 = r4.L$2
            com.facebook.aura.email.model.EmailAttachment r13 = (com.facebook.aura.email.model.EmailAttachment) r13
            java.lang.Object r12 = r4.L$1
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r4.L$0
            java.lang.String r11 = (java.lang.String) r11
            X.Hwg.A00(r2)
            goto L84
        L52:
            X.Hwg.A00(r2)
            long r0 = r13.size
            r8 = 1
            r2 = 0
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 > 0) goto Lb2
            r8 = 2097153(0x200001, double:1.0361313E-317)
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 >= 0) goto Lb2
            java.lang.String r1 = r13.mimeType
            java.lang.String r0 = "image/"
            boolean r0 = X.AnonymousClass005.A1a(r1, r0)
            if (r0 == 0) goto Lb2
            X.8eM r1 = r10.attachmentRequests
            r4.L$0 = r11
            r4.L$1 = r12
            r4.L$2 = r13
            r4.L$3 = r1
            r4.J$0 = r14
            r4.label = r6
            java.lang.Object r0 = r1.A2u(r4)
            if (r0 != r3) goto L84
            return r3
        L84:
            r0 = 0
            com.facebook.aura.email.repo.EmailRepository$attachmentImage$2$1 r9 = new com.facebook.aura.email.repo.EmailRepository$attachmentImage$2$1     // Catch: java.lang.Throwable -> Lad
            r16 = r0
            r9.<init>(r10, r11, r12, r13, r14, r16)     // Catch: java.lang.Throwable -> Lad
            r4.L$0 = r0     // Catch: java.lang.Throwable -> Lad
            r4.L$1 = r0     // Catch: java.lang.Throwable -> Lad
            r4.L$2 = r0     // Catch: java.lang.Throwable -> Lad
            r4.L$3 = r1     // Catch: java.lang.Throwable -> Lad
            r4.J$0 = r14     // Catch: java.lang.Throwable -> Lad
            r4.label = r5     // Catch: java.lang.Throwable -> Lad
            r7 = 0
            r5 = r10
            r6 = r11
            r8 = r7
            r10 = r4
            java.lang.Object r2 = r5.perform(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lad
            if (r2 != r3) goto La7
            return r3
        La4:
            X.Hwg.A00(r2)     // Catch: java.lang.Throwable -> Lad
        La7:
            com.facebook.aura.email.repo.EmailInlineImage r2 = (com.facebook.aura.email.repo.EmailInlineImage) r2     // Catch: java.lang.Throwable -> Lad
            r1.release()
            return r2
        Lad:
            r0 = move-exception
            r1.release()
            throw r0
        Lb2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailRepository.attachmentImage$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(java.lang.String, java.lang.String, com.facebook.aura.email.model.EmailAttachment, long, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object attachmentPreview(java.lang.String r11, java.lang.String r12, com.facebook.aura.email.model.EmailAttachment r13, X.HtJ<? super java.lang.String> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.facebook.aura.email.repo.EmailRepository.C117131
            r4 = r10
            if (r0 == 0) goto L41
            r10 = r14
            com.facebook.aura.email.repo.EmailRepository$attachmentPreview$1 r10 = (com.facebook.aura.email.repo.EmailRepository.C117131) r10
            int r2 = r10.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L41
            int r2 = r2 - r1
            r10.label = r2
        L13:
            java.lang.Object r3 = r10.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r10.label
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 != r1) goto L49
            X.Hwg.A00(r3)
        L21:
            com.facebook.aura.email.repo.EmailInlineImage r3 = (com.facebook.aura.email.repo.EmailInlineImage) r3
            if (r3 == 0) goto L47
            java.lang.String r2 = r3.source
            return r2
        L28:
            X.Hwg.A00(r3)
            r0 = 0
            r10.L$0 = r0
            r10.L$1 = r0
            r10.L$2 = r0
            r10.label = r1
            r8 = 16000000(0xf42400, double:7.9050503E-317)
            r5 = r11
            r6 = r12
            r7 = r13
            java.lang.Object r3 = r4.attachmentImage$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(r5, r6, r7, r8, r10)
            if (r3 != r2) goto L21
            return r2
        L41:
            com.facebook.aura.email.repo.EmailRepository$attachmentPreview$1 r10 = new com.facebook.aura.email.repo.EmailRepository$attachmentPreview$1
            r10.<init>(r14)
            goto L13
        L47:
            r2 = 0
            return r2
        L49:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailRepository.attachmentPreview(java.lang.String, java.lang.String, com.facebook.aura.email.model.EmailAttachment, X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        List listA0X;
        synchronized (this.requestLock) {
            this.closed = true;
            listA0X = AbstractC0878AGe.A0X(BGK.A01(this.resetJobs.values(), this.requests.keySet()));
        }
        Iterator it = listA0X.iterator();
        while (it.hasNext()) {
            ((HoC) it.next()).A5w(null);
        }
        HzS.A04(this.setupEndScope.AEA());
        HzS.A04(this.availabilityScope.AEA());
        this.setupEndFlight.clearAndCancelAll();
        this.verificationFlight.clearAndCancelAll();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deleteMessage(java.lang.String r10, java.lang.String r11, X.HtJ<? super kotlin.Unit> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.facebook.aura.email.repo.EmailRepository.C117181
            r4 = r9
            if (r0 == 0) goto L3d
            r9 = r12
            com.facebook.aura.email.repo.EmailRepository$deleteMessage$1 r9 = (com.facebook.aura.email.repo.EmailRepository.C117181) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r9.label = r2
        L13:
            java.lang.Object r3 = r9.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r9.label
            r1 = 1
            if (r0 == 0) goto L24
            if (r0 != r1) goto L43
            X.Hwg.A00(r3)
        L21:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L24:
            X.Hwg.A00(r3)
            r0 = 0
            com.facebook.aura.email.repo.EmailRepository$deleteMessage$2 r8 = new com.facebook.aura.email.repo.EmailRepository$deleteMessage$2
            r5 = r10
            r8.<init>(r10, r11, r0)
            r9.L$0 = r0
            r9.L$1 = r0
            r9.label = r1
            r6 = 0
            r7 = r6
            java.lang.Object r0 = r4.perform(r5, r6, r7, r8, r9)
            if (r0 != r2) goto L21
            return r2
        L3d:
            com.facebook.aura.email.repo.EmailRepository$deleteMessage$1 r9 = new com.facebook.aura.email.repo.EmailRepository$deleteMessage$1
            r9.<init>(r12)
            goto L13
        L43:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailRepository.deleteMessage(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.8eM] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.8eM] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object downloadAttachment(android.content.Context r13, java.lang.String r14, java.lang.String r15, com.facebook.aura.email.model.EmailAttachment r16, X.HtJ<? super kotlin.Unit> r17) {
        /*
            r12 = this;
            r3 = r17
            r10 = r16
            r9 = r15
            r8 = r14
            r11 = r13
            boolean r0 = r3 instanceof com.facebook.aura.email.repo.EmailRepository.C117201
            r7 = r12
            if (r0 == 0) goto L2d
            r5 = r3
            com.facebook.aura.email.repo.EmailRepository$downloadAttachment$1 r5 = (com.facebook.aura.email.repo.EmailRepository.C117201) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2d
            int r2 = r2 - r1
            r5.label = r2
        L1a:
            java.lang.Object r4 = r5.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r1 = r5.label
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L50
            if (r1 == r0) goto L38
            if (r1 != r2) goto L33
            java.lang.Object r1 = r5.L$4
            X.8eM r1 = (X.C8eM) r1
            goto L85
        L2d:
            com.facebook.aura.email.repo.EmailRepository$downloadAttachment$1 r5 = new com.facebook.aura.email.repo.EmailRepository$downloadAttachment$1
            r5.<init>(r3)
            goto L1a
        L33:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L38:
            java.lang.Object r1 = r5.L$4
            X.8eM r1 = (X.C8eM) r1
            java.lang.Object r10 = r5.L$3
            com.facebook.aura.email.model.EmailAttachment r10 = (com.facebook.aura.email.model.EmailAttachment) r10
            java.lang.Object r9 = r5.L$2
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r5.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r11 = r5.L$0
            android.content.Context r11 = (android.content.Context) r11
            X.Hwg.A00(r4)
            goto L68
        L50:
            X.Hwg.A00(r4)
            X.8eM r1 = r12.attachmentRequests
            r5.L$0 = r13
            r5.L$1 = r14
            r5.L$2 = r15
            r5.L$3 = r10
            r5.L$4 = r1
            r5.label = r0
            java.lang.Object r0 = r1.A2u(r5)
            if (r0 != r3) goto L68
            return r3
        L68:
            r12 = 0
            com.facebook.aura.email.repo.EmailRepository$downloadAttachment$2$1 r6 = new com.facebook.aura.email.repo.EmailRepository$downloadAttachment$2$1     // Catch: java.lang.Throwable -> L8e
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L8e
            r5.L$0 = r12     // Catch: java.lang.Throwable -> L8e
            r5.L$1 = r12     // Catch: java.lang.Throwable -> L8e
            r5.L$2 = r12     // Catch: java.lang.Throwable -> L8e
            r5.L$3 = r12     // Catch: java.lang.Throwable -> L8e
            r5.L$4 = r1     // Catch: java.lang.Throwable -> L8e
            r5.label = r2     // Catch: java.lang.Throwable -> L8e
            r9 = 0
            r10 = r9
            r11 = r6
            r12 = r5
            java.lang.Object r0 = r7.perform(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L8e
            if (r0 != r3) goto L88
            return r3
        L85:
            X.Hwg.A00(r4)     // Catch: java.lang.Throwable -> L8e
        L88:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L8e
            r1.release()
            return r0
        L8e:
            r0 = move-exception
            r1.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailRepository.downloadAttachment(android.content.Context, java.lang.String, java.lang.String, com.facebook.aura.email.model.EmailAttachment, X.HtJ):java.lang.Object");
    }

    public final C1BN<HatchGatewayConnectionState> getConnectionState() {
        return HatchGatewayServiceManager.INSTANCE.getGateway(this.userSession).connectionState;
    }

    public final String getEnvironmentId() {
        return this.prefs.getHatcheryVMId();
    }

    public final C1BN<Map<String, Integer>> getInvalidations() {
        return this.invalidations;
    }

    public final boolean isMessageDeleteEnabled() {
        return HatchUtils.INSTANCE.isEmailDeleteEnabled();
    }

    public final String pendingResetAddress(String str) {
        String str2;
        C7384Etj.A0Y(str, 0);
        synchronized (this.requestLock) {
            if (!this.pendingResets.containsKey(str)) {
                this.pendingResets.put(str, this.resetPrefs.getString(FGI.A0M("email_pending_reset:", str), null));
            }
            str2 = this.pendingResets.get(str);
        }
        return str2;
    }

    public final Object requestOwnerChallenge(String str, String str2, HtJ<? super EmailOwnerVerification> htJ) {
        return perform(str, false, false, new EmailRepository$requestOwnerChallenge$$inlined$ownerVerification$1(this, str, EmailDaemonPath.OWNER_CHALLENGES, new EmailOwnerChallengeRequestJson(str2), null), htJ);
    }

    public final void startAvailabilityTriggers() {
        HoC hoC;
        synchronized (this.requestLock) {
            if (!this.closed && ((hoC = this.availabilityTriggers) == null || !hoC.isActive())) {
                this.availabilityTriggers = AnonymousClass001.A11(new EmailRepository$startAvailabilityTriggers$1$1(this, null), this.availabilityScope);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object verify(java.lang.String r8, java.lang.String r9, X.HtJ<? super com.facebook.aura.email.model.EmailSender> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.facebook.aura.email.repo.EmailRepository.C117511
            if (r0 == 0) goto L48
            r6 = r10
            com.facebook.aura.email.repo.EmailRepository$verify$1 r6 = (com.facebook.aura.email.repo.EmailRepository.C117511) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L2b
            if (r0 != r4) goto L64
            X.Hwg.A00(r1)
        L20:
            com.facebook.aura.common.coroutines.SingleFlightResult r1 = (com.facebook.aura.common.coroutines.SingleFlightResult) r1
            boolean r0 = r1 instanceof com.facebook.aura.common.coroutines.SingleFlightResult.Result
            if (r0 == 0) goto L4e
            com.facebook.aura.common.coroutines.SingleFlightResult$Result r1 = (com.facebook.aura.common.coroutines.SingleFlightResult.Result) r1
            T r5 = r1.value
            return r5
        L2b:
            X.Hwg.A00(r1)
            com.facebook.aura.common.coroutines.SingleFlight r3 = r7.verificationFlight
            X.HxE r2 = new X.HxE
            r2.<init>(r8, r9)
            r1 = 0
            com.facebook.aura.email.repo.EmailRepository$verify$result$1 r0 = new com.facebook.aura.email.repo.EmailRepository$verify$result$1
            r0.<init>(r7, r8, r9, r1)
            r6.L$0 = r1
            r6.L$1 = r1
            r6.label = r4
            java.lang.Object r1 = r3.invoke(r2, r0, r6)
            if (r1 != r5) goto L20
            return r5
        L48:
            com.facebook.aura.email.repo.EmailRepository$verify$1 r6 = new com.facebook.aura.email.repo.EmailRepository$verify$1
            r6.<init>(r10)
            goto L12
        L4e:
            com.facebook.aura.common.coroutines.SingleFlightResult$Skipped r0 = com.facebook.aura.common.coroutines.SingleFlightResult.Skipped.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L5e
            java.lang.String r0 = "Email verification was skipped"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L5e:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L64:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailRepository.verify(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public final EmailRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (EmailRepository) abstractC3358CGz.A03(EmailRepository.class, new EmailRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ EmailRepository(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }

    public static final /* synthetic */ Object access$checkEnvironment(EmailRepository emailRepository, String str, HtJ htJ) {
        return emailRepository.checkEnvironment(str, htJ);
    }

    public static final /* synthetic */ Object access$fetchAttachment(EmailRepository emailRepository, String str, String str2, EmailAttachment emailAttachment, long j, HtJ htJ) {
        return emailRepository.fetchAttachment(str, str2, emailAttachment, j, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object checkEnvironment(String str, HtJ<? super Unit> htJ) {
        HzS.A05(htJ.getContext());
        if (!this.closed && C7384Etj.areEqual(this.prefs.getHatcheryVMId(), str) && HatchUtils.INSTANCE.isEmailEnabled(this.userSession)) {
            return Unit.INSTANCE;
        }
        throw new CancellationException("Email environment changed");
    }

    private final /* synthetic */ <T> Object ownerVerification(String str, JarvisPath jarvisPath, T t, HtJ<? super EmailOwnerVerification> htJ) {
        C7384Etj.A0P();
        throw F60.createAndThrow();
    }

    public static /* synthetic */ Object perform$default(EmailRepository emailRepository, String str, boolean z, boolean z2, G0U g0u, HtJ htJ, int i, Object obj) {
        return emailRepository.perform(str, AnonymousClass001.A1Q(i, z), AnonymousClass005.A1O(i, z2), g0u, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object savePendingReset(String str, String str2, HtJ<? super Unit> htJ) {
        Object objA00 = GAo.A00(htJ, AnonymousClass001.A0y(), new C117372(str, str2, null));
        return objA00 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA00;
    }

    public final Object verifyOwnerCode(String str, String str2, String str3, HtJ<? super EmailOwnerVerification> htJ) {
        int length;
        if (!C7BY.A0j(str2) && (length = str3.length()) == 6) {
            int i = 0;
            do {
                char cCharAt = str3.charAt(i);
                if ('0' <= cCharAt && cCharAt < ':') {
                    i++;
                }
            } while (i < length);
            return perform(str, false, false, new EmailRepository$verifyOwnerCode$$inlined$ownerVerification$1(this, str, new EmailOwnerCodePath(str2), new EmailOwnerCodeRequestJson(str3), null), htJ);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public EmailRepository(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        OnDuplicateCall.Join join = OnDuplicateCall.Join.INSTANCE;
        this.verificationFlight = SingleFlightKt.SingleFlight(abstractC3358CGz, join, false);
        this.requestLock = new Object();
        this.requests = new LinkedHashMap();
        this.resetJobs = new LinkedHashMap();
        this.creatingMailboxes = new LinkedHashSet();
        this.pendingResets = new LinkedHashMap();
        this.resetPrefs = HatchPrefsStore.INSTANCE.userPrefs(abstractC3358CGz);
        C9286GCn c9286GCnA01 = HnJ.A01(AGH.A0E());
        this._invalidations = c9286GCnA01;
        this.invalidations = new C3Pi(null, c9286GCnA01);
        this.stubLock = new Object();
        int i = GCQ.A00;
        this.attachmentRequests = new C27i(1);
        C8eO c8eO = new C8eO(null);
        AuraDispatchers auraDispatchers = AuraDispatchers.INSTANCE;
        this.setupEndScope = Hxb.A02(c8eO.plus(auraDispatchers.io()));
        this.setupEndFlight = SingleFlightKt.SingleFlight(abstractC3358CGz, join, false);
        this.availability = MuseMailAvailability.Companion.getInstance(abstractC3358CGz);
        this.availabilityScope = Hxb.A02(new C8eO(null).plus(auraDispatchers.io()));
        this.prefs = HatchGatewayPrefsStore.Companion.getInstance(abstractC3358CGz);
    }
}
