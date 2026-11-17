package com.facebook.aura.auth.bindings;

import X.AbstractC2556Bdh;
import X.C7384Etj;
import X.EsA;
import X.F60;
import X.InterfaceC5259DeO;
import com.facebook.aura.auth.bindings.AuraAuthBindingsModule;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.reactivesocket.flipper.common.FlipperLiveDataProvider;

/* loaded from: classes5.dex */
public class GeneratedAuraAuthBindingsModule {
    public static final ViewerContext _UL__ULSEP_com_facebook_auth_viewercontext_ViewerContext_ULSEP_FACTORY_METHOD(int i, InterfaceC5259DeO interfaceC5259DeO, Object obj) {
        ViewerContext viewerContext = ViewerContext.A0D;
        C7384Etj.A0V(viewerContext);
        return viewerContext;
    }

    public static final AbstractC2556Bdh<String> _UL__ULSEP_java_lang_String_ULSEP_com_facebook_auth_annotations_LoggedInUserId_ULSEP_FACTORY_METHOD(int i, InterfaceC5259DeO interfaceC5259DeO, Object obj) {
        return new AbstractC2556Bdh<String>() { // from class: com.facebook.aura.auth.bindings.GeneratedAuraAuthBindingsModule.2
            @Override // X.AbstractC2556Bdh
            public /* bridge */ /* synthetic */ String getOrNull() {
                AuraAuthBindingsModule.provideLoggedInUserId();
                throw F60.createAndThrow();
            }

            @Override // X.AbstractC2556Bdh
            /* renamed from: getOrNull, reason: avoid collision after fix types in other method */
            public String getOrNull2() {
                AuraAuthBindingsModule.provideLoggedInUserId();
                throw F60.createAndThrow();
            }
        };
    }

    public static final AbstractC2556Bdh<String> _UL__ULSEP_java_lang_String_ULSEP_com_facebook_mobileconfig_init_annotation_LoggedInMcUserId_ULSEP_FACTORY_METHOD(int i, InterfaceC5259DeO interfaceC5259DeO, Object obj) {
        return new AbstractC2556Bdh<String>() { // from class: com.facebook.aura.auth.bindings.GeneratedAuraAuthBindingsModule.1
            @Override // X.AbstractC2556Bdh
            public /* bridge */ /* synthetic */ String getOrNull() {
                return AuraAuthBindingsModule.provideLoggedInMcUserId();
            }

            @Override // X.AbstractC2556Bdh
            /* renamed from: getOrNull, reason: avoid collision after fix types in other method */
            public String getOrNull2() {
                return AuraAuthBindingsModule.provideLoggedInMcUserId();
            }
        };
    }

    public static final EsA _UL__ULSEP_com_facebook_auth_viewercontextmanager_ViewerContextUserIdProvider_ULSEP_FACTORY_METHOD(int i, InterfaceC5259DeO interfaceC5259DeO, Object obj) {
        AuraAuthBindingsModule.provideViewerContextUserIdProvider();
        throw F60.createAndThrow();
    }

    public static final FlipperLiveDataProvider _UL__ULSEP_com_facebook_reactivesocket_flipper_common_FlipperLiveDataProvider_ULSEP_FACTORY_METHOD(int i, InterfaceC5259DeO interfaceC5259DeO, Object obj) {
        AuraAuthBindingsModule.provideFlipperLiveDataProvider();
        throw F60.createAndThrow();
    }

    public static final AuraAuthBindingsModule.AnonymousClass1 _UL__ULSEP_com_facebook_auth_viewercontextmanager_ViewerContextFactory_ULSEP_FACTORY_METHOD(int i, InterfaceC5259DeO interfaceC5259DeO, Object obj) {
        return AuraAuthBindingsModule.AnonymousClass1.INSTANCE;
    }
}
