package com.facebook.aura.gateway;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
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
public final class ApprovalRequestPreviewDocumentJson extends C06G {
    public static final int $stable = 8;
    public final List<ApprovalRequestPreviewBlockJson> blocks;
    public final boolean truncated;
    public final int version;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1V(C79.A01, null, null, ApprovalRequestPreviewDocumentJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<ApprovalRequestPreviewDocumentJson> serializer() {
            return ApprovalRequestPreviewDocumentJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ApprovalRequestPreviewDocumentJson(int i, boolean z, List<? extends ApprovalRequestPreviewBlockJson> list) {
        C7384Etj.A0Y(list, 2);
        this.version = i;
        this.truncated = z;
        this.blocks = list;
    }

    public final ApprovalRequestPreviewDocumentJson copy(int i, boolean z, List<? extends ApprovalRequestPreviewBlockJson> list) {
        C7384Etj.A0Y(list, 2);
        return new ApprovalRequestPreviewDocumentJson(i, z, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApprovalRequestPreviewDocumentJson) {
                ApprovalRequestPreviewDocumentJson approvalRequestPreviewDocumentJson = (ApprovalRequestPreviewDocumentJson) obj;
                if (this.version != approvalRequestPreviewDocumentJson.version || this.truncated != approvalRequestPreviewDocumentJson.truncated || !C7384Etj.areEqual(this.blocks, approvalRequestPreviewDocumentJson.blocks)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApprovalRequestPreviewDocumentJson copy$default(ApprovalRequestPreviewDocumentJson approvalRequestPreviewDocumentJson, int i, boolean z, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = approvalRequestPreviewDocumentJson.version;
        }
        if ((i2 & 2) != 0) {
            z = approvalRequestPreviewDocumentJson.truncated;
        }
        if ((i2 & 4) != 0) {
            list = approvalRequestPreviewDocumentJson.blocks;
        }
        return approvalRequestPreviewDocumentJson.copy(i, z, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ApprovalRequestPreviewDocumentJson approvalRequestPreviewDocumentJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAK(c9iZ, 0, approvalRequestPreviewDocumentJson.version);
        c9j5.AA7(c9iZ, 1, approvalRequestPreviewDocumentJson.truncated);
        c9j5.AAQ(approvalRequestPreviewDocumentJson.blocks, C3cH.A15(f0cArr, 2), c9iZ, 2);
    }

    public final int component1() {
        return this.version;
    }

    public final boolean component2() {
        return this.truncated;
    }

    public final List<ApprovalRequestPreviewBlockJson> component3() {
        return this.blocks;
    }

    public final List<ApprovalRequestPreviewBlockJson> getBlocks() {
        return this.blocks;
    }

    public final boolean getTruncated() {
        return this.truncated;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.blocks, C0KA.A01(this.version * 31, this.truncated));
    }

    public final HatchAgentPermissionsRepository.AgentPermissionRequestPreviewDocument toDomainOrNull() {
        int size;
        int i = this.version;
        if (1 <= i && i < 3 && 1 <= (size = this.blocks.size()) && size < 9) {
            List<ApprovalRequestPreviewBlockJson> list = this.blocks;
            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
            Iterator<ApprovalRequestPreviewBlockJson> it = list.iterator();
            while (it.hasNext()) {
                HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock domainOrNull = it.next().toDomainOrNull();
                if (domainOrNull != null) {
                    arrayListA0i.add(domainOrNull);
                }
            }
            return new HatchAgentPermissionsRepository.AgentPermissionRequestPreviewDocument(this.truncated, arrayListA0i);
        }
        return null;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ApprovalRequestPreviewDocumentJson(int i, int i2, boolean z, List list, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(ApprovalRequestPreviewDocumentJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.version = i2;
        this.truncated = z;
        this.blocks = list;
    }
}
