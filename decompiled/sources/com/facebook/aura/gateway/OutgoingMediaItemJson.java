package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class OutgoingMediaItemJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String caption;
    public final String file_name;
    public final Long file_size;
    public final String kind;
    public final OutgoingMediaDescriptorJson media;

    public final class Companion {
        public final C9hr<OutgoingMediaItemJson> serializer() {
            return OutgoingMediaItemJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public OutgoingMediaItemJson(String str, String str2, String str3, Long l, OutgoingMediaDescriptorJson outgoingMediaDescriptorJson) {
        C7384Etj.A0Y(str, 0);
        this.kind = str;
        this.caption = str2;
        this.file_name = str3;
        this.file_size = l;
        this.media = outgoingMediaDescriptorJson;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(OutgoingMediaItemJson outgoingMediaItemJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(outgoingMediaItemJson.kind)) {
            c9j5.AAV(outgoingMediaItemJson.kind, c9iZ, 0);
        }
        if (zAfR || outgoingMediaItemJson.caption != null) {
            c9j5.AAP(outgoingMediaItemJson.caption, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || outgoingMediaItemJson.file_name != null) {
            c9j5.AAP(outgoingMediaItemJson.file_name, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || outgoingMediaItemJson.file_size != null) {
            c9j5.AAP(outgoingMediaItemJson.file_size, C9j1.A00, c9iZ, 3);
        }
        if (zAfR || outgoingMediaItemJson.media != null) {
            c9j5.AAP(outgoingMediaItemJson.media, OutgoingMediaDescriptorJson$$serializer.INSTANCE, c9iZ, 4);
        }
    }

    public final OutgoingMediaItemJson copy(String str, String str2, String str3, Long l, OutgoingMediaDescriptorJson outgoingMediaDescriptorJson) {
        C7384Etj.A0Y(str, 0);
        return new OutgoingMediaItemJson(str, str2, str3, l, outgoingMediaDescriptorJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OutgoingMediaItemJson) {
                OutgoingMediaItemJson outgoingMediaItemJson = (OutgoingMediaItemJson) obj;
                if (!C7384Etj.areEqual(this.kind, outgoingMediaItemJson.kind) || !C7384Etj.areEqual(this.caption, outgoingMediaItemJson.caption) || !C7384Etj.areEqual(this.file_name, outgoingMediaItemJson.file_name) || !C7384Etj.areEqual(this.file_size, outgoingMediaItemJson.file_size) || !C7384Etj.areEqual(this.media, outgoingMediaItemJson.media)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ OutgoingMediaItemJson copy$default(OutgoingMediaItemJson outgoingMediaItemJson, String str, String str2, String str3, Long l, OutgoingMediaDescriptorJson outgoingMediaDescriptorJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = outgoingMediaItemJson.kind;
        }
        if ((i & 2) != 0) {
            str2 = outgoingMediaItemJson.caption;
        }
        if ((i & 4) != 0) {
            str3 = outgoingMediaItemJson.file_name;
        }
        if ((i & 8) != 0) {
            l = outgoingMediaItemJson.file_size;
        }
        if ((i & 16) != 0) {
            outgoingMediaDescriptorJson = outgoingMediaItemJson.media;
        }
        return outgoingMediaItemJson.copy(str, str2, str3, l, outgoingMediaDescriptorJson);
    }

    public final String component1() {
        return this.kind;
    }

    public final String component2() {
        return this.caption;
    }

    public final String component3() {
        return this.file_name;
    }

    public final Long component4() {
        return this.file_size;
    }

    public final OutgoingMediaDescriptorJson component5() {
        return this.media;
    }

    public final String getCaption() {
        return this.caption;
    }

    public final String getFile_name() {
        return this.file_name;
    }

    public final Long getFile_size() {
        return this.file_size;
    }

    public final String getKind() {
        return this.kind;
    }

    public final OutgoingMediaDescriptorJson getMedia() {
        return this.media;
    }

    public int hashCode() {
        return ((((((AnonymousClass001.A0G(this.kind) + AnonymousClass006.A0G(this.caption)) * 31) + AnonymousClass006.A0G(this.file_name)) * 31) + AnonymousClass006.A0D(this.file_size)) * 31) + C3cH.A02(this.media);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final HatchAgentPermissionsRepository.OutgoingMediaItem toDomain() {
        HatchAgentPermissionsRepository.OutgoingMediaKind outgoingMediaKind;
        String str = this.kind;
        switch (str.hashCode()) {
            case 93166550:
                if (str.equals("audio")) {
                    outgoingMediaKind = HatchAgentPermissionsRepository.OutgoingMediaKind.AUDIO;
                    break;
                }
                return null;
            case 100313435:
                if (str.equals("image")) {
                    outgoingMediaKind = HatchAgentPermissionsRepository.OutgoingMediaKind.IMAGE;
                    break;
                }
                return null;
            case 112202875:
                if (str.equals("video")) {
                    outgoingMediaKind = HatchAgentPermissionsRepository.OutgoingMediaKind.VIDEO;
                    break;
                }
                return null;
            case 112386354:
                if (str.equals("voice")) {
                    outgoingMediaKind = HatchAgentPermissionsRepository.OutgoingMediaKind.VOICE;
                    break;
                }
                return null;
            case 861720859:
                if (str.equals("document")) {
                    outgoingMediaKind = HatchAgentPermissionsRepository.OutgoingMediaKind.DOCUMENT;
                    break;
                }
                return null;
            default:
                return null;
        }
        String str2 = this.caption;
        String str3 = this.file_name;
        Long l = this.file_size;
        OutgoingMediaDescriptorJson outgoingMediaDescriptorJson = this.media;
        return new HatchAgentPermissionsRepository.OutgoingMediaItem(outgoingMediaKind, str2, str3, l, outgoingMediaDescriptorJson != null ? outgoingMediaDescriptorJson.toDomain() : null);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ OutgoingMediaItemJson(String str, String str2, String str3, Long l, OutgoingMediaDescriptorJson outgoingMediaDescriptorJson, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : outgoingMediaDescriptorJson);
    }

    public /* synthetic */ OutgoingMediaItemJson(int i, String str, String str2, String str3, Long l, OutgoingMediaDescriptorJson outgoingMediaDescriptorJson, C2hx c2hx) {
        this.kind = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.caption = null;
        } else {
            this.caption = str2;
        }
        if ((i & 4) == 0) {
            this.file_name = null;
        } else {
            this.file_name = str3;
        }
        if ((i & 8) == 0) {
            this.file_size = null;
        } else {
            this.file_size = l;
        }
        if ((i & 16) == 0) {
            this.media = null;
        } else {
            this.media = outgoingMediaDescriptorJson;
        }
    }

    public OutgoingMediaItemJson() {
        this("", null, null, null, null);
    }
}
