package com.facebook.aura.skills.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class ConnectorCatalogRowUiState extends C06G {
    public final ConnectorCatalogEffect action;
    public final ConnectorCatalogActionLabel actionLabel;
    public final String connectorId;
    public final String description;
    public final boolean enabled;
    public final boolean hasCvmCallout;
    public final Integer iconRes;
    public final String iconUrl;
    public final boolean loading;
    public final boolean needsReauth;
    public final String rowTestTag;
    public final boolean showCustomSubtitle;
    public final boolean showDescription;
    public final boolean showFeaturedAction;
    public final String subtitle;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectorCatalogRowUiState) {
                ConnectorCatalogRowUiState connectorCatalogRowUiState = (ConnectorCatalogRowUiState) obj;
                if (!C7384Etj.areEqual(this.connectorId, connectorCatalogRowUiState.connectorId) || !C7384Etj.areEqual(this.title, connectorCatalogRowUiState.title) || !C7384Etj.areEqual(this.description, connectorCatalogRowUiState.description) || !C7384Etj.areEqual(this.iconUrl, connectorCatalogRowUiState.iconUrl) || !C7384Etj.areEqual(this.iconRes, connectorCatalogRowUiState.iconRes) || !C7384Etj.areEqual(this.rowTestTag, connectorCatalogRowUiState.rowTestTag) || !C7384Etj.areEqual(this.action, connectorCatalogRowUiState.action) || this.enabled != connectorCatalogRowUiState.enabled || this.loading != connectorCatalogRowUiState.loading || this.actionLabel != connectorCatalogRowUiState.actionLabel || !C7384Etj.areEqual(this.subtitle, connectorCatalogRowUiState.subtitle) || this.showCustomSubtitle != connectorCatalogRowUiState.showCustomSubtitle || this.showFeaturedAction != connectorCatalogRowUiState.showFeaturedAction || this.showDescription != connectorCatalogRowUiState.showDescription || this.needsReauth != connectorCatalogRowUiState.needsReauth || this.hasCvmCallout != connectorCatalogRowUiState.hasCvmCallout) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConnectorCatalogRowUiState copy$default(ConnectorCatalogRowUiState connectorCatalogRowUiState, String str, String str2, String str3, String str4, Integer num, String str5, ConnectorCatalogEffect connectorCatalogEffect, boolean z, boolean z2, ConnectorCatalogActionLabel connectorCatalogActionLabel, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, Object obj) {
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        Integer num2 = num;
        String str11 = str5;
        ConnectorCatalogEffect connectorCatalogEffect2 = connectorCatalogEffect;
        boolean z8 = z;
        boolean z9 = z2;
        ConnectorCatalogActionLabel connectorCatalogActionLabel2 = connectorCatalogActionLabel;
        String str12 = str6;
        boolean z10 = z3;
        boolean z11 = z4;
        boolean z12 = z5;
        boolean z13 = z6;
        boolean z14 = z7;
        if ((i & 1) != 0) {
            str7 = connectorCatalogRowUiState.connectorId;
        }
        if ((i & 2) != 0) {
            str8 = connectorCatalogRowUiState.title;
        }
        if ((i & 4) != 0) {
            str9 = connectorCatalogRowUiState.description;
        }
        if ((i & 8) != 0) {
            str10 = connectorCatalogRowUiState.iconUrl;
        }
        if ((i & 16) != 0) {
            num2 = connectorCatalogRowUiState.iconRes;
        }
        if ((i & 32) != 0) {
            str11 = connectorCatalogRowUiState.rowTestTag;
        }
        if ((i & 64) != 0) {
            connectorCatalogEffect2 = connectorCatalogRowUiState.action;
        }
        if ((i & 128) != 0) {
            z8 = connectorCatalogRowUiState.enabled;
        }
        if ((i & 256) != 0) {
            z9 = connectorCatalogRowUiState.loading;
        }
        if ((i & 512) != 0) {
            connectorCatalogActionLabel2 = connectorCatalogRowUiState.actionLabel;
        }
        if ((i & 1024) != 0) {
            str12 = connectorCatalogRowUiState.subtitle;
        }
        if ((i & 2048) != 0) {
            z10 = connectorCatalogRowUiState.showCustomSubtitle;
        }
        if ((i & 4096) != 0) {
            z11 = connectorCatalogRowUiState.showFeaturedAction;
        }
        if ((i & 8192) != 0) {
            z12 = connectorCatalogRowUiState.showDescription;
        }
        if ((i & 16384) != 0) {
            z13 = connectorCatalogRowUiState.needsReauth;
        }
        if ((i & 32768) != 0) {
            z14 = connectorCatalogRowUiState.hasCvmCallout;
        }
        String str13 = str10;
        return connectorCatalogRowUiState.copy(str7, str8, str9, str13, num2, str11, connectorCatalogEffect2, z8, z9, connectorCatalogActionLabel2, str12, z10, z11, z12, z13, z14);
    }

    public final String component1() {
        return this.connectorId;
    }

    public final ConnectorCatalogActionLabel component10() {
        return this.actionLabel;
    }

    public final String component11() {
        return this.subtitle;
    }

    public final boolean component12() {
        return this.showCustomSubtitle;
    }

    public final boolean component13() {
        return this.showFeaturedAction;
    }

    public final boolean component14() {
        return this.showDescription;
    }

    public final boolean component15() {
        return this.needsReauth;
    }

    public final boolean component16() {
        return this.hasCvmCallout;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.iconUrl;
    }

    public final Integer component5() {
        return this.iconRes;
    }

    public final String component6() {
        return this.rowTestTag;
    }

    public final ConnectorCatalogEffect component7() {
        return this.action;
    }

    public final boolean component8() {
        return this.enabled;
    }

    public final boolean component9() {
        return this.loading;
    }

    public final ConnectorCatalogEffect getAction() {
        return this.action;
    }

    public final ConnectorCatalogActionLabel getActionLabel() {
        return this.actionLabel;
    }

    public final String getConnectorId() {
        return this.connectorId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getHasCvmCallout() {
        return this.hasCvmCallout;
    }

    public final Integer getIconRes() {
        return this.iconRes;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final boolean getNeedsReauth() {
        return this.needsReauth;
    }

    public final String getRowTestTag() {
        return this.rowTestTag;
    }

    public final boolean getShowCustomSubtitle() {
        return this.showCustomSubtitle;
    }

    public final boolean getShowDescription() {
        return this.showDescription;
    }

    public final boolean getShowFeaturedAction() {
        return this.showFeaturedAction;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01((AnonymousClass005.A0F(this.actionLabel, C0KA.A01(C0KA.A01((AnonymousClass005.A0I(this.rowTestTag, (((AnonymousClass005.A0I(this.description, AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.connectorId))) + AnonymousClass006.A0G(this.iconUrl)) * 31) + AnonymousClass006.A0D(this.iconRes)) * 31) + AnonymousClass006.A0D(this.action)) * 31, this.enabled), this.loading)) + AnonymousClass005.A0H(this.subtitle)) * 31, this.showCustomSubtitle), this.showFeaturedAction), this.showDescription), this.needsReauth), this.hasCvmCallout);
    }

    public ConnectorCatalogRowUiState(String str, String str2, String str3, String str4, Integer num, String str5, ConnectorCatalogEffect connectorCatalogEffect, boolean z, boolean z2, ConnectorCatalogActionLabel connectorCatalogActionLabel, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        AnonymousClass005.A0x(str, str2, str3);
        AnonymousClass002.A1F(str5, 5, connectorCatalogActionLabel);
        this.connectorId = str;
        this.title = str2;
        this.description = str3;
        this.iconUrl = str4;
        this.iconRes = num;
        this.rowTestTag = str5;
        this.action = connectorCatalogEffect;
        this.enabled = z;
        this.loading = z2;
        this.actionLabel = connectorCatalogActionLabel;
        this.subtitle = str6;
        this.showCustomSubtitle = z3;
        this.showFeaturedAction = z4;
        this.showDescription = z5;
        this.needsReauth = z6;
        this.hasCvmCallout = z7;
    }

    public final ConnectorCatalogRowUiState copy(String str, String str2, String str3, String str4, Integer num, String str5, ConnectorCatalogEffect connectorCatalogEffect, boolean z, boolean z2, ConnectorCatalogActionLabel connectorCatalogActionLabel, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        AnonymousClass005.A0x(str, str2, str3);
        AnonymousClass002.A1F(str5, 5, connectorCatalogActionLabel);
        return new ConnectorCatalogRowUiState(str, str2, str3, str4, num, str5, connectorCatalogEffect, z, z2, connectorCatalogActionLabel, str6, z3, z4, z5, z6, z7);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConnectorCatalogRowUiState(String str, String str2, String str3, String str4, Integer num, String str5, ConnectorCatalogEffect connectorCatalogEffect, boolean z, boolean z2, ConnectorCatalogActionLabel connectorCatalogActionLabel, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, C06H c06h) {
        this(str, str2, str3, str4, num, str5, connectorCatalogEffect, z, z2, connectorCatalogActionLabel, str6, z3, z4, z5, (i & 16384) != 0 ? false : z6, C06G.A0o(i, 32768, z7));
    }
}
