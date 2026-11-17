package com.facebook.aura.skills.connect;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.C7384Etj;
import X.C7BY;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.HwV;
import X.Hwg;
import android.content.Context;
import com.facebook.aura.browser.AuraBrowserLauncherKt;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.skills.repo.SkillPermissionsRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes.dex */
public final class ConnectorScopeAccessRequesterKt$rememberConnectorScopeAccessRequester$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ String $accountId;
    public final /* synthetic */ String $connectorId;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ SkillPermissionsRepository $repository;
    public final /* synthetic */ SingleFlight $requestSingleFlight;

    @DebugMetadata(c = "com.facebook.aura.skills.connect.ConnectorScopeAccessRequesterKt$rememberConnectorScopeAccessRequester$1$1$1", f = "ConnectorScopeAccessRequester.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.connect.ConnectorScopeAccessRequesterKt$rememberConnectorScopeAccessRequester$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $accountId;
        public final /* synthetic */ String $connectorId;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ SkillPermissionsRepository $repository;
        public final /* synthetic */ SingleFlight $requestSingleFlight;
        public final /* synthetic */ String $scopeKey;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.skills.connect.ConnectorScopeAccessRequesterKt$rememberConnectorScopeAccessRequester$1$1$1$1", f = "ConnectorScopeAccessRequester.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.skills.connect.ConnectorScopeAccessRequesterKt$rememberConnectorScopeAccessRequester$1$1$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03661 extends AbstractC07127nr implements G0U<HtJ<? super Boolean>, Object> {
            public final /* synthetic */ String $accountId;
            public final /* synthetic */ String $connectorId;
            public final /* synthetic */ Context $context;
            public final /* synthetic */ SkillPermissionsRepository $repository;
            public final /* synthetic */ String $scopeKey;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03661(SkillPermissionsRepository skillPermissionsRepository, String str, String str2, String str3, Context context, HtJ<? super C03661> htJ) {
                super(1, htJ);
                this.$repository = skillPermissionsRepository;
                this.$connectorId = str;
                this.$scopeKey = str2;
                this.$accountId = str3;
                this.$context = context;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C03661(this.$repository, this.$connectorId, this.$scopeKey, this.$accountId, this.$context, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    SkillPermissionsRepository skillPermissionsRepository = this.$repository;
                    String str = this.$connectorId;
                    String str2 = this.$scopeKey;
                    String str3 = this.$accountId;
                    this.label = 1;
                    obj = skillPermissionsRepository.fetchScopeLinkUrl(str, str2, str3, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                String str4 = (String) obj;
                if (str4 != null) {
                    return Boolean.valueOf(AuraBrowserLauncherKt.openBrowser(str4, this.$context));
                }
                return null;
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Boolean> htJ) {
                return ((C03661) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SingleFlight singleFlight, String str, String str2, String str3, SkillPermissionsRepository skillPermissionsRepository, Context context, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$requestSingleFlight = singleFlight;
            this.$connectorId = str;
            this.$scopeKey = str2;
            this.$accountId = str3;
            this.$repository = skillPermissionsRepository;
            this.$context = context;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$requestSingleFlight, this.$connectorId, this.$scopeKey, this.$accountId, this.$repository, this.$context, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SingleFlight singleFlight = this.$requestSingleFlight;
                String str = this.$connectorId;
                String str2 = this.$scopeKey;
                String str3 = this.$accountId;
                HwV hwV = new HwV(str, str2, str3);
                C03661 c03661 = new C03661(this.$repository, str, str2, str3, this.$context, null);
                this.label = 1;
                if (singleFlight.invoke(hwV, c03661, this) == enumC10460Hji) {
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
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        if (C7BY.A0j(this.$connectorId) || C7BY.A0j(str)) {
            return;
        }
        AnonymousClass001.A1J(new AnonymousClass1(this.$requestSingleFlight, this.$connectorId, str, this.$accountId, this.$repository, this.$context, null), this.$coroutineScope);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectorScopeAccessRequesterKt$rememberConnectorScopeAccessRequester$1$1(String str, C3UX c3ux, SingleFlight singleFlight, String str2, SkillPermissionsRepository skillPermissionsRepository, Context context) {
        super(1);
        this.$connectorId = str;
        this.$coroutineScope = c3ux;
        this.$requestSingleFlight = singleFlight;
        this.$accountId = str2;
        this.$repository = skillPermissionsRepository;
        this.$context = context;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
