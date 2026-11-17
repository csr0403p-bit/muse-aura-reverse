package com.facebook.aura.health;

import X.C7384Etj;
import java.util.Set;

/* loaded from: classes3.dex */
public interface HealthConnectConnectAction {

    public final class InstallProvider implements HealthConnectConnectAction {
        public static final InstallProvider INSTANCE = new InstallProvider();
    }

    public final class OpenSettings implements HealthConnectConnectAction {
        public static final OpenSettings INSTANCE = new OpenSettings();
    }

    public final class RequestPermissions implements HealthConnectConnectAction {
        public final Set<String> requiredSpecialPermissions;

        public RequestPermissions(Set<String> set) {
            C7384Etj.A0Y(set, 0);
            this.requiredSpecialPermissions = set;
        }

        public final Set<String> getRequiredSpecialPermissions() {
            return this.requiredSpecialPermissions;
        }
    }
}
