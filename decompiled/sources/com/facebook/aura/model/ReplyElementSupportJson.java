package com.facebook.aura.model;

import X.AbstractC5321DgF;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;

@Serializable
/* loaded from: classes2.dex */
public final class ReplyElementSupportJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final List<JsonElement> supportedReplyElementKinds;
    public final List<JsonElement> supportedReplyToTargetTypes;
    public final List<JsonElement> supported_reply_element_kinds;
    public final List<JsonElement> supported_reply_to_target_types;

    public final class Companion {
        public final C9hr<ReplyElementSupportJson> serializer() {
            return ReplyElementSupportJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ReplyElementSupportJson) {
                ReplyElementSupportJson replyElementSupportJson = (ReplyElementSupportJson) obj;
                if (!C7384Etj.areEqual(this.supported_reply_to_target_types, replyElementSupportJson.supported_reply_to_target_types) || !C7384Etj.areEqual(this.supportedReplyToTargetTypes, replyElementSupportJson.supportedReplyToTargetTypes) || !C7384Etj.areEqual(this.supported_reply_element_kinds, replyElementSupportJson.supported_reply_element_kinds) || !C7384Etj.areEqual(this.supportedReplyElementKinds, replyElementSupportJson.supportedReplyElementKinds)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        Integer num = C79.A01;
        $childSerializers = C3cG.A1U(num, AbstractC5321DgF.A02(num, ReplyElementSupportJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, ReplyElementSupportJson$Companion$$childSerializers$2.INSTANCE), AbstractC5321DgF.A02(num, ReplyElementSupportJson$Companion$$childSerializers$3.INSTANCE), ReplyElementSupportJson$Companion$$childSerializers$4.INSTANCE);
    }

    public static /* synthetic */ ReplyElementSupportJson copy$default(ReplyElementSupportJson replyElementSupportJson, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = replyElementSupportJson.supported_reply_to_target_types;
        }
        if ((i & 2) != 0) {
            list2 = replyElementSupportJson.supportedReplyToTargetTypes;
        }
        if ((i & 4) != 0) {
            list3 = replyElementSupportJson.supported_reply_element_kinds;
        }
        if ((i & 8) != 0) {
            list4 = replyElementSupportJson.supportedReplyElementKinds;
        }
        return new ReplyElementSupportJson(list, list2, list3, list4);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(ReplyElementSupportJson replyElementSupportJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || replyElementSupportJson.supported_reply_to_target_types != null) {
            c9j5.AAP(replyElementSupportJson.supported_reply_to_target_types, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || replyElementSupportJson.supportedReplyToTargetTypes != null) {
            c9j5.AAP(replyElementSupportJson.supportedReplyToTargetTypes, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || replyElementSupportJson.supported_reply_element_kinds != null) {
            c9j5.AAP(replyElementSupportJson.supported_reply_element_kinds, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || replyElementSupportJson.supportedReplyElementKinds != null) {
            c9j5.AAP(replyElementSupportJson.supportedReplyElementKinds, C3cH.A15(f0cArr, 3), c9iZ, 3);
        }
    }

    public final List<JsonElement> component1() {
        return this.supported_reply_to_target_types;
    }

    public final List<JsonElement> component2() {
        return this.supportedReplyToTargetTypes;
    }

    public final List<JsonElement> component3() {
        return this.supported_reply_element_kinds;
    }

    public final List<JsonElement> component4() {
        return this.supportedReplyElementKinds;
    }

    public final ReplyElementSupportJson copy(List<? extends JsonElement> list, List<? extends JsonElement> list2, List<? extends JsonElement> list3, List<? extends JsonElement> list4) {
        return new ReplyElementSupportJson(list, list2, list3, list4);
    }

    public final List<JsonElement> getSupportedReplyElementKinds() {
        return this.supportedReplyElementKinds;
    }

    public final List<JsonElement> getSupportedReplyToTargetTypes() {
        return this.supportedReplyToTargetTypes;
    }

    public final List<JsonElement> getSupported_reply_element_kinds() {
        return this.supported_reply_element_kinds;
    }

    public final List<JsonElement> getSupported_reply_to_target_types() {
        return this.supported_reply_to_target_types;
    }

    public int hashCode() {
        return (((((AnonymousClass006.A0D(this.supported_reply_to_target_types) * 31) + AnonymousClass006.A0D(this.supportedReplyToTargetTypes)) * 31) + AnonymousClass006.A0D(this.supported_reply_element_kinds)) * 31) + C3cH.A02(this.supportedReplyElementKinds);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReplyElementSupportJson(List<? extends JsonElement> list, List<? extends JsonElement> list2, List<? extends JsonElement> list3, List<? extends JsonElement> list4) {
        this.supported_reply_to_target_types = list;
        this.supportedReplyToTargetTypes = list2;
        this.supported_reply_element_kinds = list3;
        this.supportedReplyElementKinds = list4;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ReplyElementSupportJson(int i, List list, List list2, List list3, List list4, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.supported_reply_to_target_types = null;
        } else {
            this.supported_reply_to_target_types = list;
        }
        if ((i & 2) == 0) {
            this.supportedReplyToTargetTypes = null;
        } else {
            this.supportedReplyToTargetTypes = list2;
        }
        if ((i & 4) == 0) {
            this.supported_reply_element_kinds = null;
        } else {
            this.supported_reply_element_kinds = list3;
        }
        if ((i & 8) == 0) {
            this.supportedReplyElementKinds = null;
        } else {
            this.supportedReplyElementKinds = list4;
        }
    }

    public /* synthetic */ ReplyElementSupportJson(List list, List list2, List list3, List list4, int i, C06H c06h) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4);
    }

    public ReplyElementSupportJson() {
        this(null, null, null, null);
    }
}
