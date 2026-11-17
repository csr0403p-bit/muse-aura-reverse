package com.facebook.aura.vmdisabled;

import X.C06G;
import X.C7384Etj;
import X.FGI;
import android.net.Uri;
import com.facebook.aura.network.api.StefiHatchPath;

/* loaded from: classes2.dex */
public interface VmDisabledStefiPath extends StefiHatchPath.Extension {

    public final class VmReenableContent extends C06G implements VmDisabledStefiPath {
        public final String envId;

        public VmReenableContent(String str) {
            C7384Etj.A0Y(str, 0);
            this.envId = str;
        }

        public final VmReenableContent copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new VmReenableContent(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof VmReenableContent) && C7384Etj.areEqual(this.envId, ((VmReenableContent) obj).envId));
        }

        public static /* synthetic */ VmReenableContent copy$default(VmReenableContent vmReenableContent, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = vmReenableContent.envId;
            }
            C7384Etj.A0Y(str, 0);
            return new VmReenableContent(str);
        }

        public final String component1() {
            return this.envId;
        }

        public final String getEnvId() {
            return this.envId;
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return FGI.A0M("/hatch/content/enable?env_id=", Uri.encode(this.envId));
        }

        public int hashCode() {
            return this.envId.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
