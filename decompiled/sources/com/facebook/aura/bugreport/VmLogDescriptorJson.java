package com.facebook.aura.bugreport;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class VmLogDescriptorJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final long byte_length;
    public final String download_path;
    public final long expires_at_ms;
    public final String file_id;
    public final String filename;
    public final String mime_type;
    public final int omitted_rows;
    public final String request_id;
    public final boolean truncated;

    public final class Companion {
        public final C9hr<VmLogDescriptorJson> serializer() {
            return VmLogDescriptorJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_bugreport_bugreport(VmLogDescriptorJson vmLogDescriptorJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(vmLogDescriptorJson.request_id)) {
            c9j5.AAV(vmLogDescriptorJson.request_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(vmLogDescriptorJson.file_id)) {
            c9j5.AAV(vmLogDescriptorJson.file_id, c9iZ, 1);
        }
        if (zAfR || !"".equals(vmLogDescriptorJson.download_path)) {
            c9j5.AAV(vmLogDescriptorJson.download_path, c9iZ, 2);
        }
        if (zAfR || !"".equals(vmLogDescriptorJson.filename)) {
            c9j5.AAV(vmLogDescriptorJson.filename, c9iZ, 3);
        }
        if (zAfR || !"".equals(vmLogDescriptorJson.mime_type)) {
            c9j5.AAV(vmLogDescriptorJson.mime_type, c9iZ, 4);
        }
        if (zAfR || vmLogDescriptorJson.byte_length != -1) {
            c9j5.AAN(c9iZ, 5, vmLogDescriptorJson.byte_length);
        }
        if (zAfR || vmLogDescriptorJson.expires_at_ms != 0) {
            c9j5.AAN(c9iZ, 6, vmLogDescriptorJson.expires_at_ms);
        }
        if (zAfR || vmLogDescriptorJson.truncated) {
            c9j5.AA7(c9iZ, 7, vmLogDescriptorJson.truncated);
        }
        if (zAfR || vmLogDescriptorJson.omitted_rows != 0) {
            c9j5.AAK(c9iZ, 8, vmLogDescriptorJson.omitted_rows);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VmLogDescriptorJson) {
                VmLogDescriptorJson vmLogDescriptorJson = (VmLogDescriptorJson) obj;
                if (!C7384Etj.areEqual(this.request_id, vmLogDescriptorJson.request_id) || !C7384Etj.areEqual(this.file_id, vmLogDescriptorJson.file_id) || !C7384Etj.areEqual(this.download_path, vmLogDescriptorJson.download_path) || !C7384Etj.areEqual(this.filename, vmLogDescriptorJson.filename) || !C7384Etj.areEqual(this.mime_type, vmLogDescriptorJson.mime_type) || this.byte_length != vmLogDescriptorJson.byte_length || this.expires_at_ms != vmLogDescriptorJson.expires_at_ms || this.truncated != vmLogDescriptorJson.truncated || this.omitted_rows != vmLogDescriptorJson.omitted_rows) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VmLogDescriptorJson copy$default(VmLogDescriptorJson vmLogDescriptorJson, String str, String str2, String str3, String str4, String str5, long j, long j2, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = vmLogDescriptorJson.request_id;
        }
        if ((i2 & 2) != 0) {
            str2 = vmLogDescriptorJson.file_id;
        }
        if ((i2 & 4) != 0) {
            str3 = vmLogDescriptorJson.download_path;
        }
        if ((i2 & 8) != 0) {
            str4 = vmLogDescriptorJson.filename;
        }
        if ((i2 & 16) != 0) {
            str5 = vmLogDescriptorJson.mime_type;
        }
        if ((i2 & 32) != 0) {
            j = vmLogDescriptorJson.byte_length;
        }
        if ((i2 & 64) != 0) {
            j2 = vmLogDescriptorJson.expires_at_ms;
        }
        if ((i2 & 128) != 0) {
            z = vmLogDescriptorJson.truncated;
        }
        if ((i2 & 256) != 0) {
            i = vmLogDescriptorJson.omitted_rows;
        }
        return vmLogDescriptorJson.copy(str, str2, str3, str4, str5, j, j2, z, i);
    }

    public final String component1() {
        return this.request_id;
    }

    public final String component2() {
        return this.file_id;
    }

    public final String component3() {
        return this.download_path;
    }

    public final String component4() {
        return this.filename;
    }

    public final String component5() {
        return this.mime_type;
    }

    public final long component6() {
        return this.byte_length;
    }

    public final long component7() {
        return this.expires_at_ms;
    }

    public final boolean component8() {
        return this.truncated;
    }

    public final int component9() {
        return this.omitted_rows;
    }

    public final long getByte_length() {
        return this.byte_length;
    }

    public final String getDownload_path() {
        return this.download_path;
    }

    public final long getExpires_at_ms() {
        return this.expires_at_ms;
    }

    public final String getFile_id() {
        return this.file_id;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final String getMime_type() {
        return this.mime_type;
    }

    public final int getOmitted_rows() {
        return this.omitted_rows;
    }

    public final String getRequest_id() {
        return this.request_id;
    }

    public final boolean getTruncated() {
        return this.truncated;
    }

    public int hashCode() {
        return C0KA.A01(AnonymousClass006.A06(this.expires_at_ms, AnonymousClass006.A06(this.byte_length, AnonymousClass005.A0I(this.mime_type, AnonymousClass005.A0I(this.filename, AnonymousClass005.A0I(this.download_path, AnonymousClass005.A0I(this.file_id, AnonymousClass001.A0G(this.request_id))))))), this.truncated) + this.omitted_rows;
    }

    public VmLogDescriptorJson(String str, String str2, String str3, String str4, String str5, long j, long j2, boolean z, int i) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        this.request_id = str;
        this.file_id = str2;
        this.download_path = str3;
        this.filename = str4;
        this.mime_type = str5;
        this.byte_length = j;
        this.expires_at_ms = j2;
        this.truncated = z;
        this.omitted_rows = i;
    }

    public final VmLogDescriptorJson copy(String str, String str2, String str3, String str4, String str5, long j, long j2, boolean z, int i) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        return new VmLogDescriptorJson(str, str2, str3, str4, str5, j, j2, z, i);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VmLogDescriptorJson(String str, String str2, String str3, String str4, String str5, long j, long j2, boolean z, int i, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? -1L : j, (i2 & 64) != 0 ? 0L : j2, (i2 & 128) != 0 ? false : z, (i2 & 256) != 0 ? 0 : i);
    }

    public /* synthetic */ VmLogDescriptorJson(int i, String str, String str2, String str3, String str4, String str5, long j, long j2, boolean z, int i2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.request_id = "";
        } else {
            this.request_id = str;
        }
        if ((i & 2) == 0) {
            this.file_id = "";
        } else {
            this.file_id = str2;
        }
        if ((i & 4) == 0) {
            this.download_path = "";
        } else {
            this.download_path = str3;
        }
        if ((i & 8) == 0) {
            this.filename = "";
        } else {
            this.filename = str4;
        }
        if ((i & 16) == 0) {
            this.mime_type = "";
        } else {
            this.mime_type = str5;
        }
        if ((i & 32) == 0) {
            this.byte_length = -1L;
        } else {
            this.byte_length = j;
        }
        if ((i & 64) == 0) {
            this.expires_at_ms = 0L;
        } else {
            this.expires_at_ms = j2;
        }
        if ((i & 128) == 0) {
            this.truncated = false;
        } else {
            this.truncated = z;
        }
        if ((i & 256) == 0) {
            this.omitted_rows = 0;
        } else {
            this.omitted_rows = i2;
        }
    }

    public VmLogDescriptorJson() {
        this("", "", "", "", "", -1L, 0L, false, 0);
    }
}
