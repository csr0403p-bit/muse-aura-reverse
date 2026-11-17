package com.facebook.aura.skills.viewmodel;

import X.AnonymousClass003;
import X.C7384Etj;
import com.facebook.aura.navigation.AuraNavKey;

/* loaded from: classes3.dex */
public interface SkillAccountsEffect {

    public final class OpenConnectorAccountLink implements SkillAccountsEffect {
        public final String connectorId;
        public final String linkUrl;

        public final String getConnectorId() {
            return this.connectorId;
        }

        public final String getLinkUrl() {
            return this.linkUrl;
        }

        public OpenConnectorAccountLink(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.connectorId = str;
            this.linkUrl = str2;
        }
    }

    public final class OpenReconnectDestination implements SkillAccountsEffect {
        public final AuraNavKey destination;

        public OpenReconnectDestination(AuraNavKey auraNavKey) {
            C7384Etj.A0Y(auraNavKey, 0);
            this.destination = auraNavKey;
        }

        public final AuraNavKey getDestination() {
            return this.destination;
        }
    }
}
