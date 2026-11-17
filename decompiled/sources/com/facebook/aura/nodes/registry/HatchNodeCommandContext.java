package com.facebook.aura.nodes.registry;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import android.content.Context;

/* loaded from: classes3.dex */
public final class HatchNodeCommandContext extends C06G {
    public final String cardSourceClientId;
    public final Context context;
    public final boolean hitlDenied;
    public final String nodeId;
    public final String requestId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchNodeCommandContext) {
                HatchNodeCommandContext hatchNodeCommandContext = (HatchNodeCommandContext) obj;
                if (!C7384Etj.areEqual(this.context, hatchNodeCommandContext.context) || !C7384Etj.areEqual(this.nodeId, hatchNodeCommandContext.nodeId) || !C7384Etj.areEqual(this.requestId, hatchNodeCommandContext.requestId) || this.hitlDenied != hatchNodeCommandContext.hitlDenied || !C7384Etj.areEqual(this.cardSourceClientId, hatchNodeCommandContext.cardSourceClientId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchNodeCommandContext copy$default(HatchNodeCommandContext hatchNodeCommandContext, Context context, String str, String str2, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            context = hatchNodeCommandContext.context;
        }
        if ((i & 2) != 0) {
            str = hatchNodeCommandContext.nodeId;
        }
        if ((i & 4) != 0) {
            str2 = hatchNodeCommandContext.requestId;
        }
        if ((i & 8) != 0) {
            z = hatchNodeCommandContext.hitlDenied;
        }
        if ((i & 16) != 0) {
            str3 = hatchNodeCommandContext.cardSourceClientId;
        }
        return hatchNodeCommandContext.copy(context, str, str2, z, str3);
    }

    public final Context component1() {
        return this.context;
    }

    public final String component2() {
        return this.nodeId;
    }

    public final String component3() {
        return this.requestId;
    }

    public final boolean component4() {
        return this.hitlDenied;
    }

    public final String component5() {
        return this.cardSourceClientId;
    }

    public final String getCardSourceClientId() {
        return this.cardSourceClientId;
    }

    public final Context getContext() {
        return this.context;
    }

    public final boolean getHitlDenied() {
        return this.hitlDenied;
    }

    public final String getNodeId() {
        return this.nodeId;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        return C0KA.A01((AnonymousClass005.A0I(this.nodeId, AnonymousClass005.A0E(this.context)) + AnonymousClass006.A0G(this.requestId)) * 31, this.hitlDenied) + AnonymousClass005.A0H(this.cardSourceClientId);
    }

    public HatchNodeCommandContext(Context context, String str, String str2, boolean z, String str3) {
        AnonymousClass003.A0u(context, str);
        this.context = context;
        this.nodeId = str;
        this.requestId = str2;
        this.hitlDenied = z;
        this.cardSourceClientId = str3;
    }

    public final HatchNodeCommandContext copy(Context context, String str, String str2, boolean z, String str3) {
        AnonymousClass003.A0u(context, str);
        return new HatchNodeCommandContext(context, str, str2, z, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchNodeCommandContext(Context context, String str, String str2, boolean z, String str3, int i, C06H c06h) {
        this(context, str, (i & 4) != 0 ? null : str2, AnonymousClass005.A1P(i, z), (i & 16) != 0 ? null : str3);
    }
}
