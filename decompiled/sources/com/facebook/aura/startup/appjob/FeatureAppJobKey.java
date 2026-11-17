package com.facebook.aura.startup.appjob;

import X.C7384Etj;

/* loaded from: classes3.dex */
public final class FeatureAppJobKey implements AppJobKey {
    public final String name;

    public FeatureAppJobKey(String str) {
        C7384Etj.A0Y(str, 0);
        this.name = str;
    }

    public boolean equals(Object obj) {
        return (obj instanceof FeatureAppJobKey) && C7384Etj.areEqual(((FeatureAppJobKey) obj).getName(), getName());
    }

    @Override // com.facebook.aura.startup.appjob.AppJobKey
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return getName().hashCode();
    }

    public String toString() {
        return getName();
    }
}
