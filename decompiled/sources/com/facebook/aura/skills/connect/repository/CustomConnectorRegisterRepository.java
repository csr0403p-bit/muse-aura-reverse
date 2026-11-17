package com.facebook.aura.skills.connect.repository;

import X.AbstractC3358CGz;
import X.C10571Hud;
import X.C3cG;
import X.C7384Etj;
import X.F60;
import X.FGI;
import X.HsJ;
import X.HtJ;
import com.facebook.aura.opengraph.HatchOpenGraphRepository;
import java.net.URI;

/* loaded from: classes4.dex */
public final class CustomConnectorRegisterRepository {
    public final AbstractC3358CGz userSession;

    public CustomConnectorRegisterRepository(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
    }

    private final String tokenRefreshPath(String str) {
        Object objA0s;
        try {
            objA0s = new URI(str);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        URI uri = (URI) objA0s;
        String str2 = CustomConnectorRegisterRepositoryKt.ROOT_PATH;
        if (uri != null) {
            String rawPath = uri.getRawPath();
            if (rawPath != null) {
                if (rawPath.length() <= 0) {
                    rawPath = null;
                }
                if (rawPath != null) {
                    str2 = rawPath;
                }
            }
            String rawQuery = uri.getRawQuery();
            if (rawQuery != null) {
                String str3 = rawQuery.length() > 0 ? rawQuery : null;
                if (str3 != null) {
                    return FGI.A0U(str2, HatchOpenGraphRepository.UNKNOWN_HOST, str3);
                }
            }
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00db  */
    /* renamed from: registerApiKey-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2104registerApiKeyBWLJW6A(com.facebook.aura.skills.connect.config.CustomConnectorApiKeyConfig r21, java.lang.String r22, java.lang.String r23, X.HtJ<? super X.HsJ<com.facebook.aura.skills.connect.repository.CustomConnectorRegisterResponse>> r24) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepository.m2104registerApiKeyBWLJW6A(com.facebook.aura.skills.connect.config.CustomConnectorApiKeyConfig, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0140  */
    /* renamed from: registerOAuth-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2105registerOAuthyxL6bBk(com.facebook.aura.skills.connect.config.CustomConnectorOAuthConfig r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, X.HtJ<? super X.HsJ<com.facebook.aura.skills.connect.repository.CustomConnectorRegisterResponse>> r28) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepository.m2105registerOAuthyxL6bBk(com.facebook.aura.skills.connect.config.CustomConnectorOAuthConfig, java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* renamed from: postRegister-gIAlu-s, reason: not valid java name */
    private final /* synthetic */ <T> Object m2101postRegistergIAlus(T t, HtJ<? super HsJ<CustomConnectorRegisterResponse>> htJ) {
        C7384Etj.A0P();
        throw F60.createAndThrow();
    }
}
