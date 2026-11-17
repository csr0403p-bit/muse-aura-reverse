package com.facebook.aura.settings;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.onepassword.OnePasswordCredentialsKt;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.settings.HatchCredentialsRepository$details$2", f = "HatchCredentialsRepository.kt", l = {412}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchCredentialsRepository$details$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends CredentialDetails>>, Object> {
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
    public final /* synthetic */ HatchCredentialsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCredentialsRepository$details$2(HatchCredentialsRepository hatchCredentialsRepository, String str, HtJ<? super HatchCredentialsRepository$details$2> htJ) {
        super(2, htJ);
        this.this$0 = hatchCredentialsRepository;
        this.$id = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchCredentialsRepository$details$2(this.this$0, this.$id, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends CredentialDetails>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<CredentialDetails>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
        Object objA0s;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
            JarvisPath.CredentialsCatalogDetails credentialsCatalogDetails = JarvisPath.CredentialsCatalogDetails.INSTANCE;
            RequestType requestType = RequestType.GET;
            AbstractC3358CGz abstractC3358CGz = this.this$0.userSession;
            HxE<String, ? extends Object>[] hxEArr = {C3cG.A0r("credential_type", "browser"), C3cG.A0r("id", this.$id)};
            Set<Integer> setA18 = AnonymousClass004.A18();
            C9jH c9jHA0E = AGH.A0E();
            HatchCredentialsRepository$details$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 hatchCredentialsRepository$details$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = HatchCredentialsRepository$details$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.I$0 = 0;
            this.I$1 = 1;
            this.I$2 = 0;
            this.label = 1;
            objM1595executeBodylessJarvisRequestWithp3iPjrY = hatchHttpApi.m1595executeBodylessJarvisRequestWithp3iPjrY(hatchCredentialsRepository$details$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, credentialsCatalogDetails, requestType, abstractC3358CGz, null, hxEArr, null, setA18, false, c9jHA0E, true, null, false, this);
            if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
        }
        Throwable thA00 = HsJ.A00(objM1595executeBodylessJarvisRequestWithp3iPjrY);
        if (thA00 == null) {
            CredentialCatalogDetailsResponseJson credentialCatalogDetailsResponseJson = (CredentialCatalogDetailsResponseJson) objM1595executeBodylessJarvisRequestWithp3iPjrY;
            if (C7384Etj.areEqual(credentialCatalogDetailsResponseJson.id, this.$id) && "browser".equals(credentialCatalogDetailsResponseJson.credential_type)) {
                objA0s = new CredentialDetails(credentialCatalogDetailsResponseJson.username, credentialCatalogDetailsResponseJson.password_present, credentialCatalogDetailsResponseJson.available, HatchCredentialsRepositoryKt.supportedAgentPermission(credentialCatalogDetailsResponseJson), OnePasswordCredentialsKt.isOnePasswordCredential(credentialCatalogDetailsResponseJson.auth_provider, credentialCatalogDetailsResponseJson.protected_field_names));
            } else {
                thA00 = C3cG.A0Q("credential_details_mismatch");
                objA0s = C3cG.A0s(thA00);
            }
        } else {
            objA0s = C3cG.A0s(thA00);
        }
        return C3cG.A0t(objA0s);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<CredentialDetails>> htJ) {
        return ((HatchCredentialsRepository$details$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
