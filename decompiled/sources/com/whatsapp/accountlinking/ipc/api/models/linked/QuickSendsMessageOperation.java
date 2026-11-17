package com.whatsapp.accountlinking.ipc.api.models.linked;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C07779iq;
import X.C2277BSd;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C8j4;
import X.C9QU;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import com.whatsapp.accountlinking.ipc.api.models.LinkedOperation;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class QuickSendsMessageOperation extends LinkedOperation {
    public final String contentType;
    public final String contentUrl;
    public final String customMessage;
    public final List<String> obfuscatedChatIds;
    public final String surface;
    public final int version;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {C2277BSd.A00(C79.A01, 18), null, null, null, null, null};

    public final class Companion {
        public final C9hr<QuickSendsMessageOperation> serializer() {
            return C9QU.A00;
        }
    }

    public static /* synthetic */ QuickSendsMessageOperation copy$default(QuickSendsMessageOperation quickSendsMessageOperation, List list, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
        List list2 = list;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        int i3 = i;
        if ((i2 & 1) != 0) {
            list2 = quickSendsMessageOperation.obfuscatedChatIds;
        }
        if ((i2 & 2) != 0) {
            str5 = quickSendsMessageOperation.contentUrl;
        }
        if ((i2 & 4) != 0) {
            str6 = quickSendsMessageOperation.contentType;
        }
        if ((i2 & 8) != 0) {
            str7 = quickSendsMessageOperation.customMessage;
        }
        if ((i2 & 16) != 0) {
            str8 = quickSendsMessageOperation.surface;
        }
        if ((i2 & 32) != 0) {
            i3 = quickSendsMessageOperation.version;
        }
        AnonymousClass005.A0x(list2, str5, str6);
        return new QuickSendsMessageOperation(list2, str5, str6, str7, str8, i3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QuickSendsMessageOperation) {
                QuickSendsMessageOperation quickSendsMessageOperation = (QuickSendsMessageOperation) obj;
                if (!C7384Etj.areEqual(this.obfuscatedChatIds, quickSendsMessageOperation.obfuscatedChatIds) || !C7384Etj.areEqual(this.contentUrl, quickSendsMessageOperation.contentUrl) || !C7384Etj.areEqual(this.contentType, quickSendsMessageOperation.contentType) || !C7384Etj.areEqual(this.customMessage, quickSendsMessageOperation.customMessage) || !C7384Etj.areEqual(this.surface, quickSendsMessageOperation.surface) || this.version != quickSendsMessageOperation.version) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ QuickSendsMessageOperation(int i, List list, String str, String str2, String str3, String str4, int i2, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(C9QU.A01, i, 7);
            throw F60.createAndThrow();
        }
        this.obfuscatedChatIds = list;
        this.contentUrl = str;
        this.contentType = str2;
        if ((i & 8) == 0) {
            this.customMessage = null;
        } else {
            this.customMessage = str3;
        }
        if ((i & 16) == 0) {
            this.surface = null;
        } else {
            this.surface = str4;
        }
        if ((i & 32) == 0) {
            this.version = 1;
        } else {
            this.version = i2;
        }
    }

    public static /* synthetic */ void getContentType$annotations() {
    }

    public static /* synthetic */ void getContentUrl$annotations() {
    }

    public static /* synthetic */ void getCustomMessage$annotations() {
    }

    public static /* synthetic */ void getObfuscatedChatIds$annotations() {
    }

    public static /* synthetic */ void getSurface$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static final /* synthetic */ void write$Self$java_com_whatsapp_accountlinking_ipc_api_api(QuickSendsMessageOperation quickSendsMessageOperation, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(quickSendsMessageOperation.obfuscatedChatIds, C3cH.A15($childSerializers, 0), c9iZ, 0);
        c9j5.AAV(quickSendsMessageOperation.contentUrl, c9iZ, 1);
        c9j5.AAV(quickSendsMessageOperation.contentType, c9iZ, 2);
        boolean zAfR = c9j5.AfR();
        if (zAfR || quickSendsMessageOperation.customMessage != null) {
            c9j5.AAP(quickSendsMessageOperation.customMessage, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || quickSendsMessageOperation.surface != null) {
            c9j5.AAP(quickSendsMessageOperation.surface, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || quickSendsMessageOperation.version != 1) {
            c9j5.AAK(c9iZ, 5, quickSendsMessageOperation.version);
        }
    }

    public final List<String> component1() {
        return this.obfuscatedChatIds;
    }

    public final String component2() {
        return this.contentUrl;
    }

    public final String component3() {
        return this.contentType;
    }

    public final String component4() {
        return this.customMessage;
    }

    public final String component5() {
        return this.surface;
    }

    public final int component6() {
        return this.version;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getContentUrl() {
        return this.contentUrl;
    }

    public final String getCustomMessage() {
        return this.customMessage;
    }

    public final List<String> getObfuscatedChatIds() {
        return this.obfuscatedChatIds;
    }

    public final String getSurface() {
        return this.surface;
    }

    @Override // com.whatsapp.accountlinking.ipc.api.models.Operation
    public int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0I(this.contentType, AnonymousClass005.A0I(this.contentUrl, AnonymousClass005.A0E(this.obfuscatedChatIds))) + AnonymousClass006.A0G(this.customMessage)) * 31) + AnonymousClass005.A0H(this.surface)) * 31) + this.version;
    }

    public String toString() {
        List<String> list = this.obfuscatedChatIds;
        String str = this.contentUrl;
        String str2 = this.contentType;
        String str3 = this.customMessage;
        String str4 = this.surface;
        int i = this.version;
        StringBuilder sbA0f = C3cG.A0f(list, "QuickSendsMessageOperation(obfuscatedChatIds=");
        sbA0f.append(", contentUrl=");
        sbA0f.append(str);
        sbA0f.append(", contentType=");
        sbA0f.append(str2);
        sbA0f.append(", customMessage=");
        sbA0f.append(str3);
        sbA0f.append(AnonymousClass000.A00(19));
        sbA0f.append(str4);
        C8j4.A1Q(sbA0f, i);
        return AnonymousClass001.A0v(")", sbA0f);
    }

    public final QuickSendsMessageOperation copy(List<String> list, String str, String str2, String str3, String str4, int i) {
        AnonymousClass005.A0x(list, str, str2);
        return new QuickSendsMessageOperation(list, str, str2, str3, str4, i);
    }

    public QuickSendsMessageOperation(List<String> list, String str, String str2, String str3, String str4, int i) {
        AnonymousClass005.A0x(list, str, str2);
        this.obfuscatedChatIds = list;
        this.contentUrl = str;
        this.contentType = str2;
        this.customMessage = str3;
        this.surface = str4;
        this.version = i;
    }

    public /* synthetic */ QuickSendsMessageOperation(List list, String str, String str2, String str3, String str4, int i, int i2, C06H c06h) {
        this(list, str, str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? 1 : i);
    }
}
