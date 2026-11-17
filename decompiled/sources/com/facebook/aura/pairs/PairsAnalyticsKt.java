package com.facebook.aura.pairs;

import X.AFz;
import X.AnonymousClass002;
import X.BFM;
import X.C60O;
import X.C7384Etj;
import X.C78N;
import X.FGI;
import android.os.SystemClock;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.model.ExternalLinkPresentationJsonKt;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class PairsAnalyticsKt {
    public static final String CONNECTION_TYPE_GROUP = "group";
    public static final String CONNECTION_TYPE_PERSON = "person";
    public static final String ITEM_SHARED_SUFFIX = "_shared";
    public static final String LINK_TYPE_CONNECTIONS = "connections";
    public static final String LINK_TYPE_INVITE = "invite";
    public static final String LINK_TYPE_SHARED_ITEM = "shared_item";
    public static final String LINK_TYPE_WEB = "web";
    public static final String PRESENTATION_KEY_PREFIX = "connections";
    public static final String SHARE_CONTENT_TYPE_INVITE = "invite";
    public static final List<String> WEB_SCHEMES = C60O.A16("https://", ExternalLinkPresentationJsonKt.HTTP_SCHEME_PREFIX);

    public static final ConnectionsLogContext rememberConnectionsLogContext(HatchScreen hatchScreen, BFM bfm, int i) {
        C7384Etj.A0Y(hatchScreen, 0);
        boolean z = true;
        Object[] objArr = {hatchScreen};
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        if (objAaT == obj) {
            objAaT = PairsAnalyticsKt$rememberConnectionsLogContext$presentationKey$1$1.INSTANCE;
            bfm.Ai0(objAaT);
        }
        String str = (String) AFz.A03(bfm, (Function0) objAaT, objArr);
        if ((((i & 14) ^ 6) <= 4 || !AnonymousClass002.A1U(bfm, hatchScreen)) && (i & 6) != 4) {
            z = false;
        }
        boolean zA65 = bfm.A65(str) | z;
        Object objAaT2 = bfm.AaT();
        if (zA65 || objAaT2 == obj) {
            objAaT2 = new ConnectionsLogContext(hatchScreen, str);
            bfm.Ai0(objAaT2);
        }
        return (ConnectionsLogContext) objAaT2;
    }

    public static final String newPresentationKey() {
        return FGI.A0B(SystemClock.elapsedRealtimeNanos(), "connections:");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg rememberConnectionsImpression(com.facebook.aura.pairs.ConnectionsLogContext r6, com.facebook.aura.analytics.hatch.HatchComponent r7, com.facebook.aura.analytics.hatch.HatchSubsurface r8, java.util.Map<java.lang.String, java.lang.String> r9, java.lang.Integer r10, java.lang.String r11, X.BFM r12, int r13, int r14) {
        /*
            X.AnonymousClass003.A0u(r6, r7)
            r0 = r14 & 4
            r1 = 0
            if (r0 == 0) goto L9
            r8 = r1
        L9:
            r0 = r14 & 8
            if (r0 == 0) goto Le
            r9 = r1
        Le:
            r0 = r14 & 16
            if (r0 == 0) goto L13
            r10 = r1
        L13:
            r2 = 32
            r0 = r14 & 32
            if (r0 == 0) goto L1b
            java.lang.String r11 = ""
        L1b:
            r1 = -1
            r0 = r13 & 14
            r0 = r0 ^ 6
            r5 = 0
            r3 = 4
            if (r0 <= r3) goto L2a
            boolean r0 = r12.A65(r6)
            if (r0 != 0) goto L2f
        L2a:
            r0 = r13 & 6
            r4 = 0
            if (r0 != r3) goto L30
        L2f:
            r4 = 1
        L30:
            r0 = r13 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            if (r0 <= r2) goto L3c
            boolean r0 = X.AnonymousClass002.A1U(r12, r7)
            if (r0 != 0) goto L41
        L3c:
            r0 = r13 & 48
            r3 = 0
            if (r0 != r2) goto L42
        L41:
            r3 = 1
        L42:
            r3 = r3 | r4
            r0 = r13 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r2 = 256(0x100, float:3.59E-43)
            if (r0 <= r2) goto L57
            if (r8 == 0) goto L51
            int r1 = r8.ordinal()
        L51:
            boolean r0 = r12.A63(r1)
            if (r0 != 0) goto L5c
        L57:
            r1 = r13 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r1 != r2) goto L5d
        L5c:
            r0 = 1
        L5d:
            r3 = r3 | r0
            r0 = r13 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 ^ 3072(0xc00, float:4.305E-42)
            r2 = 2048(0x800, float:2.87E-42)
            if (r0 <= r2) goto L6c
            boolean r0 = r12.A65(r9)
            if (r0 != 0) goto L71
        L6c:
            r1 = r13 & 3072(0xc00, float:4.305E-42)
            r0 = 0
            if (r1 != r2) goto L72
        L71:
            r0 = 1
        L72:
            r3 = r3 | r0
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r13
            r0 = r0 ^ 24576(0x6000, float:3.4438E-41)
            r2 = 16384(0x4000, float:2.2959E-41)
            if (r0 <= r2) goto L83
            boolean r0 = r12.A65(r10)
            if (r0 != 0) goto L88
        L83:
            r1 = r13 & 24576(0x6000, float:3.4438E-41)
            r0 = 0
            if (r1 != r2) goto L89
        L88:
            r0 = 1
        L89:
            r3 = r3 | r0
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r13
            r2 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 ^ r2
            r1 = 131072(0x20000, float:1.83671E-40)
            if (r0 <= r1) goto L9a
            boolean r0 = r12.A65(r11)
            if (r0 != 0) goto L9d
        L9a:
            r13 = r13 & r2
            if (r13 != r1) goto L9e
        L9d:
            r5 = 1
        L9e:
            r3 = r3 | r5
            java.lang.Object r1 = r12.AaT()
            if (r3 != 0) goto La9
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto Lb2
        La9:
            com.facebook.aura.pairs.PairsAnalytics r5 = com.facebook.aura.pairs.PairsAnalytics.INSTANCE
            X.BRg r1 = r5.impression$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(r6, r7, r8, r9, r10, r11)
            r12.Ai0(r1)
        Lb2:
            X.BRg r1 = (X.BRg) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsAnalyticsKt.rememberConnectionsImpression(com.facebook.aura.pairs.ConnectionsLogContext, com.facebook.aura.analytics.hatch.HatchComponent, com.facebook.aura.analytics.hatch.HatchSubsurface, java.util.Map, java.lang.Integer, java.lang.String, X.BFM, int, int):X.BRg");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.pairs.ConnectionsLogContext rememberConnectionsTabLogContext(com.facebook.aura.pairs.ConnectionsViewModel r9, com.facebook.aura.navigation.AuraNavKey r10, X.BFM r11, int r12) {
        /*
            X.AnonymousClass003.A0u(r9, r10)
            com.facebook.aura.navigation.AuraNavigator r4 = X.AnonymousClass002.A0b(r11)
            r0 = r12 & 14
            r7 = r0 ^ 6
            r5 = 4
            if (r7 <= r5) goto L14
            boolean r0 = r11.A65(r9)
            if (r0 != 0) goto L19
        L14:
            r0 = r12 & 6
            r2 = 0
            if (r0 != r5) goto L1a
        L19:
            r2 = 1
        L1a:
            r0 = r12 & 112(0x70, float:1.57E-43)
            r8 = r0 ^ 48
            r6 = 32
            if (r8 <= r6) goto L28
            boolean r0 = r11.A65(r10)
            if (r0 != 0) goto L2d
        L28:
            r1 = r12 & 48
            r0 = 0
            if (r1 != r6) goto L2e
        L2d:
            r0 = 1
        L2e:
            r2 = r2 | r0
            java.lang.Object r3 = r11.AaT()
            if (r2 != 0) goto L39
            java.lang.Object r0 = X.C78N.A00
            if (r3 != r0) goto L47
        L39:
            com.facebook.aura.analytics.hatch.HatchScreen r1 = com.facebook.aura.analytics.hatch.HatchScreen.CONNECTIONS_HOME
            java.lang.String r0 = r9.presentationKey(r10)
            com.facebook.aura.pairs.ConnectionsLogContext r3 = new com.facebook.aura.pairs.ConnectionsLogContext
            r3.<init>(r1, r0)
            r11.Ai0(r3)
        L47:
            com.facebook.aura.pairs.ConnectionsLogContext r3 = (com.facebook.aura.pairs.ConnectionsLogContext) r3
            boolean r2 = r11.A67(r4)
            if (r8 <= r6) goto L55
            boolean r0 = r11.A67(r10)
            if (r0 != 0) goto L5a
        L55:
            r1 = r12 & 48
            r0 = 0
            if (r1 != r6) goto L5b
        L5a:
            r0 = 1
        L5b:
            r2 = r2 | r0
            if (r7 <= r5) goto L64
            boolean r0 = r11.A67(r9)
            if (r0 != 0) goto L69
        L64:
            r1 = r12 & 6
            r0 = 0
            if (r1 != r5) goto L6a
        L69:
            r0 = 1
        L6a:
            r2 = r2 | r0
            java.lang.Object r0 = r11.AaT()
            if (r2 != 0) goto L75
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L7d
        L75:
            com.facebook.aura.pairs.PairsAnalyticsKt$rememberConnectionsTabLogContext$1$1 r0 = new com.facebook.aura.pairs.PairsAnalyticsKt$rememberConnectionsTabLogContext$1$1
            r0.<init>(r4, r10, r9)
            r11.Ai0(r0)
        L7d:
            X.G0U r0 = (X.G0U) r0
            X.C78e.A01(r11, r9, r10, r4, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsAnalyticsKt.rememberConnectionsTabLogContext(com.facebook.aura.pairs.ConnectionsViewModel, com.facebook.aura.navigation.AuraNavKey, X.BFM, int):com.facebook.aura.pairs.ConnectionsLogContext");
    }
}
