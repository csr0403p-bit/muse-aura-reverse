package com.facebook.aura.localbrowser;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C7384Etj;
import com.facebook.aura.nodes.api.HatchNodeInvocation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ManagedBrowserSession {
    public static final int $stable = 8;
    public ManagedBrowserBindingJson binding;
    public final ManagedBrowserCapabilitiesJson capabilities;
    public long connectionGeneration;
    public ManagedBrowserDocumentJson document;
    public Function0<Boolean> isConnectionCurrent;
    public final ManagedBrowserSensitiveSitePolicyJson policy;
    public boolean retirementOnly;
    public long revision;
    public final LocalBrowserSession session;
    public String unresolvedOperation;

    public final void advance(ManagedBrowserFenceJson managedBrowserFenceJson, long j) {
        C7384Etj.A0Y(managedBrowserFenceJson, 0);
        ManagedBrowserBindingJson managedBrowserBindingJson = managedBrowserFenceJson.binding;
        if (managedBrowserBindingJson.control_epoch > this.binding.control_epoch) {
            this.binding = managedBrowserBindingJson;
        }
        this.revision = Math.max(this.revision, j);
    }

    public final boolean reattach(ManagedBrowserRequestJson managedBrowserRequestJson, HatchNodeInvocation hatchNodeInvocation) {
        boolean zA1a = AnonymousClass002.A1a(managedBrowserRequestJson, hatchNodeInvocation);
        ManagedBrowserBindingJson managedBrowserBindingJson = managedBrowserRequestJson.fence.binding;
        ManagedBrowserOperationJson managedBrowserOperationJson = managedBrowserRequestJson.operation;
        if (!this.retirementOnly && "reattach".equals(managedBrowserOperationJson.kind) && C7384Etj.areEqual(managedBrowserOperationJson.previous_binding, this.binding) && C7384Etj.areEqual(managedBrowserOperationJson.sensitive_site_policy, this.policy) && C7384Etj.areEqual(managedBrowserOperationJson.unresolved_operation, this.unresolvedOperation) && hatchNodeInvocation.connectionGeneration > this.connectionGeneration && AnonymousClass003.A1Y(hatchNodeInvocation.isConnectionCurrent)) {
            long j = managedBrowserBindingJson.control_epoch;
            ManagedBrowserBindingJson managedBrowserBindingJson2 = this.binding;
            if (j > managedBrowserBindingJson2.control_epoch && !C7384Etj.areEqual(managedBrowserBindingJson.transport_generation, managedBrowserBindingJson2.transport_generation)) {
                ManagedBrowserBindingJson managedBrowserBindingJson3 = this.binding;
                long j2 = managedBrowserBindingJson3.control_epoch;
                if (C7384Etj.areEqual(managedBrowserBindingJson.copy(managedBrowserBindingJson.browser_task_id, managedBrowserBindingJson.device_id, managedBrowserBindingJson.account_id, managedBrowserBindingJson.vm_id, managedBrowserBindingJson.executor_instance_id, managedBrowserBindingJson.task_binding_id, managedBrowserBindingJson3.transport_generation, j2), this.binding)) {
                    ManagedBrowserFenceJson managedBrowserFenceJson = managedBrowserRequestJson.fence;
                    long j3 = managedBrowserFenceJson.state_revision;
                    if (j3 >= this.revision && managedBrowserFenceJson.capability_version == this.capabilities.protocol_version) {
                        this.binding = managedBrowserBindingJson;
                        this.revision = j3;
                        this.document = null;
                        this.connectionGeneration = hatchNodeInvocation.connectionGeneration;
                        this.isConnectionCurrent = hatchNodeInvocation.isConnectionCurrent;
                        try {
                            this.session.revokeAuthority();
                            return zA1a;
                        } catch (RuntimeException e) {
                            this.retirementOnly = zA1a;
                            this.session.stopAutomation();
                            throw e;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static /* synthetic */ void advance$default(ManagedBrowserSession managedBrowserSession, ManagedBrowserFenceJson managedBrowserFenceJson, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = managedBrowserFenceJson.state_revision;
        }
        managedBrowserSession.advance(managedBrowserFenceJson, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean accepts(com.facebook.aura.localbrowser.ManagedBrowserRequestJson r25, com.facebook.aura.nodes.api.HatchNodeInvocation r26) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.ManagedBrowserSession.accepts(com.facebook.aura.localbrowser.ManagedBrowserRequestJson, com.facebook.aura.nodes.api.HatchNodeInvocation):boolean");
    }

    public final ManagedBrowserBindingJson getBinding() {
        return this.binding;
    }

    public final ManagedBrowserCapabilitiesJson getCapabilities() {
        return this.capabilities;
    }

    public final boolean getConnectionCurrent() {
        return AnonymousClass003.A1Y(this.isConnectionCurrent);
    }

    public final ManagedBrowserDocumentJson getDocument() {
        return this.document;
    }

    public final ManagedBrowserSensitiveSitePolicyJson getPolicy() {
        return this.policy;
    }

    public final long getRevision() {
        return this.revision;
    }

    public final LocalBrowserSession getSession() {
        return this.session;
    }

    public final String getUnresolvedOperation() {
        return this.unresolvedOperation;
    }

    public final ManagedBrowserRecoveryJson recovery() {
        return new ManagedBrowserRecoveryJson(this.binding, this.capabilities, this.revision, this.policy, this.unresolvedOperation);
    }

    public ManagedBrowserSession(LocalBrowserSession localBrowserSession, ManagedBrowserBindingJson managedBrowserBindingJson, ManagedBrowserCapabilitiesJson managedBrowserCapabilitiesJson, ManagedBrowserSensitiveSitePolicyJson managedBrowserSensitiveSitePolicyJson, long j, HatchNodeInvocation hatchNodeInvocation) {
        AnonymousClass005.A14(localBrowserSession, managedBrowserBindingJson, managedBrowserCapabilitiesJson, managedBrowserSensitiveSitePolicyJson);
        C7384Etj.A0Y(hatchNodeInvocation, 5);
        this.session = localBrowserSession;
        this.capabilities = managedBrowserCapabilitiesJson;
        this.policy = managedBrowserSensitiveSitePolicyJson;
        this.binding = managedBrowserBindingJson;
        this.revision = j;
        this.connectionGeneration = hatchNodeInvocation.connectionGeneration;
        this.isConnectionCurrent = hatchNodeInvocation.isConnectionCurrent;
    }

    public final void setDocument(ManagedBrowserDocumentJson managedBrowserDocumentJson) {
        this.document = managedBrowserDocumentJson;
    }

    public final void setUnresolvedOperation(String str) {
        this.unresolvedOperation = str;
    }
}
