package com.facebook.aura.skills.connect;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C7BY;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.skills.repo.SkillsConnectorAccountsRepository;
import com.facebook.aura.toast.api.ToastApi;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.skills.connect.ConnectorAccountLinkRequesterKt$rememberSuspendingConnectorAccountLinkRequester$1$1", f = "ConnectorAccountLinkRequester.kt", l = {55}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ConnectorAccountLinkRequesterKt$rememberSuspendingConnectorAccountLinkRequester$1$1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $connectorId;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HatchSkillOAuthOrigin $origin;
    public final /* synthetic */ SkillsConnectorAccountsRepository $repository;
    public final /* synthetic */ SingleFlight $requestSingleFlight;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.skills.connect.ConnectorAccountLinkRequesterKt$rememberSuspendingConnectorAccountLinkRequester$1$1$1", f = "ConnectorAccountLinkRequester.kt", l = {56}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.connect.ConnectorAccountLinkRequesterKt$rememberSuspendingConnectorAccountLinkRequester$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $connectorId;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ HatchSkillOAuthOrigin $origin;
        public final /* synthetic */ SkillsConnectorAccountsRepository $repository;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SkillsConnectorAccountsRepository skillsConnectorAccountsRepository, String str, Context context, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, HtJ<? super AnonymousClass1> htJ) {
            super(1, htJ);
            this.$repository = skillsConnectorAccountsRepository;
            this.$connectorId = str;
            this.$context = context;
            this.$origin = hatchSkillOAuthOrigin;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new AnonymousClass1(this.$repository, this.$connectorId, this.$context, this.$origin, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SkillsConnectorAccountsRepository skillsConnectorAccountsRepository = this.$repository;
                String str = this.$connectorId;
                this.label = 1;
                obj = skillsConnectorAccountsRepository.fetchLinkUrl(str, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            String str2 = (String) obj;
            if (str2 == null) {
                ToastApi.INSTANCE.showToast(R.string._name_removed__res_0x7f120b19);
            } else {
                SkillOAuthLinkHandlerKt.openSkillOAuthLink(this.$context, str2, this.$connectorId, this.$origin);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectorAccountLinkRequesterKt$rememberSuspendingConnectorAccountLinkRequester$1$1(String str, SingleFlight singleFlight, SkillsConnectorAccountsRepository skillsConnectorAccountsRepository, Context context, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, HtJ<? super ConnectorAccountLinkRequesterKt$rememberSuspendingConnectorAccountLinkRequester$1$1> htJ) {
        super(1, htJ);
        this.$connectorId = str;
        this.$requestSingleFlight = singleFlight;
        this.$repository = skillsConnectorAccountsRepository;
        this.$context = context;
        this.$origin = hatchSkillOAuthOrigin;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new ConnectorAccountLinkRequesterKt$rememberSuspendingConnectorAccountLinkRequester$1$1(this.$connectorId, this.$requestSingleFlight, this.$repository, this.$context, this.$origin, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (!C7BY.A0j(this.$connectorId)) {
                SingleFlight singleFlight = this.$requestSingleFlight;
                String str = this.$connectorId;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$repository, str, this.$context, this.$origin, null);
                this.label = 1;
                if (singleFlight.invoke(str, anonymousClass1, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
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
        return ((ConnectorAccountLinkRequesterKt$rememberSuspendingConnectorAccountLinkRequester$1$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
