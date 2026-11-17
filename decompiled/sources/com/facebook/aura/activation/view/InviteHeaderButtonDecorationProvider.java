package com.facebook.aura.activation.view;

import com.facebook.aura.header.api.HeaderButtonDecoration;
import com.facebook.aura.header.api.HeaderButtonDecorationProvider;

/* loaded from: classes.dex */
public final class InviteHeaderButtonDecorationProvider implements HeaderButtonDecorationProvider {
    public static final int $stable = 0;
    public static final InviteHeaderButtonDecorationProvider INSTANCE = new InviteHeaderButtonDecorationProvider();

    @Override // com.facebook.aura.header.api.HeaderButtonDecorationProvider
    public HeaderButtonDecoration decoration() {
        return new HeaderButtonDecoration("hatch-invite-friends-button", ComposableSingletons$InviteHeaderButtonDecorationKt.f3lambda$1159193538);
    }
}
