package com.facebook.aura.gateway;

import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class OutgoingMediaDescriptorJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String content_type;
    public final Integer height;
    public final Long updated_at_ms;
    public final String url;
    public final Integer width;

    public final class Companion {
        public final C9hr<OutgoingMediaDescriptorJson> serializer() {
            return OutgoingMediaDescriptorJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(OutgoingMediaDescriptorJson outgoingMediaDescriptorJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || outgoingMediaDescriptorJson.url != null) {
            c9j5.AAP(outgoingMediaDescriptorJson.url, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || outgoingMediaDescriptorJson.width != null) {
            c9j5.AAP(outgoingMediaDescriptorJson.width, C07729ii.A00, c9iZ, 1);
        }
        if (zAfR || outgoingMediaDescriptorJson.height != null) {
            c9j5.AAP(outgoingMediaDescriptorJson.height, C07729ii.A00, c9iZ, 2);
        }
        if (zAfR || outgoingMediaDescriptorJson.content_type != null) {
            c9j5.AAP(outgoingMediaDescriptorJson.content_type, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || outgoingMediaDescriptorJson.updated_at_ms != null) {
            c9j5.AAP(outgoingMediaDescriptorJson.updated_at_ms, C9j1.A00, c9iZ, 4);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OutgoingMediaDescriptorJson) {
                OutgoingMediaDescriptorJson outgoingMediaDescriptorJson = (OutgoingMediaDescriptorJson) obj;
                if (!C7384Etj.areEqual(this.url, outgoingMediaDescriptorJson.url) || !C7384Etj.areEqual(this.width, outgoingMediaDescriptorJson.width) || !C7384Etj.areEqual(this.height, outgoingMediaDescriptorJson.height) || !C7384Etj.areEqual(this.content_type, outgoingMediaDescriptorJson.content_type) || !C7384Etj.areEqual(this.updated_at_ms, outgoingMediaDescriptorJson.updated_at_ms)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ OutgoingMediaDescriptorJson copy$default(OutgoingMediaDescriptorJson outgoingMediaDescriptorJson, String str, Integer num, Integer num2, String str2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = outgoingMediaDescriptorJson.url;
        }
        if ((i & 2) != 0) {
            num = outgoingMediaDescriptorJson.width;
        }
        if ((i & 4) != 0) {
            num2 = outgoingMediaDescriptorJson.height;
        }
        if ((i & 8) != 0) {
            str2 = outgoingMediaDescriptorJson.content_type;
        }
        if ((i & 16) != 0) {
            l = outgoingMediaDescriptorJson.updated_at_ms;
        }
        return outgoingMediaDescriptorJson.copy(str, num, num2, str2, l);
    }

    public final String component1() {
        return this.url;
    }

    public final Integer component2() {
        return this.width;
    }

    public final Integer component3() {
        return this.height;
    }

    public final String component4() {
        return this.content_type;
    }

    public final Long component5() {
        return this.updated_at_ms;
    }

    public final OutgoingMediaDescriptorJson copy(String str, Integer num, Integer num2, String str2, Long l) {
        return new OutgoingMediaDescriptorJson(str, num, num2, str2, l);
    }

    public final String getContent_type() {
        return this.content_type;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final Long getUpdated_at_ms() {
        return this.updated_at_ms;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((((((AnonymousClass006.A0G(this.url) * 31) + AnonymousClass006.A0D(this.width)) * 31) + AnonymousClass006.A0D(this.height)) * 31) + AnonymousClass006.A0G(this.content_type)) * 31) + C3cH.A02(this.updated_at_ms);
    }

    public final HatchAgentPermissionsRepository.OutgoingMediaDescriptor toDomain() {
        String strA0l;
        String str = this.url;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || C7BY.A0j(strA0l)) {
            return null;
        }
        return new HatchAgentPermissionsRepository.OutgoingMediaDescriptor(strA0l, this.width, this.height, this.content_type, this.updated_at_ms);
    }

    public OutgoingMediaDescriptorJson(String str, Integer num, Integer num2, String str2, Long l) {
        this.url = str;
        this.width = num;
        this.height = num2;
        this.content_type = str2;
        this.updated_at_ms = l;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ OutgoingMediaDescriptorJson(String str, Integer num, Integer num2, String str2, Long l, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : l);
    }

    public /* synthetic */ OutgoingMediaDescriptorJson(int i, String str, Integer num, Integer num2, String str2, Long l, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.url = null;
        } else {
            this.url = str;
        }
        if ((i & 2) == 0) {
            this.width = null;
        } else {
            this.width = num;
        }
        if ((i & 4) == 0) {
            this.height = null;
        } else {
            this.height = num2;
        }
        if ((i & 8) == 0) {
            this.content_type = null;
        } else {
            this.content_type = str2;
        }
        if ((i & 16) == 0) {
            this.updated_at_ms = null;
        } else {
            this.updated_at_ms = l;
        }
    }

    public OutgoingMediaDescriptorJson() {
        this(null, null, null, null, null);
    }
}
