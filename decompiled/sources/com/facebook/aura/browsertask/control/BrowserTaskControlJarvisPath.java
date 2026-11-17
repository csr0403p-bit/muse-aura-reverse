package com.facebook.aura.browsertask.control;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C7384Etj;
import X.FGI;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;

/* loaded from: classes2.dex */
public interface BrowserTaskControlJarvisPath extends JarvisPath.Extension {

    public final class BrowserTask implements BrowserTaskControlJarvisPath {
        public static final int $stable = 0;
        public final String encodedTaskId;
        public final String suffix;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof BrowserTask) {
                    BrowserTask browserTask = (BrowserTask) obj;
                    if (!C7384Etj.areEqual(this.encodedTaskId, browserTask.encodedTaskId) || !C7384Etj.areEqual(this.suffix, browserTask.suffix)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ BrowserTask copy$default(BrowserTask browserTask, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = browserTask.encodedTaskId;
            }
            if ((i & 2) != 0) {
                str2 = browserTask.suffix;
            }
            AnonymousClass003.A0u(str, str2);
            return new BrowserTask(str, str2);
        }

        public final String component1() {
            return this.encodedTaskId;
        }

        public final String component2() {
            return this.suffix;
        }

        public final String getEncodedTaskId() {
            return this.encodedTaskId;
        }

        public final String getSuffix() {
            return this.suffix;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0d("api/browser-task/", this.encodedTaskId, CustomConnectorRegisterRepositoryKt.ROOT_PATH, this.suffix);
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.suffix, AnonymousClass001.A0G(this.encodedTaskId));
        }

        public String toString() {
            return FGI.A0h("BrowserTask(encodedTaskId=", this.encodedTaskId, ", suffix=", this.suffix, ")");
        }

        public BrowserTask(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.encodedTaskId = str;
            this.suffix = str2;
        }

        public final BrowserTask copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new BrowserTask(str, str2);
        }
    }
}
