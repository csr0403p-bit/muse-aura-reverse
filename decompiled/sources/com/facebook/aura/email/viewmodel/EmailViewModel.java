package com.facebook.aura.email.viewmodel;

import X.A3q;
import X.AEs;
import X.AEu;
import X.AGH;
import X.AGI;
import X.AHD;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass441;
import X.BFI;
import X.BLG;
import X.BLL;
import X.BQG;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C10543Hqv;
import X.C10650I0u;
import X.C1BN;
import X.C20Z;
import X.C27a;
import X.C27i;
import X.C3Es;
import X.C3Pi;
import X.C3UX;
import X.C7384Etj;
import X.C7BY;
import X.C7Bq;
import X.C7LE;
import X.C8eO;
import X.C9286GCn;
import X.DCl;
import X.EnumC10460Hji;
import X.EsN;
import X.F1F;
import X.G0U;
import X.G0V;
import X.GAX;
import X.GCQ;
import X.HnJ;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.Hxb;
import X.HzP;
import android.content.Context;
import android.util.Patterns;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.common.video.HatchTransportHttpDataSourceKt;
import com.facebook.aura.components.reactions.AuraPressureReleaseKt;
import com.facebook.aura.components.reactions.AuraRibbonArcKt;
import com.facebook.aura.components.reactions.AuraVictoryGleamKt;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.email.model.EmailAddressAvailability;
import com.facebook.aura.email.model.EmailAttachment;
import com.facebook.aura.email.model.EmailMailbox;
import com.facebook.aura.email.model.EmailMessage;
import com.facebook.aura.email.model.EmailOwnerVerification;
import com.facebook.aura.email.model.EmailPage;
import com.facebook.aura.email.model.EmailPermissionMethod;
import com.facebook.aura.email.model.EmailPermissions;
import com.facebook.aura.email.model.EmailSendPermission;
import com.facebook.aura.email.model.EmailSender;
import com.facebook.aura.email.model.EmailSettings;
import com.facebook.aura.email.model.EmailSettingsCopy;
import com.facebook.aura.email.model.EmailSignature;
import com.facebook.aura.email.model.EmailSummary;
import com.facebook.aura.email.model.EmailThread;
import com.facebook.aura.email.repo.EmailRepository;
import com.facebook.aura.email.viewmodel.EmailThreadUiState;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.gateway.connection.ConnectionReducerKt;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepositoryJsonKt;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.repo.HatchConnectorCatalogRepository;
import com.facebook.aura.toast.api.ToastApi;
import com.facebook.aura.utils.HatchUtils;
import com.facebook.aura.utils.MC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class EmailViewModel extends AEs {
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final int MESSAGE_FETCH_CONCURRENCY = 4;
    public final BLG<Set<HxE<String, Integer>>> _attachmentDownloads;
    public final BLG<EmailSettingsCopy> _settingsCopy;
    public final BLG<EmailState> _state;
    public final C1BN<Set<HxE<String, Integer>>> attachmentDownloads;
    public HoC availabilityJob;
    public final HatchConnectorCatalogRepository connectorCatalog;
    public String defaultSenderName;
    public Map<String, EmailSummary> deletedMessages;
    public final Set<String> deletingMessageIds;
    public boolean editingMailbox;
    public final String environmentId;
    public final SingleFlight flight;
    public int formGeneration;
    public String formKey;
    public int generation;
    public boolean handleEdited;
    public boolean hasCreationDraft;
    public HoC inboxJob;
    public List<EmailSummary> listedThreads;
    public boolean nameEdited;
    public final C3UX operations;
    public final C27a operationsJob;
    public String ownerFormKey;
    public HoC ownerJob;
    public HoC ownerPrefillJob;
    public int ownerRequestGeneration;
    public boolean ownerStepEndsSetup;
    public HoC permissionsJob;
    public final C1BN<String> productName;
    public final EmailRepository repository;
    public final C1BN<EmailSettingsCopy> settingsCopy;
    public boolean settingsCopyReceived;
    public HoC settingsJob;
    public String setupAgentName;
    public HoC setupJob;
    public boolean setupRateLimited;
    public final C1BN<EmailState> state;
    public String suggestedSenderName;
    public int threadGeneration;
    public String threadKey;

    @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel$1", f = "EmailViewModel.kt", l = {VoiceSelectionRepositoryJsonKt.MAX_VOICE_ID_LENGTH}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.viewmodel.EmailViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return EmailViewModel.this.new AnonymousClass1(htJ);
        }

        /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object] */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final C10543Hqv c10543Hqv = new C10543Hqv();
                c10543Hqv.element = EmailViewModel.this.repository.invalidations.getValue().get(EmailViewModel.this.environmentId);
                final EmailViewModel emailViewModel = EmailViewModel.this;
                C1BN<Map<String, Integer>> c1bn = emailViewModel.repository.invalidations;
                C20Z<? super Map<String, Integer>> c20z = new C20Z() { // from class: com.facebook.aura.email.viewmodel.EmailViewModel.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((Map<String, Integer>) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(Map<String, Integer> map, HtJ<? super Unit> htJ) {
                        EmailState value;
                        EmailState emailState;
                        T t = (T) map.get(emailViewModel.environmentId);
                        if (!C7384Etj.areEqual(t, c10543Hqv.element)) {
                            c10543Hqv.element = t;
                            EmailViewModel emailViewModel2 = emailViewModel;
                            boolean zIsResetting = emailViewModel2.repository.isResetting(emailViewModel2.environmentId);
                            EmailViewModel emailViewModel3 = emailViewModel;
                            String strPendingResetAddress = emailViewModel3.repository.pendingResetAddress(emailViewModel3.environmentId);
                            if (zIsResetting) {
                                Iterator<HoC> it = emailViewModel.operationsJob.ADc().iterator();
                                while (it.hasNext()) {
                                    it.next().A5w(null);
                                }
                                emailViewModel.flight.clearAndCancelAll();
                                EmailViewModel emailViewModel4 = emailViewModel;
                                emailViewModel4.generation++;
                                emailViewModel4.threadGeneration++;
                                emailViewModel4.threadKey = null;
                                emailViewModel4.listedThreads = C0881AGi.A00;
                                emailViewModel4.deletedMessages = AGH.A0E();
                                emailViewModel4.formGeneration++;
                                emailViewModel4.hasCreationDraft = false;
                                emailViewModel4.formKey = null;
                            }
                            BLG<EmailState> blg = emailViewModel._state;
                            do {
                                value = blg.getValue();
                                EmailState emailState2 = value;
                                if (!zIsResetting) {
                                    emailState = EmailState.copy$default(emailState2, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, strPendingResetAddress, false, null, false, null, null, -1, 14417919, null);
                                } else {
                                    emailState = new EmailState(false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, strPendingResetAddress, false, null, zIsResetting, emailState2.deleteError, emailState2.mailboxDeletedKey, -2, 1835007, null);
                                }
                            } while (!blg.A6e(value, emailState));
                            if (!zIsResetting && strPendingResetAddress == null) {
                                emailViewModel.refresh();
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.L$0 = null;
                this.label = 1;
                if (c1bn.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return EmailViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Factory extends AuraViewModelFactory<EmailViewModel> {
        public final String environmentId;
        public final AbstractC3358CGz session;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public EmailViewModel create() {
            return new EmailViewModel(EmailRepository.Companion.getInstance(this.session), this.environmentId, this.session);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str) {
            AnonymousClass003.A0u(abstractC3358CGz, str);
            this.session = abstractC3358CGz;
            this.environmentId = str;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel$addSender$1", f = "EmailViewModel.kt", l = {825}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.viewmodel.EmailViewModel$addSender$1, reason: invalid class name and case insensitive filesystem */
    public final class C118111 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $address;
        public final /* synthetic */ String $key;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118111(String str, String str2, HtJ<? super C118111> htJ) {
            super(1, htJ);
            this.$address = str;
            this.$key = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return EmailViewModel.this.new C118111(this.$address, this.$key, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EmailState value;
            EmailState emailState;
            ArrayList arrayList;
            EmailState value2;
            Object objVerify = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(objVerify);
                EmailViewModel emailViewModel = EmailViewModel.this;
                EmailRepository emailRepository = emailViewModel.repository;
                String str = emailViewModel.environmentId;
                String strA0l = AnonymousClass002.A0l(this.$address);
                this.label = 1;
                objVerify = emailRepository.verify(str, strA0l, this);
                if (objVerify == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(objVerify);
            }
            EmailSender emailSender = (EmailSender) objVerify;
            BLG<EmailState> blg = EmailViewModel.this._state;
            do {
                value = blg.getValue();
                emailState = value;
                AHD<EmailSender> ahd = emailState.senders;
                arrayList = new ArrayList();
                for (Object obj2 : ahd) {
                    AnonymousClass006.A1O(((EmailSender) obj2).id, emailSender.id, obj2, arrayList);
                }
            } while (!blg.A6e(value, EmailState.copy$default(emailState, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, AGI.A07(AbstractC0878AGe.A0Q(emailSender, arrayList)), null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -16777217, 16777215, null)));
            BLG<EmailState> blg2 = EmailViewModel.this._state;
            String str2 = this.$key;
            do {
                value2 = blg2.getValue();
            } while (!blg2.A6e(value2, EmailState.copy$default(value2, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, str2, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -536870913, 16777215, null)));
            return Unit.INSTANCE;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C118111) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel", f = "EmailViewModel.kt", l = {304}, m = "awaitLaunchDestination", v = 2)
    /* renamed from: com.facebook.aura.email.viewmodel.EmailViewModel$awaitLaunchDestination$1, reason: invalid class name and case insensitive filesystem */
    public final class C118121 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C118121(HtJ<? super C118121> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EmailViewModel.this.awaitLaunchDestination(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel$checkAddressAvailability$3", f = "EmailViewModel.kt", l = {AuraPressureReleaseKt.PRESSURE_TOTAL_MS, 621}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.viewmodel.EmailViewModel$checkAddressAvailability$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ int $current;
        public final /* synthetic */ String $handle;
        public final /* synthetic */ EmailState $s;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, EmailState emailState, int i, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$handle = str;
            this.$s = emailState;
            this.$current = i;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return EmailViewModel.this.new AnonymousClass3(this.$handle, this.$s, this.$current, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EmailAddressAvailability emailAddressAvailability;
            int i;
            EmailViewModel emailViewModel;
            BLG<EmailState> blg;
            EmailState value;
            Object objAddressAvailability = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i2 = this.label;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception unused) {
                emailAddressAvailability = EmailAddressAvailability.FAILED;
            }
            if (i2 == 0) {
                Hwg.A00(objAddressAvailability);
                this.label = 1;
                if (C7Bq.A01(300L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(objAddressAvailability);
                    emailAddressAvailability = (EmailAddressAvailability) objAddressAvailability;
                    i = this.$current;
                    emailViewModel = EmailViewModel.this;
                    if (i == emailViewModel.formGeneration && C7384Etj.areEqual(AnonymousClass006.A0d(emailViewModel).getNormalizedHandle(), this.$handle) && C7384Etj.areEqual(AnonymousClass006.A0d(EmailViewModel.this).domain, this.$s.domain)) {
                        blg = EmailViewModel.this._state;
                        do {
                            value = blg.getValue();
                        } while (!blg.A6e(value, EmailState.copy$default(value, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, emailAddressAvailability, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -262145, 16777215, null)));
                    }
                    return Unit.INSTANCE;
                }
                Hwg.A00(objAddressAvailability);
            }
            EmailViewModel emailViewModel2 = EmailViewModel.this;
            EmailRepository emailRepository = emailViewModel2.repository;
            String str = emailViewModel2.environmentId;
            String str2 = this.$handle;
            String str3 = this.$s.domain;
            this.label = 2;
            objAddressAvailability = emailRepository.addressAvailability(str, str2, str3, this);
            if (objAddressAvailability == enumC10460Hji) {
                return enumC10460Hji;
            }
            emailAddressAvailability = (EmailAddressAvailability) objAddressAvailability;
            i = this.$current;
            emailViewModel = EmailViewModel.this;
            if (i == emailViewModel.formGeneration) {
                blg = EmailViewModel.this._state;
                do {
                    value = blg.getValue();
                } while (!blg.A6e(value, EmailState.copy$default(value, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, emailAddressAvailability, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -262145, 16777215, null)));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel$confirmOwner$1", f = "EmailViewModel.kt", l = {1000}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.viewmodel.EmailViewModel$confirmOwner$1, reason: invalid class name and case insensitive filesystem */
    public final class C118131 extends AbstractC07127nr implements G0U<HtJ<? super EmailOwnerVerification>, Object> {
        public final /* synthetic */ String $recipient;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118131(String str, HtJ<? super C118131> htJ) {
            super(1, htJ);
            this.$recipient = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return EmailViewModel.this.new C118131(this.$recipient, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                EmailViewModel emailViewModel = EmailViewModel.this;
                EmailRepository emailRepository = emailViewModel.repository;
                String str = emailViewModel.environmentId;
                String strA0l = AnonymousClass002.A0l(this.$recipient);
                this.label = 1;
                obj = emailRepository.requestOwnerChallenge(str, strA0l, this);
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
        public final Object invoke(HtJ<? super EmailOwnerVerification> htJ) {
            return ((C118131) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel$deleteMailbox$2", f = "EmailViewModel.kt", l = {1184}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.viewmodel.EmailViewModel$deleteMailbox$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ EmailMailbox $expectedMailbox;
        public final /* synthetic */ String $failureMessage;
        public final /* synthetic */ boolean $fromReset;
        public final /* synthetic */ String $key;
        public final /* synthetic */ String $successMessage;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(EmailMailbox emailMailbox, String str, String str2, boolean z, String str3, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$expectedMailbox = emailMailbox;
            this.$successMessage = str;
            this.$failureMessage = str2;
            this.$fromReset = z;
            this.$key = str3;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return EmailViewModel.this.new AnonymousClass2(this.$expectedMailbox, this.$successMessage, this.$failureMessage, this.$fromReset, this.$key, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EmailState value;
            EmailState value2;
            EmailState value3;
            AHI ahi;
            EmailState value4;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        Hwg.A00(obj);
                        EmailViewModel emailViewModel = EmailViewModel.this;
                        EmailRepository emailRepository = emailViewModel.repository;
                        String str = emailViewModel.environmentId;
                        EmailMailbox emailMailbox = this.$expectedMailbox;
                        this.label = 1;
                        if (emailRepository.deleteMailbox(str, emailMailbox, this) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } else {
                        if (i != 1) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(obj);
                    }
                    EmailViewModel emailViewModel2 = EmailViewModel.this;
                    emailViewModel2.listedThreads = C0881AGi.A00;
                    emailViewModel2.deletedMessages = AGH.A0E();
                    BLG<EmailState> blg = emailViewModel2._state;
                    String str2 = this.$key;
                    do {
                        value3 = blg.getValue();
                        ahi = AHI.A01;
                    } while (!blg.A6e(value3, EmailState.copy$default(value3, false, false, false, null, ahi, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, ahi, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, str2, -50331705, 8388607, null)));
                    ToastApi.INSTANCE.showToast(this.$successMessage);
                    EmailViewModel.this.refresh();
                    EmailViewModel emailViewModel3 = EmailViewModel.this;
                    BLG<EmailState> blg2 = emailViewModel3._state;
                    do {
                        value4 = blg2.getValue();
                    } while (!blg2.A6e(value4, EmailState.copy$default(value4, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, emailViewModel3.repository.pendingResetAddress(emailViewModel3.environmentId), false, null, false, null, null, -1, 14417919, null)));
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    String str3 = this.$failureMessage;
                    if (str3 != null) {
                        ToastApi.INSTANCE.showToast(str3);
                    } else {
                        NetworkException networkException = e2 instanceof NetworkException ? (NetworkException) e2 : null;
                        EmailError emailErrorErrorFor = (networkException == null || networkException.httpResponseCode != 503) ? EmailViewModel.this.errorFor(e2, EmailError.DELETE) : EmailError.DELETE_RESET;
                        BLG<EmailState> blg3 = EmailViewModel.this._state;
                        do {
                            value = blg3.getValue();
                        } while (!blg3.A6e(value, EmailState.copy$default(value, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, emailErrorErrorFor, null, -1, 12582911, null)));
                    }
                    EmailViewModel emailViewModel4 = EmailViewModel.this;
                    BLG<EmailState> blg4 = emailViewModel4._state;
                    do {
                        value2 = blg4.getValue();
                    } while (!blg4.A6e(value2, EmailState.copy$default(value2, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, emailViewModel4.repository.pendingResetAddress(emailViewModel4.environmentId), false, null, false, null, null, -1, 14417919, null)));
                }
                if (this.$fromReset) {
                    EmailViewModel.this.loadMailboxForReset();
                }
                return Unit.INSTANCE;
            } finally {
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel$deleteMessage$4", f = "EmailViewModel.kt", l = {777, AuraVictoryGleamKt.VICTORY_TOTAL_MS}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.viewmodel.EmailViewModel$deleteMessage$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $failureMessage;
        public final /* synthetic */ String $messageId;
        public final /* synthetic */ String $successMessage;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, String str2, String str3, HtJ<? super AnonymousClass4> htJ) {
            super(2, htJ);
            this.$messageId = str;
            this.$successMessage = str2;
            this.$failureMessage = str3;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return EmailViewModel.this.new AnonymousClass4(this.$messageId, this.$successMessage, this.$failureMessage, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EmailState value;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                try {
                    try {
                    } catch (CancellationException e) {
                        throw e;
                    }
                } catch (Exception unused) {
                    EmailViewModel emailViewModel = EmailViewModel.this;
                    emailViewModel.deletedMessages = AGH.A09(this.$messageId, emailViewModel.deletedMessages);
                    EmailViewModel emailViewModel2 = EmailViewModel.this;
                    BLG<EmailState> blg = emailViewModel2._state;
                    do {
                        value = blg.getValue();
                    } while (!blg.A6e(value, EmailState.copy$default(value, false, false, false, null, emailViewModel2.visibleThreads(), null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -17, 16777215, null)));
                    ToastApi.INSTANCE.showToast(this.$failureMessage);
                }
                if (i == 0) {
                    Hwg.A00(obj);
                    EmailViewModel emailViewModel3 = EmailViewModel.this;
                    EmailRepository emailRepository = emailViewModel3.repository;
                    String str = emailViewModel3.environmentId;
                    String str2 = this.$messageId;
                    this.label = 1;
                    if (emailRepository.deleteMessage(str, str2, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(obj);
                        EmailViewModel.this.refresh();
                        EmailViewModel.this.deletingMessageIds.remove(this.$messageId);
                        return Unit.INSTANCE;
                    }
                    Hwg.A00(obj);
                }
                ToastApi.INSTANCE.showToast(this.$successMessage);
                EmailViewModel emailViewModel4 = EmailViewModel.this;
                emailViewModel4.generation++;
                HoC hoC = emailViewModel4.inboxJob;
                if (hoC != null) {
                    this.label = 2;
                    if (hoC.APQ(this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
                EmailViewModel.this.refresh();
                EmailViewModel.this.deletingMessageIds.remove(this.$messageId);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                EmailViewModel.this.deletingMessageIds.remove(this.$messageId);
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass4) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel$downloadAttachment$2", f = "EmailViewModel.kt", l = {MC.hatch_android_reactions.__CONFIG__}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.viewmodel.EmailViewModel$downloadAttachment$2, reason: invalid class name and case insensitive filesystem */
    public final class C118142 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ EmailAttachment $attachment;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $failureMessage;
        public final /* synthetic */ HxE<String, Integer> $key;
        public final /* synthetic */ String $messageId;
        public final /* synthetic */ String $successMessage;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118142(Context context, String str, EmailAttachment emailAttachment, String str2, String str3, HxE<String, Integer> hxE, HtJ<? super C118142> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$messageId = str;
            this.$attachment = emailAttachment;
            this.$successMessage = str2;
            this.$failureMessage = str3;
            this.$key = hxE;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return EmailViewModel.this.new C118142(this.$context, this.$messageId, this.$attachment, this.$successMessage, this.$failureMessage, this.$key, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        Hwg.A00(obj);
                        EmailRepository emailRepository = EmailViewModel.this.repository;
                        Context contextA0I = AnonymousClass001.A0I(this.$context);
                        String str = EmailViewModel.this.environmentId;
                        String str2 = this.$messageId;
                        EmailAttachment emailAttachment = this.$attachment;
                        this.label = 1;
                        if (emailRepository.downloadAttachment(contextA0I, str, str2, emailAttachment, this) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } else {
                        if (i != 1) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(obj);
                    }
                    ToastApi.INSTANCE.showToast(this.$successMessage);
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception unused) {
                    ToastApi.INSTANCE.showToast(this.$failureMessage);
                }
                BLG<Set<HxE<String, Integer>>> blg = EmailViewModel.this._attachmentDownloads;
                while (!AnonymousClass007.A1N(this.$key, blg)) {
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                BLG<Set<HxE<String, Integer>>> blg2 = EmailViewModel.this._attachmentDownloads;
                while (!AnonymousClass007.A1N(this.$key, blg2)) {
                }
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C118142) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel$loadMailboxForReset$2", f = "EmailViewModel.kt", l = {352}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.viewmodel.EmailViewModel$loadMailboxForReset$2, reason: invalid class name and case insensitive filesystem */
    public final class C118152 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C118152(HtJ<? super C118152> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return EmailViewModel.this.new C118152(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EmailState value;
            EmailState value2;
            Object objMailboxForReset = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(objMailboxForReset);
                    EmailViewModel emailViewModel = EmailViewModel.this;
                    EmailRepository emailRepository = emailViewModel.repository;
                    String str = emailViewModel.environmentId;
                    this.label = 1;
                    objMailboxForReset = emailRepository.mailboxForReset(str, this);
                    if (objMailboxForReset == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(objMailboxForReset);
                }
                EmailMailbox emailMailbox = (EmailMailbox) objMailboxForReset;
                BLG<EmailState> blg = EmailViewModel.this._state;
                do {
                    value2 = blg.getValue();
                } while (!blg.A6e(value2, EmailState.copy$default(value2, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, true, emailMailbox, false, null, null, -1, 15204351, null)));
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                EmailViewModel emailViewModel2 = EmailViewModel.this;
                BLG<EmailState> blg2 = emailViewModel2._state;
                do {
                    value = blg2.getValue();
                } while (!blg2.A6e(value, EmailState.copy$default(value, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, emailViewModel2.errorFor(e2, EmailError.DELETE), null, -1, 12582911, null)));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return EmailViewModel.this.new C118152(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel$loadMore$2", f = "EmailViewModel.kt", l = {432}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.viewmodel.EmailViewModel$loadMore$2, reason: invalid class name and case insensitive filesystem */
    public final class C118162 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ int $current;
        public final /* synthetic */ String $cursor;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118162(String str, int i, HtJ<? super C118162> htJ) {
            super(2, htJ);
            this.$cursor = str;
            this.$current = i;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return EmailViewModel.this.new C118162(this.$cursor, this.$current, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EmailState value;
            EmailState value2;
            EmailState value3;
            EmailState value4;
            EmailState emailState;
            AHD ahdVisibleThreads;
            String str;
            Object objThreads = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        Hwg.A00(objThreads);
                        EmailViewModel emailViewModel = EmailViewModel.this;
                        EmailRepository emailRepository = emailViewModel.repository;
                        String str2 = emailViewModel.environmentId;
                        String str3 = this.$cursor;
                        this.label = 1;
                        objThreads = emailRepository.threads(str2, str3, this);
                        if (objThreads == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } else {
                        if (i != 1) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(objThreads);
                    }
                    EmailPage emailPage = (EmailPage) objThreads;
                    int i2 = this.$current;
                    EmailViewModel emailViewModel2 = EmailViewModel.this;
                    if (i2 == emailViewModel2.generation) {
                        ArrayList arrayListA0P = AbstractC0878AGe.A0P(emailPage.data, emailViewModel2.listedThreads);
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList = new ArrayList();
                        Iterator it = arrayListA0P.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            AnonymousClass006.A1P(((EmailSummary) next).id, next, hashSet, arrayList);
                        }
                        emailViewModel2.listedThreads = arrayList;
                        EmailViewModel emailViewModel3 = EmailViewModel.this;
                        BLG<EmailState> blg = emailViewModel3._state;
                        String str4 = this.$cursor;
                        do {
                            value4 = blg.getValue();
                            emailState = value4;
                            ahdVisibleThreads = emailViewModel3.visibleThreads();
                            String str5 = emailPage.nextCursor;
                            str = null;
                            if (!C7384Etj.areEqual(str5, str4)) {
                                str = str5;
                            }
                        } while (!blg.A6e(value4, EmailState.copy$default(emailState, false, false, false, null, ahdVisibleThreads, str, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -177, 16777215, null)));
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    int i3 = this.$current;
                    EmailViewModel emailViewModel4 = EmailViewModel.this;
                    if (i3 == emailViewModel4.generation) {
                        NetworkException networkException = e2 instanceof NetworkException ? (NetworkException) e2 : null;
                        if (networkException == null || networkException.httpResponseCode != 403) {
                            BLG<EmailState> blg2 = emailViewModel4._state;
                            do {
                                value = blg2.getValue();
                            } while (!blg2.A6e(value, EmailState.copy$default(value, false, false, false, null, null, null, false, EmailError.LOAD, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -129, 16777215, null)));
                        } else {
                            emailViewModel4.refresh();
                        }
                    }
                }
                BLG<EmailState> blg3 = EmailViewModel.this._state;
                do {
                    value3 = blg3.getValue();
                } while (!blg3.A6e(value3, EmailState.copy$default(value3, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -65, 16777215, null)));
                return Unit.INSTANCE;
            } catch (Throwable th) {
                BLG<EmailState> blg4 = EmailViewModel.this._state;
                do {
                    value2 = blg4.getValue();
                } while (!blg4.A6e(value2, EmailState.copy$default(value2, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -65, 16777215, null)));
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C118162) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel$loadPermissions$2", f = "EmailViewModel.kt", l = {1235}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.viewmodel.EmailViewModel$loadPermissions$2, reason: invalid class name and case insensitive filesystem */
    public final class C118172 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C118172(HtJ<? super C118172> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return EmailViewModel.this.new C118172(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EmailState value;
            EmailState value2;
            Object objPermissions = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(objPermissions);
                    EmailViewModel emailViewModel = EmailViewModel.this;
                    EmailRepository emailRepository = emailViewModel.repository;
                    String str = emailViewModel.environmentId;
                    this.label = 1;
                    objPermissions = emailRepository.permissions(str, this);
                    if (objPermissions == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(objPermissions);
                }
                EmailPermissions emailPermissions = (EmailPermissions) objPermissions;
                BLG<EmailState> blg = EmailViewModel.this._state;
                do {
                    value2 = blg.getValue();
                } while (!blg.A6e(value2, EmailState.copy$default(value2, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, emailPermissions, true, null, null, false, false, false, null, null, null, false, null, false, null, null, -1, 16775679, null)));
            } catch (CancellationException e) {
                throw e;
            } catch (Exception unused) {
                BLG<EmailState> blg2 = EmailViewModel.this._state;
                do {
                    value = blg2.getValue();
                } while (!blg2.A6e(value, EmailState.copy$default(value, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, true, null, null, false, false, false, null, EmailError.PERMISSIONS, null, false, null, false, null, null, -1, 16645119, null)));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return EmailViewModel.this.new C118172(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel$loadSenders$1", f = "EmailViewModel.kt", l = {806}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.viewmodel.EmailViewModel$loadSenders$1, reason: invalid class name and case insensitive filesystem */
    public final class C118181 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $cursor;
        public final /* synthetic */ boolean $more;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118181(String str, boolean z, HtJ<? super C118181> htJ) {
            super(1, htJ);
            this.$cursor = str;
            this.$more = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return EmailViewModel.this.new C118181(this.$cursor, this.$more, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EmailState value;
            EmailState emailState;
            AHD ahdA07;
            String str;
            Object objSenders = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(objSenders);
                EmailViewModel emailViewModel = EmailViewModel.this;
                EmailRepository emailRepository = emailViewModel.repository;
                String str2 = emailViewModel.environmentId;
                String str3 = this.$cursor;
                this.label = 1;
                objSenders = emailRepository.senders(str2, str3, this);
                if (objSenders == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(objSenders);
            }
            EmailPage emailPage = (EmailPage) objSenders;
            BLG<EmailState> blg = EmailViewModel.this._state;
            boolean z = this.$more;
            String str4 = this.$cursor;
            do {
                value = blg.getValue();
                emailState = value;
                ArrayList arrayListA0P = AbstractC0878AGe.A0P(emailPage.data, z ? emailState.senders : AHI.A01);
                ArrayList arrayList = new ArrayList();
                Iterator it = arrayListA0P.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    String str5 = ((EmailSender) next).status;
                    if (!"REVOKED".equals(str5) && !"EXPIRED".equals(str5)) {
                        arrayList.add(next);
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    AnonymousClass006.A1P(((EmailSender) obj2).id, obj2, hashSet, arrayList2);
                }
                ahdA07 = AGI.A07(arrayList2);
                str = emailPage.nextCursor;
                if (C7384Etj.areEqual(str, str4)) {
                    str = null;
                }
            } while (!blg.A6e(value, EmailState.copy$default(emailState, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, ahdA07, str, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -50331649, 16777215, null)));
            return Unit.INSTANCE;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C118181) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel$loadSettings$1", f = "EmailViewModel.kt", l = {1281}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.viewmodel.EmailViewModel$loadSettings$1, reason: invalid class name and case insensitive filesystem */
    public final class C118191 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C118191(HtJ<? super C118191> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return EmailViewModel.this.new C118191(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EmailState value;
            EmailState value2;
            Object obj2 = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj2);
                    EmailViewModel emailViewModel = EmailViewModel.this;
                    EmailRepository emailRepository = emailViewModel.repository;
                    String str = emailViewModel.environmentId;
                    this.label = 1;
                    obj2 = emailRepository.settings(str, this);
                    if (obj2 == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj2);
                }
                EmailSettings emailSettings = (EmailSettings) obj2;
                EmailViewModel.this._settingsCopy.Af8(emailSettings.copy);
                EmailViewModel emailViewModel2 = EmailViewModel.this;
                emailViewModel2.settingsCopyReceived = true;
                BLG<EmailState> blg = emailViewModel2._state;
                do {
                    value2 = blg.getValue();
                } while (!blg.A6e(value2, EmailState.copy$default(value2, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, emailSettings.signature, false, emailSettings.showPermissions, true, null, null, null, false, null, false, null, null, -1, 16723967, null)));
            } catch (CancellationException e) {
                throw e;
            } catch (Exception unused) {
                BLG<EmailState> blg2 = EmailViewModel.this._state;
                do {
                    value = blg2.getValue();
                } while (!blg2.A6e(value, EmailState.copy$default(value, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, true, null, null, null, false, null, false, null, null, -1, 16744447, null)));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return EmailViewModel.this.new C118191(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel$loadThread$2", f = "EmailViewModel.kt", l = {709, 709, 729}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.viewmodel.EmailViewModel$loadThread$2, reason: invalid class name and case insensitive filesystem */
    public final class C118202 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ int $current;
        public final /* synthetic */ String $id;
        public final /* synthetic */ String $key;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118202(String str, int i, String str2, HtJ<? super C118202> htJ) {
            super(2, htJ);
            this.$id = str;
            this.$current = i;
            this.$key = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return EmailViewModel.this.new C118202(this.$id, this.$current, this.$key, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0053 A[Catch: Exception -> 0x0338, CancellationException -> 0x03de, TryCatch #2 {CancellationException -> 0x03de, Exception -> 0x0338, blocks: (B:68:0x0236, B:69:0x0239, B:71:0x0243, B:72:0x0245, B:74:0x0252, B:77:0x0258, B:78:0x0264, B:80:0x026a, B:81:0x0276, B:82:0x0287, B:84:0x028d, B:86:0x029c, B:87:0x02a0, B:88:0x0330, B:19:0x0046, B:20:0x0049, B:22:0x0053, B:24:0x0065, B:26:0x006d, B:27:0x0073, B:29:0x00f7, B:31:0x00fa, B:42:0x012e, B:43:0x013b, B:45:0x0141, B:47:0x0152, B:48:0x0156, B:59:0x0188, B:60:0x018e, B:63:0x0199, B:65:0x021f, B:51:0x0162, B:53:0x016c, B:54:0x0171, B:57:0x0182, B:34:0x0108, B:36:0x0112, B:37:0x0117, B:40:0x0128, B:15:0x0036, B:16:0x0039, B:12:0x0023), top: B:108:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0243 A[Catch: Exception -> 0x0338, CancellationException -> 0x03de, TryCatch #2 {CancellationException -> 0x03de, Exception -> 0x0338, blocks: (B:68:0x0236, B:69:0x0239, B:71:0x0243, B:72:0x0245, B:74:0x0252, B:77:0x0258, B:78:0x0264, B:80:0x026a, B:81:0x0276, B:82:0x0287, B:84:0x028d, B:86:0x029c, B:87:0x02a0, B:88:0x0330, B:19:0x0046, B:20:0x0049, B:22:0x0053, B:24:0x0065, B:26:0x006d, B:27:0x0073, B:29:0x00f7, B:31:0x00fa, B:42:0x012e, B:43:0x013b, B:45:0x0141, B:47:0x0152, B:48:0x0156, B:59:0x0188, B:60:0x018e, B:63:0x0199, B:65:0x021f, B:51:0x0162, B:53:0x016c, B:54:0x0171, B:57:0x0182, B:34:0x0108, B:36:0x0112, B:37:0x0117, B:40:0x0128, B:15:0x0036, B:16:0x0039, B:12:0x0023), top: B:108:0x000c }] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r72) {
            /*
                Method dump skipped, instructions count: 992
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.viewmodel.EmailViewModel.C118202.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C118202) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel$observeInboxConnection$1", f = "EmailViewModel.kt", l = {319}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.viewmodel.EmailViewModel$observeInboxConnection$1, reason: invalid class name and case insensitive filesystem */
    public final class C118211 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public int label;

        public C118211(HtJ<? super C118211> htJ) {
            super(1, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return EmailViewModel.this.new C118211(htJ);
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return EmailViewModel.this.new C118211(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HoC hoC = EmailViewModel.this.inboxJob;
                if (hoC != null) {
                    this.label = 1;
                    if (hoC.APQ(this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            EmailViewModel.this.refresh();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel$observePermissionsConnection$1", f = "EmailViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.viewmodel.EmailViewModel$observePermissionsConnection$1, reason: invalid class name and case insensitive filesystem */
    public final class C118221 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public int label;

        public C118221(HtJ<? super C118221> htJ) {
            super(1, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return EmailViewModel.this.new C118221(htJ);
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return EmailViewModel.this.new C118221(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            if (AnonymousClass006.A0d(EmailViewModel.this).permissionsError != null) {
                EmailViewModel.this.loadPermissions();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel$observeReconnect$1", f = "EmailViewModel.kt", l = {330}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.viewmodel.EmailViewModel$observeReconnect$1, reason: invalid class name and case insensitive filesystem */
    public final class C118231 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ G0U<HtJ<? super Unit>, Object> $onConnected;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C118231(G0U<? super HtJ<? super Unit>, ? extends Object> g0u, HtJ<? super C118231> htJ) {
            super(2, htJ);
            this.$onConnected = g0u;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return EmailViewModel.this.new C118231(this.$onConnected, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final F1F f1f = new F1F();
                C1BN<HatchGatewayConnectionState> connectionState = EmailViewModel.this.repository.getConnectionState();
                final G0U<HtJ<? super Unit>, Object> g0u = this.$onConnected;
                C20Z<? super HatchGatewayConnectionState> c20z = new C20Z() { // from class: com.facebook.aura.email.viewmodel.EmailViewModel.observeReconnect.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((HatchGatewayConnectionState) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(HatchGatewayConnectionState hatchGatewayConnectionState, HtJ<? super Unit> htJ) {
                        boolean z = hatchGatewayConnectionState instanceof HatchGatewayConnectionState.Connected;
                        F1F f1f2 = f1f;
                        if (z) {
                            if (f1f2.element) {
                                f1f2.element = false;
                                Object objInvoke = g0u.invoke(htJ);
                                if (objInvoke == EnumC10460Hji.A02) {
                                    return objInvoke;
                                }
                            }
                        } else {
                            f1f2.element = true;
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.L$0 = null;
                this.label = 1;
                if (connectionState.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C118231) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel$observeSetupConnection$1", f = "EmailViewModel.kt", l = {324}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.viewmodel.EmailViewModel$observeSetupConnection$1, reason: invalid class name and case insensitive filesystem */
    public final class C118241 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public int label;

        public C118241(HtJ<? super C118241> htJ) {
            super(1, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return EmailViewModel.this.new C118241(htJ);
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return EmailViewModel.this.new C118241(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HoC hoC = EmailViewModel.this.setupJob;
                if (hoC != null) {
                    this.label = 1;
                    if (hoC.APQ(this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            if (AnonymousClass006.A0d(EmailViewModel.this).setupFailed) {
                EmailViewModel emailViewModel = EmailViewModel.this;
                if (!emailViewModel.setupRateLimited && !AnonymousClass006.A0d(emailViewModel).saving) {
                    EmailViewModel.this.retrySetup();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel$prefillOwnerAddress$2", f = "EmailViewModel.kt", l = {859}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.viewmodel.EmailViewModel$prefillOwnerAddress$2, reason: invalid class name and case insensitive filesystem */
    public final class C118252 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C118252(HtJ<? super C118252> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return EmailViewModel.this.new C118252(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EmailState value;
            EmailState emailStateCopy$default;
            Object objSuggestedOwnerAddress = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(objSuggestedOwnerAddress);
                EmailViewModel emailViewModel = EmailViewModel.this;
                this.label = 1;
                objSuggestedOwnerAddress = emailViewModel.suggestedOwnerAddress(this);
                if (objSuggestedOwnerAddress == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(objSuggestedOwnerAddress);
            }
            String str = (String) objSuggestedOwnerAddress;
            if (str != null) {
                BLG<EmailState> blg = EmailViewModel.this._state;
                do {
                    value = blg.getValue();
                    emailStateCopy$default = value;
                    if (!emailStateCopy$default.ownerAddressEdited && emailStateCopy$default.ownerRecipient.length() == 0) {
                        emailStateCopy$default = EmailState.copy$default(emailStateCopy$default, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, str, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -1073741825, 16777215, null);
                    }
                } while (!blg.A6e(value, emailStateCopy$default));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return EmailViewModel.this.new C118252(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel$prepareForm$2", f = "EmailViewModel.kt", l = {494, 504}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.viewmodel.EmailViewModel$prepareForm$2, reason: invalid class name and case insensitive filesystem */
    public final class C118262 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ int $current;
        public final /* synthetic */ boolean $edit;
        public final /* synthetic */ EmailMailbox $mailbox;
        public int label;
        public final /* synthetic */ EmailViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118262(boolean z, EmailMailbox emailMailbox, EmailViewModel emailViewModel, int i, HtJ<? super C118262> htJ) {
            super(2, htJ);
            this.$edit = z;
            this.$mailbox = emailMailbox;
            this.this$0 = emailViewModel;
            this.$current = i;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C118262(this.$edit, this.$mailbox, this.this$0, this.$current, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0034 A[Catch: Exception -> 0x01b3, CancellationException -> 0x037c, all -> 0x037e, TryCatch #3 {CancellationException -> 0x037c, Exception -> 0x01b3, blocks: (B:34:0x00e2, B:35:0x00e5, B:37:0x00ef, B:39:0x00f3, B:41:0x00f9, B:43:0x00ff, B:44:0x0105, B:46:0x0118, B:47:0x011a, B:49:0x011e, B:50:0x0120, B:53:0x01a0, B:56:0x01a8, B:58:0x01ac, B:7:0x0013, B:20:0x003c, B:21:0x003e, B:23:0x0046, B:24:0x0048, B:26:0x0055, B:27:0x0057, B:30:0x00d0, B:18:0x0034, B:19:0x003b, B:9:0x001a, B:11:0x001e, B:13:0x0022, B:31:0x00d3), top: B:106:0x000b, outer: #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0046 A[Catch: Exception -> 0x01b3, CancellationException -> 0x037c, all -> 0x037e, TryCatch #3 {CancellationException -> 0x037c, Exception -> 0x01b3, blocks: (B:34:0x00e2, B:35:0x00e5, B:37:0x00ef, B:39:0x00f3, B:41:0x00f9, B:43:0x00ff, B:44:0x0105, B:46:0x0118, B:47:0x011a, B:49:0x011e, B:50:0x0120, B:53:0x01a0, B:56:0x01a8, B:58:0x01ac, B:7:0x0013, B:20:0x003c, B:21:0x003e, B:23:0x0046, B:24:0x0048, B:26:0x0055, B:27:0x0057, B:30:0x00d0, B:18:0x0034, B:19:0x003b, B:9:0x001a, B:11:0x001e, B:13:0x0022, B:31:0x00d3), top: B:106:0x000b, outer: #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00ef A[Catch: Exception -> 0x01b3, CancellationException -> 0x037c, all -> 0x037e, TryCatch #3 {CancellationException -> 0x037c, Exception -> 0x01b3, blocks: (B:34:0x00e2, B:35:0x00e5, B:37:0x00ef, B:39:0x00f3, B:41:0x00f9, B:43:0x00ff, B:44:0x0105, B:46:0x0118, B:47:0x011a, B:49:0x011e, B:50:0x0120, B:53:0x01a0, B:56:0x01a8, B:58:0x01ac, B:7:0x0013, B:20:0x003c, B:21:0x003e, B:23:0x0046, B:24:0x0048, B:26:0x0055, B:27:0x0057, B:30:0x00d0, B:18:0x0034, B:19:0x003b, B:9:0x001a, B:11:0x001e, B:13:0x0022, B:31:0x00d3), top: B:106:0x000b, outer: #2 }] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r72) {
            /*
                Method dump skipped, instructions count: 1042
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.viewmodel.EmailViewModel.C118262.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C118262) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel$refresh$2", f = "EmailViewModel.kt", l = {381}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.viewmodel.EmailViewModel$refresh$2, reason: invalid class name and case insensitive filesystem */
    public final class C118272 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel$refresh$2$1", f = "EmailViewModel.kt", l = {385, 387}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.email.viewmodel.EmailViewModel$refresh$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public int I$0;
            public Object L$0;
            public int label;
            public final /* synthetic */ EmailViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(EmailViewModel emailViewModel, HtJ<? super AnonymousClass1> htJ) {
                super(1, htJ);
                this.this$0 = emailViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new AnonymousClass1(this.this$0, htJ);
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return new AnonymousClass1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:29:0x0165  */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r74) {
                /*
                    Method dump skipped, instructions count: 1027
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.viewmodel.EmailViewModel.C118272.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C118272(HtJ<? super C118272> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return EmailViewModel.this.new C118272(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                EmailViewModel emailViewModel = EmailViewModel.this;
                SingleFlight singleFlight = emailViewModel.flight;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(emailViewModel, null);
                this.label = 1;
                if (singleFlight.invoke(EmailEventLogger.INBOX, anonymousClass1, this) == enumC10460Hji) {
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
            return EmailViewModel.this.new C118272(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel", f = "EmailViewModel.kt", l = {1335}, m = "refreshPermissions", v = 2)
    /* renamed from: com.facebook.aura.email.viewmodel.EmailViewModel$refreshPermissions$1, reason: invalid class name and case insensitive filesystem */
    public final class C118281 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C118281(HtJ<? super C118281> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EmailViewModel.this.refreshPermissions(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel$removeSender$1", f = "EmailViewModel.kt", l = {837}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.viewmodel.EmailViewModel$removeSender$1, reason: invalid class name and case insensitive filesystem */
    public final class C118291 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ EmailSender $sender;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118291(EmailSender emailSender, HtJ<? super C118291> htJ) {
            super(1, htJ);
            this.$sender = emailSender;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return EmailViewModel.this.new C118291(this.$sender, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EmailState value;
            EmailState emailState;
            ArrayList arrayList;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                EmailViewModel emailViewModel = EmailViewModel.this;
                EmailRepository emailRepository = emailViewModel.repository;
                String str = emailViewModel.environmentId;
                String str2 = this.$sender.id;
                this.label = 1;
                if (emailRepository.removeSender(str, str2, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            BLG<EmailState> blg = EmailViewModel.this._state;
            EmailSender emailSender = this.$sender;
            do {
                value = blg.getValue();
                emailState = value;
                AHD<EmailSender> ahd = emailState.senders;
                arrayList = new ArrayList();
                for (Object obj2 : ahd) {
                    AnonymousClass006.A1O(((EmailSender) obj2).id, emailSender.id, obj2, arrayList);
                }
            } while (!blg.A6e(value, EmailState.copy$default(emailState, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, AGI.A07(arrayList), null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -16777217, 16777215, null)));
            return Unit.INSTANCE;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C118291) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel$resendOwnerCode$1", f = "EmailViewModel.kt", l = {ConnectionReducerKt.SERVICE_NOTICE_CODE_TRY_AGAIN_LATER}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.viewmodel.EmailViewModel$resendOwnerCode$1, reason: invalid class name and case insensitive filesystem */
    public final class C118301 extends AbstractC07127nr implements G0U<HtJ<? super EmailOwnerVerification>, Object> {
        public final /* synthetic */ EmailOwnerChallenge $challenge;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118301(EmailOwnerChallenge emailOwnerChallenge, HtJ<? super C118301> htJ) {
            super(1, htJ);
            this.$challenge = emailOwnerChallenge;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return EmailViewModel.this.new C118301(this.$challenge, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                EmailViewModel emailViewModel = EmailViewModel.this;
                EmailRepository emailRepository = emailViewModel.repository;
                String str = emailViewModel.environmentId;
                String str2 = this.$challenge.address;
                this.label = 1;
                obj = emailRepository.requestOwnerChallenge(str, str2, this);
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
        public final Object invoke(HtJ<? super EmailOwnerVerification> htJ) {
            return ((C118301) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel$runOwnerRequest$2", f = "EmailViewModel.kt", l = {1063}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.viewmodel.EmailViewModel$runOwnerRequest$2, reason: invalid class name and case insensitive filesystem */
    public final class C118312 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $key;
        public final /* synthetic */ G0U<HtJ<? super EmailOwnerVerification>, Object> $request;
        public final /* synthetic */ int $requestGeneration;
        public final /* synthetic */ String $requestedAddress;
        public final /* synthetic */ boolean $resent;
        public final /* synthetic */ boolean $verifying;
        public int label;
        public final /* synthetic */ EmailViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C118312(G0U<? super HtJ<? super EmailOwnerVerification>, ? extends Object> g0u, EmailViewModel emailViewModel, String str, int i, boolean z, boolean z2, String str2, HtJ<? super C118312> htJ) {
            super(2, htJ);
            this.$request = g0u;
            this.this$0 = emailViewModel;
            this.$key = str;
            this.$requestGeneration = i;
            this.$verifying = z;
            this.$resent = z2;
            this.$requestedAddress = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C118312(this.$request, this.this$0, this.$key, this.$requestGeneration, this.$verifying, this.$resent, this.$requestedAddress, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:103:0x02a5 A[Catch: all -> 0x02d3, TRY_LEAVE, TryCatch #1 {all -> 0x02d3, blocks: (B:10:0x001e, B:11:0x0021, B:13:0x0031, B:15:0x0039, B:16:0x0041, B:17:0x0053, B:19:0x0059, B:20:0x006a, B:23:0x0078, B:26:0x0085, B:29:0x008d, B:39:0x017a, B:7:0x0013, B:49:0x01a4, B:51:0x01b0, B:53:0x01b8, B:55:0x01bc, B:58:0x01c3, B:82:0x01f7, B:85:0x01fd, B:86:0x0203, B:88:0x020f, B:90:0x0217, B:97:0x0223, B:99:0x0228, B:98:0x0226, B:103:0x02a5, B:60:0x01c8, B:65:0x01d2, B:66:0x01d4, B:68:0x01da, B:70:0x01de, B:75:0x01e8, B:76:0x01ea, B:114:0x02d2), top: B:126:0x000b, inners: #3 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x01f6  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r74) {
            /*
                Method dump skipped, instructions count: 768
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.viewmodel.EmailViewModel.C118312.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C118312) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel$runSenderAction$2", f = "EmailViewModel.kt", l = {1378}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.viewmodel.EmailViewModel$runSenderAction$2, reason: invalid class name and case insensitive filesystem */
    public final class C118322 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ G0U<HtJ<? super Unit>, Object> $action;
        public int label;
        public final /* synthetic */ EmailViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C118322(G0U<? super HtJ<? super Unit>, ? extends Object> g0u, EmailViewModel emailViewModel, HtJ<? super C118322> htJ) {
            super(2, htJ);
            this.$action = g0u;
            this.this$0 = emailViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C118322(this.$action, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EmailState value;
            EmailState value2;
            EmailState value3;
            EmailState value4;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        Hwg.A00(obj);
                        G0U<HtJ<? super Unit>, Object> g0u = this.$action;
                        this.label = 1;
                        if (g0u.invoke(this) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } else {
                        if (i != 1) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(obj);
                    }
                    BLG<EmailState> blg = this.this$0._state;
                    do {
                        value4 = blg.getValue();
                    } while (!blg.A6e(value4, EmailState.copy$default(value4, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -201326593, 16777215, null)));
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    EmailViewModel emailViewModel = this.this$0;
                    BLG<EmailState> blg2 = emailViewModel._state;
                    do {
                        value = blg2.getValue();
                    } while (!blg2.A6e(value, EmailState.copy$default(value, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, emailViewModel.errorFor(e2, EmailError.SENDERS), null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -268435457, 16777215, null)));
                    BLG<EmailState> blg3 = this.this$0._state;
                    do {
                        value2 = blg3.getValue();
                    } while (!blg3.A6e(value2, EmailState.copy$default(value2, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -201326593, 16777215, null)));
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                BLG<EmailState> blg4 = this.this$0._state;
                do {
                    value3 = blg4.getValue();
                } while (!blg4.A6e(value3, EmailState.copy$default(value3, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -201326593, 16777215, null)));
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C118322) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel$save$2", f = "EmailViewModel.kt", l = {670, 671}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.viewmodel.EmailViewModel$save$2, reason: invalid class name and case insensitive filesystem */
    public final class C118332 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $edit;
        public final /* synthetic */ EmailState $s;
        public final /* synthetic */ String $submittedFormKey;
        public int label;
        public final /* synthetic */ EmailViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118332(boolean z, EmailViewModel emailViewModel, EmailState emailState, String str, HtJ<? super C118332> htJ) {
            super(2, htJ);
            this.$edit = z;
            this.this$0 = emailViewModel;
            this.$s = emailState;
            this.$submittedFormKey = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C118332(this.$edit, this.this$0, this.$s, this.$submittedFormKey, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:52:0x0148 A[Catch: all -> 0x0273, TryCatch #1 {all -> 0x0273, blocks: (B:19:0x0050, B:20:0x0053, B:21:0x0055, B:23:0x0059, B:24:0x0061, B:25:0x0067, B:27:0x00e5, B:14:0x002f, B:15:0x0032, B:8:0x0014, B:11:0x001a, B:16:0x0035, B:33:0x0107, B:34:0x010f, B:40:0x0127, B:43:0x0132, B:46:0x013c, B:48:0x0140, B:53:0x014b, B:55:0x0151, B:56:0x0153, B:58:0x01d0, B:60:0x01d4, B:62:0x01d9, B:64:0x01df, B:52:0x0148, B:44:0x0138, B:41:0x012e, B:37:0x011c, B:71:0x0272), top: B:79:0x000a, inners: #3 }] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r129) {
            /*
                Method dump skipped, instructions count: 763
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.viewmodel.EmailViewModel.C118332.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C118332) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel$setAutoForward$2", f = "EmailViewModel.kt", l = {1350}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.viewmodel.EmailViewModel$setAutoForward$2, reason: invalid class name and case insensitive filesystem */
    public final class C118342 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ boolean $previous;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118342(boolean z, boolean z2, HtJ<? super C118342> htJ) {
            super(2, htJ);
            this.$enabled = z;
            this.$previous = z2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return EmailViewModel.this.new C118342(this.$enabled, this.$previous, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EmailState value;
            EmailState emailStateCopy$default;
            EmailState value2;
            EmailState emailStateCopy$default2;
            Object objUpdateAutoForwardStub = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(objUpdateAutoForwardStub);
                    EmailViewModel emailViewModel = EmailViewModel.this;
                    EmailRepository emailRepository = emailViewModel.repository;
                    String str = emailViewModel.environmentId;
                    boolean z = this.$enabled;
                    this.label = 1;
                    objUpdateAutoForwardStub = emailRepository.updateAutoForwardStub(str, z, this);
                    if (objUpdateAutoForwardStub == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(objUpdateAutoForwardStub);
                }
                Boolean bool = (Boolean) objUpdateAutoForwardStub;
                BLG<EmailState> blg = EmailViewModel.this._state;
                boolean z2 = this.$enabled;
                do {
                    value2 = blg.getValue();
                    emailStateCopy$default2 = value2;
                    if (AnonymousClass002.A1b(emailStateCopy$default2.autoForward, z2)) {
                        emailStateCopy$default2 = EmailState.copy$default(emailStateCopy$default2, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, bool, null, null, false, null, false, null, null, -1, 16711679, null);
                    }
                } while (!blg.A6e(value2, emailStateCopy$default2));
            } catch (CancellationException e) {
                throw e;
            } catch (Exception unused) {
                BLG<EmailState> blg2 = EmailViewModel.this._state;
                boolean z3 = this.$enabled;
                boolean z4 = this.$previous;
                do {
                    value = blg2.getValue();
                    emailStateCopy$default = value;
                    if (AnonymousClass002.A1b(emailStateCopy$default.autoForward, z3)) {
                        emailStateCopy$default = EmailState.copy$default(emailStateCopy$default, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, Boolean.valueOf(z4), EmailError.PERMISSIONS, null, false, null, false, null, null, -1, 16580607, null);
                    }
                } while (!blg2.A6e(value, emailStateCopy$default));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C118342) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel$setIncludeSignature$2", f = "EmailViewModel.kt", l = {1315}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.viewmodel.EmailViewModel$setIncludeSignature$2, reason: invalid class name and case insensitive filesystem */
    public final class C118352 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $failureMessage;
        public final /* synthetic */ boolean $includeSignature;
        public final /* synthetic */ EmailSignature $previous;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118352(boolean z, String str, EmailSignature emailSignature, HtJ<? super C118352> htJ) {
            super(2, htJ);
            this.$includeSignature = z;
            this.$failureMessage = str;
            this.$previous = emailSignature;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return EmailViewModel.this.new C118352(this.$includeSignature, this.$failureMessage, this.$previous, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EmailState value;
            EmailState value2;
            EmailState value3;
            EmailState value4;
            EmailState value5;
            EmailState value6;
            Object objUpdateIncludeSignature = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        Hwg.A00(objUpdateIncludeSignature);
                        EmailViewModel emailViewModel = EmailViewModel.this;
                        EmailRepository emailRepository = emailViewModel.repository;
                        String str = emailViewModel.environmentId;
                        boolean z = this.$includeSignature;
                        this.label = 1;
                        objUpdateIncludeSignature = emailRepository.updateIncludeSignature(str, z, this);
                        if (objUpdateIncludeSignature == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } else {
                        if (i != 1) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(objUpdateIncludeSignature);
                    }
                    EmailSettings emailSettings = (EmailSettings) objUpdateIncludeSignature;
                    EmailViewModel.this._settingsCopy.Af8(emailSettings.copy);
                    EmailViewModel emailViewModel2 = EmailViewModel.this;
                    emailViewModel2.settingsCopyReceived = true;
                    BLG<EmailState> blg = emailViewModel2._state;
                    do {
                        value5 = blg.getValue();
                    } while (!blg.A6e(value5, EmailState.copy$default(value5, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, emailSettings.signature, false, emailSettings.showPermissions, false, null, null, null, false, null, false, null, null, -1, 16756735, null)));
                    BLG<EmailState> blg2 = EmailViewModel.this._state;
                    do {
                        value6 = blg2.getValue();
                    } while (!blg2.A6e(value6, EmailState.copy$default(value6, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -1, 16769023, null)));
                } catch (CancellationException e) {
                    BLG<EmailState> blg3 = EmailViewModel.this._state;
                    EmailSignature emailSignature = this.$previous;
                    do {
                        value3 = blg3.getValue();
                    } while (!blg3.A6e(value3, EmailState.copy$default(value3, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, emailSignature, false, false, false, null, null, null, false, null, false, null, null, -1, 16773119, null)));
                    throw e;
                } catch (Exception unused) {
                    BLG<EmailState> blg4 = EmailViewModel.this._state;
                    EmailSignature emailSignature2 = this.$previous;
                    do {
                        value = blg4.getValue();
                    } while (!blg4.A6e(value, EmailState.copy$default(value, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, emailSignature2, false, false, false, null, null, null, false, null, false, null, null, -1, 16773119, null)));
                    ToastApi.INSTANCE.showToast(this.$failureMessage);
                    BLG<EmailState> blg5 = EmailViewModel.this._state;
                    do {
                        value2 = blg5.getValue();
                    } while (!blg5.A6e(value2, EmailState.copy$default(value2, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -1, 16769023, null)));
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                BLG<EmailState> blg6 = EmailViewModel.this._state;
                do {
                    value4 = blg6.getValue();
                } while (!C06G.A0q(value4, value4, blg6, 16769023));
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C118352) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel$setPermissionMode$2", f = "EmailViewModel.kt", l = {1262, 1263, 1269}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.viewmodel.EmailViewModel$setPermissionMode$2, reason: invalid class name and case insensitive filesystem */
    public final class C118362 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HoC $loadingJob;
        public final /* synthetic */ String $methodKey;
        public final /* synthetic */ EmailSendPermission $mode;
        public Object L$0;
        public int label;
        public final /* synthetic */ EmailViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118362(HoC hoC, EmailViewModel emailViewModel, String str, EmailSendPermission emailSendPermission, HtJ<? super C118362> htJ) {
            super(2, htJ);
            this.$loadingJob = hoC;
            this.this$0 = emailViewModel;
            this.$methodKey = str;
            this.$mode = emailSendPermission;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C118362(this.$loadingJob, this.this$0, this.$methodKey, this.$mode, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EmailState value;
            EmailState value2;
            EmailState value3;
            EmailPermissions emailPermissions;
            BLG<EmailState> blg;
            EmailState value4;
            BLG<EmailState> blg2;
            EmailState value5;
            Object objUpdatePermissionMode = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                try {
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception unused) {
                    BLG<EmailState> blg3 = this.this$0._state;
                    do {
                        value = blg3.getValue();
                    } while (!blg3.A6e(value, EmailState.copy$default(value, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, EmailError.PERMISSIONS, null, false, null, false, null, null, -1, 16646143, null)));
                    EmailViewModel emailViewModel = this.this$0;
                    this.L$0 = null;
                    this.label = 3;
                    if (emailViewModel.refreshPermissions(this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
                if (i == 0) {
                    Hwg.A00(objUpdatePermissionMode);
                    HoC hoC = this.$loadingJob;
                    if (hoC != null) {
                        this.label = 1;
                        if (hoC.APQ(this) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw AnonymousClass001.A0n();
                            }
                            Hwg.A00(objUpdatePermissionMode);
                            BLG<EmailState> blg4 = this.this$0._state;
                            do {
                                value3 = blg4.getValue();
                            } while (!C06G.A0q(value3, value3, blg4, 16775167));
                            return Unit.INSTANCE;
                        }
                        Hwg.A00(objUpdatePermissionMode);
                        emailPermissions = (EmailPermissions) objUpdatePermissionMode;
                        blg = this.this$0._state;
                        do {
                            value4 = blg.getValue();
                        } while (!blg.A6e(value4, EmailState.copy$default(value4, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, emailPermissions, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -1, 16776703, null)));
                        blg2 = this.this$0._state;
                        do {
                            value5 = blg2.getValue();
                        } while (!blg2.A6e(value5, EmailState.copy$default(value5, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -1, 16775167, null)));
                        return Unit.INSTANCE;
                    }
                    Hwg.A00(objUpdatePermissionMode);
                }
                EmailViewModel emailViewModel2 = this.this$0;
                EmailRepository emailRepository = emailViewModel2.repository;
                String str = emailViewModel2.environmentId;
                String str2 = this.$methodKey;
                EmailSendPermission emailSendPermission = this.$mode;
                this.label = 2;
                objUpdatePermissionMode = emailRepository.updatePermissionMode(str, str2, emailSendPermission, this);
                if (objUpdatePermissionMode == enumC10460Hji) {
                    return enumC10460Hji;
                }
                emailPermissions = (EmailPermissions) objUpdatePermissionMode;
                blg = this.this$0._state;
                do {
                    value4 = blg.getValue();
                } while (!blg.A6e(value4, EmailState.copy$default(value4, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, emailPermissions, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -1, 16776703, null)));
                blg2 = this.this$0._state;
                do {
                    value5 = blg2.getValue();
                } while (!blg2.A6e(value5, EmailState.copy$default(value5, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -1, 16775167, null)));
                return Unit.INSTANCE;
            } catch (Throwable th) {
                BLG<EmailState> blg5 = this.this$0._state;
                do {
                    value2 = blg5.getValue();
                } while (!C06G.A0q(value2, value2, blg5, 16775167));
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C118362) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel$suggestedOwnerAddress$2", f = "EmailViewModel.kt", l = {872}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.viewmodel.EmailViewModel$suggestedOwnerAddress$2, reason: invalid class name and case insensitive filesystem */
    public final class C118372 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
        public int label;

        public C118372(HtJ<? super C118372> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return EmailViewModel.this.new C118372(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object next;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    EmailViewModel emailViewModel = EmailViewModel.this;
                    EmailRepository emailRepository = emailViewModel.repository;
                    String str = emailViewModel.environmentId;
                    this.label = 1;
                    obj = emailRepository.accountEmailAddresses(str, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                Iterator it = ((Iterable) obj).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Patterns.EMAIL_ADDRESS.matcher(AnonymousClass002.A0l((String) next)).matches()) {
                        break;
                    }
                }
                String str2 = (String) next;
                if (str2 != null) {
                    return C7BY.A0F(str2).toString();
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Exception unused) {
            }
            return null;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
            return EmailViewModel.this.new C118372(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel", f = "EmailViewModel.kt", l = {HatchTransportHttpDataSourceKt.HTTP_RANGE_NOT_SATISFIABLE, 419}, m = "threadsOrReread", v = 2)
    /* renamed from: com.facebook.aura.email.viewmodel.EmailViewModel$threadsOrReread$1, reason: invalid class name and case insensitive filesystem */
    public final class C118381 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C118381(HtJ<? super C118381> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EmailViewModel.this.threadsOrReread(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel$trustSender$1", f = "EmailViewModel.kt", l = {1158}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.viewmodel.EmailViewModel$trustSender$1, reason: invalid class name and case insensitive filesystem */
    public final class C118391 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $address;
        public final /* synthetic */ String $failureMessage;
        public final /* synthetic */ String $successMessage;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118391(String str, String str2, String str3, HtJ<? super C118391> htJ) {
            super(2, htJ);
            this.$address = str;
            this.$successMessage = str2;
            this.$failureMessage = str3;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return EmailViewModel.this.new C118391(this.$address, this.$successMessage, this.$failureMessage, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EmailSender emailSender;
            EmailState value;
            EmailState emailState;
            ArrayList arrayList;
            Object objVerify = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(objVerify);
                    EmailViewModel emailViewModel = EmailViewModel.this;
                    EmailRepository emailRepository = emailViewModel.repository;
                    String str = emailViewModel.environmentId;
                    String str2 = this.$address;
                    this.label = 1;
                    objVerify = emailRepository.verify(str, str2, this);
                    if (objVerify == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(objVerify);
                }
                emailSender = (EmailSender) objVerify;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception unused) {
                emailSender = null;
            }
            if (emailSender != null) {
                BLG<EmailState> blg = EmailViewModel.this._state;
                do {
                    value = blg.getValue();
                    emailState = value;
                    AHD<EmailSender> ahd = emailState.senders;
                    arrayList = new ArrayList();
                    for (Object obj2 : ahd) {
                        AnonymousClass006.A1O(((EmailSender) obj2).id, emailSender.id, obj2, arrayList);
                    }
                } while (!blg.A6e(value, EmailState.copy$default(emailState, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, AGI.A07(AbstractC0878AGe.A0Q(emailSender, arrayList)), null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -16777217, 16777215, null)));
            }
            ToastApi.INSTANCE.showToast(emailSender != null ? this.$successMessage : this.$failureMessage);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C118391) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel$verifyOwnerCode$1", f = "EmailViewModel.kt", l = {AuraRibbonArcKt.RIBBON_TOTAL_MS}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.viewmodel.EmailViewModel$verifyOwnerCode$1, reason: invalid class name and case insensitive filesystem */
    public final class C118401 extends AbstractC07127nr implements G0U<HtJ<? super EmailOwnerVerification>, Object> {
        public final /* synthetic */ EmailOwnerChallenge $challenge;
        public final /* synthetic */ EmailState $state;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118401(EmailOwnerChallenge emailOwnerChallenge, EmailState emailState, HtJ<? super C118401> htJ) {
            super(1, htJ);
            this.$challenge = emailOwnerChallenge;
            this.$state = emailState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return EmailViewModel.this.new C118401(this.$challenge, this.$state, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                EmailViewModel emailViewModel = EmailViewModel.this;
                EmailRepository emailRepository = emailViewModel.repository;
                String str = emailViewModel.environmentId;
                String str2 = this.$challenge.id;
                String str3 = this.$state.ownerCode;
                this.label = 1;
                obj = emailRepository.verifyOwnerCode(str, str2, str3, this);
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
        public final Object invoke(HtJ<? super EmailOwnerVerification> htJ) {
            return ((C118401) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel$withFullMessages$2", f = "EmailViewModel.kt", l = {1410}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.viewmodel.EmailViewModel$withFullMessages$2, reason: invalid class name and case insensitive filesystem */
    public final class C118412 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super EmailThread>, Object> {
        public final /* synthetic */ EmailThread $this_withFullMessages;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ EmailViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118412(EmailThread emailThread, EmailViewModel emailViewModel, HtJ<? super C118412> htJ) {
            super(2, htJ);
            this.$this_withFullMessages = emailThread;
            this.this$0 = emailViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C118412 c118412 = new C118412(this.$this_withFullMessages, this.this$0, htJ);
            c118412.L$0 = obj;
            return c118412;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C3UX c3ux = (C3UX) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                int i2 = GCQ.A00;
                C27i c27i = new C27i(4);
                AHD<EmailMessage> ahd = this.$this_withFullMessages.messages;
                EmailViewModel emailViewModel = this.this$0;
                ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
                Iterator it = ahd.iterator();
                while (it.hasNext()) {
                    arrayListA0i.add(AnonymousClass001.A10(new EmailViewModel$withFullMessages$2$loaded$1$1(c27i, emailViewModel, (EmailMessage) it.next(), null), c3ux));
                }
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                obj = EsN.A00(arrayListA0i, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            EmailThread emailThread = this.$this_withFullMessages;
            AHD ahdA07 = AGI.A07((Iterable) obj);
            EmailSummary emailSummary = emailThread.summary;
            AnonymousClass003.A0u(emailSummary, ahdA07);
            return new EmailThread(emailSummary, ahdA07);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super EmailThread> htJ) {
            return ((C118412) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public EmailViewModel(EmailRepository emailRepository, String str, AbstractC3358CGz abstractC3358CGz) {
        String str2;
        String strA0l;
        AnonymousClass005.A10(emailRepository, str, abstractC3358CGz);
        this.repository = emailRepository;
        this.environmentId = str;
        C8eO c8eO = new C8eO((HoC) AEu.A00(this).A00.get(HoC.A00));
        this.operationsJob = c8eO;
        this.operations = Hxb.A02(AEu.A00(this).A00.plus(c8eO));
        C9286GCn c9286GCn = new C9286GCn(new EmailState(false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, emailRepository.pendingResetAddress(str), false, null, emailRepository.isResetting(str), null, null, -1, 14417919, null));
        this._state = c9286GCn;
        this.state = new C3Pi(null, c9286GCn);
        C9286GCn c9286GCn2 = new C9286GCn(new EmailSettingsCopy(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null));
        this._settingsCopy = c9286GCn2;
        this.settingsCopy = new C3Pi(null, c9286GCn2);
        HatchConnectorCatalogRepository companion = HatchConnectorCatalogRepository.Companion.getInstance(abstractC3358CGz);
        this.connectorCatalog = companion;
        EmailViewModel$special$$inlined$map$1 emailViewModel$special$$inlined$map$1 = new EmailViewModel$special$$inlined$map$1(new C10650I0u(new EmailViewModel$productName$1(this, null), companion.observeConnector(EmailRepository.MUSE_MAIL_CONNECTOR), 1));
        BLL bllA00 = AEu.A00(this);
        C3Es c3Es = new C3Es(5000L, LinkEncryptedPairingKt.LINK_COUNTER_MAX);
        Skill skillConnector = companion.cache.connector(EmailRepository.MUSE_MAIL_CONNECTOR);
        this.productName = AnonymousClass441.A00((skillConnector == null || (str2 = skillConnector.displayName) == null || (strA0l = AnonymousClass002.A0l(str2)) == null || strA0l.length() <= 0) ? null : strA0l, bllA00, emailViewModel$special$$inlined$map$1, c3Es);
        this.flight = SingleFlightKt.SingleFlight(abstractC3358CGz, OnDuplicateCall.Join.INSTANCE, false);
        this.defaultSenderName = "";
        this.setupAgentName = "";
        this.listedThreads = C0881AGi.A00;
        this.deletedMessages = AGH.A0E();
        this.deletingMessageIds = new LinkedHashSet();
        AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
        C9286GCn c9286GCnA01 = HnJ.A01(A3q.A00);
        this._attachmentDownloads = c9286GCnA01;
        this.attachmentDownloads = new C3Pi(null, c9286GCnA01);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object suggestedOwnerAddress(HtJ<? super String> htJ) {
        return GAX.A01(htJ, new C118372(null), 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object withFullMessages(EmailThread emailThread, HtJ<? super EmailThread> htJ) {
        return Hxb.A00(new C118412(emailThread, this, null), htJ);
    }

    public final void applyDefaultSenderName(String str) {
        EmailState value;
        EmailState emailState;
        String str2;
        C7384Etj.A0Y(str, 0);
        this.defaultSenderName = str;
        if (this.editingMailbox || this.nameEdited) {
            return;
        }
        BLG<EmailState> blg = this._state;
        do {
            value = blg.getValue();
            emailState = value;
            str2 = this.suggestedSenderName;
            if (str2 == null) {
                str2 = str;
            }
        } while (!blg.A6e(value, EmailState.copy$default(emailState, false, false, false, null, null, null, false, null, false, false, null, null, str2, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -4097, 16777215, null)));
    }

    public final boolean backFromOwnerConfirmation(String str) {
        C7384Etj.A0Y(str, 0);
        if (AnonymousClass006.A0d(this).ownerChallenge == null) {
            return true;
        }
        editOwnerAddress(str);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void beginOwnerConfirmation(java.lang.String r63, boolean r64, java.lang.String r65) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.viewmodel.EmailViewModel.beginOwnerConfirmation(java.lang.String, boolean, java.lang.String):void");
    }

    public final boolean canConfirmOwner(String str) {
        C7384Etj.A0Y(str, 0);
        String strA0l = AnonymousClass002.A0l(str);
        if (AnonymousClass006.A0d(this).confirmingOwner || strA0l.getBytes(DCl.A05).length > 254) {
            return false;
        }
        for (int i = 0; i < strA0l.length(); i++) {
            char cCharAt = strA0l.charAt(i);
            if (C7LE.A00(cCharAt) || Character.isISOControl(cCharAt)) {
                return false;
            }
        }
        return Patterns.EMAIL_ADDRESS.matcher(strA0l).matches();
    }

    public final boolean canPerformOwnerPrimaryAction(String str) {
        C7384Etj.A0Y(str, 0);
        EmailState emailStateA0d = AnonymousClass006.A0d(this);
        if (!emailStateA0d.confirmingOwner) {
            int iOrdinal = emailStateA0d.getOwnerPrimaryAction().ordinal();
            if (iOrdinal == 0) {
                return canConfirmOwner(str);
            }
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (emailStateA0d.ownerCode.length() == 6) {
                }
            }
            return true;
        }
        return false;
    }

    public final void confirmOwner(String str, String str2) {
        boolean zA1b = AnonymousClass004.A1b(str, str2);
        if (canConfirmOwner(str) && AnonymousClass006.A0d(this).ownerChallenge == null) {
            runOwnerRequest(str2, zA1b, zA1b, AnonymousClass002.A0l(str), new C118131(str, null));
        }
    }

    public final void deleteMailbox(String str, String str2, String str3) {
        EmailMailbox emailMailbox;
        EmailState value;
        boolean zA1a = AnonymousClass002.A1a(str, str2);
        EmailState emailStateA0d = AnonymousClass006.A0d(this);
        boolean z = emailStateA0d.resetMailboxLoaded;
        if (emailStateA0d.deletingMailbox) {
            return;
        }
        if (z) {
            emailMailbox = emailStateA0d.resetMailbox;
        } else {
            emailMailbox = emailStateA0d.mailbox;
            if (emailMailbox == null) {
                return;
            }
        }
        BLG<EmailState> blg = this._state;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, EmailState.copy$default(value, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, zA1a, null, null, -1, 10485759, null)));
        AnonymousClass001.A1J(new AnonymousClass2(emailMailbox, str2, str3, z, str, null), AEu.A00(this));
    }

    public final void deleteMessage(String str, String str2, String str3) {
        EmailThreadUiState.Loaded loaded;
        EmailState value;
        AnonymousClass005.A10(str, str2, str3);
        EmailThreadUiState emailThreadUiState = AnonymousClass006.A0d(this).threadUiState;
        if (!(emailThreadUiState instanceof EmailThreadUiState.Loaded) || (loaded = (EmailThreadUiState.Loaded) emailThreadUiState) == null || this.deletedMessages.containsKey(str)) {
            return;
        }
        AHD<EmailMessage> ahd = loaded.thread.messages;
        if ((ahd instanceof Collection) && ahd.isEmpty()) {
            return;
        }
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            if (str.equals(((EmailMessage) it.next()).id)) {
                EmailThread emailThreadRemovingMessages = loaded.thread.removingMessages(Collections.singleton(str));
                this.deletingMessageIds.add(str);
                this.deletedMessages = AnonymousClass006.A11(str, emailThreadRemovingMessages.messages.isEmpty() ? null : emailThreadRemovingMessages.summary, this.deletedMessages);
                BLG<EmailState> blg = this._state;
                do {
                    value = blg.getValue();
                } while (!blg.A6e(value, EmailState.copy$default(value, false, false, false, null, visibleThreads(), null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, this.threadKey, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -8388625, 16777215, null)));
                AnonymousClass001.A1J(new AnonymousClass4(str, str2, str3, null), this.operations);
                return;
            }
        }
    }

    public final void downloadAttachment(Context context, String str, EmailAttachment emailAttachment, String str2, String str3) {
        AnonymousClass005.A17(context, str, emailAttachment, str2, str3);
        HxE hxEA0p = AnonymousClass002.A0p(str, emailAttachment.index);
        if (AnonymousClass006.A1a(hxEA0p, this._attachmentDownloads)) {
            return;
        }
        while (!AnonymousClass007.A1O(hxEA0p, this._attachmentDownloads)) {
        }
        AnonymousClass001.A1J(new C118142(context, str, emailAttachment, str2, str3, hxEA0p, null), this.operations);
    }

    public final void editHandle(String str) {
        EmailState value;
        C7384Etj.A0Y(str, 0);
        this.handleEdited = true;
        BLG<EmailState> blg = this._state;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, EmailState.copy$default(value, false, false, false, null, null, null, false, null, false, false, null, str, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -3073, 16777215, null)));
        checkAddressAvailability();
    }

    public final void editName(String str) {
        EmailState value;
        C7384Etj.A0Y(str, 0);
        this.nameEdited = true;
        BLG<EmailState> blg = this._state;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, EmailState.copy$default(value, false, false, false, null, null, null, false, null, false, false, null, null, str, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -4097, 16777215, null)));
    }

    public final void editOwnerAddress(String str) {
        EmailState value;
        EmailOwnerCodeFailure emailOwnerCodeFailure;
        C7384Etj.A0Y(str, 0);
        if (!str.equals(this.ownerFormKey) || AnonymousClass006.A0d(this).confirmingOwner) {
            return;
        }
        EmailOwnerChallenge emailOwnerChallenge = AnonymousClass006.A0d(this).ownerChallenge;
        if (emailOwnerChallenge == null || ((emailOwnerCodeFailure = AnonymousClass006.A0d(this).ownerCodeFailure) != null && emailOwnerCodeFailure.getRequiresResend())) {
            emailOwnerChallenge = null;
        }
        resetOwnerConfirmation();
        BLG<EmailState> blg = this._state;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, EmailState.copy$default(value, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, emailOwnerChallenge, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -1, 16777199, null)));
    }

    public final void endOwnerConfirmation(String str) {
        C7384Etj.A0Y(str, 0);
        if (str.equals(this.ownerFormKey)) {
            leaveOwnerStep(str);
            this.ownerFormKey = null;
            this.ownerRequestGeneration++;
            HoC hoC = this.ownerJob;
            if (hoC != null) {
                hoC.A5w(null);
            }
            resetOwnerConfirmation();
        }
    }

    public final void leaveOwnerStep(String str) {
        C7384Etj.A0Y(str, 0);
        if (str.equals(this.ownerFormKey) && this.ownerStepEndsSetup) {
            this.ownerStepEndsSetup = false;
            this.repository.releaseSetupAnnouncement(this.environmentId);
        }
    }

    public final HoC observeInboxConnection() {
        return observeReconnect(new C118211(null));
    }

    public final HoC observePermissionsConnection() {
        return observeReconnect(new C118221(null));
    }

    public final HoC observeSetupConnection() {
        return observeReconnect(new C118241(null));
    }

    public final void onAddressCopied(String str) {
        C7384Etj.A0Y(str, 0);
        ToastApi.INSTANCE.showToast(str);
    }

    public final void pauseOwnerConfirmation(String str, boolean z) {
        EmailState value;
        EmailState emailStateCopy$default;
        C7384Etj.A0Y(str, 0);
        if (str.equals(this.ownerFormKey)) {
            this.ownerRequestGeneration++;
            HoC hoC = this.ownerJob;
            if (hoC != null) {
                hoC.A5w(null);
            }
            BLG<EmailState> blg = this._state;
            do {
                value = blg.getValue();
                EmailState emailState = value;
                if (z) {
                    emailStateCopy$default = EmailState.copy$default(emailState, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -1, 16777214, null);
                } else {
                    EmailOwnerCodeFailure emailOwnerCodeFailure = emailState.ownerCodeFailure;
                    if (emailOwnerCodeFailure == null || !emailOwnerCodeFailure.getRequiresResend()) {
                        emailOwnerCodeFailure = null;
                    }
                    emailStateCopy$default = EmailState.copy$default(emailState, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, "", emailOwnerCodeFailure, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -1, 16776764, null);
                }
            } while (!blg.A6e(value, emailStateCopy$default));
        }
    }

    public final void performOwnerPrimaryAction(String str, String str2) {
        boolean zA1a = AnonymousClass002.A1a(str, str2);
        if (canPerformOwnerPrimaryAction(str)) {
            int iOrdinal = AnonymousClass006.A0d(this).getOwnerPrimaryAction().ordinal();
            if (iOrdinal == 0) {
                confirmOwner(str, str2);
            } else if (iOrdinal == zA1a) {
                resendOwnerCode(str2);
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                verifyOwnerCode(str2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void prepareForm(boolean r74, java.lang.String r75, java.lang.String r76) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.viewmodel.EmailViewModel.prepareForm(boolean, java.lang.String, java.lang.String):void");
    }

    public final void removeSender(EmailSender emailSender) {
        C7384Etj.A0Y(emailSender, 0);
        runSenderAction(false, new C118291(emailSender, null));
    }

    public final void requestOrResendOwnerCode(String str) {
        C7384Etj.A0Y(str, 0);
        EmailState emailStateA0d = AnonymousClass006.A0d(this);
        if (emailStateA0d.ownerChallenge == null) {
            confirmOwner(emailStateA0d.ownerRecipient, str);
        } else {
            resendOwnerCode(str);
        }
    }

    public final void resendOwnerCode(String str) {
        C7384Etj.A0Y(str, 0);
        EmailOwnerChallenge emailOwnerChallenge = AnonymousClass006.A0d(this).ownerChallenge;
        if (emailOwnerChallenge != null) {
            runOwnerRequest(str, false, true, null, new C118301(emailOwnerChallenge, null));
        }
    }

    public final void setIncludeSignature(boolean z, String str) {
        EmailState value;
        C7384Etj.A0Y(str, 1);
        EmailState emailStateA0d = AnonymousClass006.A0d(this);
        EmailSignature emailSignature = emailStateA0d.signature;
        if (emailSignature == null || emailStateA0d.signatureSaving || emailStateA0d.deletingMailbox || emailSignature.isOn == z) {
            return;
        }
        AnonymousClass002.A1K(this.settingsJob);
        BLG<EmailState> blg = this._state;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, EmailState.copy$default(value, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, emailSignature.copy(z, emailSignature.title, emailSignature.subtitle), true, false, false, null, null, null, false, null, false, null, null, -1, 16764927, null)));
        this.settingsJob = AnonymousClass001.A11(new C118352(z, str, emailSignature, null), this.operations);
    }

    public final void trustSender(EmailSummary emailSummary, String str, String str2) {
        AnonymousClass005.A0x(emailSummary, str, str2);
        String str3 = emailSummary.lastMessage.headerFrom;
        if (C7BY.A0j(str3)) {
            return;
        }
        AnonymousClass001.A1J(new C118391(str3, str, str2, null), this.operations);
    }

    public final void updateOwnerCode(String str, String str2) {
        EmailState value;
        EmailState emailState;
        EmailOwnerCodeFailure emailOwnerCodeFailure;
        boolean zA1a = AnonymousClass002.A1a(str, str2);
        if (!str2.equals(this.ownerFormKey) || AnonymousClass006.A0d(this).confirmingOwner) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('0' <= cCharAt && cCharAt < ':') {
                sb.append(cCharAt);
            }
        }
        String strA17 = BQG.A17(sb.toString(), 6);
        BLG<EmailState> blg = this._state;
        do {
            value = blg.getValue();
            emailState = value;
            emailOwnerCodeFailure = emailState.ownerCodeFailure;
            if (emailOwnerCodeFailure == null || emailOwnerCodeFailure.kind == EmailOwnerCodeError.INCORRECT) {
                emailOwnerCodeFailure = null;
            }
        } while (!blg.A6e(value, EmailState.copy$default(emailState, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, strA17, emailOwnerCodeFailure, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -1, 16776765, null)));
        if (strA17.length() == 6) {
            EmailOwnerCodeFailure emailOwnerCodeFailure2 = AnonymousClass006.A0d(this).ownerCodeFailure;
            if (emailOwnerCodeFailure2 == null || emailOwnerCodeFailure2.getRequiresResend() != zA1a) {
                verifyOwnerCode(str2);
            }
        }
    }

    public final void updateOwnerRecipient(String str) {
        EmailState value;
        C7384Etj.A0Y(str, 0);
        if (AnonymousClass006.A0d(this).confirmingOwner) {
            return;
        }
        BLG<EmailState> blg = this._state;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, EmailState.copy$default(value, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, str, true, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, 1073741823, 16777181, null)));
    }

    public final void verifyOwnerCode(String str) {
        C7384Etj.A0Y(str, 0);
        EmailState emailStateA0d = AnonymousClass006.A0d(this);
        EmailOwnerChallenge emailOwnerChallenge = emailStateA0d.ownerChallenge;
        if (emailOwnerChallenge == null || emailStateA0d.ownerCode.length() != 6) {
            return;
        }
        EmailOwnerCodeFailure emailOwnerCodeFailure = emailStateA0d.ownerCodeFailure;
        if (emailOwnerCodeFailure == null || !emailOwnerCodeFailure.getRequiresResend()) {
            runOwnerRequest(str, true, false, null, new C118401(emailOwnerChallenge, emailStateA0d, null));
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EmailOwnerPrimaryAction.values().length];
            try {
                AnonymousClass002.A13(EmailOwnerPrimaryAction.CONFIRM_ADDRESS, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(EmailOwnerPrimaryAction.RESEND_CODE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(EmailOwnerPrimaryAction.VERIFY_CODE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001d A[PHI: r4
  0x001d: PHI (r4v7 java.lang.String) = (r4v1 java.lang.String), (r4v8 java.lang.String) binds: [B:13:0x001b, B:7:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059 A[PHI: r3
  0x0059: PHI (r3v2 com.facebook.aura.email.viewmodel.EmailOwnerCodeFailure) = 
  (r3v0 com.facebook.aura.email.viewmodel.EmailOwnerCodeFailure)
  (r3v3 com.facebook.aura.email.viewmodel.EmailOwnerCodeFailure)
  (r3v3 com.facebook.aura.email.viewmodel.EmailOwnerCodeFailure)
  (r3v3 com.facebook.aura.email.viewmodel.EmailOwnerCodeFailure)
  (r3v3 com.facebook.aura.email.viewmodel.EmailOwnerCodeFailure)
  (r3v3 com.facebook.aura.email.viewmodel.EmailOwnerCodeFailure)
  (r3v3 com.facebook.aura.email.viewmodel.EmailOwnerCodeFailure)
  (r3v3 com.facebook.aura.email.viewmodel.EmailOwnerCodeFailure)
 binds: [B:82:0x0176, B:33:0x0056, B:72:0x0149, B:68:0x013b, B:65:0x0131, B:62:0x0125, B:59:0x0119, B:56:0x010d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017a A[PHI: r4
  0x017a: PHI (r4v3 java.lang.String) = (r4v1 java.lang.String), (r4v7 java.lang.String) binds: [B:13:0x001b, B:15:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void applyOwnerFailure(java.lang.Exception r65) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.viewmodel.EmailViewModel.applyOwnerFailure(java.lang.Exception):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EmailError errorFor(Exception exc, EmailError emailError) {
        NetworkException networkException;
        if ((exc instanceof NetworkException) && (networkException = (NetworkException) exc) != null) {
            int i = networkException.httpResponseCode;
            if (i == 400) {
                return EmailError.INVALID_ADDRESS;
            }
            if (i == 403) {
                return EmailError.NOT_ENABLED;
            }
            if (i == 409) {
                return EmailError.UNAVAILABLE;
            }
            if (i == 429) {
                return EmailError.RATE_LIMITED;
            }
        }
        return emailError;
    }

    private final String formName(EmailState emailState) {
        return EmailSenderNameKt.normalizedEmailSenderName(emailState.senderName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prefillOwnerAddress() {
        EmailState value;
        HoC hoC = this.ownerPrefillJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        BLG<EmailState> blg = this._state;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, EmailState.copy$default(value, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, "", false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, 1073741823, 16777215, null)));
        this.ownerPrefillJob = AnonymousClass001.A11(new C118252(null), this.operations);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refreshPermissions(X.HtJ<? super kotlin.Unit> r64) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.viewmodel.EmailViewModel.refreshPermissions(X.HtJ):java.lang.Object");
    }

    private final void resetOwnerConfirmation() {
        EmailState value;
        BLG<EmailState> blg = this._state;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, EmailState.copy$default(value, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, "", null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -1, 16776704, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runOwnerRequest(String str, boolean z, boolean z2, String str2, G0U<? super HtJ<? super EmailOwnerVerification>, ? extends Object> g0u) {
        EmailState value;
        if (!C7384Etj.areEqual(this.ownerFormKey, str) || AnonymousClass006.A0d(this).confirmingOwner) {
            return;
        }
        BLG<EmailState> blg = this._state;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, EmailState.copy$default(value, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, true, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -1, 16776924, null)));
        int i = this.ownerRequestGeneration + 1;
        this.ownerRequestGeneration = i;
        this.ownerJob = AnonymousClass001.A11(new C118312(g0u, this, str, i, z, z2, str2, null), this.operations);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runSenderAction(boolean z, G0U<? super HtJ<? super Unit>, ? extends Object> g0u) {
        EmailState value;
        if (AnonymousClass006.A0d(this).sendersBusy) {
            return;
        }
        BLG<EmailState> blg = this._state;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, EmailState.copy$default(value, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, true, z, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -469762049, 16777215, null)));
        AnonymousClass001.A1J(new C118322(g0u, this, null), this.operations);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e0  */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object threadsOrReread(X.HtJ<? super com.facebook.aura.email.model.EmailPage<com.facebook.aura.email.model.EmailSummary>> r64) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.viewmodel.EmailViewModel.threadsOrReread(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AHD<EmailSummary> visibleThreads() {
        List<EmailSummary> list = this.listedThreads;
        ArrayList arrayList = new ArrayList();
        Iterator<EmailSummary> it = list.iterator();
        while (it.hasNext()) {
            EmailSummary emailSummaryWithoutDeletedMessages = withoutDeletedMessages(it.next());
            if (emailSummaryWithoutDeletedMessages != null) {
                arrayList.add(emailSummaryWithoutDeletedMessages);
            }
        }
        return AGI.A07(arrayList);
    }

    private final EmailSummary withoutDeletedMessages(EmailSummary emailSummary) {
        if (!this.deletedMessages.containsKey(emailSummary.lastMessage.id)) {
            return emailSummary;
        }
        EmailSummary emailSummary2 = this.deletedMessages.get(emailSummary.lastMessage.id);
        if (emailSummary2 != null) {
            return withoutDeletedMessages(emailSummary2);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitLaunchDestination(java.lang.String r8, X.HtJ<? super com.facebook.aura.email.viewmodel.EmailLaunchDestination> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.email.viewmodel.EmailViewModel.C118121
            if (r0 == 0) goto L5e
            r6 = r9
            com.facebook.aura.email.viewmodel.EmailViewModel$awaitLaunchDestination$1 r6 = (com.facebook.aura.email.viewmodel.EmailViewModel.C118121) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5e
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            java.lang.String r4 = "verified_email"
            r3 = 1
            if (r0 == 0) goto L39
            if (r0 != r3) goto L6a
            java.lang.Object r8 = r6.L$0
            X.Hwg.A00(r1)
        L24:
            com.facebook.aura.email.viewmodel.EmailState r1 = (com.facebook.aura.email.viewmodel.EmailState) r1
            com.facebook.aura.email.model.EmailMailbox r0 = r1.mailbox
            if (r0 == 0) goto L67
            boolean r0 = r0.isTakenDown()
            if (r0 != 0) goto L67
            boolean r0 = r4.equals(r8)
            if (r0 == 0) goto L64
            com.facebook.aura.email.viewmodel.EmailLaunchDestination r5 = com.facebook.aura.email.viewmodel.EmailLaunchDestination.SENDERS
            return r5
        L39:
            X.Hwg.A00(r1)
            java.lang.String r0 = "setup"
            boolean r0 = r0.equals(r8)
            r2 = 0
            if (r0 != 0) goto L4c
            boolean r0 = r4.equals(r8)
            if (r0 != 0) goto L4c
            return r2
        L4c:
            X.1BN<com.facebook.aura.email.viewmodel.EmailState> r1 = r7.state
            com.facebook.aura.email.viewmodel.EmailViewModel$awaitLaunchDestination$ready$1 r0 = new com.facebook.aura.email.viewmodel.EmailViewModel$awaitLaunchDestination$ready$1
            r0.<init>(r2)
            r6.L$0 = r8
            r6.label = r3
            java.lang.Object r1 = X.AbstractC9777Gfy.A00(r6, r0, r1)
            if (r1 != r5) goto L24
            return r5
        L5e:
            com.facebook.aura.email.viewmodel.EmailViewModel$awaitLaunchDestination$1 r6 = new com.facebook.aura.email.viewmodel.EmailViewModel$awaitLaunchDestination$1
            r6.<init>(r9)
            goto L12
        L64:
            com.facebook.aura.email.viewmodel.EmailLaunchDestination r5 = com.facebook.aura.email.viewmodel.EmailLaunchDestination.SETTINGS
            return r5
        L67:
            com.facebook.aura.email.viewmodel.EmailLaunchDestination r5 = com.facebook.aura.email.viewmodel.EmailLaunchDestination.INTRO
            return r5
        L6a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.viewmodel.EmailViewModel.awaitLaunchDestination(java.lang.String, X.HtJ):java.lang.Object");
    }

    public final void checkAddressAvailability() {
        EmailState value;
        EmailState value2;
        AnonymousClass002.A1K(this.availabilityJob);
        EmailState value3 = this._state.getValue();
        String normalizedHandle = value3.getNormalizedHandle();
        if (this.editingMailbox || value3.formLoading || value3.setupFailed || value3.domain.length() == 0 || value3.saving) {
            return;
        }
        int length = normalizedHandle.length();
        if (length == 0 || value3.getHandleError() != null) {
            BLG<EmailState> blg = this._state;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, EmailState.copy$default(value, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, length == 0 ? EmailAddressAvailability.UNKNOWN : EmailAddressAvailability.INVALID, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -262145, 16777215, null)));
        } else {
            int i = this.formGeneration;
            BLG<EmailState> blg2 = this._state;
            do {
                value2 = blg2.getValue();
            } while (!blg2.A6e(value2, EmailState.copy$default(value2, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, EmailAddressAvailability.CHECKING, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -262145, 16777215, null)));
            this.availabilityJob = AnonymousClass001.A11(new AnonymousClass3(normalizedHandle, value3, i, null), this.operations);
        }
    }

    public final void clearDeleteError() {
        EmailState value;
        BLG<EmailState> blg = this._state;
        do {
            value = blg.getValue();
        } while (!C06G.A0q(value, value, blg, 12582911));
    }

    public final void clearSenderError() {
        EmailState value;
        BLG<EmailState> blg = this._state;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, EmailState.copy$default(value, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -268435457, 16777215, null)));
    }

    public final C1BN<Set<HxE<String, Integer>>> getAttachmentDownloads() {
        return this.attachmentDownloads;
    }

    public final C1BN<String> getProductName() {
        return this.productName;
    }

    public final C1BN<EmailSettingsCopy> getSettingsCopy() {
        return this.settingsCopy;
    }

    public final C1BN<EmailState> getState() {
        return this.state;
    }

    public final boolean isMessageDeleteEnabled() {
        return HatchUtils.INSTANCE.isEmailDeleteEnabled();
    }

    public final void loadMailboxForReset() {
        EmailState value;
        if (this.repository.isResetting(this.environmentId)) {
            return;
        }
        BLG<EmailState> blg = this._state;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, EmailState.copy$default(value, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, this.repository.pendingResetAddress(this.environmentId), false, null, false, null, null, -1, 15990783, null)));
        AnonymousClass001.A1J(new C118152(null), this.operations);
    }

    public final void loadMore() {
        EmailState value;
        String str = AnonymousClass006.A0d(this).nextCursor;
        if (str == null || AnonymousClass006.A0d(this).loading || AnonymousClass006.A0d(this).loadingMore) {
            return;
        }
        int i = this.generation;
        BLG<EmailState> blg = this._state;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, EmailState.copy$default(value, false, false, false, null, null, null, true, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -65, 16777215, null)));
        AnonymousClass001.A1J(new C118162(str, i, null), this.operations);
    }

    public final void loadPermissions() {
        EmailState value;
        HoC hoC = this.permissionsJob;
        if ((hoC == null || !hoC.isActive()) && !AnonymousClass006.A0d(this).deletingMailbox) {
            BLG<EmailState> blg = this._state;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, EmailState.copy$default(value, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -1, 16646143, null)));
            this.permissionsJob = AnonymousClass001.A11(new C118172(null), this.operations);
        }
    }

    public final void loadSettings() {
        HoC hoC = this.settingsJob;
        if ((hoC == null || !hoC.isActive()) && !AnonymousClass006.A0d(this).deletingMailbox) {
            this.settingsJob = AnonymousClass001.A11(new C118191(null), this.operations);
        }
    }

    public final void loadSettingsCopy() {
        if (this.settingsCopyReceived) {
            return;
        }
        loadSettings();
    }

    public final void loadThread(String str, String str2) {
        EmailState value;
        boolean zA1b = AnonymousClass004.A1b(str, str2);
        if (!str2.equals(this.threadKey) || C7384Etj.areEqual(AnonymousClass006.A0d(this).threadUiState, EmailThreadUiState.Error.INSTANCE)) {
            this.threadKey = str2;
            int i = this.threadGeneration + 1;
            this.threadGeneration = i;
            BLG<EmailState> blg = this._state;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, EmailState.copy$default(value, zA1b, zA1b, zA1b, null, null, null, zA1b, null, zA1b, zA1b, null, null, null, null, null, null, null, null, null, zA1b, zA1b, null, EmailThreadUiState.Loading.INSTANCE, null, null, null, zA1b, zA1b, null, null, null, zA1b, zA1b, null, null, null, null, null, null, null, zA1b, null, zA1b, null, null, zA1b, zA1b, zA1b, null, null, null, zA1b, null, zA1b, null, null, -12582913, 16777215, null)));
            AnonymousClass001.A1J(new C118202(str, i, str2, null), this.operations);
        }
    }

    @Override // X.AEs
    public void onCleared() {
        String str = this.ownerFormKey;
        if (str != null) {
            leaveOwnerStep(str);
        }
    }

    public final void pullToRefresh() {
        EmailState value;
        BLG<EmailState> blg = this._state;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, EmailState.copy$default(value, false, false, true, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -5, 16777215, null)));
        refresh();
    }

    public final void refresh() {
        EmailState value;
        String strPendingResetAddress = this.repository.pendingResetAddress(this.environmentId);
        if (strPendingResetAddress == null && !this.repository.isResetting(this.environmentId)) {
            this.inboxJob = AnonymousClass001.A11(new C118272(null), this.operations);
        } else {
            BLG<EmailState> blg = this._state;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, EmailState.copy$default(value, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, strPendingResetAddress, false, null, this.repository.isResetting(this.environmentId), null, null, -6, 14417919, null)));
        }
    }

    public final void retrySetup() {
        prepareForm(false, this.setupAgentName, null);
    }

    public final void save(boolean z) {
        EmailState value;
        EmailState emailState;
        if (canSave(z)) {
            EmailState value2 = this._state.getValue();
            AnonymousClass002.A1K(this.availabilityJob);
            String str = this.formKey;
            BLG<EmailState> blg = this._state;
            do {
                value = blg.getValue();
                emailState = value;
            } while (!blg.A6e(value, EmailState.copy$default(emailState, false, false, false, null, null, null, false, null, false, true, null, null, null, null, null, null, null, null, emailState.addressAvailability == EmailAddressAvailability.CHECKING ? EmailAddressAvailability.UNKNOWN : emailState.addressAvailability, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -263681, 16777215, null)));
            AnonymousClass001.A1J(new C118332(z, this, value2, str, null), this.operations);
        }
    }

    public final void setAutoForward(boolean z) {
        boolean zBooleanValue;
        EmailState value;
        Boolean bool = AnonymousClass006.A0d(this).autoForward;
        if (bool == null || (zBooleanValue = bool.booleanValue()) == z) {
            return;
        }
        BLG<EmailState> blg = this._state;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, EmailState.copy$default(value, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, Boolean.valueOf(z), null, null, false, null, false, null, null, -1, 16580607, null)));
        AnonymousClass001.A1J(new C118342(z, zBooleanValue, null), this.operations);
    }

    public final void setPermissionMode(String str, EmailSendPermission emailSendPermission) {
        AHD<EmailPermissionMethod> ahd;
        Object next;
        EmailState value;
        boolean zA1b = AnonymousClass004.A1b(str, emailSendPermission);
        EmailState emailStateA0d = AnonymousClass006.A0d(this);
        EmailPermissions emailPermissions = emailStateA0d.permissions;
        if (emailPermissions == null || (ahd = emailPermissions.methods) == null) {
            return;
        }
        Iterator it = ahd.iterator();
        do {
            next = null;
            if (!it.hasNext()) {
                break;
            } else {
                next = it.next();
            }
        } while (!str.equals(((EmailPermissionMethod) next).key));
        EmailPermissionMethod emailPermissionMethod = (EmailPermissionMethod) next;
        if (emailPermissionMethod != null && emailStateA0d.getCanEditPermissions() && emailPermissionMethod.isEditable() && emailPermissionMethod.mode != emailSendPermission && emailPermissionMethod.options.contains(emailSendPermission)) {
            HoC hoC = this.permissionsJob;
            AnonymousClass002.A1K(hoC);
            BLG<EmailState> blg = this._state;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, EmailState.copy$default(value, zA1b, zA1b, zA1b, null, null, null, zA1b, null, zA1b, zA1b, null, null, null, null, null, null, null, null, null, zA1b, zA1b, null, null, null, null, null, zA1b, zA1b, null, null, null, zA1b, zA1b, null, null, null, null, null, null, null, zA1b, null, zA1b, str, null, zA1b, zA1b, zA1b, null, null, null, zA1b, null, zA1b, null, null, -1, 16644095, null)));
            this.permissionsJob = AnonymousClass001.A11(new C118362(hoC, this, str, emailSendPermission, null), this.operations);
        }
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final String formHandle(EmailState emailState) {
        return emailState.getNormalizedHandle();
    }

    private final HoC observeReconnect(G0U<? super HtJ<? super Unit>, ? extends Object> g0u) {
        return AnonymousClass001.A11(new C118231(g0u, null), AEu.A00(this));
    }

    public final void addSender(String str, String str2) {
        boolean zA1b = AnonymousClass004.A1b(str, str2);
        if (C7BY.A0j(str)) {
            return;
        }
        runSenderAction(zA1b, new C118111(str, str2, null));
    }

    public final boolean canSave(boolean z) {
        EmailState emailStateA0d = AnonymousClass006.A0d(this);
        String strNormalizedEmailSenderName = EmailSenderNameKt.normalizedEmailSenderName(emailStateA0d.senderName);
        if (!emailStateA0d.saving && !emailStateA0d.formLoading && ((z || !emailStateA0d.setupFailed) && emailStateA0d.getSenderNameError() == null && EmailSenderNameKt.hasVisibleEmailSenderName(strNormalizedEmailSenderName))) {
            if (z) {
                EmailMailbox emailMailbox = emailStateA0d.mailbox;
                if (emailMailbox != null && !C7384Etj.areEqual(strNormalizedEmailSenderName, emailMailbox.name)) {
                    return true;
                }
            } else if (!BFI.A0H(new EmailAddressAvailability[]{EmailAddressAvailability.UNAVAILABLE, EmailAddressAvailability.INVALID}).contains(emailStateA0d.addressAvailability) && emailStateA0d.getNormalizedHandle().length() > 0 && emailStateA0d.getHandleError() == null) {
                return true;
            }
        }
        return false;
    }

    public final void loadSenders(boolean z, boolean z2) {
        String str;
        if (AnonymousClass006.A0d(this).sendersBusy) {
            return;
        }
        if (z) {
            str = AnonymousClass006.A0d(this).sendersCursor;
            if (str == null) {
                return;
            }
        } else {
            str = null;
        }
        runSenderAction(z2, new C118181(str, z, null));
    }
}
