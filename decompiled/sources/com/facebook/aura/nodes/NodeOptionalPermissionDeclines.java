package com.facebook.aura.nodes;

import X.AbstractC5321DgF;
import X.C06H;
import X.C7384Etj;
import X.F0C;
import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.aura.nodes.core.NodeCommandId;

/* loaded from: classes3.dex */
public final class NodeOptionalPermissionDeclines {
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final String PREFS_NAME = "hatch_node_optional_permission_declines";
    public final F0C prefs$delegate;

    public NodeOptionalPermissionDeclines(Context context) {
        C7384Etj.A0Y(context, 0);
        this.prefs$delegate = AbstractC5321DgF.A03(new NodeOptionalPermissionDeclines$prefs$2(context));
    }

    public final boolean isDeclined(NodeCommandId nodeCommandId) {
        C7384Etj.A0Y(nodeCommandId, 0);
        return getPrefs().getBoolean(nodeCommandId.getCommandId(), false);
    }

    public final void setDeclined(NodeCommandId nodeCommandId, boolean z) {
        C7384Etj.A0Y(nodeCommandId, 0);
        if (isDeclined(nodeCommandId) != z) {
            getPrefs().edit().putBoolean(nodeCommandId.getCommandId(), z).apply();
        }
    }

    private final SharedPreferences getPrefs() {
        return (SharedPreferences) this.prefs$delegate.getValue();
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }
}
