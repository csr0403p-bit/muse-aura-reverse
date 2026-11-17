package com.facebook.aura.model;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
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
public final class ReplyElementKindsJson extends C06G {
    public final List<JsonElement> kinds;
    public final String targetType;
    public final String target_type;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1V(C79.A01, null, null, ReplyElementKindsJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<ReplyElementKindsJson> serializer() {
            return ReplyElementKindsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ReplyElementKindsJson) {
                ReplyElementKindsJson replyElementKindsJson = (ReplyElementKindsJson) obj;
                if (!C7384Etj.areEqual(this.target_type, replyElementKindsJson.target_type) || !C7384Etj.areEqual(this.targetType, replyElementKindsJson.targetType) || !C7384Etj.areEqual(this.kinds, replyElementKindsJson.kinds)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ReplyElementKindsJson copy$default(ReplyElementKindsJson replyElementKindsJson, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = replyElementKindsJson.target_type;
        }
        if ((i & 2) != 0) {
            str2 = replyElementKindsJson.targetType;
        }
        if ((i & 4) != 0) {
            list = replyElementKindsJson.kinds;
        }
        return new ReplyElementKindsJson(str, str2, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(ReplyElementKindsJson replyElementKindsJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || replyElementKindsJson.target_type != null) {
            c9j5.AAP(replyElementKindsJson.target_type, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || replyElementKindsJson.targetType != null) {
            c9j5.AAP(replyElementKindsJson.targetType, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || replyElementKindsJson.kinds != null) {
            c9j5.AAP(replyElementKindsJson.kinds, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
    }

    public final String component1() {
        return this.target_type;
    }

    public final String component2() {
        return this.targetType;
    }

    public final List<JsonElement> component3() {
        return this.kinds;
    }

    public final ReplyElementKindsJson copy(String str, String str2, List<? extends JsonElement> list) {
        return new ReplyElementKindsJson(str, str2, list);
    }

    public final List<JsonElement> getKinds() {
        return this.kinds;
    }

    public final String getTargetType() {
        return this.targetType;
    }

    public final String getTarget_type() {
        return this.target_type;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.target_type) * 31) + AnonymousClass006.A0G(this.targetType)) * 31) + C3cH.A02(this.kinds);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReplyElementKindsJson(String str, String str2, List<? extends JsonElement> list) {
        this.target_type = str;
        this.targetType = str2;
        this.kinds = list;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ReplyElementKindsJson(int i, String str, String str2, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.target_type = null;
        } else {
            this.target_type = str;
        }
        if ((i & 2) == 0) {
            this.targetType = null;
        } else {
            this.targetType = str2;
        }
        if ((i & 4) == 0) {
            this.kinds = null;
        } else {
            this.kinds = list;
        }
    }

    public /* synthetic */ ReplyElementKindsJson(String str, String str2, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }

    public ReplyElementKindsJson() {
        this(null, null, null);
    }
}
