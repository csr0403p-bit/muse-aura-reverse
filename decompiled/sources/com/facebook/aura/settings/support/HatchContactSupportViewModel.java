package com.facebook.aura.settings.support;

import X.AEs;
import X.AEu;
import X.AGI;
import X.AHD;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.BQG;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C22I;
import X.C3Em;
import X.C3UX;
import X.C7384Etj;
import X.C78T;
import X.C7BY;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.net.Uri;
import com.facebook.aura.R;
import com.facebook.aura.browsertask.control.BrowserTaskStopKt;
import com.facebook.aura.bugreport.AuraBugReportCollector;
import com.facebook.aura.bugreport.AuraBugReportSender;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.confidentialvm.session.ConfidentialSessionGate;
import com.facebook.aura.settings.support.HelpTicketAttachmentFiles;
import com.facebook.aura.toast.api.ToastApi;
import com.facebook.aura.user.provider.AuraUserData;
import com.facebook.aura.user.provider.AuraViewerDataProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchContactSupportViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<UiState> _uiState;
    public final C3Em<ViewEffect> _viewEffect;
    public final Context appContext;
    public final ConfidentialSessionGate confidentialSessionGate;
    public final String submissionId;
    public final C1BN<UiState> uiState;
    public final AbstractC3358CGz userSession;
    public final C22I<ViewEffect> viewEffect;

    public final class Factory extends AuraViewModelFactory<HatchContactSupportViewModel> {
        public static final int $stable = 8;
        public final Context appContext;
        public final AbstractC3358CGz userSession;

        public Factory(Context context, AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(context, 0);
            this.appContext = context;
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HatchContactSupportViewModel create() {
            String str;
            String str2;
            AbstractC3358CGz abstractC3358CGz = this.userSession;
            AuraUserData value = abstractC3358CGz != null ? AuraViewerDataProvider.Companion.getInstance(abstractC3358CGz).userData.getValue() : null;
            Context context = this.appContext;
            AbstractC3358CGz abstractC3358CGz2 = this.userSession;
            if (value != null) {
                str = value.namePrefill;
                str2 = value.emailPrefill;
            } else {
                str = null;
                str2 = null;
            }
            return new HatchContactSupportViewModel(context, abstractC3358CGz2, str, str2, abstractC3358CGz2 != null ? ConfidentialSessionGate.Companion.getInstance(abstractC3358CGz2) : null);
        }
    }

    public final class UiState extends C06G {
        public static final int $stable = 8;
        public final AHD<Uri> attachments;
        public final String description;
        public final String email;
        public final boolean isEmailValid;
        public final boolean isSubmitted;
        public final boolean isSubmitting;
        public final String name;
        public final boolean showConfidentialDisclosure;
        public final String topic;
        public final AHD<HatchSupportTopicOption> topics;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof UiState) {
                    UiState uiState = (UiState) obj;
                    if (!C7384Etj.areEqual(this.name, uiState.name) || !C7384Etj.areEqual(this.email, uiState.email) || !C7384Etj.areEqual(this.topics, uiState.topics) || !C7384Etj.areEqual(this.topic, uiState.topic) || !C7384Etj.areEqual(this.description, uiState.description) || !C7384Etj.areEqual(this.attachments, uiState.attachments) || this.isSubmitting != uiState.isSubmitting || this.isSubmitted != uiState.isSubmitted || this.showConfidentialDisclosure != uiState.showConfidentialDisclosure) {
                    }
                }
                return false;
            }
            return true;
        }

        public /* synthetic */ UiState(String str, String str2, AHD ahd, String str3, String str4, AHD ahd2, boolean z, boolean z2, boolean z3, int i, C06H c06h) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? HatchSupportTopicKt.hatchFallbackSupportTopics : ahd, AnonymousClass006.A0u(i, str3), (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? AHI.A01 : ahd2, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? false : z3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UiState copy$default(UiState uiState, String str, String str2, AHD ahd, String str3, String str4, AHD ahd2, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uiState.name;
            }
            if ((i & 2) != 0) {
                str2 = uiState.email;
            }
            if ((i & 4) != 0) {
                ahd = uiState.topics;
            }
            if ((i & 8) != 0) {
                str3 = uiState.topic;
            }
            if ((i & 16) != 0) {
                str4 = uiState.description;
            }
            if ((i & 32) != 0) {
                ahd2 = uiState.attachments;
            }
            if ((i & 64) != 0) {
                z = uiState.isSubmitting;
            }
            if ((i & 128) != 0) {
                z2 = uiState.isSubmitted;
            }
            if ((i & 256) != 0) {
                z3 = uiState.showConfidentialDisclosure;
            }
            return uiState.copy(str, str2, ahd, str3, str4, ahd2, z, z2, z3);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.email;
        }

        public final AHD<HatchSupportTopicOption> component3() {
            return this.topics;
        }

        public final String component4() {
            return this.topic;
        }

        public final String component5() {
            return this.description;
        }

        public final AHD<Uri> component6() {
            return this.attachments;
        }

        public final boolean component7() {
            return this.isSubmitting;
        }

        public final boolean component8() {
            return this.isSubmitted;
        }

        public final boolean component9() {
            return this.showConfidentialDisclosure;
        }

        public final AHD<Uri> getAttachments() {
            return this.attachments;
        }

        public final boolean getCanAddAttachment() {
            return !this.isSubmitting && this.attachments.size() < 5;
        }

        public final boolean getCanSubmit() {
            return (this.isSubmitting || this.isSubmitted || C7BY.A0j(this.name) || !this.isEmailValid || this.topic == null || C7BY.A0j(this.description)) ? false : true;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getName() {
            return this.name;
        }

        public final boolean getShowConfidentialDisclosure() {
            return this.showConfidentialDisclosure;
        }

        public final boolean getShowEmailError() {
            return (C7BY.A0j(this.email) || this.isEmailValid) ? false : true;
        }

        public final String getTopic() {
            return this.topic;
        }

        public final AHD<HatchSupportTopicOption> getTopics() {
            return this.topics;
        }

        public int hashCode() {
            return C0KA.A00(C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.attachments, AnonymousClass005.A0I(this.description, (AnonymousClass005.A0F(this.topics, AnonymousClass005.A0I(this.email, AnonymousClass001.A0G(this.name))) + AnonymousClass006.A0G(this.topic)) * 31)), this.isSubmitting), this.isSubmitted), this.showConfidentialDisclosure);
        }

        public final boolean isDescriptionAtLimit() {
            return this.description.length() >= 1800;
        }

        public final boolean isSubmitted() {
            return this.isSubmitted;
        }

        public final boolean isSubmitting() {
            return this.isSubmitting;
        }

        public final UiState copy(String str, String str2, AHD<HatchSupportTopicOption> ahd, String str3, String str4, AHD<? extends Uri> ahd2, boolean z, boolean z2, boolean z3) {
            AnonymousClass005.A0x(str, str2, ahd);
            AnonymousClass003.A0y(str4, ahd2);
            return new UiState(str, str2, ahd, str3, str4, ahd2, z, z2, z3);
        }

        public String toString() {
            return super.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public UiState(String str, String str2, AHD<HatchSupportTopicOption> ahd, String str3, String str4, AHD<? extends Uri> ahd2, boolean z, boolean z2, boolean z3) {
            AnonymousClass005.A0x(str, str2, ahd);
            AnonymousClass003.A0y(str4, ahd2);
            this.name = str;
            this.email = str2;
            this.topics = ahd;
            this.topic = str3;
            this.description = str4;
            this.attachments = ahd2;
            this.isSubmitting = z;
            this.isSubmitted = z2;
            this.showConfidentialDisclosure = z3;
            this.isEmailValid = HatchContactSupportViewModelKt.isValidEmail(AnonymousClass002.A0l(str2));
        }

        public UiState() {
            this("", "", HatchSupportTopicKt.hatchFallbackSupportTopics, null, "", AHI.A01, false, false, false);
        }
    }

    public interface ViewEffect {

        public final class SubmitFailed implements ViewEffect {
            public static final int $stable = 0;
            public static final SubmitFailed INSTANCE = new SubmitFailed();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof SubmitFailed);
            }

            public String toString() {
                return "SubmitFailed";
            }

            public int hashCode() {
                return 857770222;
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.support.HatchContactSupportViewModel$loadTopics$1", f = "HatchContactSupportViewModel.kt", l = {124}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.support.HatchContactSupportViewModel$loadTopics$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchContactSupportViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            UiState value;
            UiState uiState;
            AHD<HatchSupportTopicOption> ahdA07;
            String str;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchContactSupportApi hatchContactSupportApi = HatchContactSupportApi.INSTANCE;
                this.label = 1;
                obj = hatchContactSupportApi.fetchTopics(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            List list = (List) obj;
            if (!list.isEmpty()) {
                BLG<UiState> blg = HatchContactSupportViewModel.this._uiState;
                do {
                    value = blg.getValue();
                    uiState = value;
                    ArrayList arrayListA0i = AnonymousClass003.A0i(list);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayListA0i.add(((HatchSupportTopicOption) it.next()).slug);
                    }
                    Set setA0g = AbstractC0878AGe.A0g(arrayListA0i);
                    ahdA07 = AGI.A07(list);
                    String str2 = uiState.topic;
                    str = null;
                    if (str2 != null && setA0g.contains(str2)) {
                        str = str2;
                    }
                } while (!blg.A6e(value, uiState.copy(uiState.name, uiState.email, ahdA07, str, uiState.description, uiState.attachments, uiState.isSubmitting, uiState.isSubmitted, uiState.showConfidentialDisclosure)));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchContactSupportViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.support.HatchContactSupportViewModel$observeConfidentialSession$1", f = "HatchContactSupportViewModel.kt", l = {116}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.support.HatchContactSupportViewModel$observeConfidentialSession$1, reason: invalid class name and case insensitive filesystem */
    public final class C136411 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ConfidentialSessionGate $gate;
        public int label;
        public final /* synthetic */ HatchContactSupportViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136411(ConfidentialSessionGate confidentialSessionGate, HatchContactSupportViewModel hatchContactSupportViewModel, HtJ<? super C136411> htJ) {
            super(2, htJ);
            this.$gate = confidentialSessionGate;
            this.this$0 = hatchContactSupportViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C136411(this.$gate, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C20Q<Boolean> c20q = this.$gate.isConfidentialVmFlow;
                final HatchContactSupportViewModel hatchContactSupportViewModel = this.this$0;
                C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.settings.support.HatchContactSupportViewModel.observeConfidentialSession.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        UiState value;
                        BLG<UiState> blg = hatchContactSupportViewModel._uiState;
                        do {
                            value = blg.getValue();
                        } while (!blg.A6e(value, UiState.copy$default(value, null, null, null, null, null, null, false, false, z, 255, null)));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c20q.collect(c20z, this) == enumC10460Hji) {
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
            return ((C136411) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.support.HatchContactSupportViewModel$onAttachmentsPicked$1", f = "HatchContactSupportViewModel.kt", l = {159}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.support.HatchContactSupportViewModel$onAttachmentsPicked$1, reason: invalid class name and case insensitive filesystem */
    public final class C136421 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ List<Uri> $uris;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C136421(List<? extends Uri> list, HtJ<? super C136421> htJ) {
            super(2, htJ);
            this.$uris = list;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchContactSupportViewModel.this.new C136421(this.$uris, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            UiState value;
            UiState uiState;
            LinkedHashMap linkedHashMap;
            int size;
            boolean z;
            ToastApi toastApi;
            Context context;
            int i;
            Object num;
            Object[] objArr;
            Object objA00 = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i2 = this.label;
            if (i2 == 0) {
                C78T c78tA0s = AnonymousClass002.A0s(objA00);
                HatchContactSupportViewModel$onAttachmentsPicked$1$admissions$1 hatchContactSupportViewModel$onAttachmentsPicked$1$admissions$1 = new HatchContactSupportViewModel$onAttachmentsPicked$1$admissions$1(this.$uris, HatchContactSupportViewModel.this, null);
                this.label = 1;
                objA00 = GAo.A00(this, c78tA0s, hatchContactSupportViewModel$onAttachmentsPicked$1$admissions$1);
                if (objA00 == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i2 != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(objA00);
            }
            Map map = (Map) objA00;
            BLG<UiState> blg = HatchContactSupportViewModel.this._uiState;
            do {
                value = blg.getValue();
                uiState = value;
                linkedHashMap = new LinkedHashMap();
                Iterator itA0n = AnonymousClass002.A0n(map);
                while (itA0n.hasNext()) {
                    Map.Entry entry = (Map.Entry) itA0n.next();
                    Object key = entry.getKey();
                    if (entry.getValue() == HelpTicketAttachmentFiles.Admission.ACCEPTED && !uiState.attachments.contains(key)) {
                        AnonymousClass006.A1R(linkedHashMap, entry);
                    }
                }
                size = 5 - uiState.attachments.size();
                z = linkedHashMap.size() > size;
            } while (!blg.A6e(value, UiState.copy$default(uiState, null, null, null, null, null, AGI.A07(AbstractC0878AGe.A0P(AbstractC0878AGe.A0a(linkedHashMap.keySet(), size), uiState.attachments)), false, false, false, 479, null)));
            if (!map.values().contains(HelpTicketAttachmentFiles.Admission.TOO_LARGE)) {
                if (z) {
                    toastApi = ToastApi.INSTANCE;
                    context = HatchContactSupportViewModel.this.appContext;
                    i = R.string._name_removed__res_0x7f120ab7;
                    num = new Integer(5);
                    objArr = new Object[1];
                }
                return Unit.INSTANCE;
            }
            toastApi = ToastApi.INSTANCE;
            context = HatchContactSupportViewModel.this.appContext;
            i = R.string._name_removed__res_0x7f120bf4;
            objArr = new Object[1];
            num = "10";
            objArr[0] = num;
            toastApi.showToast(context.getString(i, objArr));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C136421) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.settings.support.HatchContactSupportViewModel$onSubmit$1, reason: invalid class name and case insensitive filesystem */
    public final class C136431 extends AbstractC7559F3s implements Function0<Unit> {
        public static final C136431 INSTANCE = new C136431();

        public C136431() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* renamed from: com.facebook.aura.settings.support.HatchContactSupportViewModel$onSubmit$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.support.HatchContactSupportViewModel$onSubmit$3", f = "HatchContactSupportViewModel.kt", l = {210}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.support.HatchContactSupportViewModel$onSubmit$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $description;
        public final /* synthetic */ List<AuraBugReportCollector.CollectedItem> $diagnostics;
        public final /* synthetic */ Function0<Unit> $onDiagnosticsAcceptedForUpload;
        public final /* synthetic */ Function0<Unit> $onDiagnosticsSkipped;
        public final /* synthetic */ UiState $state;
        public final /* synthetic */ String $topic;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(UiState uiState, String str, String str2, List<AuraBugReportCollector.CollectedItem> list, Function0<Unit> function0, Function0<Unit> function02, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$state = uiState;
            this.$topic = str;
            this.$description = str2;
            this.$diagnostics = list;
            this.$onDiagnosticsSkipped = function0;
            this.$onDiagnosticsAcceptedForUpload = function02;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchContactSupportViewModel.this.new AnonymousClass3(this.$state, this.$topic, this.$description, this.$diagnostics, this.$onDiagnosticsSkipped, this.$onDiagnosticsAcceptedForUpload, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            UiState value;
            UiState value2;
            UiState uiState;
            Object objSubmitTicket$fbandroid_express_aura_java_com_facebook_aura_settings_support_support = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(objSubmitTicket$fbandroid_express_aura_java_com_facebook_aura_settings_support_support);
                BLG<UiState> blg = HatchContactSupportViewModel.this._uiState;
                do {
                    value = blg.getValue();
                } while (!blg.A6e(value, UiState.copy$default(value, null, null, null, null, null, null, true, false, false, 447, null)));
                HatchContactSupportApi hatchContactSupportApi = HatchContactSupportApi.INSTANCE;
                Context context = HatchContactSupportViewModel.this.appContext;
                HelpTicketRequestJson helpTicketRequestJson = new HelpTicketRequestJson(AnonymousClass002.A0l(this.$state.name), AnonymousClass002.A0l(this.$state.email), this.$topic, this.$description);
                AHD<Uri> ahd = this.$state.attachments;
                this.label = 1;
                objSubmitTicket$fbandroid_express_aura_java_com_facebook_aura_settings_support_support = hatchContactSupportApi.submitTicket$fbandroid_express_aura_java_com_facebook_aura_settings_support_support(context, helpTicketRequestJson, ahd, this);
                if (objSubmitTicket$fbandroid_express_aura_java_com_facebook_aura_settings_support_support == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(objSubmitTicket$fbandroid_express_aura_java_com_facebook_aura_settings_support_support);
            }
            String str = (String) objSubmitTicket$fbandroid_express_aura_java_com_facebook_aura_settings_support_support;
            BLG<UiState> blg2 = HatchContactSupportViewModel.this._uiState;
            do {
                value2 = blg2.getValue();
                uiState = value2;
            } while (!blg2.A6e(value2, uiState.copy(uiState.name, uiState.email, uiState.topics, uiState.topic, uiState.description, uiState.attachments, false, AnonymousClass002.A1X(str), uiState.showConfidentialDisclosure)));
            if (str == null) {
                HatchContactSupportViewModel.this._viewEffect.AhV(ViewEffect.SubmitFailed.INSTANCE);
            } else if (this.$diagnostics == null) {
                this.$onDiagnosticsSkipped.invoke();
            } else {
                this.$onDiagnosticsAcceptedForUpload.invoke();
                HatchContactSupportViewModel.this.sendDiagnostics(str, this.$topic, this.$description, this.$diagnostics);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void onAttachmentRemoved(Uri uri) {
        UiState value;
        UiState uiState;
        C7384Etj.A0Y(uri, 0);
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
            uiState = value;
        } while (!blg.A6e(value, UiState.copy$default(uiState, null, null, null, null, null, AGI.A07(AbstractC0878AGe.A0b(uiState.attachments, uri)), false, false, false, 479, null)));
    }

    public final void onAttachmentsPicked(List<? extends Uri> list) {
        C7384Etj.A0Y(list, 0);
        AnonymousClass001.A1J(new C136421(list, null), AEu.A00(this));
    }

    public final void onDescriptionChange(String str) {
        UiState value;
        C7384Etj.A0Y(str, 0);
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, UiState.copy$default(value, null, null, null, null, BQG.A17(str, HatchContactSupportViewModelKt.MAX_DESCRIPTION_LENGTH), null, false, false, false, 495, null)));
    }

    public final void onEmailChange(String str) {
        UiState value;
        C7384Etj.A0Y(str, 0);
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, UiState.copy$default(value, null, BQG.A17(str, HatchContactSupportViewModelKt.MAX_EMAIL_LENGTH), null, null, null, null, false, false, false, 509, null)));
    }

    public final void onNameChange(String str) {
        UiState value;
        C7384Etj.A0Y(str, 0);
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, UiState.copy$default(value, BQG.A17(str, 200), null, null, null, null, null, false, false, false, 510, null)));
    }

    public final void onSubmit(List<AuraBugReportCollector.CollectedItem> list, Function0<Unit> function0, Function0<Unit> function02) {
        AnonymousClass003.A0x(function0, function02);
        UiState value = this._uiState.getValue();
        String str = value.topic;
        if (!value.getCanSubmit() || str == null) {
            return;
        }
        String strA0l = AnonymousClass002.A0l(value.description);
        AnonymousClass001.A1J(new AnonymousClass3(value, str, strA0l, list, function02, function0, null), AEu.A00(this));
    }

    public final void onTopicSelected(String str) {
        UiState value;
        C7384Etj.A0Y(str, 0);
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, UiState.copy$default(value, null, null, null, str, null, null, false, false, false, BrowserTaskStopKt.HTTP_SERVICE_UNAVAILABLE, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HatchContactSupportViewModel(android.content.Context r14, X.AbstractC3358CGz r15, java.lang.String r16, java.lang.String r17, com.facebook.aura.confidentialvm.session.ConfidentialSessionGate r18) {
        /*
            r13 = this;
            r4 = r16
            r5 = r17
            r10 = 0
            X.C7384Etj.A0Y(r14, r10)
            r13.<init>()
            r13.appContext = r14
            r13.userSession = r15
            r3 = r18
            r13.confidentialSessionGate = r3
            java.lang.String r0 = X.AnonymousClass002.A0k()
            r13.submissionId = r0
            java.lang.Integer r0 = X.C79.A01
            r7 = 0
            r2 = 1
            X.GCr r1 = new X.GCr
            r1.<init>(r0, r10, r2)
            r13._viewEffect = r1
            X.3pd r0 = new X.3pd
            r0.<init>(r1)
            r13.viewEffect = r0
            java.lang.String r8 = ""
            if (r16 != 0) goto L30
            r4 = r8
        L30:
            if (r17 != 0) goto L33
            r5 = r8
        L33:
            if (r18 == 0) goto L3c
            boolean r0 = r3.isConfidentialVm()
            r12 = 1
            if (r0 == r2) goto L3d
        L3c:
            r12 = 0
        L3d:
            X.AHD<com.facebook.aura.settings.support.HatchSupportTopicOption> r6 = com.facebook.aura.settings.support.HatchSupportTopicKt.hatchFallbackSupportTopics
            X.AHI r9 = X.AHI.A01
            com.facebook.aura.settings.support.HatchContactSupportViewModel$UiState r3 = new com.facebook.aura.settings.support.HatchContactSupportViewModel$UiState
            r11 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            X.GCn r1 = new X.GCn
            r1.<init>(r3)
            r13._uiState = r1
            X.3Pi r0 = new X.3Pi
            r0.<init>(r7, r1)
            r13.uiState = r0
            r13.loadTopics()
            r13.observeConfidentialSession()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.support.HatchContactSupportViewModel.<init>(android.content.Context, X.CGz, java.lang.String, java.lang.String, com.facebook.aura.confidentialvm.session.ConfidentialSessionGate):void");
    }

    private final void observeConfidentialSession() {
        ConfidentialSessionGate confidentialSessionGate = this.confidentialSessionGate;
        if (confidentialSessionGate != null) {
            AnonymousClass001.A1J(new C136411(confidentialSessionGate, this, null), AEu.A00(this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onSubmit$default(HatchContactSupportViewModel hatchContactSupportViewModel, List list, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            function0 = C136431.INSTANCE;
        }
        if ((i & 4) != 0) {
            function02 = AnonymousClass2.INSTANCE;
        }
        hatchContactSupportViewModel.onSubmit(list, function0, function02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendDiagnostics(String str, String str2, String str3, List<AuraBugReportCollector.CollectedItem> list) {
        AuraBugReportSender auraBugReportSender = AuraBugReportSender.INSTANCE;
        AbstractC3358CGz abstractC3358CGz = this.userSession;
        Context context = this.appContext;
        String str4 = this.submissionId;
        String strA0d = FGI.A0d("[Support case ", str, "] ", str3);
        C0881AGi c0881AGi = C0881AGi.A00;
        auraBugReportSender.send(abstractC3358CGz, context, str4, strA0d, c0881AGi, null, true, list, str2, null, c0881AGi, false, c0881AGi, true, false, null, AuraBugReportSender.C110091.INSTANCE, AuraBugReportSender.AnonymousClass2.INSTANCE, AuraBugReportSender.AnonymousClass3.INSTANCE);
    }

    public final String getSubmissionId() {
        return this.submissionId;
    }

    public final C1BN<UiState> getUiState() {
        return this.uiState;
    }

    public final C22I<ViewEffect> getViewEffect() {
        return this.viewEffect;
    }

    private final void loadTopics() {
        AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
    }

    public /* synthetic */ HatchContactSupportViewModel(Context context, AbstractC3358CGz abstractC3358CGz, String str, String str2, ConfidentialSessionGate confidentialSessionGate, int i, C06H c06h) {
        this(context, abstractC3358CGz, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : confidentialSessionGate);
    }
}
