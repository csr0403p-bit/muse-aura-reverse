package com.facebook.aura.nodes.cards;

import X.C7384Etj;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public abstract class NodeCardMessagingResolutionCacheKt {
    public static final NodeCardMessagingResolvedState copyForRender(NodeCardMessagingResolvedState nodeCardMessagingResolvedState) {
        C7384Etj.A0Y(nodeCardMessagingResolvedState, 0);
        MessagingApp messagingApp = nodeCardMessagingResolvedState.messagingApp;
        MessagingApp messagingApp2 = null;
        if (messagingApp != null) {
            Drawable drawable = messagingApp.icon;
            Drawable drawableNewDrawableForRender = drawable != null ? newDrawableForRender(drawable) : null;
            String str = messagingApp.label;
            C7384Etj.A0Y(str, 0);
            messagingApp2 = new MessagingApp(str, drawableNewDrawableForRender);
        }
        return new NodeCardMessagingResolvedState(messagingApp2, nodeCardMessagingResolvedState.contact, nodeCardMessagingResolvedState.isLoaded);
    }

    public static final Drawable newDrawableForRender(Drawable drawable) {
        Drawable drawableNewDrawable;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null || (drawableNewDrawable = constantState.newDrawable()) == null) {
            return null;
        }
        return drawableNewDrawable.mutate();
    }
}
