package com.facebook.aura.deeplink;

import X.AbstractC10402HbJ;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C06977mk;
import X.C06H;
import X.C31u;
import X.C3cG;
import X.C79V;
import X.C7mA;
import X.C7mB;
import X.InterfaceC7359EnW;
import android.net.Uri;
import com.facebook.aura.common.url.HatchUrl;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.deeplink.MC;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;

/* loaded from: classes3.dex */
public final class AuraDeeplinkAccessValidator {
    public static final int $stable = 8;

    @Deprecated
    public static final String HTTPS_SCHEME = "https";
    public static final C06977mk trustedCaller;
    public final C31u isSecurityEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_sessionless.enable_deeplink_security_checks);
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = AnonymousClass003.A1b(AuraDeeplinkAccessValidator.class, "isSecurityEnabled", "isSecurityEnabled()Z");
    public static final Companion Companion = new Companion();

    public final class Companion {
        public final C06977mk getTrustedCaller() {
            return AuraDeeplinkAccessValidator.trustedCaller;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuraDeeplinkAccessScope.values().length];
            try {
                AnonymousClass002.A13(AuraDeeplinkAccessScope.PUBLIC, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AuraDeeplinkAccessScope.ALL_FAMILY, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AuraDeeplinkAccessScope.NOT_APPLICABLE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        C7mA c7mA = new C7mA();
        c7mA.A01 = C7mB.A00("*|all_packages|*", AbstractC10402HbJ.A0o);
        long j = c7mA.A00 | 1;
        c7mA.A00 = j;
        c7mA.A00 = j | 64;
        trustedCaller = c7mA.A00();
    }

    public final boolean isSecurityEnabled() {
        return C31u.A01(this, this.isSecurityEnabled$delegate, $$delegatedProperties, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b1  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.deeplink.AuraDeeplinkAccessResult validate(android.content.Context r26, android.content.Intent r27, boolean r28) throws java.security.NoSuchAlgorithmException {
        /*
            Method dump skipped, instructions count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.deeplink.AuraDeeplinkAccessValidator.validate(android.content.Context, android.content.Intent, boolean):com.facebook.aura.deeplink.AuraDeeplinkAccessResult");
    }

    private final C79V accessScopeForUri(Uri uri, AuraDeeplinkRouteMapper.BaseRouteSpec baseRouteSpec) {
        AuraDeeplinkAccessScope hatchAccessScope;
        String scheme = uri.getScheme();
        if (scheme == null) {
            return null;
        }
        int iHashCode = scheme.hashCode();
        if (iHashCode != 99050560) {
            if (iHashCode != 99617003 || !scheme.equals("https") || !HatchUrl.INSTANCE.isAcceptedWebHost(uri.getHost())) {
                return null;
            }
            hatchAccessScope = baseRouteSpec.getHttpsAccessScope();
        } else {
            if (!scheme.equals("hatch")) {
                return null;
            }
            hatchAccessScope = baseRouteSpec.getHatchAccessScope();
        }
        int iOrdinal = hatchAccessScope.ordinal();
        if (iOrdinal == 0) {
            return C79V.A03;
        }
        if (iOrdinal == 1) {
            return C79V.A02;
        }
        if (iOrdinal != 2) {
            throw C3cG.A0q();
        }
        return null;
    }
}
