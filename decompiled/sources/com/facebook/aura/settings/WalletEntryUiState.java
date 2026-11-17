package com.facebook.aura.settings;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogRowUiState;

/* loaded from: classes.dex */
public interface WalletEntryUiState {

    public final class Connector extends C06G implements WalletEntryUiState {
        public static final int $stable = 8;
        public final String contentType;
        public final String key;
        public final ConnectorCatalogRowUiState row;
        public final String testTag;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Connector) {
                    Connector connector = (Connector) obj;
                    if (!C7384Etj.areEqual(this.row, connector.row) || !C7384Etj.areEqual(this.key, connector.key) || !C7384Etj.areEqual(this.testTag, connector.testTag)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Connector copy$default(Connector connector, ConnectorCatalogRowUiState connectorCatalogRowUiState, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                connectorCatalogRowUiState = connector.row;
            }
            if ((i & 2) != 0) {
                str = connector.key;
            }
            if ((i & 4) != 0) {
                str2 = connector.testTag;
            }
            return connector.copy(connectorCatalogRowUiState, str, str2);
        }

        public final ConnectorCatalogRowUiState component1() {
            return this.row;
        }

        public final String component2() {
            return this.key;
        }

        public final String component3() {
            return this.testTag;
        }

        @Override // com.facebook.aura.settings.WalletEntryUiState
        public String getContentType() {
            return this.contentType;
        }

        @Override // com.facebook.aura.settings.WalletEntryUiState
        public String getKey() {
            return this.key;
        }

        public final ConnectorCatalogRowUiState getRow() {
            return this.row;
        }

        public final String getTestTag() {
            return this.testTag;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.testTag, AnonymousClass005.A0I(this.key, AnonymousClass005.A0E(this.row)));
        }

        public Connector(ConnectorCatalogRowUiState connectorCatalogRowUiState, String str, String str2) {
            AnonymousClass005.A0x(connectorCatalogRowUiState, str, str2);
            this.row = connectorCatalogRowUiState;
            this.key = str;
            this.testTag = str2;
            this.contentType = "payment-method";
        }

        public final Connector copy(ConnectorCatalogRowUiState connectorCatalogRowUiState, String str, String str2) {
            AnonymousClass005.A0x(connectorCatalogRowUiState, str, str2);
            return new Connector(connectorCatalogRowUiState, str, str2);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class NativeMetaPay implements WalletEntryUiState {
        public static final int $stable = 0;
        public static final NativeMetaPay INSTANCE = new NativeMetaPay();
        public static final String contentType = "native-payment-method";
        public static final String key = "native-meta-pay";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NativeMetaPay);
        }

        @Override // com.facebook.aura.settings.WalletEntryUiState
        public String getContentType() {
            return contentType;
        }

        @Override // com.facebook.aura.settings.WalletEntryUiState
        public String getKey() {
            return key;
        }

        public String toString() {
            return "NativeMetaPay";
        }

        public int hashCode() {
            return -1615749027;
        }
    }

    String getContentType();

    String getKey();
}
