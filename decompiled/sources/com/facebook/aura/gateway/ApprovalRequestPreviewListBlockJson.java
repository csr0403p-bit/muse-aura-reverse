package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ApprovalRequestPreviewListBlockJson extends C06G implements ApprovalRequestPreviewBlockJson {
    public static final int $stable = 8;
    public final List<String> items;
    public final String key;
    public final String label;
    public final String type;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1U(C79.A01, null, null, null, ApprovalRequestPreviewListBlockJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<ApprovalRequestPreviewListBlockJson> serializer() {
            return ApprovalRequestPreviewListBlockJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApprovalRequestPreviewListBlockJson) {
                ApprovalRequestPreviewListBlockJson approvalRequestPreviewListBlockJson = (ApprovalRequestPreviewListBlockJson) obj;
                if (!C7384Etj.areEqual(this.type, approvalRequestPreviewListBlockJson.type) || !C7384Etj.areEqual(this.key, approvalRequestPreviewListBlockJson.key) || !C7384Etj.areEqual(this.label, approvalRequestPreviewListBlockJson.label) || !C7384Etj.areEqual(this.items, approvalRequestPreviewListBlockJson.items)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ApprovalRequestPreviewListBlockJson copy$default(ApprovalRequestPreviewListBlockJson approvalRequestPreviewListBlockJson, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = approvalRequestPreviewListBlockJson.type;
        }
        if ((i & 2) != 0) {
            str2 = approvalRequestPreviewListBlockJson.key;
        }
        if ((i & 4) != 0) {
            str3 = approvalRequestPreviewListBlockJson.label;
        }
        if ((i & 8) != 0) {
            list = approvalRequestPreviewListBlockJson.items;
        }
        AnonymousClass005.A0y(str, str2, list);
        return new ApprovalRequestPreviewListBlockJson(str, str2, str3, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ApprovalRequestPreviewListBlockJson approvalRequestPreviewListBlockJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(approvalRequestPreviewListBlockJson.getType(), c9iZ, 0);
        c9j5.AAV(approvalRequestPreviewListBlockJson.key, c9iZ, 1);
        if (c9j5.AfR() || approvalRequestPreviewListBlockJson.label != null) {
            c9j5.AAP(approvalRequestPreviewListBlockJson.label, C07779iq.A01, c9iZ, 2);
        }
        c9j5.AAQ(approvalRequestPreviewListBlockJson.items, C3cH.A15(f0cArr, 3), c9iZ, 3);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.key;
    }

    public final String component3() {
        return this.label;
    }

    public final List<String> component4() {
        return this.items;
    }

    public final List<String> getItems() {
        return this.items;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getLabel() {
        return this.label;
    }

    @Override // com.facebook.aura.gateway.ApprovalRequestPreviewBlockJson
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.items, (AnonymousClass005.A0I(this.key, AnonymousClass001.A0G(this.type)) + AnonymousClass006.A0G(this.label)) * 31);
    }

    public ApprovalRequestPreviewListBlockJson(String str, String str2, String str3, List<String> list) {
        AnonymousClass005.A0y(str, str2, list);
        this.type = str;
        this.key = str2;
        this.label = str3;
        this.items = list;
    }

    public final ApprovalRequestPreviewListBlockJson copy(String str, String str2, String str3, List<String> list) {
        AnonymousClass005.A0y(str, str2, list);
        return new ApprovalRequestPreviewListBlockJson(str, str2, str3, list);
    }

    @Override // com.facebook.aura.gateway.ApprovalRequestPreviewBlockJson
    public HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.ItemList toDomainOrNull() {
        int size;
        if (!"list".equals(getType()) || !ApprovalRequestPreviewJsonKt.isValidKey(this.key) || !ApprovalRequestPreviewJsonKt.isValidOptionalLabel(this.label) || 1 > (size = this.items.size()) || size >= 33) {
            return null;
        }
        List<String> list = this.items;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (!ApprovalRequestPreviewJsonKt.isValidFieldOrListValue(AnonymousClass005.A0j(it))) {
                    return null;
                }
            }
        }
        return new HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.ItemList(this.key, this.label, this.items);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ApprovalRequestPreviewListBlockJson(int i, String str, String str2, String str3, List list, C2hx c2hx) {
        if (11 != (i & 11)) {
            C9iI.A00(ApprovalRequestPreviewListBlockJson$$serializer.descriptor, i, 11);
            throw F60.createAndThrow();
        }
        this.type = str;
        this.key = str2;
        this.label = C3cI.A0W(i, str3);
        this.items = list;
    }

    public /* synthetic */ ApprovalRequestPreviewListBlockJson(String str, String str2, String str3, List list, int i, C06H c06h) {
        this(str, str2, AnonymousClass006.A0t(i, str3), list);
    }
}
