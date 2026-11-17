package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.analytics.hatch.caa.HatchCaaEventFlow;
import com.facebook.aura.analytics.hatch.caa.HatchCaaLoginCredentialType;
import com.facebook.aura.analytics.hatch.caa.HatchCaaNtpSourcePlatform;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class NativeLoginCaaSourceKt {
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008c, code lost:
    
        if (r9 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a7, code lost:
    
        if (r9 != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.analytics.hatch.authflow.HatchAuthFlowContext.SsoSourceCounts ssoSourceCounts(java.util.List<com.facebook.aura.login.nativeflow.NativeLoginRowSource> r9) {
        /*
            r3 = 0
            X.C7384Etj.A0Y(r9, r3)
            java.util.ArrayList r8 = X.C3cG.A0h()
            java.util.Iterator r1 = r9.iterator()
        Lc:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r1.next()
            com.facebook.aura.login.nativeflow.NativeLoginRowSource r0 = (com.facebook.aura.login.nativeflow.NativeLoginRowSource) r0
            java.util.List<com.facebook.aura.login.nativeflow.HatchSsoSourceApp> r0 = r0.sourceApps
            X.AbstractC0882AGj.A0r(r0, r8)
            goto Lc
        L1e:
            java.util.ArrayList r4 = X.C3cG.A0h()
            java.util.Iterator r1 = r9.iterator()
        L26:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r1.next()
            com.facebook.aura.login.nativeflow.NativeLoginRowSource r0 = (com.facebook.aura.login.nativeflow.NativeLoginRowSource) r0
            com.facebook.aura.login.nativeflow.NativeLoginRlSource r0 = r0.getRlSource()
            if (r0 == 0) goto L26
            r4.add(r0)
            goto L26
        L3c:
            boolean r9 = r8 instanceof java.util.Collection
            r6 = 0
            if (r9 == 0) goto L6d
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L6d
            r5 = 0
        L48:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L8f
            r7 = 0
        L4f:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto Laa
        L55:
            int r0 = r4.size()
            com.facebook.aura.login.nativeflow.NativeLoginSsoSourceCounts r2 = new com.facebook.aura.login.nativeflow.NativeLoginSsoSourceCounts
            r2.<init>(r5, r7, r6, r0)
            int r1 = r2.fb
            int r0 = r2.ig
            int r1 = r1 + r0
            int r0 = r2.wa
            int r1 = r1 + r0
            int r0 = r2.rl
            int r1 = r1 + r0
            if (r1 != 0) goto Lc1
            r1 = 0
            return r1
        L6d:
            java.util.Iterator r2 = r8.iterator()
            r5 = 0
        L72:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L8c
            java.lang.Object r1 = r2.next()
            com.facebook.aura.login.nativeflow.HatchSsoSourceApp r0 = com.facebook.aura.login.nativeflow.HatchSsoSourceApp.FACEBOOK
            if (r1 != r0) goto L72
            int r5 = r5 + 1
            if (r5 >= 0) goto L72
        L84:
            X.AbstractC0885AGm.A13()
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L8c:
            if (r9 == 0) goto L8f
            goto L48
        L8f:
            java.util.Iterator r2 = r8.iterator()
            r7 = 0
        L94:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La7
            java.lang.Object r1 = r2.next()
            com.facebook.aura.login.nativeflow.HatchSsoSourceApp r0 = com.facebook.aura.login.nativeflow.HatchSsoSourceApp.INSTAGRAM
            if (r1 != r0) goto L94
            int r7 = r7 + 1
            if (r7 >= 0) goto L94
            goto L84
        La7:
            if (r9 == 0) goto Laa
            goto L4f
        Laa:
            java.util.Iterator r2 = r8.iterator()
        Lae:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r1 = r2.next()
            com.facebook.aura.login.nativeflow.HatchSsoSourceApp r0 = com.facebook.aura.login.nativeflow.HatchSsoSourceApp.WHATSAPP
            if (r1 != r0) goto Lae
            int r6 = r6 + 1
            if (r6 >= 0) goto Lae
            goto L84
        Lc1:
            com.facebook.aura.login.nativeflow.NativeLoginCaaSourceKt$ssoSourceCounts$$inlined$groupingBy$1 r0 = new com.facebook.aura.login.nativeflow.NativeLoginCaaSourceKt$ssoSourceCounts$$inlined$groupingBy$1
            r0.<init>()
            java.util.Map r1 = X.A3Z.A00(r0)
            X.C7384Etj.A0Y(r1, r3)
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>(r1)
            java.util.Map r5 = X.AGH.A0A(r0)
            X.9sU r4 = com.facebook.aura.json.HatchJsonKt.HatchJson
            com.facebook.aura.login.nativeflow.NativeLoginSsoSourceCounts$$serializer r0 = com.facebook.aura.login.nativeflow.NativeLoginSsoSourceCounts$$serializer.INSTANCE
            java.lang.String r3 = r4.A02(r2, r0)
            X.9iq r2 = X.C07779iq.A01
            X.9ii r1 = X.C07729ii.A00
            X.9tS r0 = new X.9tS
            r0.<init>(r2, r1)
            java.lang.String r0 = r4.A02(r5, r0)
            com.facebook.aura.analytics.hatch.authflow.HatchAuthFlowContext$SsoSourceCounts r1 = new com.facebook.aura.analytics.hatch.authflow.HatchAuthFlowContext$SsoSourceCounts
            r1.<init>(r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginCaaSourceKt.ssoSourceCounts(java.util.List):com.facebook.aura.analytics.hatch.authflow.HatchAuthFlowContext$SsoSourceCounts");
    }

    public static final HatchCaaLoginCredentialType toCredentialType(HatchSsoSourceApp hatchSsoSourceApp) {
        int iA0E = AnonymousClass001.A0E(hatchSsoSourceApp, 0);
        if (iA0E == 0) {
            return HatchCaaLoginCredentialType.FACEBOOK_ACTIVE_SESSION;
        }
        if (iA0E == 1) {
            return HatchCaaLoginCredentialType.INSTAGRAM_ACTIVE_SESSION;
        }
        if (iA0E == 2) {
            return HatchCaaLoginCredentialType.FRL_ACTIVE_SESSION;
        }
        if (iA0E == 4) {
            return HatchCaaLoginCredentialType.WHATSAPP_AUTH_BUNDLE;
        }
        if (iA0E == 3) {
            return HatchCaaLoginCredentialType.OPENID_CONNECT;
        }
        throw C3cG.A0q();
    }

    public static final HatchCaaEventFlow toLoginFlow(HatchSsoSourceApp hatchSsoSourceApp) {
        int iA0E = AnonymousClass001.A0E(hatchSsoSourceApp, 0);
        if (iA0E == 0) {
            return HatchCaaEventFlow.AYMH_FB;
        }
        if (iA0E == 1) {
            return HatchCaaEventFlow.AYMH_IG;
        }
        if (iA0E == 2) {
            return HatchCaaEventFlow.AYMH_FRL;
        }
        if (iA0E == 4) {
            return HatchCaaEventFlow.AYMH_WA;
        }
        if (iA0E == 3) {
            return HatchCaaEventFlow.LOGIN_SIGN_IN_WITH_GOOGLE;
        }
        throw C3cG.A0q();
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[HatchSsoSourceApp.values().length];
            try {
                AnonymousClass005.A0v(HatchSsoSourceApp.FACEBOOK, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(HatchSsoSourceApp.INSTAGRAM, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchSsoSourceApp.META, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(HatchSsoSourceApp.WHATSAPP, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(HatchSsoSourceApp.GOOGLE, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HatchNtpSourceApp.values().length];
            try {
                AnonymousClass005.A0v(HatchNtpSourceApp.Facebook, iArr2, 1);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass005.A0v(HatchNtpSourceApp.Instagram, iArr2, 2);
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final HatchCaaNtpSourcePlatform toNtpSourcePlatform(String str) {
        HatchSsoSourceApp next;
        Iterator<HatchSsoSourceApp> it = HatchSsoSourceApp.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C7384Etj.areEqual(next.getWireValue(), str)) {
                break;
            }
        }
        HatchSsoSourceApp hatchSsoSourceApp = next;
        if (hatchSsoSourceApp != null) {
            return toNtpSourcePlatform(hatchSsoSourceApp);
        }
        return null;
    }

    public static final HatchCaaNtpSourcePlatform toNtpSourcePlatform(HatchSsoSourceApp hatchSsoSourceApp) {
        int iA0E = AnonymousClass001.A0E(hatchSsoSourceApp, 0);
        if (iA0E != 0) {
            if (iA0E != 1) {
                if (iA0E != 2) {
                    if (iA0E != 4) {
                        if (iA0E == 3) {
                            return null;
                        }
                        throw C3cG.A0q();
                    }
                    return HatchCaaNtpSourcePlatform.WHATSAPP;
                }
                return HatchCaaNtpSourcePlatform.FRL;
            }
            return HatchCaaNtpSourcePlatform.INSTAGRAM;
        }
        return HatchCaaNtpSourcePlatform.FACEBOOK;
    }

    public static final HatchCaaNtpSourcePlatform toNtpSourcePlatform(HatchNtpSourceApp hatchNtpSourceApp) {
        int iA0E = AnonymousClass001.A0E(hatchNtpSourceApp, 0);
        if (iA0E != 0) {
            if (iA0E == 1) {
                return HatchCaaNtpSourcePlatform.INSTAGRAM;
            }
            throw C3cG.A0q();
        }
        return HatchCaaNtpSourcePlatform.FACEBOOK;
    }
}
