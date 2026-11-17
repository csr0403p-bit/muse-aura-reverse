package com.facebook.aura.nodes.core;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class NodeHitlSpec extends C06G {
    public final NodeHitlAccess access;
    public final NodeHitlGroup group;

    public NodeHitlSpec(NodeHitlGroup nodeHitlGroup, NodeHitlAccess nodeHitlAccess) {
        C7384Etj.A0Y(nodeHitlGroup, 0);
        C7384Etj.A0Y(nodeHitlAccess, 1);
        this.group = nodeHitlGroup;
        this.access = nodeHitlAccess;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NodeHitlSpec) {
                NodeHitlSpec nodeHitlSpec = (NodeHitlSpec) obj;
                if (this.group != nodeHitlSpec.group || this.access != nodeHitlSpec.access) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NodeHitlSpec copy$default(NodeHitlSpec nodeHitlSpec, NodeHitlGroup nodeHitlGroup, NodeHitlAccess nodeHitlAccess, int i, Object obj) {
        if ((i & 1) != 0) {
            nodeHitlGroup = nodeHitlSpec.group;
        }
        if ((i & 2) != 0) {
            nodeHitlAccess = nodeHitlSpec.access;
        }
        AnonymousClass003.A0u(nodeHitlGroup, nodeHitlAccess);
        return new NodeHitlSpec(nodeHitlGroup, nodeHitlAccess);
    }

    public final NodeHitlGroup component1() {
        return this.group;
    }

    public final NodeHitlAccess component2() {
        return this.access;
    }

    public final NodeHitlAccess getAccess() {
        return this.access;
    }

    public final NodeHitlGroup getGroup() {
        return this.group;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.access, AnonymousClass005.A0E(this.group));
    }

    public final NodeHitlSpec copy(NodeHitlGroup nodeHitlGroup, NodeHitlAccess nodeHitlAccess) {
        AnonymousClass003.A0u(nodeHitlGroup, nodeHitlAccess);
        return new NodeHitlSpec(nodeHitlGroup, nodeHitlAccess);
    }

    public String toString() {
        return super.toString();
    }
}
