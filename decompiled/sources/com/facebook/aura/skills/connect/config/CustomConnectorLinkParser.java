package com.facebook.aura.skills.connect.config;

import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class CustomConnectorLinkParser {
    public static final String API_KEY_PATH = "/connect/api-key";
    public static final String API_KEY_SCHEME = "api-key";
    public static final String CONFIG_QUERY_PARAM = "spec";
    public static final String HTTPS_SCHEME = "https";
    public static final CustomConnectorLinkParser INSTANCE = new CustomConnectorLinkParser();
    public static final String OAUTH_PATH = "/connect/oauth";
    public static final String OAUTH_SCHEME = "oauth";
    public static final String SERVICE_PARAM = "service";

    public final class LinkForm extends C06G {
        public final CustomConnectorMode mode;
        public final boolean requiresServiceMatch;

        public LinkForm(CustomConnectorMode customConnectorMode, boolean z) {
            C7384Etj.A0Y(customConnectorMode, 0);
            this.mode = customConnectorMode;
            this.requiresServiceMatch = z;
        }

        public final LinkForm copy(CustomConnectorMode customConnectorMode, boolean z) {
            C7384Etj.A0Y(customConnectorMode, 0);
            return new LinkForm(customConnectorMode, z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof LinkForm) {
                    LinkForm linkForm = (LinkForm) obj;
                    if (this.mode != linkForm.mode || this.requiresServiceMatch != linkForm.requiresServiceMatch) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ LinkForm copy$default(LinkForm linkForm, CustomConnectorMode customConnectorMode, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                customConnectorMode = linkForm.mode;
            }
            if ((i & 2) != 0) {
                z = linkForm.requiresServiceMatch;
            }
            C7384Etj.A0Y(customConnectorMode, 0);
            return new LinkForm(customConnectorMode, z);
        }

        public final CustomConnectorMode component1() {
            return this.mode;
        }

        public final boolean component2() {
            return this.requiresServiceMatch;
        }

        public final CustomConnectorMode getMode() {
            return this.mode;
        }

        public final boolean getRequiresServiceMatch() {
            return this.requiresServiceMatch;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass005.A0E(this.mode), this.requiresServiceMatch);
        }

        public String toString() {
            return super.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (X.C7384Etj.areEqual(r0.normalized(r1), r0.normalized(r10)) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.skills.connect.config.CustomConnectorLink tryParse(java.lang.String r10) {
        /*
            r9 = this;
            r0 = 0
            r6 = r10
            X.C7384Etj.A0Y(r10, r0)
            android.net.Uri r4 = android.net.Uri.parse(r10)     // Catch: java.lang.Throwable -> La
            goto Lf
        La:
            r0 = move-exception
            X.Hud r4 = X.C3cG.A0s(r0)
        Lf:
            boolean r0 = r4 instanceof X.C10571Hud
            r5 = 0
            if (r0 == 0) goto L15
            r4 = r5
        L15:
            android.net.Uri r4 = (android.net.Uri) r4
            if (r4 == 0) goto L5d
            boolean r0 = r4.isHierarchical()
            if (r0 == 0) goto L5d
            java.lang.String r0 = "spec"
            java.lang.String r8 = r4.getQueryParameter(r0)
            if (r8 == 0) goto L5d
            int r0 = r8.length()
            if (r0 <= 0) goto L5d
            com.facebook.aura.skills.connect.config.CustomConnectorLinkParser$LinkForm r3 = r9.classify(r4)
            if (r3 == 0) goto L5d
            com.facebook.aura.skills.connect.config.CustomConnectorMode r0 = r3.mode
            java.lang.String r10 = com.facebook.aura.skills.connect.config.CustomConnectorConfigJsonKt.parseCustomConnectorName(r0, r8)
            boolean r0 = r3.requiresServiceMatch
            java.lang.String r2 = "service"
            if (r0 == 0) goto L5e
            java.lang.String r1 = r4.getQueryParameter(r2)
            if (r1 == 0) goto L5d
            int r0 = r1.length()
            if (r0 <= 0) goto L5d
            if (r10 == 0) goto L5d
            com.facebook.aura.skills.connect.config.CustomConnectorName r0 = com.facebook.aura.skills.connect.config.CustomConnectorName.INSTANCE
            java.lang.String r1 = r0.normalized(r1)
            java.lang.String r0 = r0.normalized(r10)
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L5e
        L5d:
            return r5
        L5e:
            com.facebook.aura.skills.connect.config.CustomConnectorMode r7 = r3.mode
            java.lang.String r9 = r4.getQueryParameter(r2)
            com.facebook.aura.skills.connect.config.CustomConnectorLink r5 = new com.facebook.aura.skills.connect.config.CustomConnectorLink
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.connect.config.CustomConnectorLinkParser.tryParse(java.lang.String):com.facebook.aura.skills.connect.config.CustomConnectorLink");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r2.equals("oauth") != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.skills.connect.config.CustomConnectorLinkParser.LinkForm classify(android.net.Uri r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.getScheme()
            r3 = 0
            if (r0 == 0) goto L29
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r2 = r0.toLowerCase(r5)
            int r1 = r2.hashCode()
            r0 = -801574868(0xffffffffd038f02c, float:-1.24109906E10)
            r4 = 0
            if (r1 == r0) goto L7a
            r0 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r1 == r0) goto L2a
            r0 = 105516695(0x64a0e97, float:3.8002696E-35)
            if (r1 != r0) goto L29
            java.lang.String r0 = "oauth"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L77
        L29:
            return r3
        L2a:
            java.lang.String r0 = "https"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L29
            java.lang.String r0 = r6.getHost()
            if (r0 == 0) goto L6c
            java.lang.String r1 = r0.toLowerCase(r5)
        L3c:
            r0 = 5
            java.lang.String r0 = X.C60N.A00(r0)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L29
            java.lang.String r2 = r6.getPath()
            if (r2 == 0) goto L29
            int r1 = r2.hashCode()
            r0 = -165512861(0xfffffffff6227963, float:-8.238419E32)
            if (r1 == r0) goto L6e
            r0 = 732026872(0x2ba1d7f8, float:1.1499681E-12)
            if (r1 != r0) goto L29
            java.lang.String r0 = "/connect/api-key"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L29
            com.facebook.aura.skills.connect.config.CustomConnectorMode r1 = com.facebook.aura.skills.connect.config.CustomConnectorMode.API_KEY
            r0 = 1
            com.facebook.aura.skills.connect.config.CustomConnectorLinkParser$LinkForm r3 = new com.facebook.aura.skills.connect.config.CustomConnectorLinkParser$LinkForm
            r3.<init>(r1, r0)
            return r3
        L6c:
            r1 = r3
            goto L3c
        L6e:
            java.lang.String r0 = "/connect/oauth"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L77
            return r3
        L77:
            com.facebook.aura.skills.connect.config.CustomConnectorMode r1 = com.facebook.aura.skills.connect.config.CustomConnectorMode.OAUTH
            goto L84
        L7a:
            java.lang.String r0 = "api-key"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L29
            com.facebook.aura.skills.connect.config.CustomConnectorMode r1 = com.facebook.aura.skills.connect.config.CustomConnectorMode.API_KEY
        L84:
            com.facebook.aura.skills.connect.config.CustomConnectorLinkParser$LinkForm r0 = new com.facebook.aura.skills.connect.config.CustomConnectorLinkParser$LinkForm
            r0.<init>(r1, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.connect.config.CustomConnectorLinkParser.classify(android.net.Uri):com.facebook.aura.skills.connect.config.CustomConnectorLinkParser$LinkForm");
    }

    private final String connectorNameFromConfig(CustomConnectorMode customConnectorMode, String str) {
        return CustomConnectorConfigJsonKt.parseCustomConnectorName(customConnectorMode, str);
    }
}
