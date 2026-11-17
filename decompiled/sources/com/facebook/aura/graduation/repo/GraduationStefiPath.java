package com.facebook.aura.graduation.repo;

import X.C06G;
import X.C7384Etj;
import X.FGI;
import com.facebook.aura.network.api.StefiHatchPath;

/* loaded from: classes3.dex */
public interface GraduationStefiPath extends StefiHatchPath.Extension {

    public final class MuseGraduationDownload extends C06G implements GraduationStefiPath {
        public final String vmId;

        public MuseGraduationDownload(String str) {
            C7384Etj.A0Y(str, 0);
            this.vmId = str;
        }

        public final MuseGraduationDownload copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new MuseGraduationDownload(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof MuseGraduationDownload) && C7384Etj.areEqual(this.vmId, ((MuseGraduationDownload) obj).vmId));
        }

        public static /* synthetic */ MuseGraduationDownload copy$default(MuseGraduationDownload museGraduationDownload, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = museGraduationDownload.vmId;
            }
            C7384Etj.A0Y(str, 0);
            return new MuseGraduationDownload(str);
        }

        public final String component1() {
            return this.vmId;
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return FGI.A0M("/muse/graduation/download?vm_id=", this.vmId);
        }

        public final String getVmId() {
            return this.vmId;
        }

        public int hashCode() {
            return this.vmId.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class MuseGraduationStart extends C06G implements GraduationStefiPath {
        public final String vmId;

        public MuseGraduationStart(String str) {
            C7384Etj.A0Y(str, 0);
            this.vmId = str;
        }

        public final MuseGraduationStart copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new MuseGraduationStart(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof MuseGraduationStart) && C7384Etj.areEqual(this.vmId, ((MuseGraduationStart) obj).vmId));
        }

        public static /* synthetic */ MuseGraduationStart copy$default(MuseGraduationStart museGraduationStart, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = museGraduationStart.vmId;
            }
            C7384Etj.A0Y(str, 0);
            return new MuseGraduationStart(str);
        }

        public final String component1() {
            return this.vmId;
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return FGI.A0M("/muse/graduation/start?vm_id=", this.vmId);
        }

        public final String getVmId() {
            return this.vmId;
        }

        public int hashCode() {
            return this.vmId.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class MuseGraduationStore implements GraduationStefiPath {
        public static final MuseGraduationStore INSTANCE = new MuseGraduationStore();
        public static final String value = "/muse/graduation/store";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof MuseGraduationStore);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "MuseGraduationStore";
        }

        public int hashCode() {
            return 2128851293;
        }
    }
}
