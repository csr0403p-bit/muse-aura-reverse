package com.facebook.aura.settings;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BO6;
import X.BQI;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0943AIw;
import X.C0953AJg;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.gateway.store.LocationSharingMode;
import com.facebook.aura.navigation.key.PermissionDestination;
import com.facebook.aura.nodes.json.NodeListEntry;
import java.util.List;

/* loaded from: classes.dex */
public interface ConnectedDevicesUiState {

    public final class DeveloperModeTurnOff extends C06G {
        public static final int $stable = 8;
        public final String assistantName;
        public final List<NodeListEntry> devices;

        public DeveloperModeTurnOff(List<NodeListEntry> list, String str) {
            C7384Etj.A0Y(list, 0);
            this.devices = list;
            this.assistantName = str;
        }

        public final DeveloperModeTurnOff copy(List<NodeListEntry> list, String str) {
            C7384Etj.A0Y(list, 0);
            return new DeveloperModeTurnOff(list, str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof DeveloperModeTurnOff) {
                    DeveloperModeTurnOff developerModeTurnOff = (DeveloperModeTurnOff) obj;
                    if (!C7384Etj.areEqual(this.devices, developerModeTurnOff.devices) || !C7384Etj.areEqual(this.assistantName, developerModeTurnOff.assistantName)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ DeveloperModeTurnOff copy$default(DeveloperModeTurnOff developerModeTurnOff, List list, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                list = developerModeTurnOff.devices;
            }
            if ((i & 2) != 0) {
                str = developerModeTurnOff.assistantName;
            }
            C7384Etj.A0Y(list, 0);
            return new DeveloperModeTurnOff(list, str);
        }

        public final List<NodeListEntry> component1() {
            return this.devices;
        }

        public final String component2() {
            return this.assistantName;
        }

        public final String getAssistantName() {
            return this.assistantName;
        }

        public final List<NodeListEntry> getDevices() {
            return this.devices;
        }

        public int hashCode() {
            return AnonymousClass005.A0E(this.devices) + AnonymousClass006.A0G(this.assistantName);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Error extends C06G implements ConnectedDevicesUiState {
        public static final int $stable = 0;
        public final String message;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Error) && C7384Etj.areEqual(this.message, ((Error) obj).message));
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            return new Error(str);
        }

        public final String component1() {
            return this.message;
        }

        public final Error copy(String str) {
            return new Error(str);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return AnonymousClass006.A0G(this.message);
        }

        public Error(String str) {
            this.message = str;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Loaded extends C06G implements ConnectedDevicesUiState {
        public static final int $stable = 0;
        public final DeveloperModeTurnOff developerModeTurnOff;
        public final List<NodeListEntry> devices;
        public final boolean hasServerDevices;
        public final boolean isDeveloperModeAvailable;
        public final boolean isDeveloperModeEnabled;
        public final String localNodeId;
        public final LocationSharingMode locationMode;
        public final BO6<PermissionDestination, Boolean> permissionStates;
        public final BQI<String> wearableCommsNodeIds;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Loaded) {
                    Loaded loaded = (Loaded) obj;
                    if (!C7384Etj.areEqual(this.devices, loaded.devices) || !C7384Etj.areEqual(this.wearableCommsNodeIds, loaded.wearableCommsNodeIds) || !C7384Etj.areEqual(this.localNodeId, loaded.localNodeId) || !C7384Etj.areEqual(this.permissionStates, loaded.permissionStates) || this.locationMode != loaded.locationMode || this.hasServerDevices != loaded.hasServerDevices || this.isDeveloperModeAvailable != loaded.isDeveloperModeAvailable || this.isDeveloperModeEnabled != loaded.isDeveloperModeEnabled || !C7384Etj.areEqual(this.developerModeTurnOff, loaded.developerModeTurnOff)) {
                    }
                }
                return false;
            }
            return true;
        }

