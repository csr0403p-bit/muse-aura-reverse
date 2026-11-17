package com.facebook.aura.skills.viewmodel;

import X.C06G;
import X.C7384Etj;
import com.facebook.aura.agentpermission.LocalDeviceConnector;

/* loaded from: classes.dex */
public interface ConnectorCatalogEffect {

    public final class Connect extends C06G implements ConnectorCatalogEffect {
        public final String connectorId;

        public Connect(String str) {
            C7384Etj.A0Y(str, 0);
            this.connectorId = str;
        }

        public final Connect copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Connect(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Connect) && C7384Etj.areEqual(this.connectorId, ((Connect) obj).connectorId));
        }

        public static /* synthetic */ Connect copy$default(Connect connect, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = connect.connectorId;
            }
            C7384Etj.A0Y(str, 0);
            return new Connect(str);
        }

        public final String component1() {
            return this.connectorId;
        }

        public final String getConnectorId() {
            return this.connectorId;
        }

        public int hashCode() {
            return this.connectorId.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class ManageLocalConnector extends C06G implements ConnectorCatalogEffect {
        public final LocalDeviceConnector connector;

        public ManageLocalConnector(LocalDeviceConnector localDeviceConnector) {
            C7384Etj.A0Y(localDeviceConnector, 0);
            this.connector = localDeviceConnector;
        }

        public final ManageLocalConnector copy(LocalDeviceConnector localDeviceConnector) {
            C7384Etj.A0Y(localDeviceConnector, 0);
            return new ManageLocalConnector(localDeviceConnector);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ManageLocalConnector) && C7384Etj.areEqual(this.connector, ((ManageLocalConnector) obj).connector));
        }

        public static /* synthetic */ ManageLocalConnector copy$default(ManageLocalConnector manageLocalConnector, LocalDeviceConnector localDeviceConnector, int i, Object obj) {
            if ((i & 1) != 0) {
                localDeviceConnector = manageLocalConnector.connector;
            }
            C7384Etj.A0Y(localDeviceConnector, 0);
            return new ManageLocalConnector(localDeviceConnector);
        }

        public final LocalDeviceConnector component1() {
            return this.connector;
        }

        public final LocalDeviceConnector getConnector() {
            return this.connector;
        }

        public int hashCode() {
            return this.connector.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class OpenDetails extends C06G implements ConnectorCatalogEffect {
        public final String connectorId;

        public OpenDetails(String str) {
            C7384Etj.A0Y(str, 0);
            this.connectorId = str;
        }

        public final OpenDetails copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new OpenDetails(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof OpenDetails) && C7384Etj.areEqual(this.connectorId, ((OpenDetails) obj).connectorId));
        }

        public static /* synthetic */ OpenDetails copy$default(OpenDetails openDetails, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = openDetails.connectorId;
            }
            C7384Etj.A0Y(str, 0);
            return new OpenDetails(str);
        }

        public final String component1() {
            return this.connectorId;
        }

        public final String getConnectorId() {
            return this.connectorId;
        }

        public int hashCode() {
            return this.connectorId.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
