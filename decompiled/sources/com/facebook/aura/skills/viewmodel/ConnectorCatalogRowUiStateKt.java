package com.facebook.aura.skills.viewmodel;

import X.AnonymousClass002;
import com.facebook.aura.skills.model.SkillState;

/* loaded from: classes.dex */
public abstract class ConnectorCatalogRowUiStateKt {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.skills.viewmodel.ConnectorCatalogRowUiState connectorCatalogRow(com.facebook.aura.skills.model.Skill r20, java.util.Set<java.lang.String> r21) {
        /*
            r5 = 0
            r1 = r20
            r2 = r21
            boolean r4 = X.AnonymousClass002.A1a(r1, r2)
            java.lang.String r0 = r1.id
            boolean r14 = r2.contains(r0)
            com.facebook.aura.skills.model.SkillState r0 = r1.state
            int r0 = r0.ordinal()
            r2 = 2
            if (r0 == r5) goto L86
            if (r0 == r4) goto L7e
            if (r0 != r2) goto L96
            r12 = 0
        L1d:
            java.lang.String r6 = r1.id
            java.lang.String r7 = r1.displayName
            int r0 = r7.length()
            if (r0 != 0) goto L28
            r7 = r6
        L28:
            java.lang.String r8 = r1.description
            java.lang.String r9 = r1.iconUrl
            com.facebook.aura.skills.model.SkillState r3 = r1.state
            com.facebook.aura.skills.model.SkillState r0 = com.facebook.aura.skills.model.SkillState.CONNECTED
            if (r3 != r0) goto L7b
            java.lang.String r11 = "hatch-connected-skill-row"
        L34:
            r13 = 0
            if (r14 != 0) goto L3a
            if (r12 == 0) goto L3a
            r13 = 1
        L3a:
            int r0 = r3.ordinal()
            if (r0 == r5) goto L78
            if (r0 == r4) goto L75
            if (r0 != r2) goto L90
            com.facebook.aura.skills.viewmodel.ConnectorCatalogActionLabel r15 = com.facebook.aura.skills.viewmodel.ConnectorCatalogActionLabel.COMING_SOON
        L46:
            boolean r0 = r1.isCustom
            if (r14 != 0) goto L50
            com.facebook.aura.skills.model.SkillState r2 = com.facebook.aura.skills.model.SkillState.DISCONNECTED
            r18 = 0
            if (r3 == r2) goto L52
        L50:
            r18 = 1
        L52:
            boolean r2 = X.C7BY.A0j(r8)
            r19 = r2 ^ 1
            com.facebook.aura.skills.model.SkillState r3 = r1.state
            com.facebook.aura.skills.model.SkillState r2 = com.facebook.aura.skills.model.SkillState.CONNECTED
            if (r3 != r2) goto L64
            boolean r2 = r1.needsReauth
            r20 = 1
            if (r2 != 0) goto L66
        L64:
            r20 = 0
        L66:
            boolean r21 = r1.getHasCvmCallout()
            r10 = 0
            com.facebook.aura.skills.viewmodel.ConnectorCatalogRowUiState r5 = new com.facebook.aura.skills.viewmodel.ConnectorCatalogRowUiState
            r16 = r10
            r17 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r5
        L75:
            com.facebook.aura.skills.viewmodel.ConnectorCatalogActionLabel r15 = com.facebook.aura.skills.viewmodel.ConnectorCatalogActionLabel.CONNECT
            goto L46
        L78:
            com.facebook.aura.skills.viewmodel.ConnectorCatalogActionLabel r15 = com.facebook.aura.skills.viewmodel.ConnectorCatalogActionLabel.VIEW
            goto L46
        L7b:
            java.lang.String r11 = "hatch-available-skill-row"
            goto L34
        L7e:
            java.lang.String r0 = r1.id
            com.facebook.aura.skills.viewmodel.ConnectorCatalogEffect$Connect r12 = new com.facebook.aura.skills.viewmodel.ConnectorCatalogEffect$Connect
            r12.<init>(r0)
            goto L8d
        L86:
            java.lang.String r0 = r1.id
            com.facebook.aura.skills.viewmodel.ConnectorCatalogEffect$OpenDetails r12 = new com.facebook.aura.skills.viewmodel.ConnectorCatalogEffect$OpenDetails
            r12.<init>(r0)
        L8d:
            com.facebook.aura.skills.viewmodel.ConnectorCatalogEffect r12 = (com.facebook.aura.skills.viewmodel.ConnectorCatalogEffect) r12
            goto L1d
        L90:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L96:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.viewmodel.ConnectorCatalogRowUiStateKt.connectorCatalogRow(com.facebook.aura.skills.model.Skill, java.util.Set):com.facebook.aura.skills.viewmodel.ConnectorCatalogRowUiState");
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SkillState.values().length];
            try {
                AnonymousClass002.A13(SkillState.CONNECTED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(SkillState.DISCONNECTED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(SkillState.COMING_SOON, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.skills.viewmodel.ConnectorCatalogRowUiState localConnectorCatalogRow(com.facebook.aura.agentpermission.LocalDeviceConnector r15, java.util.Set<java.lang.String> r16) {
        /*
            r1 = r16
            boolean r12 = X.AnonymousClass004.A1b(r15, r1)
            java.lang.String r0 = r15.connectorId
            boolean r9 = r1.contains(r0)
            java.lang.String r1 = r15.connectorId
            java.lang.String r2 = r15.displayTitle
            int r0 = r2.length()
            if (r0 != 0) goto L17
            r2 = r1
        L17:
            java.lang.String r3 = r15.subtitle
            int r0 = r15.iconRes
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            boolean r0 = r15.isConnected
            if (r0 == 0) goto L4f
            java.lang.String r6 = "hatch-connected-skill-row"
            com.facebook.aura.skills.viewmodel.ConnectorCatalogEffect$OpenDetails r7 = new com.facebook.aura.skills.viewmodel.ConnectorCatalogEffect$OpenDetails
            r7.<init>(r1)
        L2a:
            com.facebook.aura.skills.viewmodel.ConnectorCatalogEffect r7 = (com.facebook.aura.skills.viewmodel.ConnectorCatalogEffect) r7
            r8 = r9 ^ 1
            boolean r0 = r15.isConnected
            if (r0 == 0) goto L4c
            com.facebook.aura.skills.viewmodel.ConnectorCatalogActionLabel r10 = com.facebook.aura.skills.viewmodel.ConnectorCatalogActionLabel.VIEW
        L34:
            java.lang.String r11 = r15.subtitle
            if (r9 != 0) goto L3b
            r13 = 0
            if (r0 == 0) goto L3c
        L3b:
            r13 = 1
        L3c:
            boolean r0 = X.C7BY.A0j(r11)
            r14 = r0 ^ 1
            r4 = 0
            com.facebook.aura.skills.viewmodel.ConnectorCatalogRowUiState r0 = new com.facebook.aura.skills.viewmodel.ConnectorCatalogRowUiState
            r15 = r12
            r16 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
        L4c:
            com.facebook.aura.skills.viewmodel.ConnectorCatalogActionLabel r10 = com.facebook.aura.skills.viewmodel.ConnectorCatalogActionLabel.CONNECT
            goto L34
        L4f:
            java.lang.String r6 = "hatch-available-skill-row"
            com.facebook.aura.skills.viewmodel.ConnectorCatalogEffect$ManageLocalConnector r7 = new com.facebook.aura.skills.viewmodel.ConnectorCatalogEffect$ManageLocalConnector
            r7.<init>(r15)
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.viewmodel.ConnectorCatalogRowUiStateKt.localConnectorCatalogRow(com.facebook.aura.agentpermission.LocalDeviceConnector, java.util.Set):com.facebook.aura.skills.viewmodel.ConnectorCatalogRowUiState");
    }
}
