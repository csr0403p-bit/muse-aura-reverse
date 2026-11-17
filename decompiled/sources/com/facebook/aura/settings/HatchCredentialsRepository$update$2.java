package com.facebook.aura.settings;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C0881AGi;
import X.C10571Hud;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.perf.HatchConnectorQplLogger;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.settings.HatchCredentialsRepository$update$2", f = "HatchCredentialsRepository.kt", l = {201}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchCredentialsRepository$update$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends CredentialAgentPermission>>, Object> {
    public final /* synthetic */ CredentialAgentPermission $agentPermission;
    public final /* synthetic */ String $id;
    public final /* synthetic */ String $password;
    public final /* synthetic */ String $username;
    public Object L$0;
    public int label;
    public final /* synthetic */ HatchCredentialsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCredentialsRepository$update$2(String str, String str2, HatchCredentialsRepository hatchCredentialsRepository, String str3, CredentialAgentPermission credentialAgentPermission, HtJ<? super HatchCredentialsRepository$update$2> htJ) {
        super(2, htJ);
        this.$username = str;
        this.$password = str2;
        this.this$0 = hatchCredentialsRepository;
        this.$id = str3;
        this.$agentPermission = credentialAgentPermission;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchCredentialsRepository$update$2(this.$username, this.$password, this.this$0, this.$id, this.$agentPermission, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM1941updateBWLJW6A;
        Object c10571Hud;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            String str = this.$username;
            List listAsList = (str == null || this.$password == null) ? C0881AGi.A00 : Arrays.asList(new CredentialCatalogUpdateFieldJson("username", str), new CredentialCatalogUpdateFieldJson(HatchConnectorQplLogger.AuthType.PASSWORD, this.$password));
            HatchCredentialsRepository hatchCredentialsRepository = this.this$0;
            String str2 = this.$id;
            CredentialAgentPermission credentialAgentPermission = this.$agentPermission;
            String wireValue$fbandroid_express_aura_java_com_facebook_aura_settings_settings = credentialAgentPermission != null ? credentialAgentPermission.getWireValue$fbandroid_express_aura_java_com_facebook_aura_settings_settings() : null;
            this.L$0 = null;
            this.label = 1;
            objM1941updateBWLJW6A = hatchCredentialsRepository.m1941updateBWLJW6A(str2, listAsList, wireValue$fbandroid_express_aura_java_com_facebook_aura_settings_settings, this);
            if (objM1941updateBWLJW6A == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1941updateBWLJW6A = AnonymousClass001.A0q(obj);
        }
        Throwable thA00 = HsJ.A00(objM1941updateBWLJW6A);
        if (thA00 == null) {
            CredentialCatalogUpdateResponseJson credentialCatalogUpdateResponseJson = (CredentialCatalogUpdateResponseJson) objM1941updateBWLJW6A;
            if (credentialCatalogUpdateResponseJson.updated) {
                c10571Hud = CredentialAgentPermission.Companion.fromWire(credentialCatalogUpdateResponseJson.agent_permission);
                CredentialAgentPermission credentialAgentPermission2 = this.$agentPermission;
                if (credentialAgentPermission2 != null && c10571Hud != credentialAgentPermission2) {
                    thA00 = new IllegalStateException("credential_agent_permission_update_mismatch");
                }
            } else {
                thA00 = new IllegalStateException("credential_update_failed");
            }
            c10571Hud = new C10571Hud(thA00);
        } else {
            c10571Hud = new C10571Hud(thA00);
        }
        return new HsJ(c10571Hud);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends CredentialAgentPermission>> htJ) {
        return ((HatchCredentialsRepository$update$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