        public /* synthetic */ Loaded(List list, BQI bqi, String str, BO6 bo6, LocationSharingMode locationSharingMode, boolean z, boolean z2, boolean z3, DeveloperModeTurnOff developerModeTurnOff, int i, C06H c06h) {
            this((i & 1) != 0 ? C0881AGi.A00 : list, (i & 2) != 0 ? C0943AIw.A03 : bqi, (i & 4) != 0 ? null : str, (i & 8) != 0 ? C0953AJg.A00() : bo6, (i & 16) != 0 ? LocationSharingMode.NEVER : locationSharingMode, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? false : z3, (i & 256) != 0 ? null : developerModeTurnOff);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, List list, BQI bqi, String str, BO6 bo6, LocationSharingMode locationSharingMode, boolean z, boolean z2, boolean z3, DeveloperModeTurnOff developerModeTurnOff, int i, Object obj) {
            if ((i & 1) != 0) {
                list = loaded.devices;
            }
            if ((i & 2) != 0) {
                bqi = loaded.wearableCommsNodeIds;
            }
            if ((i & 4) != 0) {
                str = loaded.localNodeId;
            }
            if ((i & 8) != 0) {
                bo6 = loaded.permissionStates;
            }
            if ((i & 16) != 0) {
                locationSharingMode = loaded.locationMode;
            }
            if ((i & 32) != 0) {
                z = loaded.hasServerDevices;
            }
            if ((i & 64) != 0) {
                z2 = loaded.isDeveloperModeAvailable;
            }
            if ((i & 128) != 0) {
                z3 = loaded.isDeveloperModeEnabled;
            }
            if ((i & 256) != 0) {
                developerModeTurnOff = loaded.developerModeTurnOff;
            }
            return loaded.copy(list, bqi, str, bo6, locationSharingMode, z, z2, z3, developerModeTurnOff);
        }

        public final List<NodeListEntry> component1() {
            return this.devices;
        }

        public final BQI<String> component2() {
            return this.wearableCommsNodeIds;
        }

        public final String component3() {
            return this.localNodeId;
        }

        public final BO6<PermissionDestination, Boolean> component4() {
            return this.permissionStates;
        }

        public final LocationSharingMode component5() {
            return this.locationMode;
        }

        public final boolean component6() {
            return this.hasServerDevices;
        }

        public final boolean component7() {
            return this.isDeveloperModeAvailable;
        }

        public final boolean component8() {
            return this.isDeveloperModeEnabled;
        }

        public final DeveloperModeTurnOff component9() {
            return this.developerModeTurnOff;
        }

        public final DeveloperModeTurnOff getDeveloperModeTurnOff() {
            return this.developerModeTurnOff;
        }

        public final List<NodeListEntry> getDevices() {
            return this.devices;
        }

        public final boolean getHasServerDevices() {
            return this.hasServerDevices;
        }

        public final String getLocalNodeId() {
            return this.localNodeId;
        }

        public final LocationSharingMode getLocationMode() {
            return this.locationMode;
        }

        public final BO6<PermissionDestination, Boolean> getPermissionStates() {
            return this.permissionStates;
        }

        public final BQI<String> getWearableCommsNodeIds() {
            return this.wearableCommsNodeIds;
        }

        public int hashCode() {
            return C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.locationMode, AnonymousClass005.A0F(this.permissionStates, (AnonymousClass005.A0F(this.wearableCommsNodeIds, AnonymousClass005.A0E(this.devices)) + AnonymousClass006.A0G(this.localNodeId)) * 31)), this.hasServerDevices), this.isDeveloperModeAvailable), this.isDeveloperModeEnabled) + C06G.A04(this.developerModeTurnOff);
        }

        public final boolean isDeveloperModeAvailable() {
            return this.isDeveloperModeAvailable;
        }

        public final boolean isDeveloperModeEnabled() {
            return this.isDeveloperModeEnabled;
        }

        public final Loaded copy(List<NodeListEntry> list, BQI<String> bqi, String str, BO6<PermissionDestination, Boolean> bo6, LocationSharingMode locationSharingMode, boolean z, boolean z2, boolean z3, DeveloperModeTurnOff developerModeTurnOff) {
            AnonymousClass005.A0y(list, bqi, bo6);
            C7384Etj.A0Y(locationSharingMode, 4);
            return new Loaded(list, bqi, str, bo6, locationSharingMode, z, z2, z3, developerModeTurnOff);
        }

        public String toString() {
            return super.toString();
        }

        public Loaded(List<NodeListEntry> list, BQI<String> bqi, String str, BO6<PermissionDestination, Boolean> bo6, LocationSharingMode locationSharingMode, boolean z, boolean z2, boolean z3, DeveloperModeTurnOff developerModeTurnOff) {
            AnonymousClass005.A0y(list, bqi, bo6);
            C7384Etj.A0Y(locationSharingMode, 4);
            this.devices = list;
            this.wearableCommsNodeIds = bqi;
            this.localNodeId = str;
            this.permissionStates = bo6;
            this.locationMode = locationSharingMode;
            this.hasServerDevices = z;
            this.isDeveloperModeAvailable = z2;
            this.isDeveloperModeEnabled = z3;
            this.developerModeTurnOff = developerModeTurnOff;
        }

        public Loaded() {
            this(C0881AGi.A00, C0943AIw.A03, null, C0953AJg.A00(), LocationSharingMode.NEVER, false, false, false, null);
        }
    }

    public final class Loading implements ConnectedDevicesUiState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public String toString() {
            return "Loading";
        }

        public int hashCode() {
            return 949548668;
        }
    }
}
