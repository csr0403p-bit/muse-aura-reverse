package com.facebook.aura.gateway;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ProjectDirRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String project_dir;

    public final class Companion {
        public final C9hr<ProjectDirRequestJson> serializer() {
            return ProjectDirRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final ProjectDirRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new ProjectDirRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ProjectDirRequestJson) && C7384Etj.areEqual(this.project_dir, ((ProjectDirRequestJson) obj).project_dir));
    }

    public /* synthetic */ ProjectDirRequestJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ProjectDirRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.project_dir = str;
    }

    public static /* synthetic */ ProjectDirRequestJson copy$default(ProjectDirRequestJson projectDirRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = projectDirRequestJson.project_dir;
        }
        C7384Etj.A0Y(str, 0);
        return new ProjectDirRequestJson(str);
    }

    public final String component1() {
        return this.project_dir;
    }

    public final String getProject_dir() {
        return this.project_dir;
    }

    public int hashCode() {
        return this.project_dir.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public ProjectDirRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.project_dir = str;
    }
}
