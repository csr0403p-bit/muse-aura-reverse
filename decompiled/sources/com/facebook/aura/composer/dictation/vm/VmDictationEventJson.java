package com.facebook.aura.composer.dictation.vm;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class VmDictationEventJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String code;
    public final String message;
    public final String text;
    public final String type;

    public final class Companion {
        public final C9hr<VmDictationEventJson> serializer() {
            return VmDictationEventJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_composer_dictation_vm_vm(VmDictationEventJson vmDictationEventJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(vmDictationEventJson.type)) {
            c9j5.AAV(vmDictationEventJson.type, c9iZ, 0);
        }
        if (zAfR || !"".equals(vmDictationEventJson.text)) {
            c9j5.AAV(vmDictationEventJson.text, c9iZ, 1);
        }
        if (zAfR || !"".equals(vmDictationEventJson.code)) {
            c9j5.AAV(vmDictationEventJson.code, c9iZ, 2);
        }
        if (zAfR || !"".equals(vmDictationEventJson.message)) {
            c9j5.AAV(vmDictationEventJson.message, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VmDictationEventJson) {
                VmDictationEventJson vmDictationEventJson = (VmDictationEventJson) obj;
                if (!C7384Etj.areEqual(this.type, vmDictationEventJson.type) || !C7384Etj.areEqual(this.text, vmDictationEventJson.text) || !C7384Etj.areEqual(this.code, vmDictationEventJson.code) || !C7384Etj.areEqual(this.message, vmDictationEventJson.message)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VmDictationEventJson copy$default(VmDictationEventJson vmDictationEventJson, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vmDictationEventJson.type;
        }
        if ((i & 2) != 0) {
            str2 = vmDictationEventJson.text;
        }
        if ((i & 4) != 0) {
            str3 = vmDictationEventJson.code;
        }
        if ((i & 8) != 0) {
            str4 = vmDictationEventJson.message;
        }
        return vmDictationEventJson.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.code;
    }

    public final String component4() {
        return this.message;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getText() {
        return this.text;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.message, AnonymousClass005.A0I(this.code, AnonymousClass005.A0I(this.text, AnonymousClass001.A0G(this.type))));
    }

    public VmDictationEventJson(String str, String str2, String str3, String str4) {
        AnonymousClass005.A14(str, str2, str3, str4);
        this.type = str;
        this.text = str2;
        this.code = str3;
        this.message = str4;
    }

    public final VmDictationEventJson copy(String str, String str2, String str3, String str4) {
        AnonymousClass005.A14(str, str2, str3, str4);
        return new VmDictationEventJson(str, str2, str3, str4);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VmDictationEventJson(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.type = "";
        } else {
            this.type = str;
        }
        if ((i & 2) == 0) {
            this.text = "";
        } else {
            this.text = str2;
        }
        if ((i & 4) == 0) {
            this.code = "";
        } else {
            this.code = str3;
        }
        if ((i & 8) == 0) {
            this.message = "";
        } else {
            this.message = str4;
        }
    }

    public /* synthetic */ VmDictationEventJson(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }

    public VmDictationEventJson() {
        this("", "", "", "");
    }
}
