package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
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
import X.C9Y;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ApprovalRequestPreviewAttachmentsBlockJson extends C06G implements ApprovalRequestPreviewBlockJson {
    public static final int $stable = 8;
    public final List<ApprovalRequestPreviewAttachmentJson> items;
    public final String key;
    public final String label;
    public final String type;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1U(C79.A01, null, null, null, ApprovalRequestPreviewAttachmentsBlockJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<ApprovalRequestPreviewAttachmentsBlockJson> serializer() {
            return ApprovalRequestPreviewAttachmentsBlockJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApprovalRequestPreviewAttachmentsBlockJson) {
                ApprovalRequestPreviewAttachmentsBlockJson approvalRequestPreviewAttachmentsBlockJson = (ApprovalRequestPreviewAttachmentsBlockJson) obj;
                if (!C7384Etj.areEqual(this.type, approvalRequestPreviewAttachmentsBlockJson.type) || !C7384Etj.areEqual(this.key, approvalRequestPreviewAttachmentsBlockJson.key) || !C7384Etj.areEqual(this.label, approvalRequestPreviewAttachmentsBlockJson.label) || !C7384Etj.areEqual(this.items, approvalRequestPreviewAttachmentsBlockJson.items)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ApprovalRequestPreviewAttachmentsBlockJson copy$default(ApprovalRequestPreviewAttachmentsBlockJson approvalRequestPreviewAttachmentsBlockJson, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = approvalRequestPreviewAttachmentsBlockJson.type;
        }
        if ((i & 2) != 0) {
            str2 = approvalRequestPreviewAttachmentsBlockJson.key;
        }
        if ((i & 4) != 0) {
            str3 = approvalRequestPreviewAttachmentsBlockJson.label;
        }
        if ((i & 8) != 0) {
            list = approvalRequestPreviewAttachmentsBlockJson.items;
        }
        AnonymousClass005.A0y(str, str2, list);
        return new ApprovalRequestPreviewAttachmentsBlockJson(str, str2, str3, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ApprovalRequestPreviewAttachmentsBlockJson approvalRequestPreviewAttachmentsBlockJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(approvalRequestPreviewAttachmentsBlockJson.getType(), c9iZ, 0);
        c9j5.AAV(approvalRequestPreviewAttachmentsBlockJson.key, c9iZ, 1);
        if (c9j5.AfR() || approvalRequestPreviewAttachmentsBlockJson.label != null) {
            c9j5.AAP(approvalRequestPreviewAttachmentsBlockJson.label, C07779iq.A01, c9iZ, 2);
        }
        c9j5.AAQ(approvalRequestPreviewAttachmentsBlockJson.items, C3cH.A15(f0cArr, 3), c9iZ, 3);
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

    public final List<ApprovalRequestPreviewAttachmentJson> component4() {
        return this.items;
    }

    public final List<ApprovalRequestPreviewAttachmentJson> getItems() {
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

    public ApprovalRequestPreviewAttachmentsBlockJson(String str, String str2, String str3, List<ApprovalRequestPreviewAttachmentJson> list) {
        AnonymousClass005.A0y(str, str2, list);
        this.type = str;
        this.key = str2;
        this.label = str3;
        this.items = list;
    }

    public final ApprovalRequestPreviewAttachmentsBlockJson copy(String str, String str2, String str3, List<ApprovalRequestPreviewAttachmentJson> list) {
        AnonymousClass005.A0y(str, str2, list);
        return new ApprovalRequestPreviewAttachmentsBlockJson(str, str2, str3, list);
    }

    @Override // com.facebook.aura.gateway.ApprovalRequestPreviewBlockJson
    public HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.Attachments toDomainOrNull() {
        int size;
        if (C9Y.BUG_REPORT_ATTACHMENTS_ENDPOINT.equals(getType()) && ApprovalRequestPreviewJsonKt.isValidKey(this.key) && ApprovalRequestPreviewJsonKt.isValidOptionalLabel(this.label) && 1 <= (size = this.items.size()) && size < 41) {
            List<ApprovalRequestPreviewAttachmentJson> list = this.items;
            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
            Iterator<ApprovalRequestPreviewAttachmentJson> it = list.iterator();
            while (it.hasNext()) {
                HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachment domainOrNull = it.next().toDomainOrNull();
                if (domainOrNull != null) {
                    arrayListA0i.add(domainOrNull);
                }
            }
            return new HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.Attachments(this.key, this.label, arrayListA0i);
        }
        return null;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ApprovalRequestPreviewAttachmentsBlockJson(int i, String str, String str2, String str3, List list, C2hx c2hx) {
        if (11 != (i & 11)) {
            C9iI.A00(ApprovalRequestPreviewAttachmentsBlockJson$$serializer.descriptor, i, 11);
            throw F60.createAndThrow();
        }
        this.type = str;
        this.key = str2;
        this.label = C3cI.A0W(i, str3);
        this.items = list;
    }

    public /* synthetic */ ApprovalRequestPreviewAttachmentsBlockJson(String str, String str2, String str3, List list, int i, C06H c06h) {
        this(str, str2, AnonymousClass006.A0t(i, str3), list);
    }
}
