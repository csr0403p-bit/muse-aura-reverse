package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
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
public final class ApprovalRequestPreviewFieldsBlockJson extends C06G implements ApprovalRequestPreviewBlockJson {
    public static final int $stable = 8;
    public final List<ApprovalRequestPreviewFieldJson> rows;
    public final String type;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1W(C79.A01, null, ApprovalRequestPreviewFieldsBlockJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<ApprovalRequestPreviewFieldsBlockJson> serializer() {
            return ApprovalRequestPreviewFieldsBlockJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApprovalRequestPreviewFieldsBlockJson) {
                ApprovalRequestPreviewFieldsBlockJson approvalRequestPreviewFieldsBlockJson = (ApprovalRequestPreviewFieldsBlockJson) obj;
                if (!C7384Etj.areEqual(this.type, approvalRequestPreviewFieldsBlockJson.type) || !C7384Etj.areEqual(this.rows, approvalRequestPreviewFieldsBlockJson.rows)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ApprovalRequestPreviewFieldsBlockJson copy$default(ApprovalRequestPreviewFieldsBlockJson approvalRequestPreviewFieldsBlockJson, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = approvalRequestPreviewFieldsBlockJson.type;
        }
        if ((i & 2) != 0) {
            list = approvalRequestPreviewFieldsBlockJson.rows;
        }
        AnonymousClass003.A0u(str, list);
        return new ApprovalRequestPreviewFieldsBlockJson(str, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ApprovalRequestPreviewFieldsBlockJson approvalRequestPreviewFieldsBlockJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(approvalRequestPreviewFieldsBlockJson.getType(), c9iZ, 0);
        c9j5.AAQ(approvalRequestPreviewFieldsBlockJson.rows, C3cH.A15(f0cArr, 1), c9iZ, 1);
    }

    public final String component1() {
        return this.type;
    }

    public final List<ApprovalRequestPreviewFieldJson> component2() {
        return this.rows;
    }

    public final List<ApprovalRequestPreviewFieldJson> getRows() {
        return this.rows;
    }

    @Override // com.facebook.aura.gateway.ApprovalRequestPreviewBlockJson
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.rows, AnonymousClass001.A0G(this.type));
    }

    public ApprovalRequestPreviewFieldsBlockJson(String str, List<ApprovalRequestPreviewFieldJson> list) {
        AnonymousClass003.A0u(str, list);
        this.type = str;
        this.rows = list;
    }

    public final ApprovalRequestPreviewFieldsBlockJson copy(String str, List<ApprovalRequestPreviewFieldJson> list) {
        AnonymousClass003.A0u(str, list);
        return new ApprovalRequestPreviewFieldsBlockJson(str, list);
    }

    @Override // com.facebook.aura.gateway.ApprovalRequestPreviewBlockJson
    public HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.Fields toDomainOrNull() {
        int size;
        if ("fields".equals(getType()) && 1 <= (size = this.rows.size()) && size < 33) {
            List<ApprovalRequestPreviewFieldJson> list = this.rows;
            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
            Iterator<ApprovalRequestPreviewFieldJson> it = list.iterator();
            while (it.hasNext()) {
                HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField domainOrNull = it.next().toDomainOrNull();
                if (domainOrNull != null) {
                    arrayListA0i.add(domainOrNull);
                }
            }
            return new HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.Fields(arrayListA0i);
        }
        return null;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ApprovalRequestPreviewFieldsBlockJson(int i, String str, List list, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(ApprovalRequestPreviewFieldsBlockJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.type = str;
        this.rows = list;
    }
}
